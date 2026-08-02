package com.vk.im.reporters.api.engine;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.eik0;
import xsna.mdz;
import xsna.zrp;

/* compiled from: LongPollHistoryReporter.kt */
/* loaded from: classes2.dex */
public interface LongPollHistoryReporter extends eik0<mdz<Span>, Object> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LongPollHistoryReporter.kt */
    public static final class Span {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Span[] $VALUES;
        public static final Span BUILD_TASKS;
        public static final Span MISSED_CHANNELS;
        public static final Span MISSED_CHANNELS_COUNTERS;
        public static final Span MISSED_CHANNELS_MESSAGES;
        public static final Span MISSED_CHAT_INFOS;
        public static final Span MISSED_CONTACTS;
        public static final Span MISSED_CONVERSATIONS;
        public static final Span MISSED_EMAILS;
        public static final Span MISSED_FOLDERS;
        public static final Span MISSED_GROUPS;
        public static final Span MISSED_INCOGNITOS;
        public static final Span MISSED_MESSAGES;
        public static final Span MISSED_TOTAL;
        public static final Span MISSED_USERS;
        public static final Span NOTIFY_ENVIRONMENT;
        public static final Span PREPARE_TASKS;
        public static final Span REQUEST;
        public static final Span ROOT;
        public static final Span SYNC_CHANGES;
        public static final Span UPDATE_TIME;
        private final String value;

        static {
            Span span = new Span(NativeAdContent.ViewTag.ROOT, 0, "root");
            ROOT = span;
            Span span2 = new Span("REQUEST", 1, "long_poll_history_request");
            REQUEST = span2;
            Span span3 = new Span("UPDATE_TIME", 2, "update_time");
            UPDATE_TIME = span3;
            Span span4 = new Span("BUILD_TASKS", 3, "build_tasks");
            BUILD_TASKS = span4;
            Span span5 = new Span("PREPARE_TASKS", 4, "prepare_tasks");
            PREPARE_TASKS = span5;
            Span span6 = new Span("MISSED_TOTAL", 5, "missed_loader_total");
            MISSED_TOTAL = span6;
            Span span7 = new Span("MISSED_CONTACTS", 6, "missed_contacts");
            MISSED_CONTACTS = span7;
            Span span8 = new Span("MISSED_USERS", 7, "missed_users");
            MISSED_USERS = span8;
            Span span9 = new Span("MISSED_EMAILS", 8, "missed_emails");
            MISSED_EMAILS = span9;
            Span span10 = new Span("MISSED_GROUPS", 9, "missed_groups");
            MISSED_GROUPS = span10;
            Span span11 = new Span("MISSED_CONVERSATIONS", 10, "missed_conversations");
            MISSED_CONVERSATIONS = span11;
            Span span12 = new Span("MISSED_CHAT_INFOS", 11, "missed_chat_infos");
            MISSED_CHAT_INFOS = span12;
            Span span13 = new Span("MISSED_MESSAGES", 12, "missed_messages");
            MISSED_MESSAGES = span13;
            Span span14 = new Span("MISSED_CHANNELS", 13, "missed_channels");
            MISSED_CHANNELS = span14;
            Span span15 = new Span("MISSED_CHANNELS_MESSAGES", 14, "missed_channels_messages");
            MISSED_CHANNELS_MESSAGES = span15;
            Span span16 = new Span("MISSED_CHANNELS_COUNTERS", 15, "missed_channels_counters");
            MISSED_CHANNELS_COUNTERS = span16;
            Span span17 = new Span("MISSED_FOLDERS", 16, "missed_folders");
            MISSED_FOLDERS = span17;
            Span span18 = new Span("MISSED_INCOGNITOS", 17, "missed_incognitos");
            MISSED_INCOGNITOS = span18;
            Span span19 = new Span("SYNC_CHANGES", 18, "sync_changes");
            SYNC_CHANGES = span19;
            Span span20 = new Span("NOTIFY_ENVIRONMENT", 19, "notify_environment");
            NOTIFY_ENVIRONMENT = span20;
            Span[] spanArr = {span, span2, span3, span4, span5, span6, span7, span8, span9, span10, span11, span12, span13, span14, span15, span16, span17, span18, span19, span20};
            $VALUES = spanArr;
            $ENTRIES = new asp(spanArr);
        }

        public Span(String str, int i, String str2) {
            this.value = str2;
        }

        public static Span valueOf(String str) {
            return (Span) Enum.valueOf(Span.class, str);
        }

        public static Span[] values() {
            return (Span[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* compiled from: LongPollHistoryReporter.kt */
    public static final class a {
        public static final C1137a a = new C1137a();

        /* compiled from: LongPollHistoryReporter.kt */
        /* renamed from: com.vk.im.reporters.api.engine.LongPollHistoryReporter$a$a, reason: collision with other inner class name */
        public static final class C1137a implements LongPollHistoryReporter {
            @Override // xsna.eik0
            public final /* bridge */ /* synthetic */ void c(Object obj) {
            }

            @Override // xsna.eik0
            public final /* bridge */ /* synthetic */ void f(mdz<Span> mdzVar, Object obj) {
            }

            @Override // xsna.eik0
            public final boolean h() {
                return false;
            }

            @Override // xsna.eik0
            public final void b() {
            }

            @Override // xsna.eik0
            public final void d(Object obj) {
            }

            @Override // xsna.eik0
            public final void g(String str) {
            }

            @Override // xsna.eik0
            public final void m(String str) {
            }

            @Override // xsna.eik0
            public final void n(Object obj) {
            }
        }
    }
}
