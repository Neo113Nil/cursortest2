package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.data.TravelRailwaySearchResultsV4DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.di.TravelRailwaySearchResultsV4Component;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.view.TravelRailwaySearchResultsV4LoaderView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/TravelRailwaySearchResultsV4ProgressViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/TravelRailwaySearchResultsV4ProgressVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/di/TravelRailwaySearchResultsV4Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/di/TravelRailwaySearchResultsV4Component;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/view/TravelRailwaySearchResultsV4LoaderView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/view/TravelRailwaySearchResultsV4LoaderView;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/di/TravelRailwaySearchResultsV4Component;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4ProgressViewMapper extends g<TravelRailwaySearchResultsV4DTO, TravelRailwaySearchResultsV4ProgressVO> {

    @NotNull
    private final TravelRailwaySearchResultsV4Component component;
    private final Integer layout;

    public TravelRailwaySearchResultsV4ProgressViewMapper(@NotNull TravelRailwaySearchResultsV4Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof TravelRailwaySearchResultsV4DTO) && ((TravelRailwaySearchResultsV4DTO) state).getRequestTrainsAction() != null;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<TravelRailwaySearchResultsV4ProgressVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new TravelRailwaySearchResultsV4ProgressWidgetViewHolder((TravelRailwaySearchResultsV4LoaderView) view, container, (TravelRailwaySearchResultsV4ProgressViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.TravelRailwaySearchResultsV4ProgressViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TravelRailwaySearchResultsV4Component travelRailwaySearchResultsV4Component;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                travelRailwaySearchResultsV4Component = TravelRailwaySearchResultsV4ProgressViewMapper.this.component;
                TravelRailwaySearchResultsV4ProgressViewModel progressViewModel = travelRailwaySearchResultsV4Component.getProgressViewModel();
                Intrinsics.g(progressViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return progressViewModel;
            }
        }).a(TravelRailwaySearchResultsV4ProgressViewModel.class), this.component.getPerformanceTrackerDelegate());
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public TravelRailwaySearchResultsV4LoaderView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelRailwaySearchResultsV4LoaderView travelRailwaySearchResultsV4LoaderView = new TravelRailwaySearchResultsV4LoaderView(context);
        travelRailwaySearchResultsV4LoaderView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return travelRailwaySearchResultsV4LoaderView;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TravelRailwaySearchResultsV4ProgressVO> map(@NotNull TravelRailwaySearchResultsV4DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getProgressMapper().invoke(state, info);
    }
}
