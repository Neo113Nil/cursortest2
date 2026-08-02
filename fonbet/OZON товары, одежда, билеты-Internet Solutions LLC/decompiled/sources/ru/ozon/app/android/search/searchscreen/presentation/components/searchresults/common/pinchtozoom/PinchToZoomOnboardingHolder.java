package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import K00.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\fJ\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder;", "", "onboardingStyle", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate$OnboardingStyle;", "getOnboardingStyle", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate$OnboardingStyle;", "getOnboardingContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getConstraintsViewIds", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder$ConstraintsViewIds;", "getGalleryModel", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "ConstraintsViewIds", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PinchToZoomOnboardingHolder {
    @NotNull
    ConstraintsViewIds getConstraintsViewIds();

    SearchResultsGalleryModel getGalleryModel();

    @NotNull
    ConstraintLayout getOnboardingContainer();

    @NotNull
    PinchToZoomOnboardingDelegate.OnboardingStyle getOnboardingStyle();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder$ConstraintsViewIds;", "", "", "all", "start", "top", "end", "bottom", "<init>", "(IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAll", "getStart", "getTop", "getEnd", "getBottom", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConstraintsViewIds {
        private final int all;
        private final int bottom;
        private final int end;
        private final int start;
        private final int top;

        public ConstraintsViewIds(int i11, int i12, int i13, int i14, int i15) {
            this.all = i11;
            this.start = i12;
            this.top = i13;
            this.end = i14;
            this.bottom = i15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConstraintsViewIds)) {
                return false;
            }
            ConstraintsViewIds constraintsViewIds = (ConstraintsViewIds) other;
            return this.all == constraintsViewIds.all && this.start == constraintsViewIds.start && this.top == constraintsViewIds.top && this.end == constraintsViewIds.end && this.bottom == constraintsViewIds.bottom;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + C2454a.a(this.end, C2454a.a(this.top, C2454a.a(this.start, Integer.hashCode(this.all) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.all;
            int i12 = this.start;
            int i13 = this.top;
            int i14 = this.end;
            int i15 = this.bottom;
            StringBuilder a11 = C2438a.a("ConstraintsViewIds(all=", i11, ", start=", ", top=", i12);
            a.f(i13, i14, ", end=", ", bottom=", a11);
            return b.e(i15, ")", a11);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ConstraintsViewIds(int i11, int i12, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this(r2, r3, r4, r5, r6);
            int i17;
            int i18;
            int i19;
            int i21;
            int i22;
            i12 = (i16 & 2) != 0 ? i11 : i12;
            i13 = (i16 & 4) != 0 ? i11 : i13;
            i14 = (i16 & 8) != 0 ? i11 : i14;
            if ((i16 & 16) != 0) {
                i17 = i11;
                i18 = i14;
                i19 = i13;
                i21 = i12;
                i22 = i17;
            } else {
                i17 = i15;
                i18 = i14;
                i19 = i13;
                i21 = i12;
                i22 = i11;
            }
        }
    }
}
