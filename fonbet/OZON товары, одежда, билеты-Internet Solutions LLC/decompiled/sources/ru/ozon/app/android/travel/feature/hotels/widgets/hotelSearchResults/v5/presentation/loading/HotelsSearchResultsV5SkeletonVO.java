package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading;

import G.g;
import Lh.b;
import T7.E;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001%B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ@\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b\u000b\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO$SkeletonItemVO;", "hotelsSkeletons", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "asyncErrorMessage", "", "isErrorState", "<init>", "(JLjava/util/List;Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;Z)V", "copy", "(JLjava/util/List;Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;Z)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getHotelsSkeletons", "()Ljava/util/List;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "getAsyncErrorMessage", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "Z", "()Z", "SkeletonItemVO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsSearchResultsV5SkeletonVO implements c {
    private final EmptyStateVO asyncErrorMessage;

    @NotNull
    private final List<SkeletonItemVO> hotelsSkeletons;
    private final long id;
    private final boolean isErrorState;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO$SkeletonItemVO;", "", "", "id", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SkeletonItemVO {
        private final int id;

        public SkeletonItemVO(int i11) {
            this.id = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SkeletonItemVO) && this.id == ((SkeletonItemVO) other).id;
        }

        public final int getId() {
            return this.id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return E.a(this.id, "SkeletonItemVO(id=", ")");
        }
    }

    public HotelsSearchResultsV5SkeletonVO(long j11, @NotNull List<SkeletonItemVO> hotelsSkeletons, EmptyStateVO emptyStateVO, boolean z11) {
        Intrinsics.checkNotNullParameter(hotelsSkeletons, "hotelsSkeletons");
        this.id = j11;
        this.hotelsSkeletons = hotelsSkeletons;
        this.asyncErrorMessage = emptyStateVO;
        this.isErrorState = z11;
    }

    public static /* synthetic */ HotelsSearchResultsV5SkeletonVO copy$default(HotelsSearchResultsV5SkeletonVO hotelsSearchResultsV5SkeletonVO, long j11, List list, EmptyStateVO emptyStateVO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = hotelsSearchResultsV5SkeletonVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = hotelsSearchResultsV5SkeletonVO.hotelsSkeletons;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            emptyStateVO = hotelsSearchResultsV5SkeletonVO.asyncErrorMessage;
        }
        EmptyStateVO emptyStateVO2 = emptyStateVO;
        if ((i11 & 8) != 0) {
            z11 = hotelsSearchResultsV5SkeletonVO.isErrorState;
        }
        return hotelsSearchResultsV5SkeletonVO.copy(j12, list2, emptyStateVO2, z11);
    }

    @NotNull
    public final HotelsSearchResultsV5SkeletonVO copy(long id2, @NotNull List<SkeletonItemVO> hotelsSkeletons, EmptyStateVO asyncErrorMessage, boolean isErrorState) {
        Intrinsics.checkNotNullParameter(hotelsSkeletons, "hotelsSkeletons");
        return new HotelsSearchResultsV5SkeletonVO(id2, hotelsSkeletons, asyncErrorMessage, isErrorState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsSearchResultsV5SkeletonVO)) {
            return false;
        }
        HotelsSearchResultsV5SkeletonVO hotelsSearchResultsV5SkeletonVO = (HotelsSearchResultsV5SkeletonVO) other;
        return this.id == hotelsSearchResultsV5SkeletonVO.id && Intrinsics.d(this.hotelsSkeletons, hotelsSearchResultsV5SkeletonVO.hotelsSkeletons) && Intrinsics.d(this.asyncErrorMessage, hotelsSearchResultsV5SkeletonVO.asyncErrorMessage) && this.isErrorState == hotelsSearchResultsV5SkeletonVO.isErrorState;
    }

    public final EmptyStateVO getAsyncErrorMessage() {
        return this.asyncErrorMessage;
    }

    @NotNull
    public final List<SkeletonItemVO> getHotelsSkeletons() {
        return this.hotelsSkeletons;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.hotelsSkeletons);
        EmptyStateVO emptyStateVO = this.asyncErrorMessage;
        return Boolean.hashCode(this.isErrorState) + ((b11 + (emptyStateVO == null ? 0 : emptyStateVO.hashCode())) * 31);
    }

    /* renamed from: isErrorState, reason: from getter */
    public final boolean getIsErrorState() {
        return this.isErrorState;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<SkeletonItemVO> list = this.hotelsSkeletons;
        EmptyStateVO emptyStateVO = this.asyncErrorMessage;
        boolean z11 = this.isErrorState;
        StringBuilder b11 = b.b(j11, "HotelsSearchResultsV5SkeletonVO(id=", ", hotelsSkeletons=", list);
        b11.append(", asyncErrorMessage=");
        b11.append(emptyStateVO);
        b11.append(", isErrorState=");
        b11.append(z11);
        b11.append(")");
        return b11.toString();
    }
}
