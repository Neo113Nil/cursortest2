package defpackage;

import android.view.MotionEvent;
import com.blaze.blazesdk.ads.custom_native.a;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.PlaybackActionMethod;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsMoments;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazePlayerCustomActionButtonParams;
import defpackage.gim;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zkm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dlm b;

    public /* synthetic */ zkm(dlm dlmVar, int i) {
        this.a = i;
        this.b = dlmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        gim gimVar;
        int i = this.a;
        r2 = null;
        Map<String, ? extends Object> map = null;
        dlm dlmVar = this.b;
        switch (i) {
            case 0:
                ytm ytmVar = (ytm) obj;
                int i2 = dlm.o;
                ytmVar.getClass();
                syl sylVar = (syl) dlmVar.c;
                sylVar.getClass();
                try {
                    if (ytmVar instanceof MomentModel) {
                        ((sqm) sylVar.getViewModel()).a0((MomentModel) ytmVar);
                    }
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
                break;
            case 1:
                int i3 = dlm.o;
                ((MotionEvent) obj).getClass();
                if (dlmVar.h) {
                    sqm sqmVar = (sqm) ((syl) dlmVar.c).getViewModel();
                    b5m b5mVar = sqmVar.G;
                    a aVar = sqmVar.s0;
                    fqm fqmVar = (fqm) b5mVar.d();
                    boolean z2 = fqmVar != null ? fqmVar.a : false;
                    boolean z3 = !z2;
                    if (z2) {
                        z = z3;
                        n4m D = sqmVar.D();
                        gim gimVar2 = D != null ? D.b : null;
                        if (gimVar2 instanceof gim.b) {
                            gim.b bVar = (gim.b) gimVar2;
                            PlaybackActionMethod playbackActionMethod = PlaybackActionMethod.PRESS;
                            AnalyticsPropsMoments createMomentsPlayerProps$default = ysm.createMomentsPlayerProps$default(sqmVar, bVar, null, null, null, null, null, playbackActionMethod, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048510, null);
                            EventActionName eventActionName = EventActionName.PLAYBACK_PAUSE;
                            ysm.d(sqmVar, eventActionName, createMomentsPlayerProps$default);
                            if (bVar.a.n != null) {
                                ysm.c(sqmVar, eventActionName, ysm.a(sqmVar, bVar, playbackActionMethod));
                            }
                        } else if (gimVar2 instanceof gim.a) {
                            aVar.b();
                            ysm.b(sqmVar, EventActionName.AD_PLAYBACK_PAUSE, ysm.createMomentsPlayerAdProps$default(sqmVar, (gim.a) gimVar2, null, PlaybackActionMethod.PRESS, false, false, 26, null));
                        }
                    } else {
                        n4m D2 = sqmVar.D();
                        gim.a aVar2 = D2 != null ? D2.b : 0;
                        if (aVar2 instanceof gim.b) {
                            gim.b bVar2 = (gim.b) aVar2;
                            PlaybackActionMethod playbackActionMethod2 = PlaybackActionMethod.PRESS;
                            z = z3;
                            AnalyticsPropsMoments createMomentsPlayerProps$default2 = ysm.createMomentsPlayerProps$default(sqmVar, bVar2, null, null, null, null, null, playbackActionMethod2, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048510, null);
                            EventActionName eventActionName2 = EventActionName.PLAYBACK_PLAY;
                            ysm.d(sqmVar, eventActionName2, createMomentsPlayerProps$default2);
                            if (bVar2.a.n != null) {
                                ysm.c(sqmVar, eventActionName2, ysm.a(sqmVar, bVar2, playbackActionMethod2));
                            }
                        } else {
                            z = z3;
                            if (aVar2 instanceof gim.a) {
                                aVar.f();
                                ysm.b(sqmVar, EventActionName.AD_PLAYBACK_PLAY, ysm.createMomentsPlayerAdProps$default(sqmVar, aVar2, null, PlaybackActionMethod.PRESS, false, false, 26, null));
                            }
                        }
                    }
                    sqmVar.B(z);
                }
                break;
            default:
                BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams = (BlazePlayerCustomActionButtonParams) obj;
                int i4 = dlm.o;
                blazePlayerCustomActionButtonParams.getClass();
                syl sylVar2 = (syl) dlmVar.c;
                sylVar2.getClass();
                sqm sqmVar2 = (sqm) sylVar2.getViewModel();
                String name = blazePlayerCustomActionButtonParams.getName();
                sqmVar2.getClass();
                name.getClass();
                try {
                    n4m D3 = sqmVar2.D();
                    gim gimVar3 = D3 != null ? D3.b : null;
                    if (gimVar3 instanceof gim.b) {
                        ysm.d(sqmVar2, EventActionName.CUSTOM_ACTION_BUTTON_CLICK, ysm.createMomentsPlayerProps$default(sqmVar2, (gim.b) gimVar3, null, null, null, null, null, null, false, name, false, null, null, null, null, null, null, null, null, null, null, 1048318, null));
                    }
                } catch (Throwable th2) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                }
                n4m D4 = ((sqm) sylVar2.getViewModel()).D();
                if (D4 != null && (gimVar = D4.b) != null) {
                    map = yjm.mergedExtraInfo$default(gimVar, null, 1, null);
                }
                if (map != null) {
                    blazePlayerCustomActionButtonParams.enrichSDKMetadata$blazesdk_release(map);
                }
                sylVar2.k(blazePlayerCustomActionButtonParams, BlazePlayerType.MOMENTS);
                break;
        }
        return Unit.a;
    }
}
