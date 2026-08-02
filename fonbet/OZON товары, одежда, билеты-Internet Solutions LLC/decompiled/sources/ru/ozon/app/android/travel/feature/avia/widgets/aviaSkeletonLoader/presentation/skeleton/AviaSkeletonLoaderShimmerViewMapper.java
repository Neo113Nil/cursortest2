package ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.skeleton;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.data.AviaSkeletonLoaderDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.di.AviaSkeletonLoaderComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.view.AviaSkeletonLoaderView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/skeleton/AviaSkeletonLoaderShimmerViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/data/AviaSkeletonLoaderDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/skeleton/AviaSkeletonLoaderShimmerVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/di/AviaSkeletonLoaderComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/di/AviaSkeletonLoaderComponent;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Ll20/d;", "info", "map", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/data/AviaSkeletonLoaderDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/di/AviaSkeletonLoaderComponent;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSkeletonLoaderShimmerViewMapper extends g<AviaSkeletonLoaderDTO, AviaSkeletonLoaderShimmerVO> {

    @NotNull
    private final AviaSkeletonLoaderComponent component;

    public AviaSkeletonLoaderShimmerViewMapper(@NotNull AviaSkeletonLoaderComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof AviaSkeletonLoaderDTO) && ((AviaSkeletonLoaderDTO) state).getSkeletonCount() > 0;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<AviaSkeletonLoaderShimmerVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new AviaSkeletonLoaderShimmerViewHolder(view);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AviaSkeletonLoaderView aviaSkeletonLoaderView = new AviaSkeletonLoaderView(context);
        aviaSkeletonLoaderView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return aviaSkeletonLoaderView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new AviaSkeletonLoaderShimmerDecoration(context));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AviaSkeletonLoaderShimmerVO> map(@NotNull AviaSkeletonLoaderDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getShimmerMapper().invoke(state, info);
    }
}
