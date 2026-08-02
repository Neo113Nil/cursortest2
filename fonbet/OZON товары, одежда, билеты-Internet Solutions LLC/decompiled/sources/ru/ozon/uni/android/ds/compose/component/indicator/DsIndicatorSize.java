package ru.ozon.uni.android.ds.compose.component.indicator;

import K1.T;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.repository.UniTheme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorSize;", "", "LZ1/h;", "size", "cornerRadius", "LK1/T;", "textStyle", "<init>", "(Ljava/lang/String;IFFLK1/T;)V", "F", "getSize-D9Ej5fM$uni_release", "()F", "getCornerRadius-D9Ej5fM$uni_release", "LK1/T;", "getTextStyle$uni_release", "()LK1/T;", "Size300", "Size400", "Size450", "Size500", "Size600", "Size700", "Size800", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsIndicatorSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsIndicatorSize[] $VALUES;
    public static final DsIndicatorSize Size300;
    public static final DsIndicatorSize Size400;
    public static final DsIndicatorSize Size450;
    public static final DsIndicatorSize Size500;
    public static final DsIndicatorSize Size600;
    public static final DsIndicatorSize Size700;
    public static final DsIndicatorSize Size800;
    private final float cornerRadius;
    private final float size;

    @NotNull
    private final T textStyle;

    private static final /* synthetic */ DsIndicatorSize[] $values() {
        return new DsIndicatorSize[]{Size300, Size400, Size450, Size500, Size600, Size700, Size800};
    }

    static {
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        float m1854getDp4D9Ej5fM = dsSpacings.m1854getDp4D9Ej5fM();
        float m1847getDp2D9Ej5fM = dsSpacings.m1847getDp2D9Ej5fM();
        UniTheme uniTheme = UniTheme.INSTANCE;
        Size300 = new DsIndicatorSize("Size300", 0, m1854getDp4D9Ej5fM, m1847getDp2D9Ej5fM, uniTheme.getTypography().getBodyNumeric300XSmall());
        Size400 = new DsIndicatorSize("Size400", 1, dsSpacings.m1861getDp8D9Ej5fM(), dsSpacings.m1854getDp4D9Ej5fM(), uniTheme.getTypography().getBodyNumeric300XSmall());
        Size450 = new DsIndicatorSize("Size450", 2, dsSpacings.m1842getDp12D9Ej5fM(), dsSpacings.m1859getDp6D9Ej5fM(), uniTheme.getTypography().getBodyNumeric200XSmall());
        Size500 = new DsIndicatorSize("Size500", 3, dsSpacings.m1845getDp16D9Ej5fM(), dsSpacings.m1861getDp8D9Ej5fM(), uniTheme.getTypography().getBodyNumeric300XSmall());
        Size600 = new DsIndicatorSize("Size600", 4, dsSpacings.m1848getDp20D9Ej5fM(), dsSpacings.m1840getDp10D9Ej5fM(), uniTheme.getTypography().getBodyNumeric300XSmall());
        Size700 = new DsIndicatorSize("Size700", 5, dsSpacings.m1850getDp24D9Ej5fM(), dsSpacings.m1842getDp12D9Ej5fM(), uniTheme.getTypography().getBodyNumeric400Small());
        Size800 = new DsIndicatorSize("Size800", 6, dsSpacings.m1851getDp28D9Ej5fM(), dsSpacings.m1844getDp14D9Ej5fM(), uniTheme.getTypography().getBodyNumeric400Small());
        DsIndicatorSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsIndicatorSize(String str, int i11, float f7, float f11, T t2) {
        this.size = f7;
        this.cornerRadius = f11;
        this.textStyle = t2;
    }

    public static DsIndicatorSize valueOf(String str) {
        return (DsIndicatorSize) Enum.valueOf(DsIndicatorSize.class, str);
    }

    public static DsIndicatorSize[] values() {
        return (DsIndicatorSize[]) $VALUES.clone();
    }

    /* renamed from: getCornerRadius-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: getSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: getTextStyle$uni_release, reason: from getter */
    public final T getTextStyle() {
        return this.textStyle;
    }
}
