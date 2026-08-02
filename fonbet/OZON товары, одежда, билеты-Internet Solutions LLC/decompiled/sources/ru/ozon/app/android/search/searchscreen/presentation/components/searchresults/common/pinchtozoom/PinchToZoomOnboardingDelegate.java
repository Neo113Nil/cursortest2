package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom;

import Xc.a;
import Xc.b;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.AdultImagesModel;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate;", "", "pinchToZoomStorage", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomStorage;", "<init>", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomStorage;)V", "onboardingView", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingView;", "onPinchToZoomUsed", "", "cancelOnboarding", "showIfNeedOn", "", "onboardingHolder", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder;", "showOnboarding", "OnboardingStyle", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PinchToZoomOnboardingDelegate {
    private PinchToZoomOnboardingView onboardingView;

    @NotNull
    private final PinchToZoomStorage pinchToZoomStorage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate$OnboardingStyle;", "", "<init>", "(Ljava/lang/String;I)V", "GRID", "GRID_WITHOUT_PAGINATOR", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnboardingStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ OnboardingStyle[] $VALUES;
        public static final OnboardingStyle GRID = new OnboardingStyle("GRID", 0);
        public static final OnboardingStyle GRID_WITHOUT_PAGINATOR = new OnboardingStyle("GRID_WITHOUT_PAGINATOR", 1);

        private static final /* synthetic */ OnboardingStyle[] $values() {
            return new OnboardingStyle[]{GRID, GRID_WITHOUT_PAGINATOR};
        }

        static {
            OnboardingStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private OnboardingStyle(String str, int i11) {
        }

        public static OnboardingStyle valueOf(String str) {
            return (OnboardingStyle) Enum.valueOf(OnboardingStyle.class, str);
        }

        public static OnboardingStyle[] values() {
            return (OnboardingStyle[]) $VALUES.clone();
        }
    }

    public PinchToZoomOnboardingDelegate(@NotNull PinchToZoomStorage pinchToZoomStorage) {
        Intrinsics.checkNotNullParameter(pinchToZoomStorage, "pinchToZoomStorage");
        this.pinchToZoomStorage = pinchToZoomStorage;
    }

    private final void showOnboarding(PinchToZoomOnboardingHolder onboardingHolder) {
        ConstraintLayout onboardingContainer = onboardingHolder.getOnboardingContainer();
        this.pinchToZoomStorage.setOnboardingShown();
        Context context = onboardingContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PinchToZoomOnboardingView style = new PinchToZoomOnboardingView(context, null, 0, 6, null).setConstraintIds(onboardingHolder.getConstraintsViewIds()).setStyle(onboardingHolder.getOnboardingStyle());
        this.onboardingView = style;
        onboardingContainer.addView(style);
        PinchToZoomOnboardingView pinchToZoomOnboardingView = this.onboardingView;
        if (pinchToZoomOnboardingView != null) {
            pinchToZoomOnboardingView.playAnimationWithEndAction(new PinchToZoomOnboardingDelegate$showOnboarding$1(onboardingContainer, this));
        }
    }

    public final void cancelOnboarding() {
        PinchToZoomOnboardingView pinchToZoomOnboardingView = this.onboardingView;
        if (pinchToZoomOnboardingView != null) {
            pinchToZoomOnboardingView.cancelAnimation();
        }
    }

    public final void onPinchToZoomUsed() {
        this.pinchToZoomStorage.setPinchToZoomUsed();
        cancelOnboarding();
    }

    public final boolean showIfNeedOn(@NotNull PinchToZoomOnboardingHolder onboardingHolder) {
        AdultImagesModel adultImagesModel;
        List<SearchResultsGalleryModel.GalleryItem> imageItems;
        SearchResultsGalleryModel.GalleryItem galleryItem;
        Intrinsics.checkNotNullParameter(onboardingHolder, "onboardingHolder");
        SearchResultsGalleryModel galleryModel = onboardingHolder.getGalleryModel();
        boolean z11 = false;
        if (galleryModel != null && (adultImagesModel = galleryModel.getAdultImagesModel()) != null && (imageItems = adultImagesModel.getImageItems()) != null && (galleryItem = (SearchResultsGalleryModel.GalleryItem) C7714v.M(imageItems)) != null) {
            if (this.pinchToZoomStorage.shouldShowOnboarding() && !(galleryItem instanceof SearchResultsGalleryModel.GalleryItem.VideoItem) && !galleryModel.getAdultImagesModel().getShouldBlur()) {
                z11 = true;
            }
            if (z11) {
                showOnboarding(onboardingHolder);
            }
        }
        return z11;
    }
}
