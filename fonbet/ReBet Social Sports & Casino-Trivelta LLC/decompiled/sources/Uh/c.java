package Uh;

import Ph.L;
import Sh.AbstractC1576n;

/* loaded from: classes5.dex */
public final class c extends f {

    /* renamed from: h, reason: collision with root package name */
    public static final c f12280h = new c();

    public c() {
        super(j.f12292c, j.f12293d, j.f12294e, j.f12290a);
    }

    @Override // Ph.L
    public L c2(int i10, String str) {
        AbstractC1576n.a(i10);
        return i10 >= j.f12292c ? AbstractC1576n.b(this, str) : super.c2(i10, str);
    }

    @Override // Ph.AbstractC1477t0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // Ph.L
    public String toString() {
        return "Dispatchers.Default";
    }
}
