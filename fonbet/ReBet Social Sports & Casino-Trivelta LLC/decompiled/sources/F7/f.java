package F7;

import D6.k;
import D6.p;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    public boolean f3587g;

    /* renamed from: h, reason: collision with root package name */
    public final G6.a f3588h;

    /* renamed from: c, reason: collision with root package name */
    public int f3583c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f3582b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3584d = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f3586f = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3585e = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f3581a = 0;

    public f(G6.a aVar) {
        this.f3588h = (G6.a) k.g(aVar);
    }

    public static boolean b(int i10) {
        if (i10 == 1) {
            return false;
        }
        return ((i10 >= 208 && i10 <= 215) || i10 == 217 || i10 == 216) ? false : true;
    }

    public final boolean a(InputStream inputStream) {
        int read;
        int i10 = this.f3585e;
        while (this.f3581a != 6 && (read = inputStream.read()) != -1) {
            try {
                int i11 = this.f3583c;
                this.f3583c = i11 + 1;
                if (this.f3587g) {
                    this.f3581a = 6;
                    this.f3587g = false;
                    return false;
                }
                int i12 = this.f3581a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    this.f3581a = 5;
                                } else if (i12 != 5) {
                                    k.i(false);
                                } else {
                                    int i13 = ((this.f3582b << 8) + read) - 2;
                                    com.facebook.common.util.d.a(inputStream, i13);
                                    this.f3583c += i13;
                                    this.f3581a = 2;
                                }
                            } else if (read == 255) {
                                this.f3581a = 3;
                            } else if (read == 0) {
                                this.f3581a = 2;
                            } else if (read == 217) {
                                this.f3587g = true;
                                f(i11 - 1);
                                this.f3581a = 2;
                            } else {
                                if (read == 218) {
                                    f(i11 - 1);
                                }
                                if (b(read)) {
                                    this.f3581a = 4;
                                } else {
                                    this.f3581a = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.f3581a = 3;
                        }
                    } else if (read == 216) {
                        this.f3581a = 2;
                    } else {
                        this.f3581a = 6;
                    }
                } else if (read == 255) {
                    this.f3581a = 1;
                } else {
                    this.f3581a = 6;
                }
                this.f3582b = read;
            } catch (IOException e10) {
                p.a(e10);
            }
        }
        return (this.f3581a == 6 || this.f3585e == i10) ? false : true;
    }

    public int c() {
        return this.f3586f;
    }

    public int d() {
        return this.f3585e;
    }

    public boolean e() {
        return this.f3587g;
    }

    public final void f(int i10) {
        int i11 = this.f3584d;
        if (i11 > 0) {
            this.f3586f = i10;
        }
        this.f3584d = i11 + 1;
        this.f3585e = i11;
    }

    public boolean g(H7.k kVar) {
        if (this.f3581a == 6 || kVar.y1() <= this.f3583c) {
            return false;
        }
        G6.g gVar = new G6.g(kVar.m1(), (byte[]) this.f3588h.get(16384), this.f3588h);
        try {
            com.facebook.common.util.d.a(gVar, this.f3583c);
            return a(gVar);
        } catch (IOException e10) {
            p.a(e10);
            return false;
        } finally {
            D6.b.b(gVar);
        }
    }
}
