package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzewz implements zzfdg {
    public final Context a;
    public final Bundle b;
    public final String c;
    public final String d;
    public final com.google.android.gms.ads.internal.util.zzg e;
    public final String f;
    public final zzdap g;

    public zzewz(Context context, Bundle bundle, String str, String str2, com.google.android.gms.ads.internal.util.zzj zzjVar, String str3, zzdap zzdapVar) {
        this.a = context;
        this.b = bundle;
        this.c = str;
        this.d = str2;
        this.e = zzjVar;
        this.f = str3;
        this.g = zzdapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBundle("quality_signals", this.b);
        bundle.putString("seq_num", this.c);
        if (!this.e.zzx()) {
            bundle.putString("session_id", this.d);
        }
        bundle.putBoolean("client_purpose_one", !r0.zzx());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L6)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                bundle.putString("_app_id", com.google.android.gms.ads.internal.util.zzs.zzr(this.a));
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().d("AppStatsSignal_AppId", e);
            }
        }
        String str = this.f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzdap zzdapVar = this.g;
            Long l = (Long) zzdapVar.d.get(str);
            bundle2.putLong("dload", l == null ? -1L : l.longValue());
            Integer num = (Integer) zzdapVar.b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.rb)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().l.get() <= 0) {
            return;
        }
        bundle.putInt("nrwv", com.google.android.gms.ads.internal.zzt.zzh().l.get());
    }
}
