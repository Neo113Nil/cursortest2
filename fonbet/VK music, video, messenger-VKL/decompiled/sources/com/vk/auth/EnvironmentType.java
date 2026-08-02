package com.vk.auth;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EnvironmentType.kt */
/* loaded from: classes15.dex */
public final class EnvironmentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EnvironmentType[] $VALUES;
    public static final EnvironmentType DEVELOPMENT;
    public static final EnvironmentType PRODUCTION;
    public static final EnvironmentType TESTING;
    private final String value;

    static {
        EnvironmentType environmentType = new EnvironmentType("DEVELOPMENT", 0, "development");
        DEVELOPMENT = environmentType;
        EnvironmentType environmentType2 = new EnvironmentType("PRODUCTION", 1, "production");
        PRODUCTION = environmentType2;
        EnvironmentType environmentType3 = new EnvironmentType("TESTING", 2, "testing");
        TESTING = environmentType3;
        EnvironmentType[] environmentTypeArr = {environmentType, environmentType2, environmentType3};
        $VALUES = environmentTypeArr;
        $ENTRIES = new asp(environmentTypeArr);
    }

    public EnvironmentType(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnvironmentType valueOf(String str) {
        return (EnvironmentType) Enum.valueOf(EnvironmentType.class, str);
    }

    public static EnvironmentType[] values() {
        return (EnvironmentType[]) $VALUES.clone();
    }
}
