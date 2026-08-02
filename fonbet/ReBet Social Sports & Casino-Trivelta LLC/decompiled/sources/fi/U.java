package fi;

import Zh.InterfaceC1900a;
import bi.m;
import ci.AbstractC2928a;
import di.AbstractC4079b;
import ei.AbstractC4212b;
import ei.C4216f;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public class U extends AbstractC2928a implements ei.h {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4212b f46726b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f46727c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4285a f46728d;

    /* renamed from: e, reason: collision with root package name */
    public final gi.e f46729e;

    /* renamed from: f, reason: collision with root package name */
    public int f46730f;

    /* renamed from: g, reason: collision with root package name */
    public a f46731g;

    /* renamed from: h, reason: collision with root package name */
    public final C4216f f46732h;

    /* renamed from: i, reason: collision with root package name */
    public final C4309z f46733i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f46734a;

        public a(String str) {
            this.f46734a = str;
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e0.values().length];
            try {
                iArr[e0.f46767d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.f46768e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.f46769f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.f46766c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public U(AbstractC4212b json, e0 mode, AbstractC4285a lexer, bi.f descriptor, a aVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f46726b = json;
        this.f46727c = mode;
        this.f46728d = lexer;
        this.f46729e = json.a();
        this.f46730f = -1;
        this.f46731g = aVar;
        C4216f f10 = json.f();
        this.f46732h = f10;
        this.f46733i = f10.j() ? null : new C4309z(descriptor);
    }

    @Override // ci.AbstractC2928a, ci.e
    public char A() {
        String s10 = this.f46728d.s();
        if (s10.length() == 1) {
            return s10.charAt(0);
        }
        AbstractC4285a.z(this.f46728d, "Expected single char, but got '" + s10 + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // ci.AbstractC2928a, ci.e
    public String E() {
        return this.f46732h.q() ? this.f46728d.t() : this.f46728d.q();
    }

    @Override // ci.AbstractC2928a, ci.e
    public boolean G() {
        C4309z c4309z = this.f46733i;
        return ((c4309z != null ? c4309z.b() : false) || AbstractC4285a.O(this.f46728d, false, 1, null)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0157  */
    @Override // ci.AbstractC2928a, ci.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H(InterfaceC1900a deserializer) {
        String message;
        JsonPrimitive m10;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
        } catch (Zh.c e10) {
            message = e10.getMessage();
            Intrinsics.checkNotNull(message);
            if (!StringsKt.contains$default((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null)) {
            }
        }
        if ((deserializer instanceof AbstractC4079b) && !this.f46726b.f().p()) {
            String c10 = T.c(((AbstractC4079b) deserializer).getDescriptor(), this.f46726b);
            String E10 = this.f46728d.E(c10, this.f46732h.q());
            if (E10 != null) {
                try {
                    InterfaceC1900a a10 = Zh.h.a((AbstractC4079b) deserializer, this, E10);
                    Intrinsics.checkNotNull(a10, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                    this.f46731g = new a(c10);
                    return a10.deserialize(this);
                } catch (Zh.o e11) {
                    String message2 = e11.getMessage();
                    Intrinsics.checkNotNull(message2);
                    String removeSuffix = StringsKt.removeSuffix(StringsKt.substringBefore$default(message2, '\n', (String) null, 2, (Object) null), (CharSequence) ".");
                    String message3 = e11.getMessage();
                    Intrinsics.checkNotNull(message3);
                    AbstractC4285a.z(this.f46728d, removeSuffix, 0, StringsKt.substringAfter(message3, '\n', ""), 2, null);
                    throw new KotlinNothingValueException();
                }
            }
            if (d().f().p()) {
                return deserializer.deserialize(this);
            }
            String c11 = T.c(((AbstractC4079b) deserializer).getDescriptor(), d());
            JsonElement j10 = j();
            String h10 = ((AbstractC4079b) deserializer).getDescriptor().h();
            if (j10 instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) j10;
                JsonElement jsonElement = (JsonElement) jsonObject.get(c11);
                try {
                    InterfaceC1900a a11 = Zh.h.a((AbstractC4079b) deserializer, this, (jsonElement == null || (m10 = ei.j.m(jsonElement)) == null) ? null : ei.j.g(m10));
                    Intrinsics.checkNotNull(a11, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                    return b0.b(d(), c11, jsonObject, a11);
                } catch (Zh.o e12) {
                    String message4 = e12.getMessage();
                    Intrinsics.checkNotNull(message4);
                    throw C.f(-1, message4, jsonObject.toString());
                }
            }
            throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(j10.getClass()).getSimpleName() + " as the serialized body of " + h10 + " at element: " + this.f46728d.f46746b.a(), j10.toString());
            message = e10.getMessage();
            Intrinsics.checkNotNull(message);
            if (!StringsKt.contains$default((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null)) {
                throw e10;
            }
            throw new Zh.c(e10.a(), e10.getMessage() + " at path: " + this.f46728d.f46746b.a(), e10);
        }
        return deserializer.deserialize(this);
    }

    @Override // ci.AbstractC2928a, ci.e
    public byte I() {
        long n10 = this.f46728d.n();
        byte b10 = (byte) n10;
        if (n10 == b10) {
            return b10;
        }
        AbstractC4285a.z(this.f46728d, "Failed to parse byte for input '" + n10 + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void L() {
        if (this.f46728d.F() != 4) {
            return;
        }
        AbstractC4285a.z(this.f46728d, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final boolean M(bi.f fVar, int i10) {
        String G10;
        AbstractC4212b abstractC4212b = this.f46726b;
        boolean i11 = fVar.i(i10);
        bi.f g10 = fVar.g(i10);
        if (i11 && !g10.b() && this.f46728d.N(true)) {
            return true;
        }
        if (!Intrinsics.areEqual(g10.getKind(), m.b.f25229a) || ((g10.b() && this.f46728d.N(false)) || (G10 = this.f46728d.G(this.f46732h.q())) == null)) {
            return false;
        }
        int i12 = E.i(g10, abstractC4212b, G10);
        boolean z10 = !abstractC4212b.f().j() && g10.b();
        if (i12 == -3 && (i11 || z10)) {
            this.f46728d.q();
            return true;
        }
        return false;
    }

    public final int N() {
        boolean M10 = this.f46728d.M();
        if (!this.f46728d.f()) {
            if (!M10 || this.f46726b.f().d()) {
                return -1;
            }
            C.g(this.f46728d, "array");
            throw new KotlinNothingValueException();
        }
        int i10 = this.f46730f;
        if (i10 != -1 && !M10) {
            AbstractC4285a.z(this.f46728d, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = i10 + 1;
        this.f46730f = i11;
        return i11;
    }

    public final int O() {
        int i10 = this.f46730f;
        boolean z10 = false;
        boolean z11 = i10 % 2 != 0;
        if (!z11) {
            this.f46728d.m(':');
        } else if (i10 != -1) {
            z10 = this.f46728d.M();
        }
        if (!this.f46728d.f()) {
            if (!z10 || this.f46726b.f().d()) {
                return -1;
            }
            C.h(this.f46728d, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z11) {
            if (this.f46730f == -1) {
                AbstractC4285a abstractC4285a = this.f46728d;
                int i11 = abstractC4285a.f46745a;
                if (z10) {
                    AbstractC4285a.z(abstractC4285a, "Unexpected leading comma", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                AbstractC4285a abstractC4285a2 = this.f46728d;
                boolean z12 = z10;
                int i12 = abstractC4285a2.f46745a;
                if (!z12) {
                    AbstractC4285a.z(abstractC4285a2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i13 = this.f46730f + 1;
        this.f46730f = i13;
        return i13;
    }

    public final int P(bi.f fVar) {
        int i10;
        boolean z10;
        boolean M10 = this.f46728d.M();
        while (true) {
            boolean z11 = true;
            if (!this.f46728d.f()) {
                if (M10 && !this.f46726b.f().d()) {
                    C.h(this.f46728d, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                C4309z c4309z = this.f46733i;
                if (c4309z != null) {
                    return c4309z.d();
                }
                return -1;
            }
            String Q10 = Q();
            this.f46728d.m(':');
            i10 = E.i(fVar, this.f46726b, Q10);
            if (i10 == -3) {
                z10 = false;
            } else {
                if (!this.f46732h.g() || !M(fVar, i10)) {
                    break;
                }
                z10 = this.f46728d.M();
                z11 = false;
            }
            M10 = z11 ? R(fVar, Q10) : z10;
        }
        C4309z c4309z2 = this.f46733i;
        if (c4309z2 != null) {
            c4309z2.c(i10);
        }
        return i10;
    }

    public final String Q() {
        return this.f46732h.q() ? this.f46728d.t() : this.f46728d.j();
    }

    public final boolean R(bi.f fVar, String str) {
        if (E.m(fVar, this.f46726b) || T(this.f46731g, str)) {
            this.f46728d.I(this.f46732h.q());
        } else {
            this.f46728d.f46746b.b();
            this.f46728d.A(str);
        }
        return this.f46728d.M();
    }

    public final void S(bi.f fVar) {
        while (e(fVar) != -1) {
        }
    }

    public final boolean T(a aVar, String str) {
        if (aVar == null || !Intrinsics.areEqual(aVar.f46734a, str)) {
            return false;
        }
        aVar.f46734a = null;
        return true;
    }

    @Override // ci.c
    public gi.e a() {
        return this.f46729e;
    }

    @Override // ci.AbstractC2928a, ci.c
    public void b(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor.d() == 0 && E.m(descriptor, this.f46726b)) {
            S(descriptor);
        }
        if (this.f46728d.M() && !this.f46726b.f().d()) {
            C.g(this.f46728d, "");
            throw new KotlinNothingValueException();
        }
        this.f46728d.m(this.f46727c.f46772b);
        this.f46728d.f46746b.b();
    }

    @Override // ci.AbstractC2928a, ci.e
    public ci.c c(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        e0 b10 = f0.b(this.f46726b, descriptor);
        this.f46728d.f46746b.c(descriptor);
        this.f46728d.m(b10.f46771a);
        L();
        int i10 = b.$EnumSwitchMapping$0[b10.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new U(this.f46726b, b10, this.f46728d, descriptor, this.f46731g) : (this.f46727c == b10 && this.f46726b.f().j()) ? this : new U(this.f46726b, b10, this.f46728d, descriptor, this.f46731g);
    }

    @Override // ei.h
    public final AbstractC4212b d() {
        return this.f46726b;
    }

    @Override // ci.c
    public int e(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = b.$EnumSwitchMapping$0[this.f46727c.ordinal()];
        int N10 = i10 != 2 ? i10 != 4 ? N() : P(descriptor) : O();
        if (this.f46727c != e0.f46768e) {
            this.f46728d.f46746b.g(N10);
        }
        return N10;
    }

    @Override // ci.AbstractC2928a, ci.e
    public int f(bi.f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return E.j(enumDescriptor, this.f46726b, E(), " at path " + this.f46728d.f46746b.a());
    }

    @Override // ci.AbstractC2928a, ci.c
    public Object i(bi.f descriptor, int i10, InterfaceC1900a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z10 = this.f46727c == e0.f46768e && (i10 & 1) == 0;
        if (z10) {
            this.f46728d.f46746b.d();
        }
        Object i11 = super.i(descriptor, i10, deserializer, obj);
        if (z10) {
            this.f46728d.f46746b.f(i11);
        }
        return i11;
    }

    @Override // ei.h
    public JsonElement j() {
        return new S(this.f46726b.f(), this.f46728d).e();
    }

    @Override // ci.AbstractC2928a, ci.e
    public int k() {
        long n10 = this.f46728d.n();
        int i10 = (int) n10;
        if (n10 == i10) {
            return i10;
        }
        AbstractC4285a.z(this.f46728d, "Failed to parse int for input '" + n10 + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // ci.AbstractC2928a, ci.e
    public Void n() {
        return null;
    }

    @Override // ci.AbstractC2928a, ci.e
    public long p() {
        return this.f46728d.n();
    }

    @Override // ci.AbstractC2928a, ci.e
    public short v() {
        long n10 = this.f46728d.n();
        short s10 = (short) n10;
        if (n10 == s10) {
            return s10;
        }
        AbstractC4285a.z(this.f46728d, "Failed to parse short for input '" + n10 + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // ci.AbstractC2928a, ci.e
    public float w() {
        AbstractC4285a abstractC4285a = this.f46728d;
        String s10 = abstractC4285a.s();
        try {
            float parseFloat = Float.parseFloat(s10);
            if (this.f46726b.f().b()) {
                return parseFloat;
            }
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            C.k(this.f46728d, Float.valueOf(parseFloat));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractC4285a.z(abstractC4285a, "Failed to parse type 'float' for input '" + s10 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ci.AbstractC2928a, ci.e
    public double x() {
        AbstractC4285a abstractC4285a = this.f46728d;
        String s10 = abstractC4285a.s();
        try {
            double parseDouble = Double.parseDouble(s10);
            if (this.f46726b.f().b()) {
                return parseDouble;
            }
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            C.k(this.f46728d, Double.valueOf(parseDouble));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractC4285a.z(abstractC4285a, "Failed to parse type 'double' for input '" + s10 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ci.AbstractC2928a, ci.e
    public ci.e y(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return W.b(descriptor) ? new C4307x(this.f46728d, this.f46726b) : super.y(descriptor);
    }

    @Override // ci.AbstractC2928a, ci.e
    public boolean z() {
        return this.f46728d.h();
    }
}
