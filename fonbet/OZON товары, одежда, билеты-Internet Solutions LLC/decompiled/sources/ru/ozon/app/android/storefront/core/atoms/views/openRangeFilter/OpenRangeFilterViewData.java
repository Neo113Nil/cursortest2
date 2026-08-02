package ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter;

import B0.C2454a;
import Ek.a;
import Kk.C3532b;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010Jz\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b \u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b!\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b#\u0010\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b'\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "minValue", "maxValue", "stepPower", "units", "maxValueSign", "fromValue", "toValue", "", "hideSeparator", "shouldUpdateMaxValue", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;IIZZ)V", "copy", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;IIZZ)Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "I", "getMinValue", "getMaxValue", "getStepPower", "getUnits", "getMaxValueSign", "getFromValue", "getToValue", "Z", "getHideSeparator", "()Z", "getShouldUpdateMaxValue", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OpenRangeFilterViewData {
    private final int fromValue;
    private final boolean hideSeparator;
    private final int maxValue;
    private final String maxValueSign;
    private final int minValue;
    private final boolean shouldUpdateMaxValue;
    private final int stepPower;
    private final String title;
    private final int toValue;
    private final String units;

    public OpenRangeFilterViewData(String str, int i11, int i12, int i13, String str2, String str3, int i14, int i15, boolean z11, boolean z12) {
        this.title = str;
        this.minValue = i11;
        this.maxValue = i12;
        this.stepPower = i13;
        this.units = str2;
        this.maxValueSign = str3;
        this.fromValue = i14;
        this.toValue = i15;
        this.hideSeparator = z11;
        this.shouldUpdateMaxValue = z12;
    }

    public static /* synthetic */ OpenRangeFilterViewData copy$default(OpenRangeFilterViewData openRangeFilterViewData, String str, int i11, int i12, int i13, String str2, String str3, int i14, int i15, boolean z11, boolean z12, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = openRangeFilterViewData.title;
        }
        if ((i16 & 2) != 0) {
            i11 = openRangeFilterViewData.minValue;
        }
        if ((i16 & 4) != 0) {
            i12 = openRangeFilterViewData.maxValue;
        }
        if ((i16 & 8) != 0) {
            i13 = openRangeFilterViewData.stepPower;
        }
        if ((i16 & 16) != 0) {
            str2 = openRangeFilterViewData.units;
        }
        if ((i16 & 32) != 0) {
            str3 = openRangeFilterViewData.maxValueSign;
        }
        if ((i16 & 64) != 0) {
            i14 = openRangeFilterViewData.fromValue;
        }
        if ((i16 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            i15 = openRangeFilterViewData.toValue;
        }
        if ((i16 & 256) != 0) {
            z11 = openRangeFilterViewData.hideSeparator;
        }
        if ((i16 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            z12 = openRangeFilterViewData.shouldUpdateMaxValue;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        int i17 = i14;
        int i18 = i15;
        String str4 = str2;
        String str5 = str3;
        return openRangeFilterViewData.copy(str, i11, i12, i13, str4, str5, i17, i18, z13, z14);
    }

    @NotNull
    public final OpenRangeFilterViewData copy(String title, int minValue, int maxValue, int stepPower, String units, String maxValueSign, int fromValue, int toValue, boolean hideSeparator, boolean shouldUpdateMaxValue) {
        return new OpenRangeFilterViewData(title, minValue, maxValue, stepPower, units, maxValueSign, fromValue, toValue, hideSeparator, shouldUpdateMaxValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenRangeFilterViewData)) {
            return false;
        }
        OpenRangeFilterViewData openRangeFilterViewData = (OpenRangeFilterViewData) other;
        return Intrinsics.d(this.title, openRangeFilterViewData.title) && this.minValue == openRangeFilterViewData.minValue && this.maxValue == openRangeFilterViewData.maxValue && this.stepPower == openRangeFilterViewData.stepPower && Intrinsics.d(this.units, openRangeFilterViewData.units) && Intrinsics.d(this.maxValueSign, openRangeFilterViewData.maxValueSign) && this.fromValue == openRangeFilterViewData.fromValue && this.toValue == openRangeFilterViewData.toValue && this.hideSeparator == openRangeFilterViewData.hideSeparator && this.shouldUpdateMaxValue == openRangeFilterViewData.shouldUpdateMaxValue;
    }

    public final int getFromValue() {
        return this.fromValue;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final String getMaxValueSign() {
        return this.maxValueSign;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final boolean getShouldUpdateMaxValue() {
        return this.shouldUpdateMaxValue;
    }

    public final int getStepPower() {
        return this.stepPower;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getToValue() {
        return this.toValue;
    }

    public final String getUnits() {
        return this.units;
    }

    public int hashCode() {
        String str = this.title;
        int a11 = C2454a.a(this.stepPower, C2454a.a(this.maxValue, C2454a.a(this.minValue, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31);
        String str2 = this.units;
        int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maxValueSign;
        return Boolean.hashCode(this.shouldUpdateMaxValue) + C3532b.a(C2454a.a(this.toValue, C2454a.a(this.fromValue, (hashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31), 31, this.hideSeparator);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        int i11 = this.minValue;
        int i12 = this.maxValue;
        int i13 = this.stepPower;
        String str2 = this.units;
        String str3 = this.maxValueSign;
        int i14 = this.fromValue;
        int i15 = this.toValue;
        boolean z11 = this.hideSeparator;
        boolean z12 = this.shouldUpdateMaxValue;
        StringBuilder c11 = C3660k.c(i11, "OpenRangeFilterViewData(title=", str, ", minValue=", ", maxValue=");
        a.f(i12, i13, ", stepPower=", ", units=", c11);
        Nh.a.h(c11, str2, ", maxValueSign=", str3, ", fromValue=");
        a.f(i14, i15, ", toValue=", ", hideSeparator=", c11);
        c11.append(z11);
        c11.append(", shouldUpdateMaxValue=");
        c11.append(z12);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ OpenRangeFilterViewData(String str, int i11, int i12, int i13, String str2, String str3, int i14, int i15, boolean z11, boolean z12, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, i13, str2, str3, i14, i15, z11, (i16 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z12);
    }
}
