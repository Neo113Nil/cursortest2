package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import androidx.activity.result.ActivityResult;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.ima.ImaHandler;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.B;
import com.ironsource.C;
import com.ironsource.C4040dc;
import com.ironsource.C4062eg;
import com.ironsource.C4231o6;
import com.ironsource.C4378wa;
import com.ironsource.E;
import com.ironsource.I;
import com.ironsource.InterfaceC4044dg;
import com.ironsource.J2;
import com.ironsource.L2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.config.component.info.provider.listener.a;
import com.sofascore.results.venue.VenueActivity;
import com.sofascore.results.weeklyChallenge.leaderboard.WeeklyLeaderboardFragment;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsFragment;
import com.vungle.ads.internal.platform.c;
import com.vungle.ads.internal.ui.l;
import com.vungle.ads.internal.ui.view.b;
import com.vungle.ads.internal.ui.view.n;
import defpackage.gim;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bnk implements dpi, OnCompleteListener, xd, lqi, a, OnSuccessListener, op8, E, InterfaceC4044dg, kpd, b, rk, L2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bnk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        return l.a((l) this.b, view, x9lVar);
    }

    @Override // com.ironsource.E
    public B a(C c, I i) {
        B a;
        B b;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 11:
                a = C4040dc.a((C4040dc) obj, c, i);
                return a;
            default:
                b = C4231o6.b((C4231o6) obj, c, i);
                return b;
        }
    }

    @Override // defpackage.op8
    public void b(Bundle bundle, String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 10:
                syl sylVar = (syl) obj;
                int i2 = syl.C;
                if (bundle.getBoolean("selectedLanguageEvent", false)) {
                    sqm sqmVar = (sqm) sylVar.getViewModel();
                    sqmVar.getClass();
                    try {
                        sqmVar.I.getClass();
                        if (pc2.b == null) {
                            n4m D = sqmVar.D();
                            gim gimVar = D != null ? D.b : null;
                            if (gimVar instanceof gim.b) {
                                ysm.d(sqmVar, EventActionName.CC_OFF, ysm.createMomentsPlayerProps$default(sqmVar, (gim.b) gimVar, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null));
                                break;
                            }
                        } else {
                            n4m D2 = sqmVar.D();
                            gim gimVar2 = D2 != null ? D2.b : null;
                            if (gimVar2 instanceof gim.b) {
                                ysm.d(sqmVar, EventActionName.CC_ON, ysm.createMomentsPlayerProps$default(sqmVar, (gim.b) gimVar2, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null));
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        return;
                    }
                }
                break;
            default:
                obm obmVar = (obm) obj;
                int i3 = obm.D;
                if (bundle.getBoolean("selectedLanguageEvent", false)) {
                    ilm ilmVar = (ilm) obmVar.getViewModel();
                    ilmVar.getClass();
                    try {
                        ilmVar.I.getClass();
                        if (pc2.b != null) {
                            n4m D3 = ilmVar.D();
                            gim gimVar3 = D3 != null ? D3.b : null;
                            if (gimVar3 instanceof gim.d) {
                                jom.e(ilmVar, EventActionName.CC_ON, jom.createStoryPlayerProps$default(ilmVar, (gim.d) gimVar3, null, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, null));
                            }
                        } else {
                            n4m D4 = ilmVar.D();
                            gim gimVar4 = D4 != null ? D4.b : null;
                            if (gimVar4 instanceof gim.d) {
                                jom.e(ilmVar, EventActionName.CC_OFF, jom.createStoryPlayerProps$default(ilmVar, (gim.d) gimVar4, null, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, null));
                            }
                        }
                    } catch (Throwable th2) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                    }
                }
                if (bundle.getBoolean("dismissEvent", false)) {
                    ((ilm) obmVar.getViewModel()).k(a1n.a, false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.rk
    public hr9 c() {
        hr9 hr9Var;
        hr9Var = ((ImaHandler) this.b).imaAdsLoader;
        return hr9Var;
    }

    public void d(Display display) {
        ypk ypkVar = (ypk) this.b;
        ypkVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            ypkVar.k = refreshRate;
            ypkVar.l = (refreshRate * 80) / 100;
        } else {
            m6k.f0();
            ypkVar.k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            ypkVar.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
    }

    @Override // defpackage.dpi
    public void g() {
        VenueActivity venueActivity = (VenueActivity) this.b;
        int i = VenueActivity.Q;
        venueActivity.N();
    }

    @Override // defpackage.xd
    public void onActivityResult(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 3:
                WeeklyLeaderboardFragment weeklyLeaderboardFragment = (WeeklyLeaderboardFragment) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                if (activityResult.a == -1) {
                    weeklyLeaderboardFragment.u();
                    break;
                }
                break;
            case 4:
                WeeklyPredictionsFragment weeklyPredictionsFragment = (WeeklyPredictionsFragment) obj2;
                ActivityResult activityResult2 = (ActivityResult) obj;
                activityResult2.getClass();
                if (activityResult2.a == -1) {
                    weeklyPredictionsFragment.u();
                    break;
                }
                break;
            default:
                Function1 function1 = ((ful) obj2).j;
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                t62.A((Intent) obj);
                break;
            default:
                ((gbl) obj).b.trySetResult(null);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        c.a((c) this.b, (AppSetIdInfo) obj);
    }

    @Override // defpackage.lqi
    public Object v() {
        ujg ujgVar = (ujg) this.b;
        Iterator it = ((Iterable) ((mlg) ujgVar.c).j(new ilg(0))).iterator();
        while (it.hasNext()) {
            ((sx2) ujgVar.d).J((jv0) it.next(), 1, false);
        }
        return null;
    }

    @Override // com.ironsource.L2
    public J2 a(boolean z) {
        J2 a;
        a = C4378wa.a((C4378wa) this.b, z);
        return a;
    }

    @Override // com.vungle.ads.internal.ui.view.b
    public void a(float f, float f2) {
        n.a((n) this.b, f, f2);
    }

    @Override // com.mbridge.msdk.config.component.info.provider.listener.a
    public void a(Map map) {
        ((com.mbridge.msdk.config.component.info.provider.a) this.b).b(map);
    }

    @Override // com.ironsource.InterfaceC4044dg
    public void a(Function0 function0) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 12:
                C4062eg.a((com.ironsource.environment.thread.b) obj, function0);
                break;
            default:
                C4062eg.a((Handler) obj, function0);
                break;
        }
    }
}
