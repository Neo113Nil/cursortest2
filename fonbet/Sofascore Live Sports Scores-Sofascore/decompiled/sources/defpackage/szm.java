package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.exoplayer.ExoPlayer;
import com.blaze.blazesdk.analytics.models.AnalyticsPlayerViewingTransitionState;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.d;
import com.blaze.blazesdk.features.videos.models.ui.a;
import com.blaze.blazesdk.features.videos.models.ui.h;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.unity3d.services.UnityAdsConstants;
import defpackage.wom;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class szm implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ szm(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        w3m w3mVar;
        com.blaze.blazesdk.features.videos.models.ui.a aVar;
        AnalyticsPlayerViewingTransitionState.PlayerViewingMode playerViewingMode;
        ExoPlayer d;
        Object value;
        int i = this.a;
        a aVar2 = this.b;
        switch (i) {
            case 0:
                if (h.d(aVar2.p.a) && (aVar = (w3mVar = (w3m) aVar2.getViewModel()).F0) != null) {
                    if (!(aVar instanceof a.b)) {
                        if (!(aVar instanceof a.C0011a)) {
                            if (!(aVar instanceof a.e)) {
                                zzl.b();
                                break;
                            } else {
                                playerViewingMode = AnalyticsPlayerViewingTransitionState.PlayerViewingMode.FULLSCREEN;
                            }
                        } else {
                            playerViewingMode = h.c(aVar) ? AnalyticsPlayerViewingTransitionState.PlayerViewingMode.INLINE_INTERACTIVE : AnalyticsPlayerViewingTransitionState.PlayerViewingMode.FULLSCREEN;
                        }
                    } else {
                        playerViewingMode = h.c(aVar) ? AnalyticsPlayerViewingTransitionState.PlayerViewingMode.INLINE_PREVIEW : AnalyticsPlayerViewingTransitionState.PlayerViewingMode.FULLSCREEN;
                    }
                    w3mVar.e0(playerViewingMode, true);
                    fam famVar = w3mVar.e;
                    if (famVar != null && (d = famVar.d()) != null) {
                        w3mVar.f0 = true;
                        w3mVar.x();
                        String H = w3mVar.H();
                        n4m D = w3mVar.D();
                        hda.d = new wom.b(H, d, D != null ? D.a : null, (String) w3mVar.g.getValue());
                        CountDownTimer countDownTimer = hda.e;
                        if (countDownTimer != null) {
                            countDownTimer.cancel();
                        }
                        if (hda.d != null) {
                            hda.e = new cqm().start();
                        }
                    }
                }
                FragmentActivity activity = aVar2.getActivity();
                activity.getWindow().setWindowAnimations(0);
                activity.finish();
                activity.overridePendingTransition(0, 0);
                break;
            case 1:
                int i2 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                w3m w3mVar2 = (w3m) aVar2.getViewModel();
                try {
                    if (w3mVar2.K()) {
                        n4m D2 = w3mVar2.D();
                        if (D2 != null) {
                            c1m.basePrepareMediaFor$default(w3mVar2, D2, false, true, false, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 10, null);
                        }
                    } else {
                        try {
                            fam famVar2 = w3mVar2.e;
                            if (famVar2 != null) {
                                famVar2.seekTo(0L);
                            }
                        } catch (Throwable th) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        }
                        w3mVar2.B(true);
                    }
                } catch (Throwable th2) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                }
                fdi fdiVar = w3mVar2.H0;
                do {
                    value = fdiVar.getValue();
                    ((wpm) value).getClass();
                } while (!fdiVar.k(value, new wpm(true, true, false)));
            default:
                int i3 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                Context context = aVar2.getContext();
                if (context != null) {
                    gzk gzkVar = gzk.a;
                    String C = ((w3m) aVar2.getViewModel()).C();
                    BlazePlayerType blazePlayerType = BlazePlayerType.VIDEOS;
                    blazePlayerType.getClass();
                    try {
                        Intent intent = new Intent("player_broadcast");
                        intent.putExtra("on_trigger_key_broadcaster_id", C);
                        intent.putExtra("player_type", (Parcelable) blazePlayerType);
                        intent.putExtra("player_broadcast_event_type", (Parcelable) d.PLAYER_ENTERED_FULLSCREEN);
                        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                        gzk.b.add(intent);
                    } catch (Throwable th3) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
