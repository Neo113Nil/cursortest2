package ru.ozon.app.android.storefront.widgets.videoTile.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.videoTile.core.VideoTileConfig;
import ru.ozon.app.android.storefront.widgets.videoTile.core.VideoTileViewMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/videoTile/di/VideoTileWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "videoTileConfig", "Lru/ozon/app/android/storefront/widgets/videoTile/core/VideoTileConfig;", "videoTileViewMapper", "Lru/ozon/app/android/storefront/widgets/videoTile/core/VideoTileViewMapper;", "provideWidget$storefront_prodGoogleAllVendorsRelease", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoTileWidgetModule {
    @NotNull
    public final Widget2 provideWidget$storefront_prodGoogleAllVendorsRelease(@NotNull VideoTileConfig videoTileConfig, @NotNull VideoTileViewMapper videoTileViewMapper) {
        Intrinsics.checkNotNullParameter(videoTileConfig, "videoTileConfig");
        Intrinsics.checkNotNullParameter(videoTileViewMapper, "videoTileViewMapper");
        return new Widget2("cms", "videoTile", videoTileConfig, new ViewMapper2[]{videoTileViewMapper});
    }
}
