package ru.ozon.app.android.common.serviceCarousel.data;

import Kk.C3532b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u001dJb\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0010HÖ\u0001J\t\u0010*\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselDTO;", "", "items", "", "Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselItemDTO;", "cornersState", "Lru/ozon/app/android/common/serviceCarousel/data/CornersState;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isKeepPermanentPageViewId", "", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingItemIndex", "", "<init>", "(Ljava/util/List;Lru/ozon/app/android/common/serviceCarousel/data/CornersState;Ljava/util/Map;ZLru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Integer;)V", "getItems", "()Ljava/util/List;", "getCornersState", "()Lru/ozon/app/android/common/serviceCarousel/data/CornersState;", "getTrackingInfo", "()Ljava/util/Map;", "()Z", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboardingItemIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Lru/ozon/app/android/common/serviceCarousel/data/CornersState;Ljava/util/Map;ZLru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Integer;)Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselDTO;", "equals", "other", "hashCode", "toString", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ServiceCarouselDTO {

    @NotNull
    private final CornersState cornersState;
    private final boolean isKeepPermanentPageViewId;

    @NotNull
    private final List<ServiceCarouselItemDTO> items;
    private final OnBoardingDTO onboarding;
    private final Integer onboardingItemIndex;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ServiceCarouselDTO(@NotNull List<ServiceCarouselItemDTO> items, @NotNull CornersState cornersState, Map<String, TokenizedTrackingInfo> map, boolean z11, OnBoardingDTO onBoardingDTO, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(cornersState, "cornersState");
        this.items = items;
        this.cornersState = cornersState;
        this.trackingInfo = map;
        this.isKeepPermanentPageViewId = z11;
        this.onboarding = onBoardingDTO;
        this.onboardingItemIndex = num;
    }

    public static /* synthetic */ ServiceCarouselDTO copy$default(ServiceCarouselDTO serviceCarouselDTO, List list, CornersState cornersState, Map map, boolean z11, OnBoardingDTO onBoardingDTO, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = serviceCarouselDTO.items;
        }
        if ((i11 & 2) != 0) {
            cornersState = serviceCarouselDTO.cornersState;
        }
        if ((i11 & 4) != 0) {
            map = serviceCarouselDTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            z11 = serviceCarouselDTO.isKeepPermanentPageViewId;
        }
        if ((i11 & 16) != 0) {
            onBoardingDTO = serviceCarouselDTO.onboarding;
        }
        if ((i11 & 32) != 0) {
            num = serviceCarouselDTO.onboardingItemIndex;
        }
        OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
        Integer num2 = num;
        return serviceCarouselDTO.copy(list, cornersState, map, z11, onBoardingDTO2, num2);
    }

    @NotNull
    public final List<ServiceCarouselItemDTO> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CornersState getCornersState() {
        return this.cornersState;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsKeepPermanentPageViewId() {
        return this.isKeepPermanentPageViewId;
    }

    /* renamed from: component5, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getOnboardingItemIndex() {
        return this.onboardingItemIndex;
    }

    @NotNull
    public final ServiceCarouselDTO copy(@NotNull List<ServiceCarouselItemDTO> items, @NotNull CornersState cornersState, Map<String, TokenizedTrackingInfo> trackingInfo, boolean isKeepPermanentPageViewId, OnBoardingDTO onboarding, Integer onboardingItemIndex) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(cornersState, "cornersState");
        return new ServiceCarouselDTO(items, cornersState, trackingInfo, isKeepPermanentPageViewId, onboarding, onboardingItemIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceCarouselDTO)) {
            return false;
        }
        ServiceCarouselDTO serviceCarouselDTO = (ServiceCarouselDTO) other;
        return Intrinsics.d(this.items, serviceCarouselDTO.items) && this.cornersState == serviceCarouselDTO.cornersState && Intrinsics.d(this.trackingInfo, serviceCarouselDTO.trackingInfo) && this.isKeepPermanentPageViewId == serviceCarouselDTO.isKeepPermanentPageViewId && Intrinsics.d(this.onboarding, serviceCarouselDTO.onboarding) && Intrinsics.d(this.onboardingItemIndex, serviceCarouselDTO.onboardingItemIndex);
    }

    @NotNull
    public final CornersState getCornersState() {
        return this.cornersState;
    }

    @NotNull
    public final List<ServiceCarouselItemDTO> getItems() {
        return this.items;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public final Integer getOnboardingItemIndex() {
        return this.onboardingItemIndex;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.cornersState.hashCode() + (this.items.hashCode() * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int a11 = C3532b.a((hashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.isKeepPermanentPageViewId);
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode2 = (a11 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        Integer num = this.onboardingItemIndex;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isKeepPermanentPageViewId() {
        return this.isKeepPermanentPageViewId;
    }

    @NotNull
    public String toString() {
        return "ServiceCarouselDTO(items=" + this.items + ", cornersState=" + this.cornersState + ", trackingInfo=" + this.trackingInfo + ", isKeepPermanentPageViewId=" + this.isKeepPermanentPageViewId + ", onboarding=" + this.onboarding + ", onboardingItemIndex=" + this.onboardingItemIndex + ")";
    }

    public /* synthetic */ ServiceCarouselDTO(List list, CornersState cornersState, Map map, boolean z11, OnBoardingDTO onBoardingDTO, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, cornersState, map, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : onBoardingDTO, (i11 & 32) != 0 ? null : num);
    }
}
