package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.provider;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.universalwidgets.flags.TileGrid2ImageCacheSize;
import ru.ozon.app.android.universalwidgets.flags.TileGrid2ImageCacheStrategy;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageBitmapCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCopyCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageNoCache;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/provider/TileGrid2ImageCacheProvider;", "", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "appContext", "Landroid/content/Context;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Landroid/content/Context;)V", "cacheSize", "", "getCacheSize", "()I", "cacheStrategy", "", "getCacheStrategy", "()Ljava/lang/String;", "provide", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2ImageCacheProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context appContext;

    @NotNull
    private final FeatureService featureService;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/provider/TileGrid2ImageCacheProvider$Companion;", "", "<init>", "()V", "GLIDE_IMAGE_CACHE_STRATEGY", "", "COPY_IMAGE_CACHE_STRATEGY", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TileGrid2ImageCacheProvider(@NotNull FeatureService featureService, @NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.featureService = featureService;
        this.appContext = appContext;
    }

    private final int getCacheSize() {
        return this.featureService.getIntKey(TileGrid2ImageCacheSize.INSTANCE);
    }

    private final String getCacheStrategy() {
        return h.z0(this.featureService.getStringKey(TileGrid2ImageCacheStrategy.INSTANCE)).toString();
    }

    @NotNull
    public final TileGrid2ImageCache provide() {
        String cacheStrategy = getCacheStrategy();
        return Intrinsics.d(cacheStrategy, "glideImage") ? new TileGrid2ImageBitmapCache(getCacheSize()) : Intrinsics.d(cacheStrategy, "copyImage") ? new TileGrid2ImageCopyCache(getCacheSize(), this.appContext) : TileGrid2ImageNoCache.INSTANCE;
    }
}
