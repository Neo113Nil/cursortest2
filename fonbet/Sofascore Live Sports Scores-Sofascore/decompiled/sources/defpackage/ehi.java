package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ehi extends fcp implements mfa {
    public final yea o;
    public final eml p;
    public final n4 q;
    public final p5c r;
    public int s;
    public kn3 t;
    public final gfa u;
    public final rfa v;

    public ehi(yea yeaVar, eml emlVar, n4 n4Var, SerialDescriptor serialDescriptor, kn3 kn3Var) {
        serialDescriptor.getClass();
        this.o = yeaVar;
        this.p = emlVar;
        this.q = n4Var;
        this.r = yeaVar.b;
        this.s = -1;
        this.t = kn3Var;
        gfa gfaVar = yeaVar.a;
        this.u = gfaVar;
        this.v = gfaVar.f ? null : new rfa(serialDescriptor);
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final boolean C() {
        rfa rfaVar = this.v;
        return ((rfaVar != null ? rfaVar.b : false) || this.q.D(true)) ? false : true;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final byte E() {
        n4 n4Var = this.q;
        long k = n4Var.k();
        byte b = (byte) k;
        if (k == b) {
            return b;
        }
        n4.s(n4Var, "Failed to parse byte for input '" + k + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.uf3
    public final p5c a() {
        return this.r;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final uf3 b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        yea yeaVar = this.o;
        eml x = oea.x(yeaVar, serialDescriptor);
        n4 n4Var = this.q;
        mbd mbdVar = (mbd) n4Var.e;
        int i = mbdVar.b + 1;
        mbdVar.b = i;
        if (i == ((Object[]) mbdVar.d).length) {
            mbdVar.e();
        }
        ((Object[]) mbdVar.d)[i] = serialDescriptor;
        n4Var.j(x.a);
        if (n4Var.x() != 4) {
            int ordinal = x.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new ehi(yeaVar, x, n4Var, serialDescriptor, this.t) : (this.p == x && yeaVar.a.f) ? this : new ehi(yeaVar, x, n4Var, serialDescriptor, this.t);
        }
        n4.s(n4Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.fcp, defpackage.uf3
    public final void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor.d() == 0 && hz8.N(this.o, serialDescriptor)) {
            while (o(serialDescriptor) != -1) {
            }
        }
        n4 n4Var = this.q;
        if (n4Var.C()) {
            yfa.r(n4Var, "");
            throw null;
        }
        n4Var.j(this.p.b);
        mbd mbdVar = (mbd) n4Var.e;
        int i = mbdVar.b;
        int[] iArr = (int[]) mbdVar.e;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            mbdVar.b = i;
        }
        if (i != -1) {
            mbdVar.b = i - 1;
        }
    }

    @Override // defpackage.mfa
    public final yea d() {
        return this.o;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final int f(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return hz8.M(serialDescriptor, this.o, z(), " at path ".concat(((mbd) this.q.e).d()));
    }

    @Override // defpackage.mfa
    public final b j() {
        return new pp4(this.o.a, this.q).k();
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final int k() {
        n4 n4Var = this.q;
        long k = n4Var.k();
        int i = (int) k;
        if (k == i) {
            return i;
        }
        n4.s(n4Var, "Failed to parse int for input '" + k + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final long m() {
        return this.q.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0124, code lost:
    
        r0 = r15.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0128, code lost:
    
        if (r11 >= 64) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x012a, code lost:
    
        r0.a |= 1 << r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0133, code lost:
    
        r1 = (r11 >>> 6) - 1;
        r0 = (long[]) r0.d;
        r0[r1] = r0[r1] | (1 << (r11 & 63));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0163, code lost:
    
        r0 = r3.b;
        r1 = (int[]) r3.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016c, code lost:
    
        if (r1[r0] != (-2)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016e, code lost:
    
        r1[r0] = r19;
        r0 = r0 - 1;
        r3.b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0176, code lost:
    
        if (r0 == r19) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0178, code lost:
    
        r3.b = r0 + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017b, code lost:
    
        r2.r(kotlin.text.StringsKt.T(r7, r2.B(0, r2.b), 6), defpackage.dmi.j('\'', "Encountered an unknown key '", r7), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uf3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o(SerialDescriptor serialDescriptor) {
        byte b;
        byte b2;
        char c;
        String y;
        n4 n4Var = this.q;
        mbd mbdVar = (mbd) n4Var.e;
        serialDescriptor.getClass();
        eml emlVar = this.p;
        int ordinal = emlVar.ordinal();
        char c2 = ':';
        int i = 0;
        r9 = false;
        boolean z = false;
        boolean z2 = true;
        int i2 = -1;
        if (ordinal == 0) {
            boolean C = n4Var.C();
            while (true) {
                boolean e = n4Var.e();
                rfa rfaVar = this.v;
                if (e) {
                    gfa gfaVar = this.u;
                    boolean z3 = gfaVar.c;
                    String o = z3 ? n4Var.o() : n4Var.g();
                    n4Var.j(c2);
                    yea yeaVar = this.o;
                    int i3 = i2;
                    i2 = hz8.L(serialDescriptor, yeaVar, o);
                    if (i2 == -3) {
                        b = z2;
                        C = false;
                    } else {
                        if (!gfaVar.h) {
                            break;
                        }
                        boolean i4 = serialDescriptor.i(i2);
                        SerialDescriptor g = serialDescriptor.g(i2);
                        if (!i4 || g.b() || !n4Var.D(z2)) {
                            b = z2;
                            if (!Intrinsics.c(g.getKind(), p5h.f) || ((g.b() && n4Var.D(false)) || (y = n4Var.y(z3)) == null)) {
                                break;
                            }
                            int L = hz8.L(g, yeaVar, y);
                            byte b3 = (yeaVar.a.f || !g.b()) ? (byte) 0 : b;
                            if (L != -3 || (!i4 && b3 == 0)) {
                                break;
                            }
                            n4Var.l();
                        } else {
                            b = z2;
                        }
                        C = n4Var.C();
                        z2 = false;
                    }
                    if (z2) {
                        if (!hz8.N(yeaVar, serialDescriptor)) {
                            kn3 kn3Var = this.t;
                            if (kn3Var == null || !Intrinsics.c(kn3Var.a, o)) {
                                break;
                            }
                            kn3Var.a = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte x = n4Var.x();
                        if (x == 8 || x == 6) {
                            while (true) {
                                byte x2 = n4Var.x();
                                b2 = b;
                                if (x2 != b2) {
                                    c = 6;
                                    if (x2 == 8 || x2 == 6) {
                                        arrayList.add(Byte.valueOf(x2));
                                    } else if (x2 == 9) {
                                        if (((Number) CollectionsKt.h0(arrayList)).byteValue() != 8) {
                                            n4.s(n4Var, "found ] instead of }", 0, null, 6);
                                            throw null;
                                        }
                                        o13.D(arrayList);
                                    } else if (x2 == 7) {
                                        if (((Number) CollectionsKt.h0(arrayList)).byteValue() != 6) {
                                            n4.s(n4Var, "found } instead of ]", 0, null, 6);
                                            throw null;
                                        }
                                        o13.D(arrayList);
                                    } else if (x2 == 10) {
                                        n4.s(n4Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    n4Var.h();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z3) {
                                    n4Var.n();
                                } else {
                                    n4Var.g();
                                }
                                b = b2;
                            }
                        } else {
                            n4Var.n();
                            b2 = b;
                            c = 6;
                        }
                        C = n4Var.C();
                        z2 = b2;
                        i2 = i3;
                        c2 = ':';
                    } else {
                        i2 = i3;
                        z2 = b;
                        c2 = ':';
                    }
                } else {
                    int i5 = i2;
                    if (C) {
                        yfa.r(n4Var, "object");
                        throw null;
                    }
                    if (rfaVar != null) {
                        wi5 wi5Var = rfaVar.a;
                        p1 p1Var = (p1) wi5Var.c;
                        SerialDescriptor serialDescriptor2 = (SerialDescriptor) wi5Var.b;
                        int d = serialDescriptor2.d();
                        while (true) {
                            long j = wi5Var.a;
                            if (j != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                wi5Var.a |= 1 << numberOfTrailingZeros;
                                if (((Boolean) p1Var.invoke(serialDescriptor2, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i2 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (d > 64) {
                                long[] jArr = (long[]) wi5Var.d;
                                int length = jArr.length;
                                loop3: while (i < length) {
                                    int i6 = i + 1;
                                    int i7 = i6 * 64;
                                    long j2 = jArr[i];
                                    while (j2 != -1) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                                        j2 |= 1 << numberOfTrailingZeros2;
                                        int i8 = numberOfTrailingZeros2 + i7;
                                        if (((Boolean) p1Var.invoke(serialDescriptor2, Integer.valueOf(i8))).booleanValue()) {
                                            jArr[i] = j2;
                                            i2 = i8;
                                            break loop3;
                                        }
                                    }
                                    jArr[i] = j2;
                                    i = i6;
                                }
                            }
                        }
                    }
                    i2 = i5;
                }
            }
        } else if (ordinal != 2) {
            boolean C2 = n4Var.C();
            if (n4Var.e()) {
                int i9 = this.s;
                if (i9 != -1 && !C2) {
                    n4.s(n4Var, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i9 + 1;
                this.s = i2;
            } else if (C2) {
                yfa.r(n4Var, "array");
                throw null;
            }
        } else {
            int i10 = this.s;
            Object[] objArr = i10 % 2 != 0;
            if (objArr != true) {
                n4Var.j(':');
            } else if (i10 != -1) {
                z = n4Var.C();
            }
            if (n4Var.e()) {
                if (objArr != false) {
                    int i11 = this.s;
                    int i12 = n4Var.b;
                    if (i11 == -1) {
                        if (z) {
                            n4.s(n4Var, "Unexpected leading comma", i12, null, 4);
                            throw null;
                        }
                    } else if (!z) {
                        n4.s(n4Var, "Expected comma after the key-value pair", i12, null, 4);
                        throw null;
                    }
                }
                i2 = this.s + 1;
                this.s = i2;
            } else if (z) {
                yfa.r(n4Var, "object");
                throw null;
            }
        }
        if (emlVar != eml.e) {
            ((int[]) mbdVar.e)[mbdVar.b] = i2;
        }
        return i2;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final Decoder p(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return ghi.a(serialDescriptor) ? new nfa(this.q, this.o) : this;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final short q() {
        n4 n4Var = this.q;
        long k = n4Var.k();
        short s = (short) k;
        if (k == s) {
            return s;
        }
        n4.s(n4Var, "Failed to parse short for input '" + k + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final float r() {
        n4 n4Var = this.q;
        String n = n4Var.n();
        try {
            float parseFloat = Float.parseFloat(n);
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            n4.s(n4Var, yfa.x(Float.valueOf(parseFloat), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            n4.s(n4Var, dmi.j('\'', "Failed to parse type 'float' for input '", n), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final double t() {
        n4 n4Var = this.q;
        String n = n4Var.n();
        try {
            double parseDouble = Double.parseDouble(n);
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            n4.s(n4Var, yfa.x(Double.valueOf(parseDouble), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            n4.s(n4Var, dmi.j('\'', "Failed to parse type 'double' for input '", n), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final boolean u() {
        boolean z;
        boolean z2;
        n4 n4Var = this.q;
        int A = n4Var.A();
        if (A == n4Var.u().length()) {
            n4.s(n4Var, "EOF", 0, null, 6);
            throw null;
        }
        if (n4Var.u().charAt(A) == '\"') {
            A++;
            z = true;
        } else {
            z = false;
        }
        int z3 = n4Var.z(A);
        if (z3 >= n4Var.u().length() || z3 == -1) {
            n4.s(n4Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = z3 + 1;
        int charAt = n4Var.u().charAt(z3) | ' ';
        if (charAt == 102) {
            n4Var.f(i, "alse");
            z2 = false;
        } else {
            if (charAt != 116) {
                n4.s(n4Var, "Expected valid boolean literal prefix, but had '" + n4Var.n() + '\'', 0, null, 6);
                throw null;
            }
            n4Var.f(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (n4Var.b == n4Var.u().length()) {
            n4.s(n4Var, "EOF", 0, null, 6);
            throw null;
        }
        if (n4Var.u().charAt(n4Var.b) == '\"') {
            n4Var.b++;
            return z2;
        }
        n4.s(n4Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final char v() {
        n4 n4Var = this.q;
        String n = n4Var.n();
        if (n.length() == 1) {
            return n.charAt(0);
        }
        n4.s(n4Var, dmi.j('\'', "Expected single char, but got '", n), 0, null, 6);
        throw null;
    }

    @Override // defpackage.fcp, defpackage.uf3
    public final Object w(SerialDescriptor serialDescriptor, int i, dy4 dy4Var, Object obj) {
        mbd mbdVar = (mbd) this.q.e;
        serialDescriptor.getClass();
        dy4Var.getClass();
        boolean z = this.p == eml.e && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) mbdVar.e;
            int i2 = mbdVar.b;
            if (iArr[i2] == -2) {
                ((Object[]) mbdVar.d)[i2] = uxf.t;
            }
        }
        Object y = y(dy4Var);
        if (z) {
            int[] iArr2 = (int[]) mbdVar.e;
            int i3 = mbdVar.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                mbdVar.b = i4;
                if (i4 == ((Object[]) mbdVar.d).length) {
                    mbdVar.e();
                }
            }
            Object[] objArr = (Object[]) mbdVar.d;
            int i5 = mbdVar.b;
            objArr[i5] = ((gfa) mbdVar.c).l ? y : zic.d;
            ((int[]) mbdVar.e)[i5] = -2;
        }
        return y;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(dy4 dy4Var) {
        String message;
        String str;
        yea yeaVar = this.o;
        n4 n4Var = this.q;
        mbd mbdVar = (mbd) n4Var.e;
        dy4Var.getClass();
        try {
        } catch (rkc e) {
            message = e.getMessage();
            message.getClass();
            if (!StringsKt.J(message, "at path", false)) {
            }
        }
        if (!(dy4Var instanceof e7)) {
            return dy4Var.deserialize(this);
        }
        String D = aik.D(yeaVar, ((e7) dy4Var).getDescriptor());
        String w = n4Var.w(D, this.u.c);
        if (w != null) {
            try {
                dy4 m = mha.m((e7) dy4Var, this, w);
                kn3 kn3Var = new kn3();
                kn3Var.a = D;
                this.t = kn3Var;
                return m.deserialize(this);
            } catch (v5h e2) {
                String message2 = e2.getMessage();
                message2.getClass();
                String W = StringsKt.W(StringsKt.g0(message2, '\n'), ".");
                String message3 = e2.getMessage();
                message3.getClass();
                String str2 = "";
                int O = StringsKt.O(message3, '\n', 0, 6);
                if (O != -1) {
                    str2 = message3.substring(O + 1, message3.length());
                }
                n4.s(n4Var, W, 0, str2, 2);
                throw null;
            }
        }
        String D2 = aik.D(yeaVar, ((e7) dy4Var).getDescriptor());
        b j = j();
        String h = ((e7) dy4Var).getDescriptor().h();
        if (!(j instanceof c)) {
            StringBuilder sb = new StringBuilder("Expected ");
            fuf fufVar = duf.a;
            sb.append(fufVar.getOrCreateKotlinClass(c.class).getSimpleName());
            sb.append(", but had ");
            sb.append(fufVar.getOrCreateKotlinClass(j.getClass()).getSimpleName());
            sb.append(" as the serialized body of ");
            sb.append(h);
            throw new ofa(yfa.m(-1, sb.toString(), mbdVar.d(), null, yeaVar.a.l ? yfa.u(j.toString(), -1).toString() : null));
        }
        c cVar = (c) j;
        b bVar = (b) cVar.get(D2);
        try {
            if (bVar != null) {
                d h2 = qfa.h(bVar);
                if (!(h2 instanceof JsonNull)) {
                    str = h2.c();
                    return wca.E(yeaVar, D2, cVar, mha.m((e7) dy4Var, this, str));
                }
            }
            return wca.E(yeaVar, D2, cVar, mha.m((e7) dy4Var, this, str));
        } catch (v5h e3) {
            String message4 = e3.getMessage();
            message4.getClass();
            throw new ofa(yfa.m(-1, message4, null, null, yeaVar.a.l ? yfa.u(cVar.toString(), -1).toString() : null));
        }
        str = null;
        message = e.getMessage();
        message.getClass();
        if (!StringsKt.J(message, "at path", false)) {
            throw e;
        }
        throw new rkc(e.getMessage() + " at path: " + mbdVar.d(), e, e.a, e.b);
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final String z() {
        boolean z = this.u.c;
        n4 n4Var = this.q;
        return z ? n4Var.o() : n4Var.l();
    }
}
