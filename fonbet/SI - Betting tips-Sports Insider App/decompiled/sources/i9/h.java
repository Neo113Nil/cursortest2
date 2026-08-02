package i9;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements e6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f11023a = new AtomicReference();

    @Override // e6.b
    public final void a(boolean z5) {
        Random random = i.j;
        synchronized (i.class) {
            Iterator it = i.f11024k.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(z5);
            }
        }
    }
}
