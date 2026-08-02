package ru.ozon.app.android.csma.tips.core;

import G.g;
import N3.C3660k;
import Pk0.a;
import com.squareup.moshi.j;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/csma/tips/core/TipsInput;", "", "hint", "", "minValueError", "maxValueError", "minValue", "Ljava/math/BigDecimal;", "maxValue", "currentValue", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Z)V", "getHint", "()Ljava/lang/String;", "getMinValueError", "getMaxValueError", "getMinValue", "()Ljava/math/BigDecimal;", "getMaxValue", "getCurrentValue", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TipsInput {
    private final BigDecimal currentValue;

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

    public TipsInput(@NotNull String hint, @NotNull String minValueError, @NotNull String maxValueError, @NotNull BigDecimal minValue, @NotNull BigDecimal maxValue, BigDecimal bigDecimal, boolean z11) {
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
        this.currentValue = bigDecimal;
        this.isSelected = z11;
    }

    public static /* synthetic */ TipsInput copy$default(TipsInput tipsInput, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tipsInput.hint;
        }
        if ((i11 & 2) != 0) {
            str2 = tipsInput.minValueError;
        }
        if ((i11 & 4) != 0) {
            str3 = tipsInput.maxValueError;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = tipsInput.minValue;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = tipsInput.maxValue;
        }
        if ((i11 & 32) != 0) {
            bigDecimal3 = tipsInput.currentValue;
        }
        if ((i11 & 64) != 0) {
            z11 = tipsInput.isSelected;
        }
        BigDecimal bigDecimal4 = bigDecimal3;
        boolean z12 = z11;
        BigDecimal bigDecimal5 = bigDecimal2;
        String str4 = str3;
        return tipsInput.copy(str, str2, str4, bigDecimal, bigDecimal5, bigDecimal4, z12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMinValueError() {
        return this.minValueError;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMaxValueError() {
        return this.maxValueError;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BigDecimal getMinValue() {
        return this.minValue;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BigDecimal getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getCurrentValue() {
        return this.currentValue;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final TipsInput copy(@NotNull String hint, @NotNull String minValueError, @NotNull String maxValueError, @NotNull BigDecimal minValue, @NotNull BigDecimal maxValue, BigDecimal currentValue, boolean isSelected) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(minValueError, "minValueError");
        Intrinsics.checkNotNullParameter(maxValueError, "maxValueError");
        Intrinsics.checkNotNullParameter(minValue, "minValue");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        return new TipsInput(hint, minValueError, maxValueError, minValue, maxValue, currentValue, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipsInput)) {
            return false;
        }
        TipsInput tipsInput = (TipsInput) other;
        return Intrinsics.d(this.hint, tipsInput.hint) && Intrinsics.d(this.minValueError, tipsInput.minValueError) && Intrinsics.d(this.maxValueError, tipsInput.maxValueError) && Intrinsics.d(this.minValue, tipsInput.minValue) && Intrinsics.d(this.maxValue, tipsInput.maxValue) && Intrinsics.d(this.currentValue, tipsInput.currentValue) && this.isSelected == tipsInput.isSelected;
    }

    public final BigDecimal getCurrentValue() {
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
        int hashCode = (this.maxValue.hashCode() + ((this.minValue.hashCode() + g.a(g.a(this.hint.hashCode() * 31, 31, this.minValueError), 31, this.maxValueError)) * 31)) * 31;
        BigDecimal bigDecimal = this.currentValue;
        return Boolean.hashCode(this.isSelected) + ((hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.hint;
        String str2 = this.minValueError;
        String str3 = this.maxValueError;
        BigDecimal bigDecimal = this.minValue;
        BigDecimal bigDecimal2 = this.maxValue;
        BigDecimal bigDecimal3 = this.currentValue;
        boolean z11 = this.isSelected;
        StringBuilder d11 = C3660k.d("TipsInput(hint=", str, ", minValueError=", str2, ", maxValueError=");
        d11.append(str3);
        d11.append(", minValue=");
        d11.append(bigDecimal);
        d11.append(", maxValue=");
        d11.append(bigDecimal2);
        d11.append(", currentValue=");
        d11.append(bigDecimal3);
        d11.append(", isSelected=");
        return a.a(")", d11, z11);
    }
}
