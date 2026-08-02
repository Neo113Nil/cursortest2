package ru.ozon.app.android.travel.molecules.view.quantityCell;

import Ak.C2436a;
import B0.C2454a;
import B90.C2619v;
import Ek.a;
import Kk.C3532b;
import Pk0.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jn\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b#\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b$\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "minValue", "maxValue", "", "minusButtonEnabled", "plusButtonEnabled", "Lru/ozon/uni/android/flashbar/model/Restriction;", "maxValueRestriction", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;IIIZZLru/ozon/uni/android/flashbar/model/Restriction;)V", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;IIIZZLru/ozon/uni/android/flashbar/model/Restriction;)Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "I", "getValue", "getMinValue", "getMaxValue", "Z", "getMinusButtonEnabled", "()Z", "getPlusButtonEnabled", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getMaxValueRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuantityCellVO {
    public static final int $stable;

    @NotNull
    private final String id;
    private final int maxValue;
    private final Restriction maxValueRestriction;
    private final int minValue;
    private final boolean minusButtonEnabled;
    private final boolean plusButtonEnabled;
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final int value;

    static {
        int i11 = Restriction.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | i12;
    }

    public QuantityCellVO(@NotNull String id2, @NotNull TextAtom title, TextAtom textAtom, int i11, int i12, int i13, boolean z11, boolean z12, Restriction restriction) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id2;
        this.title = title;
        this.subtitle = textAtom;
        this.value = i11;
        this.minValue = i12;
        this.maxValue = i13;
        this.minusButtonEnabled = z11;
        this.plusButtonEnabled = z12;
        this.maxValueRestriction = restriction;
    }

    public static /* synthetic */ QuantityCellVO copy$default(QuantityCellVO quantityCellVO, String str, TextAtom textAtom, TextAtom textAtom2, int i11, int i12, int i13, boolean z11, boolean z12, Restriction restriction, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = quantityCellVO.id;
        }
        if ((i14 & 2) != 0) {
            textAtom = quantityCellVO.title;
        }
        if ((i14 & 4) != 0) {
            textAtom2 = quantityCellVO.subtitle;
        }
        if ((i14 & 8) != 0) {
            i11 = quantityCellVO.value;
        }
        if ((i14 & 16) != 0) {
            i12 = quantityCellVO.minValue;
        }
        if ((i14 & 32) != 0) {
            i13 = quantityCellVO.maxValue;
        }
        if ((i14 & 64) != 0) {
            z11 = quantityCellVO.minusButtonEnabled;
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z12 = quantityCellVO.plusButtonEnabled;
        }
        if ((i14 & 256) != 0) {
            restriction = quantityCellVO.maxValueRestriction;
        }
        boolean z13 = z12;
        Restriction restriction2 = restriction;
        int i15 = i13;
        boolean z14 = z11;
        int i16 = i12;
        TextAtom textAtom3 = textAtom2;
        return quantityCellVO.copy(str, textAtom, textAtom3, i11, i16, i15, z14, z13, restriction2);
    }

    @NotNull
    public final QuantityCellVO copy(@NotNull String id2, @NotNull TextAtom title, TextAtom subtitle, int value, int minValue, int maxValue, boolean minusButtonEnabled, boolean plusButtonEnabled, Restriction maxValueRestriction) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new QuantityCellVO(id2, title, subtitle, value, minValue, maxValue, minusButtonEnabled, plusButtonEnabled, maxValueRestriction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuantityCellVO)) {
            return false;
        }
        QuantityCellVO quantityCellVO = (QuantityCellVO) other;
        return Intrinsics.d(this.id, quantityCellVO.id) && Intrinsics.d(this.title, quantityCellVO.title) && Intrinsics.d(this.subtitle, quantityCellVO.subtitle) && this.value == quantityCellVO.value && this.minValue == quantityCellVO.minValue && this.maxValue == quantityCellVO.maxValue && this.minusButtonEnabled == quantityCellVO.minusButtonEnabled && this.plusButtonEnabled == quantityCellVO.plusButtonEnabled && Intrinsics.d(this.maxValueRestriction, quantityCellVO.maxValueRestriction);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final boolean getMinusButtonEnabled() {
        return this.minusButtonEnabled;
    }

    public final boolean getPlusButtonEnabled() {
        return this.plusButtonEnabled;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.id.hashCode() * 31, 31, this.title);
        TextAtom textAtom = this.subtitle;
        int a11 = C3532b.a(C3532b.a(C2454a.a(this.maxValue, C2454a.a(this.minValue, C2454a.a(this.value, (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31), 31), 31), 31, this.minusButtonEnabled), 31, this.plusButtonEnabled);
        Restriction restriction = this.maxValueRestriction;
        return a11 + (restriction != null ? restriction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        int i11 = this.value;
        int i12 = this.minValue;
        int i13 = this.maxValue;
        boolean z11 = this.minusButtonEnabled;
        boolean z12 = this.plusButtonEnabled;
        Restriction restriction = this.maxValueRestriction;
        StringBuilder d11 = C2436a.d("QuantityCellVO(id=", str, ", title=", ", subtitle=", textAtom);
        d11.append(textAtom2);
        d11.append(", value=");
        d11.append(i11);
        d11.append(", minValue=");
        a.f(i12, i13, ", maxValue=", ", minusButtonEnabled=", d11);
        f.c(", plusButtonEnabled=", ", maxValueRestriction=", d11, z11, z12);
        d11.append(restriction);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ QuantityCellVO(String str, TextAtom textAtom, TextAtom textAtom2, int i11, int i12, int i13, boolean z11, boolean z12, Restriction restriction, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textAtom, textAtom2, i11, i12, i13, z11, z12, (i14 & 256) != 0 ? null : restriction);
    }
}
