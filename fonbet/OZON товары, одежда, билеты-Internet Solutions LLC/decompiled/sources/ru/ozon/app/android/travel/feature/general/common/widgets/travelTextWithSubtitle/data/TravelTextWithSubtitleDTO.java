package ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.data;

import B90.C2619v;
import Ef0.c;
import HY.a;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Jh\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/data/TravelTextWithSubtitleDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "offsetTop", "", "offsetBottom", "offsetHorizontal", "offsetBetween", "isCentered", "", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getOffsetTop", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffsetBottom", "getOffsetHorizontal", "getOffsetBetween", "()Z", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/data/TravelTextWithSubtitleDTO;", "equals", "other", "hashCode", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelTextWithSubtitleDTO {
    public static final int $stable = TextAtom.$stable;
    private final String backgroundColor;
    private final boolean isCentered;
    private final Integer offsetBetween;
    private final Integer offsetBottom;
    private final Integer offsetHorizontal;
    private final Integer offsetTop;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;

    public TravelTextWithSubtitleDTO(@NotNull TextAtom title, @NotNull TextAtom subtitle, Integer num, Integer num2, Integer num3, Integer num4, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.offsetTop = num;
        this.offsetBottom = num2;
        this.offsetHorizontal = num3;
        this.offsetBetween = num4;
        this.isCentered = z11;
        this.backgroundColor = str;
    }

    public static /* synthetic */ TravelTextWithSubtitleDTO copy$default(TravelTextWithSubtitleDTO travelTextWithSubtitleDTO, TextAtom textAtom, TextAtom textAtom2, Integer num, Integer num2, Integer num3, Integer num4, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelTextWithSubtitleDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = travelTextWithSubtitleDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            num = travelTextWithSubtitleDTO.offsetTop;
        }
        if ((i11 & 8) != 0) {
            num2 = travelTextWithSubtitleDTO.offsetBottom;
        }
        if ((i11 & 16) != 0) {
            num3 = travelTextWithSubtitleDTO.offsetHorizontal;
        }
        if ((i11 & 32) != 0) {
            num4 = travelTextWithSubtitleDTO.offsetBetween;
        }
        if ((i11 & 64) != 0) {
            z11 = travelTextWithSubtitleDTO.isCentered;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str = travelTextWithSubtitleDTO.backgroundColor;
        }
        boolean z12 = z11;
        String str2 = str;
        Integer num5 = num3;
        Integer num6 = num4;
        return travelTextWithSubtitleDTO.copy(textAtom, textAtom2, num, num2, num5, num6, z12, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getOffsetTop() {
        return this.offsetTop;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getOffsetBottom() {
        return this.offsetBottom;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getOffsetHorizontal() {
        return this.offsetHorizontal;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getOffsetBetween() {
        return this.offsetBetween;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCentered() {
        return this.isCentered;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final TravelTextWithSubtitleDTO copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, Integer offsetTop, Integer offsetBottom, Integer offsetHorizontal, Integer offsetBetween, boolean isCentered, String backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new TravelTextWithSubtitleDTO(title, subtitle, offsetTop, offsetBottom, offsetHorizontal, offsetBetween, isCentered, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTextWithSubtitleDTO)) {
            return false;
        }
        TravelTextWithSubtitleDTO travelTextWithSubtitleDTO = (TravelTextWithSubtitleDTO) other;
        return Intrinsics.d(this.title, travelTextWithSubtitleDTO.title) && Intrinsics.d(this.subtitle, travelTextWithSubtitleDTO.subtitle) && Intrinsics.d(this.offsetTop, travelTextWithSubtitleDTO.offsetTop) && Intrinsics.d(this.offsetBottom, travelTextWithSubtitleDTO.offsetBottom) && Intrinsics.d(this.offsetHorizontal, travelTextWithSubtitleDTO.offsetHorizontal) && Intrinsics.d(this.offsetBetween, travelTextWithSubtitleDTO.offsetBetween) && this.isCentered == travelTextWithSubtitleDTO.isCentered && Intrinsics.d(this.backgroundColor, travelTextWithSubtitleDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getOffsetBetween() {
        return this.offsetBetween;
    }

    public final Integer getOffsetBottom() {
        return this.offsetBottom;
    }

    public final Integer getOffsetHorizontal() {
        return this.offsetHorizontal;
    }

    public final Integer getOffsetTop() {
        return this.offsetTop;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.title.hashCode() * 31, 31, this.subtitle);
        Integer num = this.offsetTop;
        int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.offsetBottom;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.offsetHorizontal;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.offsetBetween;
        int a11 = C3532b.a((hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.isCentered);
        String str = this.backgroundColor;
        return a11 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isCentered() {
        return this.isCentered;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        Integer num = this.offsetTop;
        Integer num2 = this.offsetBottom;
        Integer num3 = this.offsetHorizontal;
        Integer num4 = this.offsetBetween;
        boolean z11 = this.isCentered;
        String str = this.backgroundColor;
        StringBuilder a11 = a.a("TravelTextWithSubtitleDTO(title=", textAtom, ", subtitle=", textAtom2, ", offsetTop=");
        c.e(a11, num, ", offsetBottom=", num2, ", offsetHorizontal=");
        c.e(a11, num3, ", offsetBetween=", num4, ", isCentered=");
        a11.append(z11);
        a11.append(", backgroundColor=");
        a11.append(str);
        a11.append(")");
        return a11.toString();
    }

    public /* synthetic */ TravelTextWithSubtitleDTO(TextAtom textAtom, TextAtom textAtom2, Integer num, Integer num2, Integer num3, Integer num4, boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, textAtom2, num, num2, num3, num4, (i11 & 64) != 0 ? false : z11, str);
    }
}
