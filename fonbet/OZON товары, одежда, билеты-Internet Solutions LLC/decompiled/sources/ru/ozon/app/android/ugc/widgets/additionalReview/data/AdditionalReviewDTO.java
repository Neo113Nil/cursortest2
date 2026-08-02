package ru.ozon.app.android.ugc.widgets.additionalReview.data;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import I0.C3173b;
import J.d;
import N3.C3660k;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import spay.sdk.domain.model.FraudMonInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004+,-.BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010#\u001a\u00020\u000fHÆ\u0003JW\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO;", "", "bonus", "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Bonus;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Product;", "rating", "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Rating;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "displayType", "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$DisplayType;", "<init>", "(Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Bonus;Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Product;Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Rating;Ljava/util/Map;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$DisplayType;)V", "getBonus", "()Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Bonus;", "getProduct", "()Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Product;", "getRating", "()Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Rating;", "getTrackingInfo", "()Ljava/util/Map;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getDisplayType", "()Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$DisplayType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Bonus", "Product", "Rating", "DisplayType", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdditionalReviewDTO {
    public static final int $stable = 8;
    private final Bonus bonus;
    private final CornerRadius cornerRadius;

    @NotNull
    private final DisplayType displayType;

    @NotNull
    private final Product product;

    @NotNull
    private final Rating rating;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Bonus;", "", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getTitle", "getTitleColor", "getBackgroundColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bonus {
        public static final int $stable = 0;
        private final String backgroundColor;

        @NotNull
        private final String icon;

        @NotNull
        private final String title;
        private final String titleColor;

        public Bonus(@NotNull String icon, @NotNull String title, String str, String str2) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
            this.titleColor = str;
            this.backgroundColor = str2;
        }

        public static /* synthetic */ Bonus copy$default(Bonus bonus, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bonus.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = bonus.title;
            }
            if ((i11 & 4) != 0) {
                str3 = bonus.titleColor;
            }
            if ((i11 & 8) != 0) {
                str4 = bonus.backgroundColor;
            }
            return bonus.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitleColor() {
            return this.titleColor;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final Bonus copy(@NotNull String icon, @NotNull String title, String titleColor, String backgroundColor) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Bonus(icon, title, titleColor, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bonus)) {
                return false;
            }
            Bonus bonus = (Bonus) other;
            return Intrinsics.d(this.icon, bonus.icon) && Intrinsics.d(this.title, bonus.title) && Intrinsics.d(this.titleColor, bonus.titleColor) && Intrinsics.d(this.backgroundColor, bonus.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final String getTitleColor() {
            return this.titleColor;
        }

        public int hashCode() {
            int a11 = g.a(this.icon.hashCode() * 31, 31, this.title);
            String str = this.titleColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.title;
            return C3173b.c(C3660k.d("Bonus(icon=", str, ", title=", str2, ", titleColor="), this.titleColor, ", backgroundColor=", this.backgroundColor, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$DisplayType;", "", "<init>", "(Ljava/lang/String;I)V", FraudMonInfo.UNKNOWN, "OVERLAY", "PLAIN", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisplayType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DisplayType[] $VALUES;
        public static final DisplayType UNKNOWN = new DisplayType(FraudMonInfo.UNKNOWN, 0);
        public static final DisplayType OVERLAY = new DisplayType("OVERLAY", 1);
        public static final DisplayType PLAIN = new DisplayType("PLAIN", 2);

        private static final /* synthetic */ DisplayType[] $values() {
            return new DisplayType[]{UNKNOWN, OVERLAY, PLAIN};
        }

        static {
            DisplayType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DisplayType(String str, int i11) {
        }

        public static DisplayType valueOf(String str) {
            return (DisplayType) Enum.valueOf(DisplayType.class, str);
        }

        public static DisplayType[] values() {
            return (DisplayType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Product;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "imageAtom", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getId", "()J", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getImageAtom", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final long id;

        @NotNull
        private final ImageDTO imageAtom;

        @NotNull
        private final TextAtom name;
        private final Map<String, TokenizedTrackingInfo> tracking;

        public Product(long j11, @NotNull TextAtom name, @NotNull ImageDTO imageAtom, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(imageAtom, "imageAtom");
            this.id = j11;
            this.name = name;
            this.imageAtom = imageAtom;
            this.action = atomActionDTO;
            this.tracking = map;
        }

        public static /* synthetic */ Product copy$default(Product product, long j11, TextAtom textAtom, ImageDTO imageDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = product.id;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                textAtom = product.name;
            }
            TextAtom textAtom2 = textAtom;
            if ((i11 & 4) != 0) {
                imageDTO = product.imageAtom;
            }
            ImageDTO imageDTO2 = imageDTO;
            if ((i11 & 8) != 0) {
                atomActionDTO = product.action;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            if ((i11 & 16) != 0) {
                map = product.tracking;
            }
            return product.copy(j12, textAtom2, imageDTO2, atomActionDTO2, map);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ImageDTO getImageAtom() {
            return this.imageAtom;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.tracking;
        }

        @NotNull
        public final Product copy(long id2, @NotNull TextAtom name, @NotNull ImageDTO imageAtom, AtomActionDTO action, Map<String, TokenizedTrackingInfo> tracking) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(imageAtom, "imageAtom");
            return new Product(id2, name, imageAtom, action, tracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return this.id == product.id && Intrinsics.d(this.name, product.name) && Intrinsics.d(this.imageAtom, product.imageAtom) && Intrinsics.d(this.action, product.action) && Intrinsics.d(this.tracking, product.tracking);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final ImageDTO getImageAtom() {
            return this.imageAtom;
        }

        @NotNull
        public final TextAtom getName() {
            return this.name;
        }

        public final Map<String, TokenizedTrackingInfo> getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            int b11 = Nh.a.b(this.imageAtom, C2619v.b(Long.hashCode(this.id) * 31, 31, this.name), 31);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.name;
            ImageDTO imageDTO = this.imageAtom;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            StringBuilder c11 = C2639a.c("Product(id=", j11, ", name=", textAtom);
            c11.append(", imageAtom=");
            c11.append(imageDTO);
            c11.append(", action=");
            c11.append(atomActionDTO);
            return C2639a.b(c11, ", tracking=", map, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Rating;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "stars", "", "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Rating$Star;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getStars", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Star", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Rating {
        public static final int $stable = 8;

        @NotNull
        private final List<Star> stars;

        @NotNull
        private final TextAtom text;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0004\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Rating$Star;", "", "link", "", "isSelected", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "getLink", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Rating$Star;", "equals", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Star {
            public static final int $stable = 8;
            private final Boolean isSelected;

            @NotNull
            private final String link;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public Star(@NotNull String link, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
                this.isSelected = bool;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Star copy$default(Star star, String str, Boolean bool, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = star.link;
                }
                if ((i11 & 2) != 0) {
                    bool = star.isSelected;
                }
                if ((i11 & 4) != 0) {
                    map = star.trackingInfo;
                }
                return star.copy(str, bool, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            /* renamed from: component2, reason: from getter */
            public final Boolean getIsSelected() {
                return this.isSelected;
            }

            public final Map<String, TokenizedTrackingInfo> component3() {
                return this.trackingInfo;
            }

            @NotNull
            public final Star copy(@NotNull String link, Boolean isSelected, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(link, "link");
                return new Star(link, isSelected, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Star)) {
                    return false;
                }
                Star star = (Star) other;
                return Intrinsics.d(this.link, star.link) && Intrinsics.d(this.isSelected, star.isSelected) && Intrinsics.d(this.trackingInfo, star.trackingInfo);
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.link.hashCode() * 31;
                Boolean bool = this.isSelected;
                int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode2 + (map != null ? map.hashCode() : 0);
            }

            public final Boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                String str = this.link;
                Boolean bool = this.isSelected;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("Star(link=");
                sb2.append(str);
                sb2.append(", isSelected=");
                sb2.append(bool);
                sb2.append(", trackingInfo=");
                return P.f(sb2, map, ")");
            }
        }

        public Rating(@NotNull TextAtom text, @NotNull List<Star> stars) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(stars, "stars");
            this.text = text;
            this.stars = stars;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Rating copy$default(Rating rating, TextAtom textAtom, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = rating.text;
            }
            if ((i11 & 2) != 0) {
                list = rating.stars;
            }
            return rating.copy(textAtom, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        @NotNull
        public final List<Star> component2() {
            return this.stars;
        }

        @NotNull
        public final Rating copy(@NotNull TextAtom text, @NotNull List<Star> stars) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(stars, "stars");
            return new Rating(text, stars);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rating)) {
                return false;
            }
            Rating rating = (Rating) other;
            return Intrinsics.d(this.text, rating.text) && Intrinsics.d(this.stars, rating.stars);
        }

        @NotNull
        public final List<Star> getStars() {
            return this.stars;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.stars.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.c("Rating(text=", this.text, ", stars=", this.stars, ")");
        }
    }

    public AdditionalReviewDTO(Bonus bonus, @NotNull Product product, @NotNull Rating rating, Map<String, TokenizedTrackingInfo> map, CornerRadius cornerRadius, @NotNull DisplayType displayType) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        this.bonus = bonus;
        this.product = product;
        this.rating = rating;
        this.trackingInfo = map;
        this.cornerRadius = cornerRadius;
        this.displayType = displayType;
    }

    public static /* synthetic */ AdditionalReviewDTO copy$default(AdditionalReviewDTO additionalReviewDTO, Bonus bonus, Product product, Rating rating, Map map, CornerRadius cornerRadius, DisplayType displayType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bonus = additionalReviewDTO.bonus;
        }
        if ((i11 & 2) != 0) {
            product = additionalReviewDTO.product;
        }
        if ((i11 & 4) != 0) {
            rating = additionalReviewDTO.rating;
        }
        if ((i11 & 8) != 0) {
            map = additionalReviewDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            cornerRadius = additionalReviewDTO.cornerRadius;
        }
        if ((i11 & 32) != 0) {
            displayType = additionalReviewDTO.displayType;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        DisplayType displayType2 = displayType;
        return additionalReviewDTO.copy(bonus, product, rating, map, cornerRadius2, displayType2);
    }

    /* renamed from: component1, reason: from getter */
    public final Bonus getBonus() {
        return this.bonus;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Product getProduct() {
        return this.product;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Rating getRating() {
        return this.rating;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    @NotNull
    public final AdditionalReviewDTO copy(Bonus bonus, @NotNull Product product, @NotNull Rating rating, Map<String, TokenizedTrackingInfo> trackingInfo, CornerRadius cornerRadius, @NotNull DisplayType displayType) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        return new AdditionalReviewDTO(bonus, product, rating, trackingInfo, cornerRadius, displayType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalReviewDTO)) {
            return false;
        }
        AdditionalReviewDTO additionalReviewDTO = (AdditionalReviewDTO) other;
        return Intrinsics.d(this.bonus, additionalReviewDTO.bonus) && Intrinsics.d(this.product, additionalReviewDTO.product) && Intrinsics.d(this.rating, additionalReviewDTO.rating) && Intrinsics.d(this.trackingInfo, additionalReviewDTO.trackingInfo) && this.cornerRadius == additionalReviewDTO.cornerRadius && this.displayType == additionalReviewDTO.displayType;
    }

    public final Bonus getBonus() {
        return this.bonus;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    @NotNull
    public final Product getProduct() {
        return this.product;
    }

    @NotNull
    public final Rating getRating() {
        return this.rating;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Bonus bonus = this.bonus;
        int hashCode = (this.rating.hashCode() + ((this.product.hashCode() + ((bonus == null ? 0 : bonus.hashCode()) * 31)) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        return this.displayType.hashCode() + ((hashCode2 + (cornerRadius != null ? cornerRadius.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "AdditionalReviewDTO(bonus=" + this.bonus + ", product=" + this.product + ", rating=" + this.rating + ", trackingInfo=" + this.trackingInfo + ", cornerRadius=" + this.cornerRadius + ", displayType=" + this.displayType + ")";
    }

    public /* synthetic */ AdditionalReviewDTO(Bonus bonus, Product product, Rating rating, Map map, CornerRadius cornerRadius, DisplayType displayType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bonus, product, rating, map, cornerRadius, (i11 & 32) != 0 ? DisplayType.OVERLAY : displayType);
    }
}
