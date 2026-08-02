package ru.ozon.app.android.search.catalog.components.clusters.core;

import a00.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l10.v;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.clusters.data.ClustersDTO;
import ru.ozon.app.android.search.catalog.components.clusters.di.ClustersWidgetComponent;
import ru.ozon.app.android.search.catalog.components.clusters.presentation.ClustersScrollViewModel;
import ru.ozon.app.android.search.catalog.components.clusters.presentation.ClustersVO;
import ru.ozon.app.android.search.catalog.components.clusters.presentation.ClustersWidgetViewHolder;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/search/catalog/components/clusters/core/ClustersViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/search/catalog/components/clusters/data/ClustersDTO;", "Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersVO;", "Lru/ozon/app/android/search/catalog/components/clusters/di/ClustersWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/search/catalog/components/clusters/di/ClustersWidgetComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/search/catalog/components/clusters/data/ClustersDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/search/catalog/components/clusters/di/ClustersWidgetComponent;", "Lru/ozon/app/android/search/catalog/components/clusters/core/ClustersMapper;", "mapper", "Lru/ozon/app/android/search/catalog/components/clusters/core/ClustersMapper;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClustersViewMapper extends g<ClustersDTO, ClustersVO> {

    @NotNull
    private final ClustersWidgetComponent component;

    @NotNull
    private final ClustersMapper mapper;
    public static final int $stable = 8;
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp4 = ResourceExtKt.toPx(4);

    public ClustersViewMapper(@NotNull ClustersWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = component.getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public k<ClustersVO> createHolder(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        v b02 = container.b0();
        return new ClustersWidgetViewHolder((RecyclerView) view, container, (ClustersScrollViewModel) ((w0) j.a(b02.a(), N.b(ClustersScrollViewModel.class), new ClustersViewMapper$createHolder$1(this)).getValue()));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(parent.getContext(), 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        ViewExtKt.updatePadding$default(recyclerView, 0, dp8, 0, dp4, 5, null);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(ResourceExtKt.color(context, UniColors.LAYER_FLOOR_1.getResId()));
        return recyclerView;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ClustersVO> map(@NotNull ClustersDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.mapper.invoke(state, info);
    }
}
