package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.qg90;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class l implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.k b;
    public final /* synthetic */ String c;
    public final /* synthetic */ IBinder d;
    public final /* synthetic */ MediaBrowserServiceCompat.i e;

    public l(MediaBrowserServiceCompat.i iVar, MediaBrowserServiceCompat.k kVar, String str, IBinder iBinder) {
        this.e = iVar;
        this.b = kVar;
        this.c = str;
        this.d = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.b bVar = MediaBrowserServiceCompat.this.e.get(this.b.a.getBinder());
        if (bVar == null) {
            return;
        }
        HashMap<String, List<qg90<IBinder, Bundle>>> hashMap = bVar.f;
        String str = this.c;
        IBinder iBinder = this.d;
        if (iBinder == null) {
            hashMap.remove(str);
            return;
        }
        List<qg90<IBinder, Bundle>> list = hashMap.get(str);
        if (list != null) {
            Iterator<qg90<IBinder, Bundle>> it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == it.next().a) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                hashMap.remove(str);
            }
        }
    }
}
