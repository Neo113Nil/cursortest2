package defpackage;

import android.content.Context;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.ErrorDomain;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zfm extends hoi implements Function2 {
    public zfm(rq3 rq3Var) {
        super(2, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new zfm(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zfm((rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        xw3.L(pgm.c, null, null, new gdm(null), 3);
        BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
        Context currActivityOrApplicationContext$blazesdk_release = blazeSDK.getCurrActivityOrApplicationContext$blazesdk_release();
        if (currActivityOrApplicationContext$blazesdk_release != null) {
            gzk.handleUnhandledEvents$blazesdk_release$default(gzk.a, "entry_points_broadcast_id", blazeSDK.getPlayerEntryPointDelegate$blazesdk_release(), ErrorDomain.ENTRY_POINT, currActivityOrApplicationContext$blazesdk_release, null, 16, null);
        }
        blazeSDK.registerBroadcastReceiver$blazesdk_release();
        return Unit.a;
    }
}
