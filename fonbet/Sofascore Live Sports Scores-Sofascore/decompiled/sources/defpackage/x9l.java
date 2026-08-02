package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x9l {
    public static final x9l b;
    public final u9l a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = s9l.x;
        } else if (i >= 30) {
            b = q9l.w;
        } else {
            b = u9l.b;
        }
    }

    public x9l(x9l x9lVar) {
        if (x9lVar == null) {
            this.a = new u9l(this);
            return;
        }
        u9l u9lVar = x9lVar.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (u9lVar instanceof t9l)) {
            this.a = new t9l(this, (t9l) u9lVar);
        } else if (i >= 34 && (u9lVar instanceof s9l)) {
            this.a = new s9l(this, (s9l) u9lVar);
        } else if (i >= 31 && (u9lVar instanceof r9l)) {
            this.a = new r9l(this, (r9l) u9lVar);
        } else if (i >= 30 && (u9lVar instanceof q9l)) {
            this.a = new q9l(this, (q9l) u9lVar);
        } else if (i >= 29 && (u9lVar instanceof p9l)) {
            this.a = new p9l(this, (p9l) u9lVar);
        } else if (i >= 28 && (u9lVar instanceof o9l)) {
            this.a = new o9l(this, (o9l) u9lVar);
        } else if (u9lVar instanceof n9l) {
            this.a = new n9l(this, (n9l) u9lVar);
        } else if (u9lVar instanceof m9l) {
            this.a = new m9l(this, (m9l) u9lVar);
        } else {
            this.a = new u9l(this);
        }
        u9lVar.e(this);
    }

    public static u4a e(u4a u4aVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, u4aVar.a - i);
        int max2 = Math.max(0, u4aVar.b - i2);
        int max3 = Math.max(0, u4aVar.c - i3);
        int max4 = Math.max(0, u4aVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? u4aVar : u4a.c(max, max2, max3, max4);
    }

    public static x9l h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        x9l x9lVar = new x9l(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = bsk.a;
            x9l a = trk.a(view);
            u9l u9lVar = x9lVar.a;
            u9lVar.y(a);
            View rootView = view.getRootView();
            u9lVar.d(rootView);
            u9lVar.p(rootView);
            u9lVar.q();
            u9lVar.A(view.getWindowSystemUiVisibility());
        }
        return x9lVar;
    }

    public final int a() {
        return this.a.n().d;
    }

    public final int b() {
        return this.a.n().a;
    }

    public final int c() {
        return this.a.n().c;
    }

    public final int d() {
        return this.a.n().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x9l) {
            return Objects.equals(this.a, ((x9l) obj).a);
        }
        return false;
    }

    public final x9l f(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        l9l k9lVar = i5 >= 36 ? new k9l(this) : i5 >= 35 ? new j9l(this) : i5 >= 34 ? new i9l(this) : i5 >= 31 ? new h9l(this) : i5 >= 30 ? new g9l(this) : i5 >= 29 ? new f9l(this) : new e9l(this);
        k9lVar.h(u4a.c(i, i2, i3, i4));
        return k9lVar.b();
    }

    public final WindowInsets g() {
        u9l u9lVar = this.a;
        if (u9lVar instanceof m9l) {
            return ((m9l) u9lVar).c;
        }
        return null;
    }

    public final int hashCode() {
        u9l u9lVar = this.a;
        if (u9lVar == null) {
            return 0;
        }
        return u9lVar.hashCode();
    }

    public x9l(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new t9l(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new s9l(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new r9l(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new q9l(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new p9l(this, windowInsets);
        } else if (i >= 28) {
            this.a = new o9l(this, windowInsets);
        } else {
            this.a = new n9l(this, windowInsets);
        }
    }
}
