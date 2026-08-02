package je;

import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import pe.C8902c;
import qd.s;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ud.C10037o;
import ud.C10038p;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: b, reason: collision with root package name */
    public static final F0 f69829b = f(B0.f69825a);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final B0 f69830a;

    /* loaded from: classes10.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f69831a;

        static {
            int[] iArr = new int[c.values().length];
            f69831a = iArr;
            try {
                iArr[c.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69831a[c.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69831a[c.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class b extends Exception {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes10.dex */
    private static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c IN_IN_OUT_POSITION;
        public static final c NO_CONFLICT;
        public static final c OUT_IN_IN_POSITION;

        static {
            c cVar = new c("NO_CONFLICT", 0);
            NO_CONFLICT = cVar;
            c cVar2 = new c("IN_IN_OUT_POSITION", 1);
            IN_IN_OUT_POSITION = cVar2;
            c cVar3 = new c("OUT_IN_IN_POSITION", 2);
            OUT_IN_IN_POSITION = cVar3;
            $VALUES = new c[]{cVar, cVar2, cVar3};
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    protected F0(@NotNull B0 b02) {
        if (b02 != null) {
            this.f69830a = b02;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0021 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        if (i11 != 1 && i11 != 2 && i11 != 8 && i11 != 34 && i11 != 37) {
            switch (i11) {
                default:
                    switch (i11) {
                        default:
                            switch (i11) {
                                default:
                                    switch (i11) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
            if (i11 != 1 && i11 != 2 && i11 != 8 && i11 != 34 && i11 != 37) {
                switch (i11) {
                    default:
                        switch (i11) {
                            default:
                                switch (i11) {
                                    default:
                                        switch (i11) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                i12 = 3;
                                                break;
                                        }
                                    case 29:
                                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                    case 32:
                                        i12 = 2;
                                        break;
                                }
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                                break;
                        }
                    case 11:
                    case 12:
                    case 13:
                        break;
                }
                Object[] objArr = new Object[i12];
                switch (i11) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case 29:
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    case 32:
                    case 34:
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    case 40:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                        break;
                    case 3:
                        objArr[0] = "first";
                        break;
                    case 4:
                        objArr[0] = "second";
                        break;
                    case 5:
                        objArr[0] = "substitutionContext";
                        break;
                    case 6:
                        objArr[0] = "context";
                        break;
                    case 7:
                    default:
                        objArr[0] = "substitution";
                        break;
                    case 9:
                    case 14:
                        objArr[0] = "type";
                        break;
                    case 10:
                    case 15:
                        objArr[0] = "howThisTypeIsUsed";
                        break;
                    case 16:
                    case 17:
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        objArr[0] = "typeProjection";
                        break;
                    case 18:
                    case 28:
                        objArr[0] = "originalProjection";
                        break;
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        objArr[0] = "originalType";
                        break;
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        objArr[0] = "substituted";
                        break;
                    case 33:
                        objArr[0] = "annotations";
                        break;
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    case 38:
                        objArr[0] = "typeParameterVariance";
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        objArr[0] = "projectionKind";
                        break;
                }
                if (i11 != 1) {
                    objArr[1] = "replaceWithNonApproximatingSubstitution";
                } else if (i11 == 2) {
                    objArr[1] = "replaceWithContravariantApproximatingSubstitution";
                } else if (i11 == 8) {
                    objArr[1] = "getSubstitution";
                } else if (i11 != 34) {
                    if (i11 != 37) {
                        switch (i11) {
                            case 11:
                            case 12:
                            case 13:
                                objArr[1] = "safeSubstitute";
                                break;
                            default:
                                switch (i11) {
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                                        objArr[1] = "unsafeSubstitute";
                                        break;
                                    default:
                                        switch (i11) {
                                            case 29:
                                            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                            case 32:
                                                objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                        break;
                                                }
                                        }
                                }
                        }
                    }
                    objArr[1] = "combine";
                } else {
                    objArr[1] = "filterOutUnsafeVariance";
                }
                switch (i11) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case 29:
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    case 32:
                    case 34:
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    case 40:
                    case 41:
                    case 42:
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "createChainedSubstitutor";
                        break;
                    case 5:
                    case 6:
                    default:
                        objArr[2] = "create";
                        break;
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "safeSubstitute";
                        break;
                    case 14:
                    case 15:
                    case 16:
                        objArr[2] = "substitute";
                        break;
                    case 17:
                        objArr[2] = "substituteWithoutApproximation";
                        break;
                    case 18:
                        objArr[2] = "unsafeSubstitute";
                        break;
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    case 28:
                        objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                        break;
                    case 33:
                        objArr[2] = "filterOutUnsafeVariance";
                        break;
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case 38:
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        objArr[2] = "combine";
                        break;
                }
                String format = String.format(str, objArr);
                if (i11 != 1 && i11 != 2 && i11 != 8 && i11 != 34 && i11 != 37) {
                    switch (i11) {
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            switch (i11) {
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                                    break;
                                default:
                                    switch (i11) {
                                        case 29:
                                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                        case 32:
                                            break;
                                        default:
                                            switch (i11) {
                                                case 40:
                                                case 41:
                                                case 42:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format);
            }
            i12 = 2;
            Object[] objArr2 = new Object[i12];
            switch (i11) {
            }
            if (i11 != 1) {
            }
            switch (i11) {
            }
            String format2 = String.format(str, objArr2);
            if (i11 != 1) {
                switch (i11) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i11 != 1) {
            switch (i11) {
            }
            Object[] objArr22 = new Object[i12];
            switch (i11) {
            }
            if (i11 != 1) {
            }
            switch (i11) {
            }
            String format22 = String.format(str, objArr22);
            if (i11 != 1) {
            }
            throw new IllegalStateException(format22);
        }
        i12 = 2;
        Object[] objArr222 = new Object[i12];
        switch (i11) {
        }
        if (i11 != 1) {
        }
        switch (i11) {
        }
        String format222 = String.format(str, objArr222);
        if (i11 != 1) {
        }
        throw new IllegalStateException(format222);
    }

    @NotNull
    public static L0 b(@NotNull L0 l02, @NotNull y0 y0Var) {
        if (l02 == null) {
            a(35);
            throw null;
        }
        if (y0Var == null) {
            a(36);
            throw null;
        }
        if (!y0Var.a()) {
            return c(l02, y0Var.b());
        }
        L0 l03 = L0.OUT_VARIANCE;
        if (l03 != null) {
            return l03;
        }
        a(37);
        throw null;
    }

    @NotNull
    public static L0 c(@NotNull L0 l02, @NotNull L0 l03) {
        if (l02 == null) {
            a(38);
            throw null;
        }
        if (l03 == null) {
            a(39);
            throw null;
        }
        L0 l04 = L0.INVARIANT;
        if (l02 == l04) {
            if (l03 != null) {
                return l03;
            }
            a(40);
            throw null;
        }
        if (l03 == l04) {
            if (l02 != null) {
                return l02;
            }
            a(41);
            throw null;
        }
        if (l02 == l03) {
            if (l03 != null) {
                return l03;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + l02 + "' and projection kind '" + l03 + "' cannot be combined");
    }

    private static c d(L0 l02, L0 l03) {
        L0 l04 = L0.IN_VARIANCE;
        return (l02 == l04 && l03 == L0.OUT_VARIANCE) ? c.OUT_IN_IN_POSITION : (l02 == L0.OUT_VARIANCE && l03 == l04) ? c.IN_IN_OUT_POSITION : c.NO_CONFLICT;
    }

    @NotNull
    public static F0 e(@NotNull N n11) {
        if (n11 == null) {
            a(6);
            throw null;
        }
        return f(u0.f69930b.a(n11.H0(), n11.F0()));
    }

    @NotNull
    public static F0 f(@NotNull B0 b02) {
        if (b02 != null) {
            return new F0(b02);
        }
        a(0);
        throw null;
    }

    @NotNull
    public static F0 g(@NotNull B0 b02, @NotNull B0 b03) {
        if (b02 == null) {
            a(3);
            throw null;
        }
        if (b03 != null) {
            return f(C7405z.h(b02, b03));
        }
        a(4);
        throw null;
    }

    private static String k(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (te.d.a(th2)) {
                throw th2;
            }
            return D40.a.c("[Exception while computing toString(): ", "]", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    private y0 n(@NotNull y0 y0Var, td.i0 i0Var, int i11) throws b {
        F0 f02;
        N n11 = null;
        if (y0Var == null) {
            a(18);
            throw null;
        }
        B0 b02 = this.f69830a;
        if (i11 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + k(y0Var) + "; substitution: " + k(b02));
        }
        if (!y0Var.a()) {
            N type = y0Var.getType();
            if (type instanceof I0) {
                I0 i02 = (I0) type;
                K0 V11 = i02.V();
                N n02 = i02.n0();
                y0 n12 = n(new A0(V11, y0Var.b()), i0Var, i11 + 1);
                return n12.a() ? n12 : new A0(J0.c(n12.getType().K0(), l(n02, y0Var.b())), n12.b());
            }
            if (!C7357B.a(type) && !(type.K0() instanceof Hd.k)) {
                y0 e11 = b02.e(type);
                if (e11 == null) {
                    e11 = null;
                } else if (type.getAnnotations().K0(s.a.f81925y)) {
                    s0 H02 = e11.getType().H0();
                    if (H02 instanceof ke.o) {
                        y0 projection = ((ke.o) H02).getProjection();
                        L0 b11 = projection.b();
                        c d11 = d(y0Var.b(), b11);
                        c cVar = c.OUT_IN_IN_POSITION;
                        if (d11 == cVar) {
                            e11 = new A0(projection.getType());
                        } else if (i0Var != null && d(i0Var.x(), b11) == cVar) {
                            e11 = new A0(projection.getType());
                        }
                    }
                }
                L0 b12 = y0Var.b();
                if (e11 == null && C7363H.a(type) && !q0.b(type)) {
                    Intrinsics.checkNotNullParameter(type, "<this>");
                    AbstractC7360E abstractC7360E = (AbstractC7360E) type.K0();
                    int i12 = i11 + 1;
                    y0 n13 = n(new A0(abstractC7360E.P0(), b12), i0Var, i12);
                    y0 n14 = n(new A0(abstractC7360E.Q0(), b12), i0Var, i12);
                    L0 b13 = n13.b();
                    if (n13.getType() != abstractC7360E.P0() || n14.getType() != abstractC7360E.Q0()) {
                        return new A0(Q.c(D0.a(n13.getType()), D0.a(n14.getType())), b13);
                    }
                } else if (!qd.m.c0(type) && !S.a(type)) {
                    if (e11 != null) {
                        c d12 = d(b12, e11.b());
                        Intrinsics.checkNotNullParameter(type, "<this>");
                        if (!(type.H0() instanceof Wd.b)) {
                            int i13 = a.f69831a[d12.ordinal()];
                            if (i13 == 1) {
                                throw new b("Out-projection in in-position");
                            }
                            if (i13 == 2) {
                                return new A0(type.H0().n().C(), L0.OUT_VARIANCE);
                            }
                        }
                        InterfaceC7399t a11 = q0.a(type);
                        if (e11.a()) {
                            return e11;
                        }
                        N N11 = a11 != null ? a11.N(e11.getType()) : H0.l(e11.getType(), type.I0());
                        if (!type.getAnnotations().isEmpty()) {
                            InterfaceC10030h d13 = b02.d(type.getAnnotations());
                            if (d13 == null) {
                                a(33);
                                throw null;
                            }
                            if (d13.K0(s.a.f81925y)) {
                                d13 = new C10038p(d13, new E0());
                            }
                            N11 = C8701c.q(N11, new C10037o(N11.getAnnotations(), d13));
                        }
                        if (d12 == c.NO_CONFLICT) {
                            b12 = c(b12, e11.b());
                        }
                        return new A0(N11, b12);
                    }
                    N type2 = y0Var.getType();
                    L0 b14 = y0Var.b();
                    if (!(type2.H0().p() instanceof td.i0)) {
                        Intrinsics.checkNotNullParameter(type2, "<this>");
                        Intrinsics.checkNotNullParameter(type2, "<this>");
                        K0 K02 = type2.K0();
                        C7368a c7368a = K02 instanceof C7368a ? (C7368a) K02 : null;
                        Y T02 = c7368a != null ? c7368a.T0() : null;
                        if (T02 != null) {
                            if ((b02 instanceof C7364I) && b02.b()) {
                                C7364I c7364i = (C7364I) b02;
                                f02 = new F0(new C7364I(c7364i.i(), c7364i.h(), false));
                            } else {
                                f02 = this;
                            }
                            n11 = f02.l(T02, L0.INVARIANT);
                        }
                        List<td.i0> parameters = type2.H0().getParameters();
                        List<y0> F02 = type2.F0();
                        ArrayList arrayList = new ArrayList(parameters.size());
                        boolean z11 = false;
                        for (int i14 = 0; i14 < parameters.size(); i14++) {
                            td.i0 i0Var2 = parameters.get(i14);
                            y0 y0Var2 = F02.get(i14);
                            y0 n15 = n(y0Var2, i0Var2, i11 + 1);
                            int i15 = a.f69831a[d(i0Var2.x(), n15.b()).ordinal()];
                            if (i15 == 1 || i15 == 2) {
                                n15 = H0.n(i0Var2);
                            } else if (i15 == 3) {
                                L0 x11 = i0Var2.x();
                                L0 l02 = L0.INVARIANT;
                                if (x11 != l02 && !n15.a()) {
                                    n15 = new A0(n15.getType(), l02);
                                }
                            }
                            if (n15 != y0Var2) {
                                z11 = true;
                            }
                            arrayList.add(n15);
                        }
                        if (z11) {
                            F02 = arrayList;
                        }
                        N b15 = D0.b(type2, F02, b02.d(type2.getAnnotations()));
                        if ((b15 instanceof Y) && (n11 instanceof Y)) {
                            b15 = C7373c0.d((Y) b15, (Y) n11);
                        }
                        return new A0(b15, b14);
                    }
                }
            }
        }
        return y0Var;
    }

    @NotNull
    public final B0 h() {
        B0 b02 = this.f69830a;
        if (b02 != null) {
            return b02;
        }
        a(8);
        throw null;
    }

    public final boolean i() {
        return this.f69830a.f();
    }

    @NotNull
    public final N j(@NotNull N n11, @NotNull L0 l02) {
        if (n11 == null) {
            a(9);
            throw null;
        }
        if (l02 == null) {
            a(10);
            throw null;
        }
        if (this.f69830a.f()) {
            return n11;
        }
        try {
            N type = n(new A0(n11, l02), null, 0).getType();
            if (type != null) {
                return type;
            }
            a(12);
            throw null;
        } catch (b e11) {
            return le.l.c(le.k.UNABLE_TO_SUBSTITUTE_TYPE, e11.getMessage());
        }
    }

    public final N l(@NotNull N n11, @NotNull L0 l02) {
        if (n11 == null) {
            a(14);
            throw null;
        }
        if (l02 == null) {
            a(15);
            throw null;
        }
        y0 m11 = m(new A0(h().g(n11, l02), l02));
        B0 b02 = this.f69830a;
        if (b02.a() || b02.b()) {
            m11 = C8902c.b(m11, b02.b());
        }
        if (m11 == null) {
            return null;
        }
        return m11.getType();
    }

    public final y0 m(@NotNull y0 y0Var) {
        if (y0Var == null) {
            a(17);
            throw null;
        }
        if (this.f69830a.f()) {
            return y0Var;
        }
        try {
            return n(y0Var, null, 0);
        } catch (b unused) {
            return null;
        }
    }
}
