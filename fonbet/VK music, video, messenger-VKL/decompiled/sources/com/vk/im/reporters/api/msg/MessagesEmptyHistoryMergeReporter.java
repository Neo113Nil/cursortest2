package com.vk.im.reporters.api.msg;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.eik0;
import xsna.mdz;
import xsna.zrp;

/* compiled from: MessagesEmptyHistoryMergeReporter.kt */
/* loaded from: classes2.dex */
public interface MessagesEmptyHistoryMergeReporter extends eik0<mdz<Span>, MeasuringPoint> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesEmptyHistoryMergeReporter.kt */
    public static final class MeasuringPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MeasuringPoint[] $VALUES;

        static {
            MeasuringPoint[] measuringPointArr = new MeasuringPoint[0];
            $VALUES = measuringPointArr;
            $ENTRIES = new asp(measuringPointArr);
        }

        public static MeasuringPoint valueOf(String str) {
            return (MeasuringPoint) Enum.valueOf(MeasuringPoint.class, str);
        }

        public static MeasuringPoint[] values() {
            return (MeasuringPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesEmptyHistoryMergeReporter.kt */
    public static final class Span {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Span[] $VALUES;
        public static final Span FINDING_NEAREST_MESSAGES;
        public static final Span ROOT;
        public static final Span SAVING_PEER_IS_EMPTY;
        public static final Span TRIMMING_HISTORY_AFTER;
        public static final Span TRIMMING_HISTORY_BEFORE;
        public static final Span UPDATING_PEER;
        private final String value;

        static {
            Span span = new Span(NativeAdContent.ViewTag.ROOT, 0, "root");
            ROOT = span;
            Span span2 = new Span("FINDING_NEAREST_MESSAGES", 1, "finding_nearest_messages");
            FINDING_NEAREST_MESSAGES = span2;
            Span span3 = new Span("TRIMMING_HISTORY_BEFORE", 2, "trimming_history_before");
            TRIMMING_HISTORY_BEFORE = span3;
            Span span4 = new Span("TRIMMING_HISTORY_AFTER", 3, "trimming_history_after");
            TRIMMING_HISTORY_AFTER = span4;
            Span span5 = new Span("SAVING_PEER_IS_EMPTY", 4, "saving_peer_is_empty");
            SAVING_PEER_IS_EMPTY = span5;
            Span span6 = new Span("UPDATING_PEER", 5, "updating_peer");
            UPDATING_PEER = span6;
            Span[] spanArr = {span, span2, span3, span4, span5, span6};
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

    /* compiled from: MessagesEmptyHistoryMergeReporter.kt */
    public static final class a {
        public static final C1138a a = new C1138a();

        /* compiled from: MessagesEmptyHistoryMergeReporter.kt */
        /* renamed from: com.vk.im.reporters.api.msg.MessagesEmptyHistoryMergeReporter$a$a, reason: collision with other inner class name */
        public static final class C1138a implements MessagesEmptyHistoryMergeReporter {
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
            public final /* bridge */ /* synthetic */ void n(Object obj) {
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
        }
    }
}
