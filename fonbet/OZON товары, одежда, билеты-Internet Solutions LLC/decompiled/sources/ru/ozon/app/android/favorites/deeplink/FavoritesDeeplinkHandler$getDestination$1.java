package ru.ozon.app.android.favorites.deeplink;

import GZ.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.ui.deeplink.FavoritesDeeplinkHandlerDelegate;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "deeplink", "", "hasFavoritesTab", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoritesDeeplinkHandler$getDestination$1 extends AbstractC7737t implements Function2<String, Boolean, ComposerScreenConfig> {
    final /* synthetic */ j $route;
    final /* synthetic */ FavoritesDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoritesDeeplinkHandler$getDestination$1(FavoritesDeeplinkHandler favoritesDeeplinkHandler, j jVar) {
        super(2);
        this.this$0 = favoritesDeeplinkHandler;
        this.$route = jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ ComposerScreenConfig invoke(String str, Boolean bool) {
        return invoke(str, bool.booleanValue());
    }

    public final ComposerScreenConfig invoke(String deeplink, boolean z11) {
        ComposerScreenConfig buildComposerScreenConfig;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        buildComposerScreenConfig = this.this$0.buildComposerScreenConfig(deeplink, z11 && FavoritesDeeplinkHandlerDelegate.INSTANCE.needSwitchTab(this.$route.b()));
        return buildComposerScreenConfig;
    }
}
