package gf;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class k {
    public static i a(l mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i5 = j.$EnumSwitchMapping$0[mode.ordinal()];
        if (i5 == 1) {
            return new t(initializer, null, 2, null);
        }
        if (i5 == 2) {
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            s sVar = new s();
            sVar.f10034a = initializer;
            sVar.f10035b = f0.f10021a;
            return sVar;
        }
        if (i5 != 3) {
            throw new m();
        }
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        k0 k0Var = new k0();
        k0Var.f10025a = initializer;
        k0Var.f10026b = f0.f10021a;
        return k0Var;
    }

    public static t b(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new t(initializer, null, 2, null);
    }
}
