package com.vk.core.native_loader;

import com.facebook.soloader.MinElf;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.hihealth.data.DeviceInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CpuType.kt */
/* loaded from: classes.dex */
public final class CpuType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CpuType[] $VALUES;
    public static final CpuType ARM;
    public static final a Companion;
    public static final CpuType UNKNOWN;
    public static final CpuType X86;
    public static final CpuType X86_64;
    private final String processorName;

    /* compiled from: CpuType.kt */
    public static final class a {
    }

    static {
        CpuType cpuType = new CpuType("X86", 0, MinElf.ISA.X86);
        X86 = cpuType;
        CpuType cpuType2 = new CpuType("ARM", 1, "arm");
        ARM = cpuType2;
        CpuType cpuType3 = new CpuType("X86_64", 2, MinElf.ISA.X86_64);
        X86_64 = cpuType3;
        CpuType cpuType4 = new CpuType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, DeviceInfo.STR_TYPE_UNKNOWN);
        UNKNOWN = cpuType4;
        CpuType[] cpuTypeArr = {cpuType, cpuType2, cpuType3, cpuType4};
        $VALUES = cpuTypeArr;
        $ENTRIES = new asp(cpuTypeArr);
        Companion = new a();
    }

    public CpuType(String str, int i, String str2) {
        this.processorName = str2;
    }

    public static CpuType valueOf(String str) {
        return (CpuType) Enum.valueOf(CpuType.class, str);
    }

    public static CpuType[] values() {
        return (CpuType[]) $VALUES.clone();
    }

    public final String h() {
        return this.processorName;
    }
}
