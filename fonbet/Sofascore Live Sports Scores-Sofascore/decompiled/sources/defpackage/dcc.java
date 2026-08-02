package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.d;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class dcc {
    public final MediaSession a;
    public final MediaSessionCompat$Token b;
    public final Object c = new Object();
    public boolean d = false;
    public final RemoteCallbackList e = new RemoteCallbackList();
    public PlaybackStateCompat f;
    public MediaMetadataCompat g;
    public ccc h;
    public icc i;

    public dcc(Context context) {
        MediaSession a = a(context);
        this.a = a;
        this.b = new MediaSessionCompat$Token(a.getSessionToken(), new d(this));
        a.setFlags(3);
    }

    public MediaSession a(Context context) {
        return new MediaSession(context, "CastMediaSession");
    }

    public icc b() {
        icc iccVar;
        synchronized (this.c) {
            iccVar = this.i;
        }
        return iccVar;
    }

    public final void c(ccc cccVar, Handler handler) {
        synchronized (this.c) {
            this.h = cccVar;
            gl0 gl0Var = null;
            this.a.setCallback(cccVar == null ? null : (bcc) cccVar.c, handler);
            if (cccVar != null) {
                synchronized (cccVar.b) {
                    try {
                        cccVar.d = new WeakReference(this);
                        gl0 gl0Var2 = (gl0) cccVar.e;
                        if (gl0Var2 != null) {
                            gl0Var2.removeCallbacksAndMessages(null);
                        }
                        if (handler != null) {
                            gl0Var = new gl0(cccVar, handler.getLooper(), 11);
                        }
                        cccVar.e = gl0Var;
                    } finally {
                    }
                }
            }
        }
    }

    public void d(icc iccVar) {
        synchronized (this.c) {
            this.i = iccVar;
        }
    }
}
