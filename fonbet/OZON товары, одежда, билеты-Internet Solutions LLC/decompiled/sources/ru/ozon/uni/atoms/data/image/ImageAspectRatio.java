package ru.ozon.uni.atoms.data.image;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "", "widthRatio", "", "heightRatio", "<init>", "(Ljava/lang/String;III)V", "getWidthRatio", "()I", "getHeightRatio", "RATIO_1_1", "RATIO_2_1", "RATIO_2_3", "RATIO_3_1", "RATIO_3_2", "RATIO_3_4", "RATIO_4_3", "RATIO_5_2", "RATIO_16_9", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "getValue", "()F", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageAspectRatio {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ImageAspectRatio[] $VALUES;
    private final int heightRatio;
    private final float value;
    private final int widthRatio;
    public static final ImageAspectRatio RATIO_1_1 = new ImageAspectRatio("RATIO_1_1", 0, 1, 1);
    public static final ImageAspectRatio RATIO_2_1 = new ImageAspectRatio("RATIO_2_1", 1, 2, 1);
    public static final ImageAspectRatio RATIO_2_3 = new ImageAspectRatio("RATIO_2_3", 2, 2, 3);
    public static final ImageAspectRatio RATIO_3_1 = new ImageAspectRatio("RATIO_3_1", 3, 3, 1);
    public static final ImageAspectRatio RATIO_3_2 = new ImageAspectRatio("RATIO_3_2", 4, 3, 2);
    public static final ImageAspectRatio RATIO_3_4 = new ImageAspectRatio("RATIO_3_4", 5, 3, 4);
    public static final ImageAspectRatio RATIO_4_3 = new ImageAspectRatio("RATIO_4_3", 6, 4, 3);
    public static final ImageAspectRatio RATIO_5_2 = new ImageAspectRatio("RATIO_5_2", 7, 5, 2);
    public static final ImageAspectRatio RATIO_16_9 = new ImageAspectRatio("RATIO_16_9", 8, 16, 9);

    private static final /* synthetic */ ImageAspectRatio[] $values() {
        return new ImageAspectRatio[]{RATIO_1_1, RATIO_2_1, RATIO_2_3, RATIO_3_1, RATIO_3_2, RATIO_3_4, RATIO_4_3, RATIO_5_2, RATIO_16_9};
    }

    static {
        ImageAspectRatio[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ImageAspectRatio(String str, int i11, int i12, int i13) {
        this.widthRatio = i12;
        this.heightRatio = i13;
        this.value = i12 / i13;
    }

    @NotNull
    public static a<ImageAspectRatio> getEntries() {
        return $ENTRIES;
    }

    public static ImageAspectRatio valueOf(String str) {
        return (ImageAspectRatio) Enum.valueOf(ImageAspectRatio.class, str);
    }

    public static ImageAspectRatio[] values() {
        return (ImageAspectRatio[]) $VALUES.clone();
    }

    public final int getHeightRatio() {
        return this.heightRatio;
    }

    public final float getValue() {
        return this.value;
    }

    public final int getWidthRatio() {
        return this.widthRatio;
    }
}
