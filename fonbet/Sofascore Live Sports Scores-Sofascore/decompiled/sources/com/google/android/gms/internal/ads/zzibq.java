package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzibq {
    public static final zzibq a;
    public static final zzibq b;
    public static final zzibq c;
    public static final /* synthetic */ zzibq[] d;

    /* JADX INFO: Fake field, exist only in values array */
    zzibq EF0;

    static {
        zzibq zzibqVar = new zzibq("SHA1", 0);
        zzibq zzibqVar2 = new zzibq("SHA224", 1);
        zzibq zzibqVar3 = new zzibq("SHA256", 2);
        a = zzibqVar3;
        zzibq zzibqVar4 = new zzibq("SHA384", 3);
        b = zzibqVar4;
        zzibq zzibqVar5 = new zzibq("SHA512", 4);
        c = zzibqVar5;
        d = new zzibq[]{zzibqVar, zzibqVar2, zzibqVar3, zzibqVar4, zzibqVar5};
    }

    public static zzibq[] values() {
        return (zzibq[]) d.clone();
    }
}
