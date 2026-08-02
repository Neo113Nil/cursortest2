package defpackage;

import com.google.android.gms.measurement.internal.zzmb;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vwo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzmb b;

    public vwo(zzmb zzmbVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(zzmbVar);
                this.b = zzmbVar;
                break;
            default:
                Objects.requireNonNull(zzmbVar);
                this.b = zzmbVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzmb zzmbVar = this.b;
        switch (i) {
            case 0:
                zzmbVar.f = zzmbVar.k;
                break;
            default:
                zzmbVar.k = null;
                break;
        }
    }
}
