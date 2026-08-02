package com.vk.superapp.multiaccount.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SessionUnavailableType.kt */
/* loaded from: classes6.dex */
public final class SessionUnavailableType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SessionUnavailableType[] $VALUES;
    public static final SessionUnavailableType BANNED;
    public static final SessionUnavailableType DEACTIVATED;
    public static final SessionUnavailableType VALIDATION_REQUIRED;

    static {
        SessionUnavailableType sessionUnavailableType = new SessionUnavailableType("VALIDATION_REQUIRED", 0);
        VALIDATION_REQUIRED = sessionUnavailableType;
        SessionUnavailableType sessionUnavailableType2 = new SessionUnavailableType("BANNED", 1);
        BANNED = sessionUnavailableType2;
        SessionUnavailableType sessionUnavailableType3 = new SessionUnavailableType("DEACTIVATED", 2);
        DEACTIVATED = sessionUnavailableType3;
        SessionUnavailableType[] sessionUnavailableTypeArr = {sessionUnavailableType, sessionUnavailableType2, sessionUnavailableType3};
        $VALUES = sessionUnavailableTypeArr;
        $ENTRIES = new asp(sessionUnavailableTypeArr);
    }

    public SessionUnavailableType() {
        throw null;
    }

    public static SessionUnavailableType valueOf(String str) {
        return (SessionUnavailableType) Enum.valueOf(SessionUnavailableType.class, str);
    }

    public static SessionUnavailableType[] values() {
        return (SessionUnavailableType[]) $VALUES.clone();
    }
}
