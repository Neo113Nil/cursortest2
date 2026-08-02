package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public k2 f1375a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1377c;

    public p0(View view, x xVar) {
        this.f1376b = view;
        this.f1377c = xVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k2 h10 = k2.h(view, windowInsets);
        int i5 = Build.VERSION.SDK_INT;
        x xVar = this.f1377c;
        if (i5 < 30) {
            q0.a(windowInsets, this.f1376b);
            if (h10.equals(this.f1375a)) {
                return xVar.onApplyWindowInsets(view, h10).g();
            }
        }
        this.f1375a = h10;
        k2 onApplyWindowInsets = xVar.onApplyWindowInsets(view, h10);
        if (i5 >= 30) {
            return onApplyWindowInsets.g();
        }
        WeakHashMap weakHashMap = z0.f1413a;
        o0.c(view);
        return onApplyWindowInsets.g();
    }
}
