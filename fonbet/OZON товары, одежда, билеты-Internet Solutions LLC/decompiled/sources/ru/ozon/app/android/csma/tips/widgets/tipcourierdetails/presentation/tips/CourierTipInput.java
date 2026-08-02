package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips;

import C.o0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\n\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/CourierTipInput;", "", "", "hint", "minValueError", "maxValueError", "Ljava/math/BigDecimal;", "minValue", "maxValue", "", "isSelected", "currentValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHint", "getMinValueError", "getMaxValueError", "Ljava/math/BigDecimal;", "getMinValue", "()Ljava/math/BigDecimal;", "getMaxValue", "Z", "()Z", "getCurrentValue", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CourierTipInput {
    private final String currentValue;

    @NotNull
    private final String hint;
    private final boolean isSelected;

    @NotNull
    private final BigDecimal maxValue;

    @NotNull
    private final String maxValueError;

    @NotNull
    private final BigDecimal minValue;

    @NotNull
    private final String minValueError;

    public CourierTipInput(@NotNull String hint, @NotNull String minValueError, @NotNull String maxValueError, @NotNull BigDecimal minValue, @NotNull BigDecimal maxValue, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(minValueError, "minValueError");
        Intrinsics.checkNotNullParameter(maxValueError, "maxValueError");
        Intrinsics.checkNotNullParameter(minValue, "minValue");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        this.hint = hint;
        this.minValueError = minValueError;
        this.maxValueError = maxValueError;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.isSelected = z11;
        this.currentValue = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourierTipInput)) {
            return false;
        }
        CourierTipInput courierTipInput = (CourierTipInput) other;
        return Intrinsics.d(this.hint, courierTipInput.hint) && Intrinsics.d(this.minValueError, courierTipInput.minValueError) && Intrinsics.d(this.maxValueError, courierTipInput.maxValueError) && Intrinsics.d(this.minValue, courierTipInput.minValue) && Intrinsics.d(this.maxValue, courierTipInput.maxValue) && this.isSelected == courierTipInput.isSelected && Intrinsics.d(this.currentValue, courierTipInput.currentValue);
    }

    public final String getCurrentValue() {
        return this.currentValue;
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    @NotNull
    public final BigDecimal getMaxValue() {
        return this.maxValue;
    }

    @NotNull
    public final String getMaxValueError() {
        return this.maxValueError;
    }

    @NotNull
    public final BigDecimal getMinValue() {
        return this.minValue;
    }

    @NotNull
    public final String getMinValueError() {
        return this.minValueError;
    }

    public int hashCode() {
        int a11 = C3532b.a((this.maxValue.hashCode() + ((this.minValue.hashCode() + g.a(g.a(this.hint.hashCode() * 31, 31, this.minValueError), 31, this.maxValueError)) * 31)) * 31, 31, this.isSelected);
        String str = this.currentValue;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.hint;
        String str2 = this.minValueError;
        String str3 = this.maxValueError;
        BigDecimal bigDecimal = this.minValue;
        BigDecimal bigDecimal2 = this.maxValue;
        boolean z11 = this.isSelected;
        String str4 = this.currentValue;
        StringBuilder d11 = C3660k.d("CourierTipInput(hint=", str, ", minValueError=", str2, ", maxValueError=");
        d11.append(str3);
        d11.append(", minValue=");
        d11.append(bigDecimal);
        d11.append(", maxValue=");
        d11.append(bigDecimal2);
        d11.append(", isSelected=");
        d11.append(z11);
        d11.append(", currentValue=");
        return o0.c(d11, str4, ")");
    }
}
