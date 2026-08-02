package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9845k;
import td.InterfaceC9846l;
import td.InterfaceC9848n;
import ud.InterfaceC10030h;

/* renamed from: wd.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10532s extends r implements InterfaceC9846l {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC9845k f104326c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final td.d0 f104327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC10532s(@NotNull InterfaceC9845k interfaceC9845k, @NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.f fVar, @NotNull td.d0 d0Var) {
        super(interfaceC10030h, fVar);
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
        this.f104326c = interfaceC9845k;
        this.f104327d = d0Var;
    }

    private static /* synthetic */ void N(int i11) {
        String str = (i11 == 4 || i11 == 5 || i11 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5 || i11 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "getOriginal";
        } else if (i11 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i11 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i11 != 4 && i11 != 5 && i11 != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 5 && i11 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @NotNull
    public InterfaceC9845k d() {
        InterfaceC9845k interfaceC9845k = this.f104326c;
        if (interfaceC9845k != null) {
            return interfaceC9845k;
        }
        N(5);
        throw null;
    }

    @NotNull
    public td.d0 e() {
        td.d0 d0Var = this.f104327d;
        if (d0Var != null) {
            return d0Var;
        }
        N(6);
        throw null;
    }

    @Override // wd.r, td.InterfaceC9845k
    @NotNull
    public InterfaceC9848n n0() {
        return this;
    }
}
