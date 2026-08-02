package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u {
    public static w a(x state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i5 = t.$EnumSwitchMapping$0[state.ordinal()];
        if (i5 == 1) {
            return w.ON_DESTROY;
        }
        if (i5 == 2) {
            return w.ON_STOP;
        }
        if (i5 != 3) {
            return null;
        }
        return w.ON_PAUSE;
    }

    public static w b(x state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i5 = t.$EnumSwitchMapping$0[state.ordinal()];
        if (i5 == 1) {
            return w.ON_START;
        }
        if (i5 == 2) {
            return w.ON_RESUME;
        }
        if (i5 != 5) {
            return null;
        }
        return w.ON_CREATE;
    }

    public static w c(x state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i5 = t.$EnumSwitchMapping$0[state.ordinal()];
        if (i5 == 1) {
            return w.ON_CREATE;
        }
        if (i5 == 2) {
            return w.ON_START;
        }
        if (i5 != 3) {
            return null;
        }
        return w.ON_RESUME;
    }
}
