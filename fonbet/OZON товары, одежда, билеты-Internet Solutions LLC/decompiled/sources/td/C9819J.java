package td;

import ce.l;
import ie.C7056e;
import ie.InterfaceC7059h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import je.L0;
import kd.C7665d;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10030h;
import wd.AbstractC10529o;
import wd.C10533t;

/* renamed from: td.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9819J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7056e f99367a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9815F f99368b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC7059h<Sd.c, InterfaceC9820K> f99369c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC7059h<a, InterfaceC9839e> f99370d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: td.J$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Sd.b f99371a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<Integer> f99372b;

        public a(@NotNull Sd.b classId, @NotNull List<Integer> typeParametersCount) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
            this.f99371a = classId;
            this.f99372b = typeParametersCount;
        }

        @NotNull
        public final Sd.b a() {
            return this.f99371a;
        }

        @NotNull
        public final List<Integer> b() {
            return this.f99372b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f99371a, aVar.f99371a) && Intrinsics.d(this.f99372b, aVar.f99372b);
        }

        public final int hashCode() {
            return this.f99372b.hashCode() + (this.f99371a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ClassRequest(classId=" + this.f99371a + ", typeParametersCount=" + this.f99372b + ')';
        }
    }

    /* renamed from: td.J$b */
    public static final class b extends AbstractC10529o {

        /* renamed from: g, reason: collision with root package name */
        private final boolean f99373g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final ArrayList f99374h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final je.r f99375i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C7056e storageManager, @NotNull InterfaceC9841g container, @NotNull Sd.f name, boolean z11, int i11) {
            super(storageManager, container, name, d0.f99392a);
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f99373g = z11;
            IntRange o11 = kotlin.ranges.h.o(0, i11);
            ArrayList arrayList = new ArrayList(C7714v.z(o11, 10));
            C7665d it = o11.iterator();
            while (it.hasNext()) {
                int b11 = it.b();
                C7056e c7056e = storageManager;
                arrayList.add(wd.a0.J0(this, InterfaceC10030h.a.b(), L0.INVARIANT, Sd.f.f("T" + b11), b11, c7056e));
                storageManager = c7056e;
            }
            this.f99374h = arrayList;
            this.f99375i = new je.r(this, m0.c(this), kotlin.collections.e0.h(Zd.e.j(this).n().i()), storageManager);
        }

        @Override // td.InterfaceC9839e
        public final boolean E0() {
            return false;
        }

        @Override // wd.G
        public final ce.l V(ke.h kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return l.b.f57046b;
        }

        @Override // td.InterfaceC9839e
        public final n0<je.Y> e0() {
            return null;
        }

        @Override // td.InterfaceC9843i
        public final boolean g() {
            return this.f99373g;
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
            return EnumC9840f.CLASS;
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
            return EnumC9812C.FINAL;
        }

        @Override // wd.AbstractC10529o, td.InterfaceC9811B
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
        public final je.s0 k() {
            return this.f99375i;
        }

        @Override // td.InterfaceC9839e
        @NotNull
        public final Collection<InterfaceC9838d> l() {
            return kotlin.collections.M.f71699a;
        }

        @Override // td.InterfaceC9839e
        public final boolean l0() {
            return false;
        }

        @Override // td.InterfaceC9839e
        @NotNull
        public final Collection<InterfaceC9839e> m() {
            return kotlin.collections.K.f71697a;
        }

        @Override // td.InterfaceC9811B
        public final boolean p0() {
            return false;
        }

        @Override // td.InterfaceC9839e
        public final ce.l q0() {
            return l.b.f57046b;
        }

        @Override // td.InterfaceC9839e, td.InterfaceC9843i
        @NotNull
        public final List<i0> r() {
            return this.f99374h;
        }

        @Override // td.InterfaceC9839e
        public final InterfaceC9839e r0() {
            return null;
        }

        @Override // td.InterfaceC9839e
        public final boolean s() {
            return false;
        }

        @NotNull
        public final String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // td.InterfaceC9839e
        public final InterfaceC9838d z() {
            return null;
        }
    }

    public C9819J(@NotNull C7056e storageManager, @NotNull InterfaceC9815F module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f99367a = storageManager;
        this.f99368b = module;
        this.f99369c = storageManager.d(new C9817H(this));
        this.f99370d = storageManager.d(new C9818I(this));
    }

    static C10533t a(C9819J c9819j, Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return new C10533t(c9819j.f99368b, fqName);
    }

    static b b(C9819J c9819j, a aVar) {
        InterfaceC9820K invoke;
        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
        Sd.b a11 = aVar.a();
        List<Integer> b11 = aVar.b();
        if (a11.i()) {
            throw new UnsupportedOperationException("Unresolved local class: " + a11);
        }
        Sd.b e11 = a11.e();
        if (e11 == null || (invoke = c9819j.c(e11, C7714v.D(b11, 1))) == null) {
            invoke = c9819j.f99369c.invoke(a11.f());
        }
        InterfaceC9841g interfaceC9841g = invoke;
        boolean j11 = a11.j();
        C7056e c7056e = c9819j.f99367a;
        Sd.f h11 = a11.h();
        Integer num = (Integer) C7714v.M(b11);
        return new b(c7056e, interfaceC9841g, h11, j11, num != null ? num.intValue() : 0);
    }

    @NotNull
    public final InterfaceC9839e c(@NotNull Sd.b classId, @NotNull List<Integer> typeParametersCount) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
        return this.f99370d.invoke(new a(classId, typeParametersCount));
    }
}
