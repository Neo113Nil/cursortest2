package com.moloco.sdk.internal.services.bidtoken;

import defpackage.j2d;
import defpackage.lu3;
import defpackage.ng2;
import defpackage.sq3;
import defpackage.w2g;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class s extends sq3 {
    public ng2 r;
    public com.moloco.sdk.acm.recorder.b s;
    public String t;
    public g u;
    public j2d v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ng2 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ng2 ng2Var, sq3 sq3Var) {
        super(sq3Var);
        this.x = ng2Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        Serializable a = this.x.a(null, null, null, this);
        return a == lu3.a ? a : new w2g(a);
    }
}
