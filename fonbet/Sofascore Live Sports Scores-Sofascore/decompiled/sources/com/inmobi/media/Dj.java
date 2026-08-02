package com.inmobi.media;

import defpackage.h2d;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Dj extends sq3 {
    public Bj a;
    public Bj b;
    public h2d c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Ej e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dj(Ej ej, sq3 sq3Var) {
        super(sq3Var);
        this.e = ej;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
