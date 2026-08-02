package wd;

import com.google.protobuf.DescriptorProtos$FileOptions;
import ie.C7056e;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import je.B0;
import je.C7396p;
import je.C7404y;
import je.F0;
import je.H0;
import je.L0;
import je.o0;
import je.s0;
import je.y0;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import td.AbstractC9853s;
import td.C9816G;
import td.C9858x;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9834Z;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9843i;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import td.i0;
import td.n0;
import ud.InterfaceC10030h;

/* renamed from: wd.F, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10514F extends G {

    /* renamed from: a, reason: collision with root package name */
    private final G f104181a;

    /* renamed from: b, reason: collision with root package name */
    private final F0 f104182b;

    /* renamed from: c, reason: collision with root package name */
    private F0 f104183c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f104184d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f104185e;

    /* renamed from: f, reason: collision with root package name */
    private je.r f104186f;

    /* renamed from: wd.F$a */
    final class a implements Function1<i0, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(i0 i0Var) {
            return Boolean.valueOf(!i0Var.D());
        }
    }

    /* renamed from: wd.F$b */
    final class b implements Function1<je.Y, je.Y> {
        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final je.Y invoke(je.Y y11) {
            return C10514F.C0(C10514F.this, y11);
        }
    }

    public C10514F(G g10, F0 f02) {
        this.f104181a = g10;
        this.f104182b = f02;
    }

    static je.Y C0(C10514F c10514f, je.Y y11) {
        if (y11 != null) {
            return c10514f.f104182b.i() ? y11 : (je.Y) c10514f.F0().l(y11, L0.INVARIANT);
        }
        c10514f.getClass();
        return y11;
    }

    private F0 F0() {
        if (this.f104183c == null) {
            F0 f02 = this.f104182b;
            if (f02.i()) {
                this.f104183c = f02;
            } else {
                List<i0> parameters = this.f104181a.k().getParameters();
                this.f104184d = new ArrayList(parameters.size());
                this.f104183c = C7404y.b(parameters, f02.h(), this, this.f104184d);
                this.f104185e = C7714v.G(this.f104184d, new a());
            }
        }
        return this.f104183c;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void n0(int i11) {
        String format;
        String str = (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 8 || i11 == 10 || i11 == 13 || i11 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 8 || i11 == 10 || i11 == 13 || i11 == 23) ? 3 : 2];
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 5) {
                    if (i11 != 6) {
                        if (i11 != 8) {
                            if (i11 != 10) {
                                if (i11 != 13) {
                                    if (i11 != 23) {
                                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                    } else {
                                        objArr[0] = "substitutor";
                                    }
                                    switch (i11) {
                                        case 2:
                                        case 3:
                                        case 5:
                                        case 6:
                                        case 8:
                                        case 10:
                                        case 13:
                                        case 23:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                            break;
                                        case 4:
                                        case 7:
                                        case 9:
                                        case 11:
                                            objArr[1] = "getMemberScope";
                                            break;
                                        case 12:
                                        case 14:
                                            objArr[1] = "getUnsubstitutedMemberScope";
                                            break;
                                        case 15:
                                            objArr[1] = "getStaticScope";
                                            break;
                                        case 16:
                                            objArr[1] = "getDefaultType";
                                            break;
                                        case 17:
                                            objArr[1] = "getContextReceivers";
                                            break;
                                        case 18:
                                            objArr[1] = "getConstructors";
                                            break;
                                        case 19:
                                            objArr[1] = "getAnnotations";
                                            break;
                                        case 20:
                                            objArr[1] = "getName";
                                            break;
                                        case 21:
                                            objArr[1] = "getOriginal";
                                            break;
                                        case 22:
                                            objArr[1] = "getContainingDeclaration";
                                            break;
                                        case 24:
                                            objArr[1] = "substitute";
                                            break;
                                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                                            objArr[1] = "getKind";
                                            break;
                                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                                            objArr[1] = "getModality";
                                            break;
                                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 28:
                                            objArr[1] = "getUnsubstitutedInnerClassesScope";
                                            break;
                                        case 29:
                                            objArr[1] = "getSource";
                                            break;
                                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                            objArr[1] = "getDeclaredTypeParameters";
                                            break;
                                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                            objArr[1] = "getSealedSubclasses";
                                            break;
                                        default:
                                            objArr[1] = "getTypeConstructor";
                                            break;
                                    }
                                    if (i11 != 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 8 || i11 == 10) {
                                        objArr[2] = "getMemberScope";
                                    } else if (i11 == 13) {
                                        objArr[2] = "getUnsubstitutedMemberScope";
                                    } else if (i11 == 23) {
                                        objArr[2] = "substitute";
                                    }
                                    format = String.format(str, objArr);
                                    if (i11 == 2 && i11 != 3 && i11 != 5 && i11 != 6 && i11 != 8 && i11 != 10 && i11 != 13 && i11 != 23) {
                                        throw new IllegalStateException(format);
                                    }
                                    throw new IllegalArgumentException(format);
                                }
                            }
                        }
                    }
                }
                objArr[0] = "typeSubstitution";
                switch (i11) {
                }
                if (i11 != 2) {
                }
                objArr[2] = "getMemberScope";
                format = String.format(str, objArr);
                if (i11 == 2) {
                }
                throw new IllegalArgumentException(format);
            }
            objArr[0] = "kotlinTypeRefiner";
            switch (i11) {
            }
            if (i11 != 2) {
            }
            objArr[2] = "getMemberScope";
            format = String.format(str, objArr);
            if (i11 == 2) {
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "typeArguments";
        switch (i11) {
        }
        if (i11 != 2) {
        }
        objArr[2] = "getMemberScope";
        format = String.format(str, objArr);
        if (i11 == 2) {
        }
        throw new IllegalArgumentException(format);
    }

    @Override // td.InterfaceC9839e
    public final boolean E0() {
        return this.f104181a.E0();
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final ce.l H() {
        ce.l H11 = this.f104181a.H();
        if (H11 != null) {
            return H11;
        }
        n0(28);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final ce.l I() {
        ce.l V11 = V(Zd.e.i(Vd.i.e(this.f104181a)));
        if (V11 != null) {
            return V11;
        }
        n0(12);
        throw null;
    }

    @Override // wd.G
    @NotNull
    public final ce.l N(@NotNull B0 b02, @NotNull ke.h hVar) {
        if (hVar == null) {
            n0(6);
            throw null;
        }
        ce.l N11 = this.f104181a.N(b02, hVar);
        if (!this.f104182b.i()) {
            return new ce.u(N11, F0());
        }
        if (N11 != null) {
            return N11;
        }
        n0(7);
        throw null;
    }

    @Override // wd.G
    @NotNull
    public final ce.l V(@NotNull ke.h hVar) {
        if (hVar == null) {
            n0(13);
            throw null;
        }
        ce.l V11 = this.f104181a.V(hVar);
        if (!this.f104182b.i()) {
            return new ce.u(V11, F0());
        }
        if (V11 != null) {
            return V11;
        }
        n0(14);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final InterfaceC9834Z W() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // td.InterfaceC9845k
    public final <R, D> R X(InterfaceC9847m<R, D> interfaceC9847m, D d11) {
        return (R) interfaceC9847m.e(this, (StringBuilder) d11);
    }

    @Override // td.f0
    @NotNull
    /* renamed from: b */
    public final InterfaceC9843i b2(@NotNull F0 f02) {
        if (f02 != null) {
            return f02.i() ? this : new C10514F(this, F0.g(f02.h(), F0().h()));
        }
        n0(23);
        throw null;
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final InterfaceC9845k d() {
        InterfaceC9845k d11 = this.f104181a.d();
        if (d11 != null) {
            return d11;
        }
        n0(22);
        throw null;
    }

    @Override // td.InterfaceC9848n
    @NotNull
    public final td.d0 e() {
        return td.d0.f99392a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // td.InterfaceC9839e
    public final n0<je.Y> e0() {
        n0<je.Y> e02 = this.f104181a.e0();
        if (e02 == null) {
            return null;
        }
        b transform = new b();
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (e02 instanceof C9858x) {
            C9858x c9858x = (C9858x) e02;
            return new C9858x(c9858x.b(), (ne.h) transform.invoke(c9858x.c()));
        }
        if (!(e02 instanceof C9816G)) {
            throw new Sc.o();
        }
        List<Pair> b11 = ((C9816G) e02).b();
        ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
        for (Pair pair : b11) {
            arrayList.add(new Pair((Sd.f) pair.a(), transform.invoke((ne.h) pair.b())));
        }
        return new C9816G(arrayList);
    }

    @Override // td.InterfaceC9843i
    public final boolean g() {
        return this.f104181a.g();
    }

    @Override // td.InterfaceC9811B
    public final boolean g0() {
        return this.f104181a.g0();
    }

    @Override // ud.InterfaceC10023a
    @NotNull
    public final InterfaceC10030h getAnnotations() {
        InterfaceC10030h annotations = this.f104181a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        n0(19);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final EnumC9840f getKind() {
        EnumC9840f kind = this.f104181a.getKind();
        if (kind != null) {
            return kind;
        }
        n0(25);
        throw null;
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final Sd.f getName() {
        Sd.f name = this.f104181a.getName();
        if (name != null) {
            return name;
        }
        n0(20);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B, td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        AbstractC9853s visibility = this.f104181a.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        n0(27);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B
    @NotNull
    public final EnumC9812C h() {
        EnumC9812C h11 = this.f104181a.h();
        if (h11 != null) {
            return h11;
        }
        n0(26);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final List<InterfaceC9834Z> h0() {
        List<InterfaceC9834Z> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        n0(17);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final ce.l i0(@NotNull B0 b02) {
        return N(b02, Zd.e.i(Vd.i.e(this)));
    }

    @Override // td.InterfaceC9811B
    public final boolean isExternal() {
        return this.f104181a.isExternal();
    }

    @Override // td.InterfaceC9839e
    public final boolean isInline() {
        return this.f104181a.isInline();
    }

    @Override // td.InterfaceC9839e
    public final boolean j0() {
        return this.f104181a.j0();
    }

    @Override // td.InterfaceC9842h
    @NotNull
    public final s0 k() {
        s0 k11 = this.f104181a.k();
        if (this.f104182b.i()) {
            if (k11 != null) {
                return k11;
            }
            n0(0);
            throw null;
        }
        if (this.f104186f == null) {
            F0 F02 = F0();
            Collection<je.N> o11 = k11.o();
            ArrayList arrayList = new ArrayList(o11.size());
            Iterator<je.N> it = o11.iterator();
            while (it.hasNext()) {
                arrayList.add(F02.l(it.next(), L0.INVARIANT));
            }
            this.f104186f = new je.r(this, this.f104184d, arrayList, C7056e.f66260e);
        }
        je.r rVar = this.f104186f;
        if (rVar != null) {
            return rVar;
        }
        n0(1);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final Collection<InterfaceC9838d> l() {
        Collection<InterfaceC9838d> l11 = this.f104181a.l();
        ArrayList arrayList = new ArrayList(l11.size());
        for (InterfaceC9838d interfaceC9838d : l11) {
            arrayList.add(((InterfaceC9838d) interfaceC9838d.U().g(interfaceC9838d.n0()).l(interfaceC9838d.h()).n(interfaceC9838d.getVisibility()).b(interfaceC9838d.getKind()).k().build()).b2(F0()));
        }
        return arrayList;
    }

    @Override // td.InterfaceC9839e
    public final boolean l0() {
        return this.f104181a.l0();
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final Collection<InterfaceC9839e> m() {
        Collection<InterfaceC9839e> m11 = this.f104181a.m();
        if (m11 != null) {
            return m11;
        }
        n0(31);
        throw null;
    }

    @Override // td.InterfaceC9811B
    public final boolean p0() {
        return this.f104181a.p0();
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9842h
    @NotNull
    public final je.Y q() {
        o0 f7;
        List<y0> e11 = H0.e(k().getParameters());
        InterfaceC10030h annotations = getAnnotations();
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (annotations.isEmpty()) {
            o0.f69907b.getClass();
            f7 = o0.f69908c;
        } else {
            o0.a aVar = o0.f69907b;
            List a02 = C7714v.a0(new C7396p(annotations));
            aVar.getClass();
            f7 = o0.a.f(a02);
        }
        return je.Q.g(I(), e11, f7, k(), false);
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final ce.l q0() {
        ce.l q02 = this.f104181a.q0();
        if (q02 != null) {
            return q02;
        }
        n0(15);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9843i
    @NotNull
    public final List<i0> r() {
        F0();
        ArrayList arrayList = this.f104185e;
        if (arrayList != null) {
            return arrayList;
        }
        n0(30);
        throw null;
    }

    @Override // td.InterfaceC9839e
    public final InterfaceC9839e r0() {
        return this.f104181a.r0();
    }

    @Override // td.InterfaceC9839e
    public final boolean s() {
        return this.f104181a.s();
    }

    @Override // td.InterfaceC9839e
    public final InterfaceC9838d z() {
        return this.f104181a.z();
    }

    @Override // wd.G, td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    public final InterfaceC9839e n0() {
        InterfaceC9839e n02 = this.f104181a.n0();
        if (n02 != null) {
            return n02;
        }
        n0(21);
        throw null;
    }
}
