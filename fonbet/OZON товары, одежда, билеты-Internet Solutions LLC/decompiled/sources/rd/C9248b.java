package rd;

import ce.l;
import ie.C7056e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.A0;
import je.AbstractC7370b;
import je.L0;
import je.N;
import je.Q;
import je.Y;
import je.o0;
import je.s0;
import kd.C7665d;
import ke.h;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import qd.s;
import rd.AbstractC9252f;
import rd.EnumC9249c;
import td.AbstractC9853s;
import td.C9852r;
import td.C9856v;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9815F;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.d0;
import td.g0;
import td.i0;
import td.n0;
import ud.InterfaceC10030h;
import ue.C10043a;
import wd.AbstractC10516b;
import wd.a0;

/* renamed from: rd.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9248b extends AbstractC10516b {

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final Sd.b f83293l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final Sd.b f83294m;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C7056e f83295e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final qd.c f83296f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final AbstractC9252f f83297g;

    /* renamed from: h, reason: collision with root package name */
    private final int f83298h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final a f83299i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C9250d f83300j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<i0> f83301k;

    /* renamed from: rd.b$a */
    private final class a extends AbstractC7370b {
        public a() {
            super(C9248b.this.f83295e);
        }

        @Override // je.AbstractC7394n
        @NotNull
        protected final Collection<N> d() {
            List b02;
            C9248b c9248b = C9248b.this;
            AbstractC9252f L02 = c9248b.L0();
            AbstractC9252f.a aVar = AbstractC9252f.a.f83305c;
            if (Intrinsics.d(L02, aVar)) {
                b02 = C7714v.a0(C9248b.f83293l);
            } else if (Intrinsics.d(L02, AbstractC9252f.b.f83306c)) {
                b02 = C7714v.b0(C9248b.f83294m, new Sd.b(s.f81865l, aVar.c(c9248b.K0())));
            } else {
                AbstractC9252f.d dVar = AbstractC9252f.d.f83308c;
                if (Intrinsics.d(L02, dVar)) {
                    b02 = C7714v.a0(C9248b.f83293l);
                } else {
                    if (!Intrinsics.d(L02, AbstractC9252f.c.f83307c)) {
                        int i11 = C10043a.f100664a;
                        Intrinsics.checkNotNullParameter("should not be called", "message");
                        throw new IllegalStateException("should not be called");
                    }
                    b02 = C7714v.b0(C9248b.f83294m, new Sd.b(s.f81859f, dVar.c(c9248b.K0())));
                }
            }
            InterfaceC9815F d11 = c9248b.f83296f.d();
            List<Sd.b> list = b02;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (Sd.b bVar : list) {
                InterfaceC9839e a11 = C9856v.a(d11, bVar);
                if (a11 == null) {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
                List L03 = C7714v.L0(a11.k().getParameters().size(), c9248b.f83301k);
                ArrayList arrayList2 = new ArrayList(C7714v.z(L03, 10));
                Iterator it = L03.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new A0(((i0) it.next()).q()));
                }
                o0.f69907b.getClass();
                arrayList.add(Q.e(o0.f69908c, a11, arrayList2));
            }
            return C7714v.U0(arrayList);
        }

        @Override // je.AbstractC7394n
        @NotNull
        protected final g0 g() {
            return g0.a.f99394a;
        }

        @Override // je.s0
        @NotNull
        public final List<i0> getParameters() {
            return C9248b.this.f83301k;
        }

        @Override // je.AbstractC7370b
        /* renamed from: l */
        public final InterfaceC9839e p() {
            return C9248b.this;
        }

        @Override // je.AbstractC7370b, je.s0
        public final InterfaceC9842h p() {
            return C9248b.this;
        }

        @Override // je.s0
        public final boolean q() {
            return true;
        }

        @NotNull
        public final String toString() {
            return C9248b.this.toString();
        }
    }

    static {
        Sd.c cVar = s.f81865l;
        Sd.f f7 = Sd.f.f("Function");
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        f83293l = new Sd.b(cVar, f7);
        Sd.c cVar2 = s.f81862i;
        Sd.f f11 = Sd.f.f("KFunction");
        Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
        f83294m = new Sd.b(cVar2, f11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9248b(@NotNull C7056e storageManager, @NotNull qd.c containingDeclaration, @NotNull AbstractC9252f functionTypeKind, int i11) {
        super(storageManager, functionTypeKind.c(i11));
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(functionTypeKind, "functionTypeKind");
        this.f83295e = storageManager;
        this.f83296f = containingDeclaration;
        this.f83297g = functionTypeKind;
        this.f83298h = i11;
        this.f83299i = new a();
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(this, "containingClass");
        this.f83300j = new C9250d(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i11, 1);
        ArrayList arrayList2 = new ArrayList(C7714v.z(intRange, 10));
        C7665d it = intRange.iterator();
        while (it.hasNext()) {
            int b11 = it.b();
            arrayList.add(a0.J0(this, InterfaceC10030h.a.b(), L0.IN_VARIANCE, Sd.f.f(Ej.b.a(b11, "P")), arrayList.size(), this.f83295e));
            arrayList2.add(Unit.f71690a);
        }
        arrayList.add(a0.J0(this, InterfaceC10030h.a.b(), L0.OUT_VARIANCE, Sd.f.f("R"), arrayList.size(), this.f83295e));
        this.f83301k = C7714v.U0(arrayList);
        EnumC9249c.a aVar = EnumC9249c.Companion;
        AbstractC9252f functionTypeKind2 = this.f83297g;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(functionTypeKind2, "functionTypeKind");
        if (Intrinsics.d(functionTypeKind2, AbstractC9252f.a.f83305c) || Intrinsics.d(functionTypeKind2, AbstractC9252f.d.f83308c) || Intrinsics.d(functionTypeKind2, AbstractC9252f.b.f83306c)) {
            return;
        }
        Intrinsics.d(functionTypeKind2, AbstractC9252f.c.f83307c);
    }

    @Override // td.InterfaceC9839e
    public final boolean E0() {
        return false;
    }

    public final int K0() {
        return this.f83298h;
    }

    @NotNull
    public final AbstractC9252f L0() {
        return this.f83297g;
    }

    @Override // wd.G
    public final l V(h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f83300j;
    }

    @Override // td.InterfaceC9845k
    public final InterfaceC9845k d() {
        return this.f83296f;
    }

    @Override // td.InterfaceC9848n
    @NotNull
    public final d0 e() {
        d0 NO_SOURCE = d0.f99392a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // td.InterfaceC9839e
    public final n0<Y> e0() {
        return null;
    }

    @Override // td.InterfaceC9843i
    public final boolean g() {
        return false;
    }

    @Override // td.InterfaceC9811B
    public final boolean g0() {
        return false;
    }

    @Override // ud.InterfaceC10023a
    @NotNull
    public final InterfaceC10030h getAnnotations() {
        return InterfaceC10030h.a.b();
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final EnumC9840f getKind() {
        return EnumC9840f.INTERFACE;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B, td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        AbstractC9853s PUBLIC = C9852r.f99403e;
        Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B
    @NotNull
    public final EnumC9812C h() {
        return EnumC9812C.ABSTRACT;
    }

    @Override // td.InterfaceC9811B
    public final boolean isExternal() {
        return false;
    }

    @Override // td.InterfaceC9839e
    public final boolean isInline() {
        return false;
    }

    @Override // td.InterfaceC9839e
    public final boolean j0() {
        return false;
    }

    @Override // td.InterfaceC9842h
    @NotNull
    public final s0 k() {
        return this.f83299i;
    }

    @Override // td.InterfaceC9839e
    public final Collection l() {
        return K.f71697a;
    }

    @Override // td.InterfaceC9839e
    public final boolean l0() {
        return false;
    }

    @Override // td.InterfaceC9839e
    public final Collection m() {
        return K.f71697a;
    }

    @Override // td.InterfaceC9811B
    public final boolean p0() {
        return false;
    }

    @Override // td.InterfaceC9839e
    public final l q0() {
        return l.b.f57046b;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9843i
    @NotNull
    public final List<i0> r() {
        return this.f83301k;
    }

    @Override // td.InterfaceC9839e
    public final /* bridge */ /* synthetic */ InterfaceC9839e r0() {
        return null;
    }

    @Override // td.InterfaceC9839e
    public final boolean s() {
        return false;
    }

    @NotNull
    public final String toString() {
        String b11 = getName().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        return b11;
    }

    @Override // td.InterfaceC9839e
    public final /* bridge */ /* synthetic */ InterfaceC9838d z() {
        return null;
    }
}
