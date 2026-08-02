package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import androidx.annotation.Nullable;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes12.dex */
public final class d extends MediaBrowserServiceCompat.g<Bundle> {
    public final /* synthetic */ ResultReceiver f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f = resultReceiver;
    }

    @Override // androidx.media.MediaBrowserServiceCompat.g
    public final void c() {
        this.f.send(-1, null);
    }

    @Override // androidx.media.MediaBrowserServiceCompat.g
    public final void d(@Nullable Bundle bundle) {
        this.f.send(0, bundle);
    }
}
