package wd;

import ce.l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import je.s0;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9857w;
import td.i0;
import td.n0;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
public final class M extends AbstractC10529o {

    /* renamed from: g, reason: collision with root package name */
    private final EnumC9840f f104202g;

    /* renamed from: h, reason: collision with root package name */
    private EnumC9812C f104203h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC9853s f104204i;

    /* renamed from: j, reason: collision with root package name */
    private je.r f104205j;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f104206k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList f104207l;

    /* renamed from: m, reason: collision with root package name */
    private final ie.o f104208m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public M(@NotNull C10533t c10533t, @NotNull EnumC9840f enumC9840f, @NotNull Sd.f fVar, @NotNull ie.o oVar) {
        super(oVar, c10533t, fVar, r0);
        td.d0 d0Var = td.d0.f99392a;
        if (enumC9840f == null) {
            n0(1);
            throw null;
        }
        if (fVar == null) {
            n0(2);
            throw null;
        }
        if (oVar == null) {
            n0(4);
            throw null;
        }
        this.f104207l = new ArrayList();
        this.f104208m = oVar;
        this.f104202g = enumC9840f;
    }

    private static /* synthetic */ void n0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i12 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // td.InterfaceC9839e
    public final boolean E0() {
        return false;
    }

    public final void F0() {
        this.f104205j = new je.r(this, this.f104206k, this.f104207l, this.f104208m);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            n0(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C10528n) ((InterfaceC9857w) it.next())).W0(q());
        }
    }

    public final void G0(@NotNull EnumC9812C enumC9812C) {
        if (enumC9812C != null) {
            this.f104203h = enumC9812C;
        } else {
            n0(6);
            throw null;
        }
    }

    public final void H0(@NotNull List<i0> list) {
        if (list == null) {
            n0(14);
            throw null;
        }
        if (this.f104206k == null) {
            this.f104206k = new ArrayList(list);
        } else {
            throw new IllegalStateException("Type parameters are already set for " + getName());
        }
    }

    public final void I0(@NotNull AbstractC9853s abstractC9853s) {
        if (abstractC9853s != null) {
            this.f104204i = abstractC9853s;
        } else {
            n0(9);
            throw null;
        }
    }

    @Override // wd.G
    @NotNull
    public final ce.l V(@NotNull ke.h hVar) {
        if (hVar == null) {
            n0(16);
            throw null;
        }
        l.b bVar = l.b.f57046b;
        if (bVar != null) {
            return bVar;
        }
        n0(17);
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
        EnumC9840f enumC9840f = this.f104202g;
        if (enumC9840f != null) {
            return enumC9840f;
        }
        n0(8);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B, td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        AbstractC9853s abstractC9853s = this.f104204i;
        if (abstractC9853s != null) {
            return abstractC9853s;
        }
        n0(10);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B
    @NotNull
    public final EnumC9812C h() {
        EnumC9812C enumC9812C = this.f104203h;
        if (enumC9812C != null) {
            return enumC9812C;
        }
        n0(7);
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
        je.r rVar = this.f104205j;
        if (rVar != null) {
            return rVar;
        }
        n0(11);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final Collection l() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        n0(13);
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
        n0(18);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9843i
    @NotNull
    public final List<i0> r() {
        ArrayList arrayList = this.f104206k;
        if (arrayList != null) {
            return arrayList;
        }
        n0(15);
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

    public final String toString() {
        return r.V(this);
    }

    @Override // td.InterfaceC9839e
    public final InterfaceC9838d z() {
        return null;
    }
}
