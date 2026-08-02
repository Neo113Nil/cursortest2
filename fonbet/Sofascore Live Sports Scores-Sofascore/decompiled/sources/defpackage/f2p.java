package defpackage;

import com.google.android.gms.internal.measurement.zzrn;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ddb b;

    public /* synthetic */ f2p(int i, ddb ddbVar) {
        this.a = i;
        this.b = ddbVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        ddb ddbVar = this.b;
        switch (i) {
            case 0:
                try {
                    hkg.P(ddbVar);
                    break;
                } catch (ExecutionException e) {
                    zzrn.a().post(new dno(e, 14));
                    return;
                }
            default:
                try {
                    hkg.P(ddbVar);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
