package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import com.appsflyer.sdk_base.referrer.Payload;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.AppMetrics;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.Sponsored;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Dd extends AbstractC3896y implements Bj, Ih, InterfaceC3404f {
    public final MediaView b;
    public final View c;
    public final AbstractC3406f1 d;
    public final C3289ad e;
    public final Rc f;
    public final Wc g;
    public final L4 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Dd(MediaView mediaView, View view, AbstractC3406f1 abstractC3406f1, C3289ad c3289ad, Rc rc, Wc wc) {
        super(r0);
        abstractC3406f1.getClass();
        c3289ad.getClass();
        rc.getClass();
        wc.getClass();
        C3870x c3870x = rc.a;
        this.b = mediaView;
        this.c = view;
        this.d = abstractC3406f1;
        this.e = c3289ad;
        this.f = rc;
        this.g = wc;
        G g = c3870x.b;
        this.h = new L4(g.h, g.a.a.a);
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        NativeMedia media;
        AppMetrics appMetrics;
        Sponsored sponsored;
        CTA cta;
        Description description;
        Title title;
        Icon icon;
        AppMetrics appMetrics2;
        AppMetrics appMetrics3;
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("NativeLoadedState", "Initialize Called");
        }
        Qc qc = (Qc) this.f.f.getValue();
        Map a = Hk.a(qc.a);
        long j = qc.b.a;
        ku3 ku3Var = Hl.a;
        a.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("AdLoadSuccessful", a, EnumC3943zk.SDK);
        this.e.b.b.a(C3472hf.a);
        JsonAssetObject assetsObject = this.f.b.getAssetsObject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiNative.APP_INSTALLS, (assetsObject == null || (appMetrics3 = assetsObject.getAppMetrics()) == null) ? null : appMetrics3.getDownloads());
        jSONObject.put(InMobiNative.LIKES, (assetsObject == null || (appMetrics2 = assetsObject.getAppMetrics()) == null) ? null : appMetrics2.getLikes());
        C3678pe c3678pe = new C3678pe((assetsObject == null || (title = assetsObject.getTitle()) == null) ? null : title.getText(), (assetsObject == null || (description = assetsObject.getDescription()) == null) ? null : description.getText(), new InMobiNativeImage((assetsObject == null || (icon = assetsObject.getIcon()) == null) ? null : icon.getUrl()), (assetsObject == null || (cta = assetsObject.getCta()) == null) ? null : cta.getText(), jSONObject, (assetsObject == null || (sponsored = assetsObject.getSponsored()) == null) ? null : sponsored.getText(), (assetsObject == null || (appMetrics = assetsObject.getAppMetrics()) == null) ? null : appMetrics.getRating(), Intrinsics.c((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video"), this.b, this.c);
        Nc nc = this.f.c;
        nc.getClass();
        Bj bj = nc.c;
        Pd pd = bj instanceof Pd ? (Pd) bj : null;
        if (pd != null) {
            pd.a(c3678pe);
        }
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        inMobiNativeViewData.getClass();
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("NativeLoadedState", "registerViewForTracking - parentView: " + inMobiNativeViewData.getParentView() + ", isAttachedToWindow: " + inMobiNativeViewData.getParentView().isAttachedToWindow());
        }
        G g = this.a.b;
        g.getClass();
        g.getClass();
        long timeToLive = g.a.b.getCacheConfig(IronSourceConstants.EVENTS_NATIVE).getTimeToLive();
        long j = g.k;
        if (j == -1) {
            j = g.j + TimeUnit.SECONDS.toMillis(timeToLive);
        }
        if (j - System.currentTimeMillis() < 0) {
            InterfaceC3880x9 l2 = l();
            if (l2 != null) {
                ((C3906y9) l2).a("NativeLoadedState", "Ad-Expired");
            }
            Map a = Hk.a(((Qc) this.f.f.getValue()).a);
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("AdExpired", a, EnumC3943zk.SDK);
        }
        this.h.a();
        C3328c0 c3328c0 = this.a.a.d;
        c3328c0.getClass();
        c3328c0.d = SystemClock.elapsedRealtime();
        this.e.b.d.a(C3472hf.a);
        Map a2 = Hk.a(((Qc) this.f.f.getValue()).a);
        C3839vk c3839vk2 = C3839vk.a;
        C3839vk.b("StartTracking", a2, EnumC3943zk.SDK);
        this.g.a(new He(new Ie(new Ni(), new C3525jh(inMobiNativeViewData, this.b, this.c), this.h, this.d, this.e, this.f), this.g), this);
    }

    @Override // com.inmobi.media.InterfaceC3404f
    public final Object a(rq3 rq3Var) {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("NativeLoadedState", "onDestroy");
        }
        Object a = this.g.a(new C3496id(), this, (sq3) rq3Var);
        return a == lu3.a ? a : Unit.a;
    }
}
