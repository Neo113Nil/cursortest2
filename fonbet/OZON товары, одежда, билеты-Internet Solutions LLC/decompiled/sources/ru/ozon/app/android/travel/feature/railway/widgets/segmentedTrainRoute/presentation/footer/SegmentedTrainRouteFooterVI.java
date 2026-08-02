package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.footer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/footer/SegmentedTrainRouteFooterVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "localTimeInfo", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "toggleDetailsButton", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLocalTimeInfo", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getToggleDetailsButton", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteFooterVI implements c {
    public static final int $stable = CellDTO.$stable;
    private final long id;

    @NotNull
    private final TextDTO localTimeInfo;
    private final CellDTO toggleDetailsButton;

    public SegmentedTrainRouteFooterVI(long j11, @NotNull TextDTO localTimeInfo, CellDTO cellDTO) {
        Intrinsics.checkNotNullParameter(localTimeInfo, "localTimeInfo");
        this.id = j11;
        this.localTimeInfo = localTimeInfo;
        this.toggleDetailsButton = cellDTO;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextDTO getLocalTimeInfo() {
        return this.localTimeInfo;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final CellDTO getToggleDetailsButton() {
        return this.toggleDetailsButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
