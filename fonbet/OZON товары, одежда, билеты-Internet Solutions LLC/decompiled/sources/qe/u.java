package qe;

import de.C6186e;
import de.InterfaceC6188g;
import je.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import td.C9856v;
import td.InterfaceC9834Z;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9857w;
import td.h0;

/* loaded from: classes10.dex */
final class u implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final u f81975a = new u();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (r7 == false) goto L32;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z11;
        Sd.b f7;
        N returnType;
        boolean n11;
        InterfaceC9857w Checks = (InterfaceC9857w) obj;
        v vVar = v.f81976a;
        Intrinsics.checkNotNullParameter(Checks, "$this$Checks");
        InterfaceC9834Z c02 = Checks.c0();
        if (c02 == null) {
            c02 = Checks.d0();
        }
        boolean z12 = false;
        if (c02 != null) {
            N returnType2 = Checks.getReturnType();
            if (returnType2 != null) {
                N type = c02.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                z11 = C8701c.n(returnType2, type);
            } else {
                z11 = false;
            }
            if (!z11) {
                v.f81976a.getClass();
                InterfaceC6188g value = c02.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                if (value instanceof C6186e) {
                    InterfaceC9839e i11 = ((C6186e) value).i();
                    if (i11.p0() && (f7 = Zd.e.f(i11)) != null) {
                        InterfaceC9842h b11 = C9856v.b(Zd.e.j(i11), f7);
                        h0 h0Var = b11 instanceof h0 ? (h0) b11 : null;
                        if (h0Var != null && (returnType = Checks.getReturnType()) != null) {
                            n11 = C8701c.n(returnType, h0Var.Z());
                        }
                    }
                }
                n11 = false;
            }
            z12 = true;
        }
        if (z12) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }
}
