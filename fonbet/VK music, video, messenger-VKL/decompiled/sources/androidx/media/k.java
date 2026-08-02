package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.fto0;
import xsna.qg90;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class k implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.k b;
    public final /* synthetic */ String c;
    public final /* synthetic */ IBinder d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ MediaBrowserServiceCompat.i f;

    public k(MediaBrowserServiceCompat.i iVar, MediaBrowserServiceCompat.k kVar, String str, IBinder iBinder, Bundle bundle) {
        this.f = iVar;
        this.b = kVar;
        this.c = str;
        this.d = iBinder;
        this.e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.b.a.getBinder();
        MediaBrowserServiceCompat.i iVar = this.f;
        MediaBrowserServiceCompat.b bVar = MediaBrowserServiceCompat.this.e.get(binder);
        if (bVar == null) {
            return;
        }
        HashMap<String, List<qg90<IBinder, Bundle>>> hashMap = bVar.f;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.c;
        List<qg90<IBinder, Bundle>> list = hashMap.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        Iterator<qg90<IBinder, Bundle>> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            IBinder iBinder = this.d;
            Bundle bundle = this.e;
            if (!hasNext) {
                list.add(new qg90<>(iBinder, bundle));
                hashMap.put(str, list);
                mediaBrowserServiceCompat.f(str, bVar, bundle);
                return;
            } else {
                qg90<IBinder, Bundle> next = it.next();
                if (iBinder == next.a && fto0.c(bundle, next.b)) {
                    return;
                }
            }
        }
    }
}
