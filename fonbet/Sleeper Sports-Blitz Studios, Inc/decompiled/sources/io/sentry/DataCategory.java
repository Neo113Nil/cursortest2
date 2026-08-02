package io.sentry;

import androidx.media3.extractor.text.ttml.TtmlNode;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.Feedback;

/* loaded from: classes9.dex */
public enum DataCategory {
    All("__all__"),
    Default("default"),
    Error("error"),
    Feedback(Feedback.TYPE),
    Session(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE),
    Attachment("attachment"),
    LogItem("log_item"),
    LogByte("log_byte"),
    TraceMetric("trace_metric"),
    Monitor("monitor"),
    Profile("profile"),
    ProfileChunkUi("profile_chunk_ui"),
    ProfileChunk("profile_chunk"),
    Transaction("transaction"),
    Replay(RadarTrackingOptions.KEY_REPLAY),
    Span(TtmlNode.TAG_SPAN),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    DataCategory(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
