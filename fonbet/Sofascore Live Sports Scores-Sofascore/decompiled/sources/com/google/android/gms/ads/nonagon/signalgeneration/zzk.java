package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzeao;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzk extends QueryInfoGenerationCallback {
    public final zzj a;
    public final zzeao b;
    public final boolean c;
    public final int d;
    public final long e = com.google.android.gms.ads.internal.zzt.zzk().a();
    public final Boolean f;

    public zzk(zzj zzjVar, boolean z, int i, @Nullable Boolean bool, zzeao zzeaoVar) {
        this.a = zzjVar;
        this.c = z;
        this.d = i;
        this.f = bool;
        this.b = zzeaoVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().a() - this.e));
        int i = this.d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f));
        boolean z = this.c;
        zzv.zze(this.b, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z ? "0" : "1"));
        this.a.a(z, new zzl(null, str, ((Long) zzblm.h.c()).longValue() + com.google.android.gms.ads.internal.zzt.zzk().a(), i));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().a() - this.e));
        int i = this.d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f));
        boolean z = this.c;
        zzv.zze(this.b, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z ? "0" : "1"));
        this.a.a(z, new zzl(queryInfo, "", ((Long) zzblm.h.c()).longValue() + com.google.android.gms.ads.internal.zzt.zzk().a(), i));
    }
}
