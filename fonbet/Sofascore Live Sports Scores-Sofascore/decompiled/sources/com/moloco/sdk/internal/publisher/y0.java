package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class y0 extends hoi implements Function2 {
    public final /* synthetic */ c1 r;
    public final /* synthetic */ String s;
    public final /* synthetic */ AdLoad.Listener t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c1 c1Var, String str, AdLoad.Listener listener, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = c1Var;
        this.s = str;
        this.t = listener;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new y0(this.r, this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        this.r.p.load(this.s, this.t);
        return Unit.a;
    }
}
