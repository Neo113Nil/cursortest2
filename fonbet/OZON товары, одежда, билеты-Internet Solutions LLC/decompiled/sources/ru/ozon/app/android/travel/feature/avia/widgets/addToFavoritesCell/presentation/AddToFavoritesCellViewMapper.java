package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation;

import A00.a;
import Bl.b;
import Nk.a;
import a00.h;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.favorites.AddToFavoritesViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.data.AddToFavoritesCellDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.di.AddToFavoritesCellComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation.AddToFavoritesCellVI;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0018j\b\u0012\u0004\u0012\u00020\u0003`\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/data/AddToFavoritesCellDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/di/AddToFavoritesCellComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/di/AddToFavoritesCellComponent;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI;)Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/data/AddToFavoritesCellDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/di/AddToFavoritesCellComponent;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddToFavoritesCellViewMapper extends g<AddToFavoritesCellDTO, AddToFavoritesCellVI> {

    @NotNull
    private final AddToFavoritesCellComponent component;

    @NotNull
    private final List<Class<AddToFavoritesUpdate>> supportedUpdates;

    public AddToFavoritesCellViewMapper(@NotNull AddToFavoritesCellComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.a0(AddToFavoritesUpdate.class);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<AddToFavoritesCellVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        CellView cellView = (CellView) view;
        h a02 = container.a0();
        final AddToFavoritesCellComponent addToFavoritesCellComponent = this.component;
        return new AddToFavoritesCellWidgetViewHolder(cellView, (AddToFavoritesViewModel) new z0(a02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation.AddToFavoritesCellViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AddToFavoritesViewModel viewModel = AddToFavoritesCellComponent.this.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(AddToFavoritesViewModel.class), this.component.getFavoriteManager(), this.component.getCustomActionHandlersStoreFactory(), container);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(a.a(parent, "parent", "getContext(...)"), null, 1, null);
        CellView cellView = (CellView) b.a(CellView.class, "type", q.f64554a, null);
        if (cellView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            cellView = new CellView(context, null, 0, 0, null, 30, null);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMarginStart(dimens$default.getMargin8());
        marginLayoutParams.setMarginEnd(dimens$default.getMargin8());
        marginLayoutParams.topMargin = dimens$default.getMargin8();
        cellView.setLayoutParams(marginLayoutParams);
        return cellView;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<AddToFavoritesUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    public AddToFavoritesCellVI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AddToFavoritesCellVI oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof AddToFavoritesUpdate)) {
            return null;
        }
        CellDTO.RightBlock rightBlock = oldItem.getCell().getRightBlock();
        AtomDTO control = rightBlock != null ? rightBlock.getControl() : null;
        if (control instanceof ToggleDTO) {
            ToggleDTO toggleDTO = (ToggleDTO) control;
            AddToFavoritesUpdate addToFavoritesUpdate = (AddToFavoritesUpdate) update;
            if (!Intrinsics.d(toggleDTO.isSelected(), Boolean.valueOf(addToFavoritesUpdate.getIsFavorite())) || oldItem.getModel().getIsFavorite() != addToFavoritesUpdate.getIsFavorite()) {
                CellDTO cell = oldItem.getCell();
                CellDTO.RightBlock rightBlock2 = oldItem.getCell().getRightBlock();
                return AddToFavoritesCellVI.copy$default(oldItem, 0L, CellDTO.copy$default(cell, null, null, null, rightBlock2 != null ? CellDTO.RightBlock.copy$default(rightBlock2, null, null, null, null, null, null, null, null, null, null, ToggleDTO.copy$default(toggleDTO, Boolean.valueOf(addToFavoritesUpdate.getIsFavorite()), null, null, null, null, null, 62, null), null, 3071, null) : null, null, 23, null), AddToFavoritesCellVI.AddToFavoritesCellModelVI.copy$default(oldItem.getModel(), null, null, null, addToFavoritesUpdate.getIsFavorite(), null, null, 55, null), null, null, 25, null);
            }
        }
        return oldItem;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AddToFavoritesCellVI> map(@NotNull AddToFavoritesCellDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
