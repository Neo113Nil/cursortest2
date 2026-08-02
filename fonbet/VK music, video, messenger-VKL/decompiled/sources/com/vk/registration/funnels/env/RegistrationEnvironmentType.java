package com.vk.registration.funnels.env;

import com.ironsource.B5;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RegistrationEnvironmentType.kt */
/* loaded from: classes.dex */
public final class RegistrationEnvironmentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RegistrationEnvironmentType[] $VALUES;
    public static final RegistrationEnvironmentType DEV;
    public static final RegistrationEnvironmentType RELEASE;
    public static final RegistrationEnvironmentType TEST;
    private final String value;

    static {
        RegistrationEnvironmentType registrationEnvironmentType = new RegistrationEnvironmentType("DEV", 0, "dev");
        DEV = registrationEnvironmentType;
        RegistrationEnvironmentType registrationEnvironmentType2 = new RegistrationEnvironmentType("RELEASE", 1, B5.t);
        RELEASE = registrationEnvironmentType2;
        RegistrationEnvironmentType registrationEnvironmentType3 = new RegistrationEnvironmentType("TEST", 2, LoginRequest.CLIENT_NAME);
        TEST = registrationEnvironmentType3;
        RegistrationEnvironmentType[] registrationEnvironmentTypeArr = {registrationEnvironmentType, registrationEnvironmentType2, registrationEnvironmentType3};
        $VALUES = registrationEnvironmentTypeArr;
        $ENTRIES = new asp(registrationEnvironmentTypeArr);
    }

    public RegistrationEnvironmentType(String str, int i, String str2) {
        this.value = str2;
    }

    public static RegistrationEnvironmentType valueOf(String str) {
        return (RegistrationEnvironmentType) Enum.valueOf(RegistrationEnvironmentType.class, str);
    }

    public static RegistrationEnvironmentType[] values() {
        return (RegistrationEnvironmentType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
