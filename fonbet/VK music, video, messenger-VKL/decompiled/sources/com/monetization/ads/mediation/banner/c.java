package com.monetization.ads.mediation.banner;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.collections.EmptyList;
import yads.aq1;
import yads.cq1;
import yads.d4;
import yads.ep1;
import yads.eq1;
import yads.ir1;
import yads.j1;
import yads.km;
import yads.np1;
import yads.ov2;
import yads.tc2;
import yads.um;
import yads.v9;
import yads.yp1;

/* loaded from: classes14.dex */
public final class c implements um {
    public final v9 a;
    public final a b;
    public final ep1 c;

    public c(km kmVar, v9 v9Var, ir1 ir1Var) {
        this.a = v9Var;
        d4 e = kmVar.e();
        ov2 h = kmVar.h();
        cq1 cq1Var = new cq1(e);
        yp1 yp1Var = new yp1(e, h, v9Var);
        aq1 aq1Var = new aq1(new np1(ir1Var.c(), cq1Var, yp1Var));
        ep1 ep1Var = new ep1(e, h, kmVar.f(), new b(), yp1Var, aq1Var, new tc2(kmVar, ir1Var));
        this.c = ep1Var;
        this.b = new a(kmVar, ep1Var, new eq1(kmVar.r(), kmVar.e().d()));
    }

    @Override // yads.um
    public final void a(Context context) {
        this.c.a(context);
    }

    @Override // yads.um
    public final List b() {
        return EmptyList.b;
    }

    @Override // yads.um
    public final String getAdInfo() {
        return this.a.c;
    }

    @Override // yads.um
    public final void a(Context context, v9 v9Var) {
        Activity a = j1.a();
        if (a != null) {
            context = a;
        }
        this.c.a(context, this.b);
    }

    @Override // yads.um
    public final List a() {
        return EmptyList.b;
    }
}
