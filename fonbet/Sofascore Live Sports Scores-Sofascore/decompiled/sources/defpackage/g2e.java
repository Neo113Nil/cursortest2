package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class g2e implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e1d b;
    public final /* synthetic */ Context c;

    public /* synthetic */ g2e(e1d e1dVar, Context context) {
        this.b = e1dVar;
        this.c = context;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Context context = this.c;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                uni.a(bkh.d(utc.a, 1.0f), null, lz.D(R.color.surface_1, of3Var), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(-352415171, of3Var, new h2e(0, e1dVar, context)), of3Var, 12582918, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                break;
            default:
                of3 of3Var2 = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var = (av8) of3Var2;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    fz8.e(((Boolean) e1dVar.getValue()).booleanValue(), null, null, null, null, yqo.H(-1018908126, av8Var, new g2e(context, e1dVar)), av8Var, 196608, 30);
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ g2e(Context context, e1d e1dVar) {
        this.c = context;
        this.b = e1dVar;
    }
}
