package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class y {
    public static final a a;
    public static final y b;
    public static final y c;
    public static final y d;
    public static final /* synthetic */ y[] e;

    static {
        y yVar = new y("Portrait", 0);
        b = yVar;
        y yVar2 = new y("Landscape", 1);
        c = yVar2;
        y yVar3 = new y("None", 2);
        d = yVar3;
        e = new y[]{yVar, yVar2, yVar3};
        a = new a();
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) e.clone();
    }
}
