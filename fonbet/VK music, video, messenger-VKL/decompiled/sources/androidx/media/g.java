package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;
import java.util.List;
import xsna.qg90;
import xsna.ttw;
import xsna.zk3;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class g implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.c b;

    public g(MediaBrowserServiceCompat.f fVar) {
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        MediaBrowserServiceCompat.c cVar = this.b;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
        Iterator it = ((zk3.c) mediaBrowserServiceCompat.e.keySet()).iterator();
        while (true) {
            ttw ttwVar = (ttw) it;
            if (!ttwVar.hasNext()) {
                return;
            }
            MediaBrowserServiceCompat.b bVar = mediaBrowserServiceCompat2.e.get((IBinder) ttwVar.next());
            List<qg90<IBinder, Bundle>> list = bVar.f.get(DomExceptionUtils.SEPARATOR);
            if (list != null) {
                for (qg90<IBinder, Bundle> qg90Var : list) {
                    Bundle bundle = qg90Var.b;
                    int i3 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                    int i4 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                    if (i3 == -1 || i4 == -1) {
                        i = 0;
                        i2 = Integer.MAX_VALUE;
                    } else {
                        i = i3 * i4;
                        i2 = (i4 + i) - 1;
                    }
                    if (Integer.MAX_VALUE >= i && i2 >= 0) {
                        mediaBrowserServiceCompat2.f(DomExceptionUtils.SEPARATOR, bVar, qg90Var.b);
                    }
                }
            }
        }
    }
}
