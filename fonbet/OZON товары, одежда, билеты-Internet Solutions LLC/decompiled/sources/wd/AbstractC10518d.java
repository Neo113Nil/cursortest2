package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import de.C6191j;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import je.F0;
import je.L0;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.C9852r;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import td.i0;
import td.p0;
import ud.InterfaceC10030h;

/* renamed from: wd.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10518d extends r implements InterfaceC9834Z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10518d(@NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.f fVar) {
        super(interfaceC10030h, fVar);
        if (interfaceC10030h == null) {
            N(1);
            throw null;
        }
        if (fVar != null) {
        } else {
            N(2);
            throw null;
        }
    }

    private static /* synthetic */ void N(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 2:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i11) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // td.InterfaceC9845k
    public final <R, D> R X(InterfaceC9847m<R, D> interfaceC9847m, D d11) {
        return (R) interfaceC9847m.f(this, (StringBuilder) d11);
    }

    @Override // wd.r, td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    public final InterfaceC9835a n0() {
        return this;
    }

    @Override // td.InterfaceC9835a
    public final InterfaceC9834Z c0() {
        return null;
    }

    @Override // td.InterfaceC9835a
    public final InterfaceC9834Z d0() {
        return null;
    }

    @Override // td.InterfaceC9848n
    @NotNull
    public final td.d0 e() {
        return td.d0.f99392a;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<p0> f() {
        List<p0> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        N(7);
        throw null;
    }

    @Override // td.InterfaceC9835a
    public final je.N getReturnType() {
        return getType();
    }

    @Override // td.o0
    @NotNull
    public final je.N getType() {
        je.N type = getValue().getType();
        if (type != null) {
            return type;
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
        N(5);
        throw null;
    }

    @Override // td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        AbstractC9853s abstractC9853s = C9852r.f99404f;
        if (abstractC9853s != null) {
            return abstractC9853s;
        }
        N(9);
        throw null;
    }

    @Override // td.InterfaceC9835a
    public final boolean m0() {
        return false;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final Collection<? extends InterfaceC9835a> o() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        N(8);
        throw null;
    }

    @Override // wd.r, td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    public final InterfaceC9845k n0() {
        return this;
    }

    @Override // td.f0
    /* renamed from: b, reason: avoid collision after fix types in other method */
    public final InterfaceC9835a b2(@NotNull F0 f02) {
        if (f02 == null) {
            N(3);
            throw null;
        }
        if (!f02.i()) {
            je.N l11 = d() instanceof InterfaceC9839e ? f02.l(getType(), L0.OUT_VARIANCE) : f02.l(getType(), L0.INVARIANT);
            if (l11 == null) {
                return null;
            }
            if (l11 != getType()) {
                return new U(d(), new C6191j(l11), getAnnotations());
            }
        }
        return this;
    }
}
