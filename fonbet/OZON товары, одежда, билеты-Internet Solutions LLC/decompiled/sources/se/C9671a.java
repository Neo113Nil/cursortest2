package se;

import ce.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te.h;

/* renamed from: se.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9671a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> a(Collection<? extends T> collection, @NotNull Collection<? extends T> collection2) {
        Intrinsics.checkNotNullParameter(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    @NotNull
    public static final h b(@NotNull ArrayList scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        h hVar = new h();
        Iterator it = scopes.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            l lVar = (l) next;
            if (lVar != null && lVar != l.b.f57046b) {
                hVar.add(next);
            }
        }
        return hVar;
    }
}
