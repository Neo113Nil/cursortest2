package td;

import ce.AbstractC5814a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: td.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9851q {
    public static final InterfaceC9842h a(@NotNull InterfaceC9845k interfaceC9845k) {
        Intrinsics.checkNotNullParameter(interfaceC9845k, "<this>");
        InterfaceC9845k d11 = interfaceC9845k.d();
        if (d11 == null || (interfaceC9845k instanceof InterfaceC9820K)) {
            return null;
        }
        Intrinsics.checkNotNullParameter(d11, "<this>");
        if (!(d11.d() instanceof InterfaceC9820K)) {
            return a(d11);
        }
        if (d11 instanceof InterfaceC9842h) {
            return (InterfaceC9842h) d11;
        }
        return null;
    }

    public static final InterfaceC9839e b(@NotNull InterfaceC9815F interfaceC9815F, @NotNull Sd.c fqName, @NotNull Bd.c lookupLocation) {
        InterfaceC9842h interfaceC9842h;
        ce.l H11;
        Intrinsics.checkNotNullParameter(interfaceC9815F, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(lookupLocation, "lookupLocation");
        if (!fqName.d()) {
            Sd.c e11 = fqName.e();
            Intrinsics.checkNotNullExpressionValue(e11, "parent(...)");
            ce.l p11 = interfaceC9815F.v(e11).p();
            Sd.f g10 = fqName.g();
            Intrinsics.checkNotNullExpressionValue(g10, "shortName(...)");
            InterfaceC9842h d11 = ((AbstractC5814a) p11).d(g10, lookupLocation);
            InterfaceC9839e interfaceC9839e = d11 instanceof InterfaceC9839e ? (InterfaceC9839e) d11 : null;
            if (interfaceC9839e != null) {
                return interfaceC9839e;
            }
            Sd.c e12 = fqName.e();
            Intrinsics.checkNotNullExpressionValue(e12, "parent(...)");
            InterfaceC9839e b11 = b(interfaceC9815F, e12, lookupLocation);
            if (b11 == null || (H11 = b11.H()) == null) {
                interfaceC9842h = null;
            } else {
                Sd.f g11 = fqName.g();
                Intrinsics.checkNotNullExpressionValue(g11, "shortName(...)");
                interfaceC9842h = H11.d(g11, lookupLocation);
            }
            if (interfaceC9842h instanceof InterfaceC9839e) {
                return (InterfaceC9839e) interfaceC9842h;
            }
        }
        return null;
    }
}
