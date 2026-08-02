package androidx.core.view;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1382a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1383b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1384c = new HashMap();

    public q(Runnable runnable) {
        this.f1382a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f1383b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.a1) ((r) it.next())).f1865a.p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(r rVar) {
        this.f1383b.remove(rVar);
        p pVar = (p) this.f1384c.remove(rVar);
        if (pVar != null) {
            pVar.f1373a.b(pVar.f1374b);
            pVar.f1374b = null;
        }
        this.f1382a.run();
    }
}
