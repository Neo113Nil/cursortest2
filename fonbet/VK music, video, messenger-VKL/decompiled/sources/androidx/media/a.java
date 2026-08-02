package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import androidx.annotation.Nullable;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;
import xsna.zk3;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class a extends MediaBrowserServiceCompat.g<List<MediaBrowserCompat.MediaItem>> {
    public final /* synthetic */ MediaBrowserServiceCompat.b f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ MediaBrowserServiceCompat i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, MediaBrowserServiceCompat.b bVar, String str2, Bundle bundle) {
        super(str);
        this.i = mediaBrowserServiceCompat;
        this.f = bVar;
        this.g = str2;
        this.h = bundle;
    }

    @Override // androidx.media.MediaBrowserServiceCompat.g
    public final void d(@Nullable List<MediaBrowserCompat.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> list2 = list;
        zk3<IBinder, MediaBrowserServiceCompat.b> zk3Var = this.i.e;
        MediaBrowserServiceCompat.b bVar = this.f;
        MediaBrowserServiceCompat.j jVar = bVar.e;
        if (zk3Var.get(((MediaBrowserServiceCompat.k) jVar).a.getBinder()) != bVar) {
            int i = MediaBrowserServiceCompat.h;
            return;
        }
        int i2 = this.e & 1;
        Bundle bundle = this.h;
        if (i2 != 0) {
            list2 = MediaBrowserServiceCompat.a(list2, bundle);
        }
        try {
            ((MediaBrowserServiceCompat.k) jVar).a(this.g, list2, bundle);
        } catch (RemoteException unused) {
        }
    }
}
