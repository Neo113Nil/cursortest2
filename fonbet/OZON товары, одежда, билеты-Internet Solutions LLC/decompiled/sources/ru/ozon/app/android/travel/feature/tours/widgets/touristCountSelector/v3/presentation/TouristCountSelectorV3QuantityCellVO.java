package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation;

import B0.C2454a;
import Co.a;
import GR.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jl\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b$\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b%\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "minValue", "maxValue", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "decreaseButton", "increaseButton", "Lru/ozon/uni/android/flashbar/model/Restriction;", "maxValueRestriction", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IIILru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/android/flashbar/model/Restriction;)V", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IIILru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/android/flashbar/model/Restriction;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "I", "getValue", "getMinValue", "getMaxValue", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDecreaseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIncreaseButton", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getMaxValueRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TouristCountSelectorV3QuantityCellVO {
    public static final int $stable;

    @NotNull
    private final IconButtonV3DTO decreaseButton;

    @NotNull
    private final String id;

    @NotNull
    private final IconButtonV3DTO increaseButton;
    private final int maxValue;
    private final Restriction maxValueRestriction;
    private final int minValue;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final int value;

    static {
        int i11 = Restriction.$stable;
        int i12 = IconButtonV3DTO.$stable;
        $stable = i11 | i12 | i12;
    }

    public TouristCountSelectorV3QuantityCellVO(@NotNull String id2, @NotNull TextDTO title, @NotNull TextDTO subtitle, int i11, int i12, int i13, @NotNull IconButtonV3DTO decreaseButton, @NotNull IconButtonV3DTO increaseButton, Restriction restriction) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(decreaseButton, "decreaseButton");
        Intrinsics.checkNotNullParameter(increaseButton, "increaseButton");
        this.id = id2;
        this.title = title;
        this.subtitle = subtitle;
        this.value = i11;
        this.minValue = i12;
        this.maxValue = i13;
        this.decreaseButton = decreaseButton;
        this.increaseButton = increaseButton;
        this.maxValueRestriction = restriction;
    }

    public static /* synthetic */ TouristCountSelectorV3QuantityCellVO copy$default(TouristCountSelectorV3QuantityCellVO touristCountSelectorV3QuantityCellVO, String str, TextDTO textDTO, TextDTO textDTO2, int i11, int i12, int i13, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, Restriction restriction, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = touristCountSelectorV3QuantityCellVO.id;
        }
        if ((i14 & 2) != 0) {
            textDTO = touristCountSelectorV3QuantityCellVO.title;
        }
        if ((i14 & 4) != 0) {
            textDTO2 = touristCountSelectorV3QuantityCellVO.subtitle;
        }
        if ((i14 & 8) != 0) {
            i11 = touristCountSelectorV3QuantityCellVO.value;
        }
        if ((i14 & 16) != 0) {
            i12 = touristCountSelectorV3QuantityCellVO.minValue;
        }
        if ((i14 & 32) != 0) {
            i13 = touristCountSelectorV3QuantityCellVO.maxValue;
        }
        if ((i14 & 64) != 0) {
            iconButtonV3DTO = touristCountSelectorV3QuantityCellVO.decreaseButton;
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            iconButtonV3DTO2 = touristCountSelectorV3QuantityCellVO.increaseButton;
        }
        if ((i14 & 256) != 0) {
            restriction = touristCountSelectorV3QuantityCellVO.maxValueRestriction;
        }
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO2;
        Restriction restriction2 = restriction;
        int i15 = i13;
        IconButtonV3DTO iconButtonV3DTO4 = iconButtonV3DTO;
        int i16 = i12;
        TextDTO textDTO3 = textDTO2;
        return touristCountSelectorV3QuantityCellVO.copy(str, textDTO, textDTO3, i11, i16, i15, iconButtonV3DTO4, iconButtonV3DTO3, restriction2);
    }

    @NotNull
    public final TouristCountSelectorV3QuantityCellVO copy(@NotNull String id2, @NotNull TextDTO title, @NotNull TextDTO subtitle, int value, int minValue, int maxValue, @NotNull IconButtonV3DTO decreaseButton, @NotNull IconButtonV3DTO increaseButton, Restriction maxValueRestriction) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(decreaseButton, "decreaseButton");
        Intrinsics.checkNotNullParameter(increaseButton, "increaseButton");
        return new TouristCountSelectorV3QuantityCellVO(id2, title, subtitle, value, minValue, maxValue, decreaseButton, increaseButton, maxValueRestriction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouristCountSelectorV3QuantityCellVO)) {
            return false;
        }
        TouristCountSelectorV3QuantityCellVO touristCountSelectorV3QuantityCellVO = (TouristCountSelectorV3QuantityCellVO) other;
        return Intrinsics.d(this.id, touristCountSelectorV3QuantityCellVO.id) && Intrinsics.d(this.title, touristCountSelectorV3QuantityCellVO.title) && Intrinsics.d(this.subtitle, touristCountSelectorV3QuantityCellVO.subtitle) && this.value == touristCountSelectorV3QuantityCellVO.value && this.minValue == touristCountSelectorV3QuantityCellVO.minValue && this.maxValue == touristCountSelectorV3QuantityCellVO.maxValue && Intrinsics.d(this.decreaseButton, touristCountSelectorV3QuantityCellVO.decreaseButton) && Intrinsics.d(this.increaseButton, touristCountSelectorV3QuantityCellVO.increaseButton) && Intrinsics.d(this.maxValueRestriction, touristCountSelectorV3QuantityCellVO.maxValueRestriction);
    }

    @NotNull
    public final IconButtonV3DTO getDecreaseButton() {
        return this.decreaseButton;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final IconButtonV3DTO getIncreaseButton() {
        return this.increaseButton;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final Restriction getMaxValueRestriction() {
        return this.maxValueRestriction;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        int c11 = b.c(this.increaseButton, b.c(this.decreaseButton, C2454a.a(this.maxValue, C2454a.a(this.minValue, C2454a.a(this.value, Ns.b.a(this.subtitle, Ns.b.a(this.title, this.id.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        Restriction restriction = this.maxValueRestriction;
        return c11 + (restriction == null ? 0 : restriction.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        int i11 = this.value;
        int i12 = this.minValue;
        int i13 = this.maxValue;
        IconButtonV3DTO iconButtonV3DTO = this.decreaseButton;
        IconButtonV3DTO iconButtonV3DTO2 = this.increaseButton;
        Restriction restriction = this.maxValueRestriction;
        StringBuilder b11 = a.b("TouristCountSelectorV3QuantityCellVO(id=", textDTO, str, ", title=", ", subtitle=");
        b11.append(textDTO2);
        b11.append(", value=");
        b11.append(i11);
        b11.append(", minValue=");
        Ek.a.f(i12, i13, ", maxValue=", ", decreaseButton=", b11);
        b11.append(iconButtonV3DTO);
        b11.append(", increaseButton=");
        b11.append(iconButtonV3DTO2);
        b11.append(", maxValueRestriction=");
        b11.append(restriction);
        b11.append(")");
        return b11.toString();
    }
}
