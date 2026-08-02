package androidx.media;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import androidx.annotation.Nullable;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class h extends MediaBrowserServiceCompat.g<List<MediaBrowserCompat.MediaItem>> {
    public final /* synthetic */ MediaBrowserServiceCompat.h f;
    public final /* synthetic */ Bundle g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MediaBrowserServiceCompat.e eVar, String str, MediaBrowserServiceCompat.h hVar, Bundle bundle) {
        super(str);
        this.f = hVar;
        this.g = bundle;
    }

    @Override // androidx.media.MediaBrowserServiceCompat.g
    public final void a() {
        this.f.a.detach();
    }

    @Override // androidx.media.MediaBrowserServiceCompat.g
    public final void d(@Nullable List<MediaBrowserCompat.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> list2 = list;
        MediaBrowserServiceCompat.h hVar = this.f;
        if (list2 == null) {
            hVar.a(null);
            return;
        }
        if ((this.e & 1) != 0) {
            list2 = MediaBrowserServiceCompat.a(list2, this.g);
        }
        ArrayList arrayList = new ArrayList(list2.size());
        for (MediaBrowserCompat.MediaItem mediaItem : list2) {
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            arrayList.add(obtain);
        }
        hVar.a(arrayList);
    }
}
