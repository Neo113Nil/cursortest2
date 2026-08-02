package defpackage;

import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionTransferCallback;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzce;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class brn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzce b;

    public /* synthetic */ brn(zzce zzceVar, int i) {
        this.a = i;
        this.b = zzceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzce zzceVar = this.b;
        switch (i) {
            case 0:
                zzceVar.getClass();
                jqn jqnVar = new jqn(zzceVar);
                SessionManager sessionManager = zzceVar.g;
                Preconditions.i(sessionManager);
                sessionManager.a(jqnVar);
                break;
            default:
                Logger logger = zzce.i;
                logger.c("transfer with type = %d has timed out", Integer.valueOf(zzceVar.e));
                logger.a("notify failed transfer with type = %d, reason = %d", Integer.valueOf(zzceVar.e), 101);
                Iterator it = new HashSet(zzceVar.b).iterator();
                while (it.hasNext()) {
                    ((SessionTransferCallback) it.next()).a(zzceVar.e, 101);
                }
                zzceVar.a();
                break;
        }
    }
}
