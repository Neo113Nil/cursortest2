package ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar;

import A00.a;
import android.view.LayoutInflater;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import com.google.android.material.appbar.AppBarLayout;
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
import ru.ozon.app.android.common.filterWidgets.filters.data.FilterNavBarModel;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar.models.FilterNavBarVO;
import ru.ozon.app.android.common.filterWidgets.filtervalues.di.FilterValuesComponent;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.SelectionButtons;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterNavBarBinding;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0011\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001ej\b\u0012\u0004\u0012\u00020\u0002`\u001f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/FilterNavBarViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/di/FilterValuesComponent;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FilterNavBarModel;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/models/FilterNavBarVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/models/FilterNavBarVO;)Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/models/FilterNavBarVO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/common/filterWidgets/filters/data/FilterNavBarModel;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/UpdateSelectionButtonState;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FilterNavBarViewMapper extends OverlayWidgetScreenViewItemMapper2<FilterValuesComponent, FilterNavBarModel, FilterNavBarVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<UpdateSelectionButtonState>> supportedUpdates = C7714v.a0(UpdateSelectionButtonState.class);

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof FilterNavBarModel;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<FilterNavBarVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(container.Y());
        if (composerAppbar == null) {
            AbstractC6065b.INSTANCE.getClass();
            return AbstractC6065b.Companion.a();
        }
        FilterNavBarBinding inflate = FilterNavBarBinding.inflate(LayoutInflater.from(composerAppbar.getContext()), composerAppbar, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new FilterNavBarViewHolder(inflate, container, composerAppbar, (FilterValuesViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar.FilterNavBarViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FilterValuesViewModel filterValuesViewModel = FilterNavBarViewMapper.this.component().getFilterValuesViewModel();
                Intrinsics.g(filterValuesViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return filterValuesViewModel;
            }
        }).a(FilterValuesViewModel.class));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<UpdateSelectionButtonState>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<FilterValuesComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return FilterValuesComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    public FilterNavBarVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull FilterNavBarVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof UpdateSelectionButtonState)) {
            return oldItem;
        }
        SelectionButtons selectionButtons = oldItem.getSelectionButtons();
        return FilterNavBarVO.copy$default(oldItem, 0L, null, selectionButtons != null ? SelectionButtons.copy$default(selectionButtons, !oldItem.getSelectionButtons().getIsSelectedAll(), null, null, 6, null) : null, 0, null, 27, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<FilterNavBarVO> map(@NotNull FilterNavBarModel state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(FilterNavBarMapperKt.toVO(state));
    }
}
