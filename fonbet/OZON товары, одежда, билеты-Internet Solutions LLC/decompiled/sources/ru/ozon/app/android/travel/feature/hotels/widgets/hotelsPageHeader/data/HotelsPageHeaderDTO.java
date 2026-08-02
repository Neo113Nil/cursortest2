package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.data;

import B90.C2619v;
import C.o0;
import G.g;
import Kk.C3532b;
import Ve.C4636t5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003123Bg\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003Ju\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010 R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO;", "", "badges", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "mirBadge", "stars", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "priceInfo", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PriceInfo;", "isPremium", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PriceInfo;ZLjava/util/Map;)V", "getBadges", "()Ljava/util/List;", "getMirBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getStars", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "getAddress", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "getPriceInfo", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PriceInfo;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "PriceInfo", "PriceData", "PremiumInfo", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageHeaderDTO {
    public static final int $stable = 8;
    private final LinkButtonDTO address;

    @NotNull
    private final List<Badge> badges;
    private final boolean isPremium;
    private final Badge mirBadge;
    private final PriceInfo priceInfo;
    private final TextAtom stars;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PremiumInfo;", "", "premiumButton", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "backgroundColor", "", "darkBackgroundColor", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;Ljava/lang/String;Ljava/lang/String;)V", "getPremiumButton", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "getBackgroundColor", "()Ljava/lang/String;", "getDarkBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumInfo {
        public static final int $stable = 8;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final String darkBackgroundColor;

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon premiumButton;

        public PremiumInfo(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon premiumButton, @NotNull String backgroundColor, @NotNull String darkBackgroundColor) {
            Intrinsics.checkNotNullParameter(premiumButton, "premiumButton");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(darkBackgroundColor, "darkBackgroundColor");
            this.premiumButton = premiumButton;
            this.backgroundColor = backgroundColor;
            this.darkBackgroundColor = darkBackgroundColor;
        }

        public static /* synthetic */ PremiumInfo copy$default(PremiumInfo premiumInfo, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellWithSubtitle24Icon = premiumInfo.premiumButton;
            }
            if ((i11 & 2) != 0) {
                str = premiumInfo.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                str2 = premiumInfo.darkBackgroundColor;
            }
            return premiumInfo.copy(cellWithSubtitle24Icon, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getPremiumButton() {
            return this.premiumButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDarkBackgroundColor() {
            return this.darkBackgroundColor;
        }

        @NotNull
        public final PremiumInfo copy(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon premiumButton, @NotNull String backgroundColor, @NotNull String darkBackgroundColor) {
            Intrinsics.checkNotNullParameter(premiumButton, "premiumButton");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(darkBackgroundColor, "darkBackgroundColor");
            return new PremiumInfo(premiumButton, backgroundColor, darkBackgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PremiumInfo)) {
                return false;
            }
            PremiumInfo premiumInfo = (PremiumInfo) other;
            return Intrinsics.d(this.premiumButton, premiumInfo.premiumButton) && Intrinsics.d(this.backgroundColor, premiumInfo.backgroundColor) && Intrinsics.d(this.darkBackgroundColor, premiumInfo.darkBackgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getDarkBackgroundColor() {
            return this.darkBackgroundColor;
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getPremiumButton() {
            return this.premiumButton;
        }

        public int hashCode() {
            return this.darkBackgroundColor.hashCode() + g.a(this.premiumButton.hashCode() * 31, 31, this.backgroundColor);
        }

        @NotNull
        public String toString() {
            CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon = this.premiumButton;
            String str = this.backgroundColor;
            String str2 = this.darkBackgroundColor;
            StringBuilder sb2 = new StringBuilder("PremiumInfo(premiumButton=");
            sb2.append(cellWithSubtitle24Icon);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", darkBackgroundColor=");
            return o0.c(sb2, str2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PriceData;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/data/price/Price;", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "premiumInfo", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PremiumInfo;", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PremiumInfo;)V", "getValue", "()Lru/ozon/uni/atoms/data/price/Price;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPremiumInfo", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PremiumInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceData {
        public static final int $stable = 8;

        @NotNull
        private final TextAtom description;
        private final PremiumInfo premiumInfo;

        @NotNull
        private final Price value;

        public PriceData(@NotNull Price value, @NotNull TextAtom description, PremiumInfo premiumInfo) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(description, "description");
            this.value = value;
            this.description = description;
            this.premiumInfo = premiumInfo;
        }

        public static /* synthetic */ PriceData copy$default(PriceData priceData, Price price, TextAtom textAtom, PremiumInfo premiumInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                price = priceData.value;
            }
            if ((i11 & 2) != 0) {
                textAtom = priceData.description;
            }
            if ((i11 & 4) != 0) {
                premiumInfo = priceData.premiumInfo;
            }
            return priceData.copy(price, textAtom, premiumInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Price getValue() {
            return this.value;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final PremiumInfo getPremiumInfo() {
            return this.premiumInfo;
        }

        @NotNull
        public final PriceData copy(@NotNull Price value, @NotNull TextAtom description, PremiumInfo premiumInfo) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(description, "description");
            return new PriceData(value, description, premiumInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceData)) {
                return false;
            }
            PriceData priceData = (PriceData) other;
            return Intrinsics.d(this.value, priceData.value) && Intrinsics.d(this.description, priceData.description) && Intrinsics.d(this.premiumInfo, priceData.premiumInfo);
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        public final PremiumInfo getPremiumInfo() {
            return this.premiumInfo;
        }

        @NotNull
        public final Price getValue() {
            return this.value;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.value.hashCode() * 31, 31, this.description);
            PremiumInfo premiumInfo = this.premiumInfo;
            return b11 + (premiumInfo == null ? 0 : premiumInfo.hashCode());
        }

        @NotNull
        public String toString() {
            return "PriceData(value=" + this.value + ", description=" + this.description + ", premiumInfo=" + this.premiumInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PriceInfo;", "", "price", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PriceData;", "searchParamButton", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PriceData;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;)V", "getPrice", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PriceData;", "getSearchParamButton", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceInfo {
        public static final int $stable = 8;
        private final PriceData price;
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon searchParamButton;

        public PriceInfo(PriceData priceData, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon) {
            this.price = priceData;
            this.searchParamButton = cellWithSubtitle24Icon;
        }

        public static /* synthetic */ PriceInfo copy$default(PriceInfo priceInfo, PriceData priceData, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceData = priceInfo.price;
            }
            if ((i11 & 2) != 0) {
                cellWithSubtitle24Icon = priceInfo.searchParamButton;
            }
            return priceInfo.copy(priceData, cellWithSubtitle24Icon);
        }

        /* renamed from: component1, reason: from getter */
        public final PriceData getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getSearchParamButton() {
            return this.searchParamButton;
        }

        @NotNull
        public final PriceInfo copy(PriceData price, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon searchParamButton) {
            return new PriceInfo(price, searchParamButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceInfo)) {
                return false;
            }
            PriceInfo priceInfo = (PriceInfo) other;
            return Intrinsics.d(this.price, priceInfo.price) && Intrinsics.d(this.searchParamButton, priceInfo.searchParamButton);
        }

        public final PriceData getPrice() {
            return this.price;
        }

        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getSearchParamButton() {
            return this.searchParamButton;
        }

        public int hashCode() {
            PriceData priceData = this.price;
            int hashCode = (priceData == null ? 0 : priceData.hashCode()) * 31;
            CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon = this.searchParamButton;
            return hashCode + (cellWithSubtitle24Icon != null ? cellWithSubtitle24Icon.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PriceInfo(price=" + this.price + ", searchParamButton=" + this.searchParamButton + ")";
        }
    }

    public HotelsPageHeaderDTO(@NotNull List<Badge> badges, Badge badge, TextAtom textAtom, @NotNull TextAtom title, LinkButtonDTO linkButtonDTO, PriceInfo priceInfo, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(title, "title");
        this.badges = badges;
        this.mirBadge = badge;
        this.stars = textAtom;
        this.title = title;
        this.address = linkButtonDTO;
        this.priceInfo = priceInfo;
        this.isPremium = z11;
        this.trackingInfo = map;
    }

    public static /* synthetic */ HotelsPageHeaderDTO copy$default(HotelsPageHeaderDTO hotelsPageHeaderDTO, List list, Badge badge, TextAtom textAtom, TextAtom textAtom2, LinkButtonDTO linkButtonDTO, PriceInfo priceInfo, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsPageHeaderDTO.badges;
        }
        if ((i11 & 2) != 0) {
            badge = hotelsPageHeaderDTO.mirBadge;
        }
        if ((i11 & 4) != 0) {
            textAtom = hotelsPageHeaderDTO.stars;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = hotelsPageHeaderDTO.title;
        }
        if ((i11 & 16) != 0) {
            linkButtonDTO = hotelsPageHeaderDTO.address;
        }
        if ((i11 & 32) != 0) {
            priceInfo = hotelsPageHeaderDTO.priceInfo;
        }
        if ((i11 & 64) != 0) {
            z11 = hotelsPageHeaderDTO.isPremium;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = hotelsPageHeaderDTO.trackingInfo;
        }
        boolean z12 = z11;
        Map map2 = map;
        LinkButtonDTO linkButtonDTO2 = linkButtonDTO;
        PriceInfo priceInfo2 = priceInfo;
        return hotelsPageHeaderDTO.copy(list, badge, textAtom, textAtom2, linkButtonDTO2, priceInfo2, z12, map2);
    }

    @NotNull
    public final List<Badge> component1() {
        return this.badges;
    }

    /* renamed from: component2, reason: from getter */
    public final Badge getMirBadge() {
        return this.mirBadge;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getStars() {
        return this.stars;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final LinkButtonDTO getAddress() {
        return this.address;
    }

    /* renamed from: component6, reason: from getter */
    public final PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsPremium() {
        return this.isPremium;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsPageHeaderDTO copy(@NotNull List<Badge> badges, Badge mirBadge, TextAtom stars, @NotNull TextAtom title, LinkButtonDTO address, PriceInfo priceInfo, boolean isPremium, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(title, "title");
        return new HotelsPageHeaderDTO(badges, mirBadge, stars, title, address, priceInfo, isPremium, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageHeaderDTO)) {
            return false;
        }
        HotelsPageHeaderDTO hotelsPageHeaderDTO = (HotelsPageHeaderDTO) other;
        return Intrinsics.d(this.badges, hotelsPageHeaderDTO.badges) && Intrinsics.d(this.mirBadge, hotelsPageHeaderDTO.mirBadge) && Intrinsics.d(this.stars, hotelsPageHeaderDTO.stars) && Intrinsics.d(this.title, hotelsPageHeaderDTO.title) && Intrinsics.d(this.address, hotelsPageHeaderDTO.address) && Intrinsics.d(this.priceInfo, hotelsPageHeaderDTO.priceInfo) && this.isPremium == hotelsPageHeaderDTO.isPremium && Intrinsics.d(this.trackingInfo, hotelsPageHeaderDTO.trackingInfo);
    }

    public final LinkButtonDTO getAddress() {
        return this.address;
    }

    @NotNull
    public final List<Badge> getBadges() {
        return this.badges;
    }

    public final Badge getMirBadge() {
        return this.mirBadge;
    }

    public final PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public final TextAtom getStars() {
        return this.stars;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.badges.hashCode() * 31;
        Badge badge = this.mirBadge;
        int hashCode2 = (hashCode + (badge == null ? 0 : badge.hashCode())) * 31;
        TextAtom textAtom = this.stars;
        int b11 = C2619v.b((hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.title);
        LinkButtonDTO linkButtonDTO = this.address;
        int hashCode3 = (b11 + (linkButtonDTO == null ? 0 : linkButtonDTO.hashCode())) * 31;
        PriceInfo priceInfo = this.priceInfo;
        int a11 = C3532b.a((hashCode3 + (priceInfo == null ? 0 : priceInfo.hashCode())) * 31, 31, this.isPremium);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isPremium() {
        return this.isPremium;
    }

    @NotNull
    public String toString() {
        List<Badge> list = this.badges;
        Badge badge = this.mirBadge;
        TextAtom textAtom = this.stars;
        TextAtom textAtom2 = this.title;
        LinkButtonDTO linkButtonDTO = this.address;
        PriceInfo priceInfo = this.priceInfo;
        boolean z11 = this.isPremium;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("HotelsPageHeaderDTO(badges=");
        sb2.append(list);
        sb2.append(", mirBadge=");
        sb2.append(badge);
        sb2.append(", stars=");
        C4636t5.c(", title=", ", address=", sb2, textAtom, textAtom2);
        sb2.append(linkButtonDTO);
        sb2.append(", priceInfo=");
        sb2.append(priceInfo);
        sb2.append(", isPremium=");
        sb2.append(z11);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }

    public HotelsPageHeaderDTO(List list, Badge badge, TextAtom textAtom, TextAtom textAtom2, LinkButtonDTO linkButtonDTO, PriceInfo priceInfo, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, badge, textAtom, textAtom2, linkButtonDTO, priceInfo, (i11 & 64) != 0 ? false : z11, map);
    }
}
