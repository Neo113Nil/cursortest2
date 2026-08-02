package ke;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.F0;
import je.K0;
import je.L0;
import je.N;
import je.Q;
import je.Y;
import je.o0;
import je.u0;
import je.y0;
import ke.f;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ne.EnumC8580b;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.i0;

/* loaded from: classes10.dex */
public final class p {
    /* JADX WARN: Removed duplicated region for block: B:5:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0190 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Y a(@NotNull Y type, @NotNull EnumC8580b captureStatus) {
        ArrayList arrayList;
        EnumC8580b enumC8580b;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(captureStatus, "status");
        if (type.F0().size() == type.H0().getParameters().size()) {
            List<y0> F02 = type.F0();
            List<y0> list = F02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((y0) it.next()).b() != L0.INVARIANT) {
                        List<i0> parameters = type.H0().getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                        ArrayList b12 = C7714v.b1(list, parameters);
                        arrayList = new ArrayList(C7714v.z(b12, 10));
                        Iterator it2 = b12.iterator();
                        while (it2.hasNext()) {
                            Pair pair = (Pair) it2.next();
                            y0 projection = (y0) pair.a();
                            i0 typeParameter = (i0) pair.b();
                            if (projection.b() == L0.INVARIANT) {
                                enumC8580b = captureStatus;
                            } else {
                                K0 K02 = (projection.a() || projection.b() != L0.IN_VARIANCE) ? null : projection.getType().K0();
                                Intrinsics.f(typeParameter);
                                Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
                                Intrinsics.checkNotNullParameter(projection, "projection");
                                Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
                                enumC8580b = captureStatus;
                                projection = C8701c.a(new j(enumC8580b, new o(projection, (Function0) null, typeParameter, 6), K02, (o0) null, false, 56));
                            }
                            arrayList.add(projection);
                            captureStatus = enumC8580b;
                        }
                        F0 c11 = u0.f69930b.a(type.H0(), arrayList).c();
                        int size = F02.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            y0 y0Var = F02.get(i11);
                            y0 y0Var2 = (y0) arrayList.get(i11);
                            if (y0Var.b() != L0.INVARIANT) {
                                List<N> upperBounds = type.H0().getParameters().get(i11).getUpperBounds();
                                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<T> it3 = upperBounds.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(f.a.f71487a.c(c11.j((N) it3.next(), L0.INVARIANT).K0()));
                                }
                                if (!y0Var.a() && y0Var.b() == L0.OUT_VARIANCE) {
                                    arrayList2.add(f.a.f71487a.c(y0Var.getType().K0()));
                                }
                                N type2 = y0Var2.getType();
                                Intrinsics.g(type2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                ((j) type2).R0().d(arrayList2);
                            }
                        }
                        if (arrayList == null) {
                            return Q.f(arrayList, type.G0(), type.H0(), null, type.I0());
                        }
                        return null;
                    }
                }
            }
        }
        arrayList = null;
        if (arrayList == null) {
        }
    }
}
