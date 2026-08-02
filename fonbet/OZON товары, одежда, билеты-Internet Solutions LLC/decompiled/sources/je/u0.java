package je;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class u0 extends B0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f69930b = new a();

    public static final class a {
        public static t0 b(a aVar, Map map) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(map, "map");
            return new t0(map);
        }

        @NotNull
        public final B0 a(@NotNull s0 typeConstructor, @NotNull List<? extends y0> argumentsList) {
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            Intrinsics.checkNotNullParameter(argumentsList, "arguments");
            List<td.i0> parameters = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            td.i0 i0Var = (td.i0) C7714v.Z(parameters);
            if (i0Var == null || !i0Var.D()) {
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(argumentsList, "argumentsList");
                return new C7364I((td.i0[]) parameters.toArray(new td.i0[0]), (y0[]) argumentsList.toArray(new y0[0]), false);
            }
            List<td.i0> parameters2 = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
            List<td.i0> list = parameters2;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((td.i0) it.next()).k());
            }
            return b(this, kotlin.collections.U.s(C7714v.b1(arrayList, argumentsList)));
        }
    }

    @Override // je.B0
    public final y0 e(@NotNull N key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return h(key.H0());
    }

    public abstract y0 h(@NotNull s0 s0Var);
}
