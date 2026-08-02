package com.google.android.gms.internal.ads;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdFormat;
import defpackage.hao;
import java.util.EnumMap;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfuf {
    public final zzeaj a;

    public zzfuf(zzeaj zzeajVar) {
        this.a = zzeajVar;
    }

    public final void a(int i, long j, hao haoVar, String str) {
        zzeai a = this.a.a();
        a.b("action", "start_preload");
        a.b("sp_ts", Long.toString(j));
        a.b("ad_format", haoVar.a());
        a.b(MolocoMediationAdapter.KEY_AD_UNIT_ID, haoVar.a);
        a.b("pid", haoVar.c);
        a.b("max_ads", Integer.toString(i));
        a.b("pv", str);
        a.c();
    }

    public final void b(EnumMap enumMap, long j) {
        zzeai a = this.a.a();
        a.b("action", "start_preload");
        a.b("sp_ts", Long.toString(j));
        a.b("pv", "1");
        for (AdFormat adFormat : enumMap.keySet()) {
            String valueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            a.b(valueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(adFormat)).intValue()));
        }
        a.c();
    }

    public final void c(int i, int i2, long j, Long l, String str, hao haoVar, String str2) {
        zzeai a = this.a.a();
        a.b("plaac_ts", Long.toString(j));
        a.b("max_ads", Integer.toString(i));
        a.b("cache_size", Integer.toString(i2));
        a.b("action", "is_ad_available");
        if (haoVar != null) {
            a.b(MolocoMediationAdapter.KEY_AD_UNIT_ID, haoVar.a);
            a.b("pid", haoVar.c);
            a.b("ad_format", haoVar.a());
        }
        if (l != null) {
            a.b("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            a.b("gqi", str);
        }
        a.b("pv", str2);
        a.c();
    }

    public final void d(long j, int i, int i2, String str, hao haoVar, String str2) {
        zzeai a = this.a.a();
        a.b("ppla_ts", Long.toString(j));
        a.b("ad_format", haoVar.a());
        a.b(MolocoMediationAdapter.KEY_AD_UNIT_ID, haoVar.a);
        a.b("pid", haoVar.c);
        a.b("max_ads", Integer.toString(i));
        a.b("cache_size", Integer.toString(i2));
        a.b("action", "poll_ad");
        if (str != null) {
            a.b("gqi", str);
        }
        a.b("pv", str2);
        a.c();
    }

    public final void e(long j, long j2, long j3, long j4, long j5) {
        zzeai a = this.a.a();
        a.b("action", "iic");
        a.b("pat", Long.toString(j));
        a.b("bot", Long.toString(j2));
        a.b("cim", Long.toString(j3));
        a.b("mbot", Long.toString(j4));
        a.b("mim", Long.toString(j5));
        a.c();
    }

    public final void f(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3) {
        zzeai a = this.a.a();
        a.b("action", str);
        a.b("pat", Long.toString(j));
        a.b("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        a.b("max_ads", Integer.toString(i));
        a.b("cache_size", Integer.toString(i2));
        a.b("pas", Integer.toString(i3));
        a.b("pv", "2");
        a.b(MolocoMediationAdapter.KEY_AD_UNIT_ID, str3);
        a.b("pid", str2);
        a.c();
    }

    public final void g(String str, String str2, long j, int i, int i2, String str3, hao haoVar, String str4) {
        zzeai a = this.a.a();
        a.b(str2, Long.toString(j));
        if (haoVar != null) {
            a.b(MolocoMediationAdapter.KEY_AD_UNIT_ID, haoVar.a);
            a.b("ad_format", haoVar.a());
            a.b("pid", haoVar.c);
        }
        a.b("action", str);
        if (str3 != null) {
            a.b("gqi", str3);
        }
        if (i >= 0) {
            a.b("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            a.b("cache_size", Integer.toString(i2));
        }
        a.b("pv", str4);
        a.c();
    }

    public final void h(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzeai a = this.a.a();
        a.b("action", str);
        a.b("pat", Long.toString(j));
        a.b("pid", str2);
        a.b(MolocoMediationAdapter.KEY_AD_UNIT_ID, str3);
        a.b("max_ads", Integer.toString(i));
        a.b("cache_size", Integer.toString(i2));
        a.b("tpcnt", Integer.toString(i4));
        a.b("mpl", Integer.toString(i5));
        if (adFormat != null) {
            a.b("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i3 > 0) {
            a.b("nptr", Integer.toString(i3));
        }
        a.c();
    }
}
