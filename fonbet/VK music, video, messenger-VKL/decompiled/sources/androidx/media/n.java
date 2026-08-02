package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat.b;
import java.util.Iterator;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class n implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.k b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ MediaBrowserServiceCompat.i f;

    public n(int i, int i2, Bundle bundle, MediaBrowserServiceCompat.i iVar, MediaBrowserServiceCompat.k kVar, String str) {
        this.f = iVar;
        this.b = kVar;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.b bVar;
        MediaBrowserServiceCompat.k kVar = this.b;
        IBinder binder = kVar.a.getBinder();
        MediaBrowserServiceCompat.i iVar = this.f;
        MediaBrowserServiceCompat.this.e.remove(binder);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        Iterator<MediaBrowserServiceCompat.b> it = mediaBrowserServiceCompat.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MediaBrowserServiceCompat.b next = it.next();
            if (next.d == this.c) {
                bVar = (TextUtils.isEmpty(this.d) || this.e <= 0) ? mediaBrowserServiceCompat.new b(next.b, next.c, next.d, kVar) : null;
                it.remove();
            }
        }
        if (bVar == null) {
            bVar = mediaBrowserServiceCompat.new b(this.d, this.e, this.c, kVar);
        }
        mediaBrowserServiceCompat.e.put(binder, bVar);
        try {
            binder.linkToDeath(bVar, 0);
        } catch (RemoteException unused) {
        }
    }
}
