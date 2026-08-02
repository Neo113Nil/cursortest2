package com.vk.dto.messages;

import com.ironsource.Z3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageSource.kt */
/* loaded from: classes18.dex */
public final class MessageSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessageSource[] $VALUES;
    public static final MessageSource CHANNEL_EDIT_MESSAGE_FROM_LP;
    public static final MessageSource CHANNEL_GET;
    public static final MessageSource CHANNEL_GET_BY_ID;
    public static final MessageSource CHANNEL_GET_HISTORY;
    public static final MessageSource CHANNEL_JOIN;
    public static final MessageSource CHANNEL_LP_HISTORY;
    public static final MessageSource CHANNEL_LP_HISTORY_LAST_MESSAGE;
    public static final MessageSource CHANNEL_NEW_MESSAGE_FROM_LP;
    public static final MessageSource CHANNEL_PIN_MSGS;
    public static final MessageSource CHANNEL_PIN_MSG_FROM_LP;
    public static final MessageSource CHANNEL_RECOMMENDATIONS;
    public static final MessageSource CHANNEL_RESTORE_MESSAGE_FROM_LP;
    public static final MessageSource CHANNEL_SEARCH;
    public static final MessageSource CHANNEL_UNARCHIVE;
    public static final a Companion;
    public static final MessageSource DIFF_CONTENT_WARMUP;
    public static final MessageSource DIFF_CONTENT_WARMUP_LAST;
    public static final MessageSource DIFF_CONTENT_WARMUP_LAST_PUSH;
    public static final MessageSource DIFF_CONTENT_WARMUP_PUSH;
    public static final MessageSource DIFF_CONTENT_WARMUP_REACTION;
    public static final MessageSource DIFF_CONTENT_WARMUP_REACTION_PUSH;
    public static final MessageSource DIFF_CONTENT_WARMUP_READ;
    public static final MessageSource DIFF_CONTENT_WARMUP_READ_PUSH;
    public static final MessageSource DIFF_CONTENT_WARMUP_REPLY_MENTION;
    public static final MessageSource DIFF_CONTENT_WARMUP_REPLY_MENTION_PUSH;
    public static final MessageSource DIFF_LAST_MESSAGE;
    public static final MessageSource DIFF_LAST_MESSAGE_PUSH;
    public static final MessageSource EDIT_MESSAGE_FROM_LP;
    public static final MessageSource GET_BY_ID;
    public static final MessageSource GET_CONVERSATIONS;
    public static final MessageSource GET_HISTORY;
    public static final MessageSource IM_ITEMS;
    public static final MessageSource LP_HISTORY_EXT;
    public static final MessageSource MESSAGES_SEARCH;
    public static final MessageSource NEW_MESSAGE_FROM_LP;
    public static final MessageSource UNDEFINED;
    private final int id;

    /* compiled from: MessageSource.kt */
    public static final class a {
        public static MessageSource a(int i) {
            Object obj;
            Iterator<E> it = MessageSource.j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((MessageSource) obj).k() == i) {
                    break;
                }
            }
            MessageSource messageSource = (MessageSource) obj;
            return messageSource == null ? MessageSource.UNDEFINED : messageSource;
        }
    }

    /* compiled from: MessageSource.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageSource.values().length];
            try {
                iArr[MessageSource.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageSource.DIFF_LAST_MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageSource.DIFF_LAST_MESSAGE_PUSH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_PUSH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MessageSource.GET_HISTORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MessageSource.NEW_MESSAGE_FROM_LP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MessageSource.EDIT_MESSAGE_FROM_LP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MessageSource.GET_BY_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MessageSource.GET_CONVERSATIONS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MessageSource.LP_HISTORY_EXT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MessageSource.MESSAGES_SEARCH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_READ.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_REPLY_MENTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_REACTION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_LAST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_READ_PUSH.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_REPLY_MENTION_PUSH.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_REACTION_PUSH.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_LAST_PUSH.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[MessageSource.CHANNEL_GET_HISTORY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[MessageSource.CHANNEL_NEW_MESSAGE_FROM_LP.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[MessageSource.CHANNEL_EDIT_MESSAGE_FROM_LP.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[MessageSource.CHANNEL_RESTORE_MESSAGE_FROM_LP.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[MessageSource.CHANNEL_GET_BY_ID.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[MessageSource.CHANNEL_LP_HISTORY.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[MessageSource.CHANNEL_LP_HISTORY_LAST_MESSAGE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[MessageSource.CHANNEL_UNARCHIVE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[MessageSource.CHANNEL_SEARCH.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[MessageSource.CHANNEL_GET.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[MessageSource.CHANNEL_JOIN.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[MessageSource.CHANNEL_RECOMMENDATIONS.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[MessageSource.CHANNEL_PIN_MSG_FROM_LP.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[MessageSource.CHANNEL_PIN_MSGS.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[MessageSource.IM_ITEMS.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MessageSource messageSource = new MessageSource("UNDEFINED", 0, 0);
        UNDEFINED = messageSource;
        MessageSource messageSource2 = new MessageSource("DIFF_LAST_MESSAGE", 1, 1);
        DIFF_LAST_MESSAGE = messageSource2;
        MessageSource messageSource3 = new MessageSource("DIFF_CONTENT_WARMUP", 2, 2);
        DIFF_CONTENT_WARMUP = messageSource3;
        MessageSource messageSource4 = new MessageSource("GET_HISTORY", 3, 3);
        GET_HISTORY = messageSource4;
        MessageSource messageSource5 = new MessageSource("NEW_MESSAGE_FROM_LP", 4, 4);
        NEW_MESSAGE_FROM_LP = messageSource5;
        MessageSource messageSource6 = new MessageSource("EDIT_MESSAGE_FROM_LP", 5, 5);
        EDIT_MESSAGE_FROM_LP = messageSource6;
        MessageSource messageSource7 = new MessageSource("GET_BY_ID", 6, 6);
        GET_BY_ID = messageSource7;
        MessageSource messageSource8 = new MessageSource("GET_CONVERSATIONS", 7, 7);
        GET_CONVERSATIONS = messageSource8;
        MessageSource messageSource9 = new MessageSource("LP_HISTORY_EXT", 8, 8);
        LP_HISTORY_EXT = messageSource9;
        MessageSource messageSource10 = new MessageSource("MESSAGES_SEARCH", 9, 9);
        MESSAGES_SEARCH = messageSource10;
        MessageSource messageSource11 = new MessageSource("DIFF_LAST_MESSAGE_PUSH", 10, 10);
        DIFF_LAST_MESSAGE_PUSH = messageSource11;
        MessageSource messageSource12 = new MessageSource("DIFF_CONTENT_WARMUP_PUSH", 11, 11);
        DIFF_CONTENT_WARMUP_PUSH = messageSource12;
        MessageSource messageSource13 = new MessageSource("DIFF_CONTENT_WARMUP_READ", 12, 12);
        DIFF_CONTENT_WARMUP_READ = messageSource13;
        MessageSource messageSource14 = new MessageSource("DIFF_CONTENT_WARMUP_REPLY_MENTION", 13, 13);
        DIFF_CONTENT_WARMUP_REPLY_MENTION = messageSource14;
        MessageSource messageSource15 = new MessageSource("DIFF_CONTENT_WARMUP_REACTION", 14, 14);
        DIFF_CONTENT_WARMUP_REACTION = messageSource15;
        MessageSource messageSource16 = new MessageSource("DIFF_CONTENT_WARMUP_LAST", 15, 15);
        DIFF_CONTENT_WARMUP_LAST = messageSource16;
        MessageSource messageSource17 = new MessageSource("DIFF_CONTENT_WARMUP_READ_PUSH", 16, 16);
        DIFF_CONTENT_WARMUP_READ_PUSH = messageSource17;
        MessageSource messageSource18 = new MessageSource("DIFF_CONTENT_WARMUP_REPLY_MENTION_PUSH", 17, 17);
        DIFF_CONTENT_WARMUP_REPLY_MENTION_PUSH = messageSource18;
        MessageSource messageSource19 = new MessageSource("DIFF_CONTENT_WARMUP_REACTION_PUSH", 18, 18);
        DIFF_CONTENT_WARMUP_REACTION_PUSH = messageSource19;
        MessageSource messageSource20 = new MessageSource("DIFF_CONTENT_WARMUP_LAST_PUSH", 19, 19);
        DIFF_CONTENT_WARMUP_LAST_PUSH = messageSource20;
        MessageSource messageSource21 = new MessageSource("CHANNEL_GET_HISTORY", 20, 1001);
        CHANNEL_GET_HISTORY = messageSource21;
        MessageSource messageSource22 = new MessageSource("CHANNEL_NEW_MESSAGE_FROM_LP", 21, 1002);
        CHANNEL_NEW_MESSAGE_FROM_LP = messageSource22;
        MessageSource messageSource23 = new MessageSource("CHANNEL_EDIT_MESSAGE_FROM_LP", 22, 1003);
        CHANNEL_EDIT_MESSAGE_FROM_LP = messageSource23;
        MessageSource messageSource24 = new MessageSource("CHANNEL_RESTORE_MESSAGE_FROM_LP", 23, 1004);
        CHANNEL_RESTORE_MESSAGE_FROM_LP = messageSource24;
        MessageSource messageSource25 = new MessageSource("CHANNEL_GET_BY_ID", 24, 1005);
        CHANNEL_GET_BY_ID = messageSource25;
        MessageSource messageSource26 = new MessageSource("CHANNEL_LP_HISTORY", 25, 1006);
        CHANNEL_LP_HISTORY = messageSource26;
        MessageSource messageSource27 = new MessageSource("CHANNEL_LP_HISTORY_LAST_MESSAGE", 26, 1007);
        CHANNEL_LP_HISTORY_LAST_MESSAGE = messageSource27;
        MessageSource messageSource28 = new MessageSource("CHANNEL_UNARCHIVE", 27, 1008);
        CHANNEL_UNARCHIVE = messageSource28;
        MessageSource messageSource29 = new MessageSource("CHANNEL_SEARCH", 28, 1009);
        CHANNEL_SEARCH = messageSource29;
        MessageSource messageSource30 = new MessageSource("CHANNEL_GET", 29, 1010);
        CHANNEL_GET = messageSource30;
        MessageSource messageSource31 = new MessageSource("CHANNEL_JOIN", 30, 1011);
        CHANNEL_JOIN = messageSource31;
        MessageSource messageSource32 = new MessageSource("CHANNEL_RECOMMENDATIONS", 31, 1012);
        CHANNEL_RECOMMENDATIONS = messageSource32;
        MessageSource messageSource33 = new MessageSource("CHANNEL_PIN_MSG_FROM_LP", 32, Z3.i);
        CHANNEL_PIN_MSG_FROM_LP = messageSource33;
        MessageSource messageSource34 = new MessageSource("CHANNEL_PIN_MSGS", 33, Z3.j);
        CHANNEL_PIN_MSGS = messageSource34;
        MessageSource messageSource35 = new MessageSource("IM_ITEMS", 34, 1015);
        IM_ITEMS = messageSource35;
        MessageSource[] messageSourceArr = {messageSource, messageSource2, messageSource3, messageSource4, messageSource5, messageSource6, messageSource7, messageSource8, messageSource9, messageSource10, messageSource11, messageSource12, messageSource13, messageSource14, messageSource15, messageSource16, messageSource17, messageSource18, messageSource19, messageSource20, messageSource21, messageSource22, messageSource23, messageSource24, messageSource25, messageSource26, messageSource27, messageSource28, messageSource29, messageSource30, messageSource31, messageSource32, messageSource33, messageSource34, messageSource35};
        $VALUES = messageSourceArr;
        $ENTRIES = new asp(messageSourceArr);
        Companion = new a();
    }

    public MessageSource(String str, int i, int i2) {
        this.id = i2;
    }

    public static zrp<MessageSource> j() {
        return $ENTRIES;
    }

    public static MessageSource valueOf(String str) {
        return (MessageSource) Enum.valueOf(MessageSource.class, str);
    }

    public static MessageSource[] values() {
        return (MessageSource[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }

    public final String i() {
        switch (b.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return StringUtils.UNDEFINED;
            case 2:
                return "diff last";
            case 3:
                return "diff last push";
            case 4:
                return "diffCnt";
            case 5:
                return "diffCnt push";
            case 6:
                return "getHistory";
            case 7:
                return "lp add";
            case 8:
                return "lp edit";
            case 9:
                return "getById";
            case 10:
                return "getCnvrstns";
            case 11:
                return "lp history";
            case 12:
                return "search";
            case 13:
                return "diffCnt read";
            case 14:
                return "diffCnt rplmnt";
            case 15:
                return "diffCnt rct";
            case 16:
                return "diffCnt last";
            case 17:
                return "diffCnt read push";
            case 18:
                return "diffCnt rplmnt push";
            case 19:
                return "diffCnt rct push";
            case 20:
                return "diffCnt last push";
            case 21:
                return "getHistory";
            case 22:
                return "lp add";
            case 23:
                return "lp edit";
            case 24:
                return "lp restore";
            case 25:
                return "getById";
            case 26:
                return "lp history";
            case 27:
                return "lp history last";
            case 28:
                return "unarchive";
            case 29:
                return "search";
            case 30:
                return "get";
            case 31:
                return "join";
            case 32:
                return "recommendations";
            case 33:
                return "lp pin msg";
            case 34:
                return "getPinnedMessages";
            case 35:
                return "get items";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int k() {
        return this.id;
    }
}
