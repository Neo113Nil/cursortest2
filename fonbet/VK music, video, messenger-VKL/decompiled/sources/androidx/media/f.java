package androidx.media;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import androidx.annotation.Nullable;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class f extends MediaBrowserServiceCompat.g<List<MediaBrowserCompat.MediaItem>> {
    public final /* synthetic */ MediaBrowserServiceCompat.h f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, MediaBrowserServiceCompat.h hVar) {
        super(str);
        this.f = hVar;
    }

    @Override // androidx.media.MediaBrowserServiceCompat.g
    public final void a() {
        this.f.a.detach();
    }

    @Override // androidx.media.MediaBrowserServiceCompat.g
    public final void d(@Nullable List<MediaBrowserCompat.MediaItem> list) {
        ArrayList arrayList;
        List<MediaBrowserCompat.MediaItem> list2 = list;
        if (list2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(list2.size());
            for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                arrayList2.add(obtain);
            }
            arrayList = arrayList2;
        }
        this.f.a(arrayList);
    }
}
