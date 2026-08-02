package io.sentry.react;

import android.content.Context;
import com.facebook.react.bridge.WritableMap;
import io.sentry.ILogger;
import io.sentry.Sentry;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.AndroidLogger;
import io.sentry.android.core.SentryAndroidOptions;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class RNSentrySDK {
    private static final String CONFIGURATION_FILE = "sentry.options.json";
    private static final String NAME = "RNSentrySDK";
    private static final ILogger logger = new AndroidLogger(NAME);

    static /* synthetic */ void lambda$init$0(SentryAndroidOptions sentryAndroidOptions) {
    }

    private RNSentrySDK() {
        throw new AssertionError("Utility class should not be instantiated");
    }

    static void init(Context context, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration, String str, ILogger iLogger) {
        try {
            JSONObject optionsFromConfigurationFile = RNSentryJsonUtils.getOptionsFromConfigurationFile(context, str, iLogger);
            if (optionsFromConfigurationFile == null) {
                RNSentryStart.startWithConfiguration(context, optionsConfiguration);
                return;
            }
            WritableMap convertToWritable = RNSentryJsonConverter.convertToWritable(optionsFromConfigurationFile);
            if (convertToWritable == null) {
                RNSentryStart.startWithConfiguration(context, optionsConfiguration);
            } else {
                RNSentryStart.startWithOptions(context, convertToWritable, optionsConfiguration, iLogger);
            }
        } catch (Exception e) {
            iLogger.log(SentryLevel.ERROR, "Failed to start Sentry with options from configuration file.", e);
            throw new RuntimeException("Failed to initialize Sentry's React Native SDK", e);
        }
    }

    public static void init(Context context, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        init(context, optionsConfiguration, CONFIGURATION_FILE, logger);
    }

    public static void init(Context context) {
        init(context, new Sentry.OptionsConfiguration() { // from class: io.sentry.react.RNSentrySDK$$ExternalSyntheticLambda0
            @Override // io.sentry.Sentry.OptionsConfiguration
            public final void configure(SentryOptions sentryOptions) {
                RNSentrySDK.lambda$init$0((SentryAndroidOptions) sentryOptions);
            }
        }, CONFIGURATION_FILE, logger);
    }
}
