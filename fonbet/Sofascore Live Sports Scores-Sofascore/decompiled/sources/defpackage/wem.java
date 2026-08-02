package defpackage;

import android.content.Context;
import android.content.Intent;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsTabsConfigurations;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.inmobi.media.AbstractC3587m1;
import com.inmobi.media.AbstractC3836vh;
import com.inmobi.media.C3502ik;
import com.inmobi.media.C3693q3;
import com.inmobi.media.C3862wh;
import com.inmobi.media.Fk;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.inmobi.media.Z2;
import com.ironsource.Bg;
import com.ironsource.C4111hb;
import com.ironsource.C4141j6;
import com.ironsource.C4164kb;
import com.ironsource.C4177l6;
import com.ironsource.C4221ne;
import com.ironsource.C4289rb;
import com.ironsource.C4359v9;
import com.ironsource.C4395x9;
import com.ironsource.C4424z2;
import com.ironsource.C4431z9;
import com.ironsource.C4432za;
import com.ironsource.C4436ze;
import com.ironsource.InterfaceC4146jb;
import com.ironsource.InterfaceC4292re;
import com.ironsource.J9;
import com.ironsource.Sa;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.controller.v;
import com.mbridge.msdk.setting.i;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.internal.load.j;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.z2;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class wem implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wem(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zgm zgmVar = (zgm) obj;
                int i2 = zgm.m;
                BlazeMomentsTabsConfigurations tabsConfigurations = ((BlazeMomentsPlayerStyle) obj2).getTabsConfigurations();
                tabsConfigurations.setActive$blazesdk_release(true);
                int height = zgmVar.c.c.getHeight();
                BlazeDp headerButtonsTopMargin = tabsConfigurations.getHeaderButtonsTopMargin();
                Context context = zgmVar.getContext();
                context.getClass();
                headerButtonsTopMargin.getClass();
                tabsConfigurations.setHeaderButtonsTopMargin(new BlazeDp((int) ((headerButtonsTopMargin.getToPx$blazesdk_release() + height) / context.getResources().getDisplayMetrics().density)));
                break;
            case 1:
                C4111hb.a((C4111hb) obj2, (String) obj);
                break;
            case 2:
                C4111hb.a((C4111hb) obj2, (InterfaceC4146jb) obj);
                break;
            case 3:
                C4111hb.a((C4111hb) obj2, (LevelPlayAdError) obj);
                break;
            case 4:
                ((i) obj2).j((String) obj);
                break;
            case 5:
                com.vungle.ads.internal.load.i.a((j) obj2, (Throwable) obj);
                break;
            case 6:
                C3502ik.a((Intent) obj2, (Context) obj);
                break;
            case 7:
                C4141j6.a((C4141j6) obj2, (LevelPlayAdInfo) obj);
                break;
            case 8:
                C4164kb.a((C4164kb) obj2, (Map) obj);
                break;
            case 9:
                C4177l6.a((C4177l6) obj2, (LevelPlayAdInfo) obj);
                break;
            case 10:
                AbstractC3587m1.a((AbstractC3587m1) obj2, (GestureDetectorOnGestureListenerC3889xi) obj);
                break;
            case 11:
                AbstractC3587m1.a((AbstractC3587m1) obj2, (Fk) obj);
                break;
            case 12:
                p.a((String) obj2, (Function1) obj);
                break;
            case 13:
                C3693q3.a((Z2) obj2, (C3693q3) obj);
                break;
            case 14:
                C4289rb.a((LevelPlayInitListener) obj2, (Sa) obj);
                break;
            case 15:
                ((v) obj2).k((String) obj);
                break;
            case 16:
                C4359v9.a((C4359v9) obj2, (IronSourceError) obj);
                break;
            case 17:
                C3862wh.a((Function1) obj2, (AbstractC3836vh) obj);
                break;
            case 18:
                C4395x9.a((C4395x9) obj2, (IronSourceError) obj);
                break;
            case 19:
                C4395x9.a((C4395x9) obj2, (J9) obj);
                break;
            case 20:
                GestureDetectorOnGestureListenerC3889xi.d((GestureDetectorOnGestureListenerC3889xi) obj2, (String) obj);
                break;
            case 21:
                z2.a((BidTokenCallback) obj2, (joa) obj);
                break;
            case 22:
                C4424z2.a((C4424z2) obj2, (Map) obj);
                break;
            case 23:
                C4424z2.a((C4424z2) obj2, (Bg) obj);
                break;
            case 24:
                C4431z9.a((IronSourceError) obj2, (C4431z9) obj);
                break;
            case 25:
                C4431z9.a((InterstitialAd) obj2, (C4431z9) obj);
                break;
            case 26:
                C4432za.a((C4432za) obj2, (LevelPlayImpressionDataListener) obj);
                break;
            case 27:
                C4432za.a((LevelPlayAdError) obj2, (C4432za) obj);
                break;
            case 28:
                C4432za.a((C4432za) obj2, (LevelPlayBannerAdViewListener) obj);
                break;
            default:
                C4436ze.b((InterfaceC4292re) obj2, (C4221ne) obj);
                break;
        }
    }
}
