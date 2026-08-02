package fi;

import bi.n;
import di.AbstractC4079b;
import ei.AbstractC4212b;
import ei.C4216f;
import fi.T;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class V extends ci.b implements ei.s {

    /* renamed from: a, reason: collision with root package name */
    public final C4298n f46735a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4212b f46736b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f46737c;

    /* renamed from: d, reason: collision with root package name */
    public final gi.e f46738d;

    /* renamed from: e, reason: collision with root package name */
    public final C4216f f46739e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46740f;

    /* renamed from: g, reason: collision with root package name */
    public String f46741g;

    /* renamed from: h, reason: collision with root package name */
    public String f46742h;

    @Nullable
    private final ei.s[] modeReuseCache;

    public static final /* synthetic */ class a {
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public V(C4298n composer, AbstractC4212b json, e0 mode, ei.s[] sVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f46735a = composer;
        this.f46736b = json;
        this.f46737c = mode;
        this.modeReuseCache = sVarArr;
        this.f46738d = d().a();
        this.f46739e = d().f();
        int ordinal = mode.ordinal();
        if (sVarArr != null) {
            ei.s sVar = sVarArr[ordinal];
            if (sVar == null && sVar == this) {
                return;
            }
            sVarArr[ordinal] = this;
        }
    }

    @Override // ci.b, ci.d
    public void C(bi.f descriptor, int i10, Zh.p serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f46739e.j()) {
            super.C(descriptor, i10, serializer, obj);
        }
    }

    @Override // ei.s
    public void D(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.f46741g == null || (element instanceof JsonObject)) {
            i(ei.q.f46124a, element);
        } else {
            T.d(this.f46742h, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ci.b, ci.f
    public void E(int i10) {
        if (this.f46740f) {
            H(String.valueOf(i10));
        } else {
            this.f46735a.i(i10);
        }
    }

    @Override // ci.b, ci.f
    public void H(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f46735a.n(value);
    }

    @Override // ci.b
    public boolean I(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i11 = a.$EnumSwitchMapping$0[this.f46737c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f46735a.a()) {
                        this.f46735a.f(',');
                    }
                    this.f46735a.c();
                    H(E.h(descriptor, d(), i10));
                    this.f46735a.f(':');
                    this.f46735a.p();
                } else {
                    if (i10 == 0) {
                        this.f46740f = true;
                    }
                    if (i10 == 1) {
                        this.f46735a.f(',');
                        this.f46735a.p();
                        this.f46740f = false;
                    }
                }
            } else if (this.f46735a.a()) {
                this.f46740f = true;
                this.f46735a.c();
            } else {
                if (i10 % 2 == 0) {
                    this.f46735a.f(',');
                    this.f46735a.c();
                    z10 = true;
                } else {
                    this.f46735a.f(':');
                    this.f46735a.p();
                }
                this.f46740f = z10;
            }
        } else {
            if (!this.f46735a.a()) {
                this.f46735a.f(',');
            }
            this.f46735a.c();
        }
        return true;
    }

    public final void K(String str, String str2) {
        this.f46735a.c();
        H(str);
        this.f46735a.f(':');
        this.f46735a.p();
        H(str2);
    }

    @Override // ci.f
    public gi.e a() {
        return this.f46738d;
    }

    @Override // ci.b, ci.d
    public void b(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f46737c.f46772b != 0) {
            this.f46735a.q();
            this.f46735a.d();
            this.f46735a.f(this.f46737c.f46772b);
        }
    }

    @Override // ci.b, ci.f
    public ci.d c(bi.f descriptor) {
        ei.s sVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        e0 b10 = f0.b(d(), descriptor);
        char c10 = b10.f46771a;
        if (c10 != 0) {
            this.f46735a.f(c10);
            this.f46735a.b();
        }
        String str = this.f46741g;
        if (str != null) {
            String str2 = this.f46742h;
            if (str2 == null) {
                str2 = descriptor.h();
            }
            K(str, str2);
            this.f46741g = null;
            this.f46742h = null;
        }
        if (this.f46737c == b10) {
            return this;
        }
        ei.s[] sVarArr = this.modeReuseCache;
        return (sVarArr == null || (sVar = sVarArr[b10.ordinal()]) == null) ? new V(this.f46735a, d(), b10, this.modeReuseCache) : sVar;
    }

    @Override // ei.s
    public AbstractC4212b d() {
        return this.f46736b;
    }

    @Override // ci.b, ci.f
    public void g(double d10) {
        if (this.f46740f) {
            H(String.valueOf(d10));
        } else {
            this.f46735a.g(d10);
        }
        if (!this.f46739e.b() && Math.abs(d10) > Double.MAX_VALUE) {
            throw C.b(Double.valueOf(d10), this.f46735a.f46778a.toString());
        }
    }

    @Override // ci.b, ci.f
    public void h(byte b10) {
        if (this.f46740f) {
            H(String.valueOf((int) b10));
        } else {
            this.f46735a.e(b10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, bi.n.d.f25233a) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (d().f().f() != ei.EnumC4211a.f46075a) goto L21;
     */
    @Override // ci.b, ci.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(Zh.p serializer, Object obj) {
        String c10;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
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
            this.f46741g = c10;
            this.f46742h = h10;
        }
        serializer.serialize(this, obj);
    }

    @Override // ci.b, ci.d
    public boolean m(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f46739e.i();
    }

    @Override // ci.b, ci.f
    public void o(bi.f enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        H(enumDescriptor.e(i10));
    }

    @Override // ci.b, ci.f
    public void s(long j10) {
        if (this.f46740f) {
            H(String.valueOf(j10));
        } else {
            this.f46735a.j(j10);
        }
    }

    @Override // ci.b, ci.f
    public ci.f t(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (W.b(descriptor)) {
            C4298n c4298n = this.f46735a;
            if (!(c4298n instanceof r)) {
                c4298n = new r(c4298n.f46778a, this.f46740f);
            }
            return new V(c4298n, d(), this.f46737c, (ei.s[]) null);
        }
        if (W.a(descriptor)) {
            C4298n c4298n2 = this.f46735a;
            if (!(c4298n2 instanceof C4299o)) {
                c4298n2 = new C4299o(c4298n2.f46778a, this.f46740f);
            }
            return new V(c4298n2, d(), this.f46737c, (ei.s[]) null);
        }
        if (this.f46741g == null) {
            return super.t(descriptor);
        }
        this.f46742h = descriptor.h();
        return this;
    }

    @Override // ci.b, ci.f
    public void u() {
        this.f46735a.k("null");
    }

    @Override // ci.b, ci.f
    public void v(short s10) {
        if (this.f46740f) {
            H(String.valueOf((int) s10));
        } else {
            this.f46735a.l(s10);
        }
    }

    @Override // ci.b, ci.f
    public void w(boolean z10) {
        if (this.f46740f) {
            H(String.valueOf(z10));
        } else {
            this.f46735a.m(z10);
        }
    }

    @Override // ci.b, ci.f
    public void y(float f10) {
        if (this.f46740f) {
            H(String.valueOf(f10));
        } else {
            this.f46735a.h(f10);
        }
        if (!this.f46739e.b() && Math.abs(f10) > Float.MAX_VALUE) {
            throw C.b(Float.valueOf(f10), this.f46735a.f46778a.toString());
        }
    }

    @Override // ci.b, ci.f
    public void z(char c10) {
        H(String.valueOf(c10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V(InterfaceC4306w output, AbstractC4212b json, e0 mode, ei.s[] modeReuseCache) {
        this(AbstractC4303t.a(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }
}
