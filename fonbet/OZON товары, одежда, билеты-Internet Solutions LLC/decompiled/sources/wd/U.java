package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import de.AbstractC6182a;
import de.InterfaceC6188g;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9845k;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
public final class U extends AbstractC10518d {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9845k f104257c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC6182a f104258d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U(@NotNull InterfaceC9845k interfaceC9845k, @NotNull AbstractC6182a abstractC6182a, @NotNull InterfaceC10030h interfaceC10030h) {
        this(interfaceC9845k, abstractC6182a, interfaceC10030h, Sd.h.f26147d);
        if (interfaceC9845k == null) {
            N(0);
            throw null;
        }
        if (interfaceC10030h != null) {
        } else {
            N(2);
            throw null;
        }
    }

    private static /* synthetic */ void N(int i11) {
        String str = (i11 == 7 || i11 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 7 || i11 == 8) ? 2 : 3];
        switch (i11) {
            case 1:
            case 4:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.VALUE;
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i11 == 7) {
            objArr[1] = "getValue";
        } else if (i11 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i11) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 7 && i11 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final InterfaceC9845k d() {
        InterfaceC9845k interfaceC9845k = this.f104257c;
        if (interfaceC9845k != null) {
            return interfaceC9845k;
        }
        N(8);
        throw null;
    }

    @Override // td.InterfaceC9834Z
    @NotNull
    public final InterfaceC6188g getValue() {
        AbstractC6182a abstractC6182a = this.f104258d;
        if (abstractC6182a != null) {
            return abstractC6182a;
        }
        N(7);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(@NotNull InterfaceC9845k interfaceC9845k, @NotNull AbstractC6182a abstractC6182a, @NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.f fVar) {
        super(interfaceC10030h, fVar);
        if (interfaceC9845k == null) {
            N(3);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(5);
            throw null;
        }
        if (fVar != null) {
            this.f104257c = interfaceC9845k;
            this.f104258d = abstractC6182a;
            return;
        }
        N(6);
        throw null;
    }
}
