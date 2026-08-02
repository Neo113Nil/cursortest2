package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.Writer;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes12.dex */
public final class e1 extends c1<d1, d1> {
    @Override // androidx.health.platform.client.proto.c1
    public final void a(d1 d1Var, int i, ByteString byteString) {
        d1Var.c((i << 3) | 2, byteString);
    }

    @Override // androidx.health.platform.client.proto.c1
    public final void b(int i, long j, Object obj) {
        ((d1) obj).c(i << 3, Long.valueOf(j));
    }

    @Override // androidx.health.platform.client.proto.c1
    public final d1 c(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        d1 d1Var = generatedMessageLite.unknownFields;
        if (d1Var != d1.f) {
            return d1Var;
        }
        d1 d1Var2 = new d1();
        generatedMessageLite.unknownFields = d1Var2;
        return d1Var2;
    }

    @Override // androidx.health.platform.client.proto.c1
    public final d1 d(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.health.platform.client.proto.c1
    public final int e(d1 d1Var) {
        return d1Var.b();
    }

    @Override // androidx.health.platform.client.proto.c1
    public final int f(d1 d1Var) {
        d1 d1Var2 = d1Var;
        int i = d1Var2.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < d1Var2.a; i3++) {
            int i4 = d1Var2.b[i3] >>> 3;
            i2 += CodedOutputStream.s(3, (ByteString) d1Var2.c[i3]) + CodedOutputStream.z(i4) + CodedOutputStream.y(2) + (CodedOutputStream.y(1) * 2);
        }
        d1Var2.d = i2;
        return i2;
    }

    @Override // androidx.health.platform.client.proto.c1
    public final void g(Object obj) {
        d1 d1Var = ((GeneratedMessageLite) obj).unknownFields;
        if (d1Var.e) {
            d1Var.e = false;
        }
    }

    @Override // androidx.health.platform.client.proto.c1
    public final d1 h(Object obj, Object obj2) {
        d1 d1Var = (d1) obj;
        d1 d1Var2 = (d1) obj2;
        d1 d1Var3 = d1.f;
        if (d1Var3.equals(d1Var2)) {
            return d1Var;
        }
        if (d1Var3.equals(d1Var)) {
            int i = d1Var.a + d1Var2.a;
            int[] copyOf = Arrays.copyOf(d1Var.b, i);
            System.arraycopy(d1Var2.b, 0, copyOf, d1Var.a, d1Var2.a);
            Object[] copyOf2 = Arrays.copyOf(d1Var.c, i);
            System.arraycopy(d1Var2.c, 0, copyOf2, d1Var.a, d1Var2.a);
            return new d1(i, copyOf, copyOf2, true);
        }
        d1Var.getClass();
        if (d1Var2.equals(d1Var3)) {
            return d1Var;
        }
        if (!d1Var.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = d1Var.a + d1Var2.a;
        d1Var.a(i2);
        System.arraycopy(d1Var2.b, 0, d1Var.b, d1Var.a, d1Var2.a);
        System.arraycopy(d1Var2.c, 0, d1Var.c, d1Var.a, d1Var2.a);
        d1Var.a = i2;
        return d1Var;
    }

    @Override // androidx.health.platform.client.proto.c1
    public final void i(Object obj, d1 d1Var) {
        ((GeneratedMessageLite) obj).unknownFields = d1Var;
    }

    @Override // androidx.health.platform.client.proto.c1
    public final void j(Object obj, d1 d1Var) {
        ((GeneratedMessageLite) obj).unknownFields = d1Var;
    }

    @Override // androidx.health.platform.client.proto.c1
    public final void k(d1 d1Var, Writer writer) throws IOException {
        d1 d1Var2 = d1Var;
        d1Var2.getClass();
        h hVar = (h) writer;
        hVar.getClass();
        if (Writer.FieldOrder.ASCENDING == Writer.FieldOrder.DESCENDING) {
            for (int i = d1Var2.a - 1; i >= 0; i--) {
                hVar.c(d1Var2.b[i] >>> 3, d1Var2.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < d1Var2.a; i2++) {
            hVar.c(d1Var2.b[i2] >>> 3, d1Var2.c[i2]);
        }
    }

    @Override // androidx.health.platform.client.proto.c1
    public final void l(d1 d1Var, Writer writer) throws IOException {
        d1Var.d(writer);
    }
}
