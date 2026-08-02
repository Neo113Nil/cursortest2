package ru.ozon.app.android.pikazon.glide.thumbnail;

import android.net.Uri;
import android.util.LruCache;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\f\u0010\u0017\u001a\u00020\u0006*\u00020\u0006H\u0002R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCacheImpl;", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;", "<init>", "()V", "cache", "Landroid/util/LruCache;", "", "Ljava/util/HashSet;", "Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;", "Lkotlin/collections/HashSet;", "pending", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "put", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "get", "", ImagesContract.URL, ProductAction.ACTION_REMOVE, "thumb", "getPendingOrNull", "uuid", "withoutQuery", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThumbCacheImpl implements ThumbCache {

    @NotNull
    private final LruCache<String, HashSet<Thumb>> cache = new LruCache<>(100);

    @NotNull
    private final HashMap<String, Thumb> pending = new HashMap<>();

    private final String withoutQuery(String str) {
        String builder = Uri.parse(str).buildUpon().clearQuery().toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        return builder;
    }

    @Override // ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCache
    @NotNull
    public Set<Thumb> get(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HashSet<Thumb> hashSet = this.cache.get(withoutQuery(url));
        return hashSet == null ? M.f71699a : hashSet;
    }

    @Override // ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCache
    public Thumb getPendingOrNull(@NotNull String uuid) {
        Thumb remove;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        synchronized (this.cache) {
            remove = this.pending.remove(uuid);
        }
        return remove;
    }

    @Override // ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCache
    public void put(@NotNull Thumb value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.cache) {
            if (value.getIsPending()) {
                this.pending.put(value.getUuid(), value);
                return;
            }
            String withoutQuery = withoutQuery(value.getCacheKey());
            HashSet<Thumb> hashSet = this.cache.get(withoutQuery);
            if (hashSet == null) {
                this.cache.put(withoutQuery, e0.a(value));
            } else {
                HashSet<Thumb> S02 = C7714v.S0(hashSet);
                S02.add(value);
                this.cache.put(withoutQuery, S02);
            }
        }
    }

    @Override // ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCache
    public void remove(@NotNull String url, @NotNull Thumb thumb) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        synchronized (this.cache) {
            try {
                if (thumb.getIsPending()) {
                    this.pending.remove(thumb.getUuid());
                } else {
                    HashSet<Thumb> hashSet = this.cache.get(withoutQuery(url));
                    if (hashSet != null) {
                        hashSet.remove(thumb);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
