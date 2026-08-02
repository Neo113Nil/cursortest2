package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.transfer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/transfer/SegmentedTrainRouteTransferVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "transferInfo", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTransferInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteTransferVI implements c {
    public static final int $stable = CellDTO.$stable;
    private final long id;

    @NotNull
    private final CellDTO transferInfo;

    public SegmentedTrainRouteTransferVI(long j11, @NotNull CellDTO transferInfo) {
        Intrinsics.checkNotNullParameter(transferInfo, "transferInfo");
        this.id = j11;
        this.transferInfo = transferInfo;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final CellDTO getTransferInfo() {
        return this.transferInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
