package androidx.media;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class e implements Runnable {
    public final /* synthetic */ MediaSessionCompat.Token b;
    public final /* synthetic */ MediaBrowserServiceCompat.c c;

    public e(MediaBrowserServiceCompat.f fVar, MediaSessionCompat.Token token) {
        this.c = fVar;
        this.b = token;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.c cVar = this.c;
        ArrayList arrayList = cVar.a;
        boolean isEmpty = arrayList.isEmpty();
        MediaSessionCompat.Token token = this.b;
        if (!isEmpty) {
            IMediaSession extraBinder = token.getExtraBinder();
            if (extraBinder != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Bundle) it.next()).putBinder("extra_session_binder", extraBinder.asBinder());
                }
            }
            arrayList.clear();
        }
        cVar.b.setSessionToken((MediaSession.Token) token.getToken());
    }
}
