package ru.ozon.debugMenu.internal.core.ui.widgets.input.presets;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z20.EnumC10976a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t\u0082\u0001\u0001\f¨\u0006\r"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/input/presets/DebugMenuInputStatus;", "", "LA20/b;", "borderColor", "activeBorderColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getBorderColor-8cB4AMA", "()Ljava/lang/Object;", "getActiveBorderColor-8cB4AMA", "Neutral", "Lru/ozon/debugMenu/internal/core/ui/widgets/input/presets/DebugMenuInputStatus$Neutral;", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DebugMenuInputStatus {

    @NotNull
    private final Object activeBorderColor;

    @NotNull
    private final Object borderColor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/input/presets/DebugMenuInputStatus$Neutral;", "Lru/ozon/debugMenu/internal/core/ui/widgets/input/presets/DebugMenuInputStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Neutral extends DebugMenuInputStatus {

        @NotNull
        public static final Neutral INSTANCE = new Neutral();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Neutral() {
            super(token, token, null);
            EnumC10976a token = EnumC10976a.GraphicNeutralTransparent;
            Intrinsics.checkNotNullParameter(token, "token");
            EnumC10976a token2 = EnumC10976a.GraphicActionPrimary;
            Intrinsics.checkNotNullParameter(token2, "token");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Neutral);
        }

        public int hashCode() {
            return -1620469401;
        }

        @NotNull
        public String toString() {
            return "Neutral";
        }
    }

    public /* synthetic */ DebugMenuInputStatus(Object obj, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2);
    }

    @NotNull
    /* renamed from: getActiveBorderColor-8cB4AMA, reason: not valid java name and from getter */
    public final Object getActiveBorderColor() {
        return this.activeBorderColor;
    }

    @NotNull
    /* renamed from: getBorderColor-8cB4AMA, reason: not valid java name and from getter */
    public final Object getBorderColor() {
        return this.borderColor;
    }

    private DebugMenuInputStatus(Object borderColor, Object activeBorderColor) {
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(activeBorderColor, "activeBorderColor");
        this.borderColor = borderColor;
        this.activeBorderColor = activeBorderColor;
    }
}
