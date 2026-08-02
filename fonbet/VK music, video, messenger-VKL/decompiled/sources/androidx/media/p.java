package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import xsna.go9;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class p implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.k b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ ResultReceiver e;
    public final /* synthetic */ MediaBrowserServiceCompat.i f;

    public p(MediaBrowserServiceCompat.i iVar, MediaBrowserServiceCompat.k kVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f = iVar;
        this.b = kVar;
        this.c = str;
        this.d = bundle;
        this.e = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.b.a.getBinder();
        MediaBrowserServiceCompat.i iVar = this.f;
        if (MediaBrowserServiceCompat.this.e.get(binder) == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.c;
        c cVar = new c(str, this.e);
        mediaBrowserServiceCompat.e(str, this.d, cVar);
        if (!cVar.b()) {
            throw new IllegalStateException(go9.b("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }
}
