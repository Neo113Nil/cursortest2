package com.google.android.gms.internal.cast;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.vkontakte.android.R;
import xsna.g0a;
import xsna.lvf0;
import xsna.twp0;
import xsna.utz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdw extends twp0 implements lvf0.d {
    private final TextView zza;
    private final utz0 zzb;

    public zzdw(TextView textView, utz0 utz0Var) {
        this.zza = textView;
        this.zzb = utz0Var;
        textView.setText(textView.getContext().getString(R.string.cast_invalid_stream_duration_text));
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // xsna.lvf0.d
    public final void onProgressUpdated(long j, long j2) {
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.b(this, 1000L);
        }
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.u(this);
        }
        super.onSessionEnded();
        zza();
    }

    public final void zza() {
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            TextView textView = this.zza;
            textView.setText(textView.getContext().getString(R.string.cast_invalid_stream_duration_text));
        } else {
            long d = remoteMediaClient.d();
            if (d == MediaInfo.t) {
                d = remoteMediaClient.j();
            }
            this.zza.setText(this.zzb.k(d));
        }
    }
}
