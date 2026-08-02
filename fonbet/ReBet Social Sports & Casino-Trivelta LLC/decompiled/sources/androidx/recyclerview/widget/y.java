package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final b f23229a;

    /* renamed from: b, reason: collision with root package name */
    public a f23230b = new a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f23231a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f23232b;

        /* renamed from: c, reason: collision with root package name */
        public int f23233c;

        /* renamed from: d, reason: collision with root package name */
        public int f23234d;

        /* renamed from: e, reason: collision with root package name */
        public int f23235e;

        public void a(int i10) {
            this.f23231a = i10 | this.f23231a;
        }

        public boolean b() {
            int i10 = this.f23231a;
            if ((i10 & 7) != 0 && (i10 & c(this.f23234d, this.f23232b)) == 0) {
                return false;
            }
            int i11 = this.f23231a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f23234d, this.f23233c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f23231a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f23235e, this.f23232b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f23231a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f23235e, this.f23233c) << 12)) != 0;
        }

        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        public void d() {
            this.f23231a = 0;
        }

        public void e(int i10, int i11, int i12, int i13) {
            this.f23232b = i10;
            this.f23233c = i11;
            this.f23234d = i12;
            this.f23235e = i13;
        }
    }

    public interface b {
        int a(View view);

        int b();

        int c();

        int d(View view);

        View getChildAt(int i10);
    }

    public y(b bVar) {
        this.f23229a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int b10 = this.f23229a.b();
        int c10 = this.f23229a.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View childAt = this.f23229a.getChildAt(i10);
            this.f23230b.e(b10, c10, this.f23229a.a(childAt), this.f23229a.d(childAt));
            if (i12 != 0) {
                this.f23230b.d();
                this.f23230b.a(i12);
                if (this.f23230b.b()) {
                    return childAt;
                }
            }
            if (i13 != 0) {
                this.f23230b.d();
                this.f23230b.a(i13);
                if (this.f23230b.b()) {
                    view = childAt;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        this.f23230b.e(this.f23229a.b(), this.f23229a.c(), this.f23229a.a(view), this.f23229a.d(view));
        if (i10 == 0) {
            return false;
        }
        this.f23230b.d();
        this.f23230b.a(i10);
        return this.f23230b.b();
    }
}
