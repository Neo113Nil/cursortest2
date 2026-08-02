package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ m t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(m mVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = mVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        m mVar = this.t;
        switch (i) {
            case 0:
                f fVar = new f(mVar, rq3Var, 0);
                fVar.s = obj;
                return fVar;
            case 1:
                f fVar2 = new f(mVar, rq3Var, 1);
                fVar2.s = obj;
                return fVar2;
            default:
                f fVar3 = new f(mVar, rq3Var, 2);
                fVar3.s = obj;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((f) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((f) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((f) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        a aVar = a.a;
        m mVar = this.t;
        switch (i) {
            case 0:
                com.moloco.sdk.internal.publisher.nativead.n nVar = mVar.b;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d) this.s;
                if (!(dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c)) {
                    if (!Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b.a)) {
                        if (!Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b.d)) {
                            if (!Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b.b)) {
                                if (!Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b.c)) {
                                    zzl.b();
                                    break;
                                } else {
                                    if (nVar != null) {
                                        nVar.g();
                                    }
                                    mVar.f(b.e);
                                }
                            } else {
                                mVar.f(b.b);
                                List list = mVar.a;
                                x xVar = (x) CollectionsKt.a0(list.indexOf(mVar.d.getValue()) + 1, list);
                                if (xVar != null) {
                                    mVar.g(xVar);
                                }
                            }
                        } else {
                            mVar.f(b.g);
                            mVar.e();
                            Unit unit = Unit.a;
                        }
                    } else {
                        mVar.f(aVar);
                    }
                } else {
                    if (nVar != null) {
                        e0 e0Var = e0.Linear;
                        List list2 = (List) nVar.c;
                        if (list2 != null) {
                            ((f1) nVar.d).a(list2, e0Var, null, null);
                        }
                    }
                    mVar.f(new c(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c) dVar).a));
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                int i2 = g.a[((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a) this.s).ordinal()];
                if (i2 == 1) {
                    mVar.f(aVar);
                } else if (i2 != 2) {
                    zzl.b();
                    break;
                } else {
                    com.moloco.sdk.internal.publisher.nativead.n nVar2 = mVar.b;
                    if (nVar2 != null) {
                        nVar2.g();
                    }
                    mVar.f(b.c);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                int i3 = h.a[((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p) this.s).ordinal()];
                if (i3 == 1) {
                    mVar.f(b.g);
                    mVar.e();
                } else if (i3 != 2) {
                    zzl.b();
                    break;
                } else {
                    mVar.f(aVar);
                }
                break;
        }
        return Unit.a;
    }
}
