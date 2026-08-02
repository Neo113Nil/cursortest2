package defpackage;

import android.os.RemoteException;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.zzak;
import com.google.android.gms.cast.zzp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.cast.zzcr;
import com.google.android.gms.internal.cast.zzcs;
import com.google.android.gms.internal.cast.zzy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class adp extends zzp {
    public final /* synthetic */ CastSession a;

    public /* synthetic */ adp(CastSession castSession) {
        this.a = castSession;
    }

    @Override // com.google.android.gms.cast.zzp
    public final void a() {
        CastSession castSession = this.a;
        if (castSession.e == null) {
            return;
        }
        try {
            RemoteMediaClient remoteMediaClient = castSession.j;
            if (remoteMediaClient != null) {
                remoteMediaClient.z();
            }
            castSession.e.v();
        } catch (RemoteException unused) {
            CastSession.n.b("Unable to call %s on %s.", "onConnected", "zzak");
        }
        n1p n1pVar = castSession.m;
        if (n1pVar != null) {
            ((zzy) n1pVar.b).a(new zzcs(new zzcr(3)));
        }
    }

    @Override // com.google.android.gms.cast.zzp
    public final void b(int i) {
        zzak zzakVar = this.a.e;
        if (zzakVar == null) {
            return;
        }
        try {
            zzakVar.B0(new ConnectionResult(i, null, null));
        } catch (RemoteException unused) {
            CastSession.n.b("Unable to call %s on %s.", "onConnectionFailed", "zzak");
        }
    }

    @Override // com.google.android.gms.cast.zzp
    public final void c(int i) {
        zzak zzakVar = this.a.e;
        if (zzakVar == null) {
            return;
        }
        try {
            zzakVar.zzf(i);
        } catch (RemoteException unused) {
            CastSession.n.b("Unable to call %s on %s.", "onConnectionSuspended", "zzak");
        }
    }

    @Override // com.google.android.gms.cast.zzp
    public final void d(int i) {
        zzak zzakVar = this.a.e;
        if (zzakVar == null) {
            return;
        }
        try {
            zzakVar.B0(new ConnectionResult(i, null, null));
        } catch (RemoteException unused) {
            CastSession.n.b("Unable to call %s on %s.", "onDisconnected", "zzak");
        }
    }
}
