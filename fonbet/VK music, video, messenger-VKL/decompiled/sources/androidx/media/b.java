package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import androidx.annotation.Nullable;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class b extends MediaBrowserServiceCompat.g<MediaBrowserCompat.MediaItem> {
    public final /* synthetic */ ResultReceiver f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f = resultReceiver;
    }

    @Override // androidx.media.MediaBrowserServiceCompat.g
    public final void d(@Nullable MediaBrowserCompat.MediaItem mediaItem) {
        MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
        int i = this.e & 2;
        ResultReceiver resultReceiver = this.f;
        if (i != 0) {
            resultReceiver.send(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", mediaItem2);
        resultReceiver.send(0, bundle);
    }
}
