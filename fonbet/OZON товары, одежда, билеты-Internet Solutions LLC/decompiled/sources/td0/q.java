package td0;

import B90.V;
import B90.W;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q {
    public static void a(View view, int i11, long j11) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        long j12 = (i11 & 2) != 0 ? 300L : 150L;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.animate().cancel();
        view.animate().alpha(1.0f).setStartDelay(j11).setDuration(j12).withStartAction(new V(view, 7));
    }

    public static void b(int i11, View view) {
        long j11 = (i11 & 2) != 0 ? 300L : 150L;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.animate().cancel();
        view.animate().alpha(0.0f).setStartDelay(0L).setDuration(j11).withEndAction(new W(view, 6));
    }
}
