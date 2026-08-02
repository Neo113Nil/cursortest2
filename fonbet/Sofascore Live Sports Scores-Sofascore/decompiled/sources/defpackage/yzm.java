package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.custom_views.BlazeDefaultTimeBar;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.features.videos.models.ui.a;
import com.blaze.blazesdk.features.videos.models.ui.h;
import com.blaze.blazesdk.players.ui.StatusIndicatorView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.BlazePlayerButtonCustomImageStates;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.n4m;
import defpackage.w3m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class yzm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0n b;

    public /* synthetic */ yzm(e0n e0nVar, int i) {
        this.a = i;
        this.b = e0nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BlazeVideosPlayerButtonsStyle buttons;
        BlazeVideosPlayerButtonStyle playPause;
        int i = this.a;
        final int i2 = 5;
        final int i3 = 7;
        BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates = null;
        final int i4 = 0;
        final int i5 = 1;
        final e0n e0nVar = this.b;
        switch (i) {
            case 0:
                uxm uxmVar = (uxm) obj;
                boolean z = e0n.n;
                uxmVar.getClass();
                a aVar = e0nVar.h;
                int i6 = (aVar == null || !h.c(aVar)) ? 0 : 120;
                ConstraintLayout constraintLayout = uxmVar.a;
                constraintLayout.getClass();
                final int i7 = 2;
                final int i8 = 3;
                final int i9 = 4;
                final int i10 = 6;
                evl.setTouchGestureListenerWithStartAndEnd$default(constraintLayout, 0, i6, 0, 0.4f, 0.4f, true, new Function0() { // from class: c0n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = i4;
                        int i12 = 0;
                        int i13 = 1;
                        e0n e0nVar2 = e0nVar;
                        switch (i11) {
                            case 0:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar2 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar2.getClass();
                                try {
                                    w3m w3mVar = (w3m) aVar2.getViewModel();
                                    w3mVar.getClass();
                                    w3mVar.d0(System.currentTimeMillis(), w3mVar.u0, new n2m(w3mVar, 0), new o2m(w3mVar, i12), new ypm(w3mVar));
                                } catch (Throwable th) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                }
                                break;
                            case 1:
                                w3m w3mVar2 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                yda ydaVar = w3mVar2.M0;
                                if (ydaVar != null) {
                                    ydaVar.e(null);
                                }
                                yda ydaVar2 = w3mVar2.K0;
                                if (ydaVar2 != null) {
                                    ydaVar2.e(null);
                                }
                                w3mVar2.u0 = 0L;
                                w3mVar2.v0 = 0L;
                                w3mVar2.h0(((wpm) w3mVar2.H0.getValue()).a ? new w3m.a.C1357a(false) : new w3m.a.b(true));
                                break;
                            case 2:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar3 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar3.getClass();
                                try {
                                    w3m w3mVar3 = (w3m) aVar3.getViewModel();
                                    w3mVar3.getClass();
                                    w3mVar3.d0(System.currentTimeMillis(), w3mVar3.v0, new n2m(w3mVar3, 1), new o2m(w3mVar3, i13), new pom(w3mVar3));
                                } catch (Throwable th2) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                                }
                                break;
                            case 3:
                                if (e0nVar2.f && e0nVar2.g) {
                                    ImageView imageView = e0nVar2.b.n;
                                    imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    imageView.setVisibility(0);
                                    imageView.animate().alpha(1.0f).setDuration(200L).start();
                                    w3m w3mVar4 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                    if (!w3mVar4.K()) {
                                        fqm fqmVar = (fqm) w3mVar4.G.d();
                                        if ((fqmVar != null ? fqmVar.a : false) && !w3mVar4.x0) {
                                            w3mVar4.x0 = true;
                                            w3mVar4.y0 = w3mVar4.G();
                                            w3mVar4.z0 = 2.0f;
                                            fam famVar = w3mVar4.e;
                                            if (famVar != null) {
                                                famVar.a(2.0f);
                                            }
                                            w3mVar4.h0(new w3m.a.C1357a(false));
                                        }
                                    }
                                }
                                break;
                            case 4:
                                if (e0nVar2.f) {
                                    ImageView imageView2 = e0nVar2.b.n;
                                    imageView2.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withEndAction(new ykm(imageView2, 1)).start();
                                    ((w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel()).V();
                                }
                                break;
                            case 5:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(qgm.a);
                                break;
                            case 6:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(vam.a);
                                break;
                            default:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(g8m.a);
                                break;
                        }
                        return Unit.a;
                    }
                }, new Function0() { // from class: c0n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = i5;
                        int i12 = 0;
                        int i13 = 1;
                        e0n e0nVar2 = e0nVar;
                        switch (i11) {
                            case 0:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar2 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar2.getClass();
                                try {
                                    w3m w3mVar = (w3m) aVar2.getViewModel();
                                    w3mVar.getClass();
                                    w3mVar.d0(System.currentTimeMillis(), w3mVar.u0, new n2m(w3mVar, 0), new o2m(w3mVar, i12), new ypm(w3mVar));
                                } catch (Throwable th) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                }
                                break;
                            case 1:
                                w3m w3mVar2 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                yda ydaVar = w3mVar2.M0;
                                if (ydaVar != null) {
                                    ydaVar.e(null);
                                }
                                yda ydaVar2 = w3mVar2.K0;
                                if (ydaVar2 != null) {
                                    ydaVar2.e(null);
                                }
                                w3mVar2.u0 = 0L;
                                w3mVar2.v0 = 0L;
                                w3mVar2.h0(((wpm) w3mVar2.H0.getValue()).a ? new w3m.a.C1357a(false) : new w3m.a.b(true));
                                break;
                            case 2:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar3 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar3.getClass();
                                try {
                                    w3m w3mVar3 = (w3m) aVar3.getViewModel();
                                    w3mVar3.getClass();
                                    w3mVar3.d0(System.currentTimeMillis(), w3mVar3.v0, new n2m(w3mVar3, 1), new o2m(w3mVar3, i13), new pom(w3mVar3));
                                } catch (Throwable th2) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                                }
                                break;
                            case 3:
                                if (e0nVar2.f && e0nVar2.g) {
                                    ImageView imageView = e0nVar2.b.n;
                                    imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    imageView.setVisibility(0);
                                    imageView.animate().alpha(1.0f).setDuration(200L).start();
                                    w3m w3mVar4 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                    if (!w3mVar4.K()) {
                                        fqm fqmVar = (fqm) w3mVar4.G.d();
                                        if ((fqmVar != null ? fqmVar.a : false) && !w3mVar4.x0) {
                                            w3mVar4.x0 = true;
                                            w3mVar4.y0 = w3mVar4.G();
                                            w3mVar4.z0 = 2.0f;
                                            fam famVar = w3mVar4.e;
                                            if (famVar != null) {
                                                famVar.a(2.0f);
                                            }
                                            w3mVar4.h0(new w3m.a.C1357a(false));
                                        }
                                    }
                                }
                                break;
                            case 4:
                                if (e0nVar2.f) {
                                    ImageView imageView2 = e0nVar2.b.n;
                                    imageView2.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withEndAction(new ykm(imageView2, 1)).start();
                                    ((w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel()).V();
                                }
                                break;
                            case 5:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(qgm.a);
                                break;
                            case 6:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(vam.a);
                                break;
                            default:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(g8m.a);
                                break;
                        }
                        return Unit.a;
                    }
                }, new Function0() { // from class: c0n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = i7;
                        int i12 = 0;
                        int i13 = 1;
                        e0n e0nVar2 = e0nVar;
                        switch (i11) {
                            case 0:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar2 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar2.getClass();
                                try {
                                    w3m w3mVar = (w3m) aVar2.getViewModel();
                                    w3mVar.getClass();
                                    w3mVar.d0(System.currentTimeMillis(), w3mVar.u0, new n2m(w3mVar, 0), new o2m(w3mVar, i12), new ypm(w3mVar));
                                } catch (Throwable th) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                }
                                break;
                            case 1:
                                w3m w3mVar2 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                yda ydaVar = w3mVar2.M0;
                                if (ydaVar != null) {
                                    ydaVar.e(null);
                                }
                                yda ydaVar2 = w3mVar2.K0;
                                if (ydaVar2 != null) {
                                    ydaVar2.e(null);
                                }
                                w3mVar2.u0 = 0L;
                                w3mVar2.v0 = 0L;
                                w3mVar2.h0(((wpm) w3mVar2.H0.getValue()).a ? new w3m.a.C1357a(false) : new w3m.a.b(true));
                                break;
                            case 2:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar3 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar3.getClass();
                                try {
                                    w3m w3mVar3 = (w3m) aVar3.getViewModel();
                                    w3mVar3.getClass();
                                    w3mVar3.d0(System.currentTimeMillis(), w3mVar3.v0, new n2m(w3mVar3, 1), new o2m(w3mVar3, i13), new pom(w3mVar3));
                                } catch (Throwable th2) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                                }
                                break;
                            case 3:
                                if (e0nVar2.f && e0nVar2.g) {
                                    ImageView imageView = e0nVar2.b.n;
                                    imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    imageView.setVisibility(0);
                                    imageView.animate().alpha(1.0f).setDuration(200L).start();
                                    w3m w3mVar4 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                    if (!w3mVar4.K()) {
                                        fqm fqmVar = (fqm) w3mVar4.G.d();
                                        if ((fqmVar != null ? fqmVar.a : false) && !w3mVar4.x0) {
                                            w3mVar4.x0 = true;
                                            w3mVar4.y0 = w3mVar4.G();
                                            w3mVar4.z0 = 2.0f;
                                            fam famVar = w3mVar4.e;
                                            if (famVar != null) {
                                                famVar.a(2.0f);
                                            }
                                            w3mVar4.h0(new w3m.a.C1357a(false));
                                        }
                                    }
                                }
                                break;
                            case 4:
                                if (e0nVar2.f) {
                                    ImageView imageView2 = e0nVar2.b.n;
                                    imageView2.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withEndAction(new ykm(imageView2, 1)).start();
                                    ((w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel()).V();
                                }
                                break;
                            case 5:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(qgm.a);
                                break;
                            case 6:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(vam.a);
                                break;
                            default:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(g8m.a);
                                break;
                        }
                        return Unit.a;
                    }
                }, new Function0() { // from class: c0n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = i8;
                        int i12 = 0;
                        int i13 = 1;
                        e0n e0nVar2 = e0nVar;
                        switch (i11) {
                            case 0:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar2 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar2.getClass();
                                try {
                                    w3m w3mVar = (w3m) aVar2.getViewModel();
                                    w3mVar.getClass();
                                    w3mVar.d0(System.currentTimeMillis(), w3mVar.u0, new n2m(w3mVar, 0), new o2m(w3mVar, i12), new ypm(w3mVar));
                                } catch (Throwable th) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                }
                                break;
                            case 1:
                                w3m w3mVar2 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                yda ydaVar = w3mVar2.M0;
                                if (ydaVar != null) {
                                    ydaVar.e(null);
                                }
                                yda ydaVar2 = w3mVar2.K0;
                                if (ydaVar2 != null) {
                                    ydaVar2.e(null);
                                }
                                w3mVar2.u0 = 0L;
                                w3mVar2.v0 = 0L;
                                w3mVar2.h0(((wpm) w3mVar2.H0.getValue()).a ? new w3m.a.C1357a(false) : new w3m.a.b(true));
                                break;
                            case 2:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar3 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar3.getClass();
                                try {
                                    w3m w3mVar3 = (w3m) aVar3.getViewModel();
                                    w3mVar3.getClass();
                                    w3mVar3.d0(System.currentTimeMillis(), w3mVar3.v0, new n2m(w3mVar3, 1), new o2m(w3mVar3, i13), new pom(w3mVar3));
                                } catch (Throwable th2) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                                }
                                break;
                            case 3:
                                if (e0nVar2.f && e0nVar2.g) {
                                    ImageView imageView = e0nVar2.b.n;
                                    imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    imageView.setVisibility(0);
                                    imageView.animate().alpha(1.0f).setDuration(200L).start();
                                    w3m w3mVar4 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                    if (!w3mVar4.K()) {
                                        fqm fqmVar = (fqm) w3mVar4.G.d();
                                        if ((fqmVar != null ? fqmVar.a : false) && !w3mVar4.x0) {
                                            w3mVar4.x0 = true;
                                            w3mVar4.y0 = w3mVar4.G();
                                            w3mVar4.z0 = 2.0f;
                                            fam famVar = w3mVar4.e;
                                            if (famVar != null) {
                                                famVar.a(2.0f);
                                            }
                                            w3mVar4.h0(new w3m.a.C1357a(false));
                                        }
                                    }
                                }
                                break;
                            case 4:
                                if (e0nVar2.f) {
                                    ImageView imageView2 = e0nVar2.b.n;
                                    imageView2.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withEndAction(new ykm(imageView2, 1)).start();
                                    ((w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel()).V();
                                }
                                break;
                            case 5:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(qgm.a);
                                break;
                            case 6:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(vam.a);
                                break;
                            default:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(g8m.a);
                                break;
                        }
                        return Unit.a;
                    }
                }, new Function0() { // from class: c0n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = i9;
                        int i12 = 0;
                        int i13 = 1;
                        e0n e0nVar2 = e0nVar;
                        switch (i11) {
                            case 0:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar2 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar2.getClass();
                                try {
                                    w3m w3mVar = (w3m) aVar2.getViewModel();
                                    w3mVar.getClass();
                                    w3mVar.d0(System.currentTimeMillis(), w3mVar.u0, new n2m(w3mVar, 0), new o2m(w3mVar, i12), new ypm(w3mVar));
                                } catch (Throwable th) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                }
                                break;
                            case 1:
                                w3m w3mVar2 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                yda ydaVar = w3mVar2.M0;
                                if (ydaVar != null) {
                                    ydaVar.e(null);
                                }
                                yda ydaVar2 = w3mVar2.K0;
                                if (ydaVar2 != null) {
                                    ydaVar2.e(null);
                                }
                                w3mVar2.u0 = 0L;
                                w3mVar2.v0 = 0L;
                                w3mVar2.h0(((wpm) w3mVar2.H0.getValue()).a ? new w3m.a.C1357a(false) : new w3m.a.b(true));
                                break;
                            case 2:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar3 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar3.getClass();
                                try {
                                    w3m w3mVar3 = (w3m) aVar3.getViewModel();
                                    w3mVar3.getClass();
                                    w3mVar3.d0(System.currentTimeMillis(), w3mVar3.v0, new n2m(w3mVar3, 1), new o2m(w3mVar3, i13), new pom(w3mVar3));
                                } catch (Throwable th2) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                                }
                                break;
                            case 3:
                                if (e0nVar2.f && e0nVar2.g) {
                                    ImageView imageView = e0nVar2.b.n;
                                    imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    imageView.setVisibility(0);
                                    imageView.animate().alpha(1.0f).setDuration(200L).start();
                                    w3m w3mVar4 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                    if (!w3mVar4.K()) {
                                        fqm fqmVar = (fqm) w3mVar4.G.d();
                                        if ((fqmVar != null ? fqmVar.a : false) && !w3mVar4.x0) {
                                            w3mVar4.x0 = true;
                                            w3mVar4.y0 = w3mVar4.G();
                                            w3mVar4.z0 = 2.0f;
                                            fam famVar = w3mVar4.e;
                                            if (famVar != null) {
                                                famVar.a(2.0f);
                                            }
                                            w3mVar4.h0(new w3m.a.C1357a(false));
                                        }
                                    }
                                }
                                break;
                            case 4:
                                if (e0nVar2.f) {
                                    ImageView imageView2 = e0nVar2.b.n;
                                    imageView2.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withEndAction(new ykm(imageView2, 1)).start();
                                    ((w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel()).V();
                                }
                                break;
                            case 5:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(qgm.a);
                                break;
                            case 6:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(vam.a);
                                break;
                            default:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(g8m.a);
                                break;
                        }
                        return Unit.a;
                    }
                }, null, new Function0() { // from class: c0n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = i2;
                        int i12 = 0;
                        int i13 = 1;
                        e0n e0nVar2 = e0nVar;
                        switch (i11) {
                            case 0:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar2 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar2.getClass();
                                try {
                                    w3m w3mVar = (w3m) aVar2.getViewModel();
                                    w3mVar.getClass();
                                    w3mVar.d0(System.currentTimeMillis(), w3mVar.u0, new n2m(w3mVar, 0), new o2m(w3mVar, i12), new ypm(w3mVar));
                                } catch (Throwable th) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                }
                                break;
                            case 1:
                                w3m w3mVar2 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                yda ydaVar = w3mVar2.M0;
                                if (ydaVar != null) {
                                    ydaVar.e(null);
                                }
                                yda ydaVar2 = w3mVar2.K0;
                                if (ydaVar2 != null) {
                                    ydaVar2.e(null);
                                }
                                w3mVar2.u0 = 0L;
                                w3mVar2.v0 = 0L;
                                w3mVar2.h0(((wpm) w3mVar2.H0.getValue()).a ? new w3m.a.C1357a(false) : new w3m.a.b(true));
                                break;
                            case 2:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar3 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar3.getClass();
                                try {
                                    w3m w3mVar3 = (w3m) aVar3.getViewModel();
                                    w3mVar3.getClass();
                                    w3mVar3.d0(System.currentTimeMillis(), w3mVar3.v0, new n2m(w3mVar3, 1), new o2m(w3mVar3, i13), new pom(w3mVar3));
                                } catch (Throwable th2) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                                }
                                break;
                            case 3:
                                if (e0nVar2.f && e0nVar2.g) {
                                    ImageView imageView = e0nVar2.b.n;
                                    imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    imageView.setVisibility(0);
                                    imageView.animate().alpha(1.0f).setDuration(200L).start();
                                    w3m w3mVar4 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                    if (!w3mVar4.K()) {
                                        fqm fqmVar = (fqm) w3mVar4.G.d();
                                        if ((fqmVar != null ? fqmVar.a : false) && !w3mVar4.x0) {
                                            w3mVar4.x0 = true;
                                            w3mVar4.y0 = w3mVar4.G();
                                            w3mVar4.z0 = 2.0f;
                                            fam famVar = w3mVar4.e;
                                            if (famVar != null) {
                                                famVar.a(2.0f);
                                            }
                                            w3mVar4.h0(new w3m.a.C1357a(false));
                                        }
                                    }
                                }
                                break;
                            case 4:
                                if (e0nVar2.f) {
                                    ImageView imageView2 = e0nVar2.b.n;
                                    imageView2.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withEndAction(new ykm(imageView2, 1)).start();
                                    ((w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel()).V();
                                }
                                break;
                            case 5:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(qgm.a);
                                break;
                            case 6:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(vam.a);
                                break;
                            default:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(g8m.a);
                                break;
                        }
                        return Unit.a;
                    }
                }, new vkm(e0nVar, i5), new Function0() { // from class: c0n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = i10;
                        int i12 = 0;
                        int i13 = 1;
                        e0n e0nVar2 = e0nVar;
                        switch (i11) {
                            case 0:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar2 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar2.getClass();
                                try {
                                    w3m w3mVar = (w3m) aVar2.getViewModel();
                                    w3mVar.getClass();
                                    w3mVar.d0(System.currentTimeMillis(), w3mVar.u0, new n2m(w3mVar, 0), new o2m(w3mVar, i12), new ypm(w3mVar));
                                } catch (Throwable th) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                }
                                break;
                            case 1:
                                w3m w3mVar2 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                yda ydaVar = w3mVar2.M0;
                                if (ydaVar != null) {
                                    ydaVar.e(null);
                                }
                                yda ydaVar2 = w3mVar2.K0;
                                if (ydaVar2 != null) {
                                    ydaVar2.e(null);
                                }
                                w3mVar2.u0 = 0L;
                                w3mVar2.v0 = 0L;
                                w3mVar2.h0(((wpm) w3mVar2.H0.getValue()).a ? new w3m.a.C1357a(false) : new w3m.a.b(true));
                                break;
                            case 2:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar3 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar3.getClass();
                                try {
                                    w3m w3mVar3 = (w3m) aVar3.getViewModel();
                                    w3mVar3.getClass();
                                    w3mVar3.d0(System.currentTimeMillis(), w3mVar3.v0, new n2m(w3mVar3, 1), new o2m(w3mVar3, i13), new pom(w3mVar3));
                                } catch (Throwable th2) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                                }
                                break;
                            case 3:
                                if (e0nVar2.f && e0nVar2.g) {
                                    ImageView imageView = e0nVar2.b.n;
                                    imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    imageView.setVisibility(0);
                                    imageView.animate().alpha(1.0f).setDuration(200L).start();
                                    w3m w3mVar4 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                    if (!w3mVar4.K()) {
                                        fqm fqmVar = (fqm) w3mVar4.G.d();
                                        if ((fqmVar != null ? fqmVar.a : false) && !w3mVar4.x0) {
                                            w3mVar4.x0 = true;
                                            w3mVar4.y0 = w3mVar4.G();
                                            w3mVar4.z0 = 2.0f;
                                            fam famVar = w3mVar4.e;
                                            if (famVar != null) {
                                                famVar.a(2.0f);
                                            }
                                            w3mVar4.h0(new w3m.a.C1357a(false));
                                        }
                                    }
                                }
                                break;
                            case 4:
                                if (e0nVar2.f) {
                                    ImageView imageView2 = e0nVar2.b.n;
                                    imageView2.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withEndAction(new ykm(imageView2, 1)).start();
                                    ((w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel()).V();
                                }
                                break;
                            case 5:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(qgm.a);
                                break;
                            case 6:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(vam.a);
                                break;
                            default:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(g8m.a);
                                break;
                        }
                        return Unit.a;
                    }
                }, new Function0() { // from class: c0n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = i3;
                        int i12 = 0;
                        int i13 = 1;
                        e0n e0nVar2 = e0nVar;
                        switch (i11) {
                            case 0:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar2 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar2.getClass();
                                try {
                                    w3m w3mVar = (w3m) aVar2.getViewModel();
                                    w3mVar.getClass();
                                    w3mVar.d0(System.currentTimeMillis(), w3mVar.u0, new n2m(w3mVar, 0), new o2m(w3mVar, i12), new ypm(w3mVar));
                                } catch (Throwable th) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                }
                                break;
                            case 1:
                                w3m w3mVar2 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                yda ydaVar = w3mVar2.M0;
                                if (ydaVar != null) {
                                    ydaVar.e(null);
                                }
                                yda ydaVar2 = w3mVar2.K0;
                                if (ydaVar2 != null) {
                                    ydaVar2.e(null);
                                }
                                w3mVar2.u0 = 0L;
                                w3mVar2.v0 = 0L;
                                w3mVar2.h0(((wpm) w3mVar2.H0.getValue()).a ? new w3m.a.C1357a(false) : new w3m.a.b(true));
                                break;
                            case 2:
                                com.blaze.blazesdk.features.videos.players.ui.a aVar3 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c;
                                aVar3.getClass();
                                try {
                                    w3m w3mVar3 = (w3m) aVar3.getViewModel();
                                    w3mVar3.getClass();
                                    w3mVar3.d0(System.currentTimeMillis(), w3mVar3.v0, new n2m(w3mVar3, 1), new o2m(w3mVar3, i13), new pom(w3mVar3));
                                } catch (Throwable th2) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                                }
                                break;
                            case 3:
                                if (e0nVar2.f && e0nVar2.g) {
                                    ImageView imageView = e0nVar2.b.n;
                                    imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    imageView.setVisibility(0);
                                    imageView.animate().alpha(1.0f).setDuration(200L).start();
                                    w3m w3mVar4 = (w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel();
                                    if (!w3mVar4.K()) {
                                        fqm fqmVar = (fqm) w3mVar4.G.d();
                                        if ((fqmVar != null ? fqmVar.a : false) && !w3mVar4.x0) {
                                            w3mVar4.x0 = true;
                                            w3mVar4.y0 = w3mVar4.G();
                                            w3mVar4.z0 = 2.0f;
                                            fam famVar = w3mVar4.e;
                                            if (famVar != null) {
                                                famVar.a(2.0f);
                                            }
                                            w3mVar4.h0(new w3m.a.C1357a(false));
                                        }
                                    }
                                }
                                break;
                            case 4:
                                if (e0nVar2.f) {
                                    ImageView imageView2 = e0nVar2.b.n;
                                    imageView2.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withEndAction(new ykm(imageView2, 1)).start();
                                    ((w3m) ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).getViewModel()).V();
                                }
                                break;
                            case 5:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(qgm.a);
                                break;
                            case 6:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(vam.a);
                                break;
                            default:
                                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar2.c).E(g8m.a);
                                break;
                        }
                        return Unit.a;
                    }
                }, null, null, null, 460804, null);
                break;
            case 1:
                uxm uxmVar2 = (uxm) obj;
                boolean z2 = e0n.n;
                uxmVar2.getClass();
                ConstraintLayout constraintLayout2 = uxmVar2.a;
                constraintLayout2.getClass();
                lz.w(constraintLayout2, (r30 & 1) != 0 ? 0 : 0, (r30 & 2) == 0 ? 0 : 0, (r30 & 4) != 0 ? 1000 : 0, (r30 & 8) != 0 ? new ol8(10) : new yzm(e0nVar, i2), (r30 & 16) != 0 ? new zl8(26) : null, (r30 & 32) != 0 ? new zl8(27) : null, (r30 & 64) != 0 ? new zl8(28) : null, (r30 & 128) != 0 ? new zl8(29) : null, (r30 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new nl8(24) : null, (r30 & 512) != 0 ? new xt8(0) : null, (r30 & 1024) != 0 ? new xt8(1) : null, (r30 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? new xt8(2) : null, (r30 & 4096) != 0 ? new xt8(3) : null, (r30 & 8192) != 0 ? new zl8(25) : null);
                break;
            case 2:
                uxm uxmVar3 = (uxm) obj;
                boolean z3 = e0n.n;
                uxmVar3.getClass();
                View view = uxmVar3.f;
                view.getClass();
                view.setVisibility(0);
                ImageView imageView = uxmVar3.p;
                imageView.getClass();
                imageView.setVisibility(0);
                imageView.setOnClickListener(new b0n(e0nVar, 14));
                ConstraintLayout constraintLayout3 = uxmVar3.a;
                constraintLayout3.getClass();
                lz.w(constraintLayout3, (r30 & 1) != 0 ? 0 : 0, (r30 & 2) == 0 ? 0 : 0, (r30 & 4) != 0 ? 1000 : 0, (r30 & 8) != 0 ? new ol8(10) : new yzm(e0nVar, i3), (r30 & 16) != 0 ? new zl8(26) : null, (r30 & 32) != 0 ? new zl8(27) : null, (r30 & 64) != 0 ? new zl8(28) : null, (r30 & 128) != 0 ? new zl8(29) : null, (r30 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new nl8(24) : null, (r30 & 512) != 0 ? new xt8(0) : null, (r30 & 1024) != 0 ? new xt8(1) : null, (r30 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? new xt8(2) : null, (r30 & 4096) != 0 ? new xt8(3) : null, (r30 & 8192) != 0 ? new zl8(25) : null);
                break;
            case 3:
                boolean z4 = e0n.n;
                ((uxm) obj).getClass();
                ImageView imageView2 = e0nVar.b.E;
                imageView2.getClass();
                imageView2.setVisibility(8);
                break;
            case 4:
                boolean z5 = e0n.n;
                ((uxm) obj).getClass();
                ImageView imageView3 = e0nVar.b.k;
                imageView3.getClass();
                imageView3.setVisibility(8);
                break;
            case 5:
                boolean z6 = e0n.n;
                ((MotionEvent) obj).getClass();
                com.blaze.blazesdk.features.videos.players.ui.a aVar2 = (com.blaze.blazesdk.features.videos.players.ui.a) e0nVar.c;
                aVar2.getClass();
                try {
                    aVar2.M();
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
                break;
            case 6:
                boolean z7 = e0n.n;
                ((uxm) obj).getClass();
                uxm uxmVar4 = e0nVar.b;
                BlazeDefaultTimeBar blazeDefaultTimeBar = uxmVar4.z;
                blazeDefaultTimeBar.getClass();
                blazeDefaultTimeBar.setVisibility(8);
                BlazeTextView blazeTextView = uxmVar4.v;
                blazeTextView.getClass();
                blazeTextView.setVisibility(8);
                break;
            case 7:
                boolean z8 = e0n.n;
                ((MotionEvent) obj).getClass();
                ((com.blaze.blazesdk.features.videos.players.ui.a) e0nVar.c).L();
                break;
            case 8:
                uxm uxmVar5 = (uxm) obj;
                boolean z9 = e0n.n;
                uxmVar5.getClass();
                e0nVar.k = false;
                StatusIndicatorView statusIndicatorView = uxmVar5.I;
                statusIndicatorView.getClass();
                statusIndicatorView.setVisibility(8);
                e0nVar.l(false);
                break;
            default:
                uxm uxmVar6 = (uxm) obj;
                boolean z10 = e0n.n;
                uxmVar6.getClass();
                n4m n4mVar = e0nVar.d;
                if (!((n4mVar != null ? n4mVar.c : null) instanceof n4m.a.b)) {
                    break;
                } else {
                    BlazeDefaultTimeBar blazeDefaultTimeBar2 = uxmVar6.z;
                    boolean z11 = e0nVar.g;
                    blazeDefaultTimeBar2.d0 = !z11;
                    if (!z11) {
                        blazeDefaultTimeBar2.d(blazeDefaultTimeBar2.getLeft(), blazeDefaultTimeBar2.getTop(), blazeDefaultTimeBar2.getRight(), blazeDefaultTimeBar2.getBottom());
                    }
                    ImageView imageView4 = uxmVar6.u;
                    imageView4.setSelected(!e0nVar.g);
                    BlazeVideosPlayerStyle a = e0nVar.a();
                    if (a != null && (buttons = a.getButtons()) != null && (playPause = buttons.getPlayPause()) != null) {
                        blazePlayerButtonCustomImageStates = playPause.getCustomImage();
                    }
                    ctl.b(imageView4, blazePlayerButtonCustomImageStates);
                    imageView4.setOnClickListener(new b0n(e0nVar, 15));
                    imageView4.setContentDescription(e0nVar.g ? imageView4.getContext().getString(R.string.blaze_accessibility_pause_video) : imageView4.getContext().getString(R.string.blaze_accessibility_play_video));
                    break;
                }
        }
        return Unit.a;
    }
}
