package l6;

import T5.m;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import c6.n;

/* loaded from: classes.dex */
public class i extends AbstractC7878a<i> {
    private static i circleCropOptions;
    private static i skipMemoryCacheFalseOptions;
    private static i skipMemoryCacheTrueOptions;

    @NonNull
    public static i bitmapTransform(@NonNull m<Bitmap> mVar) {
        return new i().transform(mVar);
    }

    @NonNull
    public static i circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = new i().circleCrop().autoClone();
        }
        return circleCropOptions;
    }

    @NonNull
    public static i decodeTypeOf(@NonNull Class<?> cls) {
        return new i().decode(cls);
    }

    @NonNull
    public static i diskCacheStrategyOf(@NonNull V5.k kVar) {
        return new i().diskCacheStrategy(kVar);
    }

    @NonNull
    public static i downsampleOf(@NonNull n nVar) {
        return new i().downsample(nVar);
    }

    @NonNull
    public static i signatureOf(@NonNull T5.f fVar) {
        return new i().signature(fVar);
    }

    @NonNull
    public static i skipMemoryCacheOf(boolean z11) {
        if (z11) {
            if (skipMemoryCacheTrueOptions == null) {
                skipMemoryCacheTrueOptions = new i().skipMemoryCache(true).autoClone();
            }
            return skipMemoryCacheTrueOptions;
        }
        if (skipMemoryCacheFalseOptions == null) {
            skipMemoryCacheFalseOptions = new i().skipMemoryCache(false).autoClone();
        }
        return skipMemoryCacheFalseOptions;
    }

    @Override // l6.AbstractC7878a
    public boolean equals(Object obj) {
        return (obj instanceof i) && super.equals(obj);
    }

    @Override // l6.AbstractC7878a
    public int hashCode() {
        return super.hashCode();
    }
}
