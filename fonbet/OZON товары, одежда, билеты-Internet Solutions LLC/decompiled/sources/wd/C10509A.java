package wd;

import de.C6186e;
import de.InterfaceC6188g;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import ud.InterfaceC10030h;

/* renamed from: wd.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10509A extends AbstractC10518d {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9839e f104170c;

    /* renamed from: d, reason: collision with root package name */
    private final C6186e f104171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10509A(@NotNull InterfaceC9839e interfaceC9839e) {
        super(InterfaceC10030h.a.b(), Sd.h.f26147d);
        if (interfaceC9839e == null) {
            N(0);
            throw null;
        }
        this.f104170c = interfaceC9839e;
        this.f104171d = new C6186e(interfaceC9839e);
    }

    private static /* synthetic */ void N(int i11) {
        String str = (i11 == 1 || i11 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2) ? 2 : 3];
        if (i11 == 1 || i11 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i11 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i11 == 1) {
            objArr[1] = "getValue";
        } else if (i11 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final InterfaceC9845k d() {
        InterfaceC9839e interfaceC9839e = this.f104170c;
        if (interfaceC9839e != null) {
            return interfaceC9839e;
        }
        N(2);
        throw null;
    }

    @Override // td.InterfaceC9834Z
    @NotNull
    public final InterfaceC6188g getValue() {
        C6186e c6186e = this.f104171d;
        if (c6186e != null) {
            return c6186e;
        }
        N(1);
        throw null;
    }

    @Override // wd.r
    public final String toString() {
        return "class " + this.f104170c.getName() + "::this";
    }
}
