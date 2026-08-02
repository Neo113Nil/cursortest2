package ru.ozon.app.android.pikazon.glide.thumbnail;

import Sc.InterfaceC4008j;
import Sc.k;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCacheDecorator;", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;", "<init>", "()V", "Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "put", "(Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;)V", "", ImagesContract.URL, "", "get", "(Ljava/lang/String;)Ljava/util/Set;", "thumb", ProductAction.ACTION_REMOVE, "(Ljava/lang/String;Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;)V", "uuid", "getPendingOrNull", "(Ljava/lang/String;)Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;", "", "isEnabled", "Z", "()Z", "setEnabled", "(Z)V", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCacheStub;", "stub$delegate", "LSc/j;", "getStub", "()Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCacheStub;", "stub", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCacheImpl;", "origin$delegate", "getOrigin", "()Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCacheImpl;", "origin", "getCache", "()Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;", "cache", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThumbCacheDecorator implements ThumbCache {
    private volatile boolean isEnabled = true;

    /* renamed from: stub$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j stub = k.b(ThumbCacheDecorator$stub$2.INSTANCE);

    /* renamed from: origin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j origin = k.b(ThumbCacheDecorator$origin$2.INSTANCE);

    private final ThumbCache getCache() {
        return this.isEnabled ? getOrigin() : getStub();
    }

    private final ThumbCacheImpl getOrigin() {
        return (ThumbCacheImpl) this.origin.getValue();
    }

    private final ThumbCacheStub getStub() {
        return (ThumbCacheStub) this.stub.getValue();
    }

    @Override // ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCache
    @NotNull
    public Set<Thumb> get(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return getCache().get(url);
    }

    @Override // ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCache
    public Thumb getPendingOrNull(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return getCache().getPendingOrNull(uuid);
    }

    @Override // ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCache
    public void put(@NotNull Thumb value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getCache().put(value);
    }

    @Override // ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCache
    public void remove(@NotNull String url, @NotNull Thumb thumb) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        getCache().remove(url, thumb);
    }

    public final void setEnabled(boolean z11) {
        this.isEnabled = z11;
    }
}
