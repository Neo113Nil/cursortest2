package ru.ozon.uni.ozi.components.loader.presets;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/ozi/components/loader/presets/OziLoaderSize;", "", "LZ1/h;", "outerSize", "innerSize", "<init>", "(Ljava/lang/String;IFF)V", "F", "getOuterSize-D9Ej5fM$uni_release", "()F", "getInnerSize-D9Ej5fM$uni_release", "Size200", "Size300", "Size400", "Size500", "Size600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziLoaderSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziLoaderSize[] $VALUES;
    public static final OziLoaderSize Size200 = new OziLoaderSize("Size200", 0, 16, 14);
    public static final OziLoaderSize Size300 = new OziLoaderSize("Size300", 1, 24, 18);
    public static final OziLoaderSize Size400 = new OziLoaderSize("Size400", 2, 32, 26);
    public static final OziLoaderSize Size500 = new OziLoaderSize("Size500", 3, 44, 36);
    public static final OziLoaderSize Size600 = new OziLoaderSize("Size600", 4, 56, 46);
    private final float innerSize;
    private final float outerSize;

    private static final /* synthetic */ OziLoaderSize[] $values() {
        return new OziLoaderSize[]{Size200, Size300, Size400, Size500, Size600};
    }

    static {
        OziLoaderSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziLoaderSize(String str, int i11, float f7, float f11) {
        this.outerSize = f7;
        this.innerSize = f11;
    }

    public static OziLoaderSize valueOf(String str) {
        return (OziLoaderSize) Enum.valueOf(OziLoaderSize.class, str);
    }

    public static OziLoaderSize[] values() {
        return (OziLoaderSize[]) $VALUES.clone();
    }

    /* renamed from: getInnerSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getInnerSize() {
        return this.innerSize;
    }

    /* renamed from: getOuterSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getOuterSize() {
        return this.outerSize;
    }
}
