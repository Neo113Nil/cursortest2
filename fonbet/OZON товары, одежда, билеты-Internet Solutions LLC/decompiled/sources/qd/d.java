package qd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f81829a = new d();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f81830b;

    static {
        Set<p> set = p.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(C7714v.z(set, 10));
        for (p primitiveType : set) {
            Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
            Sd.c c11 = s.f81865l.c(primitiveType.g());
            Intrinsics.checkNotNullExpressionValue(c11, "child(...)");
            arrayList.add(c11);
        }
        ArrayList q02 = C7714v.q0(s.a.f81910j.l(), C7714v.q0(s.a.f81908h.l(), C7714v.q0(s.a.f81906f.l(), arrayList)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = q02.iterator();
        while (it.hasNext()) {
            Sd.c topLevelFqName = (Sd.c) it.next();
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            Sd.c e11 = topLevelFqName.e();
            linkedHashSet.add(new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)")));
        }
        f81830b = linkedHashSet;
    }

    @NotNull
    public static LinkedHashSet a() {
        return f81830b;
    }

    @NotNull
    public static LinkedHashSet b() {
        return f81830b;
    }
}
