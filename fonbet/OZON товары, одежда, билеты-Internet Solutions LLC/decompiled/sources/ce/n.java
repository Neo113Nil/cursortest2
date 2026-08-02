package ce;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class n {
    public static final HashSet a(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set<Sd.f> f7 = ((l) it.next()).f();
            if (f7 == null) {
                return null;
            }
            C7714v.p(f7, hashSet);
        }
        return hashSet;
    }
}
