package com.inmobi.media;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Cn extends sq3 {
    public int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ En d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cn(En en, sq3 sq3Var) {
        super(sq3Var);
        this.d = en;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return En.a(this.d, this);
    }
}
