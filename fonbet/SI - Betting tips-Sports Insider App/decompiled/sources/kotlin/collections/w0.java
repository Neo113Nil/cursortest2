package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class w0 extends v0 {
    public static LinkedHashSet c(Set set, y1.l lVar) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(lVar);
        return linkedHashSet;
    }
}
