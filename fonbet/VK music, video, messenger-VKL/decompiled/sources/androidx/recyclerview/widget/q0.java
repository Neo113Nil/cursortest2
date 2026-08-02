package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
public final class q0 {
    public final b a;
    public final a b;

    /* compiled from: ViewBoundsCheck.java */
    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;

        public final boolean a() {
            int i = this.a;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.d;
                int i4 = this.b;
                if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 112) != 0) {
                int i5 = this.d;
                int i6 = this.c;
                if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 1792) != 0) {
                int i7 = this.e;
                int i8 = this.b;
                if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                    return false;
                }
            }
            if ((i & 28672) != 0) {
                int i9 = this.e;
                int i10 = this.c;
                if (i9 > i10) {
                    i2 = 1;
                } else if (i9 != i10) {
                    i2 = 4;
                }
                if ((i & (i2 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    public interface b {
        int a();

        View b(int i);

        int c(View view);

        int d();

        int e(View view);
    }

    public q0(b bVar) {
        this.a = bVar;
        a aVar = new a();
        aVar.a = 0;
        this.b = aVar;
    }

    public final View a(int i, int i2, int i3, int i4) {
        b bVar = this.a;
        int d = bVar.d();
        int a2 = bVar.a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View b2 = bVar.b(i);
            int c = bVar.c(b2);
            int e = bVar.e(b2);
            a aVar = this.b;
            aVar.b = d;
            aVar.c = a2;
            aVar.d = c;
            aVar.e = e;
            if (i3 != 0) {
                aVar.a = i3;
                if (aVar.a()) {
                    return b2;
                }
            }
            if (i4 != 0) {
                aVar.a = i4;
                if (aVar.a()) {
                    view = b2;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.a;
        int d = bVar.d();
        int a2 = bVar.a();
        int c = bVar.c(view);
        int e = bVar.e(view);
        a aVar = this.b;
        aVar.b = d;
        aVar.c = a2;
        aVar.d = c;
        aVar.e = e;
        aVar.a = 24579;
        return aVar.a();
    }
}
