package ru.ozon.uni.components.indicator;

import K1.T;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.uni.core.repository.UniTheme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/components/indicator/UniIndicatorSize;", "", "LZ1/h;", "size", "horizontalPadding", "LK1/T;", "textStyle", "", "canHaveIcon", "<init>", "(Ljava/lang/String;IFFLK1/T;Z)V", "F", "getSize-D9Ej5fM$uni_release", "()F", "getHorizontalPadding-D9Ej5fM$uni_release", "LK1/T;", "getTextStyle$uni_release", "()LK1/T;", "Z", "getCanHaveIcon$uni_release", "()Z", "Size300", "Size400", "Size450", "Size500", "Size600", "Size700", "Size800", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniIndicatorSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniIndicatorSize[] $VALUES;
    public static final UniIndicatorSize Size300;
    public static final UniIndicatorSize Size400;
    public static final UniIndicatorSize Size450;
    public static final UniIndicatorSize Size500;
    public static final UniIndicatorSize Size600;
    public static final UniIndicatorSize Size700;
    public static final UniIndicatorSize Size800;
    private final boolean canHaveIcon;
    private final float horizontalPadding;
    private final float size;
    private final T textStyle;

    private static final /* synthetic */ UniIndicatorSize[] $values() {
        return new UniIndicatorSize[]{Size300, Size400, Size450, Size500, Size600, Size700, Size800};
    }

    static {
        T centered;
        T centered2;
        T centered3;
        T centered4;
        T centered5;
        float f7 = 4;
        Size300 = new UniIndicatorSize("Size300", 0, f7, f7, null, false);
        float f11 = 8;
        Size400 = new UniIndicatorSize("Size400", 1, f11, f7, null, false);
        UniTheme uniTheme = UniTheme.INSTANCE;
        centered = UniIndicatorSizeKt.getCentered(uniTheme.getTypography().getBodyNumeric200XSmall());
        Size450 = new UniIndicatorSize("Size450", 2, 12, f7, centered, false);
        centered2 = UniIndicatorSizeKt.getCentered(uniTheme.getTypography().getBodyNumeric300XSmall());
        Size500 = new UniIndicatorSize("Size500", 3, 16, f7, centered2, true);
        centered3 = UniIndicatorSizeKt.getCentered(uniTheme.getTypography().getBodyNumeric300XSmall());
        Size600 = new UniIndicatorSize("Size600", 4, 20, f7, centered3, true);
        centered4 = UniIndicatorSizeKt.getCentered(uniTheme.getTypography().getBodyNumeric400Small());
        Size700 = new UniIndicatorSize("Size700", 5, 24, 6, centered4, true);
        centered5 = UniIndicatorSizeKt.getCentered(uniTheme.getTypography().getBodyNumeric400Small());
        Size800 = new UniIndicatorSize("Size800", 6, 28, f11, centered5, true);
        UniIndicatorSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniIndicatorSize(String str, int i11, float f7, float f11, T t2, boolean z11) {
        this.size = f7;
        this.horizontalPadding = f11;
        this.textStyle = t2;
        this.canHaveIcon = z11;
    }

    public static UniIndicatorSize valueOf(String str) {
        return (UniIndicatorSize) Enum.valueOf(UniIndicatorSize.class, str);
    }

    public static UniIndicatorSize[] values() {
        return (UniIndicatorSize[]) $VALUES.clone();
    }

    /* renamed from: getCanHaveIcon$uni_release, reason: from getter */
    public final boolean getCanHaveIcon() {
        return this.canHaveIcon;
    }

    /* renamed from: getHorizontalPadding-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: getSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }

    /* renamed from: getTextStyle$uni_release, reason: from getter */
    public final T getTextStyle() {
        return this.textStyle;
    }
}
