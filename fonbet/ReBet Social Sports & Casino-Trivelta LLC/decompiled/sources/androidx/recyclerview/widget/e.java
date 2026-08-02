package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final q f23006a;

    /* renamed from: b, reason: collision with root package name */
    public int f23007b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f23008c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f23009d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f23010e = null;

    public e(q qVar) {
        this.f23006a = qVar;
    }

    @Override // androidx.recyclerview.widget.q
    public void a(int i10, int i11) {
        int i12;
        if (this.f23007b == 1 && i10 >= (i12 = this.f23008c)) {
            int i13 = this.f23009d;
            if (i10 <= i12 + i13) {
                this.f23009d = i13 + i11;
                this.f23008c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f23008c = i10;
        this.f23009d = i11;
        this.f23007b = 1;
    }

    @Override // androidx.recyclerview.widget.q
    public void b(int i10, int i11) {
        int i12;
        if (this.f23007b == 2 && (i12 = this.f23008c) >= i10 && i12 <= i10 + i11) {
            this.f23009d += i11;
            this.f23008c = i10;
        } else {
            e();
            this.f23008c = i10;
            this.f23009d = i11;
            this.f23007b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.q
    public void c(int i10, int i11, Object obj) {
        int i12;
        if (this.f23007b == 3) {
            int i13 = this.f23008c;
            int i14 = this.f23009d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f23010e == obj) {
                this.f23008c = Math.min(i10, i13);
                this.f23009d = Math.max(i14 + i13, i12) - this.f23008c;
                return;
            }
        }
        e();
        this.f23008c = i10;
        this.f23009d = i11;
        this.f23010e = obj;
        this.f23007b = 3;
    }

    @Override // androidx.recyclerview.widget.q
    public void d(int i10, int i11) {
        e();
        this.f23006a.d(i10, i11);
    }

    public void e() {
        int i10 = this.f23007b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f23006a.a(this.f23008c, this.f23009d);
        } else if (i10 == 2) {
            this.f23006a.b(this.f23008c, this.f23009d);
        } else if (i10 == 3) {
            this.f23006a.c(this.f23008c, this.f23009d, this.f23010e);
        }
        this.f23010e = null;
        this.f23007b = 0;
    }
}
