package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m1 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f1357a;

    /* renamed from: b, reason: collision with root package name */
    public k2 f1358b;

    public m1(View view, j1 j1Var) {
        k2 k2Var;
        this.f1357a = j1Var;
        WeakHashMap weakHashMap = z0.f1413a;
        k2 a7 = r0.a(view);
        if (a7 != null) {
            int i5 = Build.VERSION.SDK_INT;
            k2Var = (i5 >= 34 ? new y1(a7) : i5 >= 31 ? new x1(a7) : i5 >= 30 ? new w1(a7) : i5 >= 29 ? new v1(a7) : new t1(a7)).b();
        } else {
            k2Var = null;
        }
        this.f1358b = k2Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z5;
        if (!view.isLaidOut()) {
            this.f1358b = k2.h(view, windowInsets);
            return n1.j(view, windowInsets);
        }
        k2 h10 = k2.h(view, windowInsets);
        h2 h2Var = h10.f1349a;
        if (this.f1358b == null) {
            WeakHashMap weakHashMap = z0.f1413a;
            this.f1358b = r0.a(view);
        }
        if (this.f1358b == null) {
            this.f1358b = h10;
            return n1.j(view, windowInsets);
        }
        j1 k6 = n1.k(view);
        if (k6 != null && Objects.equals(k6.mDispachedInsets, h10)) {
            return n1.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        k2 k2Var = this.f1358b;
        int i5 = 1;
        while (i5 <= 512) {
            g0.d f6 = h2Var.f(i5);
            g0.d f10 = k2Var.f1349a.f(i5);
            int i10 = f6.f9676a;
            int i11 = f6.f9679d;
            int i12 = f6.f9678c;
            int i13 = f6.f9677b;
            int i14 = f10.f9676a;
            int i15 = f10.f9679d;
            int i16 = f10.f9678c;
            int i17 = f10.f9677b;
            if (i10 > i14 || i13 > i17 || i12 > i16 || i11 > i15) {
                iArr = iArr2;
                z5 = true;
            } else {
                iArr = iArr2;
                z5 = false;
            }
            if (z5 != (i10 < i14 || i13 < i17 || i12 < i16 || i11 < i15)) {
                if (z5) {
                    iArr[0] = iArr[0] | i5;
                } else {
                    iArr3[0] = iArr3[0] | i5;
                }
            }
            i5 <<= 1;
            iArr2 = iArr;
        }
        int i18 = iArr2[0];
        int i19 = iArr3[0];
        int i20 = i18 | i19;
        if (i20 == 0) {
            this.f1358b = h10;
            return n1.j(view, windowInsets);
        }
        k2 k2Var2 = this.f1358b;
        s1 s1Var = new s1(i20, (i18 & 8) != 0 ? n1.f1363e : (i19 & 8) != 0 ? n1.f1364f : (i18 & 519) != 0 ? n1.f1365g : (i19 & 519) != 0 ? n1.f1366h : null, (i20 & 8) != 0 ? 160L : 250L);
        s1Var.f1391a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(s1Var.f1391a.b());
        g0.d f11 = h2Var.f(i20);
        g0.d f12 = k2Var2.f1349a.f(i20);
        int min = Math.min(f11.f9676a, f12.f9676a);
        int i21 = f11.f9677b;
        int i22 = f12.f9677b;
        int min2 = Math.min(i21, i22);
        int i23 = f11.f9678c;
        int i24 = f12.f9678c;
        int min3 = Math.min(i23, i24);
        int i25 = f11.f9679d;
        int i26 = f12.f9679d;
        i1 i1Var = new i1(g0.d.c(min, min2, min3, Math.min(i25, i26)), g0.d.c(Math.max(f11.f9676a, f12.f9676a), Math.max(i21, i22), Math.max(i23, i24), Math.max(i25, i26)));
        n1.g(view, s1Var, h10, false);
        duration.addUpdateListener(new k1(s1Var, h10, k2Var2, i20, view));
        duration.addListener(new l1(view, s1Var));
        z.a(view, new androidx.appcompat.view.menu.f(view, s1Var, i1Var, duration, 1, false));
        this.f1358b = h10;
        return n1.j(view, windowInsets);
    }
}
