package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import Ae.M0;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001:\u0001!J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewViewModel;", "", "", "voId", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "initialItems", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "setupInitialData", "(JLjava/util/List;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "lastVisiblePosition", "lastItemPosition", "loadNextItemsIfNeed", "(II)V", "Landroid/os/Parcelable;", "state", "saveScrollState", "(Landroid/os/Parcelable;)V", "", "getInitialized", "()Z", "initialized", "LAe/M0;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewViewModel$Previews;", "getPreviews", "()LAe/M0;", "previews", "getScrollState", "()Landroid/os/Parcelable;", "scrollState", "Previews", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ReviewGalleryPreviewViewModel {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewViewModel$Previews;", "", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "items", "", "clearScrollState", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Z", "getClearScrollState", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Previews {
        private final boolean clearScrollState;

        @NotNull
        private final List<ReviewGalleryPreviewV2VO.ItemVO> items;

        public Previews() {
            this(null, false, 3, null);
        }

        @NotNull
        public final List<ReviewGalleryPreviewV2VO.ItemVO> component1() {
            return this.items;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getClearScrollState() {
            return this.clearScrollState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Previews)) {
                return false;
            }
            Previews previews = (Previews) other;
            return Intrinsics.d(this.items, previews.items) && this.clearScrollState == previews.clearScrollState;
        }

        public final boolean getClearScrollState() {
            return this.clearScrollState;
        }

        @NotNull
        public final List<ReviewGalleryPreviewV2VO.ItemVO> getItems() {
            return this.items;
        }

        public int hashCode() {
            return Boolean.hashCode(this.clearScrollState) + (this.items.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Previews(items=" + this.items + ", clearScrollState=" + this.clearScrollState + ")";
        }

        public Previews(@NotNull List<ReviewGalleryPreviewV2VO.ItemVO> items, boolean z11) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            this.clearScrollState = z11;
        }

        public Previews(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? false : z11);
        }
    }

    boolean getInitialized();

    @NotNull
    M0<Previews> getPreviews();

    Parcelable getScrollState();

    void loadNextItemsIfNeed(int lastVisiblePosition, int lastItemPosition);

    void saveScrollState(@NotNull Parcelable state);

    void setupInitialData(long voId, @NotNull List<ReviewGalleryPreviewV2VO.ItemVO> initialItems, AtomAction action);
}
