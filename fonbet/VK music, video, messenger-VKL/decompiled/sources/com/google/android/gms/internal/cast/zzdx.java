package com.google.android.gms.internal.cast;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.cast.framework.R$styleable;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.vkontakte.android.R;
import xsna.g0a;
import xsna.lvf0;
import xsna.utz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdx extends zzdr {
    private final RelativeLayout zza;
    private final TextView zzb;
    private final CastSeekBar zzc;
    private final utz0 zzd;

    public zzdx(RelativeLayout relativeLayout, CastSeekBar castSeekBar, utz0 utz0Var) {
        this.zza = relativeLayout;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tooltip);
        this.zzb = textView;
        this.zzc = castSeekBar;
        this.zzd = utz0Var;
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(null, R$styleable.a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(22, 0);
        obtainStyledAttributes.recycle();
        textView.getBackground().setColorFilter(textView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zzd();
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        zzd();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        super.onSessionEnded();
        zzd();
    }

    @Override // com.google.android.gms.internal.cast.zzdr
    public final void zza(long j) {
        zzd();
    }

    @Override // com.google.android.gms.internal.cast.zzdr
    public final void zzb(boolean z) {
        super.zzb(z);
        zzd();
    }

    public final void zzd() {
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k() || zzc()) {
            this.zza.setVisibility(8);
            return;
        }
        this.zza.setVisibility(0);
        TextView textView = this.zzb;
        utz0 utz0Var = this.zzd;
        CastSeekBar castSeekBar = this.zzc;
        textView.setText(utz0Var.k(utz0Var.f() + castSeekBar.getProgress()));
        int measuredWidth = (castSeekBar.getMeasuredWidth() - castSeekBar.getPaddingLeft()) - castSeekBar.getPaddingRight();
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = textView.getMeasuredWidth();
        int min = Math.min(Math.max(0, ((int) ((castSeekBar.getProgress() / castSeekBar.getMaxProgress()) * measuredWidth)) - (measuredWidth2 / 2)), measuredWidth - measuredWidth2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.leftMargin = min;
        textView.setLayoutParams(layoutParams);
    }
}
