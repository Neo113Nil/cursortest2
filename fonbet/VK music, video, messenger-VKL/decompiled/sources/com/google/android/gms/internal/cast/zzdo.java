package com.google.android.gms.internal.cast;

import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import xsna.aq01;
import xsna.lvf0;
import xsna.twp0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdo extends twp0 {
    private final TextView zza;

    public zzdo(@NonNull TextView textView) {
        this.zza = textView;
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        MediaInfo g;
        MediaMetadata mediaMetadata;
        String a;
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || (g = remoteMediaClient.g()) == null || (mediaMetadata = g.e) == null || (a = aq01.a(mediaMetadata)) == null) {
            return;
        }
        this.zza.setText(a);
    }
}
