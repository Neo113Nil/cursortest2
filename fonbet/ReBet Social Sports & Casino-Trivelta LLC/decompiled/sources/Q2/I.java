package Q2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class I {
    public static final Object a(H h10, String label, Function0 block) {
        Intrinsics.checkNotNullParameter(h10, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean isEnabled = h10.isEnabled();
        if (isEnabled) {
            try {
                h10.a(label);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                if (isEnabled) {
                    h10.b();
                }
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        Object invoke = block.invoke();
        InlineMarker.finallyStart(1);
        if (isEnabled) {
            h10.b();
        }
        InlineMarker.finallyEnd(1);
        return invoke;
    }
}
