package ru.ozon.app.android.favorites.data.utils;

import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/favorites/data/utils/AnalyticRefs;", "", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "voId", "<init>", "(LWZ/l;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Ljava/lang/Long;", "getVoId", "()Ljava/lang/Long;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AnalyticRefs {
    private final l tokenizedAnalytics;
    private final Long voId;

    public AnalyticRefs(l lVar, Long l11) {
        this.tokenizedAnalytics = lVar;
        this.voId = l11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticRefs)) {
            return false;
        }
        AnalyticRefs analyticRefs = (AnalyticRefs) other;
        return Intrinsics.d(this.tokenizedAnalytics, analyticRefs.tokenizedAnalytics) && Intrinsics.d(this.voId, analyticRefs.voId);
    }

    public final l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    public final Long getVoId() {
        return this.voId;
    }

    public int hashCode() {
        l lVar = this.tokenizedAnalytics;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        Long l11 = this.voId;
        return hashCode + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AnalyticRefs(tokenizedAnalytics=" + this.tokenizedAnalytics + ", voId=" + this.voId + ")";
    }
}
