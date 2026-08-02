package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.data;

import Ak.C2436a;
import B90.C2619v;
import Bl.C2639a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.rating.RatingAtom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Je\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductDTO;", "", "id", "", "coverImage", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "createdAt", "rating", "Lru/ozon/uni/atoms/data/rating/RatingAtom;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "deeplink", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/rating/RatingAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getId", "()J", "getCoverImage", "()Ljava/lang/String;", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCreatedAt", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingAtom;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getDeeplink", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReviewProductDTO {
    public static final int $stable;
    private final ButtonV3Atom.SmallButton button;
    private final CornerRadius cornerRadius;
    private final String coverImage;
    private final TextAtom createdAt;
    private final String deeplink;
    private final long id;

    @NotNull
    private final TextAtom name;
    private final RatingAtom rating;

    static {
        int i11 = ButtonV3Atom.SmallButton.$stable | RatingAtom.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | i12;
    }

    public ReviewProductDTO(long j11, String str, @NotNull TextAtom name, TextAtom textAtom, RatingAtom ratingAtom, ButtonV3Atom.SmallButton smallButton, String str2, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j11;
        this.coverImage = str;
        this.name = name;
        this.createdAt = textAtom;
        this.rating = ratingAtom;
        this.button = smallButton;
        this.deeplink = str2;
        this.cornerRadius = cornerRadius;
    }

    public static /* synthetic */ ReviewProductDTO copy$default(ReviewProductDTO reviewProductDTO, long j11, String str, TextAtom textAtom, TextAtom textAtom2, RatingAtom ratingAtom, ButtonV3Atom.SmallButton smallButton, String str2, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = reviewProductDTO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = reviewProductDTO.coverImage;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            textAtom = reviewProductDTO.name;
        }
        TextAtom textAtom3 = textAtom;
        if ((i11 & 8) != 0) {
            textAtom2 = reviewProductDTO.createdAt;
        }
        return reviewProductDTO.copy(j12, str3, textAtom3, textAtom2, (i11 & 16) != 0 ? reviewProductDTO.rating : ratingAtom, (i11 & 32) != 0 ? reviewProductDTO.button : smallButton, (i11 & 64) != 0 ? reviewProductDTO.deeplink : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewProductDTO.cornerRadius : cornerRadius);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCoverImage() {
        return this.coverImage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component5, reason: from getter */
    public final RatingAtom getRating() {
        return this.rating;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component8, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final ReviewProductDTO copy(long id2, String coverImage, @NotNull TextAtom name, TextAtom createdAt, RatingAtom rating, ButtonV3Atom.SmallButton button, String deeplink, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ReviewProductDTO(id2, coverImage, name, createdAt, rating, button, deeplink, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewProductDTO)) {
            return false;
        }
        ReviewProductDTO reviewProductDTO = (ReviewProductDTO) other;
        return this.id == reviewProductDTO.id && Intrinsics.d(this.coverImage, reviewProductDTO.coverImage) && Intrinsics.d(this.name, reviewProductDTO.name) && Intrinsics.d(this.createdAt, reviewProductDTO.createdAt) && Intrinsics.d(this.rating, reviewProductDTO.rating) && Intrinsics.d(this.button, reviewProductDTO.button) && Intrinsics.d(this.deeplink, reviewProductDTO.deeplink) && this.cornerRadius == reviewProductDTO.cornerRadius;
    }

    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final TextAtom getCreatedAt() {
        return this.createdAt;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final TextAtom getName() {
        return this.name;
    }

    public final RatingAtom getRating() {
        return this.rating;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.coverImage;
        int b11 = C2619v.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.name);
        TextAtom textAtom = this.createdAt;
        int hashCode2 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        RatingAtom ratingAtom = this.rating;
        int hashCode3 = (hashCode2 + (ratingAtom == null ? 0 : ratingAtom.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.button;
        int hashCode4 = (hashCode3 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        String str2 = this.deeplink;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        return hashCode5 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.coverImage;
        TextAtom textAtom = this.name;
        TextAtom textAtom2 = this.createdAt;
        RatingAtom ratingAtom = this.rating;
        ButtonV3Atom.SmallButton smallButton = this.button;
        String str2 = this.deeplink;
        CornerRadius cornerRadius = this.cornerRadius;
        StringBuilder c11 = C2436a.c(j11, "ReviewProductDTO(id=", ", coverImage=", str);
        C2639a.e(", name=", ", createdAt=", c11, textAtom, textAtom2);
        c11.append(", rating=");
        c11.append(ratingAtom);
        c11.append(", button=");
        c11.append(smallButton);
        c11.append(", deeplink=");
        c11.append(str2);
        c11.append(", cornerRadius=");
        c11.append(cornerRadius);
        c11.append(")");
        return c11.toString();
    }
}
