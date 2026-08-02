package com.google.android.gms.ads.internal.util.client;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzt {
    public static final /* synthetic */ zzt[] a;
    public static final zzt zza;
    public static final zzt zzb;
    public static final zzt zzc;
    public static final zzt zzd;

    static {
        zzt zztVar = new zzt("SUCCESS", 0);
        zza = zztVar;
        zzt zztVar2 = new zzt("PERMANENT_FAILURE", 1);
        zzb = zztVar2;
        zzt zztVar3 = new zzt("RETRIABLE_FAILURE", 2);
        zzc = zztVar3;
        zzt zztVar4 = new zzt("BUFFERED", 3);
        zzd = zztVar4;
        a = new zzt[]{zztVar, zztVar2, zztVar3, zztVar4};
    }

    public static zzt[] values() {
        return (zzt[]) a.clone();
    }
}
