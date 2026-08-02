package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.JavascriptException;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.ProfileLifecycle;
import io.sentry.Sentry;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.SpanContext;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.CurrentActivityHolder;
import io.sentry.android.core.NdkIntegration;
import io.sentry.android.core.SentryAndroid;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.SdkVersion;
import io.sentry.react.replay.RNSentryReplayMask;
import io.sentry.react.replay.RNSentryReplayUnmask;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.function.Predicate;

/* loaded from: classes9.dex */
final class RNSentryStart {
    private RNSentryStart() {
        throw new AssertionError("Utility class should not be instantiated");
    }

    static void startWithConfiguration(Context context, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        SentryAndroid.init(context, new RNSentryCompositeOptionsConfiguration(new Sentry.OptionsConfiguration() { // from class: io.sentry.react.RNSentryStart$$ExternalSyntheticLambda4
            @Override // io.sentry.Sentry.OptionsConfiguration
            public final void configure(SentryOptions sentryOptions) {
                RNSentryStart.updateWithReactDefaults((SentryAndroidOptions) sentryOptions, null);
            }
        }, optionsConfiguration, new RNSentryStart$$ExternalSyntheticLambda3()));
    }

    static void startWithOptions(Context context, final ReadableMap readableMap, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration, final ILogger iLogger) {
        SentryAndroid.init(context, new RNSentryCompositeOptionsConfiguration(new Sentry.OptionsConfiguration() { // from class: io.sentry.react.RNSentryStart$$ExternalSyntheticLambda6
            @Override // io.sentry.Sentry.OptionsConfiguration
            public final void configure(SentryOptions sentryOptions) {
                RNSentryStart.getSentryAndroidOptions((SentryAndroidOptions) sentryOptions, ReadableMap.this, iLogger);
            }
        }, new Sentry.OptionsConfiguration() { // from class: io.sentry.react.RNSentryStart$$ExternalSyntheticLambda5
            @Override // io.sentry.Sentry.OptionsConfiguration
            public final void configure(SentryOptions sentryOptions) {
                RNSentryStart.updateWithReactDefaults((SentryAndroidOptions) sentryOptions, null);
            }
        }, optionsConfiguration, new RNSentryStart$$ExternalSyntheticLambda3()));
    }

