package androidx.health.platform.client.proto;

import java.io.IOException;
import xsna.ja20;

/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes12.dex */
public final class h implements Writer {
    public final CodedOutputStream a;

    public h(CodedOutputStream codedOutputStream) {
        b0.a(codedOutputStream, "output");
        this.a = codedOutputStream;
        codedOutputStream.a = this;
    }

    public final void a(int i, ByteString byteString) throws IOException {
        this.a.E(i, byteString);
    }

    public final void b(int i, Object obj, w0 w0Var) throws IOException {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.S(i, 3);
        w0Var.g((ja20) obj, codedOutputStream.a);
        codedOutputStream.S(i, 4);
    }

    public final void c(int i, Object obj) throws IOException {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.a;
        if (z) {
            codedOutputStream.P(i, (ByteString) obj);
        } else {
            codedOutputStream.O(i, (ja20) obj);
        }
    }
}
