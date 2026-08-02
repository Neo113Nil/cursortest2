package com.google.android.gms.internal.cast;

import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import xsna.g0a;
import xsna.lvf0;
import xsna.twp0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdp extends twp0 implements lvf0.d {
    private final TextView zza;
    private final String zzb;

    @Nullable
    private final View zzc;

    public zzdp(TextView textView, String str, @Nullable View view) {
        this.zza = textView;
        this.zzb = str;
        this.zzc = view;
    }

    private final void zza(long j, boolean z) {
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            TextView textView = this.zza;
            textView.setVisibility(0);
            textView.setText(this.zzb);
            View view = this.zzc;
            if (view != null) {
                view.setVisibility(4);
                return;
            }
            return;
        }
        if (remoteMediaClient.m()) {
            TextView textView2 = this.zza;
            textView2.setText(this.zzb);
            View view2 = this.zzc;
            if (view2 != null) {
                textView2.setVisibility(4);
                view2.setVisibility(0);
                return;
            }
            return;
        }
        if (z) {
            j = remoteMediaClient.j();
        }
        TextView textView3 = this.zza;
        textView3.setVisibility(0);
        textView3.setText(DateUtils.formatElapsedTime(j / 1000));
        View view3 = this.zzc;
        if (view3 != null) {
            view3.setVisibility(4);
        }
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zza(-1L, true);
    }

    @Override // xsna.lvf0.d
    public final void onProgressUpdated(long j, long j2) {
        zza(j2, false);
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.b(this, 1000L);
        }
        zza(-1L, true);
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        this.zza.setText(this.zzb);
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.u(this);
        }
        super.onSessionEnded();
    }
}
