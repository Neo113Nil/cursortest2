package tj;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public final class f {
    public static final void a(@NotNull G g10, @NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Q p11 = g10.p();
        p11.r(R.id.container, fragment, null);
        p11.g(null);
        p11.w();
        p11.x();
        p11.i();
    }
}
