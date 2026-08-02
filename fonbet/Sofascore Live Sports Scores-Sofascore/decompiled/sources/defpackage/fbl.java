package defpackage;

import android.os.Binder;
import android.os.Process;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fbl extends Binder {
    public final j0l a;

    public fbl(j0l j0lVar) {
        this.a = j0lVar;
    }

    public final void a(gbl gblVar) {
        Task b;
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        b = ((mo5) this.a.b).b(gblVar.a);
        b.addOnCompleteListener(new hg0(1), new bnk(gblVar, 5));
    }
}
