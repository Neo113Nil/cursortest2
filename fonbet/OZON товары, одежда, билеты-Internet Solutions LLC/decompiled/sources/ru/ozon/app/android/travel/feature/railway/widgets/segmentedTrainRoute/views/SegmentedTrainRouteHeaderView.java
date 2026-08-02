package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.views;

import android.content.Context;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.header.SegmentedTrainRouteHeaderVI;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/views/SegmentedTrainRouteHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp12", "dp16", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "trainInfoCV", "Lru/ozon/uni/android/cell/CellView;", "serviceBadgesHFAL", "Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "bind", "", "section", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/header/SegmentedTrainRouteHeaderVI;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteHeaderView extends LinearLayout {
    public static final int $stable = (HorizontalFlexAtomsLayout.$stable | CellView.$stable) | AtomsAdapter.$stable;

    @NotNull
    private final AtomsAdapter atomsAdapter;
    private final int dp12;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final HorizontalFlexAtomsLayout serviceBadgesHFAL;

    @NotNull
    private final CellView trainInfoCV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedTrainRouteHeaderView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        CellView cellView = (CellView) q.f64554a.i(N.b(CellView.class), context);
        if (cellView == null) {
            context2 = context;
            cellView = new CellView(context2, null, 0, 0, null, 30, null);
        } else {
            context2 = context;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = px3;
        layoutParams.rightMargin = px3;
        cellView.setLayoutParams(layoutParams);
        this.trainInfoCV = cellView;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = new HorizontalFlexAtomsLayout(context2, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = px;
        layoutParams2.leftMargin = px3;
        layoutParams2.rightMargin = px3;
        layoutParams2.bottomMargin = px2;
        horizontalFlexAtomsLayout.setLayoutParams(layoutParams2);
        horizontalFlexAtomsLayout.setAdapter(atomsAdapter);
        this.serviceBadgesHFAL = horizontalFlexAtomsLayout;
        addView(cellView);
        addView(horizontalFlexAtomsLayout);
        setOrientation(1);
    }

    public final void bind(@NotNull SegmentedTrainRouteHeaderVI section) {
        Intrinsics.checkNotNullParameter(section, "section");
        CellHolderKt.bind$default(this.trainInfoCV, section.getTrainInfo(), null, 2, null);
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, section.getServiceBadges());
        this.serviceBadgesHFAL.setVisibility(section.getIsServiceBadgesVisible() ? 0 : 8);
    }
}
