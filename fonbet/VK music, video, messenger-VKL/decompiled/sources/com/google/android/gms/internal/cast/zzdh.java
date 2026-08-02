package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import xsna.g0a;
import xsna.lvf0;
import xsna.twp0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdh extends twp0 {
    private final ImageView zza;

    @Nullable
    private final View zzb;
    private final boolean zzc;
    private final Drawable zzd;
    private final String zze;
    private final Drawable zzf;
    private final String zzg;
    private final Drawable zzh;
    private final String zzi;
    private boolean zzj = false;

    public zzdh(ImageView imageView, Context context, Drawable drawable, Drawable drawable2, Drawable drawable3, @Nullable View view, boolean z) {
        this.zza = imageView;
        this.zzd = drawable;
        this.zzf = drawable2;
        this.zzh = drawable3 != null ? drawable3 : drawable2;
        this.zze = context.getString(R.string.cast_play);
        this.zzg = context.getString(R.string.cast_pause);
        this.zzi = context.getString(R.string.cast_stop);
        this.zzb = view;
        this.zzc = z;
        imageView.setEnabled(false);
    }

    private final void zza() {
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            this.zza.setEnabled(false);
            return;
        }
        if (remoteMediaClient.p()) {
            if (remoteMediaClient.m()) {
                zzb(this.zzh, this.zzi);
                return;
            } else {
                zzb(this.zzf, this.zzg);
                return;
            }
        }
        if (remoteMediaClient.l()) {
            zzc(false);
        } else if (remoteMediaClient.o()) {
            zzb(this.zzd, this.zze);
        } else if (remoteMediaClient.n()) {
            zzc(true);
        }
    }

    private final void zzb(Drawable drawable, String str) {
        ImageView imageView = this.zza;
        boolean equals = drawable.equals(imageView.getDrawable());
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(str);
        imageView.setVisibility(0);
        imageView.setEnabled(true);
        View view = this.zzb;
        if (view != null) {
            view.setVisibility(8);
        }
        if (equals || !this.zzj) {
            return;
        }
        imageView.sendAccessibilityEvent(8);
    }

    private final void zzc(boolean z) {
        ImageView imageView = this.zza;
        this.zzj = imageView.isAccessibilityFocused();
        View view = this.zzb;
        if (view != null) {
            view.setVisibility(0);
            if (this.zzj) {
                view.sendAccessibilityEvent(8);
            }
        }
        imageView.setVisibility(true == this.zzc ? 4 : 0);
        imageView.setEnabled(!z);
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // xsna.twp0
    public final void onSendingRemoteMediaRequest() {
        zzc(true);
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        this.zza.setEnabled(false);
        super.onSessionEnded();
    }
}
