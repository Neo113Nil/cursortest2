package defpackage;

import com.blaze.blazesdk.interactions.models.local.InteractionStatus;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class crm implements Callable {
    public final /* synthetic */ InteractionStatus a;
    public final /* synthetic */ lsm b;

    public crm(lsm lsmVar, InteractionStatus interactionStatus) {
        this.b = lsmVar;
        this.a = interactionStatus;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        lsm lsmVar = this.b;
        lsmVar.a.beginTransaction();
        try {
            long z = lsmVar.b.z(this.a);
            lsmVar.a.setTransactionSuccessful();
            return Long.valueOf(z);
        } finally {
            lsmVar.a.endTransaction();
        }
    }
}
