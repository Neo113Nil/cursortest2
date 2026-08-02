package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzict {
    public static final zzict a;
    public static final zzict b;
    public static final /* synthetic */ zzict[] c;

    static {
        zzict zzictVar = new zzict("LENIENT", 0);
        a = zzictVar;
        zzict zzictVar2 = new zzict("LEGACY_STRICT", 1);
        b = zzictVar2;
        c = new zzict[]{zzictVar, zzictVar2, new zzict("STRICT", 2)};
    }

    public static zzict[] values() {
        return (zzict[]) c.clone();
    }
}
