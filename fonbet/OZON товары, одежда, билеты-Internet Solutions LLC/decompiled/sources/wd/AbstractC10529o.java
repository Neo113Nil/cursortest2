package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9845k;

/* renamed from: wd.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10529o extends AbstractC10516b {

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9845k f104315e;

    /* renamed from: f, reason: collision with root package name */
    private final td.d0 f104316f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC10529o(@NotNull ie.o oVar, @NotNull InterfaceC9845k interfaceC9845k, @NotNull Sd.f fVar, @NotNull td.d0 d0Var) {
        super(oVar, fVar);
        if (oVar == null) {
            n0(0);
            throw null;
        }
        if (interfaceC9845k == null) {
            n0(1);
            throw null;
        }
        if (fVar == null) {
            n0(2);
            throw null;
        }
        if (d0Var == null) {
            n0(3);
            throw null;
        }
        this.f104315e = interfaceC9845k;
        this.f104316f = d0Var;
    }

    private static /* synthetic */ void n0(int i11) {
        String str = (i11 == 4 || i11 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5) ? 2 : 3];
        if (i11 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i11 == 2) {
            objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
        } else if (i11 == 3) {
            objArr[0] = "source";
        } else if (i11 == 4 || i11 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i11 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i11 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i11 != 4 && i11 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final InterfaceC9845k d() {
        InterfaceC9845k interfaceC9845k = this.f104315e;
        if (interfaceC9845k != null) {
            return interfaceC9845k;
        }
        n0(4);
        throw null;
    }

    @Override // td.InterfaceC9848n
    @NotNull
    public final td.d0 e() {
        td.d0 d0Var = this.f104316f;
        if (d0Var != null) {
            return d0Var;
        }
        n0(5);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }
}
