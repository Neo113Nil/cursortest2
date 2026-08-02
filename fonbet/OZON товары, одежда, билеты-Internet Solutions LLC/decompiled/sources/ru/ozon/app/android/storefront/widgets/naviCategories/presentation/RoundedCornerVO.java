package ru.ozon.app.android.storefront.widgets.naviCategories.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/RoundedCornerVO;", "", "roundedCornerX", "", "roundedCornerY", "<init>", "(Ljava/lang/String;III)V", "getRoundedCornerX", "()I", "getRoundedCornerY", "NONE", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_RIGHT", "BOTTOM_LEFT", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoundedCornerVO {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RoundedCornerVO[] $VALUES;
    private final int roundedCornerX;
    private final int roundedCornerY;
    public static final RoundedCornerVO NONE = new RoundedCornerVO("NONE", 0, -1, -1);
    public static final RoundedCornerVO TOP_LEFT = new RoundedCornerVO("TOP_LEFT", 1, 0, 1);
    public static final RoundedCornerVO TOP_RIGHT = new RoundedCornerVO("TOP_RIGHT", 2, 2, 3);
    public static final RoundedCornerVO BOTTOM_RIGHT = new RoundedCornerVO("BOTTOM_RIGHT", 3, 4, 5);
    public static final RoundedCornerVO BOTTOM_LEFT = new RoundedCornerVO("BOTTOM_LEFT", 4, 6, 7);

    private static final /* synthetic */ RoundedCornerVO[] $values() {
        return new RoundedCornerVO[]{NONE, TOP_LEFT, TOP_RIGHT, BOTTOM_RIGHT, BOTTOM_LEFT};
    }

    static {
        RoundedCornerVO[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private RoundedCornerVO(String str, int i11, int i12, int i13) {
        this.roundedCornerX = i12;
        this.roundedCornerY = i13;
    }

    public static RoundedCornerVO valueOf(String str) {
        return (RoundedCornerVO) Enum.valueOf(RoundedCornerVO.class, str);
    }

    public static RoundedCornerVO[] values() {
        return (RoundedCornerVO[]) $VALUES.clone();
    }

    public final int getRoundedCornerX() {
        return this.roundedCornerX;
    }

    public final int getRoundedCornerY() {
        return this.roundedCornerY;
    }
}
