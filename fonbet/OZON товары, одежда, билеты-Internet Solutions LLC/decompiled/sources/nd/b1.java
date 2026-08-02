package nd;

import E0.C2942q;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.l;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9831W;
import td.InterfaceC9834Z;
import td.InterfaceC9836b;
import td.InterfaceC9857w;

/* loaded from: classes10.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Ud.u f76952a = Ud.n.f27602a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f76953b = 0;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76954a;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.a.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f76954a = iArr;
        }
    }

    private static void a(StringBuilder sb2, InterfaceC9836b interfaceC9836b) {
        InterfaceC9834Z g10 = g1.g(interfaceC9836b);
        InterfaceC9834Z d02 = interfaceC9836b.d0();
        if (g10 != null) {
            je.N type = g10.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(f(type));
            sb2.append(".");
        }
        boolean z11 = (g10 == null || d02 == null) ? false : true;
        if (z11) {
            sb2.append("(");
        }
        if (d02 != null) {
            je.N type2 = d02.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            sb2.append(f(type2));
            sb2.append(".");
        }
        if (z11) {
            sb2.append(")");
        }
    }

    @NotNull
    public static String b(@NotNull InterfaceC9857w descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        a(sb2, descriptor);
        Sd.f name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(f76952a.X(name, true));
        List<td.p0> f7 = descriptor.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
        C7714v.U(f7, sb2, ", ", "(", ")", Z0.f76948a, 48);
        sb2.append(": ");
        je.N returnType = descriptor.getReturnType();
        Intrinsics.f(returnType);
        sb2.append(f(returnType));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    public static String c(@NotNull InterfaceC9857w invoke) {
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        a(sb2, invoke);
        List<td.p0> f7 = invoke.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
        C7714v.U(f7, sb2, ", ", "(", ")", a1.f76950a, 48);
        sb2.append(" -> ");
        je.N returnType = invoke.getReturnType();
        Intrinsics.f(returnType);
        sb2.append(f(returnType));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    public static String d(@NotNull C8577z0 parameter) {
        String b11;
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i11 = a.f76954a[parameter.getKind().ordinal()];
        if (i11 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i11 == 2) {
            sb2.append("instance parameter");
        } else {
            if (i11 != 3) {
                throw new Sc.o();
            }
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        InterfaceC9836b t2 = parameter.h().t();
        if (t2 instanceof InterfaceC9831W) {
            b11 = e((InterfaceC9831W) t2);
        } else {
            if (!(t2 instanceof InterfaceC9857w)) {
                throw new IllegalStateException(("Illegal callable: " + t2).toString());
            }
            b11 = b((InterfaceC9857w) t2);
        }
        return C2942q.c(sb2, b11, "toString(...)");
    }

    @NotNull
    public static String e(@NotNull InterfaceC9831W descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.B() ? "var " : "val ");
        a(sb2, descriptor);
        Sd.f name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(f76952a.X(name, true));
        sb2.append(": ");
        je.N type = descriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb2.append(f(type));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    public static String f(@NotNull je.N type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return f76952a.h0(type);
    }
}