    static void startWithOptions(Context context, final ReadableMap readableMap, final Activity activity, final ILogger iLogger) {
        SentryAndroid.init(context, new RNSentryCompositeOptionsConfiguration(new Sentry.OptionsConfiguration() { // from class: io.sentry.react.RNSentryStart$$ExternalSyntheticLambda2
            @Override // io.sentry.Sentry.OptionsConfiguration
            public final void configure(SentryOptions sentryOptions) {
                RNSentryStart.getSentryAndroidOptions((SentryAndroidOptions) sentryOptions, ReadableMap.this, iLogger);
            }
        }, new Sentry.OptionsConfiguration() { // from class: io.sentry.react.RNSentryStart$$ExternalSyntheticLambda1
            @Override // io.sentry.Sentry.OptionsConfiguration
            public final void configure(SentryOptions sentryOptions) {
                RNSentryStart.updateWithReactDefaults((SentryAndroidOptions) sentryOptions, activity);
            }
        }, new RNSentryStart$$ExternalSyntheticLambda3()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void getSentryAndroidOptions(SentryAndroidOptions sentryAndroidOptions, ReadableMap readableMap, ILogger iLogger) {
        if (readableMap.hasKey("debug") && readableMap.getBoolean("debug")) {
            sentryAndroidOptions.setDebug(true);
        }
        if (readableMap.hasKey("dsn") && readableMap.getString("dsn") != null) {
            String string = readableMap.getString("dsn");
            iLogger.log(SentryLevel.INFO, String.format("Starting with DSN: '%s'", string), new Object[0]);
            sentryAndroidOptions.setDsn(string);
        } else {
            sentryAndroidOptions.setDsn("");
        }
        if (readableMap.hasKey("sampleRate")) {
            sentryAndroidOptions.setSampleRate(Double.valueOf(readableMap.getDouble("sampleRate")));
        }
        if (readableMap.hasKey("sendClientReports")) {
            sentryAndroidOptions.setSendClientReports(readableMap.getBoolean("sendClientReports"));
        }
        if (readableMap.hasKey("maxBreadcrumbs")) {
            sentryAndroidOptions.setMaxBreadcrumbs(readableMap.getInt("maxBreadcrumbs"));
        }
        if (readableMap.hasKey("maxCacheItems")) {
            sentryAndroidOptions.setMaxCacheItems(readableMap.getInt("maxCacheItems"));
        }
        if (readableMap.hasKey("environment") && readableMap.getString("environment") != null) {
            sentryAndroidOptions.setEnvironment(readableMap.getString("environment"));
        }
        if (readableMap.hasKey("release") && readableMap.getString("release") != null) {
            sentryAndroidOptions.setRelease(readableMap.getString("release"));
        }
        if (readableMap.hasKey(SentryBaseEvent.JsonKeys.DIST) && readableMap.getString(SentryBaseEvent.JsonKeys.DIST) != null) {
            sentryAndroidOptions.setDist(readableMap.getString(SentryBaseEvent.JsonKeys.DIST));
        }
        if (readableMap.hasKey("enableAutoSessionTracking")) {
            sentryAndroidOptions.setEnableAutoSessionTracking(readableMap.getBoolean("enableAutoSessionTracking"));
        }
        if (readableMap.hasKey("sessionTrackingIntervalMillis")) {
            sentryAndroidOptions.setSessionTrackingIntervalMillis(readableMap.getInt("sessionTrackingIntervalMillis"));
        }
        if (readableMap.hasKey("shutdownTimeout")) {
            sentryAndroidOptions.setShutdownTimeoutMillis(readableMap.getInt("shutdownTimeout"));
        }
        if (readableMap.hasKey("enableNdkScopeSync")) {
            sentryAndroidOptions.setEnableScopeSync(readableMap.getBoolean("enableNdkScopeSync"));
        }
        if (readableMap.hasKey("attachStacktrace")) {
            sentryAndroidOptions.setAttachStacktrace(readableMap.getBoolean("attachStacktrace"));
        }
        if (readableMap.hasKey("attachThreads")) {
            sentryAndroidOptions.setAttachThreads(readableMap.getBoolean("attachThreads"));
        }
        if (readableMap.hasKey("attachScreenshot")) {
            sentryAndroidOptions.setAttachScreenshot(readableMap.getBoolean("attachScreenshot"));
        }
        if (readableMap.hasKey("attachViewHierarchy")) {
            sentryAndroidOptions.setAttachViewHierarchy(readableMap.getBoolean("attachViewHierarchy"));
        }
        if (readableMap.hasKey("sendDefaultPii")) {
            sentryAndroidOptions.setSendDefaultPii(readableMap.getBoolean("sendDefaultPii"));
        }
        if (readableMap.hasKey("maxQueueSize")) {
            sentryAndroidOptions.setMaxQueueSize(readableMap.getInt("maxQueueSize"));
        }
        if (readableMap.hasKey("enableNdk")) {
            sentryAndroidOptions.setEnableNdk(readableMap.getBoolean("enableNdk"));
        }
        if (readableMap.hasKey("enableTombstone")) {
            sentryAndroidOptions.setTombstoneEnabled(readableMap.getBoolean("enableTombstone"));
        }
        if (readableMap.hasKey("spotlight")) {
            if (readableMap.getType("spotlight") == ReadableType.Boolean) {
                sentryAndroidOptions.setEnableSpotlight(readableMap.getBoolean("spotlight"));
                if (readableMap.hasKey("defaultSidecarUrl")) {
                    sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("defaultSidecarUrl"));
                }
            } else if (readableMap.getType("spotlight") == ReadableType.String) {
                sentryAndroidOptions.setEnableSpotlight(true);
                sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("spotlight"));
            }
        }
        SentryReplayOptions replayOptions = getReplayOptions(readableMap);
        sentryAndroidOptions.setSessionReplay(replayOptions);
        if (isReplayEnabled(replayOptions)) {
            sentryAndroidOptions.getReplayController().setBreadcrumbConverter(new RNSentryReplayBreadcrumbConverter());
        }
        configureAndroidProfiling(sentryAndroidOptions, readableMap, iLogger);
        final String uRLFromDSN = readableMap.hasKey("dsn") ? getURLFromDSN(readableMap.getString("dsn")) : null;
        final String string2 = readableMap.hasKey("devServerUrl") ? readableMap.getString("devServerUrl") : null;
        sentryAndroidOptions.setBeforeBreadcrumb(new SentryOptions.BeforeBreadcrumbCallback() { // from class: io.sentry.react.RNSentryStart$$ExternalSyntheticLambda7
            @Override // io.sentry.SentryOptions.BeforeBreadcrumbCallback
            public final Breadcrumb execute(Breadcrumb breadcrumb, Hint hint) {
                return RNSentryStart.lambda$getSentryAndroidOptions$5(uRLFromDSN, string2, breadcrumb, hint);
            }
        });
        if (readableMap.hasKey("enableNativeCrashHandling") && !readableMap.getBoolean("enableNativeCrashHandling")) {
            sentryAndroidOptions.getIntegrations().removeIf(new Predicate() { // from class: io.sentry.react.RNSentryStart$$ExternalSyntheticLambda8
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return RNSentryStart.lambda$getSentryAndroidOptions$6((Integration) obj);
                }
            });
        }
        iLogger.log(SentryLevel.INFO, String.format("Native Integrations '%s'", sentryAndroidOptions.getIntegrations()), new Object[0]);
    }

