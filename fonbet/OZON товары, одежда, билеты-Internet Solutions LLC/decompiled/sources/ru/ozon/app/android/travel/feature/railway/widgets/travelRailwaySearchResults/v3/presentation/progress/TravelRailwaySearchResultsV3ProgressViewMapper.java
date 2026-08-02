package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data.TravelRailwaySearchResultsV3DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.view.TravelRailwaySearchResultsV3LoaderView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/progress/TravelRailwaySearchResultsV3ProgressViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/progress/TravelRailwaySearchResultsV3ProgressVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/di/TravelRailwaySearchResultsV3Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/di/TravelRailwaySearchResultsV3Component;)V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO;Ll20/d;)Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/progress/view/TravelRailwaySearchResultsV3LoaderView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/progress/view/TravelRailwaySearchResultsV3LoaderView;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/di/TravelRailwaySearchResultsV3Component;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV3ProgressViewMapper extends g<TravelRailwaySearchResultsV3DTO, TravelRailwaySearchResultsV3ProgressVO> {

    @NotNull
    private final TravelRailwaySearchResultsV3Component component;
    private final Integer layout;

    public TravelRailwaySearchResultsV3ProgressViewMapper(@NotNull TravelRailwaySearchResultsV3Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof TravelRailwaySearchResultsV3DTO) && ((TravelRailwaySearchResultsV3DTO) state).getRequestTrainsAction() != null;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<TravelRailwaySearchResultsV3ProgressVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new TravelRailwaySearchResultsV3ProgressWidgetViewHolder((TravelRailwaySearchResultsV3LoaderView) view, this.component.getPerformanceTrackerDelegate(), container, (TravelRailwaySearchResultsV3ProgressViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.TravelRailwaySearchResultsV3ProgressViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TravelRailwaySearchResultsV3Component travelRailwaySearchResultsV3Component;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                travelRailwaySearchResultsV3Component = TravelRailwaySearchResultsV3ProgressViewMapper.this.component;
                TravelRailwaySearchResultsV3ProgressViewModel progressViewModel = travelRailwaySearchResultsV3Component.getProgressViewModel();
                Intrinsics.g(progressViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return progressViewModel;
            }
        }).a(TravelRailwaySearchResultsV3ProgressViewModel.class));
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public TravelRailwaySearchResultsV3LoaderView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelRailwaySearchResultsV3LoaderView travelRailwaySearchResultsV3LoaderView = new TravelRailwaySearchResultsV3LoaderView(context);
        travelRailwaySearchResultsV3LoaderView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        travelRailwaySearchResultsV3LoaderView.setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
        return travelRailwaySearchResultsV3LoaderView;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TravelRailwaySearchResultsV3ProgressVO> map(@NotNull TravelRailwaySearchResultsV3DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getProgressMapper().invoke(state, info);
    }
}
