package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.d;
import androidx.health.platform.client.proto.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import xsna.ja20;
import xsna.s8e0;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes12.dex */
public final class k0<T> implements w0<T> {
    public final ja20 a;
    public final c1<?, ?> b;
    public final boolean c;
    public final w<?> d;

    public k0(c1<?, ?> c1Var, w<?> wVar, ja20 ja20Var) {
        this.b = c1Var;
        this.c = wVar.e(ja20Var);
        this.d = wVar;
        this.a = ja20Var;
    }

    @Override // androidx.health.platform.client.proto.w0
    public final void a(T t, T t2) {
        Class<?> cls = x0.a;
        c1<?, ?> c1Var = this.b;
        c1Var.j(t, c1Var.h(c1Var.d(t), c1Var.d(t2)));
        if (this.c) {
            x0.k(this.d, t, t2);
        }
    }

    @Override // androidx.health.platform.client.proto.w0
    public final T b() {
        ja20 ja20Var = this.a;
        return ja20Var instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) ja20Var).p() : (T) ja20Var.newBuilderForType().i();
    }

    @Override // androidx.health.platform.client.proto.w0
    public final boolean c(T t) {
        this.d.c(t).e();
        return true;
    }

    @Override // androidx.health.platform.client.proto.w0
    public final void d(T t) {
        this.b.g(t);
        this.d.f(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[EDGE_INSN: B:43:0x00a0->B:44:0x00a0 BREAK  A[LOOP:1: B:25:0x005e->B:35:0x0080], SYNTHETIC] */
    @Override // androidx.health.platform.client.proto.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(T t, byte[] bArr, int i, int i2, d.a aVar) throws IOException {
        Throwable th;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        d1 d1Var = generatedMessageLite.unknownFields;
        if (d1Var == d1.f) {
            d1Var = new d1();
            generatedMessageLite.unknownFields = d1Var;
        }
        d1 d1Var2 = d1Var;
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) t;
        y<GeneratedMessageLite.d> yVar = cVar.extensions;
        if (yVar.b) {
            cVar.extensions = yVar.clone();
        }
        Throwable th2 = null;
        int i3 = i;
        GeneratedMessageLite.e eVar = null;
        while (i3 < i2) {
            GeneratedMessageLite.e eVar2 = eVar;
            int g = d.g(bArr, i3, aVar);
            int i4 = aVar.a;
            v vVar = aVar.d;
            ja20 ja20Var = this.a;
            w<?> wVar = this.d;
            int i5 = 2;
            if (i4 == 11) {
                int i6 = 0;
                Object obj = th2;
                while (true) {
                    if (g >= i2) {
                        th = th2;
                        break;
                    }
                    g = d.g(bArr, g, aVar);
                    int i7 = aVar.a;
                    int i8 = i7 >>> 3;
                    th = th2;
                    int i9 = i7 & 7;
                    if (i8 != i5) {
                        if (i8 == 3) {
                            if (eVar2 != null) {
                                s8e0 s8e0Var = s8e0.c;
                                throw th;
                            }
                            if (i9 == 2) {
                                g = d.a(bArr, g, aVar);
                                obj = (ByteString) aVar.c;
                                th2 = th;
                                i5 = 2;
                            }
                        }
                        if (i7 != 12) {
                            break;
                        }
                        g = d.l(i7, bArr, g, i2, aVar);
                        th2 = th;
                        i5 = 2;
                    } else {
                        if (i9 == 0) {
                            g = d.g(bArr, g, aVar);
                            i6 = aVar.a;
                            eVar2 = wVar.b(vVar, ja20Var, i6);
                            th2 = th;
                            i5 = 2;
                        }
                        if (i7 != 12) {
                        }
                    }
                }
                if (obj != null) {
                    d1Var2.c((i6 << 3) | 2, obj);
                }
                th2 = th;
                i3 = g;
            } else if ((i4 & 7) == 2) {
                eVar2 = wVar.b(vVar, ja20Var, i4 >>> 3);
                if (eVar2 != null) {
                    s8e0 s8e0Var2 = s8e0.c;
                    throw th2;
                }
                i3 = d.e(i4, bArr, g, i2, d1Var2, aVar);
            } else {
                i3 = d.l(i4, bArr, g, i2, aVar);
            }
            eVar = eVar2;
        }
        if (i3 != i2) {
            throw InvalidProtocolBufferException.j();
        }
    }

    @Override // androidx.health.platform.client.proto.w0
    public final int f(GeneratedMessageLite generatedMessageLite) {
        int hashCode = this.b.d(generatedMessageLite).hashCode();
        if (!this.c) {
            return hashCode;
        }
        return this.d.c(generatedMessageLite).a.hashCode() + (hashCode * 53);
    }

    @Override // androidx.health.platform.client.proto.w0
    public final void g(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> g = this.d.c(t).g();
        if (g.hasNext()) {
            ((y.b) g.next().getKey()).getLiteJavaType();
            throw null;
        }
        c1<?, ?> c1Var = this.b;
        c1Var.k(c1Var.d(t), writer);
    }

    @Override // androidx.health.platform.client.proto.w0
    public final int h(a aVar) {
        c1<?, ?> c1Var = this.b;
        int f = c1Var.f(c1Var.d(aVar));
        if (this.c) {
            y0 y0Var = this.d.c(aVar).a;
            if (y0Var.b.size() > 0) {
                y.d(y0Var.c(0));
                throw null;
            }
            Iterator<T> it = y0Var.d().iterator();
            if (it.hasNext()) {
                y.d((Map.Entry) it.next());
                throw null;
            }
        }
        return f;
    }

    @Override // androidx.health.platform.client.proto.w0
    public final boolean i(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        c1<?, ?> c1Var = this.b;
        if (!c1Var.d(generatedMessageLite).equals(c1Var.d(generatedMessageLite2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        w<?> wVar = this.d;
        return wVar.c(generatedMessageLite).equals(wVar.c(generatedMessageLite2));
    }
}
