package fi;

import bi.m;
import bi.n;
import com.twilio.voice.EventKeys;
import di.AbstractC4079b;
import di.AbstractC4111r0;
import ei.AbstractC4212b;
import ei.C4216f;
import fi.T;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* renamed from: fi.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4289e extends AbstractC4111r0 implements ei.s {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4212b f46755b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f46756c;

    /* renamed from: d, reason: collision with root package name */
    public final C4216f f46757d;

    /* renamed from: e, reason: collision with root package name */
    public String f46758e;

    /* renamed from: f, reason: collision with root package name */
    public String f46759f;

    /* renamed from: fi.e$a */
    public static final class a extends ci.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f46761b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ bi.f f46762c;

        public a(String str, bi.f fVar) {
            this.f46761b = str;
            this.f46762c = fVar;
        }

        @Override // ci.b, ci.f
        public void H(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            AbstractC4289e.this.w0(this.f46761b, new ei.w(value, false, this.f46762c));
        }

        @Override // ci.f
        public gi.e a() {
            return AbstractC4289e.this.d().a();
        }
    }

    /* renamed from: fi.e$b */
    public static final class b extends ci.b {

        /* renamed from: a, reason: collision with root package name */
        public final gi.e f46763a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f46765c;

        public b(String str) {
            this.f46765c = str;
            this.f46763a = AbstractC4289e.this.d().a();
        }

        @Override // ci.b, ci.f
        public void E(int i10) {
            K(AbstractC4290f.a(UInt.m242constructorimpl(i10)));
        }

        public final void K(String s10) {
            Intrinsics.checkNotNullParameter(s10, "s");
            AbstractC4289e.this.w0(this.f46765c, new ei.w(s10, false, null, 4, null));
        }

        @Override // ci.f
        public gi.e a() {
            return this.f46763a;
        }

        @Override // ci.b, ci.f
        public void h(byte b10) {
            K(UByte.m209toStringimpl(UByte.m165constructorimpl(b10)));
        }

        @Override // ci.b, ci.f
        public void s(long j10) {
            String a10;
            a10 = AbstractC4292h.a(ULong.m321constructorimpl(j10), 10);
            K(a10);
        }

        @Override // ci.b, ci.f
        public void v(short s10) {
            K(UShort.m472toStringimpl(UShort.m428constructorimpl(s10)));
        }
    }

    public /* synthetic */ AbstractC4289e(AbstractC4212b abstractC4212b, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4212b, function1);
    }

    public static final Unit f0(AbstractC4289e abstractC4289e, JsonElement node) {
        Intrinsics.checkNotNullParameter(node, "node");
        abstractC4289e.w0((String) abstractC4289e.V(), node);
        return Unit.INSTANCE;
    }

    @Override // ei.s
    public void D(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.f46758e == null || (element instanceof JsonObject)) {
            i(ei.q.f46124a, element);
        } else {
            T.d(this.f46759f, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // di.d1
    public void U(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f46756c.invoke(s0());
    }

    @Override // ci.f
    public final gi.e a() {
        return this.f46755b.a();
    }

    @Override // di.AbstractC4111r0
    public String a0(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // di.AbstractC4111r0
    public String b0(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return E.h(descriptor, this.f46755b, i10);
    }

    @Override // ci.f
    public ci.d c(bi.f descriptor) {
        AbstractC4289e o10;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Function1 function1 = W() == null ? this.f46756c : new Function1() { // from class: fi.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit f02;
                f02 = AbstractC4289e.f0(AbstractC4289e.this, (JsonElement) obj);
                return f02;
            }
        };
        bi.m kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, n.b.f25231a) || (kind instanceof bi.d)) {
            o10 = new O(this.f46755b, function1);
        } else if (Intrinsics.areEqual(kind, n.c.f25232a)) {
            AbstractC4212b abstractC4212b = this.f46755b;
            bi.f a10 = f0.a(descriptor.g(0), abstractC4212b.a());
            bi.m kind2 = a10.getKind();
            if ((kind2 instanceof bi.e) || Intrinsics.areEqual(kind2, m.b.f25229a)) {
                o10 = new Q(this.f46755b, function1);
            } else {
                if (!abstractC4212b.f().c()) {
                    throw C.d(a10);
                }
                o10 = new O(this.f46755b, function1);
            }
        } else {
            o10 = new M(this.f46755b, function1);
        }
        String str = this.f46758e;
        if (str != null) {
            if (o10 instanceof Q) {
                Q q10 = (Q) o10;
                q10.w0("key", ei.j.c(str));
                String str2 = this.f46759f;
                if (str2 == null) {
                    str2 = descriptor.h();
                }
                q10.w0(EventKeys.VALUE_KEY, ei.j.c(str2));
            } else {
                String str3 = this.f46759f;
                if (str3 == null) {
                    str3 = descriptor.h();
                }
                o10.w0(str, ei.j.c(str3));
            }
            this.f46758e = null;
            this.f46759f = null;
        }
        return o10;
    }

    @Override // ei.s
    public final AbstractC4212b d() {
        return this.f46755b;
    }

    @Override // di.d1
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void J(String tag, boolean z10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, ei.j.a(Boolean.valueOf(z10)));
    }

    @Override // di.d1
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void K(String tag, byte b10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, ei.j.b(Byte.valueOf(b10)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (d().f().f() != ei.EnumC4211a.f46075a) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, bi.n.d.f25233a) == false) goto L31;
     */
    @Override // di.d1, ci.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(Zh.p serializer, Object obj) {
        String c10;
        boolean c11;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (W() == null) {
            c11 = d0.c(f0.a(serializer.getDescriptor(), a()));
            if (c11) {
                new H(this.f46755b, this.f46756c).i(serializer, obj);
                return;
            }
        }
        if (d().f().p()) {
            serializer.serialize(this, obj);
            return;
        }
        boolean z10 = serializer instanceof AbstractC4079b;
        if (!z10) {
            int i10 = T.a.$EnumSwitchMapping$0[d().f().f().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bi.m kind = serializer.getDescriptor().getKind();
                if (!Intrinsics.areEqual(kind, n.a.f25230a)) {
                }
                c10 = T.c(serializer.getDescriptor(), d());
            }
            c10 = null;
        }
        if (z10) {
            AbstractC4079b abstractC4079b = (AbstractC4079b) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + abstractC4079b.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            Zh.p b10 = Zh.h.b(abstractC4079b, this, obj);
            if (c10 != null) {
                T.e(serializer, b10, c10);
                T.b(b10.getDescriptor().getKind());
            }
            Intrinsics.checkNotNull(b10, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = b10;
        }
        if (c10 != null) {
            String h10 = serializer.getDescriptor().h();
            this.f46758e = c10;
            this.f46759f = h10;
        }
        serializer.serialize(this, obj);
    }

    @Override // di.d1
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void L(String tag, char c10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, ei.j.c(String.valueOf(c10)));
    }

    @Override // di.d1
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void M(String tag, double d10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, ei.j.b(Double.valueOf(d10)));
        if (!this.f46757d.b() && Math.abs(d10) > Double.MAX_VALUE) {
            throw C.c(Double.valueOf(d10), tag, s0().toString());
        }
    }

    @Override // di.d1
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void N(String tag, bi.f enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        w0(tag, ei.j.c(enumDescriptor.e(i10)));
    }

    @Override // di.d1
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void O(String tag, float f10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, ei.j.b(Float.valueOf(f10)));
        if (!this.f46757d.b() && Math.abs(f10) > Float.MAX_VALUE) {
            throw C.c(Float.valueOf(f10), tag, s0().toString());
        }
    }

    @Override // ci.d
    public boolean m(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f46757d.i();
    }

    @Override // di.d1
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public ci.f P(String tag, bi.f inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return W.b(inlineDescriptor) ? v0(tag) : W.a(inlineDescriptor) ? u0(tag, inlineDescriptor) : super.P(tag, inlineDescriptor);
    }

    @Override // di.d1
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void Q(String tag, int i10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, ei.j.b(Integer.valueOf(i10)));
    }

    @Override // di.d1
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void R(String tag, long j10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, ei.j.b(Long.valueOf(j10)));
    }

    public void p0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, JsonNull.INSTANCE);
    }

    @Override // di.d1
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void S(String tag, short s10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, ei.j.b(Short.valueOf(s10)));
    }

    @Override // di.d1
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void T(String tag, String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        w0(tag, ei.j.c(value));
    }

    public abstract JsonElement s0();

    @Override // di.d1, ci.f
    public ci.f t(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (W() == null) {
            return new H(this.f46755b, this.f46756c).t(descriptor);
        }
        if (this.f46758e != null) {
            this.f46759f = descriptor.h();
        }
        return super.t(descriptor);
    }

    public final Function1 t0() {
        return this.f46756c;
    }

    @Override // ci.f
    public void u() {
        String str = (String) W();
        if (str == null) {
            this.f46756c.invoke(JsonNull.INSTANCE);
        } else {
            p0(str);
        }
    }

    public final a u0(String str, bi.f fVar) {
        return new a(str, fVar);
    }

    public final b v0(String str) {
        return new b(str);
    }

    public abstract void w0(String str, JsonElement jsonElement);

    public AbstractC4289e(AbstractC4212b abstractC4212b, Function1 function1) {
        this.f46755b = abstractC4212b;
        this.f46756c = function1;
        this.f46757d = abstractC4212b.f();
    }

    @Override // ci.f
    public void A() {
    }
}
