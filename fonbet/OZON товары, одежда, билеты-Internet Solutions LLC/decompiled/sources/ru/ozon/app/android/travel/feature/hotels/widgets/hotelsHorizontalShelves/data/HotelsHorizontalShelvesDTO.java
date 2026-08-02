package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.data;

import G.g;
import Nh.a;
import Pk0.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardDTO;
import ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardOptions;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.uni.core.UniGradient;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\t\u00104\u001a\u00020\u0010HÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u008b\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006?"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/data/HotelsHorizontalShelvesDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "backgroundImage", "", "backgroundToken", "backgroundGradient", "Lru/ozon/uni/core/UniGradient;", "cards", "", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "imageAspectRatio", "", "cardsOnScreen", "cardOptions", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardOptions;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/core/UniGradient;Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;FFLru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardOptions;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBackgroundImage", "()Ljava/lang/String;", "getBackgroundToken", "getBackgroundGradient", "()Lru/ozon/uni/core/UniGradient;", "getCards$annotations", "()V", "getCards", "()Ljava/util/List;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getImageAspectRatio", "()F", "getCardsOnScreen", "getCardOptions", "()Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardOptions;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsHorizontalShelvesDTO {
    public static final int $stable = 8;
    private final UniGradient backgroundGradient;
    private final String backgroundImage;
    private final String backgroundToken;
    private final ShelfCardOptions cardOptions;

    @NotNull
    private final List<ShelfCardDTO> cards;
    private final float cardsOnScreen;
    private final CommonControlSettings common;

    @EnumNullFallback
    @NotNull
    private final CornerRadius cornerRadius;
    private final float imageAspectRatio;
    private final TextDTO subtitle;
    private final TextDTO title;

    public HotelsHorizontalShelvesDTO(TextDTO textDTO, TextDTO textDTO2, String str, String str2, UniGradient uniGradient, @NotNull List<ShelfCardDTO> cards, @NotNull CornerRadius cornerRadius, float f7, float f11, ShelfCardOptions shelfCardOptions, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.backgroundImage = str;
        this.backgroundToken = str2;
        this.backgroundGradient = uniGradient;
        this.cards = cards;
        this.cornerRadius = cornerRadius;
        this.imageAspectRatio = f7;
        this.cardsOnScreen = f11;
        this.cardOptions = shelfCardOptions;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ HotelsHorizontalShelvesDTO copy$default(HotelsHorizontalShelvesDTO hotelsHorizontalShelvesDTO, TextDTO textDTO, TextDTO textDTO2, String str, String str2, UniGradient uniGradient, List list, CornerRadius cornerRadius, float f7, float f11, ShelfCardOptions shelfCardOptions, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = hotelsHorizontalShelvesDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = hotelsHorizontalShelvesDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str = hotelsHorizontalShelvesDTO.backgroundImage;
        }
        if ((i11 & 8) != 0) {
            str2 = hotelsHorizontalShelvesDTO.backgroundToken;
        }
        if ((i11 & 16) != 0) {
            uniGradient = hotelsHorizontalShelvesDTO.backgroundGradient;
        }
        if ((i11 & 32) != 0) {
            list = hotelsHorizontalShelvesDTO.cards;
        }
        if ((i11 & 64) != 0) {
            cornerRadius = hotelsHorizontalShelvesDTO.cornerRadius;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            f7 = hotelsHorizontalShelvesDTO.imageAspectRatio;
        }
        if ((i11 & 256) != 0) {
            f11 = hotelsHorizontalShelvesDTO.cardsOnScreen;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            shelfCardOptions = hotelsHorizontalShelvesDTO.cardOptions;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            commonControlSettings = hotelsHorizontalShelvesDTO.common;
        }
        ShelfCardOptions shelfCardOptions2 = shelfCardOptions;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        float f12 = f7;
        float f13 = f11;
        List list2 = list;
        CornerRadius cornerRadius2 = cornerRadius;
        UniGradient uniGradient2 = uniGradient;
        String str3 = str;
        return hotelsHorizontalShelvesDTO.copy(textDTO, textDTO2, str3, str2, uniGradient2, list2, cornerRadius2, f12, f13, shelfCardOptions2, commonControlSettings2);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getCards$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final ShelfCardOptions getCardOptions() {
        return this.cardOptions;
    }

    /* renamed from: component11, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundToken() {
        return this.backgroundToken;
    }

    /* renamed from: component5, reason: from getter */
    public final UniGradient getBackgroundGradient() {
        return this.backgroundGradient;
    }

    @NotNull
    public final List<ShelfCardDTO> component6() {
        return this.cards;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component8, reason: from getter */
    public final float getImageAspectRatio() {
        return this.imageAspectRatio;
    }

    /* renamed from: component9, reason: from getter */
    public final float getCardsOnScreen() {
        return this.cardsOnScreen;
    }

    @NotNull
    public final HotelsHorizontalShelvesDTO copy(TextDTO title, TextDTO subtitle, String backgroundImage, String backgroundToken, UniGradient backgroundGradient, @NotNull List<ShelfCardDTO> cards, @NotNull CornerRadius cornerRadius, float imageAspectRatio, float cardsOnScreen, ShelfCardOptions cardOptions, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        return new HotelsHorizontalShelvesDTO(title, subtitle, backgroundImage, backgroundToken, backgroundGradient, cards, cornerRadius, imageAspectRatio, cardsOnScreen, cardOptions, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsHorizontalShelvesDTO)) {
            return false;
        }
        HotelsHorizontalShelvesDTO hotelsHorizontalShelvesDTO = (HotelsHorizontalShelvesDTO) other;
        return Intrinsics.d(this.title, hotelsHorizontalShelvesDTO.title) && Intrinsics.d(this.subtitle, hotelsHorizontalShelvesDTO.subtitle) && Intrinsics.d(this.backgroundImage, hotelsHorizontalShelvesDTO.backgroundImage) && Intrinsics.d(this.backgroundToken, hotelsHorizontalShelvesDTO.backgroundToken) && Intrinsics.d(this.backgroundGradient, hotelsHorizontalShelvesDTO.backgroundGradient) && Intrinsics.d(this.cards, hotelsHorizontalShelvesDTO.cards) && this.cornerRadius == hotelsHorizontalShelvesDTO.cornerRadius && Float.compare(this.imageAspectRatio, hotelsHorizontalShelvesDTO.imageAspectRatio) == 0 && Float.compare(this.cardsOnScreen, hotelsHorizontalShelvesDTO.cardsOnScreen) == 0 && Intrinsics.d(this.cardOptions, hotelsHorizontalShelvesDTO.cardOptions) && Intrinsics.d(this.common, hotelsHorizontalShelvesDTO.common);
    }

    public final UniGradient getBackgroundGradient() {
        return this.backgroundGradient;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getBackgroundToken() {
        return this.backgroundToken;
    }

    public final ShelfCardOptions getCardOptions() {
        return this.cardOptions;
    }

    @NotNull
    public final List<ShelfCardDTO> getCards() {
        return this.cards;
    }

    public final float getCardsOnScreen() {
        return this.cardsOnScreen;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final float getImageAspectRatio() {
        return this.imageAspectRatio;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        String str = this.backgroundImage;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundToken;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniGradient uniGradient = this.backgroundGradient;
        int a11 = b.a(this.cardsOnScreen, b.a(this.imageAspectRatio, Tl.b.b(this.cornerRadius, g.b((hashCode4 + (uniGradient == null ? 0 : uniGradient.hashCode())) * 31, 31, this.cards), 31), 31), 31);
        ShelfCardOptions shelfCardOptions = this.cardOptions;
        int hashCode5 = (a11 + (shelfCardOptions == null ? 0 : shelfCardOptions.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode5 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        String str = this.backgroundImage;
        String str2 = this.backgroundToken;
        UniGradient uniGradient = this.backgroundGradient;
        List<ShelfCardDTO> list = this.cards;
        CornerRadius cornerRadius = this.cornerRadius;
        float f7 = this.imageAspectRatio;
        float f11 = this.cardsOnScreen;
        ShelfCardOptions shelfCardOptions = this.cardOptions;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder g10 = D3.g.g("HotelsHorizontalShelvesDTO(title=", textDTO, ", subtitle=", textDTO2, ", backgroundImage=");
        a.h(g10, str, ", backgroundToken=", str2, ", backgroundGradient=");
        g10.append(uniGradient);
        g10.append(", cards=");
        g10.append(list);
        g10.append(", cornerRadius=");
        g10.append(cornerRadius);
        g10.append(", imageAspectRatio=");
        g10.append(f7);
        g10.append(", cardsOnScreen=");
        g10.append(f11);
        g10.append(", cardOptions=");
        g10.append(shelfCardOptions);
        g10.append(", common=");
        return Ak.b.g(g10, commonControlSettings, ")");
    }

    public HotelsHorizontalShelvesDTO(TextDTO textDTO, TextDTO textDTO2, String str, String str2, UniGradient uniGradient, List list, CornerRadius cornerRadius, float f7, float f11, ShelfCardOptions shelfCardOptions, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, str, str2, uniGradient, (i11 & 32) != 0 ? K.f71697a : list, (i11 & 64) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 1.0f : f7, (i11 & 256) != 0 ? 2.5f : f11, shelfCardOptions, commonControlSettings);
    }
}
