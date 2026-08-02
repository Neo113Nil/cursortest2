package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Cb implements Q5<Bb> {
    private final String a;
    private final Ed b;
    private final InterfaceC2428g1 c;
    private final boolean d;

    public Cb(String adm, Ed providerName, InterfaceC2428g1 adapterConfigs, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(adapterConfigs, "adapterConfigs");
        this.a = adm;
        this.b = providerName;
        this.c = adapterConfigs;
        this.d = z;
    }

    @Override // com.ironsource.Q5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bb a() throws C2637re, Exception {
        InterfaceC2525l9 a = this.c.a(this.b);
        new U(this.a, a, this.d).a();
        if (a != null) {
            return new Bb(a.f(), a.e(), a.b(), a.d(), false, 16, null);
        }
        return null;
    }
}
