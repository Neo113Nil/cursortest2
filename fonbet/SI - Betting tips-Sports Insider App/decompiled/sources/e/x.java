package e;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x implements androidx.lifecycle.c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final gf.t f8445b = gf.k.b(new b2.b(19));

    /* renamed from: a, reason: collision with root package name */
    public final j f8446a;

    public x(j activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f8446a = activity;
    }

    @Override // androidx.lifecycle.c0
    public final void c(androidx.lifecycle.e0 source, androidx.lifecycle.w event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != androidx.lifecycle.w.ON_DESTROY) {
            return;
        }
        Object systemService = this.f8446a.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        u uVar = (u) f8445b.getValue();
        Object b10 = uVar.b(inputMethodManager);
        if (b10 == null) {
            return;
        }
        synchronized (b10) {
            View c2 = uVar.c(inputMethodManager);
            if (c2 == null) {
                return;
            }
            if (c2.isAttachedToWindow()) {
                return;
            }
            boolean a7 = uVar.a(inputMethodManager);
            if (a7) {
                inputMethodManager.isActive();
            }
        }
    }
}
