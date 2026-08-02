package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzil;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzis;
import defpackage.h0p;
import defpackage.hkn;
import defpackage.xjo;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzou extends h0p {
    public static final boolean T(String str) {
        String str2 = (String) zzfy.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.N().y()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzot R(String str) {
        zzic zzicVar = (zzic) this.b;
        zzpg zzpgVar = this.c;
        hkn hknVar = zzpgVar.c;
        zzht zzhtVar = zzpgVar.a;
        zzpg.U(hknVar);
        xjo U0 = hknVar.U0(str);
        zzls zzlsVar = zzls.GOOGLE_ANALYTICS;
        zzot zzotVar = null;
        if (U0 == null || !U0.z()) {
            return new zzot(S(str), Collections.EMPTY_MAP, zzlsVar, null);
        }
        zzil z = zzis.z();
        z.k();
        ((zzis) z.b).E(2);
        zzin a = zzin.a(U0.t());
        Preconditions.i(a);
        z.p(a);
        String F = U0.F();
        zzpg.U(zzhtVar);
        com.google.android.gms.internal.measurement.zzgl c0 = zzhtVar.c0(str);
        if (c0 != null) {
            hkn hknVar2 = zzpgVar.c;
            zzpg.U(hknVar2);
            xjo U02 = hknVar2.U0(str);
            if (U02 != null) {
                if (!c0.M() || c0.N().y() != 100) {
                    zzpp zzppVar = zzicVar.i;
                    zzic.k(zzppVar);
                    if (!zzppVar.v0(str, U02.D())) {
                        if (!TextUtils.isEmpty(F)) {
                        }
                    }
                }
                String E = U0.E();
                z.k();
                ((zzis) z.b).E(2);
                zzpg.U(zzhtVar);
                com.google.android.gms.internal.measurement.zzgl c02 = zzhtVar.c0(U0.E());
                if (c02 == null || !c02.M()) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.o.b(E, "[sgtm] Missing sgtm_setting in remote config. appId");
                    z.k();
                    ((zzis) z.b).F(4);
                } else {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(U0.D())) {
                        hashMap.put("x-gtm-server-preview", U0.D());
                    }
                    String z2 = c02.N().z();
                    zzin a2 = zzin.a(U0.t());
                    zzin zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
                    if (a2 != null && a2 != zzinVar) {
                        z.p(a2);
                    } else if (T(U0.E())) {
                        z.p(zzin.PINNED_TO_SERVICE_UPLOAD);
                    } else if (TextUtils.isEmpty(z2)) {
                        z.p(zzin.MISSING_SGTM_SERVER_URL);
                    } else {
                        zzgu zzguVar2 = zzicVar.f;
                        zzic.m(zzguVar2);
                        zzguVar2.o.b(E, "[sgtm] Eligible for client side upload. appId");
                        z.k();
                        ((zzis) z.b).E(3);
                        z.p(zzinVar);
                        zzotVar = new zzot(z2, hashMap, zzls.SGTM_CLIENT, (zzis) z.m());
                    }
                    c02.N().getClass();
                    c02.N().getClass();
                    zzicVar.getClass();
                    zzgu zzguVar3 = zzicVar.f;
                    if (TextUtils.isEmpty(z2)) {
                        z.k();
                        ((zzis) z.b).F(6);
                        zzic.m(zzguVar3);
                        zzguVar3.o.b(U0.E(), "[sgtm] Local service, missing sgtm_server_url");
                    } else {
                        zzic.m(zzguVar3);
                        zzguVar3.o.b(E, "[sgtm] Eligible for local service direct upload. appId");
                        z.k();
                        ((zzis) z.b).E(5);
                        z.k();
                        ((zzis) z.b).F(2);
                        zzotVar = new zzot(z2, hashMap, zzls.SGTM, (zzis) z.m());
                    }
                }
                return zzotVar != null ? zzotVar : new zzot(S(str), Collections.EMPTY_MAP, zzlsVar, (zzis) z.m());
            }
        }
        z.k();
        ((zzis) z.b).F(3);
        return new zzot(S(str), Collections.EMPTY_MAP, zzlsVar, (zzis) z.m());
    }

    public final String S(String str) {
        zzht zzhtVar = this.c.a;
        zzpg.U(zzhtVar);
        String d0 = zzhtVar.d0(str);
        if (TextUtils.isEmpty(d0)) {
            return (String) zzfy.r.a(null);
        }
        Uri parse = Uri.parse((String) zzfy.r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(d0).length() + 1 + String.valueOf(authority).length());
        sb.append(d0);
        sb.append(".");
        sb.append(authority);
        buildUpon.authority(sb.toString());
        return buildUpon.build().toString();
    }
}
