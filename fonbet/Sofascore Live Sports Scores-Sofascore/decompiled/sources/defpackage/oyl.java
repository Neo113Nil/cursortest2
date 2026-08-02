package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.d;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class oyl implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ syl b;

    public /* synthetic */ oyl(syl sylVar, int i) {
        this.a = i;
        this.b = sylVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        BlazeDataSourceType blazeDataSourceType;
        String str;
        Context context;
        int i = this.a;
        syl sylVar = this.b;
        int i2 = syl.C;
        switch (i) {
            case 0:
                try {
                    sylVar.j(H.CLOSE_BUTTON);
                    break;
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                    return;
                }
            case 1:
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                try {
                    ((sqm) sylVar.getViewModel()).f0(view.isSelected());
                    break;
                } catch (Throwable th2) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                    return;
                }
            default:
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                sqm sqmVar = (sqm) sylVar.getViewModel();
                sqmVar.getClass();
                try {
                    n4m D = sqmVar.D();
                    gim gimVar = D != null ? D.b : null;
                    if (gimVar instanceof gim.b) {
                        ysm.d(sqmVar, EventActionName.SEARCH_CLICK, ysm.createMomentsPlayerProps$default(sqmVar, (gim.b) gimVar, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null));
                    }
                } catch (Throwable th3) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
                }
                sqm sqmVar2 = (sqm) sylVar.getViewModel();
                if (sqmVar2.J()) {
                    gum gumVar = sqmVar2.k0;
                    String H = sqmVar2.H();
                    gumVar.getClass();
                    h9m o = gum.o(H);
                    if (o != null) {
                        blazeDataSourceType = o.a;
                        if (blazeDataSourceType == null) {
                            ConcurrentHashMap concurrentHashMap = q6m.a;
                            str = fc6.C();
                            q6m.a.put(str, blazeDataSourceType);
                        } else {
                            str = null;
                        }
                        BlazePlayerType blazePlayerType = BlazePlayerType.MOMENTS;
                        blazePlayerType.getClass();
                        context = sylVar.getContext();
                        if (context == null) {
                            gzk gzkVar = gzk.a;
                            String C = sylVar.getViewModel().C();
                            String str2 = sylVar.getViewModel().j;
                            try {
                                Intent intent = new Intent("player_broadcast");
                                intent.putExtra("player_broadcast_client_source_id", str2);
                                intent.putExtra("on_trigger_key_broadcaster_id", C);
                                intent.putExtra("player_type", (Parcelable) blazePlayerType);
                                intent.putExtra("player_broadcast_event_type", (Parcelable) d.SEARCH_BUTTON_CLICKED);
                                intent.putExtra("on_search_button_data_source_registry_key", str);
                                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                                gzk.b.add(intent);
                                break;
                            } catch (Throwable th4) {
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th4, null);
                            }
                        }
                    }
                }
                blazeDataSourceType = null;
                if (blazeDataSourceType == null) {
                }
                BlazePlayerType blazePlayerType2 = BlazePlayerType.MOMENTS;
                blazePlayerType2.getClass();
                context = sylVar.getContext();
                if (context == null) {
                }
                break;
        }
    }
}
