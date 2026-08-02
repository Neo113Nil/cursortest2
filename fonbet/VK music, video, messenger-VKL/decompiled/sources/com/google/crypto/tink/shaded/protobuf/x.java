package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.d;
import com.google.crypto.tink.shaded.protobuf.n;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import xsna.ka20;
import xsna.t8e0;
import xsna.v7f0;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes13.dex */
public final class x<T> implements a0<T> {
    public final ka20 a;
    public final e0<?, ?> b;
    public final boolean c;
    public final l<?> d;

    public x(e0<?, ?> e0Var, l<?> lVar, ka20 ka20Var) {
        this.b = e0Var;
        this.c = lVar.e(ka20Var);
        this.d = lVar;
        this.a = ka20Var;
    }

    public static <T> x<T> k(e0<?, ?> e0Var, l<?> lVar, ka20 ka20Var) {
        return new x<>(e0Var, lVar, ka20Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final int a(GeneratedMessageLite generatedMessageLite) {
        int hashCode = this.b.g(generatedMessageLite).hashCode();
        if (!this.c) {
            return hashCode;
        }
        return this.d.c(generatedMessageLite).a.hashCode() + (hashCode * 53);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final T b() {
        return (T) this.a.e().k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final boolean c(T t) {
        this.d.c(t).g();
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void d(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void e(T t, v7f0 v7f0Var, k kVar) throws IOException {
        e0 e0Var = this.b;
        f0 f = e0Var.f(t);
        l lVar = this.d;
        n<ET> d = lVar.d(t);
        while (v7f0Var.z() != Integer.MAX_VALUE) {
            try {
                v7f0 v7f0Var2 = v7f0Var;
                k kVar2 = kVar;
                if (!l(v7f0Var2, kVar2, lVar, d, e0Var, f)) {
                    return;
                }
                v7f0Var = v7f0Var2;
                kVar = kVar2;
            } finally {
                e0Var.n(t, f);
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void f(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        Class<?> cls = b0.a;
        e0<?, ?> e0Var = this.b;
        e0Var.o(generatedMessageLite, e0Var.k(e0Var.g(generatedMessageLite), e0Var.g(generatedMessageLite2)));
        if (this.c) {
            l<?> lVar = this.d;
            n<?> c = lVar.c(generatedMessageLite2);
            if (c.f()) {
                return;
            }
            lVar.d(generatedMessageLite).j(c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[EDGE_INSN: B:40:0x0097->B:41:0x0097 BREAK  A[LOOP:1: B:22:0x0055->B:32:0x0077], SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(T t, byte[] bArr, int i, int i2, d.a aVar) throws IOException {
        Throwable th;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        f0 f0Var = generatedMessageLite.unknownFields;
        if (f0Var == f0.f) {
            f0Var = new f0();
            generatedMessageLite.unknownFields = f0Var;
        }
        f0 f0Var2 = f0Var;
        ((GeneratedMessageLite.c) t).p();
        Throwable th2 = null;
        int i3 = i;
        GeneratedMessageLite.e eVar = null;
        while (i3 < i2) {
            GeneratedMessageLite.e eVar2 = eVar;
            int k = d.k(bArr, i3, aVar);
            int i4 = aVar.a;
            k kVar = aVar.d;
            ka20 ka20Var = this.a;
            l<?> lVar = this.d;
            int i5 = 2;
            if (i4 == 11) {
                int i6 = 0;
                Object obj = th2;
                while (true) {
                    if (k >= i2) {
                        th = th2;
                        break;
                    }
                    k = d.k(bArr, k, aVar);
                    int i7 = aVar.a;
                    int i8 = i7 >>> 3;
                    th = th2;
                    int i9 = i7 & 7;
                    if (i8 != i5) {
                        if (i8 == 3) {
                            if (eVar2 != null) {
                                t8e0 t8e0Var = t8e0.c;
                                throw th;
                            }
                            if (i9 == 2) {
                                k = d.a(bArr, k, aVar);
                                obj = (ByteString) aVar.c;
                                th2 = th;
                                i5 = 2;
                            }
                        }
                        if (i7 != 12) {
                            break;
                        }
                        k = d.n(i7, bArr, k, i2, aVar);
                        th2 = th;
                        i5 = 2;
                    } else {
                        if (i9 == 0) {
                            k = d.k(bArr, k, aVar);
                            i6 = aVar.a;
                            eVar2 = lVar.b(kVar, ka20Var, i6);
                            th2 = th;
                            i5 = 2;
                        }
                        if (i7 != 12) {
                        }
                    }
                }
                if (obj != null) {
                    f0Var2.b((i6 << 3) | 2, obj);
                }
                th2 = th;
                i3 = k;
            } else if ((i4 & 7) == 2) {
                eVar2 = lVar.b(kVar, ka20Var, i4 >>> 3);
                if (eVar2 != null) {
                    t8e0 t8e0Var2 = t8e0.c;
                    throw th2;
                }
                i3 = d.i(i4, bArr, k, i2, f0Var2, aVar);
            } else {
                i3 = d.n(i4, bArr, k, i2, aVar);
            }
            eVar = eVar2;
        }
        if (i3 != i2) {
            throw InvalidProtocolBufferException.j();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final boolean h(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        e0<?, ?> e0Var = this.b;
        if (!e0Var.g(generatedMessageLite).equals(e0Var.g(generatedMessageLite2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        l<?> lVar = this.d;
        return lVar.c(generatedMessageLite).equals(lVar.c(generatedMessageLite2));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final int i(a aVar) {
        e0<?, ?> e0Var = this.b;
        int i = e0Var.i(e0Var.g(aVar));
        if (this.c) {
            c0 c0Var = this.d.c(aVar).a;
            if (c0Var.c.size() > 0) {
                n.d(c0Var.c(0));
                throw null;
            }
            Iterator<Map.Entry<Object, Object>> it = c0Var.d().iterator();
            if (it.hasNext()) {
                n.d(it.next());
                throw null;
            }
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void j(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> i = this.d.c(t).i();
        if (i.hasNext()) {
            ((n.b) i.next().getKey()).getLiteJavaType();
            throw null;
        }
        e0<?, ?> e0Var = this.b;
        e0Var.q(e0Var.g(t), writer);
    }

    public final <UT, UB, ET extends n.b<ET>> boolean l(v7f0 v7f0Var, k kVar, l<ET> lVar, n<ET> nVar, e0<UT, UB> e0Var, UB ub) throws IOException {
        int tag = v7f0Var.getTag();
        ka20 ka20Var = this.a;
        if (tag != 11) {
            if ((tag & 7) != 2) {
                return v7f0Var.i();
            }
            GeneratedMessageLite.e b = lVar.b(kVar, ka20Var, tag >>> 3);
            if (b == null) {
                return e0Var.l(ub, v7f0Var);
            }
            lVar.h(b);
            throw null;
        }
        int i = 0;
        GeneratedMessageLite.e eVar = null;
        ByteString byteString = null;
        while (v7f0Var.z() != Integer.MAX_VALUE) {
            int tag2 = v7f0Var.getTag();
            if (tag2 == 16) {
                i = v7f0Var.a();
                eVar = lVar.b(kVar, ka20Var, i);
            } else if (tag2 == 26) {
                if (eVar != null) {
                    lVar.h(eVar);
                    throw null;
                }
                byteString = v7f0Var.v();
            } else if (!v7f0Var.i()) {
                break;
            }
        }
        if (v7f0Var.getTag() != 12) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (byteString == null) {
            return true;
        }
        if (eVar == null) {
            e0Var.d(ub, i, byteString);
            return true;
        }
        lVar.i(eVar);
        throw null;
    }
}
