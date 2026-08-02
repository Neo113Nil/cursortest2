package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import defpackage.d4c;
import defpackage.jac;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class a {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    public a(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.b);
        this.a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.e;
        if (mediaSessionCompat$Token.a() == null) {
            return;
        }
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jac jacVar = (jac) it.next();
            d4c d4cVar = new d4c(jacVar);
            this.d.put(jacVar, d4cVar);
            jacVar.c = d4cVar;
            try {
                mediaSessionCompat$Token.a().W3(d4cVar);
                jacVar.e(13, null, null);
            } catch (RemoteException unused) {
            }
        }
        arrayList.clear();
    }

    public final void b(jac jacVar) {
        this.a.unregisterCallback(jacVar.a);
        synchronized (this.b) {
            if (this.e.a() != null) {
                try {
                    d4c d4cVar = (d4c) this.d.remove(jacVar);
                    if (d4cVar != null) {
                        jacVar.c = null;
                        this.e.a().F3(d4cVar);
                    }
                } catch (RemoteException unused) {
                }
            } else {
                this.c.remove(jacVar);
            }
        }
    }
}
