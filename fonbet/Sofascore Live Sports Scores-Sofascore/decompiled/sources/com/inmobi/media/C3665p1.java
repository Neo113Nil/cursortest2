package com.inmobi.media;

import android.content.Context;
import defpackage.ad2;
import defpackage.bu3;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.s9a;
import defpackage.tz9;
import defpackage.z45;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.p1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3665p1 implements E8 {
    public final C3691q1 a;
    public final Context b;
    public final C3906y9 c;
    public final C3328c0 d;
    public final ku3 e;
    public final C3586m0 f;

    public C3665p1(Context context, Tc tc, C3691q1 c3691q1) {
        c3691q1.getClass();
        this.a = c3691q1;
        C3639o1 c3639o1 = new C3639o1(bu3.a, this);
        this.b = context;
        this.c = tc.a;
        C3328c0 c3328c0 = new C3328c0();
        this.d = c3328c0;
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(hq4.c.plus(tz9.o()).plus(c3639o1));
        this.e = c;
        this.f = new C3586m0(c, c3691q1, c3328c0);
    }

    @Override // com.inmobi.media.E8
    public final ku3 a() {
        return this.e;
    }

    @Override // com.inmobi.media.E8
    public final C3586m0 b() {
        return this.f;
    }

    @Override // com.inmobi.media.E8
    public final InterfaceC3880x9 c() {
        return this.c;
    }
}
