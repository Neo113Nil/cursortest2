package defpackage;

import android.content.Context;
import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.delegates.models.BlazePlayerEvent;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.model.FirebaseBundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pml implements BlazeWidgetDelegate {
    public final /* synthetic */ ndk a;
    public final /* synthetic */ hcc b;
    public final /* synthetic */ gfl c;
    public final /* synthetic */ gfl d;

    public pml(ndk ndkVar, hcc hccVar, gfl gflVar, gfl gflVar2) {
        this.a = ndkVar;
        this.b = hccVar;
        this.c = gflVar;
        this.d = gflVar2;
    }

    @Override // com.blaze.blazesdk.delegates.BlazeWidgetDelegate, com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate
    public final void onDataLoadComplete(BlazePlayerType blazePlayerType, String str, int i, BlazeResult blazeResult) {
        blazePlayerType.getClass();
        blazeResult.getClass();
        if (blazeResult instanceof BlazeResult.Error) {
            hcc hccVar = this.b;
            Context context = (Context) hccVar.b;
            Integer num = (Integer) this.a.invoke();
            ia9 ia9Var = (ia9) hccVar.c;
            context.getClass();
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            if (num != null) {
                firebaseBundle.putInt("id", num.intValue());
            }
            firebaseBundle.putString("location", ia9Var.a);
            ia0 ia0Var = ia0.q;
            FirebaseAnalytics d = me4.d((f5d) me4.e(), "video_highlights_error", firebaseBundle, context);
            d.a.e(n9e.K(firebaseBundle), null, "video_highlights_error", false);
            this.c.invoke();
        } else if (blazeResult instanceof BlazeResult.Success) {
            this.d.invoke();
        }
        super.onDataLoadComplete(blazePlayerType, str, i, blazeResult);
    }

    @Override // com.blaze.blazesdk.delegates.BlazeWidgetDelegate
    public final void onItemClicked(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        Integer num = (Integer) this.a.invoke();
        if (num != null) {
            int intValue = num.intValue();
            hcc hccVar = this.b;
            Context context = (Context) hccVar.b;
            Integer valueOf = Integer.valueOf(intValue);
            ia9 ia9Var = (ia9) hccVar.c;
            zu[] zuVarArr = zu.a;
            nv.A0(context, valueOf, ia9Var);
        }
        super.onItemClicked(str, str2, str3);
    }

    @Override // com.blaze.blazesdk.delegates.BlazeWidgetDelegate, com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate
    public final void onPlayerDidDismiss(BlazePlayerType blazePlayerType, String str) {
        blazePlayerType.getClass();
        hcc hccVar = this.b;
        Long l = (Long) hccVar.d;
        if (l != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            Integer num = (Integer) this.a.invoke();
            if (num != null) {
                int intValue = num.intValue();
                Context context = (Context) hccVar.b;
                ia9 ia9Var = (ia9) hccVar.c;
                zu[] zuVarArr = zu.a;
                context.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putInt("id", intValue);
                firebaseBundle.putString("location", ia9Var.a);
                firebaseBundle.putLong("time_on_screen", currentTimeMillis);
                firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, "wsc");
                ia0 ia0Var = ia0.q;
                FirebaseAnalytics d = me4.d((f5d) me4.e(), "video_highlights_enagagement", firebaseBundle, context);
                d.a.e(n9e.K(firebaseBundle), null, "video_highlights_enagagement", false);
            }
        }
        hccVar.d = null;
        super.onPlayerDidDismiss(blazePlayerType, str);
    }

    @Override // com.blaze.blazesdk.delegates.BlazeWidgetDelegate, com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate
    public final void onPlayerEventTriggered(BlazePlayerType blazePlayerType, String str, BlazePlayerEvent blazePlayerEvent) {
        blazePlayerType.getClass();
        blazePlayerEvent.getClass();
        if (blazePlayerEvent instanceof BlazePlayerEvent.OnStoryStart) {
            this.b.d = Long.valueOf(System.currentTimeMillis());
        }
        super.onPlayerEventTriggered(blazePlayerType, str, blazePlayerEvent);
    }
}
