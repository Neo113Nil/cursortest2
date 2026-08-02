package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import xsna.la20;
import xsna.m8h0;

/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes.dex */
public final class h implements Writer {
    public final CodedOutputStream a;

    public h(CodedOutputStream codedOutputStream) {
        p.a(codedOutputStream, "output");
        this.a = codedOutputStream;
        codedOutputStream.c = this;
    }

    public final void a(int i, ByteString byteString) throws IOException {
        this.a.u(i, byteString);
    }

    public final void b(int i, Object obj, m8h0 m8h0Var) throws IOException {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.I(i, 3);
        m8h0Var.h((la20) obj, codedOutputStream.c);
        codedOutputStream.I(i, 4);
    }

    public final void c(int i, Object obj) throws IOException {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.a;
        if (z) {
            codedOutputStream.F(i, (ByteString) obj);
        } else {
            codedOutputStream.E(i, (la20) obj);
        }
    }
}
