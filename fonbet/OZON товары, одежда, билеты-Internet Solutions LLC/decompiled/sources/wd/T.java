package wd;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.EnumC9812C;
import td.InterfaceC9831W;
import td.InterfaceC9833Y;
import td.InterfaceC9836b;
import td.InterfaceC9847m;
import td.p0;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public final class T extends P implements InterfaceC9833Y {

    /* renamed from: m, reason: collision with root package name */
    private p0 f104255m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC9833Y f104256n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(@NotNull InterfaceC9831W interfaceC9831W, @NotNull InterfaceC10030h interfaceC10030h, @NotNull EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s, boolean z11, boolean z12, boolean z13, @NotNull InterfaceC9836b.a aVar, InterfaceC9833Y interfaceC9833Y, @NotNull td.d0 d0Var) {
        super(enumC9812C, abstractC9853s, interfaceC9831W, interfaceC10030h, Sd.f.i("<set-" + interfaceC9831W.getName() + ">"), z11, z12, z13, aVar, d0Var);
        if (interfaceC9831W == null) {
            N(0);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(1);
            throw null;
        }
        if (enumC9812C == null) {
            N(2);
            throw null;
        }
        if (abstractC9853s == null) {
            N(3);
            throw null;
        }
        if (aVar == null) {
            N(4);
            throw null;
        }
        if (d0Var == null) {
            N(5);
            throw null;
        }
        this.f104256n = interfaceC9833Y != null ? interfaceC9833Y : this;
    }

    public static c0 K0(@NotNull T t2, @NotNull je.N n11, @NotNull InterfaceC10030h interfaceC10030h) {
        if (n11 == null) {
            N(8);
            throw null;
        }
        if (interfaceC10030h != null) {
            return new c0(t2, null, 0, interfaceC10030h, Sd.h.f26150g, n11, false, false, false, null, td.d0.f99392a);
        }
        N(9);
        throw null;
    }

    private static /* synthetic */ void N(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 10:
            case 11:
            case 12:
            case 13:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i11) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i11) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // wd.P, wd.AbstractC10532s
    @NotNull
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC9833Y n0() {
        InterfaceC9833Y interfaceC9833Y = this.f104256n;
        if (interfaceC9833Y != null) {
            return interfaceC9833Y;
        }
        N(13);
        throw null;
    }

    public final void M0(@NotNull p0 p0Var) {
        if (p0Var != null) {
            this.f104255m = p0Var;
        } else {
            N(6);
            throw null;
        }
    }

    @Override // td.InterfaceC9845k
    public final <R, D> R X(InterfaceC9847m<R, D> interfaceC9847m, D d11) {
        return (R) interfaceC9847m.k(this, d11);
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<p0> f() {
        p0 p0Var = this.f104255m;
        if (p0Var == null) {
            throw new IllegalStateException();
        }
        List<p0> singletonList = Collections.singletonList(p0Var);
        if (singletonList != null) {
            return singletonList;
        }
        N(11);
        throw null;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final je.N getReturnType() {
        je.Y P11 = Zd.e.e(this).P();
        if (P11 != null) {
            return P11;
        }
        N(12);
        throw null;
    }

    @Override // td.InterfaceC9836b, td.InterfaceC9835a
    @NotNull
    public final Collection<? extends InterfaceC9833Y> o() {
        return F0(false);
    }
}
