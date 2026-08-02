package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C5913t.b;
import com.google.crypto.tink.shaded.protobuf.C5919z;
import com.google.crypto.tink.shaded.protobuf.i0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5913t<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final C5913t<?> f59463d = new C5913t<>(0);

    /* renamed from: a, reason: collision with root package name */
    private final h0 f59464a = i0.s();

    /* renamed from: b, reason: collision with root package name */
    private boolean f59465b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f59466c;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59467a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f59468b;

        static {
            int[] iArr = new int[r0.values().length];
            f59468b = iArr;
            try {
                iArr[r0.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59468b[r0.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59468b[r0.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59468b[r0.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59468b[r0.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59468b[r0.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59468b[r0.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f59468b[r0.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f59468b[r0.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f59468b[r0.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f59468b[r0.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f59468b[r0.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f59468b[r0.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f59468b[r0.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f59468b[r0.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f59468b[r0.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f59468b[r0.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f59468b[r0.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[s0.values().length];
            f59467a = iArr2;
            try {
                iArr2[s0.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f59467a[s0.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f59467a[s0.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f59467a[s0.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f59467a[s0.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f59467a[s0.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f59467a[s0.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f59467a[s0.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f59467a[s0.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        s0 getLiteJavaType();
    }

    private C5913t() {
    }

    public static int b(b<?> bVar, Object obj) {
        int serializedSize;
        int j11;
        bVar.getClass();
        Enum r32 = null;
        int i11 = AbstractC5906l.i(0);
        if (r0.GROUP == null) {
            i11 *= 2;
        }
        int i12 = 4;
        switch (a.f59468b[r32.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                int i13 = AbstractC5906l.f59429d;
                i12 = 8;
                return i11 + i12;
            case 2:
                ((Float) obj).getClass();
                int i14 = AbstractC5906l.f59429d;
                return i11 + i12;
            case 3:
                i12 = AbstractC5906l.k(((Long) obj).longValue());
                return i11 + i12;
            case 4:
                i12 = AbstractC5906l.k(((Long) obj).longValue());
                return i11 + i12;
            case 5:
                i12 = AbstractC5906l.k(((Integer) obj).intValue());
                return i11 + i12;
            case 6:
                ((Long) obj).getClass();
                int i15 = AbstractC5906l.f59429d;
                i12 = 8;
                return i11 + i12;
            case 7:
                ((Integer) obj).getClass();
                int i16 = AbstractC5906l.f59429d;
                return i11 + i12;
            case 8:
                ((Boolean) obj).getClass();
                int i17 = AbstractC5906l.f59429d;
                i12 = 1;
                return i11 + i12;
            case 9:
                i12 = ((S) obj).getSerializedSize();
                return i11 + i12;
            case 10:
                if (obj instanceof C) {
                    i12 = AbstractC5906l.e((C) obj);
                    return i11 + i12;
                }
                int i18 = AbstractC5906l.f59429d;
                serializedSize = ((S) obj).getSerializedSize();
                j11 = AbstractC5906l.j(serializedSize);
                i12 = j11 + serializedSize;
                return i11 + i12;
            case 11:
                i12 = obj instanceof AbstractC5903i ? AbstractC5906l.d((AbstractC5903i) obj) : AbstractC5906l.h((String) obj);
                return i11 + i12;
            case 12:
                if (obj instanceof AbstractC5903i) {
                    i12 = AbstractC5906l.d((AbstractC5903i) obj);
                    return i11 + i12;
                }
                int i19 = AbstractC5906l.f59429d;
                serializedSize = ((byte[]) obj).length;
                j11 = AbstractC5906l.j(serializedSize);
                i12 = j11 + serializedSize;
                return i11 + i12;
            case 13:
                i12 = AbstractC5906l.j(((Integer) obj).intValue());
                return i11 + i12;
            case 14:
                ((Integer) obj).getClass();
                int i21 = AbstractC5906l.f59429d;
                return i11 + i12;
            case 15:
                ((Long) obj).getClass();
                int i22 = AbstractC5906l.f59429d;
                i12 = 8;
                return i11 + i12;
            case 16:
                i12 = AbstractC5906l.f(((Integer) obj).intValue());
                return i11 + i12;
            case 17:
                i12 = AbstractC5906l.g(((Long) obj).longValue());
                return i11 + i12;
            case 18:
                i12 = obj instanceof C5919z.a ? AbstractC5906l.k(((C5919z.a) obj).getNumber()) : AbstractC5906l.k(((Integer) obj).intValue());
                return i11 + i12;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends b<T>> C5913t<T> d() {
        return (C5913t<T>) f59463d;
    }

    private static int f(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        entry.getValue();
        bVar.getLiteJavaType();
        throw null;
    }

    private static <T extends b<T>> boolean k(Map.Entry<T, Object> entry) {
        entry.getKey().getLiteJavaType();
        throw null;
    }

    private void o(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        boolean z11 = entry.getValue() instanceof C;
        key.getClass();
        key.getLiteJavaType();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5913t<T> clone() {
        C5913t<T> c5913t = (C5913t<T>) new C5913t();
        h0 h0Var = this.f59464a;
        if (h0Var.n() > 0) {
            i0.c cVar = (i0.c) h0Var.m(0);
            c5913t.p((b) cVar.getKey(), cVar.getValue());
            throw null;
        }
        Iterator it = h0Var.o().iterator();
        if (!it.hasNext()) {
            c5913t.f59466c = this.f59466c;
            return c5913t;
        }
        Map.Entry entry = (Map.Entry) it.next();
        c5913t.p((b) entry.getKey(), entry.getValue());
        throw null;
    }

    final Iterator<Map.Entry<T, Object>> c() {
        h0 h0Var = this.f59464a;
        return h0Var.isEmpty() ? Collections.emptyIterator() : this.f59466c ? new C.b(new i0.b().iterator()) : new i0.b().iterator();
    }

    public final int e() {
        h0 h0Var = this.f59464a;
        if (h0Var.n() > 0) {
            f(h0Var.m(0));
            throw null;
        }
        Iterator it = h0Var.o().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        f((Map.Entry) it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5913t) {
            return this.f59464a.equals(((C5913t) obj).f59464a);
        }
        return false;
    }

    public final int g() {
        h0 h0Var = this.f59464a;
        int n11 = h0Var.n();
        int i11 = 0;
        for (int i12 = 0; i12 < n11; i12++) {
            i0.c cVar = (i0.c) h0Var.m(i12);
            i11 += b((b) cVar.getKey(), cVar.getValue());
        }
        for (Map.Entry entry : h0Var.o()) {
            i11 += b((b) entry.getKey(), entry.getValue());
        }
        return i11;
    }

    final boolean h() {
        return this.f59464a.isEmpty();
    }

    public final int hashCode() {
        return this.f59464a.hashCode();
    }

    public final boolean i() {
        return this.f59465b;
    }

    public final boolean j() {
        h0 h0Var = this.f59464a;
        if (h0Var.n() > 0) {
            k(h0Var.m(0));
            throw null;
        }
        Iterator it = h0Var.o().iterator();
        if (!it.hasNext()) {
            return true;
        }
        k((Map.Entry) it.next());
        throw null;
    }

    public final Iterator<Map.Entry<T, Object>> l() {
        h0 h0Var = this.f59464a;
        return h0Var.isEmpty() ? Collections.emptyIterator() : this.f59466c ? new C.b(((i0.e) h0Var.entrySet()).iterator()) : ((i0.e) h0Var.entrySet()).iterator();
    }

    public final void m() {
        if (this.f59465b) {
            return;
        }
        h0 h0Var = this.f59464a;
        int n11 = h0Var.n();
        for (int i11 = 0; i11 < n11; i11++) {
            Object value = ((i0.c) h0Var.m(i11)).getValue();
            if (value instanceof AbstractC5917x) {
                ((AbstractC5917x) value).s();
            }
        }
        Iterator it = h0Var.o().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC5917x) {
                ((AbstractC5917x) value2).s();
            }
        }
        h0Var.r();
        this.f59465b = true;
    }

    public final void n(C5913t<T> c5913t) {
        h0 h0Var = c5913t.f59464a;
        if (h0Var.n() > 0) {
            o(h0Var.m(0));
            throw null;
        }
        Iterator it = h0Var.o().iterator();
        if (it.hasNext()) {
            o((Map.Entry) it.next());
            throw null;
        }
    }

    public final void p(T t2, Object obj) {
        t2.getClass();
        t2.getClass();
        byte[] bArr = C5919z.f59481b;
        obj.getClass();
        int[] iArr = a.f59467a;
        throw null;
    }

    private C5913t(int i11) {
        m();
        m();
    }
}
