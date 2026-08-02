package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.DescriptorProtos$FileOptions;
import ie.C7056e;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;
import java.util.List;
import je.L0;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9845k;
import td.g0;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
public final class a0 extends AbstractC10527m {

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f104270k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f104271l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private a0(@NotNull InterfaceC9845k interfaceC9845k, @NotNull InterfaceC10030h interfaceC10030h, boolean z11, @NotNull L0 l02, @NotNull Sd.f fVar, int i11, @NotNull ie.o oVar) {
        super(oVar, interfaceC9845k, interfaceC10030h, fVar, l02, z11, i11, r8);
        g0.a aVar = g0.a.f99394a;
        if (interfaceC9845k == null) {
            N(19);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(20);
            throw null;
        }
        if (l02 == null) {
            N(21);
            throw null;
        }
        if (fVar == null) {
            N(22);
            throw null;
        }
        if (oVar == null) {
            N(25);
            throw null;
        }
        this.f104270k = new ArrayList(1);
        this.f104271l = false;
    }

    public static a0 I0(@NotNull InterfaceC9845k interfaceC9845k, @NotNull InterfaceC10030h interfaceC10030h, boolean z11, @NotNull L0 l02, @NotNull Sd.f fVar, int i11, @NotNull ie.o oVar) {
        if (interfaceC9845k == null) {
            N(6);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(7);
            throw null;
        }
        if (l02 == null) {
            N(8);
            throw null;
        }
        if (fVar == null) {
            N(9);
            throw null;
        }
        if (oVar != null) {
            return new a0(interfaceC9845k, interfaceC10030h, z11, l02, fVar, i11, oVar);
        }
        N(11);
        throw null;
    }

    @NotNull
    public static a0 J0(@NotNull AbstractC10516b abstractC10516b, @NotNull InterfaceC10030h.a.C2208a c2208a, @NotNull L0 l02, @NotNull Sd.f fVar, int i11, @NotNull C7056e c7056e) {
        if (abstractC10516b == null) {
            N(0);
            throw null;
        }
        if (l02 == null) {
            N(2);
            throw null;
        }
        if (c7056e == null) {
            N(4);
            throw null;
        }
        a0 I02 = I0(abstractC10516b, c2208a, false, l02, fVar, i11, c7056e);
        I02.H0(Zd.e.e(abstractC10516b).C());
        I02.M0();
        return I02;
    }

    private String L0() {
        return getName() + " declared in " + Vd.i.k(d());
    }

    private static /* synthetic */ void N(int i11) {
        String str = (i11 == 5 || i11 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 5 || i11 == 28) ? 2 : 3];
        switch (i11) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 4:
            case 11:
            case 18:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                objArr[0] = "bound";
                break;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                objArr[0] = "type";
                break;
        }
        if (i11 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i11 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i11) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                objArr[2] = "<init>";
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                objArr[2] = "addUpperBound";
                break;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 5 && i11 != 28) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // wd.AbstractC10527m
    protected final void F0(@NotNull je.N n11) {
        if (n11 != null) {
            return;
        }
        N(27);
        throw null;
    }

    @Override // wd.AbstractC10527m
    @NotNull
    protected final List<je.N> G0() {
        if (!this.f104271l) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + L0());
        }
        ArrayList arrayList = this.f104270k;
        if (arrayList != null) {
            return arrayList;
        }
        N(28);
        throw null;
    }

    public final void H0(@NotNull je.N n11) {
        if (n11 == null) {
            N(26);
            throw null;
        }
        if (this.f104271l) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + L0());
        }
        if (je.S.a(n11)) {
            return;
        }
        this.f104270k.add(n11);
    }

    public final boolean K0() {
        return this.f104271l;
    }

    public final void M0() {
        if (!this.f104271l) {
            this.f104271l = true;
        } else {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + L0());
        }
    }
}
