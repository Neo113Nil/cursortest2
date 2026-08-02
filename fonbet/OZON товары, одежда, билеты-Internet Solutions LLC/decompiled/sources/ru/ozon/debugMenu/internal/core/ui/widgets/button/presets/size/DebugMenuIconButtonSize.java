package ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.size;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/size/DebugMenuIconButtonSize;", "", "LZ1/h;", "size", "iconSize", "cornerRadius", "<init>", "(Ljava/lang/String;IFFF)V", "F", "getSize-D9Ej5fM", "()F", "getIconSize-D9Ej5fM", "getCornerRadius-D9Ej5fM", "Size400", "Size500", "Size600", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuIconButtonSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DebugMenuIconButtonSize[] $VALUES;
    public static final DebugMenuIconButtonSize Size400;
    public static final DebugMenuIconButtonSize Size500;
    public static final DebugMenuIconButtonSize Size600;
    private final float cornerRadius;
    private final float iconSize;
    private final float size;

    private static final /* synthetic */ DebugMenuIconButtonSize[] $values() {
        return new DebugMenuIconButtonSize[]{Size400, Size500, Size600};
    }

    static {
        float f7 = 8;
        Size400 = new DebugMenuIconButtonSize("Size400", 0, 32, 20, f7);
        float f11 = 24;
        Size500 = new DebugMenuIconButtonSize("Size500", 1, 44, f11, f7);
        Size600 = new DebugMenuIconButtonSize("Size600", 2, 56, f11, 12);
        DebugMenuIconButtonSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DebugMenuIconButtonSize(String str, int i11, float f7, float f11, float f12) {
        this.size = f7;
        this.iconSize = f11;
        this.cornerRadius = f12;
    }

    public static DebugMenuIconButtonSize valueOf(String str) {
        return (DebugMenuIconButtonSize) Enum.valueOf(DebugMenuIconButtonSize.class, str);
    }

    public static DebugMenuIconButtonSize[] values() {
        return (DebugMenuIconButtonSize[]) $VALUES.clone();
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }
}
