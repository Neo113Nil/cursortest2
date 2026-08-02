package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data.TravelRailwaySearchResultsV3DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.view.RailwaySearchResultsV3TrainView;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR0\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060 j\u0002`!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainProViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/di/TravelRailwaySearchResultsV3Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/di/TravelRailwaySearchResultsV3Component;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainsDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/di/TravelRailwaySearchResultsV3Component;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainProWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV3TrainProViewMapper extends WidgetViewMapper<TravelRailwaySearchResultsV3DTO, TravelRailwaySearchResultsV3TrainVO> {

    @NotNull
    private final TravelRailwaySearchResultsV3Component component;

    @NotNull
    private final Function2<View, ComposerReferences, TravelRailwaySearchResultsV3TrainProWidgetViewHolder> holderProducer;

    public TravelRailwaySearchResultsV3TrainProViewMapper(@NotNull TravelRailwaySearchResultsV3Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.holderProducer = new TravelRailwaySearchResultsV3TrainProViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof TravelRailwaySearchResultsV3DTO) && ((TravelRailwaySearchResultsV3DTO) state).getRequestTrainsAction() == null;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RailwaySearchResultsV3TrainView railwaySearchResultsV3TrainView = new RailwaySearchResultsV3TrainView(context);
        railwaySearchResultsV3TrainView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return railwaySearchResultsV3TrainView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<TravelRailwaySearchResultsV3TrainsDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new TravelRailwaySearchResultsV3TrainsDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TravelRailwaySearchResultsV3TrainVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TravelRailwaySearchResultsV3DTO, d, List<TravelRailwaySearchResultsV3TrainVO>> getMapper() {
        return this.component.getTrainMapper();
    }
}
