package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import xsna.v7f0;

/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes.dex */
public abstract class e0<T, B> {
    public abstract void a(int i, int i2, Object obj);

    public abstract void b(int i, long j, Object obj);

    public abstract void c(int i, Object obj, Object obj2);

    public abstract void d(B b, int i, ByteString byteString);

    public abstract void e(int i, long j, Object obj);

    public abstract f0 f(Object obj);

    public abstract f0 g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract f0 k(Object obj, Object obj2);

    public final boolean l(B b, v7f0 v7f0Var) throws IOException {
        int tag = v7f0Var.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            e(i, v7f0Var.j(), b);
            return true;
        }
        if (i2 == 1) {
            b(i, v7f0Var.E(), b);
            return true;
        }
        if (i2 == 2) {
            d(b, i, v7f0Var.v());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.g();
            }
            a(i, v7f0Var.p(), b);
            return true;
        }
        f0 m = m();
        int i3 = 4 | (i << 3);
        while (v7f0Var.z() != Integer.MAX_VALUE && l(m, v7f0Var)) {
        }
        if (i3 != v7f0Var.getTag()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c(i, b, p(m));
        return true;
    }

    public abstract f0 m();

    public abstract void n(Object obj, B b);

    public abstract void o(Object obj, T t);

    public abstract f0 p(Object obj);

    public abstract void q(T t, Writer writer) throws IOException;

    public abstract void r(T t, Writer writer) throws IOException;
}
