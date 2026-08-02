package ru.ozon.app.android.pikazon.image;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pikazon/image/ImageSizeDownsampleStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "AT_MOST", "AT_LEAST", "FIT_CENTER", "CENTER_INSIDE", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImageSizeDownsampleStrategy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ImageSizeDownsampleStrategy[] $VALUES;
    public static final ImageSizeDownsampleStrategy AT_MOST = new ImageSizeDownsampleStrategy("AT_MOST", 0);
    public static final ImageSizeDownsampleStrategy AT_LEAST = new ImageSizeDownsampleStrategy("AT_LEAST", 1);
    public static final ImageSizeDownsampleStrategy FIT_CENTER = new ImageSizeDownsampleStrategy("FIT_CENTER", 2);
    public static final ImageSizeDownsampleStrategy CENTER_INSIDE = new ImageSizeDownsampleStrategy("CENTER_INSIDE", 3);

    private static final /* synthetic */ ImageSizeDownsampleStrategy[] $values() {
        return new ImageSizeDownsampleStrategy[]{AT_MOST, AT_LEAST, FIT_CENTER, CENTER_INSIDE};
    }

    static {
        ImageSizeDownsampleStrategy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ImageSizeDownsampleStrategy(String str, int i11) {
    }

    public static ImageSizeDownsampleStrategy valueOf(String str) {
        return (ImageSizeDownsampleStrategy) Enum.valueOf(ImageSizeDownsampleStrategy.class, str);
    }

    public static ImageSizeDownsampleStrategy[] values() {
        return (ImageSizeDownsampleStrategy[]) $VALUES.clone();
    }
}
