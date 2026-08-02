package io.sentry.react;

import io.sentry.Sentry;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class RNSentryStart$$ExternalSyntheticLambda3 implements Sentry.OptionsConfiguration {
    @Override // io.sentry.Sentry.OptionsConfiguration
    public final void configure(SentryOptions sentryOptions) {
        RNSentryStart.updateWithReactFinals((SentryAndroidOptions) sentryOptions);
    }
}
