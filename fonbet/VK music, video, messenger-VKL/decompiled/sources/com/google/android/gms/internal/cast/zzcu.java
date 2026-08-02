package com.google.android.gms.internal.cast;

import android.content.Context;
import android.view.View;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.g0a;
import xsna.lvf0;
import xsna.twp0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzcu extends twp0 {
    private final View zza;
    private final String zzb;
    private final String zzc;

    public zzcu(View view, Context context) {
        this.zza = view;
        this.zzb = context.getString(R.string.cast_closed_captions);
        this.zzc = context.getString(R.string.cast_closed_captions_unavailable);
        view.setEnabled(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zza() {
        MediaInfo g;
        List list;
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.k() && (g = remoteMediaClient.g()) != null && (list = g.g) != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = ((MediaTrack) it.next()).c;
                if (i2 == 2) {
                    i++;
                    if (i > 1) {
                        if (!remoteMediaClient.q()) {
                            View view = this.zza;
                            view.setEnabled(true);
                            view.setContentDescription(this.zzb);
                            return;
                        }
                    }
                } else if (i2 == 1) {
                    if (!remoteMediaClient.q()) {
                    }
                }
            }
        }
        View view2 = this.zza;
        view2.setEnabled(false);
        view2.setContentDescription(this.zzc);
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // xsna.twp0
    public final void onSendingRemoteMediaRequest() {
        this.zza.setEnabled(false);
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        this.zza.setEnabled(true);
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        this.zza.setEnabled(false);
        super.onSessionEnded();
    }
}
