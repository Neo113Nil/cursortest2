package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.zzdd;
import defpackage.c78;
import defpackage.two;
import defpackage.yao;
import defpackage.yuo;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzmb extends yao {
    public volatile zzlu d;
    public volatile zzlu e;
    public zzlu f;
    public final ConcurrentHashMap g;
    public zzdd h;
    public volatile boolean i;
    public volatile zzlu j;
    public zzlu k;
    public boolean l;
    public final Object m;

    public zzmb(zzic zzicVar) {
        super(zzicVar);
        this.m = new Object();
        this.g = new ConcurrentHashMap();
    }

    @Override // defpackage.yao
    public final boolean T() {
        return false;
    }

    public final zzlu U(boolean z) {
        R();
        Q();
        zzlu zzluVar = this.f;
        return !z ? zzluVar : zzluVar != null ? zzluVar : this.k;
    }

    public final String V(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        zzic zzicVar = (zzic) this.b;
        int length2 = str2.length();
        zzicVar.d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        zzicVar.d.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(zzlu zzluVar, zzlu zzluVar2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        long j3;
        Bundle bundle2;
        boolean z3 = zzluVar.e;
        zzic zzicVar = (zzic) this.b;
        Q();
        boolean z4 = false;
        if (zzluVar2 != null) {
            if (zzluVar2.c == zzluVar.c && Objects.equals(zzluVar2.b, zzluVar.b) && Objects.equals(zzluVar2.a, zzluVar.a)) {
                z2 = false;
                if (z && this.f != null) {
                    z4 = true;
                }
                if (z2) {
                    Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
                    zzpp.M0(zzluVar, bundle3, true);
                    if (zzluVar2 != null) {
                        String str = zzluVar2.a;
                        if (str != null) {
                            bundle3.putString("_pn", str);
                        }
                        String str2 = zzluVar2.b;
                        if (str2 != null) {
                            bundle3.putString("_pc", str2);
                        }
                        bundle3.putLong("_pi", zzluVar2.c);
                    }
                    if (z4) {
                        zzoc zzocVar = zzicVar.h;
                        zzic.l(zzocVar);
                        c78 c78Var = zzocVar.g;
                        long j4 = j - c78Var.c;
                        c78Var.c = j;
                        if (j4 > 0) {
                            zzpp zzppVar = zzicVar.i;
                            zzic.k(zzppVar);
                            zzppVar.C0(bundle3, j4);
                        }
                    }
                    zzal zzalVar = zzicVar.d;
                    DefaultClock defaultClock = zzicVar.k;
                    if (!zzalVar.f0()) {
                        bundle3.putLong("_mst", 1L);
                    }
                    String str3 = true != z3 ? "auto" : "app";
                    defaultClock.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z3) {
                        long j5 = zzluVar.f;
                        if (j5 != 0) {
                            j2 = j5;
                            if (zzicVar.d.b0(null, zzfy.e1)) {
                                j3 = 0;
                            } else {
                                defaultClock.getClass();
                                j3 = SystemClock.elapsedRealtime();
                            }
                            if (z3) {
                                bundle2 = bundle3;
                            } else {
                                bundle2 = bundle3;
                                long j6 = zzluVar.g;
                                if (j6 != 0) {
                                    j3 = j6;
                                }
                            }
                            zzlj zzljVar = zzicVar.m;
                            zzic.l(zzljVar);
                            zzljVar.Y(j2, j3, bundle2, str3, "_vs");
                        }
                    }
                    j2 = currentTimeMillis;
                    if (zzicVar.d.b0(null, zzfy.e1)) {
                    }
                    if (z3) {
                    }
                    zzlj zzljVar2 = zzicVar.m;
                    zzic.l(zzljVar2);
                    zzljVar2.Y(j2, j3, bundle2, str3, "_vs");
                }
                if (z4) {
                    Z(this.f, true, j);
                }
                this.f = zzluVar;
                if (z3) {
                    this.k = zzluVar;
                }
                zznl o = zzicVar.o();
                o.Q();
                o.R();
                o.e0(new yuo(o, zzluVar));
            }
        }
        z2 = true;
        if (z) {
            z4 = true;
        }
        if (z2) {
        }
        if (z4) {
        }
        this.f = zzluVar;
        if (z3) {
        }
        zznl o2 = zzicVar.o();
        o2.Q();
        o2.R();
        o2.e0(new yuo(o2, zzluVar));
    }

    public final void X(zzdd zzddVar, Bundle bundle) {
        Bundle bundle2;
        if (!((zzic) this.b).d.f0() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.g.put(Integer.valueOf(zzddVar.a), new zzlu(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void Y(String str, zzlu zzluVar, boolean z) {
        zzlu zzluVar2;
        zzlu zzluVar3 = this.d == null ? this.e : this.d;
        if (zzluVar.b == null) {
            zzluVar2 = new zzlu(zzluVar.a, str != null ? V(str) : null, zzluVar.c, zzluVar.e, zzluVar.f, zzluVar.g);
        } else {
            zzluVar2 = zzluVar;
        }
        this.e = this.d;
        this.d = zzluVar2;
        zzic zzicVar = (zzic) this.b;
        zzicVar.k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzhz zzhzVar = zzicVar.g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new two(this, zzluVar2, zzluVar3, elapsedRealtime, z));
    }

    public final void Z(zzlu zzluVar, boolean z, long j) {
        zzic zzicVar = (zzic) this.b;
        zzd zzdVar = zzicVar.n;
        zzic.j(zzdVar);
        zzicVar.k.getClass();
        zzdVar.T(SystemClock.elapsedRealtime());
        boolean z2 = zzluVar != null && zzluVar.d;
        zzoc zzocVar = zzicVar.h;
        zzic.l(zzocVar);
        if (!zzocVar.g.q(j, z2, z) || zzluVar == null) {
            return;
        }
        zzluVar.d = false;
    }

    public final zzlu a0(zzdd zzddVar) {
        Preconditions.i(zzddVar);
        Integer valueOf = Integer.valueOf(zzddVar.a);
        ConcurrentHashMap concurrentHashMap = this.g;
        zzlu zzluVar = (zzlu) concurrentHashMap.get(valueOf);
        if (zzluVar == null) {
            String V = V(zzddVar.b);
            zzpp zzppVar = ((zzic) this.b).i;
            zzic.k(zzppVar);
            zzlu zzluVar2 = new zzlu(null, V, zzppVar.O0());
            concurrentHashMap.put(valueOf, zzluVar2);
            zzluVar = zzluVar2;
        }
        return this.j != null ? this.j : zzluVar;
    }
}
