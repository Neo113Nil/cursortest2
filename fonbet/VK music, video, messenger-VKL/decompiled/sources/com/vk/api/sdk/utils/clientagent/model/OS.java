package com.vk.api.sdk.utils.clientagent.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OS.kt */
/* loaded from: classes.dex */
public final class OS {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OS[] $VALUES;
    public static final OS ANDROID;
    public static final OS HARMONY;
    public static final OS IOS;
    public static final OS IPADOS;
    public static final OS TVOS;
    private final String serializedName;

    static {
        OS os = new OS("ANDROID", 0, "android");
        ANDROID = os;
        OS os2 = new OS("IOS", 1, "ios");
        IOS = os2;
        OS os3 = new OS("HARMONY", 2, "harmony");
        HARMONY = os3;
        OS os4 = new OS("TVOS", 3, "tvos");
        TVOS = os4;
        OS os5 = new OS("IPADOS", 4, "ipados");
        IPADOS = os5;
        OS[] osArr = {os, os2, os3, os4, os5};
        $VALUES = osArr;
        $ENTRIES = new asp(osArr);
    }

    public OS(String str, int i, String str2) {
        this.serializedName = str2;
    }

    public static OS valueOf(String str) {
        return (OS) Enum.valueOf(OS.class, str);
    }

    public static OS[] values() {
        return (OS[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serializedName;
    }
}
