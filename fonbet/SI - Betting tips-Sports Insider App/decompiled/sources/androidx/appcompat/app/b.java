package androidx.appcompat.app;

import android.os.Message;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f205a;

    public b(j jVar) {
        this.f205a = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        j jVar = this.f205a;
        Message obtain = (view != jVar.f273o || (message3 = jVar.q) == null) ? (view != jVar.f276s || (message2 = jVar.f278u) == null) ? (view != jVar.f280w || (message = jVar.f282y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
        if (obtain != null) {
            obtain.sendToTarget();
        }
        jVar.P.obtainMessage(1, jVar.f261b).sendToTarget();
    }
}
