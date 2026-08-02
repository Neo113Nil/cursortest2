package ru.ozon.uni.android.wrappers.main.button;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/wrappers/main/button/ButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "PRESSED", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ButtonState[] $VALUES;
    public static final ButtonState ENABLED = new ButtonState("ENABLED", 0);
    public static final ButtonState DISABLED = new ButtonState("DISABLED", 1);
    public static final ButtonState PRESSED = new ButtonState("PRESSED", 2);

    private static final /* synthetic */ ButtonState[] $values() {
        return new ButtonState[]{ENABLED, DISABLED, PRESSED};
    }

    static {
        ButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ButtonState(String str, int i11) {
    }

    @NotNull
    public static a<ButtonState> getEntries() {
        return $ENTRIES;
    }

    public static ButtonState valueOf(String str) {
        return (ButtonState) Enum.valueOf(ButtonState.class, str);
    }

    public static ButtonState[] values() {
        return (ButtonState[]) $VALUES.clone();
    }
}
