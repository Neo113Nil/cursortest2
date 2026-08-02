package fi;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: fi.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4298n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4306w f46778a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46779b;

    public C4298n(InterfaceC4306w writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f46778a = writer;
        this.f46779b = true;
    }

    public final boolean a() {
        return this.f46779b;
    }

    public void b() {
        this.f46779b = true;
    }

    public void c() {
        this.f46779b = false;
    }

    public void d() {
        this.f46779b = false;
    }

    public void e(byte b10) {
        this.f46778a.writeLong(b10);
    }

    public final void f(char c10) {
        this.f46778a.a(c10);
    }

    public void g(double d10) {
        this.f46778a.c(String.valueOf(d10));
    }

    public void h(float f10) {
        this.f46778a.c(String.valueOf(f10));
    }

    public void i(int i10) {
        this.f46778a.writeLong(i10);
    }

    public void j(long j10) {
        this.f46778a.writeLong(j10);
    }

    public final void k(String v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        this.f46778a.c(v10);
    }

    public void l(short s10) {
        this.f46778a.writeLong(s10);
    }

    public void m(boolean z10) {
        this.f46778a.c(String.valueOf(z10));
    }

    public void n(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f46778a.b(value);
    }

    public final void o(boolean z10) {
        this.f46779b = z10;
    }

    public void p() {
    }

    public void q() {
    }
}
