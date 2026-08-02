package com.google.android.gms.internal.cast;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdv extends UIController implements RemoteMediaClient.ProgressListener {
    public final TextView b;
    public final ImageView c;
    public final com.google.android.gms.cast.framework.media.uicontroller.zza d;

    public zzdv(View view, com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar) {
        TextView textView = (TextView) view.findViewById(R.id.live_indicator_text);
        this.b = textView;
        ImageView imageView = (ImageView) view.findViewById(R.id.live_indicator_dot);
        this.c = imageView;
        this.d = zzaVar;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(null, com.google.android.gms.cast.framework.R.styleable.a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(13, 0);
        obtainStyledAttributes.recycle();
        imageView.getDrawable().setColorFilter(imageView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
        textView.setVisibility(8);
        imageView.setVisibility(8);
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
        boolean d;
        RemoteMediaClient remoteMediaClient = this.a;
        ImageView imageView = this.c;
        TextView textView = this.b;
        if (remoteMediaClient == null || !remoteMediaClient.k() || !remoteMediaClient.m()) {
            textView.setVisibility(8);
            imageView.setVisibility(8);
            return;
        }
        if (remoteMediaClient.B()) {
            com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar = this.d;
            d = zzaVar.d(zzaVar.g() + zzaVar.c());
        } else {
            d = remoteMediaClient.p();
        }
        textView.setVisibility(0);
        imageView.setVisibility(true == d ? 0 : 8);
        zzr.a(zzpm.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT);
    }
}
