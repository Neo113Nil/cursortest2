package je;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import je.u0;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;
import td.InterfaceC9845k;

/* renamed from: je.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7404y {
    private static /* synthetic */ void a(int i11) {
        String str = i11 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 4 ? 3 : 2];
        switch (i11) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i11 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i11 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i11 == 4) {
            throw new IllegalStateException(format);
        }
    }

    @NotNull
    public static F0 b(@NotNull List list, @NotNull B0 b02, @NotNull InterfaceC9845k interfaceC9845k, @NotNull ArrayList arrayList) {
        if (b02 == null) {
            a(1);
            throw null;
        }
        if (interfaceC9845k == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        F0 c11 = c(list, b02, interfaceC9845k, arrayList, null);
        if (c11 != null) {
            return c11;
        }
        throw new AssertionError("Substitution failed");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static F0 c(@NotNull List list, @NotNull B0 b02, @NotNull InterfaceC9845k interfaceC9845k, @NotNull ArrayList arrayList, boolean[] zArr) {
        F0 f02;
        N l11;
        if (b02 == null) {
            a(6);
            throw null;
        }
        if (interfaceC9845k == null) {
            a(7);
            throw null;
        }
        if (arrayList == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            td.i0 i0Var = (td.i0) it.next();
            wd.a0 I02 = wd.a0.I0(interfaceC9845k, i0Var.getAnnotations(), i0Var.w(), i0Var.x(), i0Var.getName(), i11, i0Var.getStorageManager());
            map.put(i0Var.k(), new A0(I02.q()));
            hashMap.put(i0Var, I02);
            arrayList.add(I02);
            i11++;
        }
        u0.a aVar = u0.f69930b;
        Intrinsics.checkNotNullParameter(map, "map");
        t0 b11 = u0.a.b(aVar, map);
        F0 g10 = F0.g(b02, b11);
        F0 g11 = F0.g(new C0(b02), b11);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            td.i0 i0Var2 = (td.i0) it2.next();
            wd.a0 a0Var = (wd.a0) hashMap.get(i0Var2);
            for (N n11 : i0Var2.getUpperBounds()) {
                InterfaceC9842h p11 = n11.H0().p();
                if (p11 instanceof td.i0) {
                    td.i0 typeParameter = (td.i0) p11;
                    Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
                    if (C8701c.k(typeParameter, null, 6)) {
                        f02 = g10;
                        l11 = f02.l(n11, L0.OUT_VARIANCE);
                        if (l11 != null) {
                            return null;
                        }
                        if (l11 != n11 && zArr != null) {
                            zArr[0] = true;
                        }
                        a0Var.H0(l11);
                    }
                }
                f02 = g11;
                l11 = f02.l(n11, L0.OUT_VARIANCE);
                if (l11 != null) {
                }
            }
            a0Var.M0();
        }
        return g10;
    }
}
