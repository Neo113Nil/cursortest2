package wd;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.EnumC9812C;
import td.InterfaceC9831W;
import td.InterfaceC9832X;
import td.InterfaceC9836b;
import td.InterfaceC9847m;
import td.p0;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public final class S extends P implements InterfaceC9832X {

    /* renamed from: m, reason: collision with root package name */
    private je.N f104253m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC9832X f104254n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(@NotNull InterfaceC9831W interfaceC9831W, @NotNull InterfaceC10030h interfaceC10030h, @NotNull EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s, boolean z11, boolean z12, boolean z13, @NotNull InterfaceC9836b.a aVar, InterfaceC9832X interfaceC9832X, @NotNull td.d0 d0Var) {
        super(enumC9812C, abstractC9853s, interfaceC9831W, interfaceC10030h, Sd.f.i("<get-" + interfaceC9831W.getName() + ">"), z11, z12, z13, aVar, d0Var);
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
        this.f104254n = interfaceC9832X != null ? interfaceC9832X : this;
    }

    private static /* synthetic */ void N(int i11) {
        String str = (i11 == 6 || i11 == 7 || i11 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 6 || i11 == 7 || i11 == 8) ? 2 : 3];
        switch (i11) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i11 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i11 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i11 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i11 != 6 && i11 != 7 && i11 != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 6 && i11 != 7 && i11 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // wd.P, wd.AbstractC10532s
    @NotNull
    /* renamed from: K0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final InterfaceC9832X n0() {
        InterfaceC9832X interfaceC9832X = this.f104254n;
        if (interfaceC9832X != null) {
            return interfaceC9832X;
        }
        N(8);
        throw null;
    }

    public final void L0(je.N n11) {
        if (n11 == null) {
            n11 = f0().getType();
        }
        this.f104253m = n11;
    }

    @Override // td.InterfaceC9845k
    public final <R, D> R X(InterfaceC9847m<R, D> interfaceC9847m, D d11) {
        return (R) interfaceC9847m.j(this, d11);
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<p0> f() {
        List<p0> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        N(7);
        throw null;
    }

    @Override // td.InterfaceC9835a
    public final je.N getReturnType() {
        return this.f104253m;
    }

    @Override // td.InterfaceC9836b, td.InterfaceC9835a
    @NotNull
    public final Collection<? extends InterfaceC9832X> o() {
        return F0(true);
    }
}
