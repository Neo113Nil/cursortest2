package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f23011a;

    /* renamed from: e, reason: collision with root package name */
    public View f23015e;

    /* renamed from: d, reason: collision with root package name */
    public int f23014d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final a f23012b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final List f23013c = new ArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f23016a = 0;

        /* renamed from: b, reason: collision with root package name */
        public a f23017b;

        public void a(int i10) {
            if (i10 < 64) {
                this.f23016a &= ~(1 << i10);
                return;
            }
            a aVar = this.f23017b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public int b(int i10) {
            a aVar = this.f23017b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f23016a) : Long.bitCount(this.f23016a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f23016a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f23016a);
        }

        public final void c() {
            if (this.f23017b == null) {
                this.f23017b = new a();
            }
        }

        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f23016a & (1 << i10)) != 0;
            }
            c();
            return this.f23017b.d(i10 - 64);
        }

        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f23017b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f23016a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f23016a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f23017b != null) {
                c();
                this.f23017b.e(0, z11);
            }
        }

        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f23017b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f23016a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f23016a = j12;
            long j13 = j10 - 1;
            this.f23016a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f23017b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f23017b.f(0);
            }
            return z10;
        }

        public void g() {
            this.f23016a = 0L;
            a aVar = this.f23017b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i10) {
            if (i10 < 64) {
                this.f23016a |= 1 << i10;
            } else {
                c();
                this.f23017b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f23017b == null) {
                return Long.toBinaryString(this.f23016a);
            }
            return this.f23017b.toString() + "xx" + Long.toBinaryString(this.f23016a);
        }
    }

    public interface b {
        void a(View view);

        RecyclerView.F b(View view);

        void c(int i10);

        void d(View view, int i10);

        void e();

        int f(View view);

        void g(View view);

        View getChildAt(int i10);

        int getChildCount();

        void h(int i10);

        void i(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    public f(b bVar) {
        this.f23011a = bVar;
    }

    public void a(View view, int i10, boolean z10) {
        int childCount = i10 < 0 ? this.f23011a.getChildCount() : h(i10);
        this.f23012b.e(childCount, z10);
        if (z10) {
            l(view);
        }
        this.f23011a.d(view, childCount);
    }

    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int childCount = i10 < 0 ? this.f23011a.getChildCount() : h(i10);
        this.f23012b.e(childCount, z10);
        if (z10) {
            l(view);
        }
        this.f23011a.i(view, childCount, layoutParams);
    }

    public void d(int i10) {
        int h10 = h(i10);
        this.f23012b.f(h10);
        this.f23011a.c(h10);
    }

    public View e(int i10) {
        int size = this.f23013c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f23013c.get(i11);
            RecyclerView.F b10 = this.f23011a.b(view);
            if (b10.getLayoutPosition() == i10 && !b10.isInvalid() && !b10.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i10) {
        return this.f23011a.getChildAt(h(i10));
    }

    public int g() {
        return this.f23011a.getChildCount() - this.f23013c.size();
    }

    public final int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.f23011a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int b10 = i10 - (i11 - this.f23012b.b(i11));
            if (b10 == 0) {
                while (this.f23012b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    public View i(int i10) {
        return this.f23011a.getChildAt(i10);
    }

    public int j() {
        return this.f23011a.getChildCount();
    }

    public void k(View view) {
        int f10 = this.f23011a.f(view);
        if (f10 >= 0) {
            this.f23012b.h(f10);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.f23013c.add(view);
        this.f23011a.a(view);
    }

    public int m(View view) {
        int f10 = this.f23011a.f(view);
        if (f10 == -1 || this.f23012b.d(f10)) {
            return -1;
        }
        return f10 - this.f23012b.b(f10);
    }

    public boolean n(View view) {
        return this.f23013c.contains(view);
    }

    public void o() {
        this.f23012b.g();
        for (int size = this.f23013c.size() - 1; size >= 0; size--) {
            this.f23011a.g((View) this.f23013c.get(size));
            this.f23013c.remove(size);
        }
        this.f23011a.e();
    }

    public void p(View view) {
        int i10 = this.f23014d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f23014d = 1;
            this.f23015e = view;
            int f10 = this.f23011a.f(view);
            if (f10 >= 0) {
                if (this.f23012b.f(f10)) {
                    t(view);
                }
                this.f23011a.h(f10);
            }
            this.f23014d = 0;
            this.f23015e = null;
        } catch (Throwable th2) {
            this.f23014d = 0;
            this.f23015e = null;
            throw th2;
        }
    }

    public void q(int i10) {
        int i11 = this.f23014d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int h10 = h(i10);
            View childAt = this.f23011a.getChildAt(h10);
            if (childAt != null) {
                this.f23014d = 1;
                this.f23015e = childAt;
                if (this.f23012b.f(h10)) {
                    t(childAt);
                }
                this.f23011a.h(h10);
            }
            this.f23014d = 0;
            this.f23015e = null;
        } catch (Throwable th2) {
            this.f23014d = 0;
            this.f23015e = null;
            throw th2;
        }
    }

    public boolean r(View view) {
        int i10 = this.f23014d;
        if (i10 == 1) {
            if (this.f23015e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f23014d = 2;
            int f10 = this.f23011a.f(view);
            if (f10 == -1) {
                t(view);
                return true;
            }
            if (!this.f23012b.d(f10)) {
                return false;
            }
            this.f23012b.f(f10);
            t(view);
            this.f23011a.h(f10);
            return true;
        } finally {
            this.f23014d = 0;
        }
    }

    public void s(View view) {
        int f10 = this.f23011a.f(view);
        if (f10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f23012b.d(f10)) {
            this.f23012b.a(f10);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f23013c.remove(view)) {
            return false;
        }
        this.f23011a.g(view);
        return true;
    }

    public String toString() {
        return this.f23012b.toString() + ", hidden list:" + this.f23013c.size();
    }
}
