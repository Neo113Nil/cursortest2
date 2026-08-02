package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Objects;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class q implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.k b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ ResultReceiver e;
    public final /* synthetic */ MediaBrowserServiceCompat.i f;

    public q(MediaBrowserServiceCompat.i iVar, MediaBrowserServiceCompat.k kVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
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
        MediaBrowserServiceCompat.b bVar = MediaBrowserServiceCompat.this.e.get(binder);
        Bundle bundle = this.d;
        if (bVar == null) {
            Objects.toString(bundle);
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.c;
        d dVar = new d(str, this.e);
        mediaBrowserServiceCompat.b(str, bundle, dVar);
        if (dVar.b()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }
}
