package io.sentry.featureflags;

import io.sentry.protocol.C7191g;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67910a = new io.sentry.util.a();

    private d() {
    }

    @NotNull
    public static d a() {
        return new d();
    }

    @Override // io.sentry.featureflags.b
    @NotNull
    public final b clone() {
        return new d();
    }

    @Override // io.sentry.featureflags.b
    public final C7191g getFeatureFlags() {
        this.f67910a.a().close();
        return null;
    }

    @NotNull
    /* renamed from: clone, reason: collision with other method in class */
    public final Object m64clone() throws CloneNotSupportedException {
        return new d();
    }
}
