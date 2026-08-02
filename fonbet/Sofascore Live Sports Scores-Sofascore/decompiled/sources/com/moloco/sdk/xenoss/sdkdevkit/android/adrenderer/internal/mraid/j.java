package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rd4;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ k t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = kVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        k kVar = this.t;
        switch (i) {
            case 0:
                j jVar = new j(kVar, rq3Var, 0);
                jVar.s = obj;
                return jVar;
            default:
                j jVar2 = new j(kVar, rq3Var, 1);
                jVar2.s = obj;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((j) create((x) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((j) create((e0) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        k kVar = this.t;
        switch (i) {
            case 0:
                rd4 rd4Var = kVar.g;
                b0 b0Var = kVar.j;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                x xVar = (x) this.s;
                if (Intrinsics.c(xVar, s.b)) {
                    if (((Boolean) ((fdi) b0Var.f).getValue()).booleanValue()) {
                        kVar.e();
                    } else {
                        rd4Var.g("mraidbridge.notifyErrorEvent(" + JSONObject.quote(CampaignEx.JSON_NATIVE_VIDEO_CLOSE) + ", " + JSONObject.quote("Can't close ad when mraid container is not visible to the user") + ')');
                    }
                } else if (xVar instanceof v) {
                    v vVar = (v) xVar;
                    if (((Boolean) ((fdi) b0Var.f).getValue()).booleanValue()) {
                        Function1 function1 = kVar.d;
                        String uri = vVar.b.toString();
                        uri.getClass();
                        function1.invoke(uri);
                    } else {
                        rd4Var.b(vVar, "Can't open links when mraid container is not visible to the user");
                    }
                } else if (!(xVar instanceof w)) {
                    if (xVar instanceof u) {
                        u uVar = (u) xVar;
                        if (kVar.f) {
                            rd4Var.b(uVar, "expand() is force blocked for the current ad");
                        } else if (!((Boolean) ((fdi) b0Var.f).getValue()).booleanValue()) {
                            rd4Var.b(uVar, "Can't expand() when mraid container is not visible to the user");
                        } else if (kVar.i != c0.Default) {
                            rd4Var.b(uVar, "In order to expand() mraid ad, container must be in Default view state");
                        } else if (kVar.b == a0.Interstitial) {
                            rd4Var.b(uVar, "expand() is not supported for interstitials");
                        } else if (uVar.b != null) {
                            rd4Var.b(uVar, "Two-part expand is not supported yet");
                        } else {
                            kVar.a();
                            kVar.d(c0.Expanded);
                        }
                    } else {
                        rd4Var.b(xVar, "unsupported command: ".concat(xVar.a));
                    }
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                kVar.g.d(((e0) this.s).a);
                break;
        }
        return Unit.a;
    }
}
