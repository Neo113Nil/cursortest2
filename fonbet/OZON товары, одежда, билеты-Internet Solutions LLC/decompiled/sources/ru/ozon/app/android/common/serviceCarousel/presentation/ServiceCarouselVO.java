package ru.ozon.app.android.common.serviceCarousel.presentation;

import G.g;
import Kk.C3532b;
import Lh.b;
import WZ.t;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.serviceCarousel.data.CornersState;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J~\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b\u0011\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemVO;", "items", "Lru/ozon/app/android/common/serviceCarousel/data/CornersState;", "cornersState", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "shouldStartPostponedTransition", "Landroid/os/Parcelable;", "layoutManagerState", "isKeepPermanentPageViewId", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoardingItemDTO", "", "onboardingItemIndex", "<init>", "(JLjava/util/List;Lru/ozon/app/android/common/serviceCarousel/data/CornersState;LWZ/t;ZLandroid/os/Parcelable;ZLru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Integer;)V", "copy", "(JLjava/util/List;Lru/ozon/app/android/common/serviceCarousel/data/CornersState;LWZ/t;ZLandroid/os/Parcelable;ZLru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Integer;)Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/common/serviceCarousel/data/CornersState;", "getCornersState", "()Lru/ozon/app/android/common/serviceCarousel/data/CornersState;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getShouldStartPostponedTransition", "()Z", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnBoardingItemDTO", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Ljava/lang/Integer;", "getOnboardingItemIndex", "()Ljava/lang/Integer;", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ServiceCarouselVO implements c {

    @NotNull
    private final CornersState cornersState;
    private final long id;
    private final boolean isKeepPermanentPageViewId;

    @NotNull
    private final List<ServiceCarouselItemVO> items;
    private final Parcelable layoutManagerState;
    private final OnBoardingDTO onBoardingItemDTO;
    private final Integer onboardingItemIndex;
    private final boolean shouldStartPostponedTransition;
    private final t tokenizedEvent;

    public ServiceCarouselVO(long j11, @NotNull List<ServiceCarouselItemVO> items, @NotNull CornersState cornersState, t tVar, boolean z11, Parcelable parcelable, boolean z12, OnBoardingDTO onBoardingDTO, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(cornersState, "cornersState");
        this.id = j11;
        this.items = items;
        this.cornersState = cornersState;
        this.tokenizedEvent = tVar;
        this.shouldStartPostponedTransition = z11;
        this.layoutManagerState = parcelable;
        this.isKeepPermanentPageViewId = z12;
        this.onBoardingItemDTO = onBoardingDTO;
        this.onboardingItemIndex = num;
    }

    public static /* synthetic */ ServiceCarouselVO copy$default(ServiceCarouselVO serviceCarouselVO, long j11, List list, CornersState cornersState, t tVar, boolean z11, Parcelable parcelable, boolean z12, OnBoardingDTO onBoardingDTO, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = serviceCarouselVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = serviceCarouselVO.items;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            cornersState = serviceCarouselVO.cornersState;
        }
        return serviceCarouselVO.copy(j12, list2, cornersState, (i11 & 8) != 0 ? serviceCarouselVO.tokenizedEvent : tVar, (i11 & 16) != 0 ? serviceCarouselVO.shouldStartPostponedTransition : z11, (i11 & 32) != 0 ? serviceCarouselVO.layoutManagerState : parcelable, (i11 & 64) != 0 ? serviceCarouselVO.isKeepPermanentPageViewId : z12, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? serviceCarouselVO.onBoardingItemDTO : onBoardingDTO, (i11 & 256) != 0 ? serviceCarouselVO.onboardingItemIndex : num);
    }

    @NotNull
    public final ServiceCarouselVO copy(long id2, @NotNull List<ServiceCarouselItemVO> items, @NotNull CornersState cornersState, t tokenizedEvent, boolean shouldStartPostponedTransition, Parcelable layoutManagerState, boolean isKeepPermanentPageViewId, OnBoardingDTO onBoardingItemDTO, Integer onboardingItemIndex) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(cornersState, "cornersState");
        return new ServiceCarouselVO(id2, items, cornersState, tokenizedEvent, shouldStartPostponedTransition, layoutManagerState, isKeepPermanentPageViewId, onBoardingItemDTO, onboardingItemIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceCarouselVO)) {
            return false;
        }
        ServiceCarouselVO serviceCarouselVO = (ServiceCarouselVO) other;
        return this.id == serviceCarouselVO.id && Intrinsics.d(this.items, serviceCarouselVO.items) && this.cornersState == serviceCarouselVO.cornersState && Intrinsics.d(this.tokenizedEvent, serviceCarouselVO.tokenizedEvent) && this.shouldStartPostponedTransition == serviceCarouselVO.shouldStartPostponedTransition && Intrinsics.d(this.layoutManagerState, serviceCarouselVO.layoutManagerState) && this.isKeepPermanentPageViewId == serviceCarouselVO.isKeepPermanentPageViewId && Intrinsics.d(this.onBoardingItemDTO, serviceCarouselVO.onBoardingItemDTO) && Intrinsics.d(this.onboardingItemIndex, serviceCarouselVO.onboardingItemIndex);
    }

    @NotNull
    public final CornersState getCornersState() {
        return this.cornersState;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ServiceCarouselItemVO> getItems() {
        return this.items;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
    }

    public final OnBoardingDTO getOnBoardingItemDTO() {
        return this.onBoardingItemDTO;
    }

    public final Integer getOnboardingItemIndex() {
        return this.onboardingItemIndex;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShouldStartPostponedTransition() {
        return this.shouldStartPostponedTransition;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.cornersState.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.items)) * 31;
        t tVar = this.tokenizedEvent;
        int a11 = C3532b.a((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.shouldStartPostponedTransition);
        Parcelable parcelable = this.layoutManagerState;
        int a12 = C3532b.a((a11 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.isKeepPermanentPageViewId);
        OnBoardingDTO onBoardingDTO = this.onBoardingItemDTO;
        int hashCode2 = (a12 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        Integer num = this.onboardingItemIndex;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: isKeepPermanentPageViewId, reason: from getter */
    public final boolean getIsKeepPermanentPageViewId() {
        return this.isKeepPermanentPageViewId;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ServiceCarouselItemVO> list = this.items;
        CornersState cornersState = this.cornersState;
        t tVar = this.tokenizedEvent;
        boolean z11 = this.shouldStartPostponedTransition;
        Parcelable parcelable = this.layoutManagerState;
        boolean z12 = this.isKeepPermanentPageViewId;
        OnBoardingDTO onBoardingDTO = this.onBoardingItemDTO;
        Integer num = this.onboardingItemIndex;
        StringBuilder b11 = b.b(j11, "ServiceCarouselVO(id=", ", items=", list);
        b11.append(", cornersState=");
        b11.append(cornersState);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", shouldStartPostponedTransition=");
        b11.append(z11);
        b11.append(", layoutManagerState=");
        b11.append(parcelable);
        b11.append(", isKeepPermanentPageViewId=");
        b11.append(z12);
        b11.append(", onBoardingItemDTO=");
        b11.append(onBoardingDTO);
        b11.append(", onboardingItemIndex=");
        b11.append(num);
        b11.append(")");
        return b11.toString();
    }
}
