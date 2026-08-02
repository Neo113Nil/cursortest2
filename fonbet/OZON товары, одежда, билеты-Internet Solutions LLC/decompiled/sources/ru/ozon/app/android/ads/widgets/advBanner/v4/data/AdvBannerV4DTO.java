package ru.ozon.app.android.ads.widgets.advBanner.v4.data;

import Ak.C2436a;
import B0.A0;
import B0.C2454a;
import C.o0;
import Ep.a;
import G.g;
import HY.b;
import Kk.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ads.common.pixel.data.PixelDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u00043456BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jd\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00067"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO;", "", "aspectRation", "", "designType", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignTypeDTO;", "items", "", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$ItemDTO;", "designOptions", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignOptionsDTO;", "badgeV2", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "rotationOptions", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$RotationOptions;", "backgroundColor", "", "<init>", "(Ljava/lang/Double;Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignTypeDTO;Ljava/util/List;Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignOptionsDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$RotationOptions;Ljava/lang/String;)V", "getAspectRation", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDesignType", "()Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignTypeDTO;", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "getDesignOptions", "()Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignOptionsDTO;", "getBadgeV2", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getRotationOptions", "()Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$RotationOptions;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Double;Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignTypeDTO;Ljava/util/List;Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignOptionsDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$RotationOptions;Ljava/lang/String;)Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO;", "equals", "", "other", "hashCode", "", "toString", "DesignTypeDTO", "ItemDTO", "DesignOptionsDTO", "RotationOptions", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AdvBannerV4DTO {
    private final Double aspectRation;
    private final String backgroundColor;
    private final BadgeDTO badgeV2;
    private final DesignOptionsDTO designOptions;

    @NotNull
    private final DesignTypeDTO designType;

    @NotNull
    private final List<ItemDTO> items;
    private final RotationOptions rotationOptions;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignOptionsDTO;", "", "topCornerRadius", "", "bottomCornerRadius", "marginHorizontal", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTopCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBottomCornerRadius", "getMarginHorizontal", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignOptionsDTO;", "equals", "", "other", "hashCode", "toString", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DesignOptionsDTO {
        private final Integer bottomCornerRadius;
        private final Integer marginHorizontal;
        private final Integer topCornerRadius;

        public DesignOptionsDTO(Integer num, Integer num2, Integer num3) {
            this.topCornerRadius = num;
            this.bottomCornerRadius = num2;
            this.marginHorizontal = num3;
        }

        public static /* synthetic */ DesignOptionsDTO copy$default(DesignOptionsDTO designOptionsDTO, Integer num, Integer num2, Integer num3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = designOptionsDTO.topCornerRadius;
            }
            if ((i11 & 2) != 0) {
                num2 = designOptionsDTO.bottomCornerRadius;
            }
            if ((i11 & 4) != 0) {
                num3 = designOptionsDTO.marginHorizontal;
            }
            return designOptionsDTO.copy(num, num2, num3);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getTopCornerRadius() {
            return this.topCornerRadius;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getBottomCornerRadius() {
            return this.bottomCornerRadius;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getMarginHorizontal() {
            return this.marginHorizontal;
        }

        @NotNull
        public final DesignOptionsDTO copy(Integer topCornerRadius, Integer bottomCornerRadius, Integer marginHorizontal) {
            return new DesignOptionsDTO(topCornerRadius, bottomCornerRadius, marginHorizontal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DesignOptionsDTO)) {
                return false;
            }
            DesignOptionsDTO designOptionsDTO = (DesignOptionsDTO) other;
            return Intrinsics.d(this.topCornerRadius, designOptionsDTO.topCornerRadius) && Intrinsics.d(this.bottomCornerRadius, designOptionsDTO.bottomCornerRadius) && Intrinsics.d(this.marginHorizontal, designOptionsDTO.marginHorizontal);
        }

        public final Integer getBottomCornerRadius() {
            return this.bottomCornerRadius;
        }

        public final Integer getMarginHorizontal() {
            return this.marginHorizontal;
        }

        public final Integer getTopCornerRadius() {
            return this.topCornerRadius;
        }

        public int hashCode() {
            Integer num = this.topCornerRadius;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.bottomCornerRadius;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.marginHorizontal;
            return hashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.topCornerRadius;
            Integer num2 = this.bottomCornerRadius;
            return a.c(c.f("DesignOptionsDTO(topCornerRadius=", ", bottomCornerRadius=", num, num2, ", marginHorizontal="), this.marginHorizontal, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignTypeDTO;", "", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DesignTypeDTO {

        @NotNull
        private final String type;

        public DesignTypeDTO(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        public static /* synthetic */ DesignTypeDTO copy$default(DesignTypeDTO designTypeDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = designTypeDTO.type;
            }
            return designTypeDTO.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final DesignTypeDTO copy(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new DesignTypeDTO(type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DesignTypeDTO) && Intrinsics.d(this.type, ((DesignTypeDTO) other).type);
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("DesignTypeDTO(type=", this.type, ")");
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u00012B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u0011HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003Jo\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\tHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0007HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001c¨\u00063"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$ItemDTO;", "", "id", "", "image", "", "index", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "pixel", "", "Lru/ozon/app/android/ads/common/pixel/data/PixelDTO;", "impressionTracking", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$ItemDTO$ImpressionTracking;", "advInfoAction", "<init>", "(JLjava/lang/String;ILru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/List;Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$ItemDTO$ImpressionTracking;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getId", "()J", "getImage", "()Ljava/lang/String;", "getIndex", "()I", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getPixel", "()Ljava/util/List;", "getImpressionTracking", "()Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$ItemDTO$ImpressionTracking;", "getAdvInfoAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "ImpressionTracking", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ItemDTO {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final AtomActionDTO advInfoAction;
        private final long id;

        @NotNull
        private final String image;

        @NotNull
        private final ImpressionTracking impressionTracking;
        private final int index;
        private final List<PixelDTO> pixel;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$ItemDTO$ImpressionTracking;", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/Map;)V", "getTrackingInfo", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImpressionTracking {
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public ImpressionTracking(Map<String, TokenizedTrackingInfo> map) {
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ImpressionTracking copy$default(ImpressionTracking impressionTracking, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    map = impressionTracking.trackingInfo;
                }
                return impressionTracking.copy(map);
            }

            public final Map<String, TokenizedTrackingInfo> component1() {
                return this.trackingInfo;
            }

            @NotNull
            public final ImpressionTracking copy(Map<String, TokenizedTrackingInfo> trackingInfo) {
                return new ImpressionTracking(trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ImpressionTracking) && Intrinsics.d(this.trackingInfo, ((ImpressionTracking) other).trackingInfo);
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            @NotNull
            public String toString() {
                return b.b("ImpressionTracking(trackingInfo=", ")", this.trackingInfo);
            }
        }

        public ItemDTO(long j11, @NotNull String image, int i11, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, List<PixelDTO> list, @NotNull ImpressionTracking impressionTracking, @NotNull AtomActionDTO advInfoAction) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(impressionTracking, "impressionTracking");
            Intrinsics.checkNotNullParameter(advInfoAction, "advInfoAction");
            this.id = j11;
            this.image = image;
            this.index = i11;
            this.action = action;
            this.trackingInfo = map;
            this.pixel = list;
            this.impressionTracking = impressionTracking;
            this.advInfoAction = advInfoAction;
        }

        public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, long j11, String str, int i11, AtomActionDTO atomActionDTO, Map map, List list, ImpressionTracking impressionTracking, AtomActionDTO atomActionDTO2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j11 = itemDTO.id;
            }
            long j12 = j11;
            if ((i12 & 2) != 0) {
                str = itemDTO.image;
            }
            String str2 = str;
            if ((i12 & 4) != 0) {
                i11 = itemDTO.index;
            }
            int i13 = i11;
            if ((i12 & 8) != 0) {
                atomActionDTO = itemDTO.action;
            }
            return itemDTO.copy(j12, str2, i13, atomActionDTO, (i12 & 16) != 0 ? itemDTO.trackingInfo : map, (i12 & 32) != 0 ? itemDTO.pixel : list, (i12 & 64) != 0 ? itemDTO.impressionTracking : impressionTracking, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? itemDTO.advInfoAction : atomActionDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component3, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        public final List<PixelDTO> component6() {
            return this.pixel;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final ImpressionTracking getImpressionTracking() {
            return this.impressionTracking;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final AtomActionDTO getAdvInfoAction() {
            return this.advInfoAction;
        }

        @NotNull
        public final ItemDTO copy(long id2, @NotNull String image, int index, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, List<PixelDTO> pixel, @NotNull ImpressionTracking impressionTracking, @NotNull AtomActionDTO advInfoAction) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(impressionTracking, "impressionTracking");
            Intrinsics.checkNotNullParameter(advInfoAction, "advInfoAction");
            return new ItemDTO(id2, image, index, action, trackingInfo, pixel, impressionTracking, advInfoAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDTO)) {
                return false;
            }
            ItemDTO itemDTO = (ItemDTO) other;
            return this.id == itemDTO.id && Intrinsics.d(this.image, itemDTO.image) && this.index == itemDTO.index && Intrinsics.d(this.action, itemDTO.action) && Intrinsics.d(this.trackingInfo, itemDTO.trackingInfo) && Intrinsics.d(this.pixel, itemDTO.pixel) && Intrinsics.d(this.impressionTracking, itemDTO.impressionTracking) && Intrinsics.d(this.advInfoAction, itemDTO.advInfoAction);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final AtomActionDTO getAdvInfoAction() {
            return this.advInfoAction;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final ImpressionTracking getImpressionTracking() {
            return this.impressionTracking;
        }

        public final int getIndex() {
            return this.index;
        }

        public final List<PixelDTO> getPixel() {
            return this.pixel;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = Ih.a.b(this.action, C2454a.a(this.index, g.a(Long.hashCode(this.id) * 31, 31, this.image), 31), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            List<PixelDTO> list = this.pixel;
            return this.advInfoAction.hashCode() + ((this.impressionTracking.hashCode() + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.image;
            int i11 = this.index;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            List<PixelDTO> list = this.pixel;
            ImpressionTracking impressionTracking = this.impressionTracking;
            AtomActionDTO atomActionDTO2 = this.advInfoAction;
            StringBuilder c11 = C2436a.c(j11, "ItemDTO(id=", ", image=", str);
            c11.append(", index=");
            c11.append(i11);
            c11.append(", action=");
            c11.append(atomActionDTO);
            c11.append(", trackingInfo=");
            c11.append(map);
            c11.append(", pixel=");
            c11.append(list);
            c11.append(", impressionTracking=");
            c11.append(impressionTracking);
            c11.append(", advInfoAction=");
            c11.append(atomActionDTO2);
            c11.append(")");
            return c11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$RotationOptions;", "", "isAutoRotateOn", "", "rotationPeriod", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRotationPeriod", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;)Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$RotationOptions;", "equals", "other", "hashCode", "", "toString", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RotationOptions {
        private final Boolean isAutoRotateOn;
        private final Long rotationPeriod;

        public RotationOptions(Boolean bool, Long l11) {
            this.isAutoRotateOn = bool;
            this.rotationPeriod = l11;
        }

        public static /* synthetic */ RotationOptions copy$default(RotationOptions rotationOptions, Boolean bool, Long l11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = rotationOptions.isAutoRotateOn;
            }
            if ((i11 & 2) != 0) {
                l11 = rotationOptions.rotationPeriod;
            }
            return rotationOptions.copy(bool, l11);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsAutoRotateOn() {
            return this.isAutoRotateOn;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getRotationPeriod() {
            return this.rotationPeriod;
        }

        @NotNull
        public final RotationOptions copy(Boolean isAutoRotateOn, Long rotationPeriod) {
            return new RotationOptions(isAutoRotateOn, rotationPeriod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RotationOptions)) {
                return false;
            }
            RotationOptions rotationOptions = (RotationOptions) other;
            return Intrinsics.d(this.isAutoRotateOn, rotationOptions.isAutoRotateOn) && Intrinsics.d(this.rotationPeriod, rotationOptions.rotationPeriod);
        }

        public final Long getRotationPeriod() {
            return this.rotationPeriod;
        }

        public int hashCode() {
            Boolean bool = this.isAutoRotateOn;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l11 = this.rotationPeriod;
            return hashCode + (l11 != null ? l11.hashCode() : 0);
        }

        public final Boolean isAutoRotateOn() {
            return this.isAutoRotateOn;
        }

        @NotNull
        public String toString() {
            return "RotationOptions(isAutoRotateOn=" + this.isAutoRotateOn + ", rotationPeriod=" + this.rotationPeriod + ")";
        }
    }

    public AdvBannerV4DTO(Double d11, @NotNull DesignTypeDTO designType, @NotNull List<ItemDTO> items, DesignOptionsDTO designOptionsDTO, BadgeDTO badgeDTO, RotationOptions rotationOptions, String str) {
        Intrinsics.checkNotNullParameter(designType, "designType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.aspectRation = d11;
        this.designType = designType;
        this.items = items;
        this.designOptions = designOptionsDTO;
        this.badgeV2 = badgeDTO;
        this.rotationOptions = rotationOptions;
        this.backgroundColor = str;
    }

    public static /* synthetic */ AdvBannerV4DTO copy$default(AdvBannerV4DTO advBannerV4DTO, Double d11, DesignTypeDTO designTypeDTO, List list, DesignOptionsDTO designOptionsDTO, BadgeDTO badgeDTO, RotationOptions rotationOptions, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = advBannerV4DTO.aspectRation;
        }
        if ((i11 & 2) != 0) {
            designTypeDTO = advBannerV4DTO.designType;
        }
        if ((i11 & 4) != 0) {
            list = advBannerV4DTO.items;
        }
        if ((i11 & 8) != 0) {
            designOptionsDTO = advBannerV4DTO.designOptions;
        }
        if ((i11 & 16) != 0) {
            badgeDTO = advBannerV4DTO.badgeV2;
        }
        if ((i11 & 32) != 0) {
            rotationOptions = advBannerV4DTO.rotationOptions;
        }
        if ((i11 & 64) != 0) {
            str = advBannerV4DTO.backgroundColor;
        }
        RotationOptions rotationOptions2 = rotationOptions;
        String str2 = str;
        BadgeDTO badgeDTO2 = badgeDTO;
        List list2 = list;
        return advBannerV4DTO.copy(d11, designTypeDTO, list2, designOptionsDTO, badgeDTO2, rotationOptions2, str2);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getItems$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Double getAspectRation() {
        return this.aspectRation;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DesignTypeDTO getDesignType() {
        return this.designType;
    }

    @NotNull
    public final List<ItemDTO> component3() {
        return this.items;
    }

    /* renamed from: component4, reason: from getter */
    public final DesignOptionsDTO getDesignOptions() {
        return this.designOptions;
    }

    /* renamed from: component5, reason: from getter */
    public final BadgeDTO getBadgeV2() {
        return this.badgeV2;
    }

    /* renamed from: component6, reason: from getter */
    public final RotationOptions getRotationOptions() {
        return this.rotationOptions;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AdvBannerV4DTO copy(Double aspectRation, @NotNull DesignTypeDTO designType, @NotNull List<ItemDTO> items, DesignOptionsDTO designOptions, BadgeDTO badgeV2, RotationOptions rotationOptions, String backgroundColor) {
        Intrinsics.checkNotNullParameter(designType, "designType");
        Intrinsics.checkNotNullParameter(items, "items");
        return new AdvBannerV4DTO(aspectRation, designType, items, designOptions, badgeV2, rotationOptions, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvBannerV4DTO)) {
            return false;
        }
        AdvBannerV4DTO advBannerV4DTO = (AdvBannerV4DTO) other;
        return Intrinsics.d(this.aspectRation, advBannerV4DTO.aspectRation) && Intrinsics.d(this.designType, advBannerV4DTO.designType) && Intrinsics.d(this.items, advBannerV4DTO.items) && Intrinsics.d(this.designOptions, advBannerV4DTO.designOptions) && Intrinsics.d(this.badgeV2, advBannerV4DTO.badgeV2) && Intrinsics.d(this.rotationOptions, advBannerV4DTO.rotationOptions) && Intrinsics.d(this.backgroundColor, advBannerV4DTO.backgroundColor);
    }

    public final Double getAspectRation() {
        return this.aspectRation;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadgeV2() {
        return this.badgeV2;
    }

    public final DesignOptionsDTO getDesignOptions() {
        return this.designOptions;
    }

    @NotNull
    public final DesignTypeDTO getDesignType() {
        return this.designType;
    }

    @NotNull
    public final List<ItemDTO> getItems() {
        return this.items;
    }

    public final RotationOptions getRotationOptions() {
        return this.rotationOptions;
    }

    public int hashCode() {
        Double d11 = this.aspectRation;
        int b11 = g.b((this.designType.hashCode() + ((d11 == null ? 0 : d11.hashCode()) * 31)) * 31, 31, this.items);
        DesignOptionsDTO designOptionsDTO = this.designOptions;
        int hashCode = (b11 + (designOptionsDTO == null ? 0 : designOptionsDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badgeV2;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        RotationOptions rotationOptions = this.rotationOptions;
        int hashCode3 = (hashCode2 + (rotationOptions == null ? 0 : rotationOptions.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Double d11 = this.aspectRation;
        DesignTypeDTO designTypeDTO = this.designType;
        List<ItemDTO> list = this.items;
        DesignOptionsDTO designOptionsDTO = this.designOptions;
        BadgeDTO badgeDTO = this.badgeV2;
        RotationOptions rotationOptions = this.rotationOptions;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("AdvBannerV4DTO(aspectRation=");
        sb2.append(d11);
        sb2.append(", designType=");
        sb2.append(designTypeDTO);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", designOptions=");
        sb2.append(designOptionsDTO);
        sb2.append(", badgeV2=");
        sb2.append(badgeDTO);
        sb2.append(", rotationOptions=");
        sb2.append(rotationOptions);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, str, ")");
    }
}
