package ru.ozon.app.android.favorites.deeplink;

import i10.h;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.ui.configurators.CreateFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.CreateShoppingListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.DeleteFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.FavoritesSellersScrollToUpConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.PinStatusFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.RemoveFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.RenameFavoritesListConfigurator;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "deeplink", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoritesSellersDeeplinkHandler$getDestination$1 extends AbstractC7737t implements Function2<String, Boolean, ComposerScreenConfig> {
    final /* synthetic */ FavoritesSellersDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoritesSellersDeeplinkHandler$getDestination$1(FavoritesSellersDeeplinkHandler favoritesSellersDeeplinkHandler) {
        super(2);
        this.this$0 = favoritesSellersDeeplinkHandler;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ ComposerScreenConfig invoke(String str, Boolean bool) {
        return invoke(str, bool.booleanValue());
    }

    public final ComposerScreenConfig invoke(String deeplink, boolean z11) {
        AppType appType;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Integer valueOf = Integer.valueOf(R$color.bg_dark_key);
        appType = this.this$0.appType;
        ComposerScreenConfig.ToolbarConfig toolbarConfig = new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, appType == AppType.SELECT ? valueOf : null, null, 47, null), 0, 2, null);
        h.c.a aVar = new h.c.a(deeplink, (String) null, (String) null, 14);
        Class[] elements = {PinStatusFavoritesListConfigurator.class, DeleteFavoritesListConfigurator.class, CreateFavoritesListConfigurator.class, RenameFavoritesListConfigurator.class, CreateShoppingListConfigurator.class, RemoveFavoritesListConfigurator.class, FavoritesSellersScrollToUpConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerScreenConfig(aVar, toolbarConfig, false, null, false, false, false, false, null, false, false, false, C7705l.j0(elements), null, null, null, false, null, null, null, false, false, null, null, 16773084, null);
    }
}
