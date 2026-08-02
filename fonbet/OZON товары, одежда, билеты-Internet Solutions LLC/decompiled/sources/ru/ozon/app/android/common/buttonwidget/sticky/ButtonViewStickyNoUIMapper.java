package ru.ozon.app.android.common.buttonwidget.sticky;

import GZ.g;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import j10.h;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent;
import ru.ozon.app.android.common.ui.buttonwidget.ButtonVO;
import ru.ozon.app.android.common.ui.buttonwidget.R$layout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.ComposerInflater;
import ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.FavoritesListAtomActionSheetHandler;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.app.android.widgets.buttonWidget.ButtonWidgetDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\rj\u0002`\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00020 j\b\u0012\u0004\u0012\u00020\u0002`!2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b\"\u0010#R0\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060%j\u0002`&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050'0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/common/buttonwidget/sticky/ButtonViewStickyNoUIMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/BottomContainerViewMapper2;", "Lru/ozon/app/android/common/buttonwidget/di/ButtonWidgetComponent;", "Lru/ozon/app/android/common/buttonwidget/sticky/ButtonStickyViewHolder;", "Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;", "Lru/ozon/app/android/common/ui/buttonwidget/ButtonVO;", "<init>", "()V", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "inflater", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/app/android/common/buttonwidget/sticky/ButtonStickyViewHolder;", "holder", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "bind", "(Lru/ozon/app/android/common/buttonwidget/sticky/ButtonStickyViewHolder;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "button-widget_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonViewStickyNoUIMapper extends BottomContainerViewMapper2<ButtonWidgetComponent, ButtonStickyViewHolder, ButtonWidgetDTO, ButtonVO> {
    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof ButtonWidgetDTO)) {
            return false;
        }
        ButtonWidgetDTO buttonWidgetDTO = (ButtonWidgetDTO) state;
        return buttonWidgetDTO.isSticky() && buttonWidgetDTO.getButtonV2() == null && buttonWidgetDTO.getButtonV3() == null;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    public /* bridge */ /* synthetic */ ButtonStickyViewHolder createHolder(ComposerInflater composerInflater, ComposerReferences composerReferences, h hVar) {
        return createHolder(composerInflater, composerReferences, (h<l>) hVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<ButtonWidgetDTO, d, List<ButtonVO>> getMapper() {
        return ((ButtonWidgetComponent) component()).getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ButtonWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ButtonWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2
    public void bind(@NotNull ButtonStickyViewHolder holder, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.common.ui.buttonwidget.ButtonVO");
        k.bindItem$default(holder, (ButtonVO) d11, viewObject.c(), null, 4, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    @NotNull
    public ButtonStickyViewHolder createHolder(@NotNull ComposerInflater inflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        View inflate = inflater.inflate(R$layout.widget_button_widget);
        Intrinsics.g(inflate, "null cannot be cast to non-null type ru.ozon.uni.atoms.v3.containers.SingleAtom");
        ActionSheetEventHandler actionSheetEventHandler = ((ButtonWidgetComponent) component()).getActionSheetEventHandler();
        g ozonRouter = ((ButtonWidgetComponent) component()).getOzonRouter();
        JsonParser jsonDeserializer = ((ButtonWidgetComponent) component()).getJsonDeserializer();
        FavoritesListsInteractor interactor = ((ButtonWidgetComponent) component()).getInteractor();
        w0 a11 = new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.common.buttonwidget.sticky.ButtonViewStickyNoUIMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ShoppingListsViewModel shoppingListsViewModel = ((ButtonWidgetComponent) ButtonViewStickyNoUIMapper.this.component()).getShoppingListsViewModelProvider().get();
                Intrinsics.g(shoppingListsViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return shoppingListsViewModel;
            }
        }).a(ShoppingListsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
        return new ButtonStickyViewHolder((SingleAtom) inflate, actionSheetEventHandler, references, voHelper, e0.a(new FavoritesListAtomActionSheetHandler(ozonRouter, jsonDeserializer, interactor, (ShoppingListsViewModel) a11, ((ButtonWidgetComponent) component()).getCartService(), ((ButtonWidgetComponent) component()).getEventsManager(), references, ((ButtonWidgetComponent) component()).getCreateFavoritesListDelegate(), ((ButtonWidgetComponent) component()).getAdultHandler(), ((ButtonWidgetComponent) component()).getSellerFavoriteService(), ((ButtonWidgetComponent) component()).getFavoriteEntityInteractor(), null, false, null, 14336, null)), ((ButtonWidgetComponent) component()).getCustomActionHandlersStoreFactory().create(((ButtonWidgetComponent) component()).getButtonWidgetCustomActionHandlers().getActionHandlers()));
    }
}
