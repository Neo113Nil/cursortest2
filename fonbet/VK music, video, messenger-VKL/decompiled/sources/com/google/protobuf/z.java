package com.google.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes.dex */
public abstract class z<T, B> {
    public abstract void a(int i, int i2, Object obj);

    public abstract void b(int i, long j, Object obj);

    public abstract void c(int i, Object obj, Object obj2);

    public abstract void d(B b, int i, ByteString byteString);

    public abstract void e(int i, long j, Object obj);

    public abstract UnknownFieldSetLite f(Object obj);

    public abstract UnknownFieldSetLite g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract UnknownFieldSetLite k(Object obj, Object obj2);

    public final boolean l(B b, t tVar, int i) throws IOException {
        d dVar = (d) tVar;
        int c = dVar.c();
        int tagFieldNumber = WireFormat.getTagFieldNumber(c);
        int tagWireType = WireFormat.getTagWireType(c);
        if (tagWireType == 0) {
            e(tagFieldNumber, dVar.A(), b);
            return true;
        }
        if (tagWireType == 1) {
            b(tagFieldNumber, dVar.s(), b);
            return true;
        }
        if (tagWireType == 2) {
            d(b, tagFieldNumber, dVar.j());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            a(tagFieldNumber, dVar.q(), b);
            return true;
        }
        UnknownFieldSetLite m = m();
        int makeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i2 = i + 1;
        if (i2 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        while (dVar.b() != Integer.MAX_VALUE && l(m, dVar, i2)) {
        }
        if (makeTag != dVar.c()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        c(tagFieldNumber, b, p(m));
        return true;
    }

    public abstract UnknownFieldSetLite m();

    public abstract void n(Object obj, B b);

    public abstract void o(Object obj, T t);

    public abstract UnknownFieldSetLite p(Object obj);

    public abstract void q(T t, Writer writer) throws IOException;

    public abstract void r(T t, Writer writer) throws IOException;
}
