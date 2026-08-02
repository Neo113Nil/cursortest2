package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0409pg {

    /* renamed from: a, reason: collision with root package name */
    public final Na f14480a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0284kg f14481b;

    /* renamed from: c, reason: collision with root package name */
    public final La f14482c;

    public C0409pg(Na na2, InterfaceC0284kg interfaceC0284kg, La la2) {
        this.f14480a = na2;
        this.f14481b = interfaceC0284kg;
        this.f14482c = la2;
    }

    public final void a(C0359ng c0359ng) {
        if (this.f14480a.a(c0359ng)) {
            this.f14481b.a(c0359ng);
            this.f14482c.a();
        }
    }

    @NonNull
    public final InterfaceC0284kg b() {
        return this.f14481b;
    }

    @NonNull
    public final La c() {
        return this.f14482c;
    }

    @NonNull
    public final Na a() {
        return this.f14480a;
    }
}
