package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ie.InterfaceC7061j;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import je.AbstractC7394n;
import je.L0;
import je.s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import td.InterfaceC9848n;
import td.g0;
import td.i0;
import ud.InterfaceC10030h;

/* renamed from: wd.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10527m extends AbstractC10532s implements i0 {

    /* renamed from: e, reason: collision with root package name */
    private final L0 f104306e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f104307f;

    /* renamed from: g, reason: collision with root package name */
    private final int f104308g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC7061j<s0> f104309h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC7061j<je.Y> f104310i;

    /* renamed from: j, reason: collision with root package name */
    private final ie.o f104311j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wd.m$a */
    /* loaded from: classes10.dex */
    class a extends AbstractC7394n {

        /* renamed from: c, reason: collision with root package name */
        private final g0 f104312c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC10527m f104313d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull AbstractC10527m abstractC10527m, ie.o oVar, g0 g0Var) {
            super(oVar);
            if (oVar == null) {
                k(0);
                throw null;
            }
            this.f104313d = abstractC10527m;
            this.f104312c = g0Var;
        }

        private static /* synthetic */ void k(int i11) {
            String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8) ? 2 : 3];
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i11 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i11 == 2) {
                objArr[1] = "getParameters";
            } else if (i11 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i11 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i11 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i11 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 8) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // je.AbstractC7398s
        protected final boolean b(@NotNull InterfaceC9842h interfaceC9842h) {
            boolean b11;
            if (!(interfaceC9842h instanceof i0)) {
                return false;
            }
            Vd.g gVar = Vd.g.f28542a;
            i0 b12 = (i0) interfaceC9842h;
            AbstractC10527m a11 = this.f104313d;
            Intrinsics.checkNotNullParameter(a11, "a");
            Intrinsics.checkNotNullParameter(b12, "b");
            b11 = gVar.b(a11, b12, true, Vd.d.f28536a);
            return b11;
        }

        @Override // je.AbstractC7394n
        @NotNull
        protected final Collection<je.N> d() {
            List<je.N> G02 = this.f104313d.G0();
            if (G02 != null) {
                return G02;
            }
            k(1);
            throw null;
        }

        @Override // je.AbstractC7394n
        protected final je.N e() {
            return le.l.c(le.k.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // je.AbstractC7394n
        @NotNull
        protected final g0 g() {
            g0 g0Var = this.f104312c;
            if (g0Var != null) {
                return g0Var;
            }
            k(5);
            throw null;
        }

        @Override // je.s0
        @NotNull
        public final List<i0> getParameters() {
            List<i0> list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            k(2);
            throw null;
        }

        @Override // je.AbstractC7394n
        @NotNull
        protected final List<je.N> i(@NotNull List<je.N> list) {
            if (list == null) {
                k(7);
                throw null;
            }
            List<je.N> C02 = this.f104313d.C0(list);
            if (C02 != null) {
                return C02;
            }
            k(8);
            throw null;
        }

        @Override // je.AbstractC7394n
        protected final void j(@NotNull je.N n11) {
            if (n11 != null) {
                this.f104313d.F0(n11);
            } else {
                k(6);
                throw null;
            }
        }

        @Override // je.s0
        @NotNull
        public final qd.m n() {
            qd.m e11 = Zd.e.e(this.f104313d);
            if (e11 != null) {
                return e11;
            }
            k(4);
            throw null;
        }

        @Override // je.s0
        @NotNull
        public final InterfaceC9842h p() {
            AbstractC10527m abstractC10527m = this.f104313d;
            if (abstractC10527m != null) {
                return abstractC10527m;
            }
            k(3);
            throw null;
        }

        @Override // je.s0
        public final boolean q() {
            return true;
        }

        public final String toString() {
            return this.f104313d.getName().toString();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected AbstractC10527m(@NotNull ie.o oVar, @NotNull InterfaceC9845k interfaceC9845k, @NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.f fVar, @NotNull L0 l02, boolean z11, int i11, @NotNull g0 g0Var) {
        super(interfaceC9845k, interfaceC10030h, fVar, r0);
        td.d0 d0Var = td.d0.f99392a;
        if (oVar == null) {
            N(0);
            throw null;
        }
        if (interfaceC9845k == null) {
            N(1);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(2);
            throw null;
        }
        if (fVar == null) {
            N(3);
            throw null;
        }
        if (l02 == null) {
            N(4);
            throw null;
        }
        if (g0Var == null) {
            N(6);
            throw null;
        }
        this.f104306e = l02;
        this.f104307f = z11;
        this.f104308g = i11;
        this.f104309h = oVar.a(new C10524j(this, oVar, g0Var));
        this.f104310i = oVar.a(new C10526l(this, fVar));
        this.f104311j = oVar;
    }

    private static /* synthetic */ void N(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i12 = 2;
                break;
            case 12:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i11) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @NotNull
    protected List<je.N> C0(@NotNull List<je.N> list) {
        if (list == null) {
            N(12);
            throw null;
        }
        if (list != null) {
            return list;
        }
        N(13);
        throw null;
    }

    @Override // td.i0
    public final boolean D() {
        return false;
    }

    protected abstract void F0(@NotNull je.N n11);

    @NotNull
    protected abstract List<je.N> G0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // td.InterfaceC9845k
    public final <R, D> R X(InterfaceC9847m<R, D> interfaceC9847m, D d11) {
        return (R) interfaceC9847m.d(this, (StringBuilder) d11);
    }

    @Override // wd.AbstractC10532s, wd.r, td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    public final InterfaceC9842h n0() {
        return this;
    }

    @Override // td.i0
    public final int getIndex() {
        return this.f104308g;
    }

    @Override // td.i0
    @NotNull
    public final ie.o getStorageManager() {
        ie.o oVar = this.f104311j;
        if (oVar != null) {
            return oVar;
        }
        N(14);
        throw null;
    }

    @Override // td.i0
    @NotNull
    public final List<je.N> getUpperBounds() {
        List<je.N> o11 = ((a) k()).o();
        if (o11 != null) {
            return o11;
        }
        N(8);
        throw null;
    }

    @Override // td.i0, td.InterfaceC9842h
    @NotNull
    public final s0 k() {
        s0 invoke = this.f104309h.invoke();
        if (invoke != null) {
            return invoke;
        }
        N(9);
        throw null;
    }

    @Override // wd.AbstractC10532s
    @NotNull
    public final InterfaceC9848n n0() {
        return this;
    }

    @Override // td.InterfaceC9842h
    @NotNull
    public final je.Y q() {
        je.Y invoke = this.f104310i.invoke();
        if (invoke != null) {
            return invoke;
        }
        N(10);
        throw null;
    }

    @Override // td.i0
    public final boolean w() {
        return this.f104307f;
    }

    @Override // td.i0
    @NotNull
    public final L0 x() {
        L0 l02 = this.f104306e;
        if (l02 != null) {
            return l02;
        }
        N(7);
        throw null;
    }

    @Override // wd.AbstractC10532s, wd.r, td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    public final InterfaceC9845k n0() {
        return this;
    }

    @Override // wd.AbstractC10532s, wd.r, td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    public final i0 n0() {
        return this;
    }
}
