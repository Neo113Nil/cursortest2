package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.header;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\n\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/header/SegmentedTrainRouteHeaderVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "trainInfo", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "serviceBadges", "", "isServiceBadgesVisible", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Z)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTrainInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/util/List;", "getServiceBadges", "()Ljava/util/List;", "Z", "()Z", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteHeaderVI implements c {
    private final long id;
    private final boolean isServiceBadgesVisible;

    @NotNull
    private final List<BadgeDTO> serviceBadges;

    @NotNull
    private final CellDTO trainInfo;

    public SegmentedTrainRouteHeaderVI(long j11, @NotNull CellDTO trainInfo, @NotNull List<BadgeDTO> serviceBadges, boolean z11) {
        Intrinsics.checkNotNullParameter(trainInfo, "trainInfo");
        Intrinsics.checkNotNullParameter(serviceBadges, "serviceBadges");
        this.id = j11;
        this.trainInfo = trainInfo;
        this.serviceBadges = serviceBadges;
        this.isServiceBadgesVisible = z11;
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
    public final List<BadgeDTO> getServiceBadges() {
        return this.serviceBadges;
    }

    @NotNull
    public final CellDTO getTrainInfo() {
        return this.trainInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    /* renamed from: isServiceBadgesVisible, reason: from getter */
    public final boolean getIsServiceBadgesVisible() {
        return this.isServiceBadgesVisible;
    }
}
