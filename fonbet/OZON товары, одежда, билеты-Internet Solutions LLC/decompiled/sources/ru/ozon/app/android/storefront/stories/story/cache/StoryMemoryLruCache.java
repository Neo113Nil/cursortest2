package ru.ozon.app.android.storefront.stories.story.cache;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0014¢\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/cache/StoryMemoryLruCache;", "T", "Landroid/util/LruCache;", "Landroid/graphics/Bitmap;", "maxSize", "", "<init>", "(I)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "sizeOf", "key", "bitmap", "(Ljava/lang/Object;Landroid/graphics/Bitmap;)I", "putIfAbsent", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/lang/Object;Landroid/graphics/Bitmap;)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryMemoryLruCache<T> extends LruCache<T, Bitmap> {

    @NotNull
    private final ReentrantLock lock;

    public StoryMemoryLruCache(int i11) {
        super(i11);
        this.lock = new ReentrantLock();
    }

    public final void putIfAbsent(T key, @NotNull Bitmap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (get(key) == null) {
                put(key, value);
            }
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.LruCache
    public /* bridge */ /* synthetic */ int sizeOf(Object obj, Bitmap bitmap) {
        return sizeOf2((StoryMemoryLruCache<T>) obj, bitmap);
    }

    /* renamed from: sizeOf, reason: avoid collision after fix types in other method */
    protected int sizeOf2(T key, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return bitmap.getByteCount() / UserVerificationMethods.USER_VERIFY_ALL;
    }
}
