package b;

/* renamed from: b.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2326w {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC2323t[] f24148d = new InterfaceC2323t[0];

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2323t[] f24149a;

    /* renamed from: b, reason: collision with root package name */
    public int f24150b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24151c;

    public C2326w(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f24149a = i10 == 0 ? f24148d : new InterfaceC2323t[i10];
        this.f24150b = 0;
        this.f24151c = false;
    }

    public final InterfaceC2323t a(int i10) {
        if (i10 < this.f24150b) {
            return this.f24149a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10 + " >= " + this.f24150b);
    }

    public final void b(w0 w0Var) {
        if (w0Var == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        InterfaceC2323t[] interfaceC2323tArr = this.f24149a;
        int length = interfaceC2323tArr.length;
        int i10 = this.f24150b + 1;
        if (this.f24151c | (i10 > length)) {
            InterfaceC2323t[] interfaceC2323tArr2 = new InterfaceC2323t[Math.max(interfaceC2323tArr.length, (i10 >> 1) + i10)];
            System.arraycopy(this.f24149a, 0, interfaceC2323tArr2, 0, this.f24150b);
            this.f24149a = interfaceC2323tArr2;
            this.f24151c = false;
        }
        this.f24149a[this.f24150b] = w0Var;
        this.f24150b = i10;
    }

    public final InterfaceC2323t[] c() {
        int i10 = this.f24150b;
        if (i10 == 0) {
            return f24148d;
        }
        InterfaceC2323t[] interfaceC2323tArr = this.f24149a;
        if (interfaceC2323tArr.length == i10) {
            this.f24151c = true;
            return interfaceC2323tArr;
        }
        InterfaceC2323t[] interfaceC2323tArr2 = new InterfaceC2323t[i10];
        System.arraycopy(interfaceC2323tArr, 0, interfaceC2323tArr2, 0, i10);
        return interfaceC2323tArr2;
    }
}
