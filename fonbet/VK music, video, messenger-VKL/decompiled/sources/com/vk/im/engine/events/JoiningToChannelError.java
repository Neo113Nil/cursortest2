package com.vk.im.engine.events;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnJoiningToChannelErrorEvent.kt */
/* loaded from: classes2.dex */
public final class JoiningToChannelError {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ JoiningToChannelError[] $VALUES;
    public static final JoiningToChannelError ACCESS_DENIED;
    public static final JoiningToChannelError CHANNEL_NOT_FOUND;
    public static final JoiningToChannelError INVALID_INVITE_LINK;
    public static final JoiningToChannelError LIMITS;
    public static final JoiningToChannelError UNKNOWN;

    static {
        JoiningToChannelError joiningToChannelError = new JoiningToChannelError("LIMITS", 0);
        LIMITS = joiningToChannelError;
        JoiningToChannelError joiningToChannelError2 = new JoiningToChannelError("ACCESS_DENIED", 1);
        ACCESS_DENIED = joiningToChannelError2;
        JoiningToChannelError joiningToChannelError3 = new JoiningToChannelError("CHANNEL_NOT_FOUND", 2);
        CHANNEL_NOT_FOUND = joiningToChannelError3;
        JoiningToChannelError joiningToChannelError4 = new JoiningToChannelError("INVALID_INVITE_LINK", 3);
        INVALID_INVITE_LINK = joiningToChannelError4;
        JoiningToChannelError joiningToChannelError5 = new JoiningToChannelError(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        UNKNOWN = joiningToChannelError5;
        JoiningToChannelError[] joiningToChannelErrorArr = {joiningToChannelError, joiningToChannelError2, joiningToChannelError3, joiningToChannelError4, joiningToChannelError5};
        $VALUES = joiningToChannelErrorArr;
        $ENTRIES = new asp(joiningToChannelErrorArr);
    }

    public JoiningToChannelError() {
        throw null;
    }

    public static JoiningToChannelError valueOf(String str) {
        return (JoiningToChannelError) Enum.valueOf(JoiningToChannelError.class, str);
    }

    public static JoiningToChannelError[] values() {
        return (JoiningToChannelError[]) $VALUES.clone();
    }
}
