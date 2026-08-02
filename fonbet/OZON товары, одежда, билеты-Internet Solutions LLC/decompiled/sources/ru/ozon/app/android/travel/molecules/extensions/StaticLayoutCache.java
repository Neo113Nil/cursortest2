package ru.ozon.app.android.travel.molecules.extensions;

import android.text.StaticLayout;
import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/molecules/extensions/StaticLayoutCache;", "", "<init>", "()V", "", "key", "Landroid/text/StaticLayout;", "staticLayout", "", "set", "(Ljava/lang/String;Landroid/text/StaticLayout;)V", "get", "(Ljava/lang/String;)Landroid/text/StaticLayout;", "Landroid/util/LruCache;", "cache", "Landroid/util/LruCache;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StaticLayoutCache {

    @NotNull
    public static final StaticLayoutCache INSTANCE = new StaticLayoutCache();

    @NotNull
    private static final LruCache<String, StaticLayout> cache;

    static {
        final int i11 = 10;
        cache = new LruCache<String, StaticLayout>(i11) { // from class: ru.ozon.app.android.travel.molecules.extensions.StaticLayoutCache$special$$inlined$lruCache$default$1
            @Override // android.util.LruCache
            protected StaticLayout create(@NotNull String key) {
                return null;
            }

            @Override // android.util.LruCache
            protected void entryRemoved(boolean evicted, @NotNull String key, @NotNull StaticLayout oldValue, StaticLayout newValue) {
            }

            @Override // android.util.LruCache
            protected int sizeOf(@NotNull String key, @NotNull StaticLayout value) {
                return 1;
            }
        };
    }

    private StaticLayoutCache() {
    }

    public final StaticLayout get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return cache.get(key);
    }

    public final void set(@NotNull String key, @NotNull StaticLayout staticLayout) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(staticLayout, "staticLayout");
        cache.put(key, staticLayout);
    }
}
