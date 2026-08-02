package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import xsna.ka20;

/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes.dex */
public final class i implements Writer {
    public final CodedOutputStream a;

    public i(CodedOutputStream codedOutputStream) {
        q.a(codedOutputStream, "output");
        this.a = codedOutputStream;
        codedOutputStream.a = this;
    }

    public final void a(int i, boolean z) throws IOException {
        this.a.s(i, z);
    }

    public final void b(int i, ByteString byteString) throws IOException {
        this.a.t(i, byteString);
    }

    public final void c(int i, double d) throws IOException {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.getClass();
        codedOutputStream.w(i, Double.doubleToRawLongBits(d));
    }

    public final void d(int i, int i2) throws IOException {
        this.a.y(i, i2);
    }

    public final void e(int i, int i2) throws IOException {
        this.a.u(i, i2);
    }

    public final void f(int i, long j) throws IOException {
        this.a.w(i, j);
    }

    public final void g(int i, float f) throws IOException {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.getClass();
        codedOutputStream.u(i, Float.floatToRawIntBits(f));
    }

    public final void h(int i, Object obj, a0 a0Var) throws IOException {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.E(i, 3);
        a0Var.j((ka20) obj, codedOutputStream.a);
        codedOutputStream.E(i, 4);
    }

    public final void i(int i, int i2) throws IOException {
        this.a.y(i, i2);
    }

    public final void j(int i, long j) throws IOException {
        this.a.H(i, j);
    }

    public final void k(int i, Object obj, a0 a0Var) throws IOException {
        this.a.A(i, (ka20) obj, a0Var);
    }

    public final void l(int i, Object obj) throws IOException {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.a;
        if (z) {
            codedOutputStream.C(i, (ByteString) obj);
        } else {
            codedOutputStream.B(i, (ka20) obj);
        }
    }

    public final void m(int i, int i2) throws IOException {
        this.a.u(i, i2);
    }

    public final void n(int i, long j) throws IOException {
        this.a.w(i, j);
    }

    public final void o(int i, int i2) throws IOException {
        this.a.F(i, (i2 >> 31) ^ (i2 << 1));
    }

    public final void p(int i, long j) throws IOException {
        this.a.H(i, (j >> 63) ^ (j << 1));
    }

    public final void q(int i, int i2) throws IOException {
        this.a.F(i, i2);
    }

    public final void r(int i, long j) throws IOException {
        this.a.H(i, j);
    }
}
