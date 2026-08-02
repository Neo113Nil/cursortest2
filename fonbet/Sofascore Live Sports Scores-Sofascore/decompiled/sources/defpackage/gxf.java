package defpackage;

import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gxf extends RemoteMediaClient.Callback implements SessionManagerListener, RemoteMediaClient.ProgressListener {
    public final /* synthetic */ hxf a;

    public gxf(hxf hxfVar) {
        this.a = hxfVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void a(Session session, int i) {
        this.a.P(null);
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public final void b(long j, long j2) {
        this.a.B = j;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void c(Session session, String str) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void d(Session session, int i) {
        this.a.P(null);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void e(Session session, int i) {
        StringBuilder t = lnb.t(i, "Session start failed. Error code ", ": ");
        t.append(s02.K(i));
        tgj.z(t.toString());
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void f(Session session) {
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void j() {
        hxf hxfVar = this.a;
        hxfVar.b0();
        hxfVar.m.b();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void k(Session session, String str) {
        this.a.P((CastSession) session);
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void l() {
        this.a.X();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void m(Session session, boolean z) {
        this.a.P((CastSession) session);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void n(Session session, int i) {
        StringBuilder t = lnb.t(i, "Session resume failed. Error code ", ": ");
        t.append(s02.K(i));
        tgj.z(t.toString());
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void o(Session session) {
        this.a.P(null);
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void g() {
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void h() {
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void i() {
    }
}