    static /* synthetic */ Breadcrumb lambda$getSentryAndroidOptions$5(String str, String str2, Breadcrumb breadcrumb, Hint hint) {
        Object data = breadcrumb.getData("url");
        String str3 = data instanceof String ? (String) data : "";
        if ("http".equals(breadcrumb.getType())) {
            if (str != null && str3.startsWith(str)) {
                return null;
            }
            if (str2 != null && str3.startsWith(str2)) {
                return null;
            }
        }
        return breadcrumb;
    }

    static /* synthetic */ boolean lambda$getSentryAndroidOptions$6(Integration integration) {
        return (integration instanceof UncaughtExceptionHandlerIntegration) || (integration instanceof AnrIntegration) || (integration instanceof NdkIntegration);
    }

    private static void configureAndroidProfiling(SentryAndroidOptions sentryAndroidOptions, ReadableMap readableMap, ILogger iLogger) {
        ReadableMap map;
        ReadableMap map2;
        if (readableMap.hasKey("_experiments") && (map = readableMap.getMap("_experiments")) != null && map.hasKey("profilingOptions") && (map2 = map.getMap("profilingOptions")) != null) {
            if (map2.hasKey("profileSessionSampleRate")) {
                if (map2.getType("profileSessionSampleRate") == ReadableType.Number) {
                    double d = map2.getDouble("profileSessionSampleRate");
                    sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(d));
                    iLogger.log(SentryLevel.INFO, String.format("UI Profiling profileSessionSampleRate set to: %.2f", Double.valueOf(d)), new Object[0]);
                } else {
                    iLogger.log(SentryLevel.WARNING, "UI Profiling profileSessionSampleRate must be a number, ignoring invalid value", new Object[0]);
                }
            }
            if (map2.hasKey("lifecycle")) {
                if (map2.getType("lifecycle") == ReadableType.String) {
                    String string = map2.getString("lifecycle");
                    if (SpanContext.DEFAULT_ORIGIN.equalsIgnoreCase(string)) {
                        sentryAndroidOptions.setProfileLifecycle(ProfileLifecycle.MANUAL);
                        iLogger.log(SentryLevel.INFO, "UI Profile Lifecycle set to MANUAL", new Object[0]);
                    } else if ("trace".equalsIgnoreCase(string)) {
                        sentryAndroidOptions.setProfileLifecycle(ProfileLifecycle.TRACE);
                        iLogger.log(SentryLevel.INFO, "UI Profile Lifecycle set to TRACE", new Object[0]);
                    }
                } else {
                    iLogger.log(SentryLevel.WARNING, "UI Profiling lifecycle must be a string, ignoring invalid value", new Object[0]);
                }
            }
            if (map2.hasKey("startOnAppStart")) {
                if (map2.getType("startOnAppStart") == ReadableType.Boolean) {
                    boolean z = map2.getBoolean("startOnAppStart");
                    sentryAndroidOptions.setStartProfilerOnAppStart(z);
                    iLogger.log(SentryLevel.INFO, String.format("UI Profiling startOnAppStart set to %b", Boolean.valueOf(z)), new Object[0]);
                    return;
                }
                iLogger.log(SentryLevel.WARNING, "UI Profiling startOnAppStart must be a boolean, ignoring invalid value", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void updateWithReactDefaults(SentryAndroidOptions sentryAndroidOptions, Activity activity) {
        SdkVersion sdkVersion = sentryAndroidOptions.getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new SdkVersion("sentry.java.android.react-native", "8.33.0");
        } else {
            sdkVersion.setName("sentry.java.android.react-native");
        }
        sdkVersion.addPackage("npm:@sentry/react-native", "8.2.0");
        sentryAndroidOptions.setSentryClientName(sdkVersion.getName() + "/" + sdkVersion.getVersion());
        sentryAndroidOptions.setNativeSdkName("sentry.native.android.react-native");
        sentryAndroidOptions.setSdkVersion(sdkVersion);
        sentryAndroidOptions.setTracesSampleRate(null);
        sentryAndroidOptions.setTracesSampler(null);
        sentryAndroidOptions.addIgnoredExceptionForType(JavascriptException.class);
        setCurrentActivity(activity);
    }

    static void updateWithReactFinals(SentryAndroidOptions sentryAndroidOptions) {
        final SentryOptions.BeforeSendCallback beforeSend = sentryAndroidOptions.getBeforeSend();
        sentryAndroidOptions.setBeforeSend(new SentryOptions.BeforeSendCallback() { // from class: io.sentry.react.RNSentryStart$$ExternalSyntheticLambda0
            @Override // io.sentry.SentryOptions.BeforeSendCallback
            public final SentryEvent execute(SentryEvent sentryEvent, Hint hint) {
                return RNSentryStart.lambda$updateWithReactFinals$7(SentryOptions.BeforeSendCallback.this, sentryEvent, hint);
            }
        });
    }

    static /* synthetic */ SentryEvent lambda$updateWithReactFinals$7(SentryOptions.BeforeSendCallback beforeSendCallback, SentryEvent sentryEvent, Hint hint) {
        setEventOriginTag(sentryEvent);
        return beforeSendCallback != null ? beforeSendCallback.execute(sentryEvent, hint) : sentryEvent;
    }

    private static void setCurrentActivity(Activity activity) {
        CurrentActivityHolder currentActivityHolder = CurrentActivityHolder.getInstance();
        if (activity != null) {
            currentActivityHolder.setActivity(activity);
        }
    }

    private static boolean isReplayEnabled(SentryReplayOptions sentryReplayOptions) {
        return (sentryReplayOptions.getSessionSampleRate() == null && sentryReplayOptions.getOnErrorSampleRate() == null) ? false : true;
    }

    private static SentryReplayOptions getReplayOptions(ReadableMap readableMap) {
        ReadableMap map;
        SentryReplayOptions sentryReplayOptions = new SentryReplayOptions(false, new SdkVersion("sentry.javascript.react-native", "8.2.0"));
        if (readableMap.hasKey("replaysSessionSampleRate") || readableMap.hasKey("replaysOnErrorSampleRate")) {
            sentryReplayOptions.setSessionSampleRate(readableMap.hasKey("replaysSessionSampleRate") ? Double.valueOf(readableMap.getDouble("replaysSessionSampleRate")) : null);
            sentryReplayOptions.setOnErrorSampleRate(readableMap.hasKey("replaysOnErrorSampleRate") ? Double.valueOf(readableMap.getDouble("replaysOnErrorSampleRate")) : null);
            if (readableMap.hasKey("mobileReplayOptions") && (map = readableMap.getMap("mobileReplayOptions")) != null) {
                sentryReplayOptions.setMaskAllText(!map.hasKey("maskAllText") || map.getBoolean("maskAllText"));
                sentryReplayOptions.setMaskAllImages(!map.hasKey("maskAllImages") || map.getBoolean("maskAllImages"));
                if (!map.hasKey("maskAllVectors") || map.getBoolean("maskAllVectors")) {
                    sentryReplayOptions.addMaskViewClass("com.horcrux.svg.SvgView");
                }
                sentryReplayOptions.setMaskViewContainerClass(RNSentryReplayMask.class.getName());
                sentryReplayOptions.setUnmaskViewContainerClass(RNSentryReplayUnmask.class.getName());
                return sentryReplayOptions;
            }
        }
        return sentryReplayOptions;
    }

    private static void setEventOriginTag(SentryEvent sentryEvent) {
        SdkVersion sdk = sentryEvent.getSdk();
        if (sdk != null) {
            String name = sdk.getName();
            name.hashCode();
            if (name.equals("sentry.java.android.react-native")) {
                setEventEnvironmentTag(sentryEvent, "java");
            } else if (name.equals("sentry.native.android.react-native")) {
                setEventEnvironmentTag(sentryEvent, "native");
            }
        }
    }

    private static void setEventEnvironmentTag(SentryEvent sentryEvent, String str) {
        sentryEvent.setTag("event.origin", "android");
        sentryEvent.setTag("event.environment", str);
    }

    private static String getURLFromDSN(String str) {
        if (str == null) {
            return null;
        }
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (URISyntaxException unused) {
            return null;
        }
    }
}
