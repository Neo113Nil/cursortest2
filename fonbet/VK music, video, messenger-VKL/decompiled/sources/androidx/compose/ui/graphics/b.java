package androidx.compose.ui.graphics;

import android.graphics.Path;
import androidx.compose.ui.graphics.Path;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AndroidPath.android.kt */
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: AndroidPath.android.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Path.Direction.values().length];
            try {
                iArr[Path.Direction.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Path.Direction.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final androidx.compose.ui.graphics.a a() {
        return new androidx.compose.ui.graphics.a(0);
    }

    public static final Path.Direction b(Path.Direction direction) {
        int i = a.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return Path.Direction.CCW;
        }
        if (i == 2) {
            return Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }
}
