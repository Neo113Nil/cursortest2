package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EcosystemViewConfigurationTypeEnum.kt */
/* loaded from: classes6.dex */
public final class EcosystemViewConfigurationTypeEnum {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EcosystemViewConfigurationTypeEnum[] $VALUES;
    public static final EcosystemViewConfigurationTypeEnum DEFAULT;
    public static final EcosystemViewConfigurationTypeEnum LOGOUT_BUTTON_HIDE;

    static {
        EcosystemViewConfigurationTypeEnum ecosystemViewConfigurationTypeEnum = new EcosystemViewConfigurationTypeEnum("DEFAULT", 0);
        DEFAULT = ecosystemViewConfigurationTypeEnum;
        EcosystemViewConfigurationTypeEnum ecosystemViewConfigurationTypeEnum2 = new EcosystemViewConfigurationTypeEnum("LOGOUT_BUTTON_HIDE", 1);
        LOGOUT_BUTTON_HIDE = ecosystemViewConfigurationTypeEnum2;
        EcosystemViewConfigurationTypeEnum[] ecosystemViewConfigurationTypeEnumArr = {ecosystemViewConfigurationTypeEnum, ecosystemViewConfigurationTypeEnum2};
        $VALUES = ecosystemViewConfigurationTypeEnumArr;
        $ENTRIES = new asp(ecosystemViewConfigurationTypeEnumArr);
    }

    public EcosystemViewConfigurationTypeEnum() {
        throw null;
    }

    public static zrp<EcosystemViewConfigurationTypeEnum> h() {
        return $ENTRIES;
    }

    public static EcosystemViewConfigurationTypeEnum valueOf(String str) {
        return (EcosystemViewConfigurationTypeEnum) Enum.valueOf(EcosystemViewConfigurationTypeEnum.class, str);
    }

    public static EcosystemViewConfigurationTypeEnum[] values() {
        return (EcosystemViewConfigurationTypeEnum[]) $VALUES.clone();
    }
}
