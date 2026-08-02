package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.zzgj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ydo extends zzgj {
    @Override // com.google.android.gms.internal.cast.zzgj, com.google.android.gms.internal.cast.zzgf
    public final void m2(Status status) {
        if (status.Y0()) {
            return;
        }
        "disconnect(): Could not unregister listener: status=".concat(String.valueOf(status));
    }
}
