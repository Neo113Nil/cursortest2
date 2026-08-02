package ru.ozon.app.android.favorites.createshoppinglist.actiondelegate;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/actiondelegate/WishlistActionDelegate;", "Lru/ozon/app/android/favorites/createshoppinglist/actiondelegate/ActionDelegate;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "composerRootView", "Landroid/view/ViewGroup;", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/ViewGroup;)V", "onSuccessCreate", "", "action", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$SuccessCreate;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WishlistActionDelegate extends ActionDelegate {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WishlistActionDelegate(@NotNull ComposerReferences references, @NotNull ViewGroup composerRootView) {
        super(references, composerRootView);
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
    }

    @Override // ru.ozon.app.android.favorites.createshoppinglist.actiondelegate.ActionDelegate
    protected void onSuccessCreate(@NotNull CreateShoppingListViewModel.Action.SuccessCreate action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ComposerExtKt.closeFlow(getReferences().getContainer());
    }
}
