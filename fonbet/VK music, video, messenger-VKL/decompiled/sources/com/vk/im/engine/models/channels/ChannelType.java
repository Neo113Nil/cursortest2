package com.vk.im.engine.models.channels;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelType.kt */
/* loaded from: classes2.dex */
public final class ChannelType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelType[] $VALUES;
    public static final ChannelType CHANNEL;
    public static final ChannelType COMMUNITY_CHANNEL;
    public static final a Companion;
    public static final ChannelType EDU_CHANNEL;
    public static final ChannelType GROUP;
    public static final ChannelType PERSONAL_CHANNEL;
    private final String value;

    /* compiled from: ChannelType.kt */
    public static final class a {
        public static ChannelType a(String str) {
            if (str == null) {
                return null;
            }
            for (ChannelType channelType : ChannelType.values()) {
                if (epx.f(channelType.i(), str)) {
                    return channelType;
                }
            }
            return null;
        }
    }

    static {
        ChannelType channelType = new ChannelType("CHANNEL", 0, "channel");
        CHANNEL = channelType;
        ChannelType channelType2 = new ChannelType("EDU_CHANNEL", 1, "edu_channel");
        EDU_CHANNEL = channelType2;
        ChannelType channelType3 = new ChannelType("GROUP", 2, "group");
        GROUP = channelType3;
        ChannelType channelType4 = new ChannelType("COMMUNITY_CHANNEL", 3, "community_channel");
        COMMUNITY_CHANNEL = channelType4;
        ChannelType channelType5 = new ChannelType("PERSONAL_CHANNEL", 4, "personal_channel");
        PERSONAL_CHANNEL = channelType5;
        ChannelType[] channelTypeArr = {channelType, channelType2, channelType3, channelType4, channelType5};
        $VALUES = channelTypeArr;
        $ENTRIES = new asp(channelTypeArr);
        Companion = new a();
    }

    public ChannelType(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<ChannelType> h() {
        return $ENTRIES;
    }

    public static ChannelType valueOf(String str) {
        return (ChannelType) Enum.valueOf(ChannelType.class, str);
    }

    public static ChannelType[] values() {
        return (ChannelType[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
