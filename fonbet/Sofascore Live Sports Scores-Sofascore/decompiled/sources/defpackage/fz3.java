package defpackage;

import android.os.CancellationSignal;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fz3 {
    public static boolean a(CancellationSignal cancellationSignal) {
        return cancellationSignal != null && cancellationSignal.isCanceled();
    }

    public static void b(CancellationSignal cancellationSignal, Function0 function0) {
        if (a(cancellationSignal)) {
            return;
        }
        function0.invoke();
    }
}
