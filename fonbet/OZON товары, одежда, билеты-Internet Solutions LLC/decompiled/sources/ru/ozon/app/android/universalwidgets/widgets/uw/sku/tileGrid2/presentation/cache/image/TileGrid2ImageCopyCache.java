package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import androidx.collection.C5155y;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCopyCache;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "", "size", "Landroid/content/Context;", "context", "<init>", "(ILandroid/content/Context;)V", "", "key", "Landroid/graphics/drawable/BitmapDrawable;", "getImage", "(Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;", "image", "", "saveImage", "(Ljava/lang/String;Landroid/graphics/drawable/BitmapDrawable;)V", "Landroid/content/Context;", "Landroidx/collection/y;", "cache", "Landroidx/collection/y;", "Lxe/M;", "coroutineScope", "Lxe/M;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2ImageCopyCache implements TileGrid2ImageCache {

    @NotNull
    private final C5155y<String, BitmapDrawable> cache;

    @NotNull
    private final Context context;

    @NotNull
    private final M coroutineScope;

    public TileGrid2ImageCopyCache(int i11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.cache = new C5155y<>(i11);
        CoroutineContext d11 = CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b());
        Intrinsics.checkNotNullExpressionValue("TileGrid2ImageCopyCache", "getSimpleName(...)");
        this.coroutineScope = N.a(d11.plus(new L("TileGrid2ImageCopyCache")).plus(new TileGrid2ImageCopyCache$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache
    public BitmapDrawable getImage(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.cache.get(key);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache
    public void saveImage(@NotNull String key, @NotNull BitmapDrawable image) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(image, "image");
        C10727i.c(this.coroutineScope, null, null, new TileGrid2ImageCopyCache$saveImage$1(image, this, key, null), 3);
    }
}
