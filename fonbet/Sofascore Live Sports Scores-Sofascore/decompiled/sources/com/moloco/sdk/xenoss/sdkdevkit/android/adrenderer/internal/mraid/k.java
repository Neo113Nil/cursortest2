package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import defpackage.ad2;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.rd4;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.z45;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {
    public final String a;
    public final a0 b;
    public Function0 c;
    public Function1 d;
    public Function1 e;
    public final boolean f;
    public final rd4 g;
    public final ad2 h;
    public c0 i;
    public final b0 j;

    public k(Context context, String str, a0 a0Var, Function0 function0, Function1 function1, Function1 function12, t0 t0Var, boolean z, rd4 rd4Var) {
        context.getClass();
        str.getClass();
        function0.getClass();
        function12.getClass();
        t0Var.getClass();
        this.a = str;
        this.b = a0Var;
        this.c = function0;
        this.d = function1;
        this.e = function12;
        this.f = z;
        this.g = rd4Var;
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(rob.a);
        this.h = c;
        this.j = new b0((h0) rd4Var.f, context, c);
    }

    public final Object b(rq3 rq3Var) {
        Object w = xw3.t(this.h, null, new h(this, null, 0), 3).w(rq3Var);
        lu3 lu3Var = lu3.a;
        return w;
    }

    public final void d(c0 c0Var) {
        this.i = c0Var;
        this.g.g("mraidbridge.setState(" + JSONObject.quote(c0Var.a) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        s9a.o(this.h, null);
        this.g.destroy();
        this.j.destroy();
    }

    public abstract void e();

    public void a() {
    }
}
