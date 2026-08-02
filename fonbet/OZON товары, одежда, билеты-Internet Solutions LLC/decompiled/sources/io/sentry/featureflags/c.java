package io.sentry.featureflags;

import io.sentry.protocol.C7191g;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private static final c f67909a = new c();

    public static c a() {
        return f67909a;
    }

    @NotNull
    /* renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ Object m63clone() throws CloneNotSupportedException {
        return f67909a;
    }

    @Override // io.sentry.featureflags.b
    public final C7191g getFeatureFlags() {
        return null;
    }

    @Override // io.sentry.featureflags.b
    @NotNull
    public final b clone() {
        return f67909a;
    }
}
