package defpackage;

import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.zzau;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class t8p extends Cast.Listener {
    public final /* synthetic */ CastSession a;

    public /* synthetic */ t8p(CastSession castSession) {
        this.a = castSession;
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void a(int i) {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).a(i);
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void b(int i) {
        CastSession castSession = this.a;
        castSession.n(i);
        zzau zzauVar = castSession.a;
        if (zzauVar != null) {
            try {
                zzauVar.E(i);
            } catch (RemoteException unused) {
                Session.b.b("Unable to call %s on %s.", "notifySessionEnded", "zzau");
            }
        }
        Iterator it = new HashSet(castSession.d).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).b(i);
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void c(ApplicationMetadata applicationMetadata) {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).c(applicationMetadata);
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void d() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).d();
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void f(int i) {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).f(i);
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void g() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).g();
        }
    }
}
