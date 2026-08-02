package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import je.L0;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9845k;
import td.g0;
import ud.InterfaceC10030h;

/* renamed from: wd.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10517c extends AbstractC10527m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10517c(@NotNull ie.o oVar, @NotNull InterfaceC9845k interfaceC9845k, @NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.f fVar, @NotNull L0 l02, boolean z11, int i11, @NotNull g0 g0Var) {
        super(oVar, interfaceC9845k, interfaceC10030h, fVar, l02, z11, i11, g0Var);
        if (oVar == null) {
            N(0);
            throw null;
        }
        if (interfaceC9845k == null) {
            N(1);
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
        if (g0Var != null) {
        } else {
            N(6);
            throw null;
        }
    }

    private static /* synthetic */ void N(int i11) {
        Object[] objArr = new Object[3];
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
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // wd.r
    public final String toString() {
        String str = "";
        String str2 = w() ? "reified " : "";
        if (x() != L0.INVARIANT) {
            str = x() + " ";
        }
        return str2 + str + getName();
    }
}
