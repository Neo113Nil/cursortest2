package e;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.l2;
import androidx.core.view.m2;
import androidx.core.view.n2;
import androidx.core.view.p2;
import com.google.android.gms.internal.measurement.y3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class q extends p {
    @Override // e.o, k2.x
    public void C(@NotNull f0 statusBarStyle, @NotNull f0 navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z5, boolean z7) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        a.a.y(window, false);
        statusBarStyle.getClass();
        window.setStatusBarColor(0);
        navigationBarStyle.getClass();
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(false);
        h9.c cVar = new h9.c(view);
        int i5 = Build.VERSION.SDK_INT;
        y3 p2Var = i5 >= 35 ? new p2(window, cVar) : i5 >= 30 ? new n2(window, cVar) : i5 >= 26 ? new m2(window, cVar) : new l2(window, cVar);
        p2Var.x(!z5);
        p2Var.w(!z7);
    }
}
