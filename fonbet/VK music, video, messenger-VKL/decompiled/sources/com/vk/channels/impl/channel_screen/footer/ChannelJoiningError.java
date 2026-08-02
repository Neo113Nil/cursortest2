package com.vk.channels.impl.channel_screen.footer;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelJoiningError.kt */
/* loaded from: classes16.dex */
public final class ChannelJoiningError {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelJoiningError[] $VALUES;
    public static final ChannelJoiningError ACCESS_DENIED;
    public static final ChannelJoiningError CHANNEL_NOT_FOUND;
    public static final ChannelJoiningError INVALID_INVITE_LINK;
    public static final ChannelJoiningError LIMITS;
    public static final ChannelJoiningError UNKNOWN;

    static {
        ChannelJoiningError channelJoiningError = new ChannelJoiningError("LIMITS", 0);
        LIMITS = channelJoiningError;
        ChannelJoiningError channelJoiningError2 = new ChannelJoiningError("ACCESS_DENIED", 1);
        ACCESS_DENIED = channelJoiningError2;
        ChannelJoiningError channelJoiningError3 = new ChannelJoiningError("INVALID_INVITE_LINK", 2);
        INVALID_INVITE_LINK = channelJoiningError3;
        ChannelJoiningError channelJoiningError4 = new ChannelJoiningError("CHANNEL_NOT_FOUND", 3);
        CHANNEL_NOT_FOUND = channelJoiningError4;
        ChannelJoiningError channelJoiningError5 = new ChannelJoiningError(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        UNKNOWN = channelJoiningError5;
        ChannelJoiningError[] channelJoiningErrorArr = {channelJoiningError, channelJoiningError2, channelJoiningError3, channelJoiningError4, channelJoiningError5};
        $VALUES = channelJoiningErrorArr;
        $ENTRIES = new asp(channelJoiningErrorArr);
    }

    public ChannelJoiningError() {
        throw null;
    }

    public static ChannelJoiningError valueOf(String str) {
        return (ChannelJoiningError) Enum.valueOf(ChannelJoiningError.class, str);
    }

    public static ChannelJoiningError[] values() {
        return (ChannelJoiningError[]) $VALUES.clone();
    }
}
