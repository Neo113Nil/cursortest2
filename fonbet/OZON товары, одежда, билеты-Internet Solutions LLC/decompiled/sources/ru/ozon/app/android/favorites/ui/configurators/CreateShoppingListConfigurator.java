package ru.ozon.app.android.favorites.ui.configurators;

import GZ.g;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.favorites.ui.notification.NotificationBundle;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/CreateShoppingListConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "listsEventsManager", "<init>", "(LGZ/g;Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;)V", "Lru/ozon/app/android/favorites/ui/configurators/Result;", "result", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "message", "", "showMessage", "(Lru/ozon/app/android/favorites/ui/configurators/Result;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "updateFavoritesState", "()V", "LGZ/g;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CreateShoppingListConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final FavoritesListsEventsManager listsEventsManager;

    @NotNull
    private final g ozonRouter;
    public static final int $stable = 8;

    public CreateShoppingListConfigurator(@NotNull g ozonRouter, @NotNull FavoritesListsEventsManager listsEventsManager) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(listsEventsManager, "listsEventsManager");
        this.ozonRouter = ozonRouter;
        this.listsEventsManager = listsEventsManager;
    }

    private final void showMessage(Result result, OzonSpannableString message) {
        Uri listFavoriteWithTitle = LinkGenerator.INSTANCE.listFavoriteWithTitle(result.getDeeplink(), result.getTitle());
        ViewGroup rootView = ContextExtKt.getRootView(getContainer().i());
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = message == null ? OzonSpannableStringKt.toOzonSpannableString(result.getDescription()) : message;
            FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(R$drawable.ic_check_green), null, null, null, new Action(StringProvider.getString(R$string.favorites_open_favorite_list), false, new CreateShoppingListConfigurator$showMessage$1$1$1(this, listFavoriteWithTitle), 2, null), null, null, null, 3000L, null, null, getContainer().g(), 56794, null).show();
        }
    }

    static /* synthetic */ void showMessage$default(CreateShoppingListConfigurator createShoppingListConfigurator, Result result, OzonSpannableString ozonSpannableString, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMessage");
        }
        if ((i11 & 2) != 0) {
            ozonSpannableString = null;
        }
        createShoppingListConfigurator.showMessage(result, ozonSpannableString);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1 && getContainer().a() != null) {
            Parcelable parcelableExtra = data != null ? data.getParcelableExtra("result") : null;
            Result result = parcelableExtra instanceof Result ? (Result) parcelableExtra : null;
            NotificationBundle notificationBundle = data != null ? (NotificationBundle) data.getParcelableExtra("bundle") : null;
            if (result != null) {
                switch (requestCode) {
                    case 28416:
                        ComposerExtKt.setResult$default(getContainer(), null, 0, null, 7, null);
                        FavoritesListsEventsManager.onListCreated$default(this.listsEventsManager, null, null, null, null, 15, null);
                        showMessage$default(this, result, null, 2, null);
                        break;
                    case 28417:
                        ComposerExtKt.setResult$default(getContainer(), null, 0, null, 7, null);
                        updateFavoritesState();
                        if (!result.getWasProductAdded()) {
                            Uri listFavoriteWithTitle = LinkGenerator.INSTANCE.listFavoriteWithTitle(result.getDeeplink(), result.getTitle());
                            g gVar = this.ozonRouter;
                            String uri = listFavoriteWithTitle.toString();
                            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                            gVar.b(uri, 18753, U.c());
                            break;
                        } else {
                            showMessage(result, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.favorites_product_added_to_new_favorites_list_android, result.getTitle())));
                            break;
                        }
                    case 28418:
                        ComposerExtKt.setResult$default(getContainer(), data, 0, null, 6, null);
                        ComposerExtKt.closeFlow(getContainer());
                        this.listsEventsManager.onListCreated(result.getDeeplink(), result.getTitle(), Integer.valueOf(result.getQuantity()), notificationBundle);
                        break;
                }
            }
        }
    }

    public void updateFavoritesState() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, null, null, null, null, 15);
    }
}
