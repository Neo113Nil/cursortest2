package ru.ozon.android.messenger.blocks.coupon;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/android/messenger/blocks/coupon/CouponDTO;", "", "leftPart", "Lru/ozon/android/messenger/blocks/coupon/LeftPartDTO;", "rightPart", "Lru/ozon/android/messenger/blocks/coupon/RightPartDTO;", "image", "Lru/ozon/android/messenger/blocks/coupon/ImageDTO;", "lexemes", "", "", "trackingInfo", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/android/messenger/blocks/coupon/LeftPartDTO;Lru/ozon/android/messenger/blocks/coupon/RightPartDTO;Lru/ozon/android/messenger/blocks/coupon/ImageDTO;Ljava/util/Map;Ljava/util/Map;)V", "getLeftPart", "()Lru/ozon/android/messenger/blocks/coupon/LeftPartDTO;", "getRightPart", "()Lru/ozon/android/messenger/blocks/coupon/RightPartDTO;", "getImage", "()Lru/ozon/android/messenger/blocks/coupon/ImageDTO;", "getLexemes", "()Ljava/util/Map;", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CouponDTO {
    public static final int $stable = 8;
    private final ImageDTO image;

    @NotNull
    private final LeftPartDTO leftPart;
    private final Map<String, String> lexemes;

    @NotNull
    private final RightPartDTO rightPart;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public CouponDTO(@NotNull LeftPartDTO leftPart, @NotNull RightPartDTO rightPart, ImageDTO imageDTO, Map<String, String> map, Map<String, MessengerTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(leftPart, "leftPart");
        Intrinsics.checkNotNullParameter(rightPart, "rightPart");
        this.leftPart = leftPart;
        this.rightPart = rightPart;
        this.image = imageDTO;
        this.lexemes = map;
        this.trackingInfo = map2;
    }

    public static /* synthetic */ CouponDTO copy$default(CouponDTO couponDTO, LeftPartDTO leftPartDTO, RightPartDTO rightPartDTO, ImageDTO imageDTO, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            leftPartDTO = couponDTO.leftPart;
        }
        if ((i11 & 2) != 0) {
            rightPartDTO = couponDTO.rightPart;
        }
        if ((i11 & 4) != 0) {
            imageDTO = couponDTO.image;
        }
        if ((i11 & 8) != 0) {
            map = couponDTO.lexemes;
        }
        if ((i11 & 16) != 0) {
            map2 = couponDTO.trackingInfo;
        }
        Map map3 = map2;
        ImageDTO imageDTO2 = imageDTO;
        return couponDTO.copy(leftPartDTO, rightPartDTO, imageDTO2, map, map3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LeftPartDTO getLeftPart() {
        return this.leftPart;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RightPartDTO getRightPart() {
        return this.rightPart;
    }

    /* renamed from: component3, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    public final Map<String, String> component4() {
        return this.lexemes;
    }

    public final Map<String, MessengerTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final CouponDTO copy(@NotNull LeftPartDTO leftPart, @NotNull RightPartDTO rightPart, ImageDTO image, Map<String, String> lexemes, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(leftPart, "leftPart");
        Intrinsics.checkNotNullParameter(rightPart, "rightPart");
        return new CouponDTO(leftPart, rightPart, image, lexemes, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponDTO)) {
            return false;
        }
        CouponDTO couponDTO = (CouponDTO) other;
        return Intrinsics.d(this.leftPart, couponDTO.leftPart) && Intrinsics.d(this.rightPart, couponDTO.rightPart) && Intrinsics.d(this.image, couponDTO.image) && Intrinsics.d(this.lexemes, couponDTO.lexemes) && Intrinsics.d(this.trackingInfo, couponDTO.trackingInfo);
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final LeftPartDTO getLeftPart() {
        return this.leftPart;
    }

    public final Map<String, String> getLexemes() {
        return this.lexemes;
    }

    @NotNull
    public final RightPartDTO getRightPart() {
        return this.rightPart;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.rightPart.hashCode() + (this.leftPart.hashCode() * 31)) * 31;
        ImageDTO imageDTO = this.image;
        int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        Map<String, String> map = this.lexemes;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map2 = this.trackingInfo;
        return hashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        LeftPartDTO leftPartDTO = this.leftPart;
        RightPartDTO rightPartDTO = this.rightPart;
        ImageDTO imageDTO = this.image;
        Map<String, String> map = this.lexemes;
        Map<String, MessengerTrackingInfo> map2 = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CouponDTO(leftPart=");
        sb2.append(leftPartDTO);
        sb2.append(", rightPart=");
        sb2.append(rightPartDTO);
        sb2.append(", image=");
        sb2.append(imageDTO);
        sb2.append(", lexemes=");
        sb2.append(map);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map2, ")");
    }
}
