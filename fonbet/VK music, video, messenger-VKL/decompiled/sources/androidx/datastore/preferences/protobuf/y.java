package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.m;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import xsna.la20;
import xsna.m8h0;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes12.dex */
public final class y<T> implements m8h0<T> {
    public final la20 a;
    public final e0<?, ?> b;
    public final boolean c;
    public final k<?> d;

    public y(e0<?, ?> e0Var, k<?> kVar, la20 la20Var) {
        this.b = e0Var;
        this.c = kVar.e(la20Var);
        this.d = kVar;
        this.a = la20Var;
    }

    public static <T> y<T> j(e0<?, ?> e0Var, k<?> kVar, la20 la20Var) {
        return new y<>(e0Var, kVar, la20Var);
    }

    @Override // xsna.m8h0
    public final void a(T t, T t2) {
        Class<?> cls = b0.a;
        e0<?, ?> e0Var = this.b;
        e0Var.o(t, e0Var.k(e0Var.g(t), e0Var.g(t2)));
        if (this.c) {
            b0.k(this.d, t, t2);
        }
    }

    @Override // xsna.m8h0
    public final T b() {
        la20 la20Var = this.a;
        return la20Var instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) la20Var).l() : (T) la20Var.newBuilderForType().i();
    }

    @Override // xsna.m8h0
    public final boolean c(T t) {
        this.d.c(t).e();
        return true;
    }

    @Override // xsna.m8h0
    public final void d(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // xsna.m8h0
    public final int e(a aVar) {
        e0<?, ?> e0Var = this.b;
        int i = e0Var.i(e0Var.g(aVar));
        if (this.c) {
            c0 c0Var = this.d.c(aVar).a;
            if (c0Var.b.size() > 0) {
                m.d(c0Var.c(0));
                throw null;
            }
            Iterator<T> it = c0Var.d().iterator();
            if (it.hasNext()) {
                m.d((Map.Entry) it.next());
                throw null;
            }
        }
        return i;
    }

    @Override // xsna.m8h0
    public final void f(Object obj, g gVar, j jVar) throws IOException {
        e0<?, ?> e0Var = this.b;
        f0 f = e0Var.f(obj);
        k<?> kVar = this.d;
        m<?> d = kVar.d(obj);
        while (gVar.a() != Integer.MAX_VALUE) {
            try {
                g gVar2 = gVar;
                j jVar2 = jVar;
                if (!k(gVar2, jVar2, kVar, d, e0Var, f)) {
                    return;
                }
                gVar = gVar2;
                jVar = jVar2;
            } finally {
                e0Var.n(obj, f);
            }
        }
    }

    @Override // xsna.m8h0
    public final boolean g(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        e0<?, ?> e0Var = this.b;
        if (!e0Var.g(generatedMessageLite).equals(e0Var.g(generatedMessageLite2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        k<?> kVar = this.d;
        return kVar.c(generatedMessageLite).equals(kVar.c(generatedMessageLite2));
    }

    @Override // xsna.m8h0
    public final void h(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> g = this.d.c(t).g();
        if (g.hasNext()) {
            ((m.b) g.next().getKey()).getLiteJavaType();
            throw null;
        }
        e0<?, ?> e0Var = this.b;
        e0Var.q(e0Var.g(t), writer);
    }

    @Override // xsna.m8h0
    public final int i(GeneratedMessageLite generatedMessageLite) {
        int hashCode = this.b.g(generatedMessageLite).hashCode();
        if (!this.c) {
            return hashCode;
        }
        return this.d.c(generatedMessageLite).a.hashCode() + (hashCode * 53);
    }

    public final boolean k(g gVar, j jVar, k kVar, m mVar, e0 e0Var, Object obj) throws IOException {
        int i = gVar.b;
        la20 la20Var = this.a;
        if (i != 11) {
            if ((i & 7) != 2) {
                return gVar.x();
            }
            GeneratedMessageLite.e b = kVar.b(jVar, la20Var, i >>> 3);
            if (b == null) {
                return e0Var.l(obj, gVar, 0);
            }
            kVar.h(b);
            throw null;
        }
        GeneratedMessageLite.e eVar = null;
        ByteString byteString = null;
        int i2 = 0;
        while (gVar.a() != Integer.MAX_VALUE) {
            int i3 = gVar.b;
            if (i3 == 16) {
                gVar.w(0);
                i2 = gVar.a.w();
                eVar = kVar.b(jVar, la20Var, i2);
            } else if (i3 == 26) {
                if (eVar != null) {
                    kVar.h(eVar);
                    throw null;
                }
                byteString = gVar.e();
            } else if (!gVar.x()) {
                break;
            }
        }
        if (gVar.b != 12) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (byteString == null) {
            return true;
        }
        if (eVar == null) {
            e0Var.d(obj, i2, byteString);
            return true;
        }
        kVar.i(eVar);
        throw null;
    }
}
