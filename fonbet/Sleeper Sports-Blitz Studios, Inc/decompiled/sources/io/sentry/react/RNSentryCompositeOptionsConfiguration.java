package io.sentry.react;

import io.sentry.Sentry;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.List;

/* loaded from: classes9.dex */
class RNSentryCompositeOptionsConfiguration implements Sentry.OptionsConfiguration<SentryAndroidOptions> {
    private final List<Sentry.OptionsConfiguration<SentryAndroidOptions>> configurations;

    @SafeVarargs
    protected RNSentryCompositeOptionsConfiguration(Sentry.OptionsConfiguration<SentryAndroidOptions>... optionsConfigurationArr) {
        this.configurations = RNSentryPackage$$ExternalSyntheticBackport0.m((Object[]) optionsConfigurationArr);
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryAndroidOptions sentryAndroidOptions) {
        for (Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration : this.configurations) {
            if (optionsConfiguration != null) {
                optionsConfiguration.configure(sentryAndroidOptions);
            }
        }
    }
}
