package ru.ozon.app.android.pdfviewer.data.cache;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0014J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdfviewer/data/cache/MemoryLruCache;", "Landroid/util/LruCache;", "", "Landroid/graphics/Bitmap;", "maxSize", "<init>", "(I)V", "sizeOf", "key", "bitmap", "putIfAbsent", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MemoryLruCache extends LruCache<Integer, Bitmap> {
    public MemoryLruCache(int i11) {
        super(i11);
    }

    public final void putIfAbsent(int key, @NotNull Bitmap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this) {
            try {
                if (get(Integer.valueOf(key)) == null) {
                    put(Integer.valueOf(key), value);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.util.LruCache
    public /* bridge */ /* synthetic */ int sizeOf(Integer num, Bitmap bitmap) {
        return sizeOf(num.intValue(), bitmap);
    }

    protected int sizeOf(int key, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return bitmap.getByteCount() / UserVerificationMethods.USER_VERIFY_ALL;
    }
}
