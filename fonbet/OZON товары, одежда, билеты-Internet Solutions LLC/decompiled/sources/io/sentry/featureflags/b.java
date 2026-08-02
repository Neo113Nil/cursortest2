package io.sentry.featureflags;

import io.sentry.protocol.C7191g;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface b {
    @NotNull
    b clone();

    C7191g getFeatureFlags();
}
