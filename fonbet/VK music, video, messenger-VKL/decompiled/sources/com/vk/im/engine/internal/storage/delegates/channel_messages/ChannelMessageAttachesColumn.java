package com.vk.im.engine.internal.storage.delegates.channel_messages;

import xsna.asp;
import xsna.qgl0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelMessageAttachesColumn.kt */
/* loaded from: classes2.dex */
public final class ChannelMessageAttachesColumn implements qgl0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelMessageAttachesColumn[] $VALUES;
    public static final ChannelMessageAttachesColumn ATTACH_LOCAL_ID;
    public static final ChannelMessageAttachesColumn CHANNEL_ID;
    public static final ChannelMessageAttachesColumn CONTENT_ID;
    public static final ChannelMessageAttachesColumn CONTENT_OWNER_ID;
    public static final ChannelMessageAttachesColumn CONTENT_TYPE;
    public static final a Companion;
    public static final ChannelMessageAttachesColumn MSG_LOCAL_ID;
    public static final ChannelMessageAttachesColumn MV_CNV_MSG_ID;
    private static final ChannelMessageAttachesColumn[] allColumns;
    private final String key;

    /* compiled from: ChannelMessageAttachesColumn.kt */
    public static final class a {
    }

    static {
        ChannelMessageAttachesColumn channelMessageAttachesColumn = new ChannelMessageAttachesColumn("MSG_LOCAL_ID", 0, "msg_local_id");
        MSG_LOCAL_ID = channelMessageAttachesColumn;
        ChannelMessageAttachesColumn channelMessageAttachesColumn2 = new ChannelMessageAttachesColumn("ATTACH_LOCAL_ID", 1, "attach_local_id");
        ATTACH_LOCAL_ID = channelMessageAttachesColumn2;
        ChannelMessageAttachesColumn channelMessageAttachesColumn3 = new ChannelMessageAttachesColumn("CONTENT_TYPE", 2, "content_type");
        CONTENT_TYPE = channelMessageAttachesColumn3;
        ChannelMessageAttachesColumn channelMessageAttachesColumn4 = new ChannelMessageAttachesColumn("CONTENT_ID", 3, "content_id");
        CONTENT_ID = channelMessageAttachesColumn4;
        ChannelMessageAttachesColumn channelMessageAttachesColumn5 = new ChannelMessageAttachesColumn("CONTENT_OWNER_ID", 4, "content_owner_id");
        CONTENT_OWNER_ID = channelMessageAttachesColumn5;
        ChannelMessageAttachesColumn channelMessageAttachesColumn6 = new ChannelMessageAttachesColumn("CHANNEL_ID", 5, "channel_id");
        CHANNEL_ID = channelMessageAttachesColumn6;
        ChannelMessageAttachesColumn channelMessageAttachesColumn7 = new ChannelMessageAttachesColumn("MV_CNV_MSG_ID", 6, "mv_cnv_msg_id");
        MV_CNV_MSG_ID = channelMessageAttachesColumn7;
        ChannelMessageAttachesColumn[] channelMessageAttachesColumnArr = {channelMessageAttachesColumn, channelMessageAttachesColumn2, channelMessageAttachesColumn3, channelMessageAttachesColumn4, channelMessageAttachesColumn5, channelMessageAttachesColumn6, channelMessageAttachesColumn7};
        $VALUES = channelMessageAttachesColumnArr;
        $ENTRIES = new asp(channelMessageAttachesColumnArr);
        Companion = new a();
        allColumns = values();
    }

    public ChannelMessageAttachesColumn(String str, int i, String str2) {
        this.key = str2;
    }

    public static ChannelMessageAttachesColumn valueOf(String str) {
        return (ChannelMessageAttachesColumn) Enum.valueOf(ChannelMessageAttachesColumn.class, str);
    }

    public static ChannelMessageAttachesColumn[] values() {
        return (ChannelMessageAttachesColumn[]) $VALUES.clone();
    }

    @Override // xsna.qgl0
    public final String getKey() {
        return this.key;
    }

    public final int i() {
        return ordinal() + 1;
    }
}
