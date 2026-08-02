package com.vk.im.engine.internal.storage.delegates.channel_messages;

import xsna.asp;
import xsna.qgl0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelMessageHistoryMetaColumn.kt */
/* loaded from: classes2.dex */
public final class ChannelMessageHistoryMetaColumn implements qgl0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelMessageHistoryMetaColumn[] $VALUES;
    public static final ChannelMessageHistoryMetaColumn CHANNEL_ID;
    public static final a Companion;
    public static final ChannelMessageHistoryMetaColumn SERVER_IS_EMPTY_PHASE;
    public static final ChannelMessageHistoryMetaColumn SERVER_IS_EMPTY_VALUE;
    private static final ChannelMessageHistoryMetaColumn[] allColumns;
    private final String key;

    /* compiled from: ChannelMessageHistoryMetaColumn.kt */
    public static final class a {
    }

    static {
        ChannelMessageHistoryMetaColumn channelMessageHistoryMetaColumn = new ChannelMessageHistoryMetaColumn("CHANNEL_ID", 0, "channel_id");
        CHANNEL_ID = channelMessageHistoryMetaColumn;
        ChannelMessageHistoryMetaColumn channelMessageHistoryMetaColumn2 = new ChannelMessageHistoryMetaColumn("SERVER_IS_EMPTY_VALUE", 1, "server_is_empty_value");
        SERVER_IS_EMPTY_VALUE = channelMessageHistoryMetaColumn2;
        ChannelMessageHistoryMetaColumn channelMessageHistoryMetaColumn3 = new ChannelMessageHistoryMetaColumn("SERVER_IS_EMPTY_PHASE", 2, "server_is_empty_phase");
        SERVER_IS_EMPTY_PHASE = channelMessageHistoryMetaColumn3;
        ChannelMessageHistoryMetaColumn[] channelMessageHistoryMetaColumnArr = {channelMessageHistoryMetaColumn, channelMessageHistoryMetaColumn2, channelMessageHistoryMetaColumn3};
        $VALUES = channelMessageHistoryMetaColumnArr;
        $ENTRIES = new asp(channelMessageHistoryMetaColumnArr);
        Companion = new a();
        allColumns = values();
    }

    public ChannelMessageHistoryMetaColumn(String str, int i, String str2) {
        this.key = str2;
    }

    public static ChannelMessageHistoryMetaColumn valueOf(String str) {
        return (ChannelMessageHistoryMetaColumn) Enum.valueOf(ChannelMessageHistoryMetaColumn.class, str);
    }

    public static ChannelMessageHistoryMetaColumn[] values() {
        return (ChannelMessageHistoryMetaColumn[]) $VALUES.clone();
    }

    @Override // xsna.qgl0
    public final String getKey() {
        return this.key;
    }
}
