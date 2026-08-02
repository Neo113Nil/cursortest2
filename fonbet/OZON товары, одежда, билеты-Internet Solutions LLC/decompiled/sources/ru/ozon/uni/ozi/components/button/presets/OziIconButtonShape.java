package ru.ozon.uni.ozi.components.button.presets;

import A0.g;
import A0.h;
import Sc.o;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.button.presets.size.OziIconButtonSize;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/OziIconButtonShape;", "", "<init>", "(Ljava/lang/String;I)V", "Lru/ozon/uni/ozi/components/button/presets/size/OziIconButtonSize;", "size", "LA0/g;", "getShape$uni_release", "(Lru/ozon/uni/ozi/components/button/presets/size/OziIconButtonSize;)LA0/g;", "getShape", "Square", "Circle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziIconButtonShape {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziIconButtonShape[] $VALUES;
    public static final OziIconButtonShape Square = new OziIconButtonShape("Square", 0);
    public static final OziIconButtonShape Circle = new OziIconButtonShape("Circle", 1);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OziIconButtonShape.values().length];
            try {
                iArr[OziIconButtonShape.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OziIconButtonShape.Circle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ OziIconButtonShape[] $values() {
        return new OziIconButtonShape[]{Square, Circle};
    }

    static {
        OziIconButtonShape[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziIconButtonShape(String str, int i11) {
    }

    public static OziIconButtonShape valueOf(String str) {
        return (OziIconButtonShape) Enum.valueOf(OziIconButtonShape.class, str);
    }

    public static OziIconButtonShape[] values() {
        return (OziIconButtonShape[]) $VALUES.clone();
    }

    @NotNull
    public final g getShape$uni_release(@NotNull OziIconButtonSize size) {
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
