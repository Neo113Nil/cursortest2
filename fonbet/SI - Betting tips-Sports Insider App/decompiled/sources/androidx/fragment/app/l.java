package androidx.fragment.app;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f1994a;

    public l(f2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f1994a = operation;
    }

    public final boolean a() {
        i2 i2Var;
        f2 f2Var = this.f1994a;
        View view = f2Var.f1905c.mView;
        i2 i2Var2 = i2.f1958b;
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "<this>");
            float alpha = view.getAlpha();
            i2Var = i2.f1960d;
            if (alpha != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i2Var = i2Var2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(visibility, "Unknown visibility "));
                    }
                    i2Var = i2.f1959c;
                }
            }
        } else {
            i2Var = null;
        }
        i2 i2Var3 = f2Var.f1903a;
        if (i2Var != i2Var3) {
            return (i2Var == i2Var2 || i2Var3 == i2Var2) ? false : true;
        }
        return true;
    }
}
