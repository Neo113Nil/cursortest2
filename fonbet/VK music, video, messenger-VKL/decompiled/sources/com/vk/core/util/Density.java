package com.vk.core.util;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Density.kt */
/* loaded from: classes17.dex */
public final class Density {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Density[] $VALUES;
    public static final a Companion;
    public static final Density HDPI;
    public static final Density LDPI;
    public static final Density MDPI;
    public static final Density XHDPI;
    public static final Density XXHDPI;
    public static final Density XXXHDPI;
    private final float boundaryValue;
    private final String densityName;

    /* compiled from: Density.kt */
    public static final class a {
    }

    static {
        Density density = new Density("XXXHDPI", 0, "xxxhdpi", 4.0f);
        XXXHDPI = density;
        Density density2 = new Density("XXHDPI", 1, "xxhdpi", 3.0f);
        XXHDPI = density2;
        Density density3 = new Density("XHDPI", 2, "xhdpi", 2.0f);
        XHDPI = density3;
        Density density4 = new Density("HDPI", 3, "hdpi", 1.5f);
        HDPI = density4;
        Density density5 = new Density("MDPI", 4, "mdpi", 1.0f);
        MDPI = density5;
        Density density6 = new Density("LDPI", 5, "ldpi", 0.75f);
        LDPI = density6;
        Density[] densityArr = {density, density2, density3, density4, density5, density6};
        $VALUES = densityArr;
        $ENTRIES = new asp(densityArr);
        Companion = new a();
    }

    public Density(String str, int i, String str2, float f) {
        this.densityName = str2;
        this.boundaryValue = f;
    }

    public static Density valueOf(String str) {
        return (Density) Enum.valueOf(Density.class, str);
    }

    public static Density[] values() {
        return (Density[]) $VALUES.clone();
    }

    public final float h() {
        return this.boundaryValue;
    }

    public final String i() {
        return this.densityName;
    }
}
