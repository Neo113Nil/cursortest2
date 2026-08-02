package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lnv7;", "Lq8;", "jv7", "iv7", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class nv7 extends q8 {
    public final s96 e;
    public final w3b f;
    public final umd g;
    public final int h;
    public final qv7 i;
    public final yzc j;
    public final lec k;
    public final yzc l;
    public final lec m;
    public final yzc n;
    public final lec o;
    public final yzc p;
    public final lec q;
    public final yzc r;
    public final yzc s;
    public final ArrayList t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv7(Application application, s96 s96Var, w3b w3bVar, umd umdVar, SharedPreferences sharedPreferences, amd amdVar) {
        super(application);
        boolean z;
        SharedPreferences d;
        s96Var.getClass();
        w3bVar.getClass();
        umdVar.getClass();
        sharedPreferences.getClass();
        amdVar.getClass();
        this.e = s96Var;
        this.f = w3bVar;
        this.g = umdVar;
        this.h = ke0.c;
        qv7 qv7Var = rv7.c;
        this.i = qv7Var;
        yzc yzcVar = new yzc();
        this.j = yzcVar;
        this.k = waa.w(yzcVar);
        yzc yzcVar2 = new yzc();
        this.l = yzcVar2;
        this.m = waa.w(yzcVar2);
        yzc yzcVar3 = new yzc();
        this.n = yzcVar3;
        this.o = waa.w(yzcVar3);
        yzc yzcVar4 = new yzc();
        this.p = yzcVar4;
        this.q = waa.w(yzcVar4);
        yzc yzcVar5 = new yzc();
        this.r = yzcVar5;
        this.s = yzcVar5;
        bga bgaVar = xld.a;
        boolean f = xld.f(i(), sharedPreferences);
        Context i = i();
        if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext = i.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences2 = d;
            }
            ccd ccdVar = vl.b;
            String string = sharedPreferences2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18");
            ccd ccdVar2 = vl.b;
            if (!Intrinsics.c(string, "25_or_older")) {
                z = false;
                qv7Var.getClass();
                this.t = (f || !z) ? null : amdVar.b(270);
            }
        }
        z = true;
        qv7Var.getClass();
        this.t = (f || !z) ? null : amdVar.b(270);
    }

    public final void k(ZonedDateTime zonedDateTime) {
        xw3.L(un0.z(this), null, null, new pf4(this, zonedDateTime, null), 3);
        xw3.L(un0.z(this), null, null, new mv7(this, zonedDateTime, null), 3);
    }
}
