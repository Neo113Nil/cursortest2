package ru.ozon.app.android.favorites.createshoppinglist.actiondelegate;

import Sc.o;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListUpdate;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u001bH\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/actiondelegate/ActionDelegate;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Landroid/view/ViewGroup;", "composerRootView", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;", "action", "", "handle", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;)V", "onLoading", "()V", "onSuccessRename", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$SuccessCreate;", "onSuccessCreate", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$SuccessCreate;)V", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$ValidationError;", "onValidationError", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$ValidationError;)V", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$Error;", "onError", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$Error;)V", "", "message", "", "icon", "showMessage", "(Ljava/lang/String;I)V", "Lru/ozon/app/android/composer/ComposerReferences;", "getReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "Landroid/view/ViewGroup;", "getComposerRootView", "()Landroid/view/ViewGroup;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public class ActionDelegate {

    @NotNull
    private final ViewGroup composerRootView;

    @NotNull
    private final ComposerReferences references;

    public ActionDelegate(@NotNull ComposerReferences references, @NotNull ViewGroup composerRootView) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        this.references = references;
        this.composerRootView = composerRootView;
    }

    @NotNull
    protected final ComposerReferences getReferences() {
        return this.references;
    }

    public final void handle(@NotNull CreateShoppingListViewModel.Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof CreateShoppingListViewModel.Action.Loading) {
            onLoading();
        } else if (action instanceof CreateShoppingListViewModel.Action.SuccessRename) {
            onSuccessRename();
        } else if (action instanceof CreateShoppingListViewModel.Action.SuccessCreate) {
            onSuccessCreate((CreateShoppingListViewModel.Action.SuccessCreate) action);
        } else if (action instanceof CreateShoppingListViewModel.Action.ValidationError) {
            onValidationError((CreateShoppingListViewModel.Action.ValidationError) action);
        } else {
            if (!(action instanceof CreateShoppingListViewModel.Action.Error)) {
                throw new o();
            }
            onError((CreateShoppingListViewModel.Action.Error) action);
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    protected void onError(@NotNull CreateShoppingListViewModel.Action.Error action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ViewGroup composerProgressBar = ComposerViewExtensionKt.composerProgressBar(this.composerRootView);
        if (composerProgressBar != null) {
            ViewExtKt.gone(composerProgressBar);
        }
        showMessage(action.getMessage(), R$drawable.ic_warning);
    }

    protected void onLoading() {
        ViewGroup composerProgressBar = ComposerViewExtensionKt.composerProgressBar(this.composerRootView);
        if (composerProgressBar != null) {
            ViewExtKt.show(composerProgressBar);
        }
    }

    protected void onSuccessCreate(@NotNull CreateShoppingListViewModel.Action.SuccessCreate action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ViewGroup composerProgressBar = ComposerViewExtensionKt.composerProgressBar(this.composerRootView);
        if (composerProgressBar != null) {
            ViewExtKt.gone(composerProgressBar);
        }
    }

    protected void onSuccessRename() {
        ViewGroup composerProgressBar = ComposerViewExtensionKt.composerProgressBar(this.composerRootView);
        if (composerProgressBar != null) {
            ViewExtKt.gone(composerProgressBar);
        }
    }

    protected void onValidationError(@NotNull CreateShoppingListViewModel.Action.ValidationError action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ViewGroup composerProgressBar = ComposerViewExtensionKt.composerProgressBar(this.composerRootView);
        if (composerProgressBar != null) {
            ViewExtKt.gone(composerProgressBar);
        }
        this.references.getController().update(new CreateShoppingListUpdate.Error(action.getListTitle(), action.getMessage()));
    }

    protected final void showMessage(@NotNull String message, int icon) {
        ViewGroup rootView;
        Intrinsics.checkNotNullParameter(message, "message");
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            r a11 = this.references.getContainer().a();
            rootView = a11 != null ? ContextExtKt.getRootView(a11) : null;
            if (rootView == null) {
                return;
            }
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(icon), null, null, null, null, null, null, null, 3000L, null, null, this.references.getContainer().g(), 57306, null).show();
    }
}
