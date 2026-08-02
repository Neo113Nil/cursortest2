package com.google.android.gms.internal.cast;

import android.text.format.DateUtils;
import android.widget.TextView;
import xsna.g0a;
import xsna.lvf0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdq extends zzdr implements lvf0.d {
    private final TextView zza;
    private final long zzb;
    private final String zzc;
    private boolean zzd = true;

    public zzdq(TextView textView, long j, String str) {
        this.zza = textView;
        this.zzb = j;
        this.zzc = str;
    }

    @Override // xsna.lvf0.d
    public final void onProgressUpdated(long j, long j2) {
        if (this.zzd) {
            TextView textView = this.zza;
            if (j == -1000) {
                j = j2;
            }
            textView.setText(DateUtils.formatElapsedTime(j / 1000));
        }
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.b(this, this.zzb);
            if (remoteMediaClient.k()) {
                this.zza.setText(DateUtils.formatElapsedTime(remoteMediaClient.d() / 1000));
            } else {
                this.zza.setText(this.zzc);
            }
        }
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        this.zza.setText(this.zzc);
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.u(this);
        }
        super.onSessionEnded();
    }

    @Override // com.google.android.gms.internal.cast.zzdr
    public final void zza(long j) {
        this.zza.setText(DateUtils.formatElapsedTime(j / 1000));
    }

    @Override // com.google.android.gms.internal.cast.zzdr
    public final void zzb(boolean z) {
        this.zzd = z;
    }
}
