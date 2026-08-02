package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbop;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzcdm;
import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzay {
    public static final zzay g = new zzay();
    public static final /* synthetic */ int zza = 0;
    public final com.google.android.gms.ads.internal.util.client.zzf a;
    public final zzaw b;
    public boolean c;
    public final VersionInfoParcel d;
    public final Random e;
    public final String f;

    public zzay() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzfc(), new zzboo(), new zzcdm(), new zzbzq(), new zzbop(), new zzl());
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        String zzj = com.google.android.gms.ads.internal.util.client.zzf.zzj();
        this.a = zzfVar;
        this.b = zzawVar;
        this.c = false;
        this.d = versionInfoParcel;
        this.e = random;
        this.f = zzj;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zza() {
        return g.a;
    }

    public static zzaw zzb() {
        return g.b;
    }

    public static void zzc() {
        g.c = false;
    }

    public static void zzd() {
        g.c = true;
    }

    public static boolean zze() {
        return g.c;
    }

    public static String zzf() {
        return g.f;
    }

    public static VersionInfoParcel zzg() {
        return g.d;
    }

    public static Random zzh() {
        return g.e;
    }
}
