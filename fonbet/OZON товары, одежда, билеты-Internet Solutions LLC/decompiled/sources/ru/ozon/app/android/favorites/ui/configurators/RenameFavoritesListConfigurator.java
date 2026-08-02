package ru.ozon.app.android.favorites.ui.configurators;

import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.domain.flags.FavoritesWishlistsEnabledFlag;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/RenameFavoritesListConfigurator;", "Lru/ozon/app/android/favorites/ui/configurators/FavoritesListsUpdateEventsConfigurator;", "favoritesListsEventsManager", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "handleEvents", "", "events", "", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent;", "updateFavoritesState", "handleResult", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class RenameFavoritesListConfigurator extends FavoritesListsUpdateEventsConfigurator {

    @NotNull
    private final FavoritesListsEventsManager favoritesListsEventsManager;

    @NotNull
    private final FeatureChecker featureChecker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenameFavoritesListConfigurator(@NotNull FavoritesListsEventsManager favoritesListsEventsManager, @NotNull FeatureChecker featureChecker) {
        super(favoritesListsEventsManager);
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.favoritesListsEventsManager = favoritesListsEventsManager;
        this.featureChecker = featureChecker;
    }

    private final void handleResult() {
        updateFavoritesState();
        if (!this.featureChecker.isEnabled(FavoritesWishlistsEnabledFlag.INSTANCE) && this.favoritesListsEventsManager.getShouldShowFlashbar().get()) {
            this.favoritesListsEventsManager.getShouldShowFlashbar().set(false);
            ViewGroup rootView = ContextExtKt.getRootView(getContainer().i());
            if (rootView != null) {
                FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
                OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.favorites_list_renamed));
                int i11 = R$drawable.ic_check_green;
                FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, 3000L, null, null, getContainer().g(), 57306, null).show();
            }
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.configurators.FavoritesListsUpdateEventsConfigurator
    public void handleEvents(@NotNull List<? extends FavoritesListsEventsManager.FavoritesListsEvent> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.contains(FavoritesListsEventsManager.FavoritesListsEvent.Renamed.INSTANCE)) {
            handleResult();
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
