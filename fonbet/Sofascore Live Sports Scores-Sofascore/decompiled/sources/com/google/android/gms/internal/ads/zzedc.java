package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzedc {
    public static final zzedc a;
    public static final zzedc b;
    public static final zzedc c;
    public static final /* synthetic */ zzedc[] d;

    static {
        zzedc zzedcVar = new zzedc("AD_REQUESTED", 0);
        a = zzedcVar;
        zzedc zzedcVar2 = new zzedc("AD_LOADED", 1);
        b = zzedcVar2;
        zzedc zzedcVar3 = new zzedc("AD_LOAD_FAILED", 2);
        c = zzedcVar3;
        d = new zzedc[]{zzedcVar, zzedcVar2, zzedcVar3};
    }

    public static zzedc[] values() {
        return (zzedc[]) d.clone();
    }
}
