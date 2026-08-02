package j1;

import android.os.Build;
import androidx.appcompat.app.v0;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends k2.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.b f18197a;

    public e(com.android.billingclient.api.b bVar) {
        this.f18197a = bVar;
    }

    @Override // k2.x
    public final void y(Throwable th2) {
        ((j) this.f18197a.f3969a).d(th2);
    }

    @Override // k2.x
    public final void z(com.google.firebase.messaging.x xVar) {
        com.android.billingclient.api.b bVar = this.f18197a;
        bVar.f3971c = xVar;
        com.google.firebase.messaging.x xVar2 = (com.google.firebase.messaging.x) bVar.f3971c;
        j jVar = (j) bVar.f3969a;
        bVar.f3970b = new v0(xVar2, jVar.f18208g, jVar.f18210i, Build.VERSION.SDK_INT >= 34 ? m.a() : m4.g.k());
        j jVar2 = (j) bVar.f3969a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f18202a.writeLock().lock();
        try {
            jVar2.f18204c = 1;
            arrayList.addAll(jVar2.f18203b);
            jVar2.f18203b.clear();
            jVar2.f18202a.writeLock().unlock();
            jVar2.f18205d.post(new androidx.viewpager2.widget.o(arrayList, jVar2.f18204c, (Throwable) null));
        } catch (Throwable th2) {
            jVar2.f18202a.writeLock().unlock();
            throw th2;
        }
    }
}
