package dd;

import android.view.View;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4056c {
    public static final int a(View decorView) {
        Intrinsics.checkNotNullParameter(decorView, "decorView");
        F0 G10 = AbstractC2082d0.G(decorView);
        if (G10 == null) {
            return 0;
        }
        return b(G10);
    }

    public static final int b(F0 f02) {
        return f02.f(F0.p.g() | F0.p.a()).f19099b;
    }

    public static final Boolean c(View decorView) {
        Intrinsics.checkNotNullParameter(decorView, "decorView");
        F0 G10 = AbstractC2082d0.G(decorView);
        if (G10 == null) {
            return null;
        }
        return Boolean.valueOf(G10.q(F0.p.b()));
    }
}
