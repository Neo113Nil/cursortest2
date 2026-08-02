package ru.ozon.debugMenu.internal.core.ui.widgets.input.presets;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/input/presets/InputState;", "", "LZ1/h;", "borderWidth", "<init>", "(Ljava/lang/String;IF)V", "F", "getBorderWidth-D9Ej5fM", "()F", "Default", "Active", "Disabled", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InputState[] $VALUES;
    public static final InputState Active = new InputState("Active", 1, 2);
    public static final InputState Default;
    public static final InputState Disabled;
    private final float borderWidth;

    private static final /* synthetic */ InputState[] $values() {
        return new InputState[]{Default, Active, Disabled};
    }

    static {
        float f7 = 1;
        Default = new InputState("Default", 0, f7);
        Disabled = new InputState("Disabled", 2, f7);
        InputState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private InputState(String str, int i11, float f7) {
        this.borderWidth = f7;
    }

    public static InputState valueOf(String str) {
        return (InputState) Enum.valueOf(InputState.class, str);
    }

    public static InputState[] values() {
        return (InputState[]) $VALUES.clone();
    }

    /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }
}
