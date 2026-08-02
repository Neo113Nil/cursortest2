package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ie.InterfaceC7061j;
import java.util.Collections;
import java.util.List;
import je.B0;
import je.F0;
import je.H0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9834Z;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.InterfaceC9847m;

/* renamed from: wd.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10516b extends G {

    /* renamed from: a, reason: collision with root package name */
    private final Sd.f f104272a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC7061j<je.Y> f104273b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7061j<ce.l> f104274c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC7061j<InterfaceC9834Z> f104275d;

    /* renamed from: wd.b$a */
    final class a implements Function0<je.Y> {
        a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final je.Y invoke() {
            AbstractC10516b abstractC10516b = AbstractC10516b.this;
            ce.l I11 = abstractC10516b.I();
            C10515a c10515a = new C10515a(this);
            le.i iVar = H0.f69834a;
            return le.l.k(abstractC10516b) ? le.l.c(le.k.UNABLE_TO_SUBSTITUTE_TYPE, abstractC10516b.toString()) : H0.p(abstractC10516b.k(), I11, c10515a);
        }
    }

    /* renamed from: wd.b$b, reason: collision with other inner class name */
    final class C2254b implements Function0<ce.l> {
        C2254b() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final ce.l invoke() {
            return new ce.h(AbstractC10516b.this.I());
        }
    }

    /* renamed from: wd.b$c */
    final class c implements Function0<InterfaceC9834Z> {
        c() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC9834Z invoke() {
            return new C10509A(AbstractC10516b.this);
        }
    }

    public AbstractC10516b(@NotNull ie.o oVar, @NotNull Sd.f fVar) {
        if (oVar == null) {
            n0(0);
            throw null;
        }
        if (fVar == null) {
            n0(1);
            throw null;
        }
        this.f104272a = fVar;
        this.f104273b = oVar.a(new a());
        this.f104274c = oVar.a(new C2254b());
        this.f104275d = oVar.a(new c());
    }

    private static /* synthetic */ void n0(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16 || i11 == 17 || i11 == 19 || i11 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16 || i11 == 17 || i11 == 19 || i11 == 20) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i11 == 2) {
            objArr[1] = "getName";
        } else if (i11 == 3) {
            objArr[1] = "getOriginal";
        } else if (i11 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i11 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i11 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i11 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i11 == 19) {
            objArr[1] = "substitute";
        } else if (i11 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 6 && i11 != 9 && i11 != 12 && i11 != 14 && i11 != 16 && i11 != 17 && i11 != 19 && i11 != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // td.f0
    @NotNull
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public InterfaceC9839e b2(@NotNull F0 f02) {
        if (f02 != null) {
            return f02.i() ? this : new C10514F(this, f02);
        }
        n0(18);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public ce.l H() {
        ce.l invoke = this.f104274c.invoke();
        if (invoke != null) {
            return invoke;
        }
        n0(4);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public ce.l I() {
        ce.l V11 = V(Zd.e.i(Vd.i.e(this)));
        if (V11 != null) {
            return V11;
        }
        n0(17);
        throw null;
    }

    @Override // wd.G
    @NotNull
    public ce.l N(@NotNull B0 b02, @NotNull ke.h hVar) {
        if (hVar == null) {
            n0(11);
            throw null;
        }
        if (!b02.f()) {
            return new ce.u(V(hVar), F0.f(b02));
        }
        ce.l V11 = V(hVar);
        if (V11 != null) {
            return V11;
        }
        n0(12);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final InterfaceC9834Z W() {
        InterfaceC9834Z invoke = this.f104275d.invoke();
        if (invoke != null) {
            return invoke;
        }
        n0(5);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // td.InterfaceC9845k
    public final <R, D> R X(InterfaceC9847m<R, D> interfaceC9847m, D d11) {
        return (R) interfaceC9847m.e(this, (StringBuilder) d11);
    }

    @Override // wd.G, td.InterfaceC9839e, td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    public final InterfaceC9842h n0() {
        return this;
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final Sd.f getName() {
        Sd.f fVar = this.f104272a;
        if (fVar != null) {
            return fVar;
        }
        n0(2);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public List<InterfaceC9834Z> h0() {
        List<InterfaceC9834Z> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        n0(6);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final ce.l i0(@NotNull B0 b02) {
        ce.l N11 = N(b02, Zd.e.i(Vd.i.e(this)));
        if (N11 != null) {
            return N11;
        }
        n0(16);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9842h
    @NotNull
    public final je.Y q() {
        je.Y invoke = this.f104273b.invoke();
        if (invoke != null) {
            return invoke;
        }
        n0(20);
        throw null;
    }

    @Override // wd.G, td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    public final InterfaceC9845k n0() {
        return this;
    }

    @Override // wd.G, td.InterfaceC9839e, td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    public final InterfaceC9839e n0() {
        return this;
    }
}
