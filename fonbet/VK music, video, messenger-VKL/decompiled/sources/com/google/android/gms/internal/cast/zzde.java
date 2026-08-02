package com.google.android.gms.internal.cast;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import java.util.ArrayList;
import java.util.List;
import xsna.exc0;
import xsna.lvf0;
import xsna.twp0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzde extends twp0 {
    private final TextView zza;
    private final List zzb;

    public zzde(TextView textView, List list) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = textView;
        arrayList.addAll(list);
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        MediaMetadata mediaMetadata;
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            return;
        }
        MediaStatus h = remoteMediaClient.h();
        exc0.i(h);
        MediaInfo mediaInfo = h.b;
        if (mediaInfo == null || (mediaMetadata = mediaInfo.e) == null) {
            return;
        }
        for (String str : this.zzb) {
            if (mediaMetadata.c.containsKey(str)) {
                this.zza.setText(mediaMetadata.b(str));
                return;
            }
        }
        this.zza.setText("");
    }
}
