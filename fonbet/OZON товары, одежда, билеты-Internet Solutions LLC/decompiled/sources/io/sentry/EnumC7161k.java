package io.sentry;

import com.google.android.gms.common.Scopes;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC7161k {
    All("__all__"),
    Default("default"),
    Error("error"),
    Feedback("feedback"),
    Session("session"),
    Attachment("attachment"),
    LogItem("log_item"),
    LogByte("log_byte"),
    TraceMetric("trace_metric"),
    Monitor("monitor"),
    Profile(Scopes.PROFILE),
    ProfileChunkUi("profile_chunk_ui"),
    ProfileChunk("profile_chunk"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    EnumC7161k(@NotNull String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
