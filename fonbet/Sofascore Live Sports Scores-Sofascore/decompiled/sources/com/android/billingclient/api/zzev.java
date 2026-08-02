package com.android.billingclient.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzev {
    public static final /* synthetic */ zzev[] a;
    public static final zzev zza;
    public static final zzev zzb;
    public static final zzev zzc;
    public static final zzev zzd;
    public static final zzev zze;
    public static final zzev zzf;
    public static final zzev zzg;

    static {
        zzev zzevVar = new zzev("CANCEL", 0);
        zza = zzevVar;
        zzev zzevVar2 = new zzev("RESTORE", 1);
        zzb = zzevVar2;
        zzev zzevVar3 = new zzev("PAUSE", 2);
        zzc = zzevVar3;
        zzev zzevVar4 = new zzev("RESUME", 3);
        zzd = zzevVar4;
        zzev zzevVar5 = new zzev("FIX_PAYMENT", 4);
        zze = zzevVar5;
        zzev zzevVar6 = new zzev("CONFIRM_PRICE_CHANGE", 5);
        zzf = zzevVar6;
        zzev zzevVar7 = new zzev("CONFIRM_PRICE_STEP_UP", 6);
        zzg = zzevVar7;
        a = new zzev[]{zzevVar, zzevVar2, zzevVar3, zzevVar4, zzevVar5, zzevVar6, zzevVar7};
    }

    public static zzev[] values() {
        return (zzev[]) a.clone();
    }
}
