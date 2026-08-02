package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.skeleton;

import A00.a;
import Pc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import h20.InterfaceC6786a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.di.SegmentedTrainRouteComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.views.skeleton.SegmentedTrainRouteSkeletonView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010-\u001a\u000e\u0012\n\b\u0001\u0012\u00060)j\u0002`*0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/di/SegmentedTrainRouteComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/di/SegmentedTrainRouteComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI;Ll20/d;)Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "", "canMap", "(Ljava/lang/Object;)Z", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI;)Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/di/SegmentedTrainRouteComponent;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteSkeletonViewMapper extends g<SegmentedTrainRouteSkeletonVI, SegmentedTrainRouteSkeletonVI> {

    @NotNull
    private final SegmentedTrainRouteComponent component;

    @NotNull
    private final List<Class<SegmentedTrainRouteSkeletonUpdate>> supportedUpdates;

    public SegmentedTrainRouteSkeletonViewMapper(@NotNull SegmentedTrainRouteComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.a0(SegmentedTrainRouteSkeletonUpdate.class);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SegmentedTrainRouteSkeletonVI;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<SegmentedTrainRouteSkeletonVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new SegmentedTrainRouteSkeletonWidgetViewHolder((SegmentedTrainRouteSkeletonView) view, container, this.component.getTokenizedAnalytics());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SegmentedTrainRouteSkeletonView segmentedTrainRouteSkeletonView = new SegmentedTrainRouteSkeletonView(context);
        segmentedTrainRouteSkeletonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return segmentedTrainRouteSkeletonView;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<SegmentedTrainRouteSkeletonUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return this.component.getWidgetViewModelProvider();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    public SegmentedTrainRouteSkeletonVI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SegmentedTrainRouteSkeletonVI oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof SegmentedTrainRouteSkeletonUpdate) {
            return SegmentedTrainRouteSkeletonVI.copy$default(oldItem, 0L, null, ((SegmentedTrainRouteSkeletonUpdate) update).getState(), 3, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SegmentedTrainRouteSkeletonVI> map(@NotNull SegmentedTrainRouteSkeletonVI state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(state);
    }
}
