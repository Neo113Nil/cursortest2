package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzil;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzis;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class F6 extends AbstractC3412z6 {
    public F6(S6 s62) {
        super(s62);
    }

    private final String k(String str) {
        String x10 = this.f34418b.D0().x(str);
        if (TextUtils.isEmpty(x10)) {
            return (String) AbstractC3209a2.f33898r.b(null);
        }
        Uri parse = Uri.parse((String) AbstractC3209a2.f33898r.b(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(x10).length() + 1 + String.valueOf(authority).length());
        sb2.append(x10);
        sb2.append(".");
        sb2.append(authority);
        buildUpon.authority(sb2.toString());
        return buildUpon.build().toString();
    }

    public static final boolean l(String str) {
        String str2 = (String) AbstractC3209a2.f33902t.b(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final E6 i(String str) {
        D2 J02;
        S6 s62 = this.f34418b;
        D2 J03 = s62.F0().J0(str);
        E6 e62 = null;
        if (J03 == null || !J03.V()) {
            return new E6(k(str), Collections.EMPTY_MAP, EnumC3252f5.GOOGLE_ANALYTICS, null);
        }
        zzil zzb = zzis.zzb();
        zzb.zzb(2);
        zzb.zza((zzin) AbstractC3191o.m(zzin.zzb(J03.M())));
        String p02 = J03.p0();
        zzgl w10 = s62.D0().w(str);
        if (w10 == null || (J02 = s62.F0().J0(str)) == null || ((!w10.zzp() || w10.zzq().zzc() != 100) && !this.f33578a.C().P(str, J02.l0()) && (TextUtils.isEmpty(p02) || Math.abs(p02.hashCode() % 100) >= w10.zzq().zzc()))) {
            zzb.zzc(3);
            return new E6(k(str), Collections.EMPTY_MAP, EnumC3252f5.GOOGLE_ANALYTICS, (zzis) zzb.zzbc());
        }
        String o02 = J03.o0();
        zzb.zzb(2);
        zzgl w11 = s62.D0().w(J03.o0());
        if (w11 == null || !w11.zzp()) {
            this.f33578a.a().w().b("[sgtm] Missing sgtm_setting in remote config. appId", o02);
            zzb.zzc(4);
        } else {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(J03.l0())) {
                hashMap.put("x-gtm-server-preview", J03.l0());
            }
            String zzd = w11.zzq().zzd();
            zzin zzb2 = zzin.zzb(J03.M());
            if (zzb2 != null && zzb2 != zzin.CLIENT_UPLOAD_ELIGIBLE) {
                zzb.zza(zzb2);
            } else if (l(J03.o0())) {
                zzb.zza(zzin.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(zzd)) {
                zzb.zza(zzin.MISSING_SGTM_SERVER_URL);
            } else {
                this.f33578a.a().w().b("[sgtm] Eligible for client side upload. appId", o02);
                zzb.zzb(3);
                zzb.zza(zzin.CLIENT_UPLOAD_ELIGIBLE);
                e62 = new E6(zzd, hashMap, EnumC3252f5.SGTM_CLIENT, (zzis) zzb.zzbc());
            }
            w11.zzq().zza();
            w11.zzq().zzb();
            C3298l3 c3298l3 = this.f33578a;
            c3298l3.c();
            if (TextUtils.isEmpty(zzd)) {
                zzb.zzc(6);
                c3298l3.a().w().b("[sgtm] Local service, missing sgtm_server_url", J03.o0());
            } else {
                c3298l3.a().w().b("[sgtm] Eligible for local service direct upload. appId", o02);
                zzb.zzb(5);
                zzb.zzc(2);
                e62 = new E6(zzd, hashMap, EnumC3252f5.SGTM, (zzis) zzb.zzbc());
            }
        }
        return e62 != null ? e62 : new E6(k(str), Collections.EMPTY_MAP, EnumC3252f5.GOOGLE_ANALYTICS, (zzis) zzb.zzbc());
    }

    public final boolean j(String str, zzin zzinVar) {
        zzgl w10;
        h();
        return (zzinVar != zzin.CLIENT_UPLOAD_ELIGIBLE || l(str) || (w10 = this.f34418b.D0().w(str)) == null || !w10.zzp() || w10.zzq().zzd().isEmpty()) ? false : true;
    }
}
