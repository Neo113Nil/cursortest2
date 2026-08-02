package com.vk.core.dynamic_loader;

import com.ironsource.Hb;
import xsna.asp;
import xsna.hpo;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DynamicLib.kt */
/* loaded from: classes.dex */
public final class DynamicLib {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DynamicLib[] $VALUES;
    public static final DynamicLib APPLOVIN;
    public static final DynamicLib FILTERS;
    public static final DynamicLib GL_EFFECTS;
    public static final DynamicLib LIVES_PUBLISHER;
    public static final DynamicLib LUTS;
    public static final DynamicLib OPENCV;
    public static final DynamicLib TENSORFLOW;
    private final hpo entryPoint;
    private final String libName;

    static {
        DynamicLib dynamicLib = new DynamicLib("GL_EFFECTS", 0, "gleffects");
        GL_EFFECTS = dynamicLib;
        DynamicLib dynamicLib2 = new DynamicLib("OPENCV", 1, "opencv");
        OPENCV = dynamicLib2;
        DynamicLib dynamicLib3 = new DynamicLib("TENSORFLOW", 2, "tensorflow");
        TENSORFLOW = dynamicLib3;
        DynamicLib dynamicLib4 = new DynamicLib("FILTERS", 3, "clipsfilters");
        FILTERS = dynamicLib4;
        DynamicLib dynamicLib5 = new DynamicLib("LIVES_PUBLISHER", 4, Hb.b);
        LIVES_PUBLISHER = dynamicLib5;
        DynamicLib dynamicLib6 = new DynamicLib("LUTS", 5, "luts");
        LUTS = dynamicLib6;
        DynamicLib dynamicLib7 = new DynamicLib("APPLOVIN", 6, "applovinads");
        APPLOVIN = dynamicLib7;
        DynamicLib[] dynamicLibArr = {dynamicLib, dynamicLib2, dynamicLib3, dynamicLib4, dynamicLib5, dynamicLib6, dynamicLib7};
        $VALUES = dynamicLibArr;
        $ENTRIES = new asp(dynamicLibArr);
    }

    public DynamicLib() {
        throw null;
    }

    public DynamicLib(String str, int i, String str2) {
        this.libName = str2;
    }

    public static zrp<DynamicLib> h() {
        return $ENTRIES;
    }

    public static DynamicLib valueOf(String str) {
        return (DynamicLib) Enum.valueOf(DynamicLib.class, str);
    }

    public static DynamicLib[] values() {
        return (DynamicLib[]) $VALUES.clone();
    }

    public final String i() {
        return this.libName;
    }
}
