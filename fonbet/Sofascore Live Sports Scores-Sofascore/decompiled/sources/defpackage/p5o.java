package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcx;
import com.google.android.gms.measurement.internal.zzjq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p5o extends zzcx {
    public final zzjq a;

    public p5o(zzjq zzjqVar) {
        this.a = zzjqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void z2(long j, Bundle bundle, String str, String str2) {
        this.a.a(j, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final int zzf() {
        return System.identityHashCode(this.a);
    }
}
