package io.sentry;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.Scopes;
import io.sentry.cache.EnvelopeCache;

/* loaded from: classes6.dex */
public enum DataCategory {
    All("__all__"),
    Default("default"),
    Error("error"),
    Session(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE),
    Attachment("attachment"),
    Monitor("monitor"),
    Profile(Scopes.PROFILE),
    MetricBucket("metric_bucket"),
    Transaction("transaction"),
    Replay("replay"),
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
