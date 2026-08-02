package com.google.android.gms.internal.cast;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdw extends UIController implements RemoteMediaClient.ProgressListener {
    public final TextView b;
    public final com.google.android.gms.cast.framework.media.uicontroller.zza c;

    public zzdw(TextView textView, com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar) {
        this.b = textView;
        this.c = zzaVar;
        textView.setText(textView.getContext().getString(R.string.cast_invalid_stream_duration_text));
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public final void b(long j, long j2) {
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null) {
            remoteMediaClient.b(this, 1000L);
        }
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null) {
            remoteMediaClient.u(this);
        }
        this.a = null;
        f();
    }

    public final void f() {
        RemoteMediaClient remoteMediaClient = this.a;
        TextView textView = this.b;
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            textView.setText(textView.getContext().getString(R.string.cast_invalid_stream_duration_text));
            return;
        }
        long d = remoteMediaClient.d();
        if (d == MediaInfo.s) {
            d = remoteMediaClient.j();
        }
        textView.setText(this.c.l(d));
    }
}
