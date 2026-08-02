package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.AbstractC3349cl;
import com.inmobi.media.C3278a2;
import com.inmobi.media.Fk;
import com.inmobi.media.Z1;
import com.ironsource.C3952a3;
import com.ironsource.C3990ag;
import com.ironsource.J9;
import com.ironsource.Xd;
import com.ironsource.Y2;
import com.ironsource.Zd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.config.component.base.b;
import com.mbridge.msdk.config.component.info.provider.subprovider.e;
import com.mbridge.msdk.config.component.wei.WeiCpt;
import com.mbridge.msdk.config.component.wei.model.a;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.vungle.ads.internal.load.c;
import com.vungle.ads.internal.load.g;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class s5l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s5l(int i, Object obj, Object obj2) {
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
                ((WeiCpt) obj2).a((a) obj);
                break;
            case 1:
                xll xllVar = (xll) obj2;
                g6b g6bVar = (g6b) obj;
                if (!xllVar.c) {
                    xllVar.d = g6bVar;
                    g6bVar.a(xllVar);
                    break;
                }
                break;
            case 2:
                Xd.a((Xd) obj2, (IronSourceError) obj);
                break;
            case 3:
                Xd.a((Xd) obj2, (J9) obj);
                break;
            case 4:
                Y2.a((Y2) obj2, (IronSourceError) obj);
                break;
            case 5:
                yme ymeVar = (yme) obj;
                k1l k1lVar = ((vnl) obj2).a;
                Iterator<T> it = k1lVar.getListeners().iterator();
                while (it.hasNext()) {
                    ((ynl) it.next()).i(k1lVar.getInstance(), ymeVar);
                }
                break;
            case 6:
                zme zmeVar = (zme) obj;
                k1l k1lVar2 = ((vnl) obj2).a;
                Iterator<T> it2 = k1lVar2.getListeners().iterator();
                while (it2.hasNext()) {
                    ((ynl) it2.next()).g(k1lVar2.getInstance(), zmeVar);
                }
                break;
            case 7:
                String str = (String) obj;
                k1l k1lVar3 = ((vnl) obj2).a;
                Iterator<T> it3 = k1lVar3.getListeners().iterator();
                while (it3.hasNext()) {
                    ((ynl) it3.next()).b(k1lVar3.getInstance(), str);
                }
                break;
            case 8:
                ane aneVar = (ane) obj;
                k1l k1lVar4 = ((vnl) obj2).a;
                Iterator<T> it4 = k1lVar4.getListeners().iterator();
                while (it4.hasNext()) {
                    ((ynl) it4.next()).a(k1lVar4.getInstance(), aneVar);
                }
                break;
            case 9:
                bne bneVar = (bne) obj;
                k1l k1lVar5 = ((vnl) obj2).a;
                Iterator<T> it5 = k1lVar5.getListeners().iterator();
                while (it5.hasNext()) {
                    ((ynl) it5.next()).f(k1lVar5.getInstance(), bneVar);
                }
                break;
            case 10:
                Zd.a((Zd) obj2, (IronSourceError) obj);
                break;
            case 11:
                Zd.a((RewardedAd) obj2, (Zd) obj);
                break;
            case 12:
                ((com.mbridge.msdk.config.component.info.provider.subprovider.a) obj2).b((com.mbridge.msdk.config.component.info.provider.listener.a) obj);
                break;
            case 13:
                ((com.mbridge.msdk.config.component.pipeline.a) obj2).d((b) obj);
                break;
            case 14:
                C3278a2.a((C3278a2) obj2, (RelativeLayout) obj);
                break;
            case 15:
                C3952a3.a((BannerAdView) obj2, (C3952a3) obj);
                break;
            case 16:
                C3952a3.a((IronSourceError) obj2, (C3952a3) obj);
                break;
            case 17:
                C3990ag.a((C3990ag) obj2, (String) obj);
                break;
            case 18:
                com.vungle.ads.internal.session.b.a((com.vungle.ads.internal.session.b) obj2, (String) obj);
                break;
            case 19:
                com.mbridge.msdk.config.dynamic.utils.image.b.a((Bitmap[]) obj2, (ImageView) obj);
                break;
            case 20:
                ((ImageView) obj2).setImageDrawable((com.mbridge.msdk.video.dynview.shape.a) obj);
                break;
            case 21:
                c.a((g) obj2, (com.vungle.ads.internal.model.b) obj);
                break;
            case 22:
                com.vungle.ads.internal.platform.c.a((com.vungle.ads.internal.platform.c) obj2, (yn3) obj);
                break;
            case 23:
                AbstractC3349cl.a((AbstractC3349cl) obj2, (Fk) obj);
                break;
            case 24:
                AbstractC3349cl.a((AbstractC3349cl) obj2, (InMobiAdRequestStatus) obj);
                break;
            case 25:
                AbstractC3349cl.a((AbstractC3349cl) obj2, (String) obj);
                break;
            case 26:
                AbstractC3349cl.a((AbstractC3349cl) obj2, (Z1) obj);
                break;
            case 27:
                AbstractC3349cl.a((AbstractC3349cl) obj2, (AdMetaInfo) obj);
                break;
            case 28:
                ((e) obj2).b((com.mbridge.msdk.config.component.info.provider.listener.a) obj);
                break;
            default:
                ((e) obj2).b((Context) obj);
                break;
        }
    }
}
