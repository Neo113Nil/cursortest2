package com.vk.im.reporters.api.engine;

import com.vk.im.engine.models.LongPollType;
import xsna.asp;
import xsna.zrp;

/* compiled from: LongPollExpiredReporter.kt */
/* loaded from: classes2.dex */
public interface LongPollExpiredReporter {
    public static final a a = a.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LongPollExpiredReporter.kt */
    public static final class Reason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        public static final Reason LONG_POLL_HISTORY;
        public static final Reason LOOPED_MISSED_LOADER;
        private final String statKey;

        static {
            Reason reason = new Reason("LONG_POLL_HISTORY", 0, "history");
            LONG_POLL_HISTORY = reason;
            Reason reason2 = new Reason("LOOPED_MISSED_LOADER", 1, "looped_missed_loader");
            LOOPED_MISSED_LOADER = reason2;
            Reason[] reasonArr = {reason, reason2};
            $VALUES = reasonArr;
            $ENTRIES = new asp(reasonArr);
        }

        public Reason(String str, int i, String str2) {
            this.statKey = str2;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }

        public final String h() {
            return this.statKey;
        }
    }

    /* compiled from: LongPollExpiredReporter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C1136a b = new C1136a();

        /* compiled from: LongPollExpiredReporter.kt */
        /* renamed from: com.vk.im.reporters.api.engine.LongPollExpiredReporter$a$a, reason: collision with other inner class name */
        public static final class C1136a implements LongPollExpiredReporter {
            @Override // com.vk.im.reporters.api.engine.LongPollExpiredReporter
            public final void a(LongPollType longPollType, Reason reason) {
            }
        }
    }

    default void a(LongPollType longPollType, Reason reason) {
    }
}
