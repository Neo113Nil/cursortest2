package com.google.android.gms.cast.framework.media.uicontroller;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzdh;
import com.google.android.gms.internal.cast.zzpm;
import com.google.android.gms.internal.cast.zzr;
import defpackage.cln;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class UIMediaController implements RemoteMediaClient.Listener, SessionManagerListener<CastSession> {
    public static final Logger h = new Logger("UIMediaController", null);
    public final Activity a;
    public final SessionManager b;
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final zza e = zza.a();
    public RemoteMediaClient.Listener f;
    public RemoteMediaClient g;

    public UIMediaController(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
        CastContext d = CastContext.d(fragmentActivity);
        zzr.a(zzpm.UI_MEDIA_CONTROLLER);
        SessionManager b = d != null ? d.b() : null;
        this.b = b;
        if (b != null) {
            b.a(this);
            r(b.c());
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void a(Session session, int i) {
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void b() {
        u();
        RemoteMediaClient.Listener listener = this.f;
        if (listener != null) {
            listener.b();
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void c(Session session, String str) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void d(Session session, int i) {
        s();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void e(Session session, int i) {
        s();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void f(Session session) {
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void g() {
        u();
        RemoteMediaClient.Listener listener = this.f;
        if (listener != null) {
            listener.g();
        }
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void h() {
        u();
        RemoteMediaClient.Listener listener = this.f;
        if (listener != null) {
            listener.h();
        }
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void i() {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((UIController) it2.next()).c();
            }
        }
        RemoteMediaClient.Listener listener = this.f;
        if (listener != null) {
            listener.i();
        }
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void j() {
        u();
        RemoteMediaClient.Listener listener = this.f;
        if (listener != null) {
            listener.j();
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void k(Session session, String str) {
        r((CastSession) session);
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void l() {
        u();
        RemoteMediaClient.Listener listener = this.f;
        if (listener != null) {
            listener.l();
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void m(Session session, boolean z) {
        r((CastSession) session);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void n(Session session, int i) {
        s();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void o(Session session) {
    }

    public final void p(ImageView imageView, Drawable drawable, Drawable drawable2, Drawable drawable3, ProgressBar progressBar, boolean z) {
        Preconditions.e("Must be called from the main thread.");
        zzr.a(zzpm.PAUSE_CONTROLLER);
        imageView.setOnClickListener(new cln(this, 1));
        t(imageView, new zzdh(imageView, this.a, drawable, drawable2, drawable3, progressBar, z));
    }

    public final RemoteMediaClient q() {
        Preconditions.e("Must be called from the main thread.");
        return this.g;
    }

    public final void r(Session session) {
        Preconditions.e("Must be called from the main thread.");
        if (this.g == null && session != null && session.c()) {
            CastSession castSession = (CastSession) session;
            RemoteMediaClient k = castSession.k();
            this.g = k;
            if (k != null) {
                Preconditions.e("Must be called from the main thread.");
                k.g.add(this);
                zza zzaVar = this.e;
                Preconditions.i(zzaVar);
                zzaVar.a = castSession.k();
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((UIController) it2.next()).d(castSession);
                    }
                }
                u();
            }
        }
    }

    public final void s() {
        Preconditions.e("Must be called from the main thread.");
        if (this.g != null) {
            this.e.a = null;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    ((UIController) it2.next()).e();
                }
            }
            Preconditions.i(this.g);
            RemoteMediaClient remoteMediaClient = this.g;
            remoteMediaClient.getClass();
            Preconditions.e("Must be called from the main thread.");
            remoteMediaClient.g.remove(this);
            this.g = null;
        }
    }

    public final void t(View view, UIController uIController) {
        SessionManager sessionManager = this.b;
        if (sessionManager == null) {
            return;
        }
        HashMap hashMap = this.c;
        List list = (List) hashMap.get(view);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(view, list);
        }
        list.add(uIController);
        Preconditions.e("Must be called from the main thread.");
        if (this.g != null) {
            CastSession c = sessionManager.c();
            Preconditions.i(c);
            uIController.d(c);
            u();
        }
    }

    public final void u() {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((UIController) it2.next()).a();
            }
        }
    }
}
