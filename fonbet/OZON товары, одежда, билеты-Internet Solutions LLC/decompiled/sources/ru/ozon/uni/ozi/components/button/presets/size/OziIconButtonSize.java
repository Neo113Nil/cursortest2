package ru.ozon.uni.ozi.components.button.presets.size;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.loader.presets.OziLoaderSize;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/size/OziIconButtonSize;", "", "LZ1/h;", "size", "iconSize", "cornerRadius", "Lru/ozon/uni/ozi/components/loader/presets/OziLoaderSize;", "loaderSize", "<init>", "(Ljava/lang/String;IFFFLru/ozon/uni/ozi/components/loader/presets/OziLoaderSize;)V", "F", "getSize-D9Ej5fM$uni_release", "()F", "getIconSize-D9Ej5fM$uni_release", "getCornerRadius-D9Ej5fM$uni_release", "Lru/ozon/uni/ozi/components/loader/presets/OziLoaderSize;", "getLoaderSize$uni_release", "()Lru/ozon/uni/ozi/components/loader/presets/OziLoaderSize;", "Size300", "Size400", "Size500", "Size600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziIconButtonSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziIconButtonSize[] $VALUES;
    public static final OziIconButtonSize Size300;
    public static final OziIconButtonSize Size400;
    public static final OziIconButtonSize Size500;
    public static final OziIconButtonSize Size600;
    private final float cornerRadius;
    private final float iconSize;

    @NotNull
    private final OziLoaderSize loaderSize;
    private final float size;

    private static final /* synthetic */ OziIconButtonSize[] $values() {
        return new OziIconButtonSize[]{Size300, Size400, Size500, Size600};
    }

    static {
        float f7 = 24;
        float f11 = 20;
        float f12 = 8;
        OziLoaderSize oziLoaderSize = OziLoaderSize.Size200;
        Size300 = new OziIconButtonSize("Size300", 0, f7, f11, f12, oziLoaderSize);
        Size400 = new OziIconButtonSize("Size400", 1, 32, f11, f12, oziLoaderSize);
        OziLoaderSize oziLoaderSize2 = OziLoaderSize.Size300;
        Size500 = new OziIconButtonSize("Size500", 2, 44, f7, f12, oziLoaderSize2);
        Size600 = new OziIconButtonSize("Size600", 3, 56, f7, 12, oziLoaderSize2);
        OziIconButtonSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziIconButtonSize(String str, int i11, float f7, float f11, float f12, OziLoaderSize oziLoaderSize) {
        this.size = f7;
        this.iconSize = f11;
        this.cornerRadius = f12;
        this.loaderSize = oziLoaderSize;
    }

    public static OziIconButtonSize valueOf(String str) {
        return (OziIconButtonSize) Enum.valueOf(OziIconButtonSize.class, str);
    }

    public static OziIconButtonSize[] values() {
        return (OziIconButtonSize[]) $VALUES.clone();
    }

    /* renamed from: getCornerRadius-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: getIconSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    @NotNull
    /* renamed from: getLoaderSize$uni_release, reason: from getter */
    public final OziLoaderSize getLoaderSize() {
        return this.loaderSize;
    }

    /* renamed from: getSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }
}
