package ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.button;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.search.catalog.components.categoryMenu.data.CategoryMenuDTO;
import ru.ozon.app.android.search.catalog.components.categoryMenu.di.CategoryMenuComponent;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.CategoryMenuViewModel;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\f\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00162\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R0\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/button/CategoryMenuButtonOverlayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/search/catalog/components/categoryMenu/di/CategoryMenuComponent;", "Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuDTO;", "Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/button/CategoryMenuButtonVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "mapper", "Lkotlin/jvm/functions/Function2;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CategoryMenuButtonOverlayViewMapper extends OverlayWidgetScreenViewItemMapper2<CategoryMenuComponent, CategoryMenuDTO, CategoryMenuButtonVO> {

    @NotNull
    private final Function2<CategoryMenuDTO, d, List<CategoryMenuButtonVO>> mapper = CategoryMenuButtonOverlayViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CategoryMenuButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new CategoryMenuButtonOverlayViewHolder(container, component().getComposerNavigator(), (CategoryMenuViewModel) new z0(container.a0().b(), new z0.c() { // from class: ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.button.CategoryMenuButtonOverlayViewMapper$createHolder$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CategoryMenuViewModel viewModel = CategoryMenuButtonOverlayViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(CategoryMenuViewModel.class));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CategoryMenuComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CategoryMenuComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CategoryMenuButtonVO> map(@NotNull CategoryMenuDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.mapper.invoke(state, info);
    }
}
