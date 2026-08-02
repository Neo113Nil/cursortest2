package com.google.android.gms.internal.cast;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdx extends zzdr {
    public final RelativeLayout c;
    public final TextView d;
    public final CastSeekBar e;
    public final com.google.android.gms.cast.framework.media.uicontroller.zza f;

    public zzdx(RelativeLayout relativeLayout, CastSeekBar castSeekBar, com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar) {
        this.c = relativeLayout;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tooltip);
        this.d = textView;
        this.e = castSeekBar;
        this.f = zzaVar;
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(null, com.google.android.gms.cast.framework.R.styleable.a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(22, 0);
        obtainStyledAttributes.recycle();
        textView.getBackground().setColorFilter(textView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        h();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        h();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        this.a = null;
        h();
    }

    @Override // com.google.android.gms.internal.cast.zzdr
    public final void f(long j) {
        h();
    }

    @Override // com.google.android.gms.internal.cast.zzdr
    public final void g(boolean z) {
        this.b = z;
        h();
    }

    public final void h() {
        RemoteMediaClient remoteMediaClient = this.a;
        RelativeLayout relativeLayout = this.c;
        if (remoteMediaClient == null || !remoteMediaClient.k() || this.b) {
            relativeLayout.setVisibility(8);
            return;
        }
        relativeLayout.setVisibility(0);
        CastSeekBar castSeekBar = this.e;
        long progress = castSeekBar.getProgress();
        com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar = this.f;
        String l = zzaVar.l(zzaVar.g() + progress);
        TextView textView = this.d;
        textView.setText(l);
        int measuredWidth = (castSeekBar.getMeasuredWidth() - castSeekBar.getPaddingLeft()) - castSeekBar.getPaddingRight();
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = textView.getMeasuredWidth();
        int min = Math.min(Math.max(0, ((int) ((castSeekBar.getProgress() / castSeekBar.getMaxProgress()) * measuredWidth)) - (measuredWidth2 / 2)), measuredWidth - measuredWidth2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.leftMargin = min;
        textView.setLayoutParams(layoutParams);
    }
}
