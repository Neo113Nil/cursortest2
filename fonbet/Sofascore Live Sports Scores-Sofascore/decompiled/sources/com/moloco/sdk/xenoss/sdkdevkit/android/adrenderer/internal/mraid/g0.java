package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import com.ironsource.C4427z5;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import defpackage.a70;
import defpackage.d11;
import defpackage.hoi;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.r69;
import defpackage.rd0;
import defpackage.rob;
import defpackage.rq3;
import defpackage.v24;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yf4;
import defpackage.z45;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g0 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ h0 u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(boolean z, h0 h0Var, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = z;
        this.u = h0Var;
        this.v = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new g0(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new g0(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((g0) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    try {
                        boolean z = this.t;
                        String str = this.v;
                        h0 h0Var = this.u;
                        if (z) {
                            Context context = h0Var.getContext();
                            context.getClass();
                            h0Var.loadDataWithBaseURL("https://appassets.androidplatform.net", new com.facebook.c0(13, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e(context, 1), new com.facebook.b(23)).d(str), "text/html", C4427z5.O, null);
                        } else {
                            h0Var.getClass();
                            str.getClass();
                            h0Var.loadDataWithBaseURL("https://appassets.androidplatform.net", str, "text/html", C4427z5.O, null);
                        }
                        i0 i0Var = h0Var.b;
                        yf4 yf4Var = new yf4(i0Var.d, i0Var.f, new v24(3, null, 2), 1);
                        d11 d11Var = new d11(2, null, 23);
                        this.s = 1;
                        obj = rd0.z(yf4Var, d11Var, this);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } catch (Exception e) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebView", e.toString(), null, false, 12, null);
                        return new j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.c);
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.a).booleanValue();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) pair.b;
                return dVar != null ? new j0(dVar) : booleanValue ? new k0(new g(null)) : new j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.d);
            default:
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                hs4 hs4Var = z45.a;
                r69 r69Var = rob.a;
                g0 g0Var = new g0(this.t, this.u, this.v, null, 0);
                this.s = 1;
                Object R = xw3.R(r69Var, g0Var, this);
                return R == lu3Var2 ? lu3Var2 : R;
        }
    }
}
