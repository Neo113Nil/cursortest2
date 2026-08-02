package ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo;

import B0.C2454a;
import Bl.C2639a;
import Fm.C3051a;
import Ih.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Top", "TopWithFinBadge", "Bottom", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PriceV4VoWrapper extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull PriceV4VoWrapper priceV4VoWrapper) {
            return null;
        }

        public static int getViewItemKey(@NotNull PriceV4VoWrapper priceV4VoWrapper) {
            return priceV4VoWrapper.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$Top;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper;", "", "id", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "priceAction", "Lru/ozon/uni/atoms/data/button/Icon;", "priceIcon", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JLru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPriceAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/data/button/Icon;", "getPriceIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Top implements PriceV4VoWrapper {
        private final long id;

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final AtomActionDTO priceAction;
        private final Icon priceIcon;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Top(long j11, @NotNull PriceDTO price, @NotNull AtomActionDTO priceAction, Icon icon, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(priceAction, "priceAction");
            this.id = j11;
            this.price = price;
            this.priceAction = priceAction;
            this.priceIcon = icon;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Top)) {
                return false;
            }
            Top top = (Top) other;
            return this.id == top.id && Intrinsics.d(this.price, top.price) && Intrinsics.d(this.priceAction, top.priceAction) && Intrinsics.d(this.priceIcon, top.priceIcon) && Intrinsics.d(this.trackingInfo, top.trackingInfo);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final AtomActionDTO getPriceAction() {
            return this.priceAction;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int b11 = a.b(this.priceAction, C3051a.b(this.price, Long.hashCode(this.id) * 31, 31), 31);
            Icon icon = this.priceIcon;
            int hashCode = (b11 + (icon == null ? 0 : icon.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            PriceDTO priceDTO = this.price;
            AtomActionDTO atomActionDTO = this.priceAction;
            Icon icon = this.priceIcon;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("Top(id=");
            sb2.append(j11);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", priceAction=");
            sb2.append(atomActionDTO);
            sb2.append(", priceIcon=");
            sb2.append(icon);
            return C2639a.b(sb2, ", trackingInfo=", map, ")");
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$TopWithFinBadge;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper;", "", "id", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "priceAction", "Lru/ozon/uni/atoms/data/button/Icon;", "priceIcon", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "topFinBadge", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceStarsBadgeVO;", "topStarBadge", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JLru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceStarsBadgeVO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPriceAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/data/button/Icon;", "getPriceIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTopFinBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceStarsBadgeVO;", "getTopStarBadge", "()Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceStarsBadgeVO;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TopWithFinBadge implements PriceV4VoWrapper {
        private final long id;
        private final OnBoardingDTO onboarding;

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final AtomActionDTO priceAction;
        private final Icon priceIcon;
        private final BadgeDTO topFinBadge;
        private final PriceStarsBadgeVO topStarBadge;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public TopWithFinBadge(long j11, @NotNull PriceDTO price, @NotNull AtomActionDTO priceAction, Icon icon, BadgeDTO badgeDTO, PriceStarsBadgeVO priceStarsBadgeVO, OnBoardingDTO onBoardingDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(priceAction, "priceAction");
            this.id = j11;
            this.price = price;
            this.priceAction = priceAction;
            this.priceIcon = icon;
            this.topFinBadge = badgeDTO;
            this.topStarBadge = priceStarsBadgeVO;
            this.onboarding = onBoardingDTO;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopWithFinBadge)) {
                return false;
            }
            TopWithFinBadge topWithFinBadge = (TopWithFinBadge) other;
            return this.id == topWithFinBadge.id && Intrinsics.d(this.price, topWithFinBadge.price) && Intrinsics.d(this.priceAction, topWithFinBadge.priceAction) && Intrinsics.d(this.priceIcon, topWithFinBadge.priceIcon) && Intrinsics.d(this.topFinBadge, topWithFinBadge.topFinBadge) && Intrinsics.d(this.topStarBadge, topWithFinBadge.topStarBadge) && Intrinsics.d(this.onboarding, topWithFinBadge.onboarding) && Intrinsics.d(this.trackingInfo, topWithFinBadge.trackingInfo);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final AtomActionDTO getPriceAction() {
            return this.priceAction;
        }

        public final Icon getPriceIcon() {
            return this.priceIcon;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        public final BadgeDTO getTopFinBadge() {
            return this.topFinBadge;
        }

        public final PriceStarsBadgeVO getTopStarBadge() {
            return this.topStarBadge;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int b11 = a.b(this.priceAction, C3051a.b(this.price, Long.hashCode(this.id) * 31, 31), 31);
            Icon icon = this.priceIcon;
            int hashCode = (b11 + (icon == null ? 0 : icon.hashCode())) * 31;
            BadgeDTO badgeDTO = this.topFinBadge;
            int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            PriceStarsBadgeVO priceStarsBadgeVO = this.topStarBadge;
            int hashCode3 = (hashCode2 + (priceStarsBadgeVO == null ? 0 : priceStarsBadgeVO.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            int hashCode4 = (hashCode3 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TopWithFinBadge(id=" + this.id + ", price=" + this.price + ", priceAction=" + this.priceAction + ", priceIcon=" + this.priceIcon + ", topFinBadge=" + this.topFinBadge + ", topStarBadge=" + this.topStarBadge + ", onboarding=" + this.onboarding + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b0\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010\u001dR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$Bottom;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper;", "", "id", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "priceAction", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "moreAboutPrice", "ozonCardBadge", "bottomFinBadge", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "partnerBanks", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "topBadgeWidth", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;", "configuration", "<init>", "(JLru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;ILru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPriceAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getMoreAboutPrice", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getOzonCardBadge", "getBottomFinBadge", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "getPartnerBanks", "()Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "I", "getTopBadgeWidth", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;", "getConfiguration", "()Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bottom implements PriceV4VoWrapper {
        private final BadgeDTO bottomFinBadge;

        @NotNull
        private final PriceV4BottomViewConfiguration configuration;
        private final long id;
        private final BadgeDTO moreAboutPrice;
        private final OnBoardingDTO onboarding;
        private final BadgeDTO ozonCardBadge;
        private final PartnerBanksVO partnerBanks;
        private final PriceDTO price;
        private final AtomActionDTO priceAction;
        private final int topBadgeWidth;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Bottom(long j11, PriceDTO priceDTO, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgeDTO badgeDTO3, PartnerBanksVO partnerBanksVO, Map<String, TokenizedTrackingInfo> map, OnBoardingDTO onBoardingDTO, int i11, @NotNull PriceV4BottomViewConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.id = j11;
            this.price = priceDTO;
            this.priceAction = atomActionDTO;
            this.moreAboutPrice = badgeDTO;
            this.ozonCardBadge = badgeDTO2;
            this.bottomFinBadge = badgeDTO3;
            this.partnerBanks = partnerBanksVO;
            this.trackingInfo = map;
            this.onboarding = onBoardingDTO;
            this.topBadgeWidth = i11;
            this.configuration = configuration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bottom)) {
                return false;
            }
            Bottom bottom = (Bottom) other;
            return this.id == bottom.id && Intrinsics.d(this.price, bottom.price) && Intrinsics.d(this.priceAction, bottom.priceAction) && Intrinsics.d(this.moreAboutPrice, bottom.moreAboutPrice) && Intrinsics.d(this.ozonCardBadge, bottom.ozonCardBadge) && Intrinsics.d(this.bottomFinBadge, bottom.bottomFinBadge) && Intrinsics.d(this.partnerBanks, bottom.partnerBanks) && Intrinsics.d(this.trackingInfo, bottom.trackingInfo) && Intrinsics.d(this.onboarding, bottom.onboarding) && this.topBadgeWidth == bottom.topBadgeWidth && this.configuration == bottom.configuration;
        }

        public final BadgeDTO getBottomFinBadge() {
            return this.bottomFinBadge;
        }

        @NotNull
        public final PriceV4BottomViewConfiguration getConfiguration() {
            return this.configuration;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final BadgeDTO getMoreAboutPrice() {
            return this.moreAboutPrice;
        }

        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        public final BadgeDTO getOzonCardBadge() {
            return this.ozonCardBadge;
        }

        public final PartnerBanksVO getPartnerBanks() {
            return this.partnerBanks;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        public final AtomActionDTO getPriceAction() {
            return this.priceAction;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        public final int getTopBadgeWidth() {
            return this.topBadgeWidth;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            PriceDTO priceDTO = this.price;
            int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.priceAction;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.moreAboutPrice;
            int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            BadgeDTO badgeDTO2 = this.ozonCardBadge;
            int hashCode5 = (hashCode4 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
            BadgeDTO badgeDTO3 = this.bottomFinBadge;
            int hashCode6 = (hashCode5 + (badgeDTO3 == null ? 0 : badgeDTO3.hashCode())) * 31;
            PartnerBanksVO partnerBanksVO = this.partnerBanks;
            int hashCode7 = (hashCode6 + (partnerBanksVO == null ? 0 : partnerBanksVO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            return this.configuration.hashCode() + C2454a.a(this.topBadgeWidth, (hashCode8 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "Bottom(id=" + this.id + ", price=" + this.price + ", priceAction=" + this.priceAction + ", moreAboutPrice=" + this.moreAboutPrice + ", ozonCardBadge=" + this.ozonCardBadge + ", bottomFinBadge=" + this.bottomFinBadge + ", partnerBanks=" + this.partnerBanks + ", trackingInfo=" + this.trackingInfo + ", onboarding=" + this.onboarding + ", topBadgeWidth=" + this.topBadgeWidth + ", configuration=" + this.configuration + ")";
        }

        public /* synthetic */ Bottom(long j11, PriceDTO priceDTO, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgeDTO badgeDTO3, PartnerBanksVO partnerBanksVO, Map map, OnBoardingDTO onBoardingDTO, int i11, PriceV4BottomViewConfiguration priceV4BottomViewConfiguration, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, priceDTO, atomActionDTO, badgeDTO, badgeDTO2, badgeDTO3, partnerBanksVO, map, onBoardingDTO, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 0 : i11, priceV4BottomViewConfiguration);
        }
    }
}
