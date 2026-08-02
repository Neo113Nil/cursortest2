package fi;

import Zh.InterfaceC1900a;
import bi.m;
import bi.n;
import di.AbstractC4079b;
import di.AbstractC4110q0;
import ei.AbstractC4212b;
import ei.C4216f;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: fi.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4287c extends AbstractC4110q0 implements ei.h {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4212b f46749d;

    /* renamed from: e, reason: collision with root package name */
    public final JsonElement f46750e;

    /* renamed from: f, reason: collision with root package name */
    public final String f46751f;

    /* renamed from: g, reason: collision with root package name */
    public final C4216f f46752g;

    public /* synthetic */ AbstractC4287c(AbstractC4212b abstractC4212b, JsonElement jsonElement, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4212b, jsonElement, str);
    }

    public abstract JsonElement A0();

    public final String B0(String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return j0() + '.' + currentTag;
    }

    public final Void C0(JsonPrimitive jsonPrimitive, String str, String str2) {
        StringBuilder sb2;
        String str3;
        if (StringsKt.startsWith$default(str, com.google.android.material.shape.i.f35755A, false, 2, (Object) null)) {
            sb2 = new StringBuilder();
            str3 = "an ";
        } else {
            sb2 = new StringBuilder();
            str3 = "a ";
        }
        sb2.append(str3);
        sb2.append(str);
        throw C.f(-1, "Failed to parse literal '" + jsonPrimitive + "' as " + sb2.toString() + " value at element: " + B0(str2), n0().toString());
    }

    @Override // ci.e
    public boolean G() {
        return !(n0() instanceof JsonNull);
    }

    @Override // di.c1, ci.e
    public Object H(InterfaceC1900a deserializer) {
        JsonPrimitive m10;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC4079b) || d().f().p()) {
            return deserializer.deserialize(this);
        }
        AbstractC4079b abstractC4079b = (AbstractC4079b) deserializer;
        String c10 = T.c(abstractC4079b.getDescriptor(), d());
        JsonElement j10 = j();
        String h10 = abstractC4079b.getDescriptor().h();
        if (j10 instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) j10;
            JsonElement jsonElement = (JsonElement) jsonObject.get(c10);
            try {
                InterfaceC1900a a10 = Zh.h.a((AbstractC4079b) deserializer, this, (jsonElement == null || (m10 = ei.j.m(jsonElement)) == null) ? null : ei.j.g(m10));
                Intrinsics.checkNotNull(a10, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return b0.b(d(), c10, jsonObject, a10);
            } catch (Zh.o e10) {
                String message = e10.getMessage();
                Intrinsics.checkNotNull(message);
                throw C.f(-1, message, jsonObject.toString());
            }
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(j10.getClass()).getSimpleName() + " as the serialized body of " + h10 + " at element: " + j0(), j10.toString());
    }

    @Override // ci.c
    public gi.e a() {
        return d().a();
    }

    public void b(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // ci.e
    public ci.c c(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement n02 = n0();
        bi.m kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, n.b.f25231a) || (kind instanceof bi.d)) {
            AbstractC4212b d10 = d();
            String h10 = descriptor.h();
            if (n02 instanceof JsonArray) {
                return new N(d10, (JsonArray) n02);
            }
            throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(n02.getClass()).getSimpleName() + " as the serialized body of " + h10 + " at element: " + j0(), n02.toString());
        }
        if (!Intrinsics.areEqual(kind, n.c.f25232a)) {
            AbstractC4212b d11 = d();
            String h11 = descriptor.h();
            if (n02 instanceof JsonObject) {
                return new L(d11, (JsonObject) n02, this.f46751f, null, 8, null);
            }
            throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(n02.getClass()).getSimpleName() + " as the serialized body of " + h11 + " at element: " + j0(), n02.toString());
        }
        AbstractC4212b d12 = d();
        bi.f a10 = f0.a(descriptor.g(0), d12.a());
        bi.m kind2 = a10.getKind();
        if ((kind2 instanceof bi.e) || Intrinsics.areEqual(kind2, m.b.f25229a)) {
            AbstractC4212b d13 = d();
            String h12 = descriptor.h();
            if (n02 instanceof JsonObject) {
                return new P(d13, (JsonObject) n02);
            }
            throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(n02.getClass()).getSimpleName() + " as the serialized body of " + h12 + " at element: " + j0(), n02.toString());
        }
        if (!d12.f().c()) {
            throw C.d(a10);
        }
        AbstractC4212b d14 = d();
        String h13 = descriptor.h();
        if (n02 instanceof JsonArray) {
            return new N(d14, (JsonArray) n02);
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(n02.getClass()).getSimpleName() + " as the serialized body of " + h13 + " at element: " + j0(), n02.toString());
    }

    @Override // ei.h
    public AbstractC4212b d() {
        return this.f46749d;
    }

    @Override // di.AbstractC4110q0
    public String f0(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // ei.h
    public JsonElement j() {
        return n0();
    }

    public abstract JsonElement m0(String str);

    public final JsonElement n0() {
        JsonElement m02;
        String str = (String) Z();
        return (str == null || (m02 = m0(str)) == null) ? A0() : m02;
    }

    @Override // di.c1
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public boolean O(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement m02 = m0(tag);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                Boolean f10 = ei.j.f(jsonPrimitive);
                if (f10 != null) {
                    return f10.booleanValue();
                }
                C0(jsonPrimitive, "boolean", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "boolean", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(m02.getClass()).getSimpleName() + " as the serialized body of boolean at element: " + B0(tag), m02.toString());
    }

    @Override // di.c1
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public byte P(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement m02 = m0(tag);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                long q10 = ei.j.q(jsonPrimitive);
                Byte valueOf = (-128 > q10 || q10 > 127) ? null : Byte.valueOf((byte) q10);
                if (valueOf != null) {
                    return valueOf.byteValue();
                }
                C0(jsonPrimitive, "byte", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "byte", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(m02.getClass()).getSimpleName() + " as the serialized body of byte at element: " + B0(tag), m02.toString());
    }

    @Override // di.c1
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public char Q(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement m02 = m0(tag);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                return StringsKt.single(jsonPrimitive.a());
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(m02.getClass()).getSimpleName() + " as the serialized body of char at element: " + B0(tag), m02.toString());
    }

    @Override // di.c1
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public double R(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement m02 = m0(tag);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                double h10 = ei.j.h(jsonPrimitive);
                if (d().f().b()) {
                    return h10;
                }
                if (Math.abs(h10) <= Double.MAX_VALUE) {
                    return h10;
                }
                throw C.a(Double.valueOf(h10), tag, n0().toString());
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(m02.getClass()).getSimpleName() + " as the serialized body of double at element: " + B0(tag), m02.toString());
    }

    @Override // di.c1
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public int S(String tag, bi.f enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        AbstractC4212b d10 = d();
        JsonElement m02 = m0(tag);
        String h10 = enumDescriptor.h();
        if (m02 instanceof JsonPrimitive) {
            return E.k(enumDescriptor, d10, ((JsonPrimitive) m02).a(), null, 4, null);
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(m02.getClass()).getSimpleName() + " as the serialized body of " + h10 + " at element: " + B0(tag), m02.toString());
    }

    @Override // di.c1
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public float T(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement m02 = m0(tag);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                float j10 = ei.j.j(jsonPrimitive);
                if (d().f().b()) {
                    return j10;
                }
                if (Math.abs(j10) <= Float.MAX_VALUE) {
                    return j10;
                }
                throw C.a(Float.valueOf(j10), tag, n0().toString());
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "float", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(m02.getClass()).getSimpleName() + " as the serialized body of float at element: " + B0(tag), m02.toString());
    }

    @Override // di.c1
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public ci.e U(String tag, bi.f inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (!W.b(inlineDescriptor)) {
            return super.U(tag, inlineDescriptor);
        }
        AbstractC4212b d10 = d();
        JsonElement m02 = m0(tag);
        String h10 = inlineDescriptor.h();
        if (m02 instanceof JsonPrimitive) {
            return new C4307x(Y.a(d10, ((JsonPrimitive) m02).a()), d());
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(m02.getClass()).getSimpleName() + " as the serialized body of " + h10 + " at element: " + B0(tag), m02.toString());
    }

    @Override // di.c1
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public int V(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement m02 = m0(tag);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                long q10 = ei.j.q(jsonPrimitive);
                Integer valueOf = (-2147483648L > q10 || q10 > 2147483647L) ? null : Integer.valueOf((int) q10);
                if (valueOf != null) {
                    return valueOf.intValue();
                }
                C0(jsonPrimitive, "int", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "int", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(m02.getClass()).getSimpleName() + " as the serialized body of int at element: " + B0(tag), m02.toString());
    }

    @Override // di.c1
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public long W(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement m02 = m0(tag);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                return ei.j.q(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "long", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(m02.getClass()).getSimpleName() + " as the serialized body of long at element: " + B0(tag), m02.toString());
    }

    @Override // di.c1
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public short X(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement m02 = m0(tag);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                long q10 = ei.j.q(jsonPrimitive);
                Short valueOf = (-32768 > q10 || q10 > 32767) ? null : Short.valueOf((short) q10);
                if (valueOf != null) {
                    return valueOf.shortValue();
                }
                C0(jsonPrimitive, "short", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "short", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(m02.getClass()).getSimpleName() + " as the serialized body of short at element: " + B0(tag), m02.toString());
    }

    @Override // di.c1, ci.e
    public ci.e y(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Z() != null ? super.y(descriptor) : new G(d(), A0(), this.f46751f).y(descriptor);
    }

    @Override // di.c1
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public String Y(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement m02 = m0(tag);
        if (!(m02 instanceof JsonPrimitive)) {
            throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(m02.getClass()).getSimpleName() + " as the serialized body of string at element: " + B0(tag), m02.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
        if (!(jsonPrimitive instanceof ei.w)) {
            throw C.f(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + B0(tag), n0().toString());
        }
        ei.w wVar = (ei.w) jsonPrimitive;
        if (wVar.b() || d().f().q()) {
            return wVar.a();
        }
        throw C.f(-1, "String literal for key '" + tag + "' should be quoted at element: " + B0(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", n0().toString());
    }

    public final String z0() {
        return this.f46751f;
    }

    public /* synthetic */ AbstractC4287c(AbstractC4212b abstractC4212b, JsonElement jsonElement, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4212b, jsonElement, (i10 & 4) != 0 ? null : str, null);
    }

    public AbstractC4287c(AbstractC4212b abstractC4212b, JsonElement jsonElement, String str) {
        this.f46749d = abstractC4212b;
        this.f46750e = jsonElement;
        this.f46751f = str;
        this.f46752g = d().f();
    }
}
