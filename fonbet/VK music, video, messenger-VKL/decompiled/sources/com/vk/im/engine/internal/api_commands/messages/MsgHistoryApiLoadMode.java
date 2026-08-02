package com.vk.im.engine.internal.api_commands.messages;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MsgHistoryApiLoadMode.kt */
/* loaded from: classes2.dex */
public final class MsgHistoryApiLoadMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MsgHistoryApiLoadMode[] $VALUES;
    public static final MsgHistoryApiLoadMode AFTER;
    public static final MsgHistoryApiLoadMode AROUND;
    public static final MsgHistoryApiLoadMode BEFORE;

    static {
        MsgHistoryApiLoadMode msgHistoryApiLoadMode = new MsgHistoryApiLoadMode("BEFORE", 0);
        BEFORE = msgHistoryApiLoadMode;
        MsgHistoryApiLoadMode msgHistoryApiLoadMode2 = new MsgHistoryApiLoadMode("AFTER", 1);
        AFTER = msgHistoryApiLoadMode2;
        MsgHistoryApiLoadMode msgHistoryApiLoadMode3 = new MsgHistoryApiLoadMode("AROUND", 2);
        AROUND = msgHistoryApiLoadMode3;
        MsgHistoryApiLoadMode[] msgHistoryApiLoadModeArr = {msgHistoryApiLoadMode, msgHistoryApiLoadMode2, msgHistoryApiLoadMode3};
        $VALUES = msgHistoryApiLoadModeArr;
        $ENTRIES = new asp(msgHistoryApiLoadModeArr);
    }

    public MsgHistoryApiLoadMode() {
        throw null;
    }

    public static MsgHistoryApiLoadMode valueOf(String str) {
        return (MsgHistoryApiLoadMode) Enum.valueOf(MsgHistoryApiLoadMode.class, str);
    }

    public static MsgHistoryApiLoadMode[] values() {
        return (MsgHistoryApiLoadMode[]) $VALUES.clone();
    }
}
