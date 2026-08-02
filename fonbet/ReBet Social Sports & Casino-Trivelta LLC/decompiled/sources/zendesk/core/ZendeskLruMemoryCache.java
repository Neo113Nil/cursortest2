package zendesk.core;

import android.util.LruCache;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
class ZendeskLruMemoryCache implements MemoryCache {
    public final LruCache<String, Object> cache;

    public ZendeskLruMemoryCache() {
        this(new LruCache(50));
    }

    @Override // zendesk.core.MemoryCache
    public void clear() {
        this.cache.evictAll();
    }

    @Override // zendesk.core.MemoryCache
    public boolean contains(@NonNull String str) {
        boolean z10;
        synchronized (this) {
            z10 = this.cache.get(str) != null;
        }
        return z10;
    }

    @Override // zendesk.core.MemoryCache
    public <T> T get(@NonNull String str) {
        T t10;
        synchronized (this) {
            t10 = (T) this.cache.get(str);
        }
        return t10;
    }

    @Override // zendesk.core.MemoryCache
    @NonNull
    public <T> T getOrDefault(@NonNull String str, @NonNull T t10) {
        T t11 = (T) get(str);
        return t11 != null ? t11 : t10;
    }

    @Override // zendesk.core.MemoryCache
    public void put(@NonNull String str, @NonNull Object obj) {
        synchronized (this) {
            this.cache.put(str, obj);
        }
    }

    @Override // zendesk.core.MemoryCache
    public void remove(@NonNull String str) {
        synchronized (this) {
            this.cache.remove(str);
        }
    }

    public ZendeskLruMemoryCache(LruCache<String, Object> lruCache) {
        this.cache = lruCache;
    }
}
