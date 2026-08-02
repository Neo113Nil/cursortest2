package com.google.android.gms.internal.cast;

import android.hardware.display.VirtualDisplay;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import xsna.cv90;
import xsna.o100;
import xsna.z23;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
@Deprecated
/* loaded from: classes12.dex */
public final class zzet {
    public static final /* synthetic */ int zza = 0;
    private static final o100 zzb = new o100("CastRemoteDisplayApiImpl", null);
    private final a zzc;

    @Nullable
    private VirtualDisplay zzd;
    private final zzfb zze = new zzel(this);

    public zzet(a aVar) {
        this.zzc = aVar;
    }

    public final cv90<Object> startRemoteDisplay(c cVar, String str) {
        zzb.a("startRemoteDisplay", new Object[0]);
        return cVar.b(new zzem(this, cVar, str));
    }

    public final cv90<Object> stopRemoteDisplay(c cVar) {
        zzb.a("stopRemoteDisplay", new Object[0]);
        return cVar.b(new zzen(this, cVar));
    }

    public final /* synthetic */ void zza() {
        VirtualDisplay virtualDisplay = this.zzd;
        if (virtualDisplay != null) {
            if (virtualDisplay.getDisplay() != null) {
                o100 o100Var = zzb;
                int displayId = virtualDisplay.getDisplay().getDisplayId();
                o100Var.a(z23.b(displayId, "releasing virtual display: ", new StringBuilder(String.valueOf(displayId).length() + 27)), new Object[0]);
            }
            virtualDisplay.release();
        }
        this.zzd = null;
    }

    public final /* synthetic */ a zzc() {
        return this.zzc;
    }

    public final /* synthetic */ VirtualDisplay zzd() {
        return this.zzd;
    }

    public final /* synthetic */ void zze(VirtualDisplay virtualDisplay) {
        this.zzd = virtualDisplay;
    }

    public final /* synthetic */ zzfb zzf() {
        return this.zze;
    }
}
