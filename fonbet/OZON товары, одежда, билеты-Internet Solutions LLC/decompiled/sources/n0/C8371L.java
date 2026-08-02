package n0;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import androidx.compose.ui.e;
import k1.C7459e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.L, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8371L {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final I1.C<Function0<C7459e>> f76095a = new I1.C<>("MagnifierPositionInRoot");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f76096b = 0;

    @NotNull
    public static final I1.C<Function0<C7459e>> a() {
        return f76095a;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static androidx.compose.ui.e c(e.a aVar, Function1 function1, Function1 function12, Y y11) {
        return b() ? new MagnifierElement(function1, function12, y11) : aVar;
    }
}
