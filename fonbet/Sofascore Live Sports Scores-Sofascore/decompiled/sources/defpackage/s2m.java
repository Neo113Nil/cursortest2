package defpackage;

import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.delegates.BlazeCastingDelegate;
import com.blaze.blazesdk.delegates.BlazeCastingState;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.players.models.c;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.gim;
import defpackage.w3m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class s2m implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3m b;

    public /* synthetic */ s2m(w3m w3mVar, int i) {
        this.a = i;
        this.b = w3mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        c cVar;
        switch (this.a) {
            case 0:
                s5m s5mVar = (s5m) obj;
                Long l = (Long) obj2;
                s5mVar.getClass();
                boolean z = s5mVar instanceof yul;
                w3m w3mVar = this.b;
                if (!z) {
                    if (!(s5mVar instanceof pql)) {
                        if (!(s5mVar instanceof wyl)) {
                            zzl.b();
                            break;
                        } else {
                            n4m D = w3mVar.D();
                            gim gimVar = D != null ? D.b : null;
                            if (gimVar instanceof gim.e) {
                                mzm.b(w3mVar, EventActionName.CASTING_ENDED, mzm.createVideosPlayerProps$default(w3mVar, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
                            }
                            if (l != null) {
                                c1m.basePrepareMediaFor$default(w3mVar, w3mVar.D(), false, true, false, Float.valueOf(l.longValue()), 10, null);
                            }
                            BlazeCastingDelegate delegate = BlazeSDK.INSTANCE.getCastingManager().getDelegate();
                            if (delegate != null) {
                                delegate.onCastingStateChanged(BlazePlayerType.VIDEOS, w3mVar.i != null ? w3mVar.C().equals("entry_points_broadcast_id") ? w3mVar.j : w3mVar.C() : w3mVar.j, BlazeCastingState.OFF);
                            }
                        }
                    } else {
                        n4m D2 = w3mVar.D();
                        gim gimVar2 = D2 != null ? D2.b : null;
                        if (gimVar2 instanceof gim.e) {
                            obj3 = "entry_points_broadcast_id";
                            mzm.b(w3mVar, EventActionName.CASTING_STARTED, mzm.createVideosPlayerProps$default(w3mVar, (gim.e) gimVar2, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
                        } else {
                            obj3 = "entry_points_broadcast_id";
                        }
                        n4m D3 = w3mVar.D();
                        if (D3 != null && (cVar = D3.q) != null) {
                            cVar.b = false;
                        }
                        w3mVar.v(false);
                        BlazeCastingDelegate delegate2 = BlazeSDK.INSTANCE.getCastingManager().getDelegate();
                        if (delegate2 != null) {
                            delegate2.onCastingStateChanged(BlazePlayerType.VIDEOS, w3mVar.i != null ? w3mVar.C().equals(obj3) ? w3mVar.j : w3mVar.C() : w3mVar.j, BlazeCastingState.ON);
                        }
                    }
                }
                w3mVar.h0(new w3m.a.b(false));
                fdi fdiVar = w3mVar.N0;
                fdiVar.getClass();
                fdiVar.m(null, s5mVar);
                break;
            default:
                int intValue = ((Integer) obj).intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                w3m w3mVar2 = this.b;
                w3mVar2.i0 = booleanValue;
                fam famVar = w3mVar2.e;
                if (famVar != null) {
                    famVar.pause();
                }
                drm drmVar = w3mVar2.P0;
                drmVar.getClass();
                drmVar.b = new dim(intValue, booleanValue);
                break;
        }
        return Unit.a;
    }
}
