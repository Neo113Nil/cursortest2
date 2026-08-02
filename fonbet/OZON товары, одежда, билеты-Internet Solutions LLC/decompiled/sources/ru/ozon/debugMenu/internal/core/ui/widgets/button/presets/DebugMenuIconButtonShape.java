package ru.ozon.debugMenu.internal.core.ui.widgets.button.presets;

import A0.g;
import A0.h;
import Sc.o;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.size.DebugMenuIconButtonSize;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/DebugMenuIconButtonShape;", "", "<init>", "(Ljava/lang/String;I)V", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/size/DebugMenuIconButtonSize;", "size", "LA0/g;", "getShape", "(Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/size/DebugMenuIconButtonSize;)LA0/g;", "Square", "Circle", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuIconButtonShape {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DebugMenuIconButtonShape[] $VALUES;
    public static final DebugMenuIconButtonShape Square = new DebugMenuIconButtonShape("Square", 0);
    public static final DebugMenuIconButtonShape Circle = new DebugMenuIconButtonShape("Circle", 1);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DebugMenuIconButtonShape.values().length];
            try {
                iArr[DebugMenuIconButtonShape.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DebugMenuIconButtonShape.Circle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ DebugMenuIconButtonShape[] $values() {
        return new DebugMenuIconButtonShape[]{Square, Circle};
    }

    static {
        DebugMenuIconButtonShape[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DebugMenuIconButtonShape(String str, int i11) {
    }

    public static DebugMenuIconButtonShape valueOf(String str) {
        return (DebugMenuIconButtonShape) Enum.valueOf(DebugMenuIconButtonShape.class, str);
    }

    public static DebugMenuIconButtonShape[] values() {
        return (DebugMenuIconButtonShape[]) $VALUES.clone();
    }

    @NotNull
    public final g getShape(@NotNull DebugMenuIconButtonSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return h.b(size.getCornerRadius());
        }
        if (i11 == 2) {
            return h.e();
        }
        throw new o();
    }
}
