package com.google.android.gms.internal.measurement;

import com.ironsource.C4553sg;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes12.dex */
final class zzx extends zzai {
    public zzx(zzy zzyVar, String str) {
        super(C4553sg.b);
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        return new zzah(Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
    }
}
