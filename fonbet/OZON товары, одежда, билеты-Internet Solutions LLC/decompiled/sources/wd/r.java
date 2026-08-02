package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9845k;
import ud.C10024b;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public abstract class r extends C10024b implements InterfaceC9845k {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Sd.f f104325b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.f fVar) {
        super(interfaceC10030h);
        if (interfaceC10030h == null) {
            N(0);
            throw null;
        }
        if (fVar == null) {
            N(1);
            throw null;
        }
        this.f104325b = fVar;
    }

    private static /* synthetic */ void N(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i11 == 2) {
            objArr[1] = "getName";
        } else if (i11 == 3) {
            objArr[1] = "getOriginal";
        } else if (i11 == 5 || i11 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i11 != 2 && i11 != 3) {
            if (i11 == 4) {
                objArr[2] = "toString";
            } else if (i11 != 5 && i11 != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 5 && i11 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @NotNull
    public static String V(@NotNull InterfaceC9845k interfaceC9845k) {
        try {
            String str = Ud.n.f27604c.E(interfaceC9845k) + "[" + interfaceC9845k.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC9845k)) + "]";
            if (str != null) {
                return str;
            }
            N(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC9845k.getClass().getSimpleName() + " " + interfaceC9845k.getName();
            if (str2 != null) {
                return str2;
            }
            N(6);
            throw null;
        }
    }

    @NotNull
    /* renamed from: a */
    public InterfaceC9845k n0() {
        return this;
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final Sd.f getName() {
        Sd.f fVar = this.f104325b;
        if (fVar != null) {
            return fVar;
        }
        N(2);
        throw null;
    }

    public String toString() {
        return V(this);
    }
}
