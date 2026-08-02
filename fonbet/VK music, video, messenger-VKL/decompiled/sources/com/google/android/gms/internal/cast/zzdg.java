package com.google.android.gms.internal.cast;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import xsna.a401;
import xsna.dz9;
import xsna.exc0;
import xsna.g0a;
import xsna.lvf0;
import xsna.twp0;
import xsna.uz9;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdg extends twp0 {
    private final ImageView zza;
    private final String zzb;
    private final String zzc;
    private final Context zzd;

    @Nullable
    private dz9.c zze;

    public zzdg(ImageView imageView, Context context) {
        this.zza = imageView;
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        this.zzb = applicationContext.getString(R.string.cast_mute);
        this.zzc = applicationContext.getString(R.string.cast_unmute);
        imageView.setEnabled(false);
        this.zze = null;
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // xsna.twp0
    public final void onSendingRemoteMediaRequest() {
        this.zza.setEnabled(false);
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        if (this.zze == null) {
            this.zze = new zzdf(this);
        }
        dz9.c cVar = this.zze;
        g0aVar.getClass();
        exc0.e("Must be called from the main thread.");
        if (cVar != null) {
            g0aVar.d.add(cVar);
        }
        super.onSessionConnected(g0aVar);
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        dz9.c cVar;
        this.zza.setEnabled(false);
        g0a c = uz9.e(this.zzd).d().c();
        if (c != null && (cVar = this.zze) != null) {
            exc0.e("Must be called from the main thread.");
            c.d.remove(cVar);
        }
        super.onSessionEnded();
    }

    public final void zza() {
        g0a c = uz9.e(this.zzd).d().c();
        boolean z = false;
        if (c == null || !c.c()) {
            this.zza.setEnabled(false);
            return;
        }
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            this.zza.setEnabled(false);
        } else {
            this.zza.setEnabled(true);
        }
        exc0.e("Must be called from the main thread.");
        a401 a401Var = c.i;
        if (a401Var != null && a401Var.e()) {
            exc0.k("Not connected to device", a401Var.e());
            if (a401Var.m) {
                z = true;
            }
        }
        ImageView imageView = this.zza;
        imageView.setSelected(z);
        imageView.setContentDescription(z ? this.zzc : this.zzb);
    }
}
