package ru.ozon.uni.components.iconButton;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.components.loader.UniLoaderSize;
import ru.ozon.uni.core.repository.UniTheme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonSize;", "", "LZ1/h;", "size", "iconSize", "Lru/ozon/uni/components/loader/UniLoaderSize;", "loaderSize", "cornerRadius", "<init>", "(Ljava/lang/String;IFFLru/ozon/uni/components/loader/UniLoaderSize;F)V", "F", "getSize-D9Ej5fM$uni_release", "()F", "getIconSize-D9Ej5fM$uni_release", "Lru/ozon/uni/components/loader/UniLoaderSize;", "getLoaderSize$uni_release", "()Lru/ozon/uni/components/loader/UniLoaderSize;", "getCornerRadius-D9Ej5fM$uni_release", "SIZE_300", "SIZE_400", "SIZE_450", "SIZE_500", "SIZE_600", "SIZE_700", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniIconButtonSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniIconButtonSize[] $VALUES;
    public static final UniIconButtonSize SIZE_300;
    public static final UniIconButtonSize SIZE_400;
    public static final UniIconButtonSize SIZE_450;
    public static final UniIconButtonSize SIZE_500;
    public static final UniIconButtonSize SIZE_600;
    public static final UniIconButtonSize SIZE_700;
    private final float cornerRadius;
    private final float iconSize;

    @NotNull
    private final UniLoaderSize loaderSize;
    private final float size;

    private static final /* synthetic */ UniIconButtonSize[] $values() {
        return new UniIconButtonSize[]{SIZE_300, SIZE_400, SIZE_450, SIZE_500, SIZE_600, SIZE_700};
    }

    static {
        float f7 = 24;
        float f11 = 16;
        UniLoaderSize uniLoaderSize = UniLoaderSize.Size200;
        UniTheme uniTheme = UniTheme.INSTANCE;
        SIZE_300 = new UniIconButtonSize("SIZE_300", 0, f7, f11, uniLoaderSize, uniTheme.getRadii().getRadius300());
        SIZE_400 = new UniIconButtonSize("SIZE_400", 1, 32, f11, uniLoaderSize, uniTheme.getRadii().getRadius350());
        UniLoaderSize uniLoaderSize2 = UniLoaderSize.Size300;
        SIZE_450 = new UniIconButtonSize("SIZE_450", 2, 40, f7, uniLoaderSize2, uniTheme.getRadii().getRadius400());
        SIZE_500 = new UniIconButtonSize("SIZE_500", 3, 44, f7, uniLoaderSize2, uniTheme.getRadii().getRadius400());
        SIZE_600 = new UniIconButtonSize("SIZE_600", 4, 56, f7, uniLoaderSize2, uniTheme.getRadii().getRadius500());
        SIZE_700 = new UniIconButtonSize("SIZE_700", 5, 72, f7, uniLoaderSize2, uniTheme.getRadii().getRadius550());
        UniIconButtonSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniIconButtonSize(String str, int i11, float f7, float f11, UniLoaderSize uniLoaderSize, float f12) {
        this.size = f7;
        this.iconSize = f11;
        this.loaderSize = uniLoaderSize;
        this.cornerRadius = f12;
    }

    public static UniIconButtonSize valueOf(String str) {
        return (UniIconButtonSize) Enum.valueOf(UniIconButtonSize.class, str);
    }

    public static UniIconButtonSize[] values() {
        return (UniIconButtonSize[]) $VALUES.clone();
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
    public final UniLoaderSize getLoaderSize() {
        return this.loaderSize;
    }

    /* renamed from: getSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }
}
