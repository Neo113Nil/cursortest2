package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.analytics.enums.SeekDirection;
import com.blaze.blazesdk.analytics.enums.SeekType;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.players.models.P;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.SessionManager;
import com.ironsource.Ua;
import com.unity3d.services.UnityAdsConstants;
import defpackage.w3m;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class b0n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0n b;

    public /* synthetic */ b0n(e0n e0nVar, int i) {
        this.a = i;
        this.b = e0nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tcm a;
        int i = this.a;
        e0n e0nVar = this.b;
        switch (i) {
            case 0:
                boolean z = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                a aVar = (a) e0nVar.c;
                aVar.getClass();
                try {
                    w3m w3mVar = (w3m) aVar.getViewModel();
                    w3mVar.R();
                    w3mVar.h0(new w3m.a.b(true));
                    B b = w3mVar.p0;
                    if (b != null) {
                        H h = H.USER_SKIP_PREVIOUS;
                        h.getClass();
                        b.c = h;
                    }
                    ViewPager2 viewPager2 = aVar.q.e;
                    viewPager2.c(viewPager2.getCurrentItem() - 1, false);
                    break;
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                    return;
                }
            case 1:
                boolean z2 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                a aVar2 = (a) e0nVar.c;
                aVar2.getClass();
                try {
                    w3m w3mVar2 = (w3m) aVar2.getViewModel();
                    w3mVar2.getClass();
                    w3mVar2.h0(new w3m.a.b(true));
                    B b2 = w3mVar2.p0;
                    if (b2 != null) {
                        b2.d = P.BUTTON;
                    }
                    Function0 function0 = aVar2.x;
                    if (function0 != null) {
                        function0.invoke();
                        break;
                    }
                } catch (Throwable th2) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                    return;
                }
                break;
            case 2:
                boolean z3 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 14, null);
                w3m w3mVar3 = (w3m) ((a) e0nVar.c).getViewModel();
                ((vyd) w3mVar3.w0.getValue()).b(SeekType.SEEK_BUTTON, SeekDirection.BACKWARD, Ua.s, w3mVar3.G());
                w3mVar3.y(Ua.s);
                break;
            case 3:
                boolean z4 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                fam famVar = ((w3m) ((a) e0nVar.c).getViewModel()).e;
                if (famVar != null && (a = famVar.a()) != null) {
                    com.blaze.blazesdk.players.a aVar3 = (com.blaze.blazesdk.players.a) a;
                    aVar3.r();
                    CastContext castContext = aVar3.g;
                    if (castContext != null) {
                        uwl uwlVar = new uwl(aVar3);
                        aVar3.h = uwlVar;
                        SessionManager b3 = castContext.b();
                        if (b3 != null) {
                            b3.a(uwlVar);
                            break;
                        }
                    }
                }
                break;
            case 4:
                boolean z5 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                a aVar4 = (a) e0nVar.c;
                aVar4.getClass();
                try {
                    w3m w3mVar4 = (w3m) aVar4.getViewModel();
                    w3mVar4.R();
                    w3mVar4.h0(new w3m.a.b(true));
                    B b4 = w3mVar4.p0;
                    if (b4 != null) {
                        H h2 = H.USER_SKIP_NEXT;
                        h2.getClass();
                        b4.c = h2;
                    }
                    ViewPager2 viewPager22 = aVar4.q.e;
                    viewPager22.c(viewPager22.getCurrentItem() + 1, false);
                    break;
                } catch (Throwable th3) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
                    return;
                }
            case 5:
                boolean z6 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                a aVar5 = (a) e0nVar.c;
                aVar5.getClass();
                try {
                    w3m w3mVar5 = (w3m) aVar5.getViewModel();
                    w3mVar5.getClass();
                    w3mVar5.h0(new w3m.a.b(true));
                    break;
                } catch (Throwable th4) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th4, null);
                    return;
                }
            case 6:
                boolean z7 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                Function0 function02 = ((a) e0nVar.c).y;
                if (function02 != null) {
                    function02.invoke();
                    break;
                }
                break;
            case 7:
                boolean z8 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                ((a) e0nVar.c).L();
                break;
            case 8:
                boolean z9 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                a aVar6 = (a) e0nVar.c;
                aVar6.getClass();
                try {
                    aVar6.M();
                    break;
                } catch (Throwable th5) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th5, null);
                    return;
                }
            case 9:
                boolean z10 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                ((a) e0nVar.c).G(!e0n.n);
                break;
            case 10:
                boolean z11 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 14, null);
                w3m w3mVar6 = (w3m) ((a) e0nVar.c).getViewModel();
                ((vyd) w3mVar6.w0.getValue()).b(SeekType.SEEK_BUTTON, SeekDirection.FORWARD, Ua.s, w3mVar6.G());
                w3mVar6.A(Ua.s);
                break;
            case 11:
                boolean z12 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                ((a) e0nVar.c).G(!e0n.n);
                break;
            case 12:
                boolean z13 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                a aVar7 = (a) e0nVar.c;
                aVar7.getClass();
                try {
                    ((w3m) aVar7.getViewModel()).U();
                    break;
                } catch (Throwable th6) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th6, null);
                    return;
                }
            case 13:
                boolean z14 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                a aVar8 = (a) e0nVar.c;
                aVar8.getClass();
                try {
                    aVar8.u();
                    aVar8.j(H.CLOSE_BUTTON);
                    break;
                } catch (Throwable th7) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th7, null);
                    return;
                }
            case 14:
                boolean z15 = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                ((a) e0nVar.c).L();
                break;
            default:
                csl cslVar = e0nVar.c;
                boolean z16 = e0nVar.g;
                boolean z17 = !z16;
                a aVar9 = (a) cslVar;
                aVar9.getClass();
                try {
                    w3m w3mVar7 = (w3m) aVar9.getViewModel();
                    w3mVar7.getClass();
                    w3mVar7.h0(new w3m.a.b(true));
                    yda ydaVar = w3mVar7.M0;
                    if (ydaVar != null) {
                        ydaVar.e(null);
                    }
                    w3mVar7.B = false;
                    try {
                        if (z16) {
                            mzm.f(w3mVar7);
                        } else {
                            mzm.g(w3mVar7);
                        }
                        w3mVar7.R();
                        w3mVar7.B(z17);
                        break;
                    } catch (Throwable th8) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th8, null);
                        return;
                    }
                } catch (Throwable th9) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th9, null);
                }
        }
    }
}
