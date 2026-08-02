package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.C5899e;
import com.google.crypto.tink.shaded.protobuf.C5913t;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class W<T> implements f0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final S f59341a;

    /* renamed from: b, reason: collision with root package name */
    private final m0<?, ?> f59342b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f59343c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5911q<?> f59344d;

    private W(m0<?, ?> m0Var, AbstractC5911q<?> abstractC5911q, S s11) {
        this.f59342b = m0Var;
        this.f59343c = abstractC5911q.e(s11);
        this.f59344d = abstractC5911q;
        this.f59341a = s11;
    }

    static <T> W<T> g(m0<?, ?> m0Var, AbstractC5911q<?> abstractC5911q, S s11) {
        return new W<>(m0Var, abstractC5911q, s11);
    }

    private boolean h(C5905k c5905k, C5910p c5910p, AbstractC5911q abstractC5911q, C5913t c5913t, m0 m0Var, Object obj) throws IOException {
        int c11 = c5905k.c();
        int i11 = 0;
        S s11 = this.f59341a;
        if (c11 != 11) {
            if ((c11 & 7) != 2) {
                return c5905k.T();
            }
            AbstractC5917x.e b11 = abstractC5911q.b(c5910p, s11, c11 >>> 3);
            if (b11 == null) {
                return m0Var.l(0, c5905k, obj);
            }
            abstractC5911q.h(b11);
            throw null;
        }
        AbstractC5917x.e eVar = null;
        AbstractC5903i abstractC5903i = null;
        while (c5905k.b() != Integer.MAX_VALUE) {
            int c12 = c5905k.c();
            if (c12 != 16) {
                if (c12 != 26) {
                    if (c12 == 12 || !c5905k.T()) {
                        break;
                    }
                } else {
                    if (eVar != null) {
                        abstractC5911q.h(eVar);
                        throw null;
                    }
                    abstractC5903i = c5905k.j();
                }
            } else {
                i11 = c5905k.N();
                eVar = abstractC5911q.b(c5910p, s11, i11);
            }
        }
        if (c5905k.c() != 12) {
            throw new A("Protocol message end-group tag did not match expected tag.");
        }
        if (abstractC5903i == null) {
            return true;
        }
        if (eVar == null) {
            m0Var.d(obj, i11, abstractC5903i);
            return true;
        }
        abstractC5911q.i(eVar);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[EDGE_INSN: B:29:0x009a->B:30:0x009a BREAK  A[LOOP:1: B:10:0x0057->B:20:0x0079], SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(T t2, byte[] bArr, int i11, int i12, C5899e.a aVar) throws IOException {
        Throwable th2;
        AbstractC5917x abstractC5917x = (AbstractC5917x) t2;
        n0 n0Var = abstractC5917x.unknownFields;
        if (n0Var == n0.b()) {
            n0Var = n0.h();
            abstractC5917x.unknownFields = n0Var;
        }
        n0 n0Var2 = n0Var;
        ((AbstractC5917x.c) t2).D();
        Throwable th3 = null;
        int i13 = i11;
        AbstractC5917x.e eVar = null;
        while (i13 < i12) {
            AbstractC5917x.e eVar2 = eVar;
            int g10 = C5899e.g(bArr, i13, aVar);
            int i14 = aVar.f59358a;
            S s11 = this.f59341a;
            AbstractC5911q<?> abstractC5911q = this.f59344d;
            int i15 = 2;
            C5910p c5910p = aVar.f59361d;
            if (i14 != 11) {
                if ((i14 & 7) == 2) {
                    eVar2 = abstractC5911q.b(c5910p, s11, i14 >>> 3);
                    if (eVar2 != null) {
                        int i16 = c0.f59349d;
                        throw th3;
                    }
                    i13 = C5899e.e(i14, bArr, g10, i12, n0Var2, aVar);
                } else {
                    i13 = C5899e.l(i14, bArr, g10, i12, aVar);
                }
                eVar = eVar2;
            } else {
                int i17 = 0;
                Object obj = th3;
                while (true) {
                    if (g10 >= i12) {
                        th2 = th3;
                        break;
                    }
                    g10 = C5899e.g(bArr, g10, aVar);
                    int i18 = aVar.f59358a;
                    th2 = th3;
                    int i19 = i18 >>> 3;
                    int i21 = i18 & 7;
                    if (i19 != i15) {
                        if (i19 == 3) {
                            if (eVar2 != null) {
                                int i22 = c0.f59349d;
                                throw th2;
                            }
                            if (i21 == 2) {
                                g10 = C5899e.a(bArr, g10, aVar);
                                obj = (AbstractC5903i) aVar.f59360c;
                                th3 = th2;
                                i15 = 2;
                            }
                        }
                        if (i18 != 12) {
                            break;
                        }
                        g10 = C5899e.l(i18, bArr, g10, i12, aVar);
                        th3 = th2;
                        i15 = 2;
                    } else {
                        if (i21 == 0) {
                            g10 = C5899e.g(bArr, g10, aVar);
                            i17 = aVar.f59358a;
                            eVar2 = abstractC5911q.b(c5910p, s11, i17);
                            th3 = th2;
                            i15 = 2;
                        }
                        if (i18 != 12) {
                        }
                    }
                }
                if (obj != null) {
                    n0Var2.j((i17 << 3) | 2, obj);
                }
                th3 = th2;
                i13 = g10;
                eVar = eVar2;
            }
        }
        if (i13 != i12) {
            throw A.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final void b(Object obj, C5905k c5905k, C5910p c5910p) throws IOException {
        m0<?, ?> m0Var = this.f59342b;
        n0 f7 = m0Var.f(obj);
        AbstractC5911q<?> abstractC5911q = this.f59344d;
        C5913t<?> d11 = abstractC5911q.d(obj);
        while (c5905k.b() != Integer.MAX_VALUE) {
            try {
                C5905k c5905k2 = c5905k;
                C5910p c5910p2 = c5910p;
                if (!h(c5905k2, c5910p2, abstractC5911q, d11, m0Var, f7)) {
                    return;
                }
                c5905k = c5905k2;
                c5910p = c5910p2;
            } finally {
                m0Var.n(obj, f7);
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final boolean c(AbstractC5917x abstractC5917x, AbstractC5917x abstractC5917x2) {
        m0<?, ?> m0Var = this.f59342b;
        if (!m0Var.g(abstractC5917x).equals(m0Var.g(abstractC5917x2))) {
            return false;
        }
        if (!this.f59343c) {
            return true;
        }
        AbstractC5911q<?> abstractC5911q = this.f59344d;
        return abstractC5911q.c(abstractC5917x).equals(abstractC5911q.c(abstractC5917x2));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final int d(AbstractC5917x abstractC5917x) {
        int hashCode = this.f59342b.g(abstractC5917x).hashCode();
        return this.f59343c ? (hashCode * 53) + this.f59344d.c(abstractC5917x).hashCode() : hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final int e(AbstractC5895a abstractC5895a) {
        m0<?, ?> m0Var = this.f59342b;
        int i11 = m0Var.i(m0Var.g(abstractC5895a));
        if (this.f59343c) {
            this.f59344d.c(abstractC5895a).e();
        }
        return i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final void f(T t2, t0 t0Var) throws IOException {
        Iterator<Map.Entry<?, Object>> l11 = this.f59344d.c(t2).l();
        if (l11.hasNext()) {
            ((C5913t.b) l11.next().getKey()).getLiteJavaType();
            throw null;
        }
        m0<?, ?> m0Var = this.f59342b;
        m0Var.q(m0Var.g(t2), t0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final boolean isInitialized(T t2) {
        this.f59344d.c(t2).j();
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final void makeImmutable(T t2) {
        this.f59342b.j(t2);
        this.f59344d.f(t2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final void mergeFrom(T t2, T t11) {
        int i11 = g0.f59373d;
        m0<?, ?> m0Var = this.f59342b;
        m0Var.o(t2, m0Var.k(m0Var.g(t2), m0Var.g(t11)));
        if (this.f59343c) {
            AbstractC5911q<?> abstractC5911q = this.f59344d;
            C5913t<?> c11 = abstractC5911q.c(t11);
            if (c11.h()) {
                return;
            }
            abstractC5911q.d(t2).n(c11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final T newInstance() {
        S s11 = this.f59341a;
        return s11 instanceof AbstractC5917x ? (T) ((AbstractC5917x) s11).w() : (T) s11.newBuilderForType().buildPartial();
    }
}
