package com.yandex.mapkit.map.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.ZoomRange;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.layers.TileFormat;
import com.yandex.mapkit.map.BaseTileDataSourceBuilder;
import com.yandex.mapkit.tiles.TileProvider;
import com.yandex.mapkit.tiles.UrlProvider;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes9.dex */
public class BaseTileDataSourceBuilderBinding extends BaseDataSourceBuilderBinding implements BaseTileDataSourceBuilder {
    protected Subscription<TileProvider> tileProviderSubscription;
    protected Subscription<UrlProvider> urlProviderSubscription;

    protected BaseTileDataSourceBuilderBinding(NativeObject nativeObject) {
        super(nativeObject);
        this.tileProviderSubscription = new Subscription<TileProvider>() { // from class: com.yandex.mapkit.map.internal.BaseTileDataSourceBuilderBinding.1
            @Override // com.yandex.runtime.subscription.Subscription
            public NativeObject createNativeListener(TileProvider tileProvider) {
                return BaseTileDataSourceBuilderBinding.createTileProvider(tileProvider);
            }
        };
        this.urlProviderSubscription = new Subscription<UrlProvider>() { // from class: com.yandex.mapkit.map.internal.BaseTileDataSourceBuilderBinding.2
            @Override // com.yandex.runtime.subscription.Subscription
            public NativeObject createNativeListener(UrlProvider urlProvider) {
                return BaseTileDataSourceBuilderBinding.createUrlProvider(urlProvider);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createTileProvider(TileProvider tileProvider);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createUrlProvider(UrlProvider urlProvider);

    @Override // com.yandex.mapkit.map.BaseTileDataSourceBuilder
    public native void setProjection(@NonNull Projection projection);

    @Override // com.yandex.mapkit.map.BaseTileDataSourceBuilder
    public native void setTileFormat(@NonNull TileFormat tileFormat);

    @Override // com.yandex.mapkit.map.BaseTileDataSourceBuilder
    public native void setTileProvider(@NonNull TileProvider tileProvider);

    @Override // com.yandex.mapkit.map.BaseTileDataSourceBuilder
    public native void setTileUrlProvider(@NonNull UrlProvider urlProvider);

    @Override // com.yandex.mapkit.map.BaseTileDataSourceBuilder
    public native void setZoomRanges(@NonNull List<ZoomRange> list);
}
