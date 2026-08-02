package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tjm implements rq4 {
    public static yda b;
    public static yda c;
    public static final tjm a = new tjm();
    public static final aeh d = beh.b(0, 0, null, 7);

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        b = evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new bim(null), 1, null);
    }

    @Override // defpackage.rq4
    public final void g(u6b u6bVar) {
        yda ydaVar = b;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        b = null;
        BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
        evl.dispatchOnIO$default(blazeSDK, null, new ocm(null), 1, null);
        Iterator it = pgm.b.iterator();
        while (it.hasNext()) {
            yda ydaVar2 = ((s1m) it.next()).d;
            if (ydaVar2 != null) {
                ydaVar2.e(null);
            }
        }
        pgm.b.clear();
        blazeSDK.unregisterBroadcastReceiver$blazesdk_release();
        yda ydaVar3 = bmm.a;
        if (ydaVar3 != null) {
            ydaVar3.e(null);
        }
        bmm.a = null;
        yda ydaVar4 = bmm.b;
        if (ydaVar4 != null) {
            ydaVar4.e(null);
        }
        bmm.b = null;
        yda ydaVar5 = bmm.c;
        if (ydaVar5 != null) {
            ydaVar5.e(null);
        }
        bmm.c = null;
    }

    @Override // defpackage.rq4
    public final void i(u6b u6bVar) {
        u6bVar.getClass();
        c = evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new z9m(null), 1, null);
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        yda ydaVar = c;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
    }
}
