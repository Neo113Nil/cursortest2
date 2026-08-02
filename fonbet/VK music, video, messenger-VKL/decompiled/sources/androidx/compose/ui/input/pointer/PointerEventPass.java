package androidx.compose.ui.input.pointer;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PointerEvent.kt */
/* loaded from: classes11.dex */
public final class PointerEventPass {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PointerEventPass[] $VALUES;
    public static final PointerEventPass Final;
    public static final PointerEventPass Initial;
    public static final PointerEventPass Main;

    static {
        PointerEventPass pointerEventPass = new PointerEventPass("Initial", 0);
        Initial = pointerEventPass;
        PointerEventPass pointerEventPass2 = new PointerEventPass("Main", 1);
        Main = pointerEventPass2;
        PointerEventPass pointerEventPass3 = new PointerEventPass("Final", 2);
        Final = pointerEventPass3;
        PointerEventPass[] pointerEventPassArr = {pointerEventPass, pointerEventPass2, pointerEventPass3};
        $VALUES = pointerEventPassArr;
        $ENTRIES = new asp(pointerEventPassArr);
    }

    public PointerEventPass() {
        throw null;
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) $VALUES.clone();
    }
}
