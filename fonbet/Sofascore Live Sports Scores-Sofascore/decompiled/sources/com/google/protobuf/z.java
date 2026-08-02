package com.google.protobuf;

import defpackage.hml;
import defpackage.vsg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z implements hml {
    public final CodedOutputStream a;

    public z(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.a = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public final void a(int i, ByteString byteString) {
        this.a.writeBytes(i, byteString);
    }

    public final void b(int i, int i2) {
        this.a.writeFixed32(i, i2);
    }

    public final void c(int i, long j) {
        this.a.writeFixed64(i, j);
    }

    public final void d(int i, Object obj, vsg vsgVar) {
        this.a.writeGroup(i, (MessageLite) obj, vsgVar);
    }

    public final void e(int i, int i2) {
        this.a.writeInt32(i, i2);
    }

    public final void f(int i, long j) {
        this.a.writeInt64(i, j);
    }

    public final void g(int i, Object obj, vsg vsgVar) {
        this.a.writeMessage(i, (MessageLite) obj, vsgVar);
    }

    public final void h(int i, Object obj) {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.a;
        if (z) {
            codedOutputStream.writeRawMessageSetExtension(i, (ByteString) obj);
        } else {
            codedOutputStream.writeMessageSetExtension(i, (MessageLite) obj);
        }
    }
}
