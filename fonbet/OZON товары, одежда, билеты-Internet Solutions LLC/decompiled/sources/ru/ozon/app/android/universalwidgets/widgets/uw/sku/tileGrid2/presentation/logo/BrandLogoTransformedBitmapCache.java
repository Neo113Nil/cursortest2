package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.BitmapUtilsKt;

@Metadata(d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004*\u0001\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformedBitmapCache;", "", "<init>", "()V", "", "key", "Lkotlin/Function0;", "Landroid/graphics/Bitmap;", "putValue", "getOrPut", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroid/graphics/Bitmap;", "get", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "put", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;", "ru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformedBitmapCache$memoryCache$1", "memoryCache", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformedBitmapCache$memoryCache$1;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BrandLogoTransformedBitmapCache {

    @NotNull
    private final BrandLogoTransformedBitmapCache$memoryCache$1 memoryCache;

    /* JADX WARN: Type inference failed for: r1v0, types: [ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo.BrandLogoTransformedBitmapCache$memoryCache$1] */
    public BrandLogoTransformedBitmapCache() {
        final int maxMemory = (int) ((Runtime.getRuntime().maxMemory() / UserVerificationMethods.USER_VERIFY_ALL) / 8);
        this.memoryCache = new LruCache<String, Bitmap>(maxMemory) { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo.BrandLogoTransformedBitmapCache$memoryCache$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            public int sizeOf(String key, Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                return bitmap.getByteCount() / UserVerificationMethods.USER_VERIFY_ALL;
            }
        };
    }

    public final Bitmap get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return get(key);
    }

    @NotNull
    public final Bitmap getOrPut(@NotNull String key, @NotNull Function0<Bitmap> putValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(putValue, "putValue");
        Bitmap bitmap = get(key);
        return bitmap == null ? put(putValue.invoke(), key) : bitmap;
    }

    @NotNull
    public final Bitmap put(@NotNull Bitmap bitmap, @NotNull String key) {
        Bitmap put;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Runtime.getRuntime().freeMemory() + (Runtime.getRuntime().maxMemory() - Runtime.getRuntime().totalMemory()) <= BitmapUtilsKt.getMemorySize(bitmap) || (put = put(key, bitmap)) == null) ? bitmap : put;
    }
}
