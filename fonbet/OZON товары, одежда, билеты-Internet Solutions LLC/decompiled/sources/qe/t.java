package qe;

import java.util.Collection;
import java.util.Iterator;
import je.K0;
import je.N;
import je.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.InterfaceC9857w;

/* loaded from: classes10.dex */
final class t implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final t f81974a = new t();

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (qd.m.c0(r6) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
    
        if (r10.d0() == null) goto L59;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Y q11;
        K0 r11;
        N returnType;
        InterfaceC9857w Checks = (InterfaceC9857w) obj;
        v vVar = v.f81976a;
        Intrinsics.checkNotNullParameter(Checks, "$this$Checks");
        InterfaceC9845k d11 = Checks.d();
        Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
        if (!((d11 instanceof InterfaceC9839e) && qd.m.Q((InterfaceC9839e) d11))) {
            Collection<? extends InterfaceC9836b> o11 = Checks.o();
            Intrinsics.checkNotNullExpressionValue(o11, "getOverriddenDescriptors(...)");
            Collection<? extends InterfaceC9836b> collection = o11;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    InterfaceC9845k d12 = ((InterfaceC9857w) it.next()).d();
                    Intrinsics.checkNotNullExpressionValue(d12, "getContainingDeclaration(...)");
                    if ((d12 instanceof InterfaceC9839e) && qd.m.Q((InterfaceC9839e) d12)) {
                        break;
                    }
                }
            }
            Intrinsics.checkNotNullParameter(Checks, "<this>");
            InterfaceC9845k d13 = Checks.d();
            InterfaceC9839e interfaceC9839e = d13 instanceof InterfaceC9839e ? (InterfaceC9839e) d13 : null;
            if (interfaceC9839e != null) {
                if (!Vd.k.f(interfaceC9839e)) {
                    interfaceC9839e = null;
                }
                if (interfaceC9839e != null && (q11 = interfaceC9839e.q()) != null && (r11 = C8701c.r(q11)) != null && (returnType = Checks.getReturnType()) != null && Intrinsics.d(Checks.getName(), w.f81983d)) {
                    Intrinsics.checkNotNullParameter(returnType, "<this>");
                    if (!qd.m.U(returnType)) {
                        Intrinsics.checkNotNullParameter(returnType, "<this>");
                    }
                    if (Checks.f().size() == 1) {
                        N type = Checks.f().get(0).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        if (Intrinsics.d(C8701c.r(type), r11)) {
                            if (Checks.y0().isEmpty()) {
                            }
                        }
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder("must override ''equals()'' in Any");
            InterfaceC9845k d14 = Checks.d();
            Intrinsics.checkNotNullExpressionValue(d14, "getContainingDeclaration(...)");
            if (Vd.k.f(d14)) {
                Ud.u uVar = Ud.n.f27603b;
                InterfaceC9845k d15 = Checks.d();
                Intrinsics.g(d15, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Y q12 = ((InterfaceC9839e) d15).q();
                Intrinsics.checkNotNullExpressionValue(q12, "getDefaultType(...)");
                Fj.c.f(" or define ''equals(other: ", uVar.h0(C8701c.r(q12)), "): Boolean''", sb2);
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }
        return null;
    }
}
