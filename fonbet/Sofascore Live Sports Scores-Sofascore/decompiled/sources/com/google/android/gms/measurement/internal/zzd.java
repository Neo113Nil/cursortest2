package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import defpackage.ah0;
import defpackage.dh0;
import defpackage.w3n;
import defpackage.y6o;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzd extends y6o {
    public final dh0 c;
    public final dh0 d;
    public long e;

    public zzd(zzic zzicVar) {
        super(zzicVar);
        this.d = new dh0(0);
        this.c = new dh0(0);
    }

    public final void R(long j, String str) {
        zzic zzicVar = (zzic) this.b;
        if (str == null || str.length() == 0) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.a("Ad unit id must be a non-empty string");
        } else {
            zzhz zzhzVar = zzicVar.g;
            zzic.m(zzhzVar);
            zzhzVar.Z(new w3n(this, str, j, 0));
        }
    }

    public final void S(long j, String str) {
        zzic zzicVar = (zzic) this.b;
        if (str == null || str.length() == 0) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.a("Ad unit id must be a non-empty string");
        } else {
            zzhz zzhzVar = zzicVar.g;
            zzic.m(zzhzVar);
            zzhzVar.Z(new w3n(this, str, j, 1));
        }
    }

    public final void T(long j) {
        zzmb zzmbVar = ((zzic) this.b).l;
        zzic.l(zzmbVar);
        zzlu U = zzmbVar.U(false);
        dh0 dh0Var = this.c;
        Iterator it = ((ah0) dh0Var.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            V(str, j - ((Long) dh0Var.get(str)).longValue(), U);
        }
        if (!dh0Var.isEmpty()) {
            U(j - this.e, U);
        }
        W(j);
    }

    public final void U(long j, zzlu zzluVar) {
        zzic zzicVar = (zzic) this.b;
        if (zzluVar == null) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.o.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.o.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zzpp.M0(zzluVar, bundle, true);
            zzlj zzljVar = zzicVar.m;
            zzic.l(zzljVar);
            zzljVar.X("am", bundle, "_xa");
        }
    }

    public final void V(String str, long j, zzlu zzluVar) {
        zzic zzicVar = (zzic) this.b;
        if (zzluVar == null) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.o.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.o.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zzpp.M0(zzluVar, bundle, true);
            zzlj zzljVar = zzicVar.m;
            zzic.l(zzljVar);
            zzljVar.X("am", bundle, "_xu");
        }
    }

    public final void W(long j) {
        dh0 dh0Var = this.c;
        Iterator it = ((ah0) dh0Var.keySet()).iterator();
        while (it.hasNext()) {
            dh0Var.put((String) it.next(), Long.valueOf(j));
        }
        if (dh0Var.isEmpty()) {
            return;
        }
        this.e = j;
    }
}
