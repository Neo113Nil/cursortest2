package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.F0;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import td.AbstractC9850p;
import td.AbstractC9853s;
import td.EnumC9812C;
import td.InterfaceC9834Z;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public class V extends AbstractC10539z implements td.c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected V(@NotNull InterfaceC9845k interfaceC9845k, td.c0 c0Var, @NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.f fVar, @NotNull InterfaceC9836b.a aVar, @NotNull td.d0 d0Var) {
        super(fVar, aVar, interfaceC9845k, c0Var, d0Var, interfaceC10030h);
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
        if (aVar == null) {
            N(3);
            throw null;
        }
        if (d0Var != null) {
        } else {
            N(4);
            throw null;
        }
    }

    private static /* synthetic */ void N(int i11) {
        String str = (i11 == 13 || i11 == 18 || i11 == 23 || i11 == 24 || i11 == 29 || i11 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 13 || i11 == 18 || i11 == 23 || i11 == 24 || i11 == 29 || i11 == 30) ? 2 : 3];
        switch (i11) {
            case 1:
            case 6:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
            case 8:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i11 == 13 || i11 == 18 || i11 == 23) {
            objArr[1] = "initialize";
        } else if (i11 == 24) {
            objArr[1] = "getOriginal";
        } else if (i11 == 29) {
            objArr[1] = "copy";
        } else if (i11 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i11) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                break;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 13 && i11 != 18 && i11 != 23 && i11 != 24 && i11 != 29 && i11 != 30) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @NotNull
    public static V b1(@NotNull InterfaceC9839e interfaceC9839e, @NotNull InterfaceC10030h.a.C2208a c2208a, @NotNull Sd.f fVar, @NotNull InterfaceC9836b.a aVar, @NotNull td.d0 d0Var) {
        if (interfaceC9839e == null) {
            N(5);
            throw null;
        }
        if (fVar == null) {
            N(7);
            throw null;
        }
        if (aVar == null) {
            N(8);
            throw null;
        }
        if (d0Var != null) {
            return new V(interfaceC9839e, null, c2208a, fVar, aVar, d0Var);
        }
        N(9);
        throw null;
    }

    @Override // wd.AbstractC10539z
    @NotNull
    protected AbstractC10539z G0(Sd.f fVar, @NotNull InterfaceC9836b.a aVar, @NotNull InterfaceC9845k interfaceC9845k, InterfaceC9857w interfaceC9857w, @NotNull td.d0 d0Var, @NotNull InterfaceC10030h interfaceC10030h) {
        if (interfaceC9845k == null) {
            N(25);
            throw null;
        }
        if (aVar == null) {
            N(26);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(27);
            throw null;
        }
        td.c0 c0Var = (td.c0) interfaceC9857w;
        if (fVar == null) {
            fVar = getName();
        }
        return new V(interfaceC9845k, c0Var, interfaceC10030h, fVar, aVar, d0Var);
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9857w
    @NotNull
    public InterfaceC9857w.a<? extends td.c0> U() {
        return M0(F0.f69829b);
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9836b
    @NotNull
    /* renamed from: a1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public td.c0 u(InterfaceC9839e interfaceC9839e, EnumC9812C enumC9812C, AbstractC9850p abstractC9850p, InterfaceC9836b.a aVar) {
        return (td.c0) super.u(interfaceC9839e, enumC9812C, abstractC9850p, aVar);
    }

    @Override // wd.AbstractC10539z, wd.AbstractC10532s
    @NotNull
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public final td.c0 n0() {
        td.c0 c0Var = (td.c0) super.n0();
        if (c0Var != null) {
            return c0Var;
        }
        N(24);
        throw null;
    }

    @Override // wd.AbstractC10539z
    @NotNull
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public final V L0(U u11, InterfaceC9834Z interfaceC9834Z, @NotNull List list, @NotNull List list2, @NotNull List list3, je.N n11, EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s) {
        if (list == null) {
            N(14);
            throw null;
        }
        if (list2 == null) {
            N(15);
            throw null;
        }
        if (list3 == null) {
            N(16);
            throw null;
        }
        if (abstractC9853s != null) {
            return e1(u11, interfaceC9834Z, list, list2, list3, n11, enumC9812C, abstractC9853s, null);
        }
        N(17);
        throw null;
    }

    @NotNull
    public V e1(U u11, InterfaceC9834Z interfaceC9834Z, @NotNull List list, @NotNull List list2, @NotNull List list3, je.N n11, EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s, Map map) {
        if (list == null) {
            N(19);
            throw null;
        }
        if (list2 == null) {
            N(20);
            throw null;
        }
        if (list3 == null) {
            N(21);
            throw null;
        }
        if (abstractC9853s == null) {
            N(22);
            throw null;
        }
        super.L0(u11, interfaceC9834Z, list, list2, list3, n11, enumC9812C, abstractC9853s);
        if (map != null && !map.isEmpty()) {
            this.f104346D = new LinkedHashMap(map);
        }
        return this;
    }
}
