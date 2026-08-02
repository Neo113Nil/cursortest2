package androidx.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import androidx.annotation.Nullable;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class c extends MediaBrowserServiceCompat.g<List<MediaBrowserCompat.MediaItem>> {
    public final /* synthetic */ ResultReceiver f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f = resultReceiver;
    }

    @Override // androidx.media.MediaBrowserServiceCompat.g
    public final void d(@Nullable List<MediaBrowserCompat.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> list2 = list;
        int i = this.e & 4;
        ResultReceiver resultReceiver = this.f;
        if (i != 0 || list2 == null) {
            resultReceiver.send(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("search_results", (Parcelable[]) list2.toArray(new MediaBrowserCompat.MediaItem[0]));
        resultReceiver.send(0, bundle);
    }
}
