package je;

import java.util.Iterator;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10025c;

/* loaded from: classes.dex */
public abstract class Y extends K0 implements ne.h, ne.i {
    public Y() {
        super(0);
    }

    @Override // je.K0
    @NotNull
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public abstract Y L0(boolean z11);

    @Override // je.K0
    @NotNull
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public abstract Y N0(@NotNull o0 o0Var);

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<InterfaceC10025c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] value = {"[", Ud.n.f27604c.F(it.next(), null), "] "};
            Intrinsics.checkNotNullParameter(sb2, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            for (int i11 = 0; i11 < 3; i11++) {
                sb2.append(value[i11]);
            }
        }
        sb2.append(H0());
        if (!F0().isEmpty()) {
            C7714v.U(F0(), sb2, ", ", "<", ">", null, 112);
        }
        if (I0()) {
            sb2.append("?");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
