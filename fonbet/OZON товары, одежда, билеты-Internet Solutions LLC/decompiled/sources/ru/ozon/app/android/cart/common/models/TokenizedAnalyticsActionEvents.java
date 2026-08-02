package ru.ozon.app.android.cart.common.models;

import Ak.C2436a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.models.events.ProductTokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartAnalyticsEvent;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/common/models/TokenizedAnalyticsActionEvents;", "Lru/ozon/app/android/cart/common/models/AnalyticsActionEvents;", "", "Lru/ozon/app/android/cart/common/models/events/ProductTokenizedCartAnalyticsEvent;", "analyticsEvent", "Lru/ozon/app/android/cart/common/models/events/TokenizedCartAnalyticsEvent;", "additionalAnalyticsEvent", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAnalyticsEvent", "()Ljava/util/List;", "getAdditionalAnalyticsEvent", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TokenizedAnalyticsActionEvents extends AnalyticsActionEvents {
    private final List<TokenizedCartAnalyticsEvent> additionalAnalyticsEvent;

    @NotNull
    private final List<ProductTokenizedCartAnalyticsEvent> analyticsEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenizedAnalyticsActionEvents(@NotNull List<ProductTokenizedCartAnalyticsEvent> analyticsEvent, List<TokenizedCartAnalyticsEvent> list) {
        super(null);
        Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
        this.analyticsEvent = analyticsEvent;
        this.additionalAnalyticsEvent = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenizedAnalyticsActionEvents)) {
            return false;
        }
        TokenizedAnalyticsActionEvents tokenizedAnalyticsActionEvents = (TokenizedAnalyticsActionEvents) other;
        return Intrinsics.d(this.analyticsEvent, tokenizedAnalyticsActionEvents.analyticsEvent) && Intrinsics.d(this.additionalAnalyticsEvent, tokenizedAnalyticsActionEvents.additionalAnalyticsEvent);
    }

    public int hashCode() {
        int hashCode = this.analyticsEvent.hashCode() * 31;
        List<TokenizedCartAnalyticsEvent> list = this.additionalAnalyticsEvent;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return C2436a.b("TokenizedAnalyticsActionEvents(analyticsEvent=", this.analyticsEvent, ", additionalAnalyticsEvent=", ")", this.additionalAnalyticsEvent);
    }
}
