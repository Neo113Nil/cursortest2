package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class u0 {
    public static hf.r a(hf.r builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        hf.i iVar = builder.f10634a;
        iVar.c();
        return iVar.f10620i > 0 ? builder : hf.r.f10633c;
    }

    public static Set b(Object obj) {
        Set singleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
        return singleton;
    }
}
