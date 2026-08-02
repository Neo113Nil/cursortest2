package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.L6;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzevg implements zzfdg {
    public final zzflw a;
    public final long b;
    public final long c;

    public zzevg(zzflw zzflwVar, long j, long j2) {
        this.a = zzflwVar;
        this.b = j;
        this.c = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflw zzflwVar = this.a;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.d;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzflwVar.g);
        int i = zzflwVar.p.a;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j = this.b;
        bundle.putLong("start_signals_timestamp", j);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.pf)).booleanValue()) {
            bundle.putLong("tsi", j - this.c);
        }
        zzfml.d(bundle, "is_sdk_preload", true, zzmVar.zzc());
        zzfml.b(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j2 = zzmVar.zzb;
        String format = simpleDateFormat.format(new Date(j2));
        boolean z = false;
        zzfml.b(bundle, "cust_age", format, j2 != -1);
        Bundle bundle2 = zzmVar.zzc;
        if (bundle2 != null) {
            bundle.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle2);
        }
        int i3 = zzmVar.zzd;
        zzfml.c(bundle, "cust_gender", i3, i3 != -1);
        List list = zzmVar.zze;
        if (list != null) {
            bundle.putStringArrayList("kw", new ArrayList<>(list));
        }
        int i4 = zzmVar.zzg;
        zzfml.c(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i5 = zzmVar.zza;
        zzfml.c(bundle, "d_imp_hdr", 1, i5 >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        zzfml.b(bundle, "ppid", str, i5 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong(L6.s, (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        zzfml.e("url", bundle, zzmVar.zzl);
        List list2 = zzmVar.zzv;
        if (list2 != null) {
            bundle.putStringArrayList("neighboring_content_urls", new ArrayList<>(list2));
        }
        Bundle bundle4 = zzmVar.zzn;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        List list3 = zzmVar.zzo;
        if (list3 != null) {
            bundle.putStringArrayList("category_exclusions", new ArrayList<>(list3));
        }
        zzfml.e("request_agent", bundle, zzmVar.zzp);
        zzfml.e("request_pkg", bundle, zzmVar.zzq);
        zzfml.d(bundle, "is_designed_for_families", zzmVar.zzr, i5 >= 7);
        if (i5 >= 8) {
            int i6 = zzmVar.zzt;
            zzfml.c(bundle, "tag_for_under_age_of_consent", i6, i6 != -1);
            zzfml.e("max_ad_content_rating", bundle, zzmVar.zzu);
        }
        int i7 = zzmVar.zzB;
        zzfml.c(bundle, "tfat", i7, i7 != -1);
        Bundle bundle5 = zzflwVar.e;
        bundle.putInt("plcs", bundle5.getInt("plcs"));
        bundle.putInt("plbs", bundle5.getInt("plbs"));
        zzfml.e("plid", bundle, bundle5.getString("plid"));
        if (zzflwVar.v && (zzmVar.zzs != null || zzmVar.zzx != null)) {
            z = true;
        }
        zzfml.c(bundle, "s2s_rr", 1, z);
    }
}
