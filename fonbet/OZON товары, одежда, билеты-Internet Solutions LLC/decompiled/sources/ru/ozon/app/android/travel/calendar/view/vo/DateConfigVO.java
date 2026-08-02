package ru.ozon.app.android.travel.calendar.view.vo;

import D3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/vo/DateConfigVO;", "", "", "isDisabled", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator;", "indicator", "isWorkday", "<init>", "(ZLru/ozon/app/android/travel/calendar/view/vo/Indicator;Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator;", "getIndicator", "()Lru/ozon/app/android/travel/calendar/view/vo/Indicator;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DateConfigVO {
    private final Indicator indicator;
    private final boolean isDisabled;
    private final Boolean isWorkday;

    public DateConfigVO(boolean z11, Indicator indicator, Boolean bool) {
        this.isDisabled = z11;
        this.indicator = indicator;
        this.isWorkday = bool;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateConfigVO)) {
            return false;
        }
        DateConfigVO dateConfigVO = (DateConfigVO) other;
        return this.isDisabled == dateConfigVO.isDisabled && Intrinsics.d(this.indicator, dateConfigVO.indicator) && Intrinsics.d(this.isWorkday, dateConfigVO.isWorkday);
    }

    public final Indicator getIndicator() {
        return this.indicator;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isDisabled) * 31;
        Indicator indicator = this.indicator;
        int hashCode2 = (hashCode + (indicator == null ? 0 : indicator.hashCode())) * 31;
        Boolean bool = this.isWorkday;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    /* renamed from: isDisabled, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: isWorkday, reason: from getter */
    public final Boolean getIsWorkday() {
        return this.isWorkday;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isDisabled;
        Indicator indicator = this.indicator;
        Boolean bool = this.isWorkday;
        StringBuilder sb2 = new StringBuilder("DateConfigVO(isDisabled=");
        sb2.append(z11);
        sb2.append(", indicator=");
        sb2.append(indicator);
        sb2.append(", isWorkday=");
        return g.d(sb2, bool, ")");
    }
}
