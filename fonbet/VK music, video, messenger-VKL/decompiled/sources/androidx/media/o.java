package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class o implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.k b;
    public final /* synthetic */ MediaBrowserServiceCompat.i c;

    public o(MediaBrowserServiceCompat.i iVar, MediaBrowserServiceCompat.k kVar) {
        this.c = iVar;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.b.a.getBinder();
        MediaBrowserServiceCompat.b remove = MediaBrowserServiceCompat.this.e.remove(binder);
        if (remove != null) {
            binder.unlinkToDeath(remove, 0);
        }
    }
}
