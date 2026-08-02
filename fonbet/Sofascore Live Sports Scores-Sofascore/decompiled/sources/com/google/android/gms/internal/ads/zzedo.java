package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzedo {
    public static final zzedo a;
    public static final zzedo b;
    public static final zzedo c;
    public static final zzedo d;
    public static final /* synthetic */ zzedo[] e;

    static {
        zzedo zzedoVar = new zzedo("UNKNOWN", 0);
        a = zzedoVar;
        zzedo zzedoVar2 = new zzedo("API", 1);
        b = zzedoVar2;
        zzedo zzedoVar3 = new zzedo("GESTURE", 2);
        c = zzedoVar3;
        zzedo zzedoVar4 = new zzedo("DEBUG_MENU", 3);
        d = zzedoVar4;
        e = new zzedo[]{zzedoVar, zzedoVar2, zzedoVar3, zzedoVar4};
    }

    public static zzedo[] values() {
        return (zzedo[]) e.clone();
    }
}
