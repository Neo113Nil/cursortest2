package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat.b;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class i implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.k b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ MediaBrowserServiceCompat.i g;

    public i(int i, int i2, Bundle bundle, MediaBrowserServiceCompat.i iVar, MediaBrowserServiceCompat.k kVar, String str) {
        this.g = iVar;
        this.b = kVar;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.k kVar = this.b;
        IBinder binder = kVar.a.getBinder();
        MediaBrowserServiceCompat.i iVar = this.g;
        MediaBrowserServiceCompat.this.e.remove(binder);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        int i = this.d;
        int i2 = this.e;
        String str = this.c;
        MediaBrowserServiceCompat.b bVar = mediaBrowserServiceCompat.new b(str, i, i2, kVar);
        MediaBrowserServiceCompat.a c = mediaBrowserServiceCompat.c(str, this.e, this.f);
        bVar.g = c;
        if (c == null) {
            try {
                kVar.b(2, null);
                return;
            } catch (RemoteException unused) {
                return;
            }
        }
        try {
            mediaBrowserServiceCompat.e.put(binder, bVar);
            binder.linkToDeath(bVar, 0);
            MediaSessionCompat.Token token = mediaBrowserServiceCompat.g;
            if (token != null) {
                MediaBrowserServiceCompat.a aVar = bVar.g;
                aVar.getClass();
                Bundle bundle = aVar.a;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("data_media_item_id", DomExceptionUtils.SEPARATOR);
                bundle2.putParcelable("data_media_session_token", token);
                bundle2.putBundle("data_root_hints", bundle);
                kVar.b(1, bundle2);
            }
        } catch (RemoteException unused2) {
            mediaBrowserServiceCompat.e.remove(binder);
        }
    }
}
