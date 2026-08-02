package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzp {
    public static final Logger d = new Logger("ApplicationAnalyticsUtils", null);
    public static final String e = "22.2.0";
    public final String a;
    public final Map b;
    public final Map c;

    public zzp(Bundle bundle, String str) {
        this.a = str;
        this.b = zzaz.a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.c = zzaz.a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzqr a(zzo zzoVar, int i) {
        int i2;
        Map map;
        int i3;
        zzqq b = b(zzoVar);
        zzqf o = zzqg.o(b.e());
        Map map2 = this.c;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i);
            if (map2.containsKey(valueOf)) {
                Integer num = (Integer) map2.get(valueOf);
                Preconditions.i(num);
                i2 = num.intValue();
                o.b();
                ((zzqg) o.b).v(i2);
                map = this.b;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = (Integer) map.get(valueOf2);
                        Preconditions.i(num2);
                        i3 = num2.intValue();
                        o.b();
                        ((zzqg) o.b).w(i3);
                        b.f((zzqg) o.c());
                        return (zzqr) b.c();
                    }
                }
                i3 = i + 10000;
                o.b();
                ((zzqg) o.b).w(i3);
                b.f((zzqg) o.c());
                return (zzqr) b.c();
            }
        }
        i2 = i + 10000;
        o.b();
        ((zzqg) o.b).v(i2);
        map = this.b;
        if (map != null) {
        }
        i3 = i + 10000;
        o.b();
        ((zzqg) o.b).w(i3);
        b.f((zzqg) o.c());
        return (zzqr) b.c();
    }

    public final zzqq b(zzo zzoVar) {
        int i;
        long j;
        zzqq o = zzqr.o();
        long j2 = zzoVar.d;
        o.b();
        ((zzqr) o.b).q(j2);
        int i2 = zzoVar.e;
        zzoVar.e = i2 + 1;
        o.b();
        ((zzqr) o.b).y(i2);
        String str = zzoVar.c;
        if (str != null) {
            o.b();
            ((zzqr) o.b).x(str);
        }
        zzur n = zzus.n();
        if (!TextUtils.isEmpty(zzoVar.h)) {
            String str2 = zzoVar.h;
            o.b();
            ((zzqr) o.b).r(str2);
            String str3 = zzoVar.h;
            n.b();
            ((zzus) n.b).o(str3);
        }
        if (!TextUtils.isEmpty(zzoVar.i)) {
            String str4 = zzoVar.i;
            n.b();
            ((zzus) n.b).p(str4);
        }
        if (!TextUtils.isEmpty(zzoVar.j)) {
            String str5 = zzoVar.j;
            n.b();
            ((zzus) n.b).q(str5);
        }
        if (!TextUtils.isEmpty(zzoVar.k)) {
            String str6 = zzoVar.k;
            n.b();
            ((zzus) n.b).r(str6);
        }
        if (!TextUtils.isEmpty(zzoVar.l)) {
            String str7 = zzoVar.l;
            n.b();
            ((zzus) n.b).s(str7);
        }
        if (!TextUtils.isEmpty(zzoVar.m)) {
            String str8 = zzoVar.m;
            n.b();
            ((zzus) n.b).v(str8);
        }
        int i3 = zzoVar.n;
        if (i3 != 1) {
            i = 3;
            if (i3 != 2) {
                if (i3 != 3) {
                    i = 5;
                    if (i3 != 4) {
                        i = i3 != 5 ? 1 : 6;
                    }
                } else {
                    i = 4;
                }
            }
        } else {
            i = 2;
        }
        n.b();
        ((zzus) n.b).w(i);
        zzus zzusVar = (zzus) n.c();
        o.b();
        ((zzqr) o.b).D(zzusVar);
        zzqb n2 = zzqc.n();
        n2.b();
        ((zzqc) n2.b).p(e);
        n2.b();
        ((zzqc) n2.b).o(this.a);
        zzqc zzqcVar = (zzqc) n2.c();
        o.b();
        ((zzqr) o.b).B(zzqcVar);
        zzqf n3 = zzqg.n();
        if (zzoVar.b != null) {
            zzro n4 = zzrp.n();
            String str9 = zzoVar.b;
            n4.b();
            ((zzrp) n4.b).o(str9);
            zzrp zzrpVar = (zzrp) n4.c();
            n3.b();
            ((zzqg) n3.b).q(zzrpVar);
        }
        n3.b();
        ((zzqg) n3.b).r(false);
        String str10 = zzoVar.f;
        if (str10 != null) {
            try {
                String replace = str10.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException unused) {
                d.c("receiverSessionId %s is not valid for hash", str10);
                j = 0;
            }
            n3.b();
            ((zzqg) n3.b).s(j);
        }
        int i4 = zzoVar.g;
        n3.b();
        ((zzqg) n3.b).x(i4);
        boolean z = zzoVar.a.b == 2;
        n3.b();
        ((zzqg) n3.b).y(z);
        boolean z2 = zzoVar.o;
        n3.b();
        ((zzqg) n3.b).B(z2);
        o.b();
        ((zzqr) o.b).z((zzqg) n3.c());
        return o;
    }
}
