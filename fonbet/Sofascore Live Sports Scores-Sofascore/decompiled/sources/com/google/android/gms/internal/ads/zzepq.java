package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import defpackage.ddb;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzepq implements zzemq {
    @Override // com.google.android.gms.internal.ads.zzemq
    public final ddb a(zzflo zzfloVar, zzfld zzfldVar) {
        JSONObject jSONObject = zzfldVar.v;
        String optString = jSONObject.optString("pubid", "");
        zzflw zzflwVar = zzfloVar.a.a;
        zzflv zzflvVar = new zzflv();
        zzflvVar.o.a = zzflwVar.p.a;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.d;
        zzflvVar.a = zzmVar;
        zzflvVar.b = zzflwVar.f;
        zzflvVar.x = zzflwVar.x;
        String str = zzflwVar.g;
        zzflvVar.c = str;
        zzflvVar.d = zzflwVar.a;
        zzflvVar.f = zzflwVar.h;
        zzflvVar.g = zzflwVar.i;
        zzflvVar.h = zzflwVar.j;
        zzflvVar.i = zzflwVar.k;
        AdManagerAdViewOptions adManagerAdViewOptions = zzflwVar.m;
        zzflvVar.j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            zzflvVar.e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        PublisherAdViewOptions publisherAdViewOptions = zzflwVar.n;
        zzflvVar.k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            zzflvVar.e = publisherAdViewOptions.zza();
            zzflvVar.l = publisherAdViewOptions.zzb();
        }
        zzflvVar.p = zzflwVar.q;
        zzflvVar.q = zzflwVar.r;
        zzflvVar.r = zzflwVar.c;
        zzflvVar.s = zzflwVar.s;
        zzflvVar.t = zzflwVar.t;
        zzflvVar.u.set(zzflwVar.u.get());
        zzflvVar.w = zzflwVar.w;
        zzflvVar.c = optString;
        zzflvVar.v = true;
        Bundle bundle = zzmVar.zzm;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String optString2 = jSONObject.optString("mad_hac", null);
        if (optString2 != null) {
            bundle4.putString("mad_hac", optString2);
        }
        String optString3 = jSONObject.optString("adJson", null);
        if (optString3 != null) {
            bundle4.putString("_ad", optString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfldVar.D;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, optString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        zzflvVar.a = new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, bundle4, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, bundle2, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz, zzmVar.zzA, zzmVar.zzB);
        zzflvVar.w = zzfldVar.H0;
        zzflw a = zzflvVar.a();
        Bundle bundle5 = new Bundle();
        zzflg zzflgVar = zzfloVar.b.b;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(zzflgVar.a));
        bundle6.putInt("refresh_interval", zzflgVar.c);
        bundle6.putString("gws_query_id", zzflgVar.b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", zzfldVar.w);
        bundle7.putString("ad_source_name", zzfldVar.F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(zzfldVar.c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(zzfldVar.d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfldVar.p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(zzfldVar.m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(zzfldVar.g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(zzfldVar.h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(zzfldVar.i));
        bundle7.putString("transaction_id", zzfldVar.j);
        bundle7.putString("valid_from_timestamp", zzfldVar.k);
        bundle7.putBoolean("is_closable_area_disabled", zzfldVar.P);
        bundle7.putString("recursive_server_response_data", zzfldVar.o0);
        bundle7.putBoolean("is_analytics_logging_enabled", zzfldVar.W);
        zzcct zzcctVar = zzfldVar.l;
        if (zzcctVar != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", zzcctVar.b);
            bundle8.putString("rb_type", zzcctVar.a);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(a, bundle5, zzfldVar, zzfloVar);
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean b(zzflo zzfloVar, zzfld zzfldVar) {
        return !TextUtils.isEmpty(zzfldVar.v.optString("pubid", ""));
    }

    public abstract zzfpp c(zzflw zzflwVar, Bundle bundle, zzfld zzfldVar, zzflo zzfloVar);
}
