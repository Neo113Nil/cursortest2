package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import com.blaze.blazesdk.players.a;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uwl implements SessionManagerListener {
    public final /* synthetic */ a a;

    public uwl(a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void a(Session session, int i) {
        ((CastSession) session).getClass();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void c(Session session, String str) {
        ((CastSession) session).getClass();
        str.getClass();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void d(Session session, int i) {
        ((CastSession) session).getClass();
        a aVar = this.a;
        fdi fdiVar = aVar.k;
        Boolean bool = Boolean.FALSE;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        if (!aVar.d) {
            s2m s2mVar = aVar.e;
            if (s2mVar != null) {
                s2mVar.invoke(wyl.a, null);
            }
            aVar.r();
            aVar.h = null;
            aVar.p();
            return;
        }
        long currentPosition = aVar.b.getCurrentPosition() > 0 ? aVar.b.getCurrentPosition() : aVar.j;
        aVar.d = false;
        aVar.j = 0L;
        ExoPlayer d = aVar.a.d();
        ale aleVar = aVar.b;
        if (aleVar != d) {
            aVar.l(aleVar);
            tl2 tl2Var = aVar.f;
            if (tl2Var != null) {
                tl2Var.stop();
            }
            tl2 tl2Var2 = aVar.f;
            if (tl2Var2 != null) {
                tl2Var2.d();
            }
            aVar.b = d;
            aVar.q();
        }
        s2m s2mVar2 = aVar.e;
        if (s2mVar2 != null) {
            s2mVar2.invoke(wyl.a, Long.valueOf(currentPosition));
        }
        aVar.r();
        aVar.h = null;
        aVar.p();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void e(Session session, int i) {
        ((CastSession) session).getClass();
        a aVar = this.a;
        fdi fdiVar = aVar.k;
        Boolean bool = Boolean.FALSE;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        s2m s2mVar = aVar.e;
        if (s2mVar != null) {
            s2mVar.invoke(wyl.a, null);
        }
        aVar.r();
        aVar.h = null;
        aVar.p();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void f(Session session) {
        CastSession castSession = (CastSession) session;
        castSession.getClass();
        a aVar = this.a;
        aVar.a.pause();
        s2m s2mVar = aVar.e;
        if (s2mVar != null) {
            CastDevice j = castSession.j();
            s2mVar.invoke(new yul(j != null ? j.d : null), null);
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void k(Session session, String str) {
        CastSession castSession = (CastSession) session;
        castSession.getClass();
        str.getClass();
        a aVar = this.a;
        fdi fdiVar = aVar.k;
        Boolean bool = Boolean.TRUE;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        CastContext castContext = aVar.g;
        if (castContext != null) {
            tl2 tl2Var = aVar.f;
            if (tl2Var != null) {
                tl2Var.stop();
            }
            tl2 tl2Var2 = aVar.f;
            if (tl2Var2 != null) {
                tl2Var2.d();
            }
            aVar.f = new tl2(castContext);
        }
        tl2 tl2Var3 = aVar.f;
        if (tl2Var3 != null && aVar.b != tl2Var3) {
            tl2Var3.stop();
            tl2Var3.d();
            aVar.j = aVar.b.getCurrentPosition();
            aVar.l(aVar.b);
            aVar.a.i();
            aVar.b = tl2Var3;
            aVar.q();
        }
        n4m n4mVar = aVar.c;
        if (n4mVar != null) {
            aVar.m(n4mVar, aVar.j);
        }
        s2m s2mVar = aVar.e;
        if (s2mVar != null) {
            CastDevice j = castSession.j();
            s2mVar.invoke(new pql(j != null ? j.d : null), null);
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void m(Session session, boolean z) {
        ((CastSession) session).getClass();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void n(Session session, int i) {
        ((CastSession) session).getClass();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void o(Session session) {
        ((CastSession) session).getClass();
    }
}
