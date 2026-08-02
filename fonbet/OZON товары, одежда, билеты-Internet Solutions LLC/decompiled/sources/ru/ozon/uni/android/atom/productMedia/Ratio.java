package ru.ozon.uni.android.atom.productMedia;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/atom/productMedia/Ratio;", "", "widthRatio", "", "heightRatio", "<init>", "(Ljava/lang/String;III)V", "getWidthRatio", "()I", "getHeightRatio", "RATIO_1_1", "RATIO_3_4", "RATIO_4_3", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Ratio {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Ratio[] $VALUES;
    public static final Ratio RATIO_1_1 = new Ratio("RATIO_1_1", 0, 1, 1);
    public static final Ratio RATIO_3_4 = new Ratio("RATIO_3_4", 1, 3, 4);
    public static final Ratio RATIO_4_3 = new Ratio("RATIO_4_3", 2, 4, 3);
    private final int heightRatio;
    private final int widthRatio;

    private static final /* synthetic */ Ratio[] $values() {
        return new Ratio[]{RATIO_1_1, RATIO_3_4, RATIO_4_3};
    }

    static {
        Ratio[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Ratio(String str, int i11, int i12, int i13) {
        this.widthRatio = i12;
        this.heightRatio = i13;
    }

    public static Ratio valueOf(String str) {
        return (Ratio) Enum.valueOf(Ratio.class, str);
    }

    public static Ratio[] values() {
        return (Ratio[]) $VALUES.clone();
    }

    public final int getHeightRatio() {
        return this.heightRatio;
    }

    public final int getWidthRatio() {
        return this.widthRatio;
    }
}
