package v1;

import android.view.KeyEvent;
import org.jetbrains.annotations.NotNull;

/* renamed from: v1.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10179d {
    public static final long a(@NotNull KeyEvent keyEvent) {
        return C10181f.a(keyEvent.getKeyCode());
    }

    public static final int b(@NotNull KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final int c(@NotNull KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(@NotNull KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final boolean e(@NotNull KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean f(@NotNull KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
