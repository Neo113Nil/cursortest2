package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class S {

    /* renamed from: a, reason: collision with root package name */
    public int f17073a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f17074b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f17075c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f17076d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f17077e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f17078f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17079g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17080h = false;

    public int a() {
        return this.f17079g ? this.f17073a : this.f17074b;
    }

    public int b() {
        return this.f17073a;
    }

    public int c() {
        return this.f17074b;
    }

    public int d() {
        return this.f17079g ? this.f17074b : this.f17073a;
    }

    public void e(int i10, int i11) {
        this.f17080h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f17077e = i10;
            this.f17073a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f17078f = i11;
            this.f17074b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f17079g) {
            return;
        }
        this.f17079g = z10;
        if (!this.f17080h) {
            this.f17073a = this.f17077e;
            this.f17074b = this.f17078f;
            return;
        }
        if (z10) {
            int i10 = this.f17076d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f17077e;
            }
            this.f17073a = i10;
            int i11 = this.f17075c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f17078f;
            }
            this.f17074b = i11;
            return;
        }
        int i12 = this.f17075c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f17077e;
        }
        this.f17073a = i12;
        int i13 = this.f17076d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f17078f;
        }
        this.f17074b = i13;
    }

    public void g(int i10, int i11) {
        this.f17075c = i10;
        this.f17076d = i11;
        this.f17080h = true;
        if (this.f17079g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f17073a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f17074b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f17073a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f17074b = i11;
        }
    }
}
