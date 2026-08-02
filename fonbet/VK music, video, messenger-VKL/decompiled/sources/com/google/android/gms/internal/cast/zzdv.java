package com.google.android.gms.internal.cast;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.cast.framework.R$styleable;
import com.vkontakte.android.R;
import xsna.g0a;
import xsna.lvf0;
import xsna.twp0;
import xsna.utz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdv extends twp0 implements lvf0.d {
    private final TextView zza;
    private final ImageView zzb;
    private final utz0 zzc;

    public zzdv(View view, utz0 utz0Var) {
        TextView textView = (TextView) view.findViewById(R.id.live_indicator_text);
        this.zza = textView;
        ImageView imageView = (ImageView) view.findViewById(R.id.live_indicator_dot);
        this.zzb = imageView;
        this.zzc = utz0Var;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(null, R$styleable.a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(13, 0);
        obtainStyledAttributes.recycle();
        imageView.getDrawable().setColorFilter(imageView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
        textView.setVisibility(8);
        imageView.setVisibility(8);
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
        boolean c;
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k() || !remoteMediaClient.m()) {
            this.zza.setVisibility(8);
            this.zzb.setVisibility(8);
            return;
        }
        if (remoteMediaClient.C()) {
            utz0 utz0Var = this.zzc;
            c = utz0Var.c(utz0Var.f() + utz0Var.b());
        } else {
            c = remoteMediaClient.p();
        }
        this.zza.setVisibility(0);
        this.zzb.setVisibility(true == c ? 0 : 8);
        zzr.zzb(zzpm.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT);
    }
}
