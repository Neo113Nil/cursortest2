package com.moloco.sdk.internal.services.init;

import defpackage.fsf;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class l extends sq3 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ n C;
    public int D;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public fsf v;
    public fsf w;
    public boolean x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, sq3 sq3Var) {
        super(sq3Var);
        this.C = nVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, null, null, false, this);
    }
}
