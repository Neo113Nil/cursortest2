package com.inmobi.media;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Gh extends sq3 {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Hh c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gh(Hh hh, sq3 sq3Var) {
        super(sq3Var);
        this.c = hh;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
