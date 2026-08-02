package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rd4;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class r extends k {
    public final Function0 k;
    public final Function0 l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(Context context, String str, Function0 function0, Function0 function02, Function0 function03, Function1 function1, t0 t0Var, rd4 rd4Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar, int i) {
        super(context, str, a0.Inline, function03, new com.appsflyer.f(3, function03, r0), function1, t0Var, true, rd4Var);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar2 = (i & 512) != 0 ? null : kVar;
        new LinkedHashMap();
        context.getClass();
        str.getClass();
        function03.getClass();
        function1.getClass();
        t0Var.getClass();
        this.k = function0;
        this.l = function02;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k
    public final void a() {
        this.k.invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k
    public final void e() {
        if (this.i == c0.Expanded) {
            d(c0.Default);
        }
        this.l.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(rq3 rq3Var) {
        q qVar;
        Object obj;
        int i;
        if (rq3Var instanceof q) {
            qVar = (q) rq3Var;
            int i2 = qVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.u = i2 - Integer.MIN_VALUE;
                obj = qVar.s;
                lu3 lu3Var = lu3.a;
                i = qVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    qVar.r = this;
                    qVar.u = 1;
                    obj = b(qVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = qVar.r;
                    y6a.M(obj);
                }
                if (obj instanceof k0) {
                    return null;
                }
                return (h0) this.g.f;
            }
        }
        qVar = new q(this, (sq3) rq3Var);
        obj = qVar.s;
        lu3 lu3Var2 = lu3.a;
        i = qVar.u;
        if (i != 0) {
        }
        if (obj instanceof k0) {
        }
    }
}
