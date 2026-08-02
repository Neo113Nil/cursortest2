package io.sentry;

import com.facebook.hermes.intl.Constants;
import com.twilio.voice.EventGroupType;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4774l {
    All("__all__"),
    Default(Constants.COLLATION_DEFAULT),
    Error("error"),
    Feedback(EventGroupType.FEEDBACK_EVENT_GROUP),
    Session("session"),
    Attachment("attachment"),
    LogItem("log_item"),
    LogByte("log_byte"),
    TraceMetric("trace_metric"),
    TraceMetricByte("trace_metric_byte"),
    Monitor("monitor"),
    Profile("profile"),
    ProfileChunkUi("profile_chunk_ui"),
    ProfileChunk("profile_chunk"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    EnumC4774l(@NotNull String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
