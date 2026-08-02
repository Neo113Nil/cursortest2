package ge0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.s;
import we0.u;

/* renamed from: ge0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6724b {
    @NotNull
    public static C6723a a(@NotNull Collection oldCollection, @NotNull HashSet newCollecation) {
        Intrinsics.checkNotNullParameter(oldCollection, "oldCollection");
        Intrinsics.checkNotNullParameter(newCollecation, "newCollecation");
        Pair pair = new Pair(new ArrayList(), new ArrayList());
        for (Object obj : oldCollection) {
            if (!newCollecation.contains(obj)) {
                Object e11 = pair.e();
                List list = (List) e11;
                if (obj instanceof s) {
                    list.add(((s) obj).d());
                } else if (obj instanceof u) {
                    list.add(((u) obj).e());
                }
                pair = new Pair(e11, pair.f());
            }
        }
        for (Object obj2 : newCollecation) {
            if (!oldCollection.contains(obj2)) {
                Object e12 = pair.e();
                Object f7 = pair.f();
                ((List) f7).add(obj2);
                pair = new Pair(e12, f7);
            }
        }
        return new C6723a((List) pair.e(), (List) pair.f());
    }

    @NotNull
    public static C6723a b(@NotNull HashSet originalCollection, @NotNull c visibleAreaRange) {
        Intrinsics.checkNotNullParameter(originalCollection, "originalCollection");
        Intrinsics.checkNotNullParameter(visibleAreaRange, "visibleAreaRange");
        ArrayList arrayList = new ArrayList(originalCollection.size());
        ArrayList arrayList2 = new ArrayList(originalCollection.size());
        for (Object obj : originalCollection) {
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (visibleAreaRange.a(uVar.getPosition())) {
                    arrayList2.add(obj);
                } else {
                    arrayList.add(uVar.e());
                }
            } else if (obj instanceof s) {
                s sVar = (s) obj;
                if (visibleAreaRange.a(sVar.b())) {
                    arrayList2.add(obj);
                } else {
                    arrayList.add(sVar.d());
                }
            }
        }
        return new C6723a(arrayList, arrayList2);
    }
}
