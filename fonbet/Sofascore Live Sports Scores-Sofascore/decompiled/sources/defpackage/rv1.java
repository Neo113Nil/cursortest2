package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rv1 {
    public static sv1 a(rv1 rv1Var, String str) {
        bga bgaVar = pv1.n;
        rv1Var.getClass();
        str.getClass();
        bgaVar.getClass();
        return (sv1) bgaVar.b(rv1Var.serializer(), str);
    }

    @NotNull
    public final KSerializer serializer() {
        return qv1.a;
    }
}
