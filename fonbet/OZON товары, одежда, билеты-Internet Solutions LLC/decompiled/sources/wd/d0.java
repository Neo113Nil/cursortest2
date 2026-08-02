package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9834Z;
import td.InterfaceC9845k;
import td.i0;
import td.p0;
import td.q0;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public abstract class d0 extends AbstractC10532s implements q0 {

    /* renamed from: e, reason: collision with root package name */
    protected je.N f104287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@NotNull InterfaceC9845k interfaceC9845k, @NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.f fVar, je.N n11, @NotNull td.d0 d0Var) {
        super(interfaceC9845k, interfaceC10030h, fVar, d0Var);
        if (interfaceC9845k == null) {
            N(0);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(1);
            throw null;
        }
        if (fVar == null) {
            N(2);
            throw null;
        }
        if (d0Var == null) {
            N(3);
            throw null;
        }
        this.f104287e = n11;
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
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public InterfaceC9834Z c0() {
        return null;
    }

    public InterfaceC9834Z d0() {
        return null;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<p0> f() {
        List<p0> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        N(6);
        throw null;
    }

    @NotNull
    public je.N getReturnType() {
        je.N type = getType();
        if (type != null) {
            return type;
        }
        N(10);
        throw null;
    }

    @Override // td.o0
    @NotNull
    public final je.N getType() {
        je.N n11 = this.f104287e;
        if (n11 != null) {
            return n11;
        }
        N(4);
        throw null;
    }

    @NotNull
    public List<i0> getTypeParameters() {
        List<i0> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        N(8);
        throw null;
    }

    public boolean m0() {
        return false;
    }
}
