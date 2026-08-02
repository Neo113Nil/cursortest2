package com.vk.im.engine.models;

import ru.ok.android.api.methods.users.changePassword.ChangePasswordApiRequestV1;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EngineInvalidateSource.kt */
/* loaded from: classes.dex */
public final class EngineInvalidateSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EngineInvalidateSource[] $VALUES;
    public static final EngineInvalidateSource LOGIN;
    public static final EngineInvalidateSource LOGOUT;
    public static final EngineInvalidateSource RECOVERING;
    public static final EngineInvalidateSource START;
    public static final EngineInvalidateSource UPDATE_COMMUNITY;
    public static final EngineInvalidateSource UPDATE_CREDENTIALS;
    private final String value;

    static {
        EngineInvalidateSource engineInvalidateSource = new EngineInvalidateSource("START", 0, "start");
        START = engineInvalidateSource;
        EngineInvalidateSource engineInvalidateSource2 = new EngineInvalidateSource("LOGIN", 1, "login");
        LOGIN = engineInvalidateSource2;
        EngineInvalidateSource engineInvalidateSource3 = new EngineInvalidateSource("LOGOUT", 2, ChangePasswordApiRequestV1.PARAM_NAME_LOGOUT_ALL);
        LOGOUT = engineInvalidateSource3;
        EngineInvalidateSource engineInvalidateSource4 = new EngineInvalidateSource("UPDATE_CREDENTIALS", 3, "update_credentials");
        UPDATE_CREDENTIALS = engineInvalidateSource4;
        EngineInvalidateSource engineInvalidateSource5 = new EngineInvalidateSource("UPDATE_COMMUNITY", 4, "update_community_id");
        UPDATE_COMMUNITY = engineInvalidateSource5;
        EngineInvalidateSource engineInvalidateSource6 = new EngineInvalidateSource("RECOVERING", 5, "recovering");
        RECOVERING = engineInvalidateSource6;
        EngineInvalidateSource[] engineInvalidateSourceArr = {engineInvalidateSource, engineInvalidateSource2, engineInvalidateSource3, engineInvalidateSource4, engineInvalidateSource5, engineInvalidateSource6};
        $VALUES = engineInvalidateSourceArr;
        $ENTRIES = new asp(engineInvalidateSourceArr);
    }

    public EngineInvalidateSource(String str, int i, String str2) {
        this.value = str2;
    }

    public static EngineInvalidateSource valueOf(String str) {
        return (EngineInvalidateSource) Enum.valueOf(EngineInvalidateSource.class, str);
    }

    public static EngineInvalidateSource[] values() {
        return (EngineInvalidateSource[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
