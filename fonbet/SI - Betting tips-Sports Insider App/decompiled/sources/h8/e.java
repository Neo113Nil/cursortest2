package h8;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements e6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f10397a = new AtomicReference();

    @Override // e6.b
    public final void a(boolean z5) {
        synchronized (g.j) {
            try {
                Iterator it = new ArrayList(g.f10400k.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f10405e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = gVar.f10409i.iterator();
                        while (it2.hasNext()) {
                            g gVar2 = ((d) it2.next()).f10396a;
                            if (!z5) {
                                ((y8.c) gVar2.f10408h.get()).c();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
