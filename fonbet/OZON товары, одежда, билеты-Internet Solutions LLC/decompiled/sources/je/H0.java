package je;

import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import td.InterfaceC9839e;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public static final le.i f69834a = le.l.c(le.k.DONT_CARE, new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final le.i f69835b = le.l.c(le.k.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f69836c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d, reason: collision with root package name */
    public static final a f69837d = new a("UNIT_EXPECTED_TYPE");

    public static class a extends AbstractC7402w {

        /* renamed from: b, reason: collision with root package name */
        private final String f69838b;

        public a(String str) {
            this.f69838b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void T0(int i11) {
            String format;
            String str = (i11 == 1 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 1 || i11 == 4) ? 2 : 3];
            if (i11 != 1) {
                if (i11 == 2) {
                    objArr[0] = "delegate";
                } else if (i11 == 3) {
                    objArr[0] = "kotlinTypeRefiner";
                } else if (i11 != 4) {
                    objArr[0] = "newAttributes";
                }
                if (i11 != 1) {
                    objArr[1] = "toString";
                } else if (i11 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                } else {
                    objArr[1] = "refine";
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        objArr[2] = "replaceDelegate";
                    } else if (i11 == 3) {
                        objArr[2] = "refine";
                    } else if (i11 != 4) {
                        objArr[2] = "replaceAttributes";
                    }
                }
                format = String.format(str, objArr);
                if (i11 == 1 && i11 != 4) {
                    throw new IllegalArgumentException(format);
                }
                throw new IllegalStateException(format);
            }
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            if (i11 != 1) {
            }
            if (i11 != 1) {
            }
            format = String.format(str, objArr);
            if (i11 == 1) {
            }
            throw new IllegalStateException(format);
        }

        @Override // je.AbstractC7402w, je.N
        @NotNull
        /* renamed from: J0 */
        public final N M0(@NotNull ke.h hVar) {
            if (hVar != null) {
                return this;
            }
            T0(3);
            throw null;
        }

        @Override // je.Y, je.K0
        @NotNull
        public final /* bridge */ /* synthetic */ K0 L0(boolean z11) {
            L0(z11);
            throw null;
        }

        @Override // je.AbstractC7402w, je.K0
        @NotNull
        public final K0 M0(@NotNull ke.h hVar) {
            if (hVar != null) {
                return this;
            }
            T0(3);
            throw null;
        }

        @Override // je.Y, je.K0
        @NotNull
        public final /* bridge */ /* synthetic */ K0 N0(@NotNull o0 o0Var) {
            N0(o0Var);
            throw null;
        }

        @Override // je.Y
        @NotNull
        /* renamed from: O0 */
        public final Y L0(boolean z11) {
            throw new IllegalStateException(this.f69838b);
        }

        @Override // je.Y
        @NotNull
        /* renamed from: P0 */
        public final Y N0(@NotNull o0 o0Var) {
            if (o0Var != null) {
                throw new IllegalStateException(this.f69838b);
            }
            T0(0);
            throw null;
        }

        @Override // je.AbstractC7402w
        @NotNull
        protected final Y Q0() {
            throw new IllegalStateException(this.f69838b);
        }

        @Override // je.AbstractC7402w
        @NotNull
        /* renamed from: R0 */
        public final Y M0(@NotNull ke.h hVar) {
            if (hVar != null) {
                return this;
            }
            T0(3);
            throw null;
        }

        @Override // je.AbstractC7402w
        @NotNull
        public final AbstractC7402w S0(@NotNull Y y11) {
            throw new IllegalStateException(this.f69838b);
        }

        @Override // je.Y
        @NotNull
        public final String toString() {
            String str = this.f69838b;
            if (str != null) {
                return str;
            }
            T0(1);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        if (i11 != 4 && i11 != 9 && i11 != 11 && i11 != 15 && i11 != 17 && i11 != 19 && i11 != 26 && i11 != 35 && i11 != 48 && i11 != 53 && i11 != 6 && i11 != 7) {
            switch (i11) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i11 != 4 && i11 != 9 && i11 != 11 && i11 != 15 && i11 != 17 && i11 != 19 && i11 != 26 && i11 != 35 && i11 != 48 && i11 != 53 && i11 != 6 && i11 != 7) {
                switch (i11) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    default:
                        i12 = 3;
                        break;
                }
                Object[] objArr = new Object[i12];
                switch (i11) {
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                    case 5:
                    case 8:
                    case 10:
                    case 18:
                    case 23:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    case 28:
                    case 29:
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    case 38:
                    case 40:
                    default:
                        objArr[0] = "type";
                        break;
                    case 12:
                        objArr[0] = "typeConstructor";
                        break;
                    case 13:
                        objArr[0] = "unsubstitutedMemberScope";
                        break;
                    case 14:
                        objArr[0] = "refinedTypeFactory";
                        break;
                    case 16:
                        objArr[0] = "parameters";
                        break;
                    case 20:
                        objArr[0] = "subType";
                        break;
                    case 21:
                        objArr[0] = "superType";
                        break;
                    case 22:
                        objArr[0] = "substitutor";
                        break;
                    case 24:
                        objArr[0] = "result";
                        break;
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    case 33:
                        objArr[0] = "clazz";
                        break;
                    case 32:
                        objArr[0] = "typeArguments";
                        break;
                    case 34:
                        objArr[0] = "projections";
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        objArr[0] = "a";
                        break;
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        objArr[0] = "b";
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        objArr[0] = "typeParameters";
                        break;
                    case 41:
                        objArr[0] = "typeParameterConstructors";
                        break;
                    case 42:
                        objArr[0] = "specialType";
                        break;
                    case 43:
                    case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        objArr[0] = "isSpecialType";
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case 46:
                        objArr[0] = "parameterDescriptor";
                        break;
                    case 47:
                    case 51:
                        objArr[0] = "numberValueTypeConstructor";
                        break;
                    case 49:
                    case 50:
                        objArr[0] = "supertypes";
                        break;
                    case 52:
                    case 55:
                        objArr[0] = "expectedType";
                        break;
                    case 54:
                        objArr[0] = "literalTypeConstructor";
                        break;
                }
                if (i11 == 4) {
                    if (i11 != 9) {
                        if (i11 == 11 || i11 == 15) {
                            objArr[1] = "makeUnsubstitutedType";
                        } else if (i11 == 17) {
                            objArr[1] = "getDefaultTypeProjections";
                        } else if (i11 == 19) {
                            objArr[1] = "getImmediateSupertypes";
                        } else if (i11 == 26) {
                            objArr[1] = "getAllSupertypes";
                        } else if (i11 == 35) {
                            objArr[1] = "substituteProjectionsForParameters";
                        } else if (i11 != 48) {
                            if (i11 != 53) {
                                if (i11 != 6 && i11 != 7) {
                                    switch (i11) {
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                            break;
                                    }
                                }
                            }
                            objArr[1] = "getPrimitiveNumberType";
                        } else {
                            objArr[1] = "getDefaultPrimitiveNumberType";
                        }
                    }
                    objArr[1] = "makeNullableIfNeeded";
                } else {
                    objArr[1] = "makeNullableAsSpecified";
                }
                switch (i11) {
                    case 1:
                        objArr[2] = "makeNullable";
                        break;
                    case 2:
                        objArr[2] = "makeNotNullable";
                        break;
                    case 3:
                        objArr[2] = "makeNullableAsSpecified";
                        break;
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    case 5:
                    case 8:
                        objArr[2] = "makeNullableIfNeeded";
                        break;
                    case 10:
                        objArr[2] = "canHaveSubtypes";
                        break;
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "makeUnsubstitutedType";
                        break;
                    case 16:
                        objArr[2] = "getDefaultTypeProjections";
                        break;
                    case 18:
                        objArr[2] = "getImmediateSupertypes";
                        break;
                    case 20:
                    case 21:
                    case 22:
                        objArr[2] = "createSubstitutedSupertype";
                        break;
                    case 23:
                    case 24:
                        objArr[2] = "collectAllSupertypes";
                        break;
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                        objArr[2] = "getAllSupertypes";
                        break;
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        objArr[2] = "isNullableType";
                        break;
                    case 28:
                        objArr[2] = "acceptsNullable";
                        break;
                    case 29:
                        objArr[2] = "hasNullableSuperType";
                        break;
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                        objArr[2] = "getClassDescriptor";
                        break;
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    case 32:
                        objArr[2] = "substituteParameters";
                        break;
                    case 33:
                    case 34:
                        objArr[2] = "substituteProjectionsForParameters";
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        objArr[2] = "equalTypes";
                        break;
                    case 38:
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        objArr[2] = "dependsOnTypeParameters";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "dependsOnTypeConstructors";
                        break;
                    case 42:
                    case 43:
                    case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        objArr[2] = "contains";
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case 46:
                        objArr[2] = "makeStarProjection";
                        break;
                    case 47:
                    case 49:
                        objArr[2] = "getDefaultPrimitiveNumberType";
                        break;
                    case 50:
                        objArr[2] = "findByFqName";
                        break;
                    case 51:
                    case 52:
                    case 54:
                    case 55:
                        objArr[2] = "getPrimitiveNumberType";
                        break;
                    case 60:
                        objArr[2] = "isTypeParameter";
                        break;
                    case 61:
                        objArr[2] = "isReifiedTypeParameter";
                        break;
                    case 62:
                        objArr[2] = "isNonReifiedTypeParameter";
                        break;
                    case 63:
                        objArr[2] = "getTypeParameterDescriptorOrNull";
                        break;
                    default:
                        objArr[2] = "noExpectedType";
                        break;
                }
                String format = String.format(str, objArr);
                if (i11 != 4 && i11 != 9 && i11 != 11 && i11 != 15 && i11 != 17 && i11 != 19 && i11 != 26 && i11 != 35 && i11 != 48 && i11 != 53 && i11 != 6 && i11 != 7) {
                    switch (i11) {
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i12 = 2;
            Object[] objArr2 = new Object[i12];
            switch (i11) {
            }
            if (i11 == 4) {
            }
            switch (i11) {
            }
            String format2 = String.format(str, objArr2);
            if (i11 != 4) {
                switch (i11) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i11 != 4) {
            switch (i11) {
            }
            Object[] objArr22 = new Object[i12];
            switch (i11) {
            }
            if (i11 == 4) {
            }
            switch (i11) {
            }
            String format22 = String.format(str, objArr22);
            if (i11 != 4) {
            }
            throw new IllegalStateException(format22);
        }
        i12 = 2;
        Object[] objArr222 = new Object[i12];
        switch (i11) {
        }
        if (i11 == 4) {
        }
        switch (i11) {
        }
        String format222 = String.format(str, objArr222);
        if (i11 != 4) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean b(@NotNull N n11) {
        if (n11 == null) {
            a(28);
            throw null;
        }
        if (n11.I0()) {
            return true;
        }
        if (!C7363H.a(n11)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(n11, "<this>");
        return b(((AbstractC7360E) n11.K0()).Q0());
    }

    public static boolean c(N n11, @NotNull Function1<K0, Boolean> function1) {
        return d(n11, function1, null);
    }

    private static boolean d(N n11, @NotNull Function1<K0, Boolean> function1, te.i<N> iVar) {
        if (n11 == null) {
            return false;
        }
        K0 K02 = n11.K0();
        if (q(n11)) {
            return function1.invoke(K02).booleanValue();
        }
        if (iVar != null && iVar.contains(n11)) {
            return false;
        }
        if (function1.invoke(K02).booleanValue()) {
            return true;
        }
        if (iVar == null) {
            iVar = new te.i<>();
        }
        iVar.add(n11);
        AbstractC7360E abstractC7360E = K02 instanceof AbstractC7360E ? (AbstractC7360E) K02 : null;
        if (abstractC7360E != null && (d(abstractC7360E.P0(), function1, iVar) || d(abstractC7360E.Q0(), function1, iVar))) {
            return true;
        }
        if ((K02 instanceof C7401v) && d(((C7401v) K02).T0(), function1, iVar)) {
            return true;
        }
        s0 H02 = n11.H0();
        if (H02 instanceof M) {
            Iterator<N> it = ((M) H02).o().iterator();
            while (it.hasNext()) {
                if (d(it.next(), function1, iVar)) {
                    return true;
                }
            }
            return false;
        }
        for (y0 y0Var : n11.F0()) {
            if (!y0Var.a() && d(y0Var.getType(), function1, iVar)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static List<y0> e(@NotNull List<td.i0> list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<td.i0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new A0(it.next().q()));
        }
        List<y0> U02 = C7714v.U0(arrayList);
        if (U02 != null) {
            return U02;
        }
        a(17);
        throw null;
    }

    public static boolean f(@NotNull N n11) {
        if (n11 == null) {
            a(29);
            throw null;
        }
        if (n11.H0().p() instanceof InterfaceC9839e) {
            return false;
        }
        F0 e11 = F0.e(n11);
        Collection<N> o11 = n11.H0().o();
        ArrayList arrayList = new ArrayList(o11.size());
        for (N n12 : o11) {
            if (n12 == null) {
                a(21);
                throw null;
            }
            N l11 = e11.l(n12, L0.INVARIANT);
            N l12 = l11 != null ? l(l11, n11.I0()) : null;
            if (l12 != null) {
                arrayList.add(l12);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (g((N) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(@NotNull N n11) {
        if (n11 == null) {
            a(27);
            throw null;
        }
        if (n11.I0()) {
            return true;
        }
        if (C7363H.a(n11)) {
            Intrinsics.checkNotNullParameter(n11, "<this>");
            if (g(((AbstractC7360E) n11.K0()).Q0())) {
                return true;
            }
        }
        Intrinsics.checkNotNullParameter(n11, "<this>");
        if (n11.K0() instanceof C7401v) {
            return false;
        }
        if (h(n11)) {
            return f(n11);
        }
        if (n11 instanceof AbstractC7376e) {
            td.i0 a11 = ((AbstractC7376e) n11).Q0().a();
            return a11 == null || f(a11.q());
        }
        s0 H02 = n11.H0();
        if (!(H02 instanceof M)) {
            return false;
        }
        Iterator<N> it = ((M) H02).o().iterator();
        while (it.hasNext()) {
            if (g(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(@NotNull N n11) {
        if (n11 != null) {
            return (n11.H0().p() instanceof td.i0 ? (td.i0) n11.H0().p() : null) != null || (n11.H0() instanceof ke.s);
        }
        a(60);
        throw null;
    }

    @NotNull
    public static K0 i(@NotNull N n11) {
        if (n11 != null) {
            return k(n11, false);
        }
        a(2);
        throw null;
    }

    @NotNull
    public static K0 j(@NotNull N n11) {
        if (n11 != null) {
            return k(n11, true);
        }
        a(1);
        throw null;
    }

    @NotNull
    public static K0 k(@NotNull N n11, boolean z11) {
        if (n11 == null) {
            a(3);
            throw null;
        }
        K0 L02 = n11.K0().L0(z11);
        if (L02 != null) {
            return L02;
        }
        a(4);
        throw null;
    }

    @NotNull
    public static N l(@NotNull N n11, boolean z11) {
        if (n11 != null) {
            return z11 ? k(n11, true) : n11;
        }
        a(8);
        throw null;
    }

    @NotNull
    public static Y m(@NotNull Y y11, boolean z11) {
        if (y11 == null) {
            a(5);
            throw null;
        }
        if (!z11) {
            if (y11 != null) {
                return y11;
            }
            a(7);
            throw null;
        }
        Y L02 = y11.L0(true);
        if (L02 != null) {
            return L02;
        }
        a(6);
        throw null;
    }

    @NotNull
    public static C7379f0 n(@NotNull td.i0 i0Var) {
        if (i0Var != null) {
            return new C7379f0(i0Var);
        }
        a(45);
        throw null;
    }

    @NotNull
    public static z0 o(@NotNull td.i0 i0Var, Hd.a aVar) {
        if (i0Var != null) {
            return aVar.d() == G0.SUPERTYPE ? new A0(C7383h0.b(i0Var)) : new C7379f0(i0Var);
        }
        a(46);
        throw null;
    }

    @NotNull
    public static Y p(@NotNull s0 s0Var, @NotNull ce.l lVar, @NotNull Function1<ke.h, Y> function1) {
        if (s0Var == null) {
            a(12);
            throw null;
        }
        if (lVar == null) {
            a(13);
            throw null;
        }
        List<y0> e11 = e(s0Var.getParameters());
        o0.f69907b.getClass();
        return Q.h(o0.f69908c, s0Var, e11, false, lVar, function1);
    }

    public static boolean q(@NotNull N n11) {
        if (n11 != null) {
            return n11 == f69836c || n11 == f69837d;
        }
        a(0);
        throw null;
    }
}
