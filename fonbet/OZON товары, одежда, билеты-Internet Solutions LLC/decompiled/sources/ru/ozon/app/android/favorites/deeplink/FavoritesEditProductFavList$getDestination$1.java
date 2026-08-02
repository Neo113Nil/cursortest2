package ru.ozon.app.android.favorites.deeplink;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FavoritesEditProductFavList$getDestination$1 extends C7735q implements Function1<String, ComposerScreenConfig> {
    FavoritesEditProductFavList$getDestination$1(Object obj) {
        super(1, obj, FavoritesEditProductFavList.class, "buildComposerScreenConfig", "buildComposerScreenConfig(Ljava/lang/String;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ComposerScreenConfig invoke(String p02) {
        ComposerScreenConfig buildComposerScreenConfig;
        Intrinsics.checkNotNullParameter(p02, "p0");
        buildComposerScreenConfig = ((FavoritesEditProductFavList) this.receiver).buildComposerScreenConfig(p02);
        return buildComposerScreenConfig;
    }
}
