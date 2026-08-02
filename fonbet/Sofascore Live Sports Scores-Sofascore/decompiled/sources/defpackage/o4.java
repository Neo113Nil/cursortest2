package defpackage;

import com.mbridge.msdk.setting.i;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class o4 implements mfa, Decoder, uf3 {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final yea c;
    public final String d;
    public final gfa e;

    public o4(yea yeaVar, String str) {
        this.c = yeaVar;
        this.d = str;
        this.e = yeaVar.a;
    }

    @Override // defpackage.uf3
    public final byte A(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return I(S(serialDescriptor, i));
    }

    @Override // defpackage.uf3
    public final boolean B(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return H(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean C() {
        return !(G() instanceof JsonNull);
    }

    @Override // defpackage.uf3
    public final double D(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return K(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte E() {
        return I(U());
    }

    public abstract b F(String str);

    public final b G() {
        b F;
        String str = (String) CollectionsKt.j0(this.a);
        return (str == null || (F = F(str)) == null) ? T() : F;
    }

    public final boolean H(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        if (!(F instanceof d)) {
            StringBuilder sb = new StringBuilder("Expected ");
            fuf fufVar = duf.a;
            sb.append(fufVar.getOrCreateKotlinClass(d.class).getSimpleName());
            sb.append(", but had ");
            sb.append(fufVar.getOrCreateKotlinClass(F.getClass()).getSimpleName());
            sb.append(" as the serialized body of boolean");
            throw new ofa(yfa.m(-1, sb.toString(), W(str), null, this.c.a.l ? yfa.u(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            Boolean e = qfa.e(dVar);
            if (e != null) {
                return e.booleanValue();
            }
            X(dVar, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "boolean", str);
            throw null;
        }
    }

    public final byte I(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        if (!(F instanceof d)) {
            StringBuilder sb = new StringBuilder("Expected ");
            fuf fufVar = duf.a;
            sb.append(fufVar.getOrCreateKotlinClass(d.class).getSimpleName());
            sb.append(", but had ");
            sb.append(fufVar.getOrCreateKotlinClass(F.getClass()).getSimpleName());
            sb.append(" as the serialized body of byte");
            throw new ofa(yfa.m(-1, sb.toString(), W(str), null, this.c.a.l ? yfa.u(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            long i = qfa.i(dVar);
            Byte valueOf = (-128 > i || i > 127) ? null : Byte.valueOf((byte) i);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            X(dVar, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "byte", str);
            throw null;
        }
    }

    public final char J(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        if (!(F instanceof d)) {
            StringBuilder sb = new StringBuilder("Expected ");
            fuf fufVar = duf.a;
            sb.append(fufVar.getOrCreateKotlinClass(d.class).getSimpleName());
            sb.append(", but had ");
            sb.append(fufVar.getOrCreateKotlinClass(F.getClass()).getSimpleName());
            sb.append(" as the serialized body of char");
            throw new ofa(yfa.m(-1, sb.toString(), W(str), null, this.c.a.l ? yfa.u(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            String c = dVar.c();
            c.getClass();
            int length = c.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return c.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(dVar, "char", str);
            throw null;
        }
    }

    public final double K(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        boolean z = F instanceof d;
        yea yeaVar = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            fuf fufVar = duf.a;
            sb.append(fufVar.getOrCreateKotlinClass(d.class).getSimpleName());
            sb.append(", but had ");
            sb.append(fufVar.getOrCreateKotlinClass(F.getClass()).getSimpleName());
            sb.append(" as the serialized body of double");
            throw new ofa(yfa.m(-1, sb.toString(), W(str), null, yeaVar.a.l ? yfa.u(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            m3a m3aVar = qfa.a;
            double parseDouble = Double.parseDouble(dVar.c());
            gfa gfaVar = yeaVar.a;
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            throw new ofa(yfa.m(-1, yfa.x(Double.valueOf(parseDouble), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", yeaVar.a.l ? yfa.u(G().toString(), -1).toString() : null));
        } catch (IllegalArgumentException unused) {
            X(dVar, "double", str);
            throw null;
        }
    }

    public final float L(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        boolean z = F instanceof d;
        yea yeaVar = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            fuf fufVar = duf.a;
            sb.append(fufVar.getOrCreateKotlinClass(d.class).getSimpleName());
            sb.append(", but had ");
            sb.append(fufVar.getOrCreateKotlinClass(F.getClass()).getSimpleName());
            sb.append(" as the serialized body of float");
            throw new ofa(yfa.m(-1, sb.toString(), W(str), null, yeaVar.a.l ? yfa.u(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            m3a m3aVar = qfa.a;
            float parseFloat = Float.parseFloat(dVar.c());
            gfa gfaVar = yeaVar.a;
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            throw new ofa(yfa.m(-1, yfa.x(Float.valueOf(parseFloat), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", yeaVar.a.l ? yfa.u(G().toString(), -1).toString() : null));
        } catch (IllegalArgumentException unused) {
            X(dVar, "float", str);
            throw null;
        }
    }

    public final Decoder M(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        if (!ghi.a(serialDescriptor)) {
            this.a.add(str);
            return this;
        }
        b F = F(str);
        String h = serialDescriptor.h();
        boolean z = F instanceof d;
        yea yeaVar = this.c;
        if (z) {
            return new nfa(kda.h(yeaVar, ((d) F).c()), yeaVar);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        fuf fufVar = duf.a;
        sb.append(fufVar.getOrCreateKotlinClass(d.class).getSimpleName());
        sb.append(", but had ");
        sb.append(fufVar.getOrCreateKotlinClass(F.getClass()).getSimpleName());
        throw new ofa(yfa.m(-1, mz1.o(sb, " as the serialized body of ", h), W(str), null, yeaVar.a.l ? yfa.u(F.toString(), -1).toString() : null));
    }

    public final int N(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        if (!(F instanceof d)) {
            StringBuilder sb = new StringBuilder("Expected ");
            fuf fufVar = duf.a;
            sb.append(fufVar.getOrCreateKotlinClass(d.class).getSimpleName());
            sb.append(", but had ");
            sb.append(fufVar.getOrCreateKotlinClass(F.getClass()).getSimpleName());
            sb.append(" as the serialized body of int");
            throw new ofa(yfa.m(-1, sb.toString(), W(str), null, this.c.a.l ? yfa.u(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            long i = qfa.i(dVar);
            Integer valueOf = (-2147483648L > i || i > 2147483647L) ? null : Integer.valueOf((int) i);
            if (valueOf != null) {
                return valueOf.intValue();
            }
            X(dVar, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "int", str);
            throw null;
        }
    }

    public final long O(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        if (F instanceof d) {
            d dVar = (d) F;
            try {
                return qfa.i(dVar);
            } catch (IllegalArgumentException unused) {
                this.X(dVar, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        fuf fufVar = duf.a;
        sb.append(fufVar.getOrCreateKotlinClass(d.class).getSimpleName());
        sb.append(", but had ");
        sb.append(fufVar.getOrCreateKotlinClass(F.getClass()).getSimpleName());
        sb.append(" as the serialized body of long");
        throw new ofa(yfa.m(-1, sb.toString(), W(str), null, this.c.a.l ? yfa.u(F.toString(), -1).toString() : null));
    }

    public final short P(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        if (!(F instanceof d)) {
            StringBuilder sb = new StringBuilder("Expected ");
            fuf fufVar = duf.a;
            sb.append(fufVar.getOrCreateKotlinClass(d.class).getSimpleName());
            sb.append(", but had ");
            sb.append(fufVar.getOrCreateKotlinClass(F.getClass()).getSimpleName());
            sb.append(" as the serialized body of short");
            throw new ofa(yfa.m(-1, sb.toString(), W(str), null, this.c.a.l ? yfa.u(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            long i = qfa.i(dVar);
            Short valueOf = (-32768 > i || i > 32767) ? null : Short.valueOf((short) i);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            X(dVar, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "short", str);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        boolean z = F instanceof d;
        yea yeaVar = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            fuf fufVar = duf.a;
            sb.append(fufVar.getOrCreateKotlinClass(d.class).getSimpleName());
            sb.append(", but had ");
            sb.append(fufVar.getOrCreateKotlinClass(F.getClass()).getSimpleName());
            sb.append(" as the serialized body of string");
            throw new ofa(yfa.m(-1, sb.toString(), W(str), null, yeaVar.a.l ? yfa.u(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        if (!(dVar instanceof dga)) {
            throw new ofa(yfa.m(-1, lnb.o("Expected string value for a non-null key '", str, "', got null literal instead"), W(str), "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", yeaVar.a.l ? yfa.u(G().toString(), -1).toString() : null));
        }
        dga dgaVar = (dga) dVar;
        if (dgaVar.a || yeaVar.a.c) {
            return dgaVar.c;
        }
        throw new ofa(yfa.m(-1, lnb.o("String literal for value of key '", str, "' should be quoted"), W(str), "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", yeaVar.a.l ? yfa.u(G().toString(), -1).toString() : null));
    }

    public String R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return serialDescriptor.e(i);
    }

    public final String S(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        String R = R(serialDescriptor, i);
        R.getClass();
        return R;
    }

    public abstract b T();

    public final Object U() {
        ArrayList arrayList = this.a;
        Object remove = arrayList.remove(arrayList.size() - 1);
        this.b = true;
        return remove;
    }

    public final String V() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : CollectionsKt.f0(arrayList, ".", "$.", null, null, 60);
    }

    public final String W(String str) {
        str.getClass();
        return V() + '.' + str;
    }

    public final void X(d dVar, String str, String str2) {
        throw new ofa(yfa.m(-1, "Failed to parse literal '" + dVar + "' as " + (c.v(str, i.a, false) ? "an " : "a ").concat(str) + " value", W(str2), null, this.c.a.l ? yfa.u(G().toString(), -1).toString() : null));
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.uf3
    public final p5c a() {
        return this.c.b;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public uf3 b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        b G = G();
        mha kind = serialDescriptor.getKind();
        boolean c = Intrinsics.c(kind, nii.g);
        yea yeaVar = this.c;
        if (c || (kind instanceof zze)) {
            String h = serialDescriptor.h();
            if (G instanceof a) {
                return new bha(yeaVar, (a) G);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            fuf fufVar = duf.a;
            sb.append(fufVar.getOrCreateKotlinClass(a.class).getSimpleName());
            sb.append(", but had ");
            sb.append(fufVar.getOrCreateKotlinClass(G.getClass()).getSimpleName());
            throw new ofa(yfa.m(-1, mz1.o(sb, " as the serialized body of ", h), V(), null, yeaVar.a.l ? yfa.u(G.toString(), -1).toString() : null));
        }
        if (!Intrinsics.c(kind, nii.h)) {
            String h2 = serialDescriptor.h();
            if (G instanceof kotlinx.serialization.json.c) {
                return new aha(yeaVar, (kotlinx.serialization.json.c) G, this.d, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            fuf fufVar2 = duf.a;
            sb2.append(fufVar2.getOrCreateKotlinClass(kotlinx.serialization.json.c.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(fufVar2.getOrCreateKotlinClass(G.getClass()).getSimpleName());
            throw new ofa(yfa.m(-1, mz1.o(sb2, " as the serialized body of ", h2), V(), null, yeaVar.a.l ? yfa.u(G.toString(), -1).toString() : null));
        }
        SerialDescriptor h3 = oea.h(serialDescriptor.g(0), yeaVar.b);
        mha kind2 = h3.getKind();
        if ((kind2 instanceof d7f) || Intrinsics.c(kind2, p5h.f)) {
            String h4 = serialDescriptor.h();
            if (G instanceof kotlinx.serialization.json.c) {
                return new cha(yeaVar, (kotlinx.serialization.json.c) G);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            fuf fufVar3 = duf.a;
            sb3.append(fufVar3.getOrCreateKotlinClass(kotlinx.serialization.json.c.class).getSimpleName());
            sb3.append(", but had ");
            sb3.append(fufVar3.getOrCreateKotlinClass(G.getClass()).getSimpleName());
            throw new ofa(yfa.m(-1, mz1.o(sb3, " as the serialized body of ", h4), V(), null, yeaVar.a.l ? yfa.u(G.toString(), -1).toString() : null));
        }
        if (!yeaVar.a.d) {
            throw yfa.b(h3);
        }
        String h5 = serialDescriptor.h();
        if (G instanceof a) {
            return new bha(yeaVar, (a) G);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        fuf fufVar4 = duf.a;
        sb4.append(fufVar4.getOrCreateKotlinClass(a.class).getSimpleName());
        sb4.append(", but had ");
        sb4.append(fufVar4.getOrCreateKotlinClass(G.getClass()).getSimpleName());
        throw new ofa(yfa.m(-1, mz1.o(sb4, " as the serialized body of ", h5), V(), null, yeaVar.a.l ? yfa.u(G.toString(), -1).toString() : null));
    }

    public void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.mfa
    public final yea d() {
        return this.c;
    }

    @Override // defpackage.uf3
    public final Decoder e(b7f b7fVar, int i) {
        return M(S(b7fVar, i), b7fVar.g(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int f(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        String str = (String) U();
        str.getClass();
        b F = F(str);
        String h = serialDescriptor.h();
        boolean z = F instanceof d;
        yea yeaVar = this.c;
        if (z) {
            return hz8.M(serialDescriptor, yeaVar, ((d) F).c(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        fuf fufVar = duf.a;
        sb.append(fufVar.getOrCreateKotlinClass(d.class).getSimpleName());
        sb.append(", but had ");
        sb.append(fufVar.getOrCreateKotlinClass(F.getClass()).getSimpleName());
        throw new ofa(yfa.m(-1, mz1.o(sb, " as the serialized body of ", h), W(str), null, yeaVar.a.l ? yfa.u(F.toString(), -1).toString() : null));
    }

    @Override // defpackage.uf3
    public final long g(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return O(S(serialDescriptor, i));
    }

    @Override // defpackage.uf3
    public final char h(b7f b7fVar, int i) {
        return J(S(b7fVar, i));
    }

    @Override // defpackage.uf3
    public final Object i(SerialDescriptor serialDescriptor, int i, dy4 dy4Var, Object obj) {
        serialDescriptor.getClass();
        dy4Var.getClass();
        this.a.add(S(serialDescriptor, i));
        Object y = (dy4Var.getDescriptor().b() || C()) ? y(dy4Var) : null;
        if (!this.b) {
            U();
        }
        this.b = false;
        return y;
    }

    @Override // defpackage.mfa
    public final b j() {
        return G();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int k() {
        return N(U());
    }

    @Override // defpackage.uf3
    public final int l(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return N(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long m() {
        return O(U());
    }

    @Override // defpackage.uf3
    public final String n(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return Q(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder p(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (CollectionsKt.j0(this.a) != null) {
            return M(U(), serialDescriptor);
        }
        return new sga(this.c, T(), this.d).p(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short q() {
        return P(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float r() {
        return L(U());
    }

    @Override // defpackage.uf3
    public final float s(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return L(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double t() {
        return K(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean u() {
        return H(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char v() {
        return J(U());
    }

    @Override // defpackage.uf3
    public final Object w(SerialDescriptor serialDescriptor, int i, dy4 dy4Var, Object obj) {
        serialDescriptor.getClass();
        dy4Var.getClass();
        this.a.add(S(serialDescriptor, i));
        dy4Var.getClass();
        Object y = y(dy4Var);
        if (!this.b) {
            U();
        }
        this.b = false;
        return y;
    }

    @Override // defpackage.uf3
    public final short x(b7f b7fVar, int i) {
        return P(S(b7fVar, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object y(dy4 dy4Var) {
        String str;
        dy4Var.getClass();
        if (!(dy4Var instanceof e7)) {
            return dy4Var.deserialize(this);
        }
        yea yeaVar = this.c;
        gfa gfaVar = yeaVar.a;
        e7 e7Var = (e7) dy4Var;
        String D = aik.D(yeaVar, e7Var.getDescriptor());
        b G = G();
        String h = e7Var.getDescriptor().h();
        if (!(G instanceof kotlinx.serialization.json.c)) {
            StringBuilder sb = new StringBuilder("Expected ");
            fuf fufVar = duf.a;
            sb.append(fufVar.getOrCreateKotlinClass(kotlinx.serialization.json.c.class).getSimpleName());
            sb.append(", but had ");
            sb.append(fufVar.getOrCreateKotlinClass(G.getClass()).getSimpleName());
            throw new ofa(yfa.m(-1, mz1.o(sb, " as the serialized body of ", h), V(), null, yeaVar.a.l ? yfa.u(G.toString(), -1).toString() : null));
        }
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) G;
        b bVar = (b) cVar.get(D);
        try {
            if (bVar != null) {
                d h2 = qfa.h(bVar);
                if (!(h2 instanceof JsonNull)) {
                    str = h2.c();
                    return wca.E(yeaVar, D, cVar, mha.m((e7) dy4Var, this, str));
                }
            }
            return wca.E(yeaVar, D, cVar, mha.m((e7) dy4Var, this, str));
        } catch (v5h e) {
            String message = e.getMessage();
            message.getClass();
            throw new ofa(yfa.m(-1, message, null, null, yeaVar.a.l ? yfa.u(cVar.toString(), -1).toString() : null));
        }
        str = null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String z() {
        return Q(U());
    }
}
