package androidx.recyclerview.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f2420a;

    /* renamed from: b, reason: collision with root package name */
    public int f2421b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2422c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f2423d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f2424e = null;

    public i(o0 o0Var) {
        this.f2420a = o0Var;
    }

    @Override // androidx.recyclerview.widget.o0
    public final void a(int i5, int i10) {
        e();
        this.f2420a.a(i5, i10);
    }

    @Override // androidx.recyclerview.widget.o0
    public final void b(int i5, int i10) {
        int i11;
        if (this.f2421b == 1 && i5 >= (i11 = this.f2422c)) {
            int i12 = this.f2423d;
            if (i5 <= i11 + i12) {
                this.f2423d = i12 + i10;
                this.f2422c = Math.min(i5, i11);
                return;
            }
        }
        e();
        this.f2422c = i5;
        this.f2423d = i10;
        this.f2421b = 1;
    }

    @Override // androidx.recyclerview.widget.o0
    public final void c(int i5, int i10) {
        int i11;
        if (this.f2421b == 2 && (i11 = this.f2422c) >= i5 && i11 <= i5 + i10) {
            this.f2423d += i10;
            this.f2422c = i5;
        } else {
            e();
            this.f2422c = i5;
            this.f2423d = i10;
            this.f2421b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.o0
    public final void d(int i5, int i10, Object obj) {
        int i11;
        int i12;
        int i13;
        if (this.f2421b == 3 && i5 <= (i12 = this.f2423d + (i11 = this.f2422c)) && (i13 = i5 + i10) >= i11 && this.f2424e == obj) {
            this.f2422c = Math.min(i5, i11);
            this.f2423d = Math.max(i12, i13) - this.f2422c;
            return;
        }
        e();
        this.f2422c = i5;
        this.f2423d = i10;
        this.f2424e = obj;
        this.f2421b = 3;
    }

    public final void e() {
        int i5 = this.f2421b;
        if (i5 == 0) {
            return;
        }
        o0 o0Var = this.f2420a;
        if (i5 == 1) {
            o0Var.b(this.f2422c, this.f2423d);
        } else if (i5 == 2) {
            o0Var.c(this.f2422c, this.f2423d);
        } else if (i5 == 3) {
            o0Var.d(this.f2422c, this.f2423d, this.f2424e);
        }
        this.f2424e = null;
        this.f2421b = 0;
    }
}
