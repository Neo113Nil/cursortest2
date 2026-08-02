package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import A00.a;
import C.C2702w;
import Pk0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListTearAnimationUpdate;", "LA00/a$J$a;", "", "widgetId", "couponId", "", "needAnimateTear", "<init>", "(JJZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "getCouponId", "Z", "getNeedAnimateTear", "()Z", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StaticCouponListTearAnimationUpdate implements a.J.InterfaceC0007a {
    private final long couponId;
    private final boolean needAnimateTear;
    private final long widgetId;

    public StaticCouponListTearAnimationUpdate(long j11, long j12, boolean z11) {
        this.widgetId = j11;
        this.couponId = j12;
        this.needAnimateTear = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticCouponListTearAnimationUpdate)) {
            return false;
        }
        StaticCouponListTearAnimationUpdate staticCouponListTearAnimationUpdate = (StaticCouponListTearAnimationUpdate) other;
        return this.widgetId == staticCouponListTearAnimationUpdate.widgetId && this.couponId == staticCouponListTearAnimationUpdate.couponId && this.needAnimateTear == staticCouponListTearAnimationUpdate.needAnimateTear;
    }

    public final long getCouponId() {
        return this.couponId;
    }

    public final boolean getNeedAnimateTear() {
        return this.needAnimateTear;
    }

    public final long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.needAnimateTear) + c.a(Long.hashCode(this.widgetId) * 31, 31, this.couponId);
    }

    @NotNull
    public String toString() {
        long j11 = this.widgetId;
        long j12 = this.couponId;
        boolean z11 = this.needAnimateTear;
        StringBuilder d11 = C2702w.d(j11, "StaticCouponListTearAnimationUpdate(widgetId=", ", couponId=");
        d11.append(j12);
        d11.append(", needAnimateTear=");
        d11.append(z11);
        d11.append(")");
        return d11.toString();
    }
}
