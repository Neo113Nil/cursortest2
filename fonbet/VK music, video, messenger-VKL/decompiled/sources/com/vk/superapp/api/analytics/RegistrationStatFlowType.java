package com.vk.superapp.api.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RegistrationStatFlowType.kt */
/* loaded from: classes11.dex */
public final class RegistrationStatFlowType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RegistrationStatFlowType[] $VALUES;
    public static final RegistrationStatFlowType AUTH_LK;
    public static final RegistrationStatFlowType AUTH_OLD;
    public static final RegistrationStatFlowType AUTH_SUB_APP;
    public static final RegistrationStatFlowType AUTH_WITHOUT_PASSWORD;
    public static final RegistrationStatFlowType TG_FLOW;
    private final String value;

    static {
        RegistrationStatFlowType registrationStatFlowType = new RegistrationStatFlowType("AUTH_LK", 0, "auth_lk");
        AUTH_LK = registrationStatFlowType;
        RegistrationStatFlowType registrationStatFlowType2 = new RegistrationStatFlowType("AUTH_SUB_APP", 1, "auth_subapp");
        AUTH_SUB_APP = registrationStatFlowType2;
        RegistrationStatFlowType registrationStatFlowType3 = new RegistrationStatFlowType("AUTH_WITHOUT_PASSWORD", 2, "auth_without_password");
        AUTH_WITHOUT_PASSWORD = registrationStatFlowType3;
        RegistrationStatFlowType registrationStatFlowType4 = new RegistrationStatFlowType("AUTH_OLD", 3, "auth_old");
        AUTH_OLD = registrationStatFlowType4;
        RegistrationStatFlowType registrationStatFlowType5 = new RegistrationStatFlowType("TG_FLOW", 4, "tg_flow");
        TG_FLOW = registrationStatFlowType5;
        RegistrationStatFlowType[] registrationStatFlowTypeArr = {registrationStatFlowType, registrationStatFlowType2, registrationStatFlowType3, registrationStatFlowType4, registrationStatFlowType5};
        $VALUES = registrationStatFlowTypeArr;
        $ENTRIES = new asp(registrationStatFlowTypeArr);
    }

    public RegistrationStatFlowType(String str, int i, String str2) {
        this.value = str2;
    }

    public static RegistrationStatFlowType valueOf(String str) {
        return (RegistrationStatFlowType) Enum.valueOf(RegistrationStatFlowType.class, str);
    }

    public static RegistrationStatFlowType[] values() {
        return (RegistrationStatFlowType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
