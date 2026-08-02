package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class LruCache implements Cache {
    final android.util.LruCache<String, BitmapAndSize> cache;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class BitmapAndSize {
        final Bitmap bitmap;
        final int byteCount;

        public BitmapAndSize(Bitmap bitmap, int i) {
            this.bitmap = bitmap;
            this.byteCount = i;
        }
    }

    public LruCache(int i) {
        this.cache = new android.util.LruCache<String, BitmapAndSize>(i) { // from class: com.squareup.picasso.LruCache.1
            @Override // android.util.LruCache
            public int sizeOf(String str, BitmapAndSize bitmapAndSize) {
                return bitmapAndSize.byteCount;
            }
        };
    }

    @Override // com.squareup.picasso.Cache
    public void clear() {
        this.cache.evictAll();
    }

    @Override // com.squareup.picasso.Cache
    public void clearKeyUri(String str) {
        for (String str2 : this.cache.snapshot().keySet()) {
            if (str2.startsWith(str) && str2.length() > str.length() && str2.charAt(str.length()) == '\n') {
                this.cache.remove(str2);
            }
        }
    }

    public int evictionCount() {
        return this.cache.evictionCount();
    }

    @Override // com.squareup.picasso.Cache
    @Nullable
    public Bitmap get(@NonNull String str) {
        BitmapAndSize bitmapAndSize = this.cache.get(str);
        if (bitmapAndSize != null) {
            return bitmapAndSize.bitmap;
        }
        return null;
    }

    public int hitCount() {
        return this.cache.hitCount();
    }

    @Override // com.squareup.picasso.Cache
    public int maxSize() {
        return this.cache.maxSize();
    }

    public int missCount() {
        return this.cache.missCount();
    }

    public int putCount() {
        return this.cache.putCount();
    }

    @Override // com.squareup.picasso.Cache
    public void set(@NonNull String str, @NonNull Bitmap bitmap) {
        if (str == null || bitmap == null) {
            yhk.s("key == null || bitmap == null");
            return;
        }
        int bitmapBytes = Utils.getBitmapBytes(bitmap);
        int maxSize = maxSize();
        android.util.LruCache<String, BitmapAndSize> lruCache = this.cache;
        if (bitmapBytes > maxSize) {
            lruCache.remove(str);
        } else {
            lruCache.put(str, new BitmapAndSize(bitmap, bitmapBytes));
        }
    }

    @Override // com.squareup.picasso.Cache
    public int size() {
        return this.cache.size();
    }

    public LruCache(@NonNull Context context) {
        this(Utils.calculateMemoryCacheSize(context));
    }
}
