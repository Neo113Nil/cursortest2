package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Al implements K2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12009a;

    public Al(@NotNull Context context) {
        this.f12009a = context;
    }

    @NotNull
    public final Context b() {
        return this.f12009a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.InterfaceC0290km
    public final void a(@NotNull C0161fm c0161fm) {
    }
}
