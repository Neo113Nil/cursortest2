package ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.size;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/size/DebugMenuButtonSize;", "", "LZ1/h;", "contentHorizontalPadding", "cornerRadius", "height", "labelHorizontalPadding", "<init>", "(Ljava/lang/String;IFFFF)V", "F", "getContentHorizontalPadding-D9Ej5fM", "()F", "getCornerRadius-D9Ej5fM", "getHeight-D9Ej5fM", "getLabelHorizontalPadding-D9Ej5fM", "Size500", "Size600", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuButtonSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DebugMenuButtonSize[] $VALUES;
    public static final DebugMenuButtonSize Size500;
    public static final DebugMenuButtonSize Size600;
    private final float contentHorizontalPadding;
    private final float cornerRadius;
    private final float height;
    private final float labelHorizontalPadding;

    private static final /* synthetic */ DebugMenuButtonSize[] $values() {
        return new DebugMenuButtonSize[]{Size500, Size600};
    }

    static {
        float f7 = 12;
        Size500 = new DebugMenuButtonSize("Size500", 0, f7, 8, 44, 0.0f, 8, null);
        Size600 = new DebugMenuButtonSize("Size600", 1, 20, f7, 56, 0.0f, 8, null);
        DebugMenuButtonSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DebugMenuButtonSize(String str, int i11, float f7, float f11, float f12, float f13) {
        this.contentHorizontalPadding = f7;
        this.cornerRadius = f11;
        this.height = f12;
        this.labelHorizontalPadding = f13;
    }

    public static DebugMenuButtonSize valueOf(String str) {
        return (DebugMenuButtonSize) Enum.valueOf(DebugMenuButtonSize.class, str);
    }

    public static DebugMenuButtonSize[] values() {
        return (DebugMenuButtonSize[]) $VALUES.clone();
    }

    /* renamed from: getContentHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getContentHorizontalPadding() {
        return this.contentHorizontalPadding;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: getLabelHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLabelHorizontalPadding() {
        return this.labelHorizontalPadding;
    }

    DebugMenuButtonSize(String str, int i11, float f7, float f11, float f12, float f13, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, f7, f11, f12, (i12 & 8) != 0 ? 4 : f13);
    }
}
