package qd;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import ie.C7056e;
import ie.InterfaceC7059h;
import ie.InterfaceC7061j;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import je.A0;
import je.H0;
import je.K0;
import je.L0;
import je.N;
import je.Q;
import je.Y;
import je.p0;
import je.s0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.log.Logger;
import qd.InterfaceC9024b;
import qd.s;
import rd.AbstractC9252f;
import rd.C9247a;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import td.C9851q;
import td.C9856v;
import td.InterfaceC9815F;
import td.InterfaceC9820K;
import td.InterfaceC9831W;
import td.InterfaceC9833Y;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import ud.InterfaceC10030h;
import vd.InterfaceC10304a;
import vd.InterfaceC10305b;
import vd.InterfaceC10306c;
import wd.L;
import wd.S;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: e, reason: collision with root package name */
    public static final Sd.f f81837e = Sd.f.i("<built-ins module>");

    /* renamed from: a, reason: collision with root package name */
    private L f81838a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7061j<b> f81839b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7059h<Sd.f, InterfaceC9839e> f81840c;

    /* renamed from: d, reason: collision with root package name */
    private final C7056e f81841d;

    final class a implements Function0<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L f81842a;

        a(L l11) {
            this.f81842a = l11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            m mVar = m.this;
            L l11 = mVar.f81838a;
            L l12 = this.f81842a;
            if (l11 == null) {
                mVar.f81838a = l12;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + mVar.f81838a + " (attempting to reset to " + l12 + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        public final EnumMap f81844a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f81845b;

        private b() {
            throw null;
        }

        b(EnumMap enumMap, HashMap hashMap, HashMap hashMap2) {
            this.f81844a = enumMap;
            this.f81845b = hashMap2;
        }
    }

    protected m(@NotNull C7056e c7056e) {
        this.f81841d = c7056e;
        c7056e.a(new j(this));
        this.f81839b = c7056e.a(new k(this));
        this.f81840c = c7056e.d(new l(this));
    }

    public static p I(@NotNull InterfaceC9842h interfaceC9842h) {
        if (interfaceC9842h == null) {
            a(78);
            throw null;
        }
        if (s.a.f81900b0.contains(interfaceC9842h.getName())) {
            return (p) s.a.f81904d0.get(Vd.i.k(interfaceC9842h));
        }
        return null;
    }

    public static p K(@NotNull InterfaceC9839e interfaceC9839e) {
        if (interfaceC9839e == null) {
            a(77);
            throw null;
        }
        if (s.a.f81898a0.contains(interfaceC9839e.getName())) {
            return (p) s.a.f81902c0.get(Vd.i.k(interfaceC9839e));
        }
        return null;
    }

    public static boolean Q(@NotNull InterfaceC9839e interfaceC9839e) {
        if (interfaceC9839e != null) {
            return e(interfaceC9839e, s.a.f81897a);
        }
        a(109);
        throw null;
    }

    public static boolean R(@NotNull N n11) {
        if (n11 != null) {
            return W(n11, s.a.f81897a);
        }
        a(140);
        throw null;
    }

    public static boolean S(@NotNull N n11) {
        if (n11 != null) {
            return W(n11, s.a.f81907g);
        }
        a(89);
        throw null;
    }

    public static boolean T(@NotNull InterfaceC9839e interfaceC9839e) {
        if (interfaceC9839e != null) {
            return e(interfaceC9839e, s.a.f81907g) || I(interfaceC9839e) != null;
        }
        a(90);
        throw null;
    }

    public static boolean U(@NotNull N n11) {
        return X(n11, s.a.f81908h);
    }

    public static boolean V(@NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k != null) {
            return Vd.i.n(interfaceC9845k, c.class, false) != null;
        }
        a(9);
        throw null;
    }

    private static boolean W(@NotNull N n11, @NotNull Sd.d dVar) {
        if (n11 == null) {
            a(98);
            throw null;
        }
        if (dVar != null) {
            return j0(n11.H0(), dVar);
        }
        a(99);
        throw null;
    }

    private static boolean X(@NotNull N n11, @NotNull Sd.d dVar) {
        if (dVar != null) {
            return W(n11, dVar) && !n11.I0();
        }
        a(136);
        throw null;
    }

    public static boolean Y(@NotNull N n11) {
        if (n11 != null) {
            return d0(n11);
        }
        a(142);
        throw null;
    }

    public static boolean Z(@NotNull InterfaceC9857w interfaceC9857w) {
        if (interfaceC9857w.n0().getAnnotations().K0(s.a.f81913m)) {
            return true;
        }
        if (!(interfaceC9857w instanceof InterfaceC9831W)) {
            return false;
        }
        InterfaceC9831W interfaceC9831W = (InterfaceC9831W) interfaceC9857w;
        boolean B11 = interfaceC9831W.B();
        S getter = interfaceC9831W.getGetter();
        InterfaceC9833Y setter = interfaceC9831W.getSetter();
        if (getter == null || !Z(getter)) {
            return false;
        }
        if (B11) {
            return setter != null && Z(setter);
        }
        return true;
    }

    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
            case 29:
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case 34:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case 41:
            case 42:
            case 43:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case ModuleDescriptor.MODULE_VERSION /* 73 */:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
            case 29:
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case 34:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case 41:
            case 42:
            case 43:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i12 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case ModuleDescriptor.MODULE_VERSION /* 73 */:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case ModuleDescriptor.MODULE_VERSION /* 73 */:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
            case 29:
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case 34:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case 41:
            case 42:
            case 43:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case Logger.NONE /* 99 */:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i11) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case ModuleDescriptor.MODULE_VERSION /* 73 */:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                objArr[1] = "getKProperty0";
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                objArr[1] = "getKProperty1";
                break;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                objArr[1] = "getKMutableProperty2";
                break;
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                objArr[1] = "getCollection";
                break;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                objArr[1] = "getMutableCollection";
                break;
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                objArr[1] = "getMutableMapEntry";
                break;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                objArr[1] = "getBooleanType";
                break;
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i11) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
            case 29:
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case 34:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case 41:
            case 42:
            case 43:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case ModuleDescriptor.MODULE_VERSION /* 73 */:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case Logger.NONE /* 99 */:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
            case 29:
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case 34:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case 41:
            case 42:
            case 43:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case ModuleDescriptor.MODULE_VERSION /* 73 */:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean a0(@NotNull InterfaceC9839e interfaceC9839e) {
        return e(interfaceC9839e, s.a.f81887Q);
    }

    static Y b(m mVar, String str) {
        if (str == null) {
            mVar.getClass();
            a(47);
            throw null;
        }
        Y q11 = mVar.p(str).q();
        if (q11 != null) {
            return q11;
        }
        a(48);
        throw null;
    }

    private static boolean b0(@NotNull N n11, @NotNull Sd.d dVar) {
        if (dVar != null) {
            return !n11.I0() && W(n11, dVar);
        }
        a(107);
        throw null;
    }

    public static boolean c0(@NotNull N n11) {
        if (n11 == null) {
            a(137);
            throw null;
        }
        if (n11 != null) {
            return W(n11, s.a.f81899b) && !H0.g(n11);
        }
        a(139);
        throw null;
    }

    public static boolean d0(@NotNull N n11) {
        if (n11 != null) {
            return R(n11) && n11.I0();
        }
        a(141);
        throw null;
    }

    private static boolean e(@NotNull InterfaceC9839e interfaceC9839e, @NotNull Sd.d dVar) {
        if (interfaceC9839e == null) {
            a(104);
            throw null;
        }
        if (dVar != null) {
            return interfaceC9839e.getName().equals(dVar.i()) && dVar.equals(Vd.i.k(interfaceC9839e));
        }
        a(105);
        throw null;
    }

    public static boolean e0(@NotNull N n11) {
        if (n11 != null) {
            InterfaceC9842h p11 = n11.H0().p();
            return (p11 == null || I(p11) == null) ? false : true;
        }
        a(92);
        throw null;
    }

    public static boolean f0(@NotNull InterfaceC9839e interfaceC9839e) {
        if (interfaceC9839e != null) {
            return K(interfaceC9839e) != null;
        }
        a(97);
        throw null;
    }

    public static boolean g0(@NotNull N n11) {
        if (n11 == null) {
            a(95);
            throw null;
        }
        if (n11.I0()) {
            return false;
        }
        InterfaceC9842h p11 = n11.H0().p();
        return (p11 instanceof InterfaceC9839e) && f0((InterfaceC9839e) p11);
    }

    public static boolean h0(@NotNull InterfaceC9839e interfaceC9839e) {
        if (interfaceC9839e != null) {
            return e(interfaceC9839e, s.a.f81897a) || e(interfaceC9839e, s.a.f81899b);
        }
        a(108);
        throw null;
    }

    public static boolean i0(N n11) {
        return b0(n11, s.a.f81906f);
    }

    public static boolean j0(@NotNull s0 s0Var, @NotNull Sd.d dVar) {
        if (s0Var == null) {
            a(102);
            throw null;
        }
        if (dVar != null) {
            InterfaceC9842h p11 = s0Var.p();
            return (p11 instanceof InterfaceC9839e) && e((InterfaceC9839e) p11, dVar);
        }
        a(103);
        throw null;
    }

    public static boolean k0(@NotNull InterfaceC9842h interfaceC9842h) {
        if (interfaceC9842h == null) {
            a(10);
            throw null;
        }
        for (InterfaceC9842h interfaceC9842h2 = interfaceC9842h; interfaceC9842h2 != null; interfaceC9842h2 = interfaceC9842h2.d()) {
            if (interfaceC9842h2 instanceof InterfaceC9820K) {
                return ((InterfaceC9820K) interfaceC9842h2).c().i(s.f81864k);
            }
        }
        return false;
    }

    public static boolean l0(@NotNull N n11) {
        return b0(n11, s.a.f81903d);
    }

    public static void m0(@NotNull N n11) {
        if (X(n11, s.a.f81893W.j()) || X(n11, s.a.f81894X.j()) || X(n11, s.a.f81895Y.j())) {
            return;
        }
        X(n11, s.a.f81896Z.j());
    }

    @NotNull
    private InterfaceC9839e p(@NotNull String str) {
        if (str == null) {
            a(14);
            throw null;
        }
        InterfaceC9839e invoke = this.f81840c.invoke(Sd.f.f(str));
        if (invoke != null) {
            return invoke;
        }
        a(15);
        throw null;
    }

    @NotNull
    public final Y A() {
        Y J11 = J(p.LONG);
        if (J11 != null) {
            return J11;
        }
        a(60);
        throw null;
    }

    @NotNull
    public final Y B() {
        Y q11 = p("Nothing").q();
        if (q11 != null) {
            return q11;
        }
        a(49);
        throw null;
    }

    @NotNull
    public final Y C() {
        Y L02 = i().L0(true);
        if (L02 != null) {
            return L02;
        }
        a(52);
        throw null;
    }

    @NotNull
    public final Y D() {
        Y L02 = B().L0(true);
        if (L02 != null) {
            return L02;
        }
        a(50);
        throw null;
    }

    @NotNull
    public final InterfaceC9839e E() {
        return p("Number");
    }

    @NotNull
    public final Y F() {
        Y q11 = p("Number").q();
        if (q11 != null) {
            return q11;
        }
        a(56);
        throw null;
    }

    @NotNull
    protected InterfaceC10306c G() {
        return InterfaceC10306c.b.f102851a;
    }

    @NotNull
    public final Y H(@NotNull p pVar) {
        if (pVar == null) {
            a(74);
            throw null;
        }
        Y y11 = (Y) this.f81839b.invoke().f81844a.get(pVar);
        if (y11 != null) {
            return y11;
        }
        a(75);
        throw null;
    }

    @NotNull
    public final Y J(@NotNull p pVar) {
        if (pVar == null) {
            a(54);
            throw null;
        }
        if (pVar == null) {
            a(16);
            throw null;
        }
        Y q11 = p(pVar.g().b()).q();
        if (q11 != null) {
            return q11;
        }
        a(55);
        throw null;
    }

    @NotNull
    public final Y L() {
        Y J11 = J(p.SHORT);
        if (J11 != null) {
            return J11;
        }
        a(58);
        throw null;
    }

    @NotNull
    protected final ie.o M() {
        return this.f81841d;
    }

    @NotNull
    public final Y N() {
        Y q11 = p("String").q();
        if (q11 != null) {
            return q11;
        }
        a(66);
        throw null;
    }

    @NotNull
    public final InterfaceC9839e O(int i11) {
        return o(s.f81859f.c(Sd.f.f(AbstractC9252f.d.f83308c.a() + i11)));
    }

    @NotNull
    public final Y P() {
        Y q11 = p("Unit").q();
        if (q11 != null) {
            return q11;
        }
        a(65);
        throw null;
    }

    protected final void f(boolean z11) {
        Sd.f moduleName = f81837e;
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        C7056e storageManager = this.f81841d;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(this, "builtIns");
        L l11 = new L(moduleName, storageManager, this, 48);
        this.f81838a = l11;
        InterfaceC9024b.f81826a.getClass();
        l11.G0(InterfaceC9024b.a.a().a(storageManager, this.f81838a, u(), G(), g(), z11));
        L l12 = this.f81838a;
        l12.H0(l12);
    }

    @NotNull
    protected InterfaceC10304a g() {
        return InterfaceC10304a.C2230a.f102849a;
    }

    @NotNull
    public final InterfaceC9839e h() {
        return p("Any");
    }

    @NotNull
    public final Y i() {
        Y q11 = p("Any").q();
        if (q11 != null) {
            return q11;
        }
        a(51);
        throw null;
    }

    @NotNull
    public final InterfaceC9839e j() {
        return p("Array");
    }

    @NotNull
    public final N k(@NotNull N n11) {
        Sd.b f7;
        Sd.b a11;
        InterfaceC9839e a12;
        Y y11 = null;
        if (n11 == null) {
            a(68);
            throw null;
        }
        if (S(n11)) {
            if (n11.F0().size() != 1) {
                throw new IllegalStateException();
            }
            N type = n11.F0().get(0).getType();
            if (type != null) {
                return type;
            }
            a(69);
            throw null;
        }
        K0 i11 = H0.i(n11);
        N n12 = (N) this.f81839b.invoke().f81845b.get(i11);
        if (n12 != null) {
            return n12;
        }
        InterfaceC9815F f11 = Vd.i.f(i11);
        if (f11 != null) {
            InterfaceC9842h p11 = i11.H0().p();
            if (p11 != null) {
                int i12 = w.f81933f;
                if (w.b(p11.getName()) && (f7 = Zd.e.f(p11)) != null && (a11 = w.a(f7)) != null && (a12 = C9856v.a(f11, a11)) != null) {
                    y11 = a12.q();
                }
            }
            if (y11 != null) {
                return y11;
            }
        }
        throw new IllegalStateException("not array: " + n11);
    }

    @NotNull
    public final Y l(@NotNull L0 l02, @NotNull N n11, @NotNull InterfaceC10030h interfaceC10030h) {
        if (l02 == null) {
            a(79);
            throw null;
        }
        if (n11 == null) {
            a(80);
            throw null;
        }
        Y e11 = Q.e(p0.b(interfaceC10030h), p("Array"), Collections.singletonList(new A0(n11, l02)));
        if (e11 != null) {
            return e11;
        }
        a(82);
        throw null;
    }

    @NotNull
    public final Y m(@NotNull L0 l02, @NotNull K0 k02) {
        if (l02 == null) {
            a(83);
            throw null;
        }
        if (k02 != null) {
            return l(l02, k02, InterfaceC10030h.a.b());
        }
        a(84);
        throw null;
    }

    @NotNull
    public final Y n() {
        Y J11 = J(p.BOOLEAN);
        if (J11 != null) {
            return J11;
        }
        a(64);
        throw null;
    }

    public final void n0(@NotNull L l11) {
        this.f81841d.g(new a(l11));
    }

    @NotNull
    public final InterfaceC9839e o(@NotNull Sd.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        InterfaceC9839e b11 = C9851q.b(q(), cVar, Bd.c.FROM_BUILTINS);
        if (b11 != null) {
            return b11;
        }
        a(13);
        throw null;
    }

    @NotNull
    public final L q() {
        this.f81838a.getClass();
        L l11 = this.f81838a;
        if (l11 != null) {
            return l11;
        }
        a(7);
        throw null;
    }

    @NotNull
    public final ce.l r() {
        ce.l p11 = q().v(s.f81865l).p();
        if (p11 != null) {
            return p11;
        }
        a(11);
        throw null;
    }

    @NotNull
    public final Y s() {
        Y J11 = J(p.BYTE);
        if (J11 != null) {
            return J11;
        }
        a(57);
        throw null;
    }

    @NotNull
    public final Y t() {
        Y J11 = J(p.CHAR);
        if (J11 != null) {
            return J11;
        }
        a(63);
        throw null;
    }

    @NotNull
    protected Iterable<InterfaceC10305b> u() {
        List singletonList = Collections.singletonList(new C9247a(this.f81841d, q()));
        if (singletonList != null) {
            return singletonList;
        }
        a(5);
        throw null;
    }

    @NotNull
    public final InterfaceC9839e v() {
        return p("Comparable");
    }

    @NotNull
    public final Y w() {
        Y J11 = J(p.DOUBLE);
        if (J11 != null) {
            return J11;
        }
        a(62);
        throw null;
    }

    @NotNull
    public final Y x() {
        Y J11 = J(p.FLOAT);
        if (J11 != null) {
            return J11;
        }
        a(61);
        throw null;
    }

    @NotNull
    public final InterfaceC9839e y(int i11) {
        Sd.f fVar = s.f81854a;
        return p(Ej.b.a(i11, "Function"));
    }

    @NotNull
    public final Y z() {
        Y J11 = J(p.INT);
        if (J11 != null) {
            return J11;
        }
        a(59);
        throw null;
    }
}
