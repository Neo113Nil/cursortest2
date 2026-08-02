package androidx.media;

import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import xsna.go9;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class m implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.k b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ResultReceiver d;
    public final /* synthetic */ MediaBrowserServiceCompat.i e;

    public m(MediaBrowserServiceCompat.i iVar, MediaBrowserServiceCompat.k kVar, String str, ResultReceiver resultReceiver) {
        this.e = iVar;
        this.b = kVar;
        this.c = str;
        this.d = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (MediaBrowserServiceCompat.this.e.get(this.b.a.getBinder()) == null) {
            return;
        }
        String str = this.c;
        b bVar = new b(str, this.d);
        bVar.e = 2;
        bVar.f(null);
        if (!bVar.b()) {
            throw new IllegalStateException(go9.b("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }
}
