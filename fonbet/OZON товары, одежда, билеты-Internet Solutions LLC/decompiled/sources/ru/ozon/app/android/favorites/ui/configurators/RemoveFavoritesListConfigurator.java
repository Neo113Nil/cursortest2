package ru.ozon.app.android.favorites.ui.configurators;

import Ib.a;
import a00.C4911f;
import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/RemoveFavoritesListConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LIb/a;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "pViewModel", "<init>", "(LIb/a;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "(IILandroid/content/Intent;)V", "LIb/a;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveFavoritesListConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<ShoppingListsViewModel> pViewModel;
    public static final int $stable = 8;

    public RemoveFavoritesListConfigurator(@NotNull a<ShoppingListsViewModel> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.pViewModel = pViewModel;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        ShoppingListsViewModel shoppingListsViewModel;
        C4911f ownerContainer2;
        ComponentCallbacksC5392m c12;
        if (resultCode != -1) {
            return;
        }
        ConfiguratorReferences references = getReferences();
        if ((references == null || (ownerContainer2 = references.getOwnerContainer()) == null || (c12 = ownerContainer2.c()) == null || c12.isAdded()) && requestCode == 17463 && data != null) {
            long longExtra = data.getLongExtra("list_id", 0L);
            long longExtra2 = data.getLongExtra("request_id", 0L);
            ConfiguratorReferences references2 = getReferences();
            if (references2 == null || (ownerContainer = references2.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null || (shoppingListsViewModel = (ShoppingListsViewModel) new z0(c11, new z0.c() { // from class: ru.ozon.app.android.favorites.ui.configurators.RemoveFavoritesListConfigurator$onActivityResult$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = RemoveFavoritesListConfigurator.this.pViewModel;
                    ShoppingListsViewModel shoppingListsViewModel2 = (ShoppingListsViewModel) aVar.get();
                    Intrinsics.g(shoppingListsViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return shoppingListsViewModel2;
                }
            }).a(ShoppingListsViewModel.class)) == null) {
                return;
            }
            shoppingListsViewModel.onRemoveFavoritesListClicked(longExtra, longExtra2);
        }
    }
}
