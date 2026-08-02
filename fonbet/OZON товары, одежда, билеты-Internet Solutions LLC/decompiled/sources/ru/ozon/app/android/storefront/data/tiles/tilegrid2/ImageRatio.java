package ru.ozon.app.android.storefront.data.tiles.tilegrid2;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/ImageRatio;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE_RATIO_1_1", "IMAGE_RATIO_3_4", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageRatio {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ImageRatio[] $VALUES;

    @i(name = "IMAGE_RATIO_1_1")
    public static final ImageRatio IMAGE_RATIO_1_1 = new ImageRatio("IMAGE_RATIO_1_1", 0);

    @i(name = "IMAGE_RATIO_3_4")
    public static final ImageRatio IMAGE_RATIO_3_4 = new ImageRatio("IMAGE_RATIO_3_4", 1);

    private static final /* synthetic */ ImageRatio[] $values() {
        return new ImageRatio[]{IMAGE_RATIO_1_1, IMAGE_RATIO_3_4};
    }

    static {
        ImageRatio[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ImageRatio(String str, int i11) {
    }

    public static ImageRatio valueOf(String str) {
        return (ImageRatio) Enum.valueOf(ImageRatio.class, str);
    }

    public static ImageRatio[] values() {
        return (ImageRatio[]) $VALUES.clone();
    }
}
