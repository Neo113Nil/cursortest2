package k5;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import e5.i;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f18818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f18819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f18821d;

    public /* synthetic */ d(h hVar, i iVar, int i5, Runnable runnable) {
        this.f18818a = hVar;
        this.f18819b = iVar;
        this.f18820c = i5;
        this.f18821d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final i iVar = this.f18819b;
        final int i5 = this.f18820c;
        Runnable runnable = this.f18821d;
        final h hVar = this.f18818a;
        m5.c cVar = hVar.f18838f;
        try {
            try {
                l5.d dVar = hVar.f18835c;
                Objects.requireNonNull(dVar);
                ((l5.i) cVar).w(new io.sentry.android.core.internal.gestures.c(10, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) hVar.f18833a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((l5.i) cVar).w(new m5.b() { // from class: k5.e
                        @Override // m5.b
                        public final Object i() {
                            h.this.f18836d.X(iVar, i5 + 1, false);
                            return null;
                        }
                    });
                } else {
                    hVar.a(iVar, i5);
                }
                runnable.run();
            } catch (m5.a unused) {
                hVar.f18836d.X(iVar, i5 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }
}
