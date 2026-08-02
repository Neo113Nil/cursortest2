package com.vk.dto.messages;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HistoryAttachAction.kt */
/* loaded from: classes18.dex */
public final class HistoryAttachAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HistoryAttachAction[] $VALUES;
    public static final HistoryAttachAction ADD;
    public static final HistoryAttachAction ADD_TO_ALBUM;
    public static final HistoryAttachAction COPY_LINK;
    public static final HistoryAttachAction DELETE;
    public static final HistoryAttachAction GO_TO_MSG;
    public static final HistoryAttachAction SAVE_TO_GALLERY;
    public static final HistoryAttachAction SHARE;

    static {
        HistoryAttachAction historyAttachAction = new HistoryAttachAction("GO_TO_MSG", 0);
        GO_TO_MSG = historyAttachAction;
        HistoryAttachAction historyAttachAction2 = new HistoryAttachAction("SHARE", 1);
        SHARE = historyAttachAction2;
        HistoryAttachAction historyAttachAction3 = new HistoryAttachAction("COPY_LINK", 2);
        COPY_LINK = historyAttachAction3;
        HistoryAttachAction historyAttachAction4 = new HistoryAttachAction("SAVE_TO_GALLERY", 3);
        SAVE_TO_GALLERY = historyAttachAction4;
        HistoryAttachAction historyAttachAction5 = new HistoryAttachAction("ADD", 4);
        ADD = historyAttachAction5;
        HistoryAttachAction historyAttachAction6 = new HistoryAttachAction("ADD_TO_ALBUM", 5);
        ADD_TO_ALBUM = historyAttachAction6;
        HistoryAttachAction historyAttachAction7 = new HistoryAttachAction("DELETE", 6);
        DELETE = historyAttachAction7;
        HistoryAttachAction[] historyAttachActionArr = {historyAttachAction, historyAttachAction2, historyAttachAction3, historyAttachAction4, historyAttachAction5, historyAttachAction6, historyAttachAction7};
        $VALUES = historyAttachActionArr;
        $ENTRIES = new asp(historyAttachActionArr);
    }

    public HistoryAttachAction() {
        throw null;
    }

    public static HistoryAttachAction valueOf(String str) {
        return (HistoryAttachAction) Enum.valueOf(HistoryAttachAction.class, str);
    }

    public static HistoryAttachAction[] values() {
        return (HistoryAttachAction[]) $VALUES.clone();
    }
}
