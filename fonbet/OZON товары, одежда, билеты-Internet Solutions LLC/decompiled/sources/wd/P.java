package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import je.F0;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9850p;
import td.AbstractC9853s;
import td.EnumC9812C;
import td.InterfaceC9830V;
import td.InterfaceC9831W;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9857w;
import td.i0;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public abstract class P extends AbstractC10532s implements InterfaceC9830V {

    /* renamed from: e, reason: collision with root package name */
    private boolean f104215e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f104216f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC9812C f104217g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC9831W f104218h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f104219i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC9836b.a f104220j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC9853s f104221k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC9857w f104222l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(@NotNull EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s, @NotNull InterfaceC9831W interfaceC9831W, @NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.f fVar, boolean z11, boolean z12, boolean z13, InterfaceC9836b.a aVar, @NotNull td.d0 d0Var) {
        super(interfaceC9831W.d(), interfaceC10030h, fVar, d0Var);
        if (enumC9812C == null) {
            N(0);
            throw null;
        }
        if (abstractC9853s == null) {
            N(1);
            throw null;
        }
        if (interfaceC9831W == null) {
            N(2);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(3);
            throw null;
        }
        if (d0Var == null) {
            N(5);
            throw null;
        }
        this.f104222l = null;
        this.f104217g = enumC9812C;
        this.f104221k = abstractC9853s;
        this.f104218h = interfaceC9831W;
        this.f104215e = z11;
        this.f104216f = z12;
        this.f104219i = z13;
        this.f104220j = aVar;
    }

    private static /* synthetic */ void N(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i12 = 2;
                break;
            case 7:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i11) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i11) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // td.InterfaceC9857w
    public final boolean B0() {
        return false;
    }

    @Override // wd.AbstractC10532s
    @NotNull
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC9830V n0();

    @NotNull
    protected final ArrayList F0(boolean z11) {
        ArrayList arrayList = new ArrayList(0);
        Iterator<? extends InterfaceC9836b> it = f0().o().iterator();
        while (it.hasNext()) {
            InterfaceC9831W interfaceC9831W = (InterfaceC9831W) it.next();
            InterfaceC9836b getter = z11 ? interfaceC9831W.getGetter() : interfaceC9831W.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    public final boolean G0() {
        return this.f104215e;
    }

    public final void H0() {
        this.f104215e = false;
    }

    public final void I0(InterfaceC9857w interfaceC9857w) {
        this.f104222l = interfaceC9857w;
    }

    public final void J0(AbstractC9853s abstractC9853s) {
        this.f104221k = abstractC9853s;
    }

    @Override // td.InterfaceC9835a
    public final <V> V P(InterfaceC9835a.InterfaceC2188a<V> interfaceC2188a) {
        return null;
    }

    @Override // td.InterfaceC9836b
    public final void S(@NotNull Collection<? extends InterfaceC9836b> collection) {
        if (collection != null) {
            return;
        }
        N(16);
        throw null;
    }

    @Override // td.InterfaceC9857w
    public final boolean T() {
        return false;
    }

    @Override // td.InterfaceC9857w, td.f0
    @NotNull
    /* renamed from: b, reason: avoid collision after fix types in other method */
    public final InterfaceC9857w b2(@NotNull F0 f02) {
        if (f02 != null) {
            return this;
        }
        N(7);
        throw null;
    }

    @Override // td.InterfaceC9835a
    public final InterfaceC9834Z c0() {
        return f0().c0();
    }

    @Override // td.InterfaceC9835a
    public final InterfaceC9834Z d0() {
        return f0().d0();
    }

    @Override // td.InterfaceC9830V
    @NotNull
    public final InterfaceC9831W f0() {
        InterfaceC9831W interfaceC9831W = this.f104218h;
        if (interfaceC9831W != null) {
            return interfaceC9831W;
        }
        N(13);
        throw null;
    }

    @Override // td.InterfaceC9811B
    public final boolean g0() {
        return false;
    }

    @Override // td.InterfaceC9836b
    @NotNull
    public final InterfaceC9836b.a getKind() {
        InterfaceC9836b.a aVar = this.f104220j;
        if (aVar != null) {
            return aVar;
        }
        N(6);
        throw null;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<i0> getTypeParameters() {
        List<i0> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        N(9);
        throw null;
    }

    @Override // td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        AbstractC9853s abstractC9853s = this.f104221k;
        if (abstractC9853s != null) {
            return abstractC9853s;
        }
        N(11);
        throw null;
    }

    @Override // td.InterfaceC9811B
    @NotNull
    public final EnumC9812C h() {
        EnumC9812C enumC9812C = this.f104217g;
        if (enumC9812C != null) {
            return enumC9812C;
        }
        N(10);
        throw null;
    }

    @Override // td.InterfaceC9811B
    public final boolean isExternal() {
        return this.f104216f;
    }

    @Override // td.InterfaceC9857w
    public final boolean isInfix() {
        return false;
    }

    @Override // td.InterfaceC9857w
    public final boolean isInline() {
        return this.f104219i;
    }

    @Override // td.InterfaceC9857w
    public final boolean isOperator() {
        return false;
    }

    @Override // td.InterfaceC9857w
    public final boolean isSuspend() {
        return false;
    }

    @Override // td.InterfaceC9835a
    public final boolean m0() {
        return false;
    }

    @Override // td.InterfaceC9811B
    public final boolean p0() {
        return false;
    }

    @Override // td.InterfaceC9836b
    @NotNull
    public final InterfaceC9836b u(InterfaceC9839e interfaceC9839e, EnumC9812C enumC9812C, AbstractC9850p abstractC9850p, InterfaceC9836b.a aVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // td.InterfaceC9857w
    public final InterfaceC9857w v0() {
        return this.f104222l;
    }

    @Override // td.InterfaceC9857w
    public final boolean y() {
        return false;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<InterfaceC9834Z> y0() {
        List<InterfaceC9834Z> y02 = f0().y0();
        if (y02 != null) {
            return y02;
        }
        N(14);
        throw null;
    }

    @Override // td.f0
    @NotNull
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC9835a b2(@NotNull F0 f02) {
        b2(f02);
        return this;
    }
}
