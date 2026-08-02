package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.bf3;
import defpackage.wt3;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbc {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final zzbf g;

    public zzbc(zzic zzicVar, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        zzbf zzbfVar;
        Preconditions.f(str2);
        Preconditions.f(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.j.b(zzgu.U(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbfVar = new zzbf(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzgu zzguVar2 = zzicVar.f;
                    zzic.m(zzguVar2);
                    zzguVar2.g.a("Param name can't be null");
                    it.remove();
                } else {
                    zzpp zzppVar = zzicVar.i;
                    zzic.k(zzppVar);
                    Object Z = zzppVar.Z(bundle2.get(next), next);
                    if (Z == null) {
                        zzgu zzguVar3 = zzicVar.f;
                        zzic.m(zzguVar3);
                        zzguVar3.j.b(zzicVar.j.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        zzpp zzppVar2 = zzicVar.i;
                        zzic.k(zzppVar2);
                        zzppVar2.h0(bundle2, next, Z);
                    }
                }
            }
            zzbfVar = new zzbf(bundle2);
        }
        this.g = zzbfVar;
    }

    public final zzbc a(zzic zzicVar, long j) {
        return new zzbc(zzicVar, this.c, this.a, this.b, this.d, this.e, j, this.g);
    }

    public final String toString() {
        String bundle = this.g.a.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(wt3.h(length, 22, String.valueOf(str2).length(), 10, bundle.length()) + 1);
        bf3.v(sb, "Event{appId='", str, "', name='", str2);
        return wt3.m("', params=", bundle, sb, "}");
    }

    public zzbc(zzic zzicVar, String str, String str2, String str3, long j, long j2, long j3, zzbf zzbfVar) {
        Preconditions.f(str2);
        Preconditions.f(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.j.c(zzgu.U(str2), zzgu.U(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.g = zzbfVar;
    }
}
