package com.vk.ecomm.reviews.impl.replies.presentation.actionbuilder;

import xsna.asp;
import xsna.u60;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReplyActionsBuilder.kt */
/* loaded from: classes18.dex */
public final class ReplyAction implements u60 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReplyAction[] $VALUES;
    public static final ReplyAction REPLY_ACTION_COPY_TEXT;
    public static final ReplyAction REPLY_ACTION_DELETE;
    public static final ReplyAction REPLY_ACTION_EDIT;
    public static final ReplyAction REPLY_ACTION_REPLY;

    static {
        ReplyAction replyAction = new ReplyAction("REPLY_ACTION_REPLY", 0);
        REPLY_ACTION_REPLY = replyAction;
        ReplyAction replyAction2 = new ReplyAction("REPLY_ACTION_COPY_TEXT", 1);
        REPLY_ACTION_COPY_TEXT = replyAction2;
        ReplyAction replyAction3 = new ReplyAction("REPLY_ACTION_DELETE", 2);
        REPLY_ACTION_DELETE = replyAction3;
        ReplyAction replyAction4 = new ReplyAction("REPLY_ACTION_EDIT", 3);
        REPLY_ACTION_EDIT = replyAction4;
        ReplyAction[] replyActionArr = {replyAction, replyAction2, replyAction3, replyAction4};
        $VALUES = replyActionArr;
        $ENTRIES = new asp(replyActionArr);
    }

    public ReplyAction() {
        throw null;
    }

    public static ReplyAction valueOf(String str) {
        return (ReplyAction) Enum.valueOf(ReplyAction.class, str);
    }

    public static ReplyAction[] values() {
        return (ReplyAction[]) $VALUES.clone();
    }
}
