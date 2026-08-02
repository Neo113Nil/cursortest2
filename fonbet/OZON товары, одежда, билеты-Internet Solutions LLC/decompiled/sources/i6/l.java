package i6;

import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.X;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
final class l implements k, I {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final HashSet f65883a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final AbstractC5434v f65884b;

    l(AbstractC5434v abstractC5434v) {
        this.f65884b = abstractC5434v;
        abstractC5434v.a(this);
    }

    @Override // i6.k
    public final void a(@NonNull m mVar) {
        this.f65883a.remove(mVar);
    }

    @Override // i6.k
    public final void b(@NonNull m mVar) {
        this.f65883a.add(mVar);
        AbstractC5434v abstractC5434v = this.f65884b;
        if (abstractC5434v.b() == AbstractC5434v.b.DESTROYED) {
            mVar.onDestroy();
        } else if (abstractC5434v.b().a(AbstractC5434v.b.STARTED)) {
            mVar.onStart();
        } else {
            mVar.onStop();
        }
    }

    @X(AbstractC5434v.a.ON_DESTROY)
    public void onDestroy(@NonNull J j11) {
        Iterator it = p6.l.e(this.f65883a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onDestroy();
        }
        j11.getLifecycle().e(this);
    }

    @X(AbstractC5434v.a.ON_START)
    public void onStart(@NonNull J j11) {
        Iterator it = p6.l.e(this.f65883a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStart();
        }
    }

    @X(AbstractC5434v.a.ON_STOP)
    public void onStop(@NonNull J j11) {
        Iterator it = p6.l.e(this.f65883a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStop();
        }
    }
}
