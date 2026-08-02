package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class z extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ b0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(b0 b0Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = b0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        b0 b0Var = this.s;
        switch (i) {
            case 0:
                return new z(b0Var, rq3Var, 0);
            default:
                return new z(b0Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((z) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e bannerImpl;
        int i = this.r;
        b0 b0Var = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                Regex regex = l0.a;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m a = l0.a(b0Var.h.a);
                b0Var.q = a;
                return a;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                super/*com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e*/.destroy();
                bannerImpl = b0Var.getBannerImpl();
                if (bannerImpl != null) {
                    bannerImpl.destroy();
                }
                return Unit.a;
        }
    }
}
