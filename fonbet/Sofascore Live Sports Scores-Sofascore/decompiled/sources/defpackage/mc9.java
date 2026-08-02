package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mc9 extends d71 {
    public int g;

    @Override // defpackage.nh6
    public final int getSelectedIndex() {
        return this.g;
    }

    @Override // defpackage.nh6
    public final Object getSelectionData() {
        return null;
    }

    @Override // defpackage.nh6
    public final int getSelectionReason() {
        return 0;
    }

    @Override // defpackage.nh6
    public final void h(long j, long j2, long j3, List list, k2c[] k2cVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(this.g, elapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!d(i, elapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            zzl.s();
        }
    }
}
