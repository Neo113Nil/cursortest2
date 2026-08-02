package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class t {
    public static hf.e a(hf.e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.g();
        builder.f10605c = true;
        return builder.f10604b > 0 ? builder : hf.e.f10602e;
    }

    public static hf.e b() {
        return new hf.e(0, 1, null);
    }

    public static List c(Object obj) {
        List singletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
        return singletonList;
    }
}
