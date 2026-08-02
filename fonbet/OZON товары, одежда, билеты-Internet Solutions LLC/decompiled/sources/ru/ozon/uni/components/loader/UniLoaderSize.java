package ru.ozon.uni.components.loader;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/components/loader/UniLoaderSize;", "", "LZ1/h;", "outerSize", "innerSize", "strokeWidth", "<init>", "(Ljava/lang/String;IFFF)V", "F", "getOuterSize-D9Ej5fM$uni_release", "()F", "getInnerSize-D9Ej5fM$uni_release", "getStrokeWidth-D9Ej5fM$uni_release", "Size200", "Size300", "Size400", "Size500", "Size600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniLoaderSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniLoaderSize[] $VALUES;
    public static final UniLoaderSize Size200;
    public static final UniLoaderSize Size300;
    public static final UniLoaderSize Size400 = new UniLoaderSize("Size400", 2, 32, 26, 3);
    public static final UniLoaderSize Size500 = new UniLoaderSize("Size500", 3, 44, 36, 4);
    public static final UniLoaderSize Size600 = new UniLoaderSize("Size600", 4, 56, 46, 5);
    private final float innerSize;
    private final float outerSize;
    private final float strokeWidth;

    private static final /* synthetic */ UniLoaderSize[] $values() {
        return new UniLoaderSize[]{Size200, Size300, Size400, Size500, Size600};
    }

    static {
        float f7 = 2;
        Size200 = new UniLoaderSize("Size200", 0, 16, 14, f7);
        Size300 = new UniLoaderSize("Size300", 1, 24, 18, f7);
        UniLoaderSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniLoaderSize(String str, int i11, float f7, float f11, float f12) {
        this.outerSize = f7;
        this.innerSize = f11;
        this.strokeWidth = f12;
    }

    public static UniLoaderSize valueOf(String str) {
        return (UniLoaderSize) Enum.valueOf(UniLoaderSize.class, str);
    }

    public static UniLoaderSize[] values() {
        return (UniLoaderSize[]) $VALUES.clone();
    }

    /* renamed from: getInnerSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getInnerSize() {
        return this.innerSize;
    }

    /* renamed from: getOuterSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getOuterSize() {
        return this.outerSize;
    }

    /* renamed from: getStrokeWidth-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }
}
