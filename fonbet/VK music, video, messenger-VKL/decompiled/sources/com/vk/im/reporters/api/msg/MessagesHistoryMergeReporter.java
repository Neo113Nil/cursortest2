package com.vk.im.reporters.api.msg;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.eik0;
import xsna.mdz;
import xsna.zrp;

/* compiled from: MessagesHistoryMergeReporter.kt */
/* loaded from: classes2.dex */
public interface MessagesHistoryMergeReporter extends eik0<mdz<Span>, MeasuringPoint> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesHistoryMergeReporter.kt */
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
    /* compiled from: MessagesHistoryMergeReporter.kt */
    public static final class Span {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Span[] $VALUES;
        public static final Span CROSS_LINKING_WITH_EDGE_CACHED_MESSAGES;
        public static final Span MESSAGES_PROCESSING;
        public static final Span RESETTING_CHUNK_IN_CACHE;
        public static final Span ROOT;
        public static final Span SAVING_MESSAGES_HISTORY;
        public static final Span SAVING_PEER_IS_EMPTY;
        public static final Span SPACES_CALCULATING;
        public static final Span TRIMMING_HISTORY_AFTER;
        public static final Span TRIMMING_HISTORY_BEFORE;
        public static final Span UPDATING_PEER;
        private final String value;

        static {
            Span span = new Span(NativeAdContent.ViewTag.ROOT, 0, "root");
            ROOT = span;
            Span span2 = new Span("MESSAGES_PROCESSING", 1, "messages_processing");
            MESSAGES_PROCESSING = span2;
            Span span3 = new Span("SPACES_CALCULATING", 2, "spaces_calculating");
            SPACES_CALCULATING = span3;
            Span span4 = new Span("RESETTING_CHUNK_IN_CACHE", 3, "resetting_chunk_in_cache");
            RESETTING_CHUNK_IN_CACHE = span4;
            Span span5 = new Span("TRIMMING_HISTORY_BEFORE", 4, "trimming_history_before");
            TRIMMING_HISTORY_BEFORE = span5;
            Span span6 = new Span("TRIMMING_HISTORY_AFTER", 5, "trimming_history_after");
            TRIMMING_HISTORY_AFTER = span6;
            Span span7 = new Span("CROSS_LINKING_WITH_EDGE_CACHED_MESSAGES", 6, "cross_linking_with_edge_cached_messages");
            CROSS_LINKING_WITH_EDGE_CACHED_MESSAGES = span7;
            Span span8 = new Span("SAVING_MESSAGES_HISTORY", 7, "saving_messages_history");
            SAVING_MESSAGES_HISTORY = span8;
            Span span9 = new Span("SAVING_PEER_IS_EMPTY", 8, "saving_peer_is_empty");
            SAVING_PEER_IS_EMPTY = span9;
            Span span10 = new Span("UPDATING_PEER", 9, "updating_peer");
            UPDATING_PEER = span10;
            Span[] spanArr = {span, span2, span3, span4, span5, span6, span7, span8, span9, span10};
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

    /* compiled from: MessagesHistoryMergeReporter.kt */
    public static final class a {
        public static final C1139a a = new C1139a();

        /* compiled from: MessagesHistoryMergeReporter.kt */
        /* renamed from: com.vk.im.reporters.api.msg.MessagesHistoryMergeReporter$a$a, reason: collision with other inner class name */
        public static final class C1139a implements MessagesHistoryMergeReporter {
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
