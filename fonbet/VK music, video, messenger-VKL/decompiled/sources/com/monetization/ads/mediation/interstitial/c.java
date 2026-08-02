package com.monetization.ads.mediation.interstitial;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.dt;
import xsna.on00;
import xsna.qcy;
import xsna.s3q0;
import yads.a9;
import yads.cy0;
import yads.d4;
import yads.dp1;
import yads.dp2;
import yads.ep1;
import yads.fq1;
import yads.gy0;
import yads.ir1;
import yads.jq1;
import yads.mn2;
import yads.np1;
import yads.ov2;
import yads.rr1;
import yads.ry0;
import yads.t8;
import yads.tc2;
import yads.v9;
import yads.w5;
import yads.yp1;

/* loaded from: classes14.dex */
public final class c implements cy0 {
    public final gy0 a;
    public final ep1 b;
    public final b c;
    public final a d;
    public final yp1 e;

    public c(gy0 gy0Var, v9 v9Var, ir1 ir1Var) {
        this.a = gy0Var;
        d4 e = gy0Var.e();
        ov2 h = gy0Var.h();
        fq1 fq1Var = new fq1(e);
        yp1 yp1Var = new yp1(e, h, v9Var);
        this.e = yp1Var;
        jq1 jq1Var = new jq1(new np1(ir1Var.c(), fq1Var, yp1Var));
        w5 f = gy0Var.f();
        tc2 tc2Var = new tc2(gy0Var, ir1Var);
        b bVar = new b();
        this.c = bVar;
        ep1 ep1Var = new ep1(e, h, f, bVar, yp1Var, jq1Var, tc2Var);
        this.b = ep1Var;
        this.d = new a(gy0Var, ep1Var);
    }

    @Override // yads.fc
    public final List a() {
        return EmptyList.b;
    }

    @Override // yads.fc
    public final List b() {
        return EmptyList.b;
    }

    @Override // yads.cy0
    public final String getAdInfo() {
        return null;
    }

    @Override // yads.cy0
    public final void a(Context context, v9 v9Var) {
        this.b.a(context, this.d);
    }

    @Override // yads.cy0
    public final Object a(ry0 ry0Var, Activity activity) {
        Object failure;
        dp1 dp1Var;
        try {
            MediatedInterstitialAdapter mediatedInterstitialAdapter = this.c.a;
            if (mediatedInterstitialAdapter != null) {
                mn2 mn2Var = this.d.c;
                qcy qcyVar = a.e[0];
                mn2Var.getClass();
                mn2Var.a = new WeakReference(ry0Var);
                t8 t8Var = this.a.f;
                if (t8Var.b()) {
                    ((a9) t8Var.g.getValue()).onAdWillDisplay();
                }
                mediatedInterstitialAdapter.showInterstitial(activity);
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null && (dp1Var = this.b.i) != null) {
            Context applicationContext = activity.getApplicationContext();
            Map f = on00.f(new Pair("reason", dt.b("exception_in_adapter", a.toString())));
            yp1 yp1Var = this.e;
            rr1 rr1Var = dp1Var.b;
            String networkName = dp1Var.c.b().getNetworkName();
            yp1Var.getClass();
            yp1Var.a(applicationContext, dp2.f, rr1Var, networkName, f);
        }
        return failure;
    }

    @Override // yads.cy0
    public final void a(Context context) {
        this.a.f.a();
        this.b.a(context);
    }
}
