package ug;

import androidx.appcompat.widget.y;
import com.android.billingclient.api.l0;
import com.android.billingclient.api.u0;
import k2.x;
import kotlin.jvm.internal.Intrinsics;
import sg.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f24306a;

    /* renamed from: b, reason: collision with root package name */
    public final tg.c f24307b;

    /* renamed from: c, reason: collision with root package name */
    public final w f24308c;

    /* renamed from: d, reason: collision with root package name */
    public final s[] f24309d;

    /* renamed from: e, reason: collision with root package name */
    public final c4.d f24310e;

    /* renamed from: f, reason: collision with root package name */
    public final y f24311f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24312g;

    /* renamed from: h, reason: collision with root package name */
    public String f24313h;

    /* renamed from: i, reason: collision with root package name */
    public String f24314i;

    public s(u0 composer, tg.c json, w mode, s[] sVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f24306a = composer;
        this.f24307b = json;
        this.f24308c = mode;
        this.f24309d = sVarArr;
        this.f24310e = json.f23938b;
        this.f24311f = json.f23937a;
        int ordinal = mode.ordinal();
        if (sVarArr != null) {
            s sVar = sVarArr[ordinal];
            if (sVar == null && sVar == this) {
                return;
            }
            sVarArr[ordinal] = this;
        }
    }

    public final s a(qg.g descriptor) {
        s sVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        tg.c cVar = this.f24307b;
        w r5 = j.r(descriptor, cVar);
        char c2 = r5.f24329a;
        u0 u0Var = this.f24306a;
        u0Var.e(c2);
        u0Var.f4106a = true;
        String str = this.f24313h;
        if (str != null) {
            String str2 = this.f24314i;
            if (str2 == null) {
                str2 = descriptor.a();
            }
            u0Var.c();
            r(str);
            u0Var.e(':');
            r(str2);
            this.f24313h = null;
            this.f24314i = null;
        }
        if (this.f24308c == r5) {
            return this;
        }
        s[] sVarArr = this.f24309d;
        return (sVarArr == null || (sVar = sVarArr[r5.ordinal()]) == null) ? new s(u0Var, cVar, r5, sVarArr) : sVar;
    }

    public final void b(boolean z5) {
        if (this.f24312g) {
            r(String.valueOf(z5));
        } else {
            ((l0) this.f24306a.f4107b).n(String.valueOf(z5));
        }
    }

    public final void c(byte b10) {
        if (this.f24312g) {
            r(String.valueOf((int) b10));
        } else {
            this.f24306a.d(b10);
        }
    }

    public final void d(char c2) {
        r(String.valueOf(c2));
    }

    public final void e(double d10) {
        boolean z5 = this.f24312g;
        u0 u0Var = this.f24306a;
        if (z5) {
            r(String.valueOf(d10));
        } else {
            ((l0) u0Var.f4107b).n(String.valueOf(d10));
        }
        if (Math.abs(d10) > Double.MAX_VALUE) {
            throw j.b(Double.valueOf(d10), ((l0) u0Var.f4107b).toString());
        }
    }

    public final void f(qg.g descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int ordinal = this.f24308c.ordinal();
        u0 u0Var = this.f24306a;
        boolean z5 = true;
        if (ordinal == 1) {
            if (!u0Var.f4106a) {
                u0Var.e(',');
            }
            u0Var.c();
            return;
        }
        if (ordinal == 2) {
            if (u0Var.f4106a) {
                this.f24312g = true;
                u0Var.c();
                return;
            }
            if (i5 % 2 == 0) {
                u0Var.e(',');
                u0Var.c();
            } else {
                u0Var.e(':');
                u0Var.k();
                z5 = false;
            }
            this.f24312g = z5;
            return;
        }
        if (ordinal == 3) {
            if (i5 == 0) {
                this.f24312g = true;
            }
            if (i5 == 1) {
                u0Var.e(',');
                u0Var.k();
                this.f24312g = false;
                return;
            }
            return;
        }
        if (!u0Var.f4106a) {
            u0Var.e(',');
        }
        u0Var.c();
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        tg.c json = this.f24307b;
        Intrinsics.checkNotNullParameter(json, "json");
        j.p(descriptor, json);
        r(descriptor.g(i5));
        u0Var.e(':');
        u0Var.k();
    }

    public final void g(float f6) {
        boolean z5 = this.f24312g;
        u0 u0Var = this.f24306a;
        if (z5) {
            r(String.valueOf(f6));
        } else {
            ((l0) u0Var.f4107b).n(String.valueOf(f6));
        }
        if (Math.abs(f6) > Float.MAX_VALUE) {
            throw j.b(Float.valueOf(f6), ((l0) u0Var.f4107b).toString());
        }
    }

    public final s h(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean a7 = t.a(descriptor);
        w wVar = this.f24308c;
        tg.c cVar = this.f24307b;
        u0 u0Var = this.f24306a;
        if (a7) {
            if (!(u0Var instanceof f)) {
                u0Var = new f((l0) u0Var.f4107b, this.f24312g);
            }
            return new s(u0Var, cVar, wVar, null);
        }
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        if (descriptor.isInline() && Intrinsics.areEqual(descriptor, tg.n.f23953a)) {
            if (!(u0Var instanceof e)) {
                u0Var = new e((l0) u0Var.f4107b, this.f24312g);
            }
            return new s(u0Var, cVar, wVar, null);
        }
        if (this.f24313h != null) {
            this.f24314i = descriptor.a();
            return this;
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    public final s i(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        f(descriptor, i5);
        return h(descriptor.i(i5));
    }

    public final void j(int i5) {
        if (this.f24312g) {
            r(String.valueOf(i5));
        } else {
            this.f24306a.f(i5);
        }
    }

    public final void k(int i5, int i10, qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        f(descriptor, i5);
        j(i10);
    }

    public final void l(long j) {
        if (this.f24312g) {
            r(String.valueOf(j));
        } else {
            this.f24306a.g(j);
        }
    }

    public final void m() {
        this.f24306a.h("null");
    }

    public final void n(qg.g descriptor, int i5, og.a serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f24311f.f1006c) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            f(descriptor, i5);
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            if (serializer.d().c()) {
                p(serializer, obj);
            } else if (obj == null) {
                m();
            } else {
                p(serializer, obj);
            }
        }
    }

    public final void o(qg.g descriptor, int i5, og.a serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        f(descriptor, i5);
        p(serializer, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x003f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, qg.k.f22181h) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r1 != tg.a.f23931a) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(og.a serializer, Object obj) {
        String i5;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        tg.c cVar = this.f24307b;
        tg.a aVar = (tg.a) cVar.f23937a.f1010g;
        boolean z5 = serializer instanceof sg.b;
        if (!z5) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    a.a e7 = serializer.d().e();
                    if (!Intrinsics.areEqual(e7, qg.k.f22178e)) {
                    }
                    i5 = j.i(serializer.d(), cVar);
                } else if (ordinal != 2) {
                    throw new gf.m();
                }
            }
            i5 = null;
        }
        if (z5) {
            sg.b bVar = (sg.b) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + ((og.d) bVar).d() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            serializer = x.o(bVar, this, obj);
            if (i5 != null) {
                a.a kind = serializer.d().e();
                Intrinsics.checkNotNullParameter(kind, "kind");
                if (kind instanceof qg.j) {
                    throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                }
                if (kind instanceof qg.f) {
                    throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                }
                if (kind instanceof qg.d) {
                    throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
                }
            }
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
        }
        if (i5 != null) {
            String a7 = serializer.d().a();
            this.f24313h = i5;
            this.f24314i = a7;
        }
        serializer.c(this, obj);
    }

    public final void q(short s8) {
        if (this.f24312g) {
            r(String.valueOf((int) s8));
        } else {
            this.f24306a.i(s8);
        }
    }

    public final void r(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f24306a.j(value);
    }

    public final void s(qg.g descriptor, int i5, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        f(descriptor, i5);
        r(value);
    }

    public final void t(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        u0 u0Var = this.f24306a;
        u0Var.getClass();
        u0Var.f4106a = false;
        u0Var.e(this.f24308c.f24330b);
    }

    public final c4.d u() {
        return this.f24310e;
    }
}
