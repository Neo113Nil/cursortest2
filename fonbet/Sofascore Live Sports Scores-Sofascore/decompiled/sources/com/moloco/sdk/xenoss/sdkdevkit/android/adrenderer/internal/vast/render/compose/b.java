package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.e1d;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ e1d t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e1d e1dVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        e1d e1dVar = this.t;
        switch (i) {
            case 0:
                b bVar = new b(e1dVar, rq3Var, 0);
                bVar.s = obj;
                return bVar;
            default:
                b bVar2 = new b(e1dVar, rq3Var, 1);
                bVar2.s = obj;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((b) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((b) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        e1d e1dVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                ((Function1) e1dVar.getValue()).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) this.s);
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                ((Function1) e1dVar.getValue()).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) this.s);
                break;
        }
        return Unit.a;
    }
}
