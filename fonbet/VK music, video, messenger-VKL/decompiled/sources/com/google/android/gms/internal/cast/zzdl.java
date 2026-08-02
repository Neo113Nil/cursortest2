package com.google.android.gms.internal.cast;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;
import androidx.annotation.Nullable;
import xsna.g0a;
import xsna.lvf0;
import xsna.twp0;
import xsna.utz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdl extends twp0 implements lvf0.d {
    private final SeekBar zza;
    private final long zzb;
    private final utz0 zzc;
    private boolean zzd = true;
    private Boolean zze;

    @Nullable
    private Drawable zzf;

    public zzdl(SeekBar seekBar, long j, utz0 utz0Var) {
        this.zzf = null;
        this.zza = seekBar;
        this.zzb = j;
        this.zzc = utz0Var;
        seekBar.setEnabled(false);
        this.zzf = seekBar.getThumb();
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
            remoteMediaClient.b(this, this.zzb);
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza() {
        lvf0 remoteMediaClient;
        lvf0 remoteMediaClient2 = getRemoteMediaClient();
        if (remoteMediaClient2 == null || !remoteMediaClient2.k()) {
            SeekBar seekBar = this.zza;
            utz0 utz0Var = this.zzc;
            seekBar.setMax(utz0Var.a());
            seekBar.setProgress(utz0Var.b());
            seekBar.setEnabled(false);
            return;
        }
        if (this.zzd) {
            SeekBar seekBar2 = this.zza;
            utz0 utz0Var2 = this.zzc;
            seekBar2.setMax(utz0Var2.a());
            if (remoteMediaClient2.m()) {
                if (utz0Var2.c(utz0Var2.f() + utz0Var2.b())) {
                    seekBar2.setProgress(utz0Var2.e());
                    if (remoteMediaClient2.q()) {
                        seekBar2.setEnabled(true);
                    } else {
                        seekBar2.setEnabled(false);
                    }
                    remoteMediaClient = getRemoteMediaClient();
                    if (remoteMediaClient == null && remoteMediaClient.k()) {
                        Boolean bool = this.zze;
                        if (bool == null || bool.booleanValue() != remoteMediaClient.C()) {
                            boolean C = remoteMediaClient.C();
                            this.zze = Boolean.valueOf(C);
                            if (!C) {
                                seekBar2.setThumb(new ColorDrawable(0));
                                seekBar2.setClickable(false);
                                seekBar2.setOnTouchListener(new zzdk(this));
                                return;
                            } else {
                                Drawable drawable = this.zzf;
                                if (drawable != null) {
                                    seekBar2.setThumb(drawable);
                                }
                                seekBar2.setClickable(true);
                                seekBar2.setOnTouchListener(null);
                                return;
                            }
                        }
                        return;
                    }
                }
            }
            seekBar2.setProgress(utz0Var2.b());
            if (remoteMediaClient2.q()) {
            }
            remoteMediaClient = getRemoteMediaClient();
            if (remoteMediaClient == null) {
            }
        }
    }

    public final void zzb(boolean z) {
        this.zzd = z;
    }
}
