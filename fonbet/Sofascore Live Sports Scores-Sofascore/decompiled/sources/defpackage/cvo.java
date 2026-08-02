package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cvo extends wvo {
    public cvo(Context context, Executor executor, lto ltoVar) {
        lvo lvoVar = lvo.c;
        svo svoVar = null;
        if (ltoVar.v() && GoogleApiAvailabilityLight.b.b(context, 12800000) == 0) {
            lvo lvoVar2 = lvo.c;
            lvoVar2.getClass();
            try {
                IBinder l2 = ((tvo) lvoVar2.b(context)).l2(new ObjectWrapper(context), new ObjectWrapper(executor), ltoVar.b());
                if (l2 != null) {
                    IInterface queryLocalInterface = l2.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    svoVar = queryLocalInterface instanceof svo ? (svo) queryLocalInterface : new ovo(l2, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                }
            } catch (RemoteException | RemoteCreator.RemoteCreatorException | IllegalArgumentException | LinkageError unused) {
            }
        }
        this.a = svoVar == null ? new jvo(context, executor, ltoVar) : svoVar;
    }
}
