package v4;

import android.os.SystemClock;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements f {
    @Override // v4.f
    public final boolean a(r4.i iVar) {
        r4.c cVar = iVar.f22307a;
        if ((cVar instanceof r4.a ? ((r4.a) cVar).f22291a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        r4.c cVar2 = iVar.f22308b;
        return (cVar2 instanceof r4.a ? ((r4.a) cVar2).f22291a : Integer.MAX_VALUE) > 100;
    }

    @Override // v4.f
    public final boolean b() {
        boolean z5;
        synchronized (e.f24415a) {
            try {
                int i5 = e.f24417c;
                e.f24417c = i5 + 1;
                if (i5 >= 30 || SystemClock.uptimeMillis() > e.f24418d + 30000) {
                    e.f24417c = 0;
                    e.f24418d = SystemClock.uptimeMillis();
                    String[] list = e.f24416b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    e.f24419e = list.length < 800;
                }
                z5 = e.f24419e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z5;
    }
}
