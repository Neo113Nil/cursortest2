package androidx.media;

import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class j implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.k b;
    public final /* synthetic */ MediaBrowserServiceCompat.i c;

    public j(MediaBrowserServiceCompat.i iVar, MediaBrowserServiceCompat.k kVar) {
        this.c = iVar;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.b remove = MediaBrowserServiceCompat.this.e.remove(this.b.a.getBinder());
        if (remove != null) {
            ((MediaBrowserServiceCompat.k) remove.e).a.getBinder().unlinkToDeath(remove, 0);
        }
    }
}
