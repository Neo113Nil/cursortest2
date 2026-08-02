package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes.dex */
public final class g0 extends e0<f0, f0> {
    @Override // androidx.datastore.preferences.protobuf.e0
    public final void a(int i, int i2, Object obj) {
        ((f0) obj).c((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void b(int i, long j, Object obj) {
        ((f0) obj).c((i << 3) | 1, Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void c(int i, Object obj, Object obj2) {
        ((f0) obj).c((i << 3) | 3, (f0) obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void d(f0 f0Var, int i, ByteString byteString) {
        f0Var.c((i << 3) | 2, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void e(int i, long j, Object obj) {
        ((f0) obj).c(i << 3, Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final f0 f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        f0 f0Var = generatedMessageLite.unknownFields;
        if (f0Var != f0.f) {
            return f0Var;
        }
        f0 f0Var2 = new f0();
        generatedMessageLite.unknownFields = f0Var2;
        return f0Var2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final f0 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final int h(f0 f0Var) {
        return f0Var.b();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final int i(f0 f0Var) {
        f0 f0Var2 = f0Var;
        int i = f0Var2.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < f0Var2.a; i3++) {
            int i4 = f0Var2.b[i3] >>> 3;
            i2 += CodedOutputStream.h(3, (ByteString) f0Var2.c[i3]) + CodedOutputStream.o(i4) + CodedOutputStream.n(2) + (CodedOutputStream.n(1) * 2);
        }
        f0Var2.d = i2;
        return i2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void j(Object obj) {
        f0 f0Var = ((GeneratedMessageLite) obj).unknownFields;
        if (f0Var.e) {
            f0Var.e = false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final f0 k(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        f0 f0Var2 = (f0) obj2;
        f0 f0Var3 = f0.f;
        if (f0Var3.equals(f0Var2)) {
            return f0Var;
        }
        if (f0Var3.equals(f0Var)) {
            int i = f0Var.a + f0Var2.a;
            int[] copyOf = Arrays.copyOf(f0Var.b, i);
            System.arraycopy(f0Var2.b, 0, copyOf, f0Var.a, f0Var2.a);
            Object[] copyOf2 = Arrays.copyOf(f0Var.c, i);
            System.arraycopy(f0Var2.c, 0, copyOf2, f0Var.a, f0Var2.a);
            return new f0(i, copyOf, copyOf2, true);
        }
        f0Var.getClass();
        if (f0Var2.equals(f0Var3)) {
            return f0Var;
        }
        if (!f0Var.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = f0Var.a + f0Var2.a;
        f0Var.a(i2);
        System.arraycopy(f0Var2.b, 0, f0Var.b, f0Var.a, f0Var2.a);
        System.arraycopy(f0Var2.c, 0, f0Var.c, f0Var.a, f0Var2.a);
        f0Var.a = i2;
        return f0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final f0 m() {
        return new f0();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void n(Object obj, f0 f0Var) {
        ((GeneratedMessageLite) obj).unknownFields = f0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void o(Object obj, f0 f0Var) {
        ((GeneratedMessageLite) obj).unknownFields = f0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final f0 p(Object obj) {
        f0 f0Var = (f0) obj;
        if (f0Var.e) {
            f0Var.e = false;
        }
        return f0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void q(f0 f0Var, Writer writer) throws IOException {
        f0 f0Var2 = f0Var;
        f0Var2.getClass();
        h hVar = (h) writer;
        hVar.getClass();
        if (Writer.FieldOrder.ASCENDING == Writer.FieldOrder.DESCENDING) {
            for (int i = f0Var2.a - 1; i >= 0; i--) {
                hVar.c(f0Var2.b[i] >>> 3, f0Var2.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < f0Var2.a; i2++) {
            hVar.c(f0Var2.b[i2] >>> 3, f0Var2.c[i2]);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void r(f0 f0Var, Writer writer) throws IOException {
        f0Var.d(writer);
    }
}
