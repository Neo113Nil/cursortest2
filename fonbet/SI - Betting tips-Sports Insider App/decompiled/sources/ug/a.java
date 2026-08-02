package ug;

import androidx.appcompat.widget.y;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import k2.x;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.z;
import sg.a0;
import sg.w0;
import tg.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class a implements tg.k, rg.b, rg.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24260a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f24261b;

    /* renamed from: c, reason: collision with root package name */
    public final tg.c f24262c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24263d;

    /* renamed from: e, reason: collision with root package name */
    public final y f24264e;

    public a(tg.c cVar, String str) {
        this.f24262c = cVar;
        this.f24263d = str;
        this.f24264e = cVar.f23937a;
    }

    @Override // tg.k
    public final tg.c A() {
        return this.f24262c;
    }

    @Override // rg.b
    public final byte B() {
        return I(U());
    }

    @Override // rg.b
    public final short C() {
        return P(U());
    }

    @Override // rg.b
    public final float D() {
        return L(U());
    }

    @Override // rg.b
    public final double E() {
        return K(U());
    }

    public abstract tg.m F(String str);

    public final tg.m G() {
        tg.m F;
        String str = (String) CollectionsKt.L(this.f24260a);
        return (str == null || (F = F(str)) == null) ? T() : F;
    }

    public final boolean H(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        tg.m F = F(tag);
        if (!(F instanceof c0)) {
            throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(c0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(F.getClass()).getSimpleName() + " as the serialized body of boolean at element: " + W(tag), F.toString());
        }
        c0 c0Var = (c0) F;
        try {
            a0 a0Var = tg.n.f23953a;
            Intrinsics.checkNotNullParameter(c0Var, "<this>");
            String a7 = c0Var.a();
            String[] strArr = v.f24321a;
            Intrinsics.checkNotNullParameter(a7, "<this>");
            Boolean bool = z.j(a7, "true", true) ? Boolean.TRUE : z.j(a7, "false", true) ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            X(c0Var, "boolean", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(c0Var, "boolean", tag);
            throw null;
        }
    }

    public final byte I(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        tg.m F = F(tag);
        if (!(F instanceof c0)) {
            throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(c0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(F.getClass()).getSimpleName() + " as the serialized body of byte at element: " + W(tag), F.toString());
        }
        c0 c0Var = (c0) F;
        try {
            long b10 = tg.n.b(c0Var);
            Byte valueOf = (-128 > b10 || b10 > 127) ? null : Byte.valueOf((byte) b10);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            X(c0Var, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(c0Var, "byte", tag);
            throw null;
        }
    }

    public final char J(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        tg.m F = F(tag);
        if (!(F instanceof c0)) {
            throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(c0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(F.getClass()).getSimpleName() + " as the serialized body of char at element: " + W(tag), F.toString());
        }
        c0 c0Var = (c0) F;
        try {
            String a7 = c0Var.a();
            Intrinsics.checkNotNullParameter(a7, "<this>");
            int length = a7.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return a7.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(c0Var, "char", tag);
            throw null;
        }
    }

    public final double K(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        tg.m F = F(tag);
        if (!(F instanceof c0)) {
            throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(c0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(F.getClass()).getSimpleName() + " as the serialized body of double at element: " + W(tag), F.toString());
        }
        c0 c0Var = (c0) F;
        try {
            a0 a0Var = tg.n.f23953a;
            Intrinsics.checkNotNullParameter(c0Var, "<this>");
            double parseDouble = Double.parseDouble(c0Var.a());
            y yVar = this.f24262c.f23937a;
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            throw j.a(Double.valueOf(parseDouble), tag, G().toString());
        } catch (IllegalArgumentException unused) {
            X(c0Var, "double", tag);
            throw null;
        }
    }

    public final float L(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        tg.m F = F(tag);
        if (!(F instanceof c0)) {
            throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(c0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(F.getClass()).getSimpleName() + " as the serialized body of float at element: " + W(tag), F.toString());
        }
        c0 c0Var = (c0) F;
        try {
            a0 a0Var = tg.n.f23953a;
            Intrinsics.checkNotNullParameter(c0Var, "<this>");
            float parseFloat = Float.parseFloat(c0Var.a());
            y yVar = this.f24262c.f23937a;
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            throw j.a(Float.valueOf(parseFloat), tag, G().toString());
        } catch (IllegalArgumentException unused) {
            X(c0Var, "float", tag);
            throw null;
        }
    }

    public final rg.b M(Object obj, qg.g inlineDescriptor) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (!t.a(inlineDescriptor)) {
            Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
            this.f24260a.add(tag);
            return this;
        }
        tg.m F = F(tag);
        String a7 = inlineDescriptor.a();
        if (F instanceof c0) {
            String a10 = ((c0) F).a();
            tg.c cVar = this.f24262c;
            return new g(j.f(cVar, a10), cVar);
        }
        throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(c0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(F.getClass()).getSimpleName() + " as the serialized body of " + a7 + " at element: " + W(tag), F.toString());
    }

    public final int N(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        tg.m F = F(tag);
        if (!(F instanceof c0)) {
            throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(c0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(F.getClass()).getSimpleName() + " as the serialized body of int at element: " + W(tag), F.toString());
        }
        c0 c0Var = (c0) F;
        try {
            long b10 = tg.n.b(c0Var);
            Integer valueOf = (-2147483648L > b10 || b10 > 2147483647L) ? null : Integer.valueOf((int) b10);
            if (valueOf != null) {
                return valueOf.intValue();
            }
            X(c0Var, "int", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(c0Var, "int", tag);
            throw null;
        }
    }

    public final long O(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        tg.m F = F(tag);
        if (F instanceof c0) {
            c0 c0Var = (c0) F;
            try {
                return tg.n.b(c0Var);
            } catch (IllegalArgumentException unused) {
                X(c0Var, "long", tag);
                throw null;
            }
        }
        throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(c0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(F.getClass()).getSimpleName() + " as the serialized body of long at element: " + W(tag), F.toString());
    }

    public final short P(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        tg.m F = F(tag);
        if (!(F instanceof c0)) {
            throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(c0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(F.getClass()).getSimpleName() + " as the serialized body of short at element: " + W(tag), F.toString());
        }
        c0 c0Var = (c0) F;
        try {
            long b10 = tg.n.b(c0Var);
            Short valueOf = (-32768 > b10 || b10 > 32767) ? null : Short.valueOf((short) b10);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            X(c0Var, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(c0Var, "short", tag);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        tg.m F = F(tag);
        if (!(F instanceof c0)) {
            throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(c0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(F.getClass()).getSimpleName() + " as the serialized body of string at element: " + W(tag), F.toString());
        }
        c0 c0Var = (c0) F;
        if (!(c0Var instanceof tg.s)) {
            StringBuilder p10 = d9.e.p("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            p10.append(W(tag));
            throw j.e(-1, p10.toString(), G().toString());
        }
        tg.s sVar = (tg.s) c0Var;
        if (sVar.f23957a) {
            return sVar.f23958b;
        }
        y yVar = this.f24262c.f23937a;
        StringBuilder p11 = d9.e.p("String literal for key '", tag, "' should be quoted at element: ");
        p11.append(W(tag));
        p11.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw j.e(-1, p11.toString(), G().toString());
    }

    public String R(qg.g descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.g(i5);
    }

    public final String S(qg.g gVar, int i5) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String childName = R(gVar, i5);
        Intrinsics.checkNotNullParameter(childName, "nestedName");
        String parentName = (String) CollectionsKt.L(this.f24260a);
        if (parentName == null) {
            parentName = "";
        }
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    public abstract tg.m T();

    public final Object U() {
        ArrayList arrayList = this.f24260a;
        Object remove = arrayList.remove(kotlin.collections.u.e(arrayList));
        this.f24261b = true;
        return remove;
    }

    public final String V() {
        ArrayList arrayList = this.f24260a;
        return arrayList.isEmpty() ? "$" : CollectionsKt.J(arrayList, ".", "$.", null, null, 60);
    }

    public final String W(String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return V() + '.' + currentTag;
    }

    public final void X(c0 c0Var, String str, String str2) {
        throw j.e(-1, "Failed to parse literal '" + c0Var + "' as " + (z.o(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + W(str2), G().toString());
    }

    @Override // rg.b
    public final Object a(og.a deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof sg.b)) {
            return deserializer.a(this);
        }
        tg.c cVar = this.f24262c;
        y yVar = cVar.f23937a;
        og.d dVar = (og.d) ((sg.b) deserializer);
        String i5 = j.i(dVar.d(), cVar);
        tg.m G = G();
        String a7 = dVar.d().a();
        if (!(G instanceof tg.y)) {
            throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(tg.y.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(G.getClass()).getSimpleName() + " as the serialized body of " + a7 + " at element: " + V(), G.toString());
        }
        tg.y yVar2 = (tg.y) G;
        tg.m mVar = (tg.m) yVar2.get(i5);
        String str = null;
        if (mVar != null) {
            c0 a10 = tg.n.a(mVar);
            Intrinsics.checkNotNullParameter(a10, "<this>");
            if (!(a10 instanceof tg.v)) {
                str = a10.a();
            }
        }
        try {
            og.a n9 = x.n((sg.b) deserializer, this, str);
            Intrinsics.checkNotNull(n9, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
            return j.q(cVar, i5, yVar2, n9);
        } catch (og.f e7) {
            String message = e7.getMessage();
            Intrinsics.checkNotNull(message);
            throw j.e(-1, message, yVar2.toString());
        }
    }

    @Override // rg.a
    public final long b(qg.g descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return O(S(descriptor, i5));
    }

    @Override // rg.b
    public final boolean c() {
        return H(U());
    }

    @Override // rg.b
    public final char d() {
        return J(U());
    }

    @Override // rg.a
    public final char e(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return J(S(descriptor, i5));
    }

    @Override // rg.a
    public final byte f(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return I(S(descriptor, i5));
    }

    @Override // rg.a
    public void g(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // rg.a
    public final boolean h(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return H(S(descriptor, i5));
    }

    @Override // rg.b
    public final rg.b i(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (CollectionsKt.L(this.f24260a) != null) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return M(U(), descriptor);
        }
        return new l(this.f24262c, T(), this.f24263d).i(descriptor);
    }

    @Override // tg.k
    public final tg.m j() {
        return G();
    }

    @Override // rg.a
    public final rg.b k(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return M(S(descriptor, i5), descriptor.i(i5));
    }

    @Override // rg.b
    public final int l() {
        return N(U());
    }

    @Override // rg.a
    public final int m(qg.g descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return N(S(descriptor, i5));
    }

    @Override // rg.a
    public final c4.d n() {
        return this.f24262c.f23938b;
    }

    @Override // rg.a
    public final String o(qg.g descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Q(S(descriptor, i5));
    }

    @Override // rg.a
    public final double p(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return K(S(descriptor, i5));
    }

    @Override // rg.a
    public final float q(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return L(S(descriptor, i5));
    }

    @Override // rg.b
    public final int r(qg.g enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        String tag = (String) U();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        tg.m F = F(tag);
        String a7 = enumDescriptor.a();
        if (F instanceof c0) {
            return j.l(enumDescriptor, this.f24262c, ((c0) F).a(), "");
        }
        throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(c0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(F.getClass()).getSimpleName() + " as the serialized body of " + a7 + " at element: " + W(tag), F.toString());
    }

    @Override // rg.b
    public final String s() {
        return Q(U());
    }

    @Override // rg.a
    public final short t(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return P(S(descriptor, i5));
    }

    @Override // rg.a
    public final Object u(qg.g descriptor, int i5, og.a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f24260a.add(S(descriptor, i5));
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Object a7 = a(deserializer);
        if (!this.f24261b) {
            U();
        }
        this.f24261b = false;
        return a7;
    }

    @Override // rg.b
    public final long v() {
        return O(U());
    }

    @Override // rg.b
    public rg.a w(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        tg.m G = G();
        a.a e7 = descriptor.e();
        boolean areEqual = Intrinsics.areEqual(e7, qg.k.f22179f);
        tg.c cVar = this.f24262c;
        if (areEqual || (e7 instanceof qg.d)) {
            String a7 = descriptor.a();
            if (G instanceof tg.e) {
                return new n(cVar, (tg.e) G);
            }
            throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(tg.e.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(G.getClass()).getSimpleName() + " as the serialized body of " + a7 + " at element: " + V(), G.toString());
        }
        if (!Intrinsics.areEqual(e7, qg.k.f22180g)) {
            String a10 = descriptor.a();
            if (G instanceof tg.y) {
                return new m(cVar, (tg.y) G, this.f24263d, 8);
            }
            throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(tg.y.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(G.getClass()).getSimpleName() + " as the serialized body of " + a10 + " at element: " + V(), G.toString());
        }
        qg.g g10 = j.g(descriptor.i(0), cVar.f23938b);
        a.a e9 = g10.e();
        if (!(e9 instanceof qg.f) && !Intrinsics.areEqual(e9, qg.j.f22177e)) {
            throw j.c(g10);
        }
        String a11 = descriptor.a();
        if (G instanceof tg.y) {
            return new o(cVar, (tg.y) G);
        }
        throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(tg.y.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(G.getClass()).getSimpleName() + " as the serialized body of " + a11 + " at element: " + V(), G.toString());
    }

    @Override // rg.b
    public boolean x() {
        return !(G() instanceof tg.v);
    }

    @Override // rg.a
    public final Object y(qg.g descriptor, int i5, og.a deserializer, Object obj) {
        Object a7;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f24260a.add(S(descriptor, i5));
        if (deserializer.d().c() || x()) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            a7 = a(deserializer);
        } else {
            a7 = null;
        }
        if (!this.f24261b) {
            U();
        }
        this.f24261b = false;
        return a7;
    }
}
