package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.gms.internal.measurement.y3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final y3 f1386a;

    public q2(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f1386a = new p2(windowInsetsController, new h9.c(windowInsetsController));
        } else {
            this.f1386a = new n2(windowInsetsController, new h9.c(windowInsetsController));
        }
    }

    public q2(Window window, View view) {
        h9.c cVar = new h9.c(view);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            this.f1386a = new p2(window, cVar);
            return;
        }
        if (i5 >= 30) {
            this.f1386a = new n2(window, cVar);
        } else if (i5 >= 26) {
            this.f1386a = new m2(window, cVar);
        } else {
            this.f1386a = new l2(window, cVar);
        }
    }
}
