package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ie.InterfaceC7062k;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9845k;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public abstract class e0 extends d0 {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f104289f;

    /* renamed from: g, reason: collision with root package name */
    protected InterfaceC7062k<Xd.g<?>> f104290g;

    /* renamed from: h, reason: collision with root package name */
    protected Function0<InterfaceC7062k<Xd.g<?>>> f104291h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull InterfaceC9845k interfaceC9845k, @NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.f fVar, boolean z11, @NotNull td.d0 d0Var) {
        super(interfaceC9845k, interfaceC10030h, fVar, null, d0Var);
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
        this.f104289f = z11;
    }

    private static /* synthetic */ void N(int i11) {
        Object[] objArr = new Object[3];
        if (i11 == 1) {
            objArr[0] = "annotations";
        } else if (i11 == 2) {
            objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
        } else if (i11 == 3) {
            objArr[0] = "source";
        } else if (i11 == 4 || i11 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i11 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i11 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // td.q0
    public final boolean B() {
        return this.f104289f;
    }

    public final void C0(InterfaceC7062k<Xd.g<?>> interfaceC7062k, @NotNull Function0<InterfaceC7062k<Xd.g<?>>> function0) {
        if (function0 == null) {
            N(5);
            throw null;
        }
        this.f104291h = function0;
        if (interfaceC7062k == null) {
            interfaceC7062k = function0.invoke();
        }
        this.f104290g = interfaceC7062k;
    }

    @Override // td.q0
    public final Xd.g<?> s0() {
        InterfaceC7062k<Xd.g<?>> interfaceC7062k = this.f104290g;
        if (interfaceC7062k != null) {
            return interfaceC7062k.invoke();
        }
        return null;
    }
}
