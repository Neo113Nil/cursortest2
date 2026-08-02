package ru.ozon.app.android.storefront.stories.story.cache;

import Lm0.a;
import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u000f\u001a\u00020\nJ\u0018\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/cache/StoryImageMemoryCache;", "", "<init>", "()V", "memoryCache", "Lru/ozon/app/android/storefront/stories/story/cache/StoryMemoryLruCache;", "", "imageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "putOverrideParams", "", "width", "", "height", "getOverrideParams", "clearCache", "putMemCache", "key", "bitmap", "Landroid/graphics/Bitmap;", "getBitmapFromCache", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryImageMemoryCache {
    private ImageSize imageSize;
    private StoryMemoryLruCache<String> memoryCache = new StoryMemoryLruCache<>(((int) (Runtime.getRuntime().maxMemory() / UserVerificationMethods.USER_VERIFY_ALL)) / 4);

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/cache/StoryImageMemoryCache$Companion;", "", "<init>", "()V", "LRU_CACHE_TAG", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void clearCache() {
        try {
            StoryMemoryLruCache<String> storyMemoryLruCache = this.memoryCache;
            if (storyMemoryLruCache != null) {
                storyMemoryLruCache.size();
            }
            StoryMemoryLruCache<String> storyMemoryLruCache2 = this.memoryCache;
            if (storyMemoryLruCache2 != null) {
                storyMemoryLruCache2.evictAll();
            }
        } catch (IllegalStateException e11) {
            a.f17149a.e(e11);
        }
    }

    public final Bitmap getBitmapFromCache(String key) {
        StoryMemoryLruCache<String> storyMemoryLruCache;
        Bitmap bitmap;
        if (key == null || (storyMemoryLruCache = this.memoryCache) == null || (bitmap = storyMemoryLruCache.get(key)) == null) {
            return null;
        }
        if (!bitmap.isRecycled()) {
            return bitmap;
        }
        StoryMemoryLruCache<String> storyMemoryLruCache2 = this.memoryCache;
        if (storyMemoryLruCache2 != null) {
            storyMemoryLruCache2.remove(key);
        }
        return null;
    }

    /* renamed from: getOverrideParams, reason: from getter */
    public final ImageSize getImageSize() {
        return this.imageSize;
    }

    public final void putMemCache(String key, @NotNull Bitmap bitmap) {
        StoryMemoryLruCache<String> storyMemoryLruCache;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (key == null) {
            return;
        }
        if (Runtime.getRuntime().freeMemory() + (Runtime.getRuntime().maxMemory() - Runtime.getRuntime().totalMemory()) <= bitmap.getByteCount() * 3 || (storyMemoryLruCache = this.memoryCache) == null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        storyMemoryLruCache.putIfAbsent(key, createBitmap);
    }

    public final void putOverrideParams(int width, int height) {
        this.imageSize = new ImageSize(width, height);
    }
}
