package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky;

import A00.a;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogueTabsViewModelFactoryKt;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.SelectTabEvent;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.data.CatalogTabsV2DTO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di.CatalogTabsV2Component;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.CatalogTabsV2VO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\r\u001a\u00020\u00032\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001fj\b\u0012\u0004\u0012\u00020\u0002` 2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u0004\u0018\u00010\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R(\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020#0.0\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/sticky/CatalogTabsV2OverlayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/di/CatalogTabsV2Component;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;", "tabsComponent", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/di/CatalogTabsV2Component;)V", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "createView", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView;", "state", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/di/CatalogTabsV2Component;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsV2OverlayViewMapper extends OverlayWidgetScreenViewItemMapper2<CatalogTabsV2Component, CatalogTabsV2DTO, CatalogTabsV2VO> {

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    @NotNull
    private final CatalogTabsV2Component tabsComponent;

    @NotNull
    private final r.a viewType;

    public CatalogTabsV2OverlayViewMapper(@NotNull CatalogTabsV2Component tabsComponent) {
        Intrinsics.checkNotNullParameter(tabsComponent, "tabsComponent");
        this.tabsComponent = tabsComponent;
        this.viewType = r.a.SINGLE;
        this.supportedUpdates = C7714v.a0(SelectTabEvent.class);
    }

    private final RecyclerView createView(ViewGroup parent) {
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setId(R$id.catalogTabsSticky);
        recyclerView.setLayoutParams(new CoordinatorLayout.f(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setElevation(UiExtKt.toPxF(-8));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setVisibility(4);
        return recyclerView;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof CatalogTabsV2DTO) && ((CatalogTabsV2DTO) state).isSticky();
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CatalogTabsV2VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new CatalogTabsV2OverlayViewHolder(container.Z(), createView(container.Z()), container, CatalogueTabsViewModelFactoryKt.createCatalogueTabsViewModel(container.a0().a(), this.tabsComponent.getCatalogTabsSharedViewModelProvider()), this.tabsComponent.getTokenizedAnalytics());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CatalogTabsV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CatalogTabsV2Component.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    public CatalogTabsV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CatalogTabsV2VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return this.tabsComponent.getCatalogueTabsUpdateConsumer().invoke(update, oldItem);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CatalogTabsV2VO> map(@NotNull CatalogTabsV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.tabsComponent.getMapper().invoke(state, info);
    }
}
