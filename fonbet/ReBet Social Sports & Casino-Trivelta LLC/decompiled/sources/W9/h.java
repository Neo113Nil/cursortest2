package W9;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final X9.d f13192a;

    public h(X9.d dVar) {
        this.f13192a = dVar;
    }

    public void a(boolean z10) {
        try {
            this.f13192a.m(z10);
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }
}
