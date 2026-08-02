package com.vk.im.reporters.api.util;

import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.reporters.api.channel.ChannelStubAttachesReporter;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.im.reporters.api.engine.LongPollExpiredReporter;
import com.vk.im.reporters.api.engine.LongPollHistoryReporter;
import com.vk.im.reporters.api.msg.MessagesEmptyHistoryMergeReporter;
import com.vk.im.reporters.api.msg.MessagesHistoryMergeReporter;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import xsna.asp;
import xsna.f5;
import xsna.x1b;
import xsna.xhz;
import xsna.zrp;

/* compiled from: PerformanceReporters.kt */
/* loaded from: classes2.dex */
public interface PerformanceReporters {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceReporters.kt */
    public static final class ChatType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChatType[] $VALUES;
        public static final ChatType CHAT;
        public static final ChatType GROUP_CHAT;

        static {
            ChatType chatType = new ChatType("CHAT", 0);
            CHAT = chatType;
            ChatType chatType2 = new ChatType("GROUP_CHAT", 1);
            GROUP_CHAT = chatType2;
            ChatType[] chatTypeArr = {chatType, chatType2};
            $VALUES = chatTypeArr;
            $ENTRIES = new asp(chatTypeArr);
        }

        public ChatType() {
            throw null;
        }

        public static ChatType valueOf(String str) {
            return (ChatType) Enum.valueOf(ChatType.class, str);
        }

        public static ChatType[] values() {
            return (ChatType[]) $VALUES.clone();
        }
    }

    xhz b();

    ChannelStubAttachesReporter c(String str);

    x1b d();

    MessagesHistoryMergeReporter e(String str, ReporterType reporterType, int i);

    OpenMessagesHistoryReporter f(String str);

    OpenChatListReporter g(String str);

    LongPollExpiredReporter h();

    OpenMessagesHistoryReporter i(String str, f5 f5Var);

    MessagesEmptyHistoryMergeReporter k(String str, ReporterType reporterType);

    OpenChatListReporter l(String str);

    LongPollHistoryReporter m(String str, ChatType chatType);
}
