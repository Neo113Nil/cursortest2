package ru.ozon.uni.components.productMedia;

import K1.T;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B;\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000ej\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lru/ozon/uni/components/productMedia/UniProductMediaSize;", "", "LZ1/h;", "size", "LK1/T;", "labelTextStyle", "smallLabelTextStyle", "graphicSize", "smallGraphicSize", "textPadding", "<init>", "(Ljava/lang/String;IFLK1/T;LK1/T;FFF)V", "F", "getSize-D9Ej5fM$uni_release", "()F", "LK1/T;", "getLabelTextStyle$uni_release", "()LK1/T;", "getSmallLabelTextStyle$uni_release", "getGraphicSize-D9Ej5fM$uni_release", "getSmallGraphicSize-D9Ej5fM$uni_release", "getTextPadding-D9Ej5fM$uni_release", "Size300", "Size400", "Size500", "Size600", "Size700", "Size800", "Size900", "Size1000", "Size1100", "Size1200", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniProductMediaSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniProductMediaSize[] $VALUES;
    public static final UniProductMediaSize Size1000;
    public static final UniProductMediaSize Size1100;
    public static final UniProductMediaSize Size1200;
    public static final UniProductMediaSize Size300;
    public static final UniProductMediaSize Size400;
    public static final UniProductMediaSize Size500;
    public static final UniProductMediaSize Size600;
    public static final UniProductMediaSize Size700;
    public static final UniProductMediaSize Size800;
    public static final UniProductMediaSize Size900;
    private final float graphicSize;

    @NotNull
    private final T labelTextStyle;
    private final float size;
    private final float smallGraphicSize;
    private final T smallLabelTextStyle;
    private final float textPadding;

    private static final /* synthetic */ UniProductMediaSize[] $values() {
        return new UniProductMediaSize[]{Size300, Size400, Size500, Size600, Size700, Size800, Size900, Size1000, Size1100, Size1200};
    }

    static {
        T centered;
        T centered2;
        T centered3;
        T centered4;
        T centered5;
        T centered6;
        T centered7;
        T centered8;
        T centered9;
        T centered10;
        T centered11;
        T centered12;
        T centered13;
        T centered14;
        float f7 = 24;
        UniTheme uniTheme = UniTheme.INSTANCE;
        centered = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getBodyControl300XSmall());
        float f11 = 16;
        float f12 = 12;
        Size300 = new UniProductMediaSize("Size300", 0, f7, centered, null, f11, f12, 2);
        float f13 = 32;
        centered2 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getBodyControl400Small());
        Size400 = new UniProductMediaSize("Size400", 1, f13, centered2, null, 20, f12, 4);
        centered3 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getBodyControl500Medium());
        Size500 = new UniProductMediaSize("Size500", 2, 44, centered3, null, f7, f11, 6);
        centered4 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getHeadline400Small());
        Size600 = new UniProductMediaSize("Size600", 3, 56, centered4, null, f13, f11, 8);
        centered5 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getHeadline500Medium());
        Size700 = new UniProductMediaSize("Size700", 4, 72, centered5, null, 40, f11, 10);
        centered6 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getHeadline700XLarge());
        Size800 = new UniProductMediaSize("Size800", 5, 88, centered6, null, 48, f7, f12);
        centered7 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getHeadline800XxLarge());
        centered8 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getCompactControl300XSmall());
        float f14 = 64;
        Size900 = new UniProductMediaSize("Size900", 6, 112, centered7, centered8, f14, f7, f11);
        centered9 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getHeadline800XxLarge());
        centered10 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getCompactControl300XSmall());
        Size1000 = new UniProductMediaSize("Size1000", 7, 132, centered9, centered10, f14, f7, f11);
        centered11 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getHeadline800XxLarge());
        centered12 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getCompactControl500Medium());
        Size1100 = new UniProductMediaSize("Size1100", 8, 156, centered11, centered12, f14, f13, f11);
        centered13 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getHeadline800XxLarge());
        centered14 = UniProductMediaSizeKt.getCentered(uniTheme.getTypography().getCompactControl500Medium());
        Size1200 = new UniProductMediaSize("Size1200", 9, 206, centered13, centered14, f14, f13, f11);
        UniProductMediaSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniProductMediaSize(String str, int i11, float f7, T t2, T t11, float f11, float f12, float f13) {
        this.size = f7;
        this.labelTextStyle = t2;
        this.smallLabelTextStyle = t11;
        this.graphicSize = f11;
        this.smallGraphicSize = f12;
        this.textPadding = f13;
    }

    public static UniProductMediaSize valueOf(String str) {
        return (UniProductMediaSize) Enum.valueOf(UniProductMediaSize.class, str);
    }

    public static UniProductMediaSize[] values() {
        return (UniProductMediaSize[]) $VALUES.clone();
    }

    /* renamed from: getGraphicSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getGraphicSize() {
        return this.graphicSize;
    }

    @NotNull
    /* renamed from: getLabelTextStyle$uni_release, reason: from getter */
    public final T getLabelTextStyle() {
        return this.labelTextStyle;
    }

    /* renamed from: getSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }

    /* renamed from: getSmallGraphicSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getSmallGraphicSize() {
        return this.smallGraphicSize;
    }

    /* renamed from: getSmallLabelTextStyle$uni_release, reason: from getter */
    public final T getSmallLabelTextStyle() {
        return this.smallLabelTextStyle;
    }

    /* renamed from: getTextPadding-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getTextPadding() {
        return this.textPadding;
    }
}
