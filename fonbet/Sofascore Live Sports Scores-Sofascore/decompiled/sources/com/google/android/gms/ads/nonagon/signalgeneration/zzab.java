package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzhcv;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzab implements zzhcv {
    public final /* synthetic */ zzap a;

    public zzab(zzap zzapVar) {
        this.a = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().d("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        zzap zzapVar = this.a;
        AtomicInteger atomicInteger = zzapVar.C;
        zzv.zze(zzapVar.k, null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.pb)).booleanValue() || zzapVar.B.get()) {
            return;
        }
        if (atomicInteger.getAndIncrement() < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.qb)).intValue()) {
            zzapVar.H4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* synthetic */ void zzb(@Nullable Object obj) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.pb)).booleanValue()) {
            Pair pair = new Pair("se", "query_g");
            Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
            Pair pair3 = new Pair("rtype", Integer.toString(6));
            Pair pair4 = new Pair("scar", "true");
            zzap zzapVar = this.a;
            zzv.zze(zzapVar.k, null, "sgs", pair, pair2, pair3, pair4, new Pair("sgi_rn", Integer.toString(zzapVar.C.get())));
            zzapVar.B.set(true);
        }
    }
}
