package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image;

import android.graphics.drawable.BitmapDrawable;
import androidx.collection.C5155y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageBitmapCache;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "", "size", "<init>", "(I)V", "", "key", "Landroid/graphics/drawable/BitmapDrawable;", "getImage", "(Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;", "image", "", "saveImage", "(Ljava/lang/String;Landroid/graphics/drawable/BitmapDrawable;)V", "Landroidx/collection/y;", "cache", "Landroidx/collection/y;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2ImageBitmapCache implements TileGrid2ImageCache {

    @NotNull
    private final C5155y<String, BitmapDrawable> cache;

    public TileGrid2ImageBitmapCache(int i11) {
        this.cache = new C5155y<>(i11);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache
    public BitmapDrawable getImage(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        BitmapDrawable bitmapDrawable = this.cache.get(key);
        if (bitmapDrawable == null) {
            return null;
        }
        if (!bitmapDrawable.getBitmap().isRecycled()) {
            return bitmapDrawable;
        }
        this.cache.remove(key);
        return null;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache
    public void saveImage(@NotNull String key, @NotNull BitmapDrawable image) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(image, "image");
        this.cache.put(key, image);
    }
}
