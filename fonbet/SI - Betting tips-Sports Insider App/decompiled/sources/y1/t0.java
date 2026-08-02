package y1;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public p f25634a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25635b;

    public abstract b0 a();

    public final p b() {
        p pVar = this.f25634a;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public b0 c(b0 destination, Bundle bundle, i0 i0Var) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    public void d(List entries, i0 i0Var) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        bg.f fVar = new bg.f(bg.q.c(bg.q.f(CollectionsKt.z(entries), new fg.d(19, this, i0Var))));
        while (fVar.hasNext()) {
            b().g((l) fVar.next());
        }
    }

    public void e(p state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f25634a = state;
        this.f25635b = true;
    }

    public void f(l backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        b0 b0Var = backStackEntry.f25583b;
        if (b0Var == null) {
            b0Var = null;
        }
        if (b0Var == null) {
            return;
        }
        c(b0Var, null, ci.c.M(new ub.b(16)));
        b().d(backStackEntry);
    }

    public void g(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
    }

    public Bundle h() {
        return null;
    }

    public void i(l popUpTo, boolean z5) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List list = (List) b().f25604e.f10742a.getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        l lVar = null;
        while (j()) {
            lVar = (l) listIterator.previous();
            if (Intrinsics.areEqual(lVar, popUpTo)) {
                break;
            }
        }
        if (lVar != null) {
            b().e(lVar, z5);
        }
    }

    public boolean j() {
        return true;
    }
}
