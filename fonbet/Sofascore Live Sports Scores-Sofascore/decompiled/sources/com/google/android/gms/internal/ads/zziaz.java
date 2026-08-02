package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zziaz {
    public static final zziaz a;
    public static final zziaz b;
    public static final zziaz c;
    public static final /* synthetic */ zziaz[] d;

    static {
        zziaz zziazVar = new zziaz("NIST_P256", 0);
        a = zziazVar;
        zziaz zziazVar2 = new zziaz("NIST_P384", 1);
        b = zziazVar2;
        zziaz zziazVar3 = new zziaz("NIST_P521", 2);
        c = zziazVar3;
        d = new zziaz[]{zziazVar, zziazVar2, zziazVar3};
    }

    public static zziaz[] values() {
        return (zziaz[]) d.clone();
    }
}
