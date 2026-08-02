package ru.ozon.app.android.storefront.core.atoms.views;

import G.g;
import I0.C3173b;
import Pk0.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJb\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterViewData;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "minValue", "maxValue", "fromValue", "toValue", "step", "format", "inputMask", "<init>", "(Ljava/lang/String;FFFFFLjava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;FFFFFLjava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterViewData;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "F", "getMinValue", "()F", "getMaxValue", "getFromValue", "getToValue", "getStep", "getFormat", "getInputMask", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TimeRangeFilterViewData {

    @NotNull
    private final String format;
    private final float fromValue;

    @NotNull
    private final String inputMask;
    private final float maxValue;
    private final float minValue;
    private final float step;
    private final String title;
    private final float toValue;

    public TimeRangeFilterViewData(String str, float f7, float f11, float f12, float f13, float f14, @NotNull String format, @NotNull String inputMask) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(inputMask, "inputMask");
        this.title = str;
        this.minValue = f7;
        this.maxValue = f11;
        this.fromValue = f12;
        this.toValue = f13;
        this.step = f14;
        this.format = format;
        this.inputMask = inputMask;
    }

    public static /* synthetic */ TimeRangeFilterViewData copy$default(TimeRangeFilterViewData timeRangeFilterViewData, String str, float f7, float f11, float f12, float f13, float f14, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = timeRangeFilterViewData.title;
        }
        if ((i11 & 2) != 0) {
            f7 = timeRangeFilterViewData.minValue;
        }
        if ((i11 & 4) != 0) {
            f11 = timeRangeFilterViewData.maxValue;
        }
        if ((i11 & 8) != 0) {
            f12 = timeRangeFilterViewData.fromValue;
        }
        if ((i11 & 16) != 0) {
            f13 = timeRangeFilterViewData.toValue;
        }
        if ((i11 & 32) != 0) {
            f14 = timeRangeFilterViewData.step;
        }
        if ((i11 & 64) != 0) {
            str2 = timeRangeFilterViewData.format;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str3 = timeRangeFilterViewData.inputMask;
        }
        String str4 = str2;
        String str5 = str3;
        float f15 = f13;
        float f16 = f14;
        return timeRangeFilterViewData.copy(str, f7, f11, f12, f15, f16, str4, str5);
    }

    @NotNull
    public final TimeRangeFilterViewData copy(String title, float minValue, float maxValue, float fromValue, float toValue, float step, @NotNull String format, @NotNull String inputMask) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(inputMask, "inputMask");
        return new TimeRangeFilterViewData(title, minValue, maxValue, fromValue, toValue, step, format, inputMask);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeRangeFilterViewData)) {
            return false;
        }
        TimeRangeFilterViewData timeRangeFilterViewData = (TimeRangeFilterViewData) other;
        return Intrinsics.d(this.title, timeRangeFilterViewData.title) && Float.compare(this.minValue, timeRangeFilterViewData.minValue) == 0 && Float.compare(this.maxValue, timeRangeFilterViewData.maxValue) == 0 && Float.compare(this.fromValue, timeRangeFilterViewData.fromValue) == 0 && Float.compare(this.toValue, timeRangeFilterViewData.toValue) == 0 && Float.compare(this.step, timeRangeFilterViewData.step) == 0 && Intrinsics.d(this.format, timeRangeFilterViewData.format) && Intrinsics.d(this.inputMask, timeRangeFilterViewData.inputMask);
    }

    public final float getFromValue() {
        return this.fromValue;
    }

    @NotNull
    public final String getInputMask() {
        return this.inputMask;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    public final float getStep() {
        return this.step;
    }

    public final String getTitle() {
        return this.title;
    }

    public final float getToValue() {
        return this.toValue;
    }

    public int hashCode() {
        String str = this.title;
        return this.inputMask.hashCode() + g.a(b.a(this.step, b.a(this.toValue, b.a(this.fromValue, b.a(this.maxValue, b.a(this.minValue, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31), 31), 31), 31, this.format);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        float f7 = this.minValue;
        float f11 = this.maxValue;
        float f12 = this.fromValue;
        float f13 = this.toValue;
        float f14 = this.step;
        String str2 = this.format;
        String str3 = this.inputMask;
        StringBuilder sb2 = new StringBuilder("TimeRangeFilterViewData(title=");
        sb2.append(str);
        sb2.append(", minValue=");
        sb2.append(f7);
        sb2.append(", maxValue=");
        sb2.append(f11);
        sb2.append(", fromValue=");
        sb2.append(f12);
        sb2.append(", toValue=");
        sb2.append(f13);
        sb2.append(", step=");
        sb2.append(f14);
        sb2.append(", format=");
        return C3173b.c(sb2, str2, ", inputMask=", str3, ")");
    }
}
