package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data;

import B0.C2454a;
import B3.p;
import B4.V;
import Cm.e;
import G.g;
import Ih.a;
import K1.G;
import N3.C3660k;
import T7.P;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorAtomDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003)*+BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Je\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO;", "", "backgroundImage", "", "leftItems", "", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$LootboxItemDTO;", "rightItems", "progressBlock", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$ProgressBlockDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$ProgressBlockDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getBackgroundImage", "()Ljava/lang/String;", "getLeftItems", "()Ljava/util/List;", "getRightItems", "getProgressBlock", "()Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$ProgressBlockDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "LootboxItemDTO", "ProgressBlockDTO", "ProgressBarDTO", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MainDrawMajorScreenDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final String backgroundImage;
    private final List<LootboxItemDTO> leftItems;

    @NotNull
    private final ProgressBlockDTO progressBlock;
    private final List<LootboxItemDTO> rightItems;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jj\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\b\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$LootboxItemDTO;", "", "image", "", "indicator", "Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "badgeCounter", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "isSingleImage", "", "bottomImage", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getIndicator", "()Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "getBadgeCounter", "()Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBottomImage", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$LootboxItemDTO;", "equals", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LootboxItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final MorkovskCurrencyBadgeDTO badgeCounter;
        private final String bottomImage;

        @NotNull
        private final String image;
        private final IndicatorAtomDTO indicator;
        private final Boolean isSingleImage;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public LootboxItemDTO(@NotNull String image, IndicatorAtomDTO indicatorAtomDTO, MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO, Boolean bool, String str, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            this.image = image;
            this.indicator = indicatorAtomDTO;
            this.badgeCounter = morkovskCurrencyBadgeDTO;
            this.isSingleImage = bool;
            this.bottomImage = str;
            this.action = action;
            this.trackingInfo = map;
        }

        public static /* synthetic */ LootboxItemDTO copy$default(LootboxItemDTO lootboxItemDTO, String str, IndicatorAtomDTO indicatorAtomDTO, MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO, Boolean bool, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = lootboxItemDTO.image;
            }
            if ((i11 & 2) != 0) {
                indicatorAtomDTO = lootboxItemDTO.indicator;
            }
            if ((i11 & 4) != 0) {
                morkovskCurrencyBadgeDTO = lootboxItemDTO.badgeCounter;
            }
            if ((i11 & 8) != 0) {
                bool = lootboxItemDTO.isSingleImage;
            }
            if ((i11 & 16) != 0) {
                str2 = lootboxItemDTO.bottomImage;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = lootboxItemDTO.action;
            }
            if ((i11 & 64) != 0) {
                map = lootboxItemDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            String str3 = str2;
            MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO2 = morkovskCurrencyBadgeDTO;
            return lootboxItemDTO.copy(str, indicatorAtomDTO, morkovskCurrencyBadgeDTO2, bool, str3, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final IndicatorAtomDTO getIndicator() {
            return this.indicator;
        }

        /* renamed from: component3, reason: from getter */
        public final MorkovskCurrencyBadgeDTO getBadgeCounter() {
            return this.badgeCounter;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsSingleImage() {
            return this.isSingleImage;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBottomImage() {
            return this.bottomImage;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final LootboxItemDTO copy(@NotNull String image, IndicatorAtomDTO indicator, MorkovskCurrencyBadgeDTO badgeCounter, Boolean isSingleImage, String bottomImage, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            return new LootboxItemDTO(image, indicator, badgeCounter, isSingleImage, bottomImage, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LootboxItemDTO)) {
                return false;
            }
            LootboxItemDTO lootboxItemDTO = (LootboxItemDTO) other;
            return Intrinsics.d(this.image, lootboxItemDTO.image) && Intrinsics.d(this.indicator, lootboxItemDTO.indicator) && Intrinsics.d(this.badgeCounter, lootboxItemDTO.badgeCounter) && Intrinsics.d(this.isSingleImage, lootboxItemDTO.isSingleImage) && Intrinsics.d(this.bottomImage, lootboxItemDTO.bottomImage) && Intrinsics.d(this.action, lootboxItemDTO.action) && Intrinsics.d(this.trackingInfo, lootboxItemDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final MorkovskCurrencyBadgeDTO getBadgeCounter() {
            return this.badgeCounter;
        }

        public final String getBottomImage() {
            return this.bottomImage;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final IndicatorAtomDTO getIndicator() {
            return this.indicator;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            IndicatorAtomDTO indicatorAtomDTO = this.indicator;
            int hashCode2 = (hashCode + (indicatorAtomDTO == null ? 0 : indicatorAtomDTO.hashCode())) * 31;
            MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO = this.badgeCounter;
            int hashCode3 = (hashCode2 + (morkovskCurrencyBadgeDTO == null ? 0 : morkovskCurrencyBadgeDTO.hashCode())) * 31;
            Boolean bool = this.isSingleImage;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.bottomImage;
            int b11 = a.b(this.action, (hashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isSingleImage() {
            return this.isSingleImage;
        }

        @NotNull
        public String toString() {
            String str = this.image;
            IndicatorAtomDTO indicatorAtomDTO = this.indicator;
            MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO = this.badgeCounter;
            Boolean bool = this.isSingleImage;
            String str2 = this.bottomImage;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("LootboxItemDTO(image=");
            sb2.append(str);
            sb2.append(", indicator=");
            sb2.append(indicatorAtomDTO);
            sb2.append(", badgeCounter=");
            sb2.append(morkovskCurrencyBadgeDTO);
            sb2.append(", isSingleImage=");
            sb2.append(bool);
            sb2.append(", bottomImage=");
            p.c(str2, ", action=", ", trackingInfo=", sb2, atomActionDTO);
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JD\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$ProgressBarDTO;", "", "percent", "", "text", "", "icon", "animationTime", "actionProgress", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getPercent", "()I", "getText", "()Ljava/lang/String;", "getIcon", "getAnimationTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActionProgress", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$ProgressBarDTO;", "equals", "", "other", "hashCode", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressBarDTO {
        public static final int $stable = 0;
        private final AtomActionDTO actionProgress;
        private final Integer animationTime;

        @NotNull
        private final String icon;
        private final int percent;

        @NotNull
        private final String text;

        public ProgressBarDTO(int i11, @NotNull String text, @NotNull String icon, Integer num, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.percent = i11;
            this.text = text;
            this.icon = icon;
            this.animationTime = num;
            this.actionProgress = atomActionDTO;
        }

        public static /* synthetic */ ProgressBarDTO copy$default(ProgressBarDTO progressBarDTO, int i11, String str, String str2, Integer num, AtomActionDTO atomActionDTO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = progressBarDTO.percent;
            }
            if ((i12 & 2) != 0) {
                str = progressBarDTO.text;
            }
            if ((i12 & 4) != 0) {
                str2 = progressBarDTO.icon;
            }
            if ((i12 & 8) != 0) {
                num = progressBarDTO.animationTime;
            }
            if ((i12 & 16) != 0) {
                atomActionDTO = progressBarDTO.actionProgress;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str3 = str2;
            return progressBarDTO.copy(i11, str, str3, num, atomActionDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getAnimationTime() {
            return this.animationTime;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getActionProgress() {
            return this.actionProgress;
        }

        @NotNull
        public final ProgressBarDTO copy(int percent, @NotNull String text, @NotNull String icon, Integer animationTime, AtomActionDTO actionProgress) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new ProgressBarDTO(percent, text, icon, animationTime, actionProgress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressBarDTO)) {
                return false;
            }
            ProgressBarDTO progressBarDTO = (ProgressBarDTO) other;
            return this.percent == progressBarDTO.percent && Intrinsics.d(this.text, progressBarDTO.text) && Intrinsics.d(this.icon, progressBarDTO.icon) && Intrinsics.d(this.animationTime, progressBarDTO.animationTime) && Intrinsics.d(this.actionProgress, progressBarDTO.actionProgress);
        }

        public final AtomActionDTO getActionProgress() {
            return this.actionProgress;
        }

        public final Integer getAnimationTime() {
            return this.animationTime;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final int getPercent() {
            return this.percent;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = g.a(g.a(Integer.hashCode(this.percent) * 31, 31, this.text), 31, this.icon);
            Integer num = this.animationTime;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.actionProgress;
            return hashCode + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.percent;
            String str = this.text;
            String str2 = this.icon;
            Integer num = this.animationTime;
            AtomActionDTO atomActionDTO = this.actionProgress;
            StringBuilder g10 = e.g(i11, "ProgressBarDTO(percent=", ", text=", str, ", icon=");
            C2454a.f(num, str2, ", animationTime=", ", actionProgress=", g10);
            return G.c(g10, atomActionDTO, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0095\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001f¨\u00062"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$ProgressBlockDTO;", "", "infoText", "", "infoIcon", "progressBar", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$ProgressBarDTO;", "centralText", "leftImage", "rightFinalText", "infoAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "progressBarAction", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "infoTrackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$ProgressBarDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;)V", "getInfoText", "()Ljava/lang/String;", "getInfoIcon", "getProgressBar", "()Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$ProgressBarDTO;", "getCentralText", "getLeftImage", "getRightFinalText", "getInfoAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getProgressBarAction", "getTrackingInfo", "()Ljava/util/Map;", "getInfoTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressBlockDTO {
        public static final int $stable = 8;

        @NotNull
        private final String centralText;
        private final AtomActionDTO infoAction;
        private final String infoIcon;

        @NotNull
        private final String infoText;
        private final Map<String, TokenizedTrackingInfo> infoTrackingInfo;
        private final String leftImage;
        private final ProgressBarDTO progressBar;
        private final AtomActionDTO progressBarAction;
        private final String rightFinalText;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ProgressBlockDTO(@NotNull String infoText, String str, ProgressBarDTO progressBarDTO, @NotNull String centralText, String str2, String str3, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(infoText, "infoText");
            Intrinsics.checkNotNullParameter(centralText, "centralText");
            this.infoText = infoText;
            this.infoIcon = str;
            this.progressBar = progressBarDTO;
            this.centralText = centralText;
            this.leftImage = str2;
            this.rightFinalText = str3;
            this.infoAction = atomActionDTO;
            this.progressBarAction = atomActionDTO2;
            this.trackingInfo = map;
            this.infoTrackingInfo = map2;
        }

        public static /* synthetic */ ProgressBlockDTO copy$default(ProgressBlockDTO progressBlockDTO, String str, String str2, ProgressBarDTO progressBarDTO, String str3, String str4, String str5, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = progressBlockDTO.infoText;
            }
            if ((i11 & 2) != 0) {
                str2 = progressBlockDTO.infoIcon;
            }
            if ((i11 & 4) != 0) {
                progressBarDTO = progressBlockDTO.progressBar;
            }
            if ((i11 & 8) != 0) {
                str3 = progressBlockDTO.centralText;
            }
            if ((i11 & 16) != 0) {
                str4 = progressBlockDTO.leftImage;
            }
            if ((i11 & 32) != 0) {
                str5 = progressBlockDTO.rightFinalText;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = progressBlockDTO.infoAction;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomActionDTO2 = progressBlockDTO.progressBarAction;
            }
            if ((i11 & 256) != 0) {
                map = progressBlockDTO.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map2 = progressBlockDTO.infoTrackingInfo;
            }
            Map map3 = map;
            Map map4 = map2;
            AtomActionDTO atomActionDTO3 = atomActionDTO;
            AtomActionDTO atomActionDTO4 = atomActionDTO2;
            String str6 = str4;
            String str7 = str5;
            return progressBlockDTO.copy(str, str2, progressBarDTO, str3, str6, str7, atomActionDTO3, atomActionDTO4, map3, map4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getInfoText() {
            return this.infoText;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.infoTrackingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInfoIcon() {
            return this.infoIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final ProgressBarDTO getProgressBar() {
            return this.progressBar;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getCentralText() {
            return this.centralText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLeftImage() {
            return this.leftImage;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRightFinalText() {
            return this.rightFinalText;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getInfoAction() {
            return this.infoAction;
        }

        /* renamed from: component8, reason: from getter */
        public final AtomActionDTO getProgressBarAction() {
            return this.progressBarAction;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final ProgressBlockDTO copy(@NotNull String infoText, String infoIcon, ProgressBarDTO progressBar, @NotNull String centralText, String leftImage, String rightFinalText, AtomActionDTO infoAction, AtomActionDTO progressBarAction, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> infoTrackingInfo) {
            Intrinsics.checkNotNullParameter(infoText, "infoText");
            Intrinsics.checkNotNullParameter(centralText, "centralText");
            return new ProgressBlockDTO(infoText, infoIcon, progressBar, centralText, leftImage, rightFinalText, infoAction, progressBarAction, trackingInfo, infoTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressBlockDTO)) {
                return false;
            }
            ProgressBlockDTO progressBlockDTO = (ProgressBlockDTO) other;
            return Intrinsics.d(this.infoText, progressBlockDTO.infoText) && Intrinsics.d(this.infoIcon, progressBlockDTO.infoIcon) && Intrinsics.d(this.progressBar, progressBlockDTO.progressBar) && Intrinsics.d(this.centralText, progressBlockDTO.centralText) && Intrinsics.d(this.leftImage, progressBlockDTO.leftImage) && Intrinsics.d(this.rightFinalText, progressBlockDTO.rightFinalText) && Intrinsics.d(this.infoAction, progressBlockDTO.infoAction) && Intrinsics.d(this.progressBarAction, progressBlockDTO.progressBarAction) && Intrinsics.d(this.trackingInfo, progressBlockDTO.trackingInfo) && Intrinsics.d(this.infoTrackingInfo, progressBlockDTO.infoTrackingInfo);
        }

        @NotNull
        public final String getCentralText() {
            return this.centralText;
        }

        public final AtomActionDTO getInfoAction() {
            return this.infoAction;
        }

        public final String getInfoIcon() {
            return this.infoIcon;
        }

        @NotNull
        public final String getInfoText() {
            return this.infoText;
        }

        public final Map<String, TokenizedTrackingInfo> getInfoTrackingInfo() {
            return this.infoTrackingInfo;
        }

        public final String getLeftImage() {
            return this.leftImage;
        }

        public final ProgressBarDTO getProgressBar() {
            return this.progressBar;
        }

        public final AtomActionDTO getProgressBarAction() {
            return this.progressBarAction;
        }

        public final String getRightFinalText() {
            return this.rightFinalText;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.infoText.hashCode() * 31;
            String str = this.infoIcon;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            ProgressBarDTO progressBarDTO = this.progressBar;
            int a11 = g.a((hashCode2 + (progressBarDTO == null ? 0 : progressBarDTO.hashCode())) * 31, 31, this.centralText);
            String str2 = this.leftImage;
            int hashCode3 = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.rightFinalText;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.infoAction;
            int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO2 = this.progressBarAction;
            int hashCode6 = (hashCode5 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.infoTrackingInfo;
            return hashCode7 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.infoText;
            String str2 = this.infoIcon;
            ProgressBarDTO progressBarDTO = this.progressBar;
            String str3 = this.centralText;
            String str4 = this.leftImage;
            String str5 = this.rightFinalText;
            AtomActionDTO atomActionDTO = this.infoAction;
            AtomActionDTO atomActionDTO2 = this.progressBarAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.infoTrackingInfo;
            StringBuilder d11 = C3660k.d("ProgressBlockDTO(infoText=", str, ", infoIcon=", str2, ", progressBar=");
            d11.append(progressBarDTO);
            d11.append(", centralText=");
            d11.append(str3);
            d11.append(", leftImage=");
            Nh.a.h(d11, str4, ", rightFinalText=", str5, ", infoAction=");
            d11.append(atomActionDTO);
            d11.append(", progressBarAction=");
            d11.append(atomActionDTO2);
            d11.append(", trackingInfo=");
            return V.c(d11, map, ", infoTrackingInfo=", map2, ")");
        }
    }

    public MainDrawMajorScreenDTO(@NotNull String backgroundImage, List<LootboxItemDTO> list, List<LootboxItemDTO> list2, @NotNull ProgressBlockDTO progressBlock, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(progressBlock, "progressBlock");
        this.backgroundImage = backgroundImage;
        this.leftItems = list;
        this.rightItems = list2;
        this.progressBlock = progressBlock;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ MainDrawMajorScreenDTO copy$default(MainDrawMajorScreenDTO mainDrawMajorScreenDTO, String str, List list, List list2, ProgressBlockDTO progressBlockDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mainDrawMajorScreenDTO.backgroundImage;
        }
        if ((i11 & 2) != 0) {
            list = mainDrawMajorScreenDTO.leftItems;
        }
        if ((i11 & 4) != 0) {
            list2 = mainDrawMajorScreenDTO.rightItems;
        }
        if ((i11 & 8) != 0) {
            progressBlockDTO = mainDrawMajorScreenDTO.progressBlock;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = mainDrawMajorScreenDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = mainDrawMajorScreenDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return mainDrawMajorScreenDTO.copy(str, list, list2, progressBlockDTO, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final List<LootboxItemDTO> component2() {
        return this.leftItems;
    }

    public final List<LootboxItemDTO> component3() {
        return this.rightItems;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ProgressBlockDTO getProgressBlock() {
        return this.progressBlock;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final MainDrawMajorScreenDTO copy(@NotNull String backgroundImage, List<LootboxItemDTO> leftItems, List<LootboxItemDTO> rightItems, @NotNull ProgressBlockDTO progressBlock, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(progressBlock, "progressBlock");
        return new MainDrawMajorScreenDTO(backgroundImage, leftItems, rightItems, progressBlock, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainDrawMajorScreenDTO)) {
            return false;
        }
        MainDrawMajorScreenDTO mainDrawMajorScreenDTO = (MainDrawMajorScreenDTO) other;
        return Intrinsics.d(this.backgroundImage, mainDrawMajorScreenDTO.backgroundImage) && Intrinsics.d(this.leftItems, mainDrawMajorScreenDTO.leftItems) && Intrinsics.d(this.rightItems, mainDrawMajorScreenDTO.rightItems) && Intrinsics.d(this.progressBlock, mainDrawMajorScreenDTO.progressBlock) && Intrinsics.d(this.action, mainDrawMajorScreenDTO.action) && Intrinsics.d(this.trackingInfo, mainDrawMajorScreenDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final List<LootboxItemDTO> getLeftItems() {
        return this.leftItems;
    }

    @NotNull
    public final ProgressBlockDTO getProgressBlock() {
        return this.progressBlock;
    }

    public final List<LootboxItemDTO> getRightItems() {
        return this.rightItems;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.backgroundImage.hashCode() * 31;
        List<LootboxItemDTO> list = this.leftItems;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<LootboxItemDTO> list2 = this.rightItems;
        int hashCode3 = (this.progressBlock.hashCode() + ((hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundImage;
        List<LootboxItemDTO> list = this.leftItems;
        List<LootboxItemDTO> list2 = this.rightItems;
        ProgressBlockDTO progressBlockDTO = this.progressBlock;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder f7 = b.f("MainDrawMajorScreenDTO(backgroundImage=", str, ", leftItems=", ", rightItems=", list);
        f7.append(list2);
        f7.append(", progressBlock=");
        f7.append(progressBlockDTO);
        f7.append(", action=");
        return D40.a.d(f7, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
