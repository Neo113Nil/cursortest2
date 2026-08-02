package wd;

import ce.l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import je.s0;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.C9852r;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.i0;
import td.n0;
import ud.InterfaceC10030h;

/* renamed from: wd.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10530p extends AbstractC10529o {

    /* renamed from: g, reason: collision with root package name */
    private final EnumC9812C f104317g;

    /* renamed from: h, reason: collision with root package name */
    private final EnumC9840f f104318h;

    /* renamed from: i, reason: collision with root package name */
    private final je.r f104319i;

    /* renamed from: j, reason: collision with root package name */
    private ce.l f104320j;

    /* renamed from: k, reason: collision with root package name */
    private Set<InterfaceC9838d> f104321k;

    /* renamed from: l, reason: collision with root package name */
    private C10528n f104322l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10530p(@NotNull InterfaceC9845k interfaceC9845k, @NotNull Sd.f fVar, @NotNull EnumC9812C enumC9812C, @NotNull EnumC9840f enumC9840f, @NotNull Collection collection, @NotNull ie.o oVar) {
        super(oVar, interfaceC9845k, fVar, r0);
        td.d0 d0Var = td.d0.f99392a;
        if (interfaceC9845k == null) {
            n0(0);
            throw null;
        }
        if (fVar == null) {
            n0(1);
            throw null;
        }
        if (enumC9812C == null) {
            n0(2);
            throw null;
        }
        if (enumC9840f == null) {
            n0(3);
            throw null;
        }
        if (collection == null) {
            n0(4);
            throw null;
        }
        if (oVar == null) {
            n0(6);
            throw null;
        }
        this.f104317g = enumC9812C;
        this.f104318h = enumC9840f;
        this.f104319i = new je.r(this, Collections.EMPTY_LIST, collection, oVar);
    }

    private static /* synthetic */ void n0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i12 = 2;
                break;
            case 12:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i11) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // td.InterfaceC9839e
    public final boolean E0() {
        return false;
    }

    public final void F0(@NotNull ce.l lVar, @NotNull Set set, C10528n c10528n) {
        if (lVar == null) {
            n0(7);
            throw null;
        }
        if (set == null) {
            n0(8);
            throw null;
        }
        this.f104320j = lVar;
        this.f104321k = set;
        this.f104322l = c10528n;
    }

    @Override // wd.G
    @NotNull
    public final ce.l V(@NotNull ke.h hVar) {
        if (hVar == null) {
            n0(12);
            throw null;
        }
        ce.l lVar = this.f104320j;
        if (lVar != null) {
            return lVar;
        }
        n0(13);
        throw null;
    }

    @Override // td.InterfaceC9839e
    public final n0<je.Y> e0() {
        return null;
    }

    @Override // td.InterfaceC9843i
    public final boolean g() {
        return false;
    }

    @Override // td.InterfaceC9811B
    public final boolean g0() {
        return false;
    }

    @Override // ud.InterfaceC10023a
    @NotNull
    public final InterfaceC10030h getAnnotations() {
        return InterfaceC10030h.a.b();
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final EnumC9840f getKind() {
        EnumC9840f enumC9840f = this.f104318h;
        if (enumC9840f != null) {
            return enumC9840f;
        }
        n0(15);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B, td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        AbstractC9853s abstractC9853s = C9852r.f99403e;
        if (abstractC9853s != null) {
            return abstractC9853s;
        }
        n0(17);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B
    @NotNull
    public final EnumC9812C h() {
        EnumC9812C enumC9812C = this.f104317g;
        if (enumC9812C != null) {
            return enumC9812C;
        }
        n0(16);
        throw null;
    }

    @Override // td.InterfaceC9839e
    public final boolean isInline() {
        return false;
    }

    @Override // td.InterfaceC9839e
    public final boolean j0() {
        return false;
    }

    @Override // td.InterfaceC9842h
    @NotNull
    public final s0 k() {
        je.r rVar = this.f104319i;
        if (rVar != null) {
            return rVar;
        }
        n0(10);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final Collection<InterfaceC9838d> l() {
        Set<InterfaceC9838d> set = this.f104321k;
        if (set != null) {
            return set;
        }
        n0(11);
        throw null;
    }

    @Override // td.InterfaceC9839e
    public final boolean l0() {
        return false;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final Collection<InterfaceC9839e> m() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        n0(19);
        throw null;
    }

    @Override // td.InterfaceC9811B
    public final boolean p0() {
        return false;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final ce.l q0() {
        l.b bVar = l.b.f57046b;
        if (bVar != null) {
            return bVar;
        }
        n0(14);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9843i
    @NotNull
    public final List<i0> r() {
        List<i0> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        n0(18);
        throw null;
    }

    @Override // td.InterfaceC9839e
    public final InterfaceC9839e r0() {
        return null;
    }

    @Override // td.InterfaceC9839e
    public final boolean s() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // td.InterfaceC9839e
    public final InterfaceC9838d z() {
        return this.f104322l;
    }
}
