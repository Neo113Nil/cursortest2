package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import com.inmobi.media.ads.network.common.model.Viewability;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.BuildConfig;
import defpackage.ba4;
import defpackage.dmi;
import defpackage.duf;
import defpackage.fc6;
import defpackage.fom;
import defpackage.gom;
import defpackage.joa;
import defpackage.khm;
import defpackage.km5;
import defpackage.ku3;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.tub;
import defpackage.w1l;
import defpackage.wem;
import defpackage.wv8;
import defpackage.yda;
import defpackage.ypa;
import defpackage.zol;
import defpackage.zzl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.m1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3587m1 extends AbstractC3941zi implements J2, Lk, InterfaceC3871x0, Qo {
    public static final /* synthetic */ int E = 0;
    public WatermarkData A;
    public final joa B;
    public boolean C;
    public final joa D;
    public final String a;
    public volatile byte b;
    public final AdConfig c;
    public WeakReference d;
    public TimeoutConfigurations e;
    public WeakReference f;
    public final Ka g;
    public CopyOnWriteArrayList h;
    public C3906y9 i;
    public Handler j;
    public boolean k;
    public C3845w0 l;
    public AdResponse m;
    public Nk n;
    public int o;
    public int p;
    public long q;
    public final TreeSet r;
    public boolean s;
    public String t;
    public C3302b0 u;
    public C3725ra v;
    public Ac w;
    public final Handler x;
    public final LinkedHashMap y;
    public final C3742s1 z;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3587m1(Context context, C3845w0 c3845w0, AbstractC3349cl abstractC3349cl) {
        context.getClass();
        c3845w0.getClass();
        this.a = fc6.C();
        this.c = (AdConfig) AbstractC3435g4.a.a(AdConfig.class);
        this.g = (Ka) La.a.getValue();
        this.h = new CopyOnWriteArrayList();
        this.l = c3845w0;
        this.q = -1L;
        this.r = new TreeSet();
        this.x = new Handler(Looper.getMainLooper());
        this.y = new LinkedHashMap();
        this.z = new C3742s1(this);
        this.B = ypa.b(new gom(this, 0 == true ? 1 : 0));
        this.d = new WeakReference(context);
        this.f = new WeakReference(abstractC3349cl);
        Nb nb = AbstractC3294ai.a;
        AbstractC3294ai.a(abstractC3349cl, this.i);
        WeakReference weakReference = this.f;
        String m = m();
        AdSet s = s();
        this.u = new C3302b0(weakReference, m, s != null ? s.getIsRewarded() : false);
        M();
        this.D = ypa.b(new gom(this, 1));
    }

    public static String p(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        yda ydaVar = gestureDetectorOnGestureListenerC3889xi.z;
        return e((ydaVar == null || !ydaVar.isActive()) ? (short) 3103 : (short) 3102);
    }

    public final boolean A() {
        AdConfig.CacheConfig cacheConfig;
        C3906y9 c3906y9;
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        if (b == null) {
            return false;
        }
        AdConfig adConfig = this.c;
        if (adConfig != null && (cacheConfig = adConfig.getCacheConfig(m())) != null) {
            r0 = ((b.getExpiryTimestampInMillis() > (-1L) ? 1 : (b.getExpiryTimestampInMillis() == (-1L) ? 0 : -1)) == 0 ? TimeUnit.SECONDS.toMillis(cacheConfig.getTimeToLive()) + b.getInsertionTimestampInMillis() : b.getExpiryTimestampInMillis()) - System.currentTimeMillis() < 0;
            if (r0 && (c3906y9 = this.i) != null) {
                c3906y9.b("m1", "Top ad has expired, failing show of ad.");
            }
        }
        return r0;
    }

    public final void B() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("initTelemetry ", this, c3906y9, "m1");
        }
        this.y.put("AdImpressionSuccessful", this.z);
    }

    public final boolean C() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.b));
        }
        if (!AbstractC3386e7.a()) {
            d();
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        }
        if (F()) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.b("m1", "Some of the dependency libraries for " + m() + " not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        }
        byte b = this.b;
        if (b == 1) {
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.b("m1", "load with reasponse called while loading");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
            return true;
        }
        if (b != 7) {
            return false;
        }
        C3906y9 c3906y94 = this.i;
        if (c3906y94 != null) {
            c3906y94.b("m1", "ad active before load");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
        return true;
    }

    public void D() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("load  ", this, c3906y9, "m1");
        }
        C3742s1 c3742s1 = this.z;
        c3742s1.getClass();
        c3742s1.c = SystemClock.elapsedRealtime();
        int i = 2;
        a(new gom(this, i), new khm(this, i));
    }

    public final void E() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("makeUnitActive ", this, c3906y9, "m1");
        }
        this.k = false;
    }

    public boolean F() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("missingPrerequisitesForAd ", this, c3906y9, "m1");
        }
        try {
            duf.a.getOrCreateKotlinClass(ba4.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public void G() {
        MetaInfo metaInfo;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("onDidParseAfterFetch ", this, c3906y9, "m1");
        }
        if (this.l.j) {
            int i = 0;
            com.inmobi.media.ads.network.common.model.Ad b = b(0);
            if (b != null && (metaInfo = b.getMetaInfo()) != null) {
                i = metaInfo.getCrH();
            }
            Pair b2 = b(this.l.i);
            Pair b3 = b(this.l.h);
            if (i > 0 && b2 != null) {
                C3845w0 c3845w0 = this.l;
                String str = b2.a + "x" + Math.min(((Number) b2.b).intValue(), i);
                c3845w0.getClass();
                c3845w0.i = str;
            } else if (b3 != null) {
                C3845w0 c3845w02 = this.l;
                String str2 = b3.a + "x" + b3.b;
                c3845w02.getClass();
                c3845w02.i = str2;
            }
        }
        c((byte) 2);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new fom(this, 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (com.inmobi.media.AbstractC3424fj.f != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Ze H() {
        boolean z;
        Integer num;
        Integer num2;
        Integer num3;
        AdConfig.RenderingConfig rendering;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("prepareAdRequest ", this, c3906y9, "m1");
        }
        Context o = o();
        C3782tf c3782tf = o != null ? new C3782tf(o, this.i) : null;
        String str = this.l.g;
        str.getClass();
        this.l.getClass();
        C3845w0 c3845w0 = this.l;
        Map map = c3845w0.c;
        long j = c3845w0.a;
        String str2 = c3845w0.k;
        String m = m();
        HashMap l = l();
        String str3 = this.l.d;
        AdConfig adConfig = this.c;
        if (adConfig != null && (rendering = adConfig.getRendering()) != null) {
            z = true;
            if (rendering.getEnablePubMuteControl()) {
            }
        }
        z = false;
        C3612n0 c3612n0 = new C3612n0(str, map, j, str2, m, l, str3, z);
        Ac ac = this.w;
        int i = 15000;
        long intValue = (ac == null || (num3 = ac.d) == null) ? 15000 : num3.intValue();
        Ac ac2 = this.w;
        long intValue2 = (ac2 == null || (num2 = ac2.d) == null) ? 15000 : num2.intValue();
        Ac ac3 = this.w;
        if (ac3 != null && (num = ac3.d) != null) {
            i = num.intValue();
        }
        Ok ok = new Ok(intValue, intValue2, i);
        AdConfig adConfig2 = this.c;
        String url = adConfig2 != null ? adConfig2.getUrl() : null;
        AdConfig adConfig3 = this.c;
        adConfig3.getClass();
        Zk zk = new Zk(adConfig3.getIncludeIds());
        C3730rf a = c3782tf != null ? c3782tf.a() : null;
        C3906y9 c3906y92 = this.i;
        AdConfig adConfig4 = this.c;
        return new C3664p0(url, zk, c3612n0, ok, a, c3906y92, adConfig4 != null ? adConfig4.getApplyGzipReq() : false).a();
    }

    public final void I() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("printPublisherTestId ", this, c3906y9, "m1");
        }
        Yk.b();
    }

    public void J() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("resetContainersForNextAd ", this, c3906y9, "m1");
        }
        int size = this.h.size();
        int i = this.p;
        if (size <= i || this.h.get(i) == null) {
            return;
        }
        a(this.p, false);
    }

    public final void K() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.d("m1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 1);
    }

    public void L() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("setMonetizationContext ", this, c3906y9, "m1");
        }
        C3845w0 c3845w0 = this.l;
        c3845w0.getClass();
        c3845w0.k = "activity";
    }

    public final void M() {
        toString();
        this.e = z();
        c((byte) 0);
        this.j = new Handler(Looper.getMainLooper());
        this.n = new Nk(this);
    }

    public final boolean N() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("shouldBlockLoadAd ", this, c3906y9, "m1");
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        if (b != null && 4 == this.b && !A()) {
            AbstractC3458h1 n = n();
            if (n != null) {
                C3906y9 c3906y92 = this.i;
                if (c3906y92 != null) {
                    c3906y92.a("m1", "ad is ready - load success");
                }
                d(n);
            } else {
                c((short) 2188);
            }
            return true;
        }
        if (b == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2131);
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.b("m1", "ad no longer available");
            }
            return true;
        }
        if (2 == this.b) {
            if (!A()) {
                return false;
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
            C3906y9 c3906y94 = this.i;
            if (c3906y94 != null) {
                c3906y94.b("m1", "ad is expired");
            }
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
        C3906y9 c3906y95 = this.i;
        if (c3906y95 != null) {
            c3906y95.b("m1", "ad no longer available. state - " + ((int) this.b));
        }
        return true;
    }

    public final void O() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad;
        int i;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("startLoadingHTMLAd ", this, c3906y9, "m1");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = null;
        try {
            AdSet s = s();
            com.inmobi.media.ads.network.common.model.Ad ad2 = (s == null || (i = this.o) < 0 || i >= s.getAds().size()) ? null : s.getAds().get(this.o);
            d(this.o);
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                AdSet s2 = s();
                c3906y92.a("m1", "Loading ad with impressionId : " + ((s2 == null || (ads = s2.getAds()) == null || (ad = ads.get(this.o)) == null) ? null : ad.getImpressionId()));
            }
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = (GestureDetectorOnGestureListenerC3889xi) this.h.get(this.o);
            if (ad2 != null) {
                Xg pubContent = ad2.getPubContent();
                if (pubContent instanceof C3336c8) {
                    C3906y9 c3906y93 = this.i;
                    if (c3906y93 != null) {
                        c3906y93.a("m1", "Loading HTML content into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC3889xi2 != null) {
                        gestureDetectorOnGestureListenerC3889xi2.i(((C3336c8) pubContent).a);
                    }
                } else if (pubContent instanceof C3362d8) {
                    String obj = StringsKt.l0(((C3362d8) pubContent).a).toString();
                    C3906y9 c3906y94 = this.i;
                    if (c3906y94 != null) {
                        c3906y94.a("m1", "Loading HTML URL into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC3889xi2 != null) {
                        gestureDetectorOnGestureListenerC3889xi2.a(obj, this.c.getRendering().getEnableHtmlUrlPrefetch());
                    }
                }
            }
            if (gestureDetectorOnGestureListenerC3889xi2 == null || !Intrinsics.c(t(), "htmlUrl")) {
                return;
            }
            k(gestureDetectorOnGestureListenerC3889xi2);
        } catch (Exception e) {
            C3906y9 c3906y95 = this.i;
            if (c3906y95 != null) {
                c3906y95.a("m1", "Loading ad markup into container encountered an unexpected error: " + e.getMessage());
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
            int i2 = this.o;
            if (i2 >= 0 && i2 < this.h.size()) {
                gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) this.h.get(this.o);
            }
            a(gestureDetectorOnGestureListenerC3889xi, (short) 2135, e((short) 2135));
        }
    }

    public final void P() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("submitAdLoadCalled ", this, c3906y9, "m1");
        }
        HashMap hashMap = new HashMap();
        c(hashMap);
        c("AdLoadCalled", hashMap);
    }

    public final void Q() {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "submitAdLoadSuccessfulEvent ADunit markuptype : " + t() + " " + this);
        }
        HashMap hashMap = new HashMap();
        long j = this.z.c;
        ku3 ku3Var = Hl.a;
        hashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p == null || (str = p.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad p2 = p();
        if (p2 != null && (metaInfo = p2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        C3725ra c3725ra = this.v;
        if (c3725ra != null) {
            hashMap.put("retryCount", Integer.valueOf(c3725ra.b));
        }
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        c("AdLoadSuccessful", hashMap);
    }

    public final void R() {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("submitAdShowCalled ", this, c3906y9, "m1");
        }
        C3742s1 c3742s1 = this.z;
        c3742s1.getClass();
        c3742s1.f = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        long j = this.z.i;
        ku3 ku3Var = Hl.a;
        hashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        c("AdShowCalled", hashMap);
    }

    public final void S() {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("submitAdShowSuccess ", this, c3906y9, "m1");
        }
        HashMap hashMap = new HashMap();
        long j = this.z.f;
        ku3 ku3Var = Hl.a;
        hashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        c("AdShowSuccessful", hashMap);
    }

    public final void T() {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "submitRenderSuccessEvent ADunit markuptype : " + t() + " " + this);
        }
        HashMap hashMap = new HashMap();
        long j = this.z.g;
        ku3 ku3Var = Hl.a;
        hashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        C3725ra c3725ra = this.v;
        if (c3725ra != null) {
            hashMap.put("retryCount", Integer.valueOf(c3725ra.b));
        }
        hashMap.put("plType", Byte.valueOf(u()));
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        a(q(), hashMap);
        c("RenderSuccess", hashMap);
    }

    public final long U() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("timeSincePodShow ", this, c3906y9, "m1");
        }
        if (this.s) {
            return System.currentTimeMillis() - this.q;
        }
        return -1L;
    }

    public final void V() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.b("m1", "ad unloaded with current state - " + ((int) this.b));
        }
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.d("m1", "AdUnit " + this + " state - UNLOADED");
        }
        c((byte) 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0137, code lost:
    
        if (r4.equals("video") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x013e, code lost:
    
        if (r4.equals("audio") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012e, code lost:
    
        if (r4.equals("nonvideo") == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024f A[EDGE_INSN: B:131:0x024f->B:75:0x024f BREAK  A[LOOP:1: B:54:0x01b0->B:130:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3638o0 a(int i) {
        String str;
        String str2;
        long j;
        boolean z;
        boolean z2;
        String str3;
        Iterator<Viewability> it;
        MetaInfo metaInfo;
        MetaInfo metaInfo2;
        String creativeId;
        MetaInfo metaInfo3;
        String creativeType;
        List<LandingPageParam> landingPageParams;
        LandingPageParam landingPageParam;
        List<LandingPageParam> landingPageParams2;
        LandingPageParam landingPageParam2;
        AdConfig.ViewabilityConfig viewability;
        AdConfig.OmidConfig omidConfig;
        MetaInfo metaInfo4;
        com.inmobi.media.ads.network.common.model.Ad b = b(i);
        String str4 = "audio";
        if (Intrinsics.c(this.l.e, "banner") || Intrinsics.c(this.l.e, "audio")) {
            C3845w0 c3845w0 = this.l;
            str = (!c3845w0.j || c3845w0.i.length() <= 0) ? this.l.h : this.l.i;
        } else {
            str = null;
        }
        if (b == null || (str2 = b.getMarkupType()) == null) {
            str2 = "html";
        }
        String str5 = str2;
        String str6 = this.l.e;
        boolean a = a(b);
        long j2 = this.l.a;
        boolean c = c(i);
        String str7 = this.l.m;
        String creativeType2 = (b == null || (metaInfo4 = b.getMetaInfo()) == null) ? null : metaInfo4.getCreativeType();
        AdMetaInfo k = k();
        String creativeID = k != null ? k.getCreativeID() : null;
        boolean z3 = this.l.l;
        String str8 = creativeType2;
        LinkedHashMap linkedHashMap = this.y;
        WatermarkData watermarkData = this.A;
        AdQualityControl adQualityControl = b != null ? b.getAdQualityControl() : null;
        byte u = u();
        b.getClass();
        AdConfig adConfig = this.c;
        b.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MetaInfo metaInfo5 = b.getMetaInfo();
        if (Intrinsics.c((adConfig == null || (viewability = adConfig.getViewability()) == null || (omidConfig = viewability.getOmidConfig()) == null) ? null : Boolean.valueOf(omidConfig.isOmidEnabled()), Boolean.TRUE)) {
            if ((metaInfo5 != null ? metaInfo5.getOmsdkInfo() : null) != null) {
                OmSdkInfo omsdkInfo = metaInfo5.getOmsdkInfo();
                if (omsdkInfo.getOmidEnabled()) {
                    Vk vk = new Vk((byte) 3);
                    boolean isolateVerificationScripts = omsdkInfo.getIsolateVerificationScripts();
                    String customReferenceData = omsdkInfo.getCustomReferenceData();
                    j = j2;
                    HashMap<String, String> macros = omsdkInfo.getMacros();
                    macros.getClass();
                    JSONObject a2 = AbstractC3907ya.a(macros, macros.getClass());
                    byte impressionType = omsdkInfo.getImpressionType();
                    String creativeType3 = metaInfo5.getCreativeType();
                    z = c;
                    int hashCode = creativeType3.hashCode();
                    z2 = a;
                    if (hashCode != 93166550) {
                        if (hashCode != 112202875) {
                            if (hashCode == 1425678798) {
                                str4 = "nonvideo";
                            }
                            str4 = "unknown";
                            HashMap hashMap = new HashMap();
                            if (a2 != null) {
                                for (Iterator<String> keys = a2.keys(); keys.hasNext(); keys = keys) {
                                    String next = keys.next();
                                    hashMap.put(next, a2.optString(next));
                                }
                            }
                            str3 = str8;
                            vk.b = tub.f(new Pair("creativeType", str4), new Pair("customReferenceData", customReferenceData), new Pair("impressionType", Byte.valueOf(impressionType)), new Pair("macros", hashMap), new Pair("isolateVerificationScripts", Boolean.valueOf(isolateVerificationScripts)));
                            linkedHashSet.add(vk);
                        } else {
                            str4 = "video";
                        }
                    }
                    it = b.getViewability().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            break;
                        }
                        Viewability next2 = it.next();
                        if (next2.getInmobi() != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            int a3 = Wk.a(next2.getInmobi().getTime());
                            if (a3 != -1) {
                                linkedHashMap2.put("time", Integer.valueOf(a3));
                            }
                            int a4 = Wk.a(next2.getInmobi().getView());
                            if (a4 != -1) {
                                linkedHashMap2.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, Integer.valueOf(a4));
                            }
                            int a5 = Wk.a(next2.getInmobi().getPixel());
                            if (a5 != -1) {
                                linkedHashMap2.put("pixel", Integer.valueOf(a5));
                            }
                            byte type = next2.getInmobi().getType();
                            linkedHashMap2.put("type", Integer.valueOf(type));
                            if (type == 2) {
                                if (next2.getInmobi().getFrame().length == 4) {
                                    linkedHashMap2.put("frame", next2.getInmobi().getFrame());
                                } else {
                                    linkedHashMap2.put("frame", new JSONArray("[0,0,0,0]"));
                                }
                            }
                            Vk vk2 = new Vk((byte) 2);
                            vk2.b = linkedHashMap2;
                            linkedHashSet.add(vk2);
                        }
                    }
                    com.inmobi.media.ads.network.common.model.Ad b2 = b(i);
                    String impressionId = b2 == null ? b2.getImpressionId() : null;
                    metaInfo = b.getMetaInfo();
                    if (metaInfo != null || (landingPageParams2 = metaInfo.getLandingPageParams()) == null || (landingPageParam2 = (LandingPageParam) CollectionsKt.a0(0, landingPageParams2)) == null || (r1 = landingPageParam2.getOpenMode()) == null) {
                        String str9 = "DEFAULT";
                    }
                    String str10 = str9;
                    Gi gi = new Gi(((TelemetryConfig) AbstractC3435g4.a.a(TelemetryConfig.class)).getMaxTemplateEvents());
                    metaInfo2 = b.getMetaInfo();
                    if (metaInfo2 != null || (landingPageParams = metaInfo2.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) CollectionsKt.a0(0, landingPageParams)) == null || (r1 = landingPageParam.getAParams()) == null) {
                        InlineParams inlineParams = new InlineParams(null, null, 0, 7, null);
                    }
                    inlineParams.setTargetBundleId(b.getBidBundle());
                    inlineParams.setPingMode(this.c.getInlineInstaller().getEffectivePingMode());
                    C3845w0 c3845w02 = this.l;
                    String t = t();
                    String impressionId2 = b.getImpressionId();
                    String str11 = impressionId2 != null ? "" : impressionId2;
                    String telemetryMetadataBlob = b.getTelemetryMetadataBlob();
                    String str12 = telemetryMetadataBlob != null ? "" : telemetryMetadataBlob;
                    C3725ra c3725ra = this.v;
                    int i2 = c3725ra == null ? c3725ra.b : 0;
                    com.inmobi.media.ads.network.common.model.Ad p = p();
                    String str13 = (p != null || (metaInfo3 = p.getMetaInfo()) == null || (creativeType = metaInfo3.getCreativeType()) == null) ? "" : creativeType;
                    com.inmobi.media.ads.network.common.model.Ad p2 = p();
                    String str14 = (p2 != null || (creativeId = p2.getCreativeId()) == null) ? "" : creativeId;
                    AdSet s = s();
                    return new C3638o0(str6, z2, j, z, creativeID, str3, str5, str, this, str7, linkedHashMap, Boolean.valueOf(z3), watermarkData, adQualityControl, u, linkedHashSet, impressionId, str10, new Bi(c3845w02, t, str11, str12, i2, str13, str14, s != null ? s.getIsRewarded() : false, i, this.z.j, gi, BuildConfig.FLAVOR, inlineParams), this.i);
                }
            }
        }
        j = j2;
        z = c;
        z2 = a;
        str3 = str8;
        it = b.getViewability().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        com.inmobi.media.ads.network.common.model.Ad b22 = b(i);
        if (b22 == null) {
        }
        metaInfo = b.getMetaInfo();
        if (metaInfo != null) {
        }
        String str92 = "DEFAULT";
        String str102 = str92;
        Gi gi2 = new Gi(((TelemetryConfig) AbstractC3435g4.a.a(TelemetryConfig.class)).getMaxTemplateEvents());
        metaInfo2 = b.getMetaInfo();
        if (metaInfo2 != null) {
        }
        InlineParams inlineParams2 = new InlineParams(null, null, 0, 7, null);
        inlineParams2.setTargetBundleId(b.getBidBundle());
        inlineParams2.setPingMode(this.c.getInlineInstaller().getEffectivePingMode());
        C3845w0 c3845w022 = this.l;
        String t2 = t();
        String impressionId22 = b.getImpressionId();
        if (impressionId22 != null) {
        }
        String telemetryMetadataBlob2 = b.getTelemetryMetadataBlob();
        if (telemetryMetadataBlob2 != null) {
        }
        C3725ra c3725ra2 = this.v;
        if (c3725ra2 == null) {
        }
        com.inmobi.media.ads.network.common.model.Ad p3 = p();
        if (p3 != null) {
        }
        com.inmobi.media.ads.network.common.model.Ad p22 = p();
        if (p22 != null) {
        }
        AdSet s2 = s();
        return new C3638o0(str6, z2, j, z, creativeID, str3, str5, str, this, str7, linkedHashMap, Boolean.valueOf(z3), watermarkData, adQualityControl, u, linkedHashSet, impressionId, str102, new Bi(c3845w022, t2, str11, str12, i2, str13, str14, s2 != null ? s2.getIsRewarded() : false, i, this.z.j, gi2, BuildConfig.FLAVOR, inlineParams2), this.i);
    }

    public final void b(Map map) {
        MetaInfo metaInfo;
        String creativeType;
        map.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - this.z.d));
        map.put("networkType", F5.g());
        map.put("plId", Long.valueOf(this.l.a));
        AdSet s = s();
        map.put("isRewarded", Boolean.valueOf(s != null ? s.getIsRewarded() : false));
        String str = this.l.e;
        if (str != null) {
            map.put("adType", str);
        }
        String str2 = this.l.f;
        if (str2 != null) {
            map.put("plType", str2);
        }
        C3725ra c3725ra = this.v;
        if (c3725ra != null) {
            map.put("retryCount", Integer.valueOf(c3725ra.b));
        }
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p != null && (metaInfo = p.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        a(p(), map);
        b("ServerError", map);
    }

    public final void c(short s) {
        long j;
        long elapsedRealtime;
        String str;
        MetaInfo metaInfo;
        String creativeType;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("submitAdLoadFailedEvent ", this, c3906y9, "m1");
        }
        HashMap hashMap = new HashMap();
        if (s == 2138 || s == 2109) {
            j = this.z.e;
            ku3 ku3Var = Hl.a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            C3742s1 c3742s1 = this.z;
            if (s == 2139) {
                j = c3742s1.g;
                ku3 ku3Var2 = Hl.a;
                elapsedRealtime = SystemClock.elapsedRealtime();
            } else {
                j = c3742s1.c;
                ku3 ku3Var3 = Hl.a;
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        hashMap.put(Payload.LATENCY, Long.valueOf(elapsedRealtime - j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p == null || (str = p.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad p2 = p();
        if (p2 != null && (metaInfo = p2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        C3725ra c3725ra = this.v;
        if (c3725ra != null) {
            hashMap.put("retryCount", Integer.valueOf(c3725ra.b));
        }
        AdSet s2 = s();
        if (s2 != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s2.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        a(p(), hashMap);
        c("AdLoadFailed", hashMap);
    }

    public final void d(short s) {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("submitAdShowFailed ", this, c3906y9, "m1");
        }
        HashMap hashMap = new HashMap();
        long j = this.z.f;
        ku3 ku3Var = Hl.a;
        hashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        AdSet s2 = s();
        if (s2 != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s2.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        a(q(), hashMap);
        c("AdShowFailed", hashMap);
    }

    public final void e(AbstractC3458h1 abstractC3458h1) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("adUnitEventListener setter ", this, c3906y9, "m1");
        }
        WeakReference weakReference = new WeakReference(abstractC3458h1);
        this.f = weakReference;
        AdSet s = s();
        C3302b0 c3302b0 = new C3302b0(weakReference, "int", s != null ? s.getIsRewarded() : false);
        this.u = c3302b0;
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3302b0.f = c3906y92;
        }
    }

    public final void f() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("destroyAllContainer ", this, c3906y9, "m1");
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            a(i, true);
        }
    }

    public final void g() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("doAdLoadWork ", this, c3906y9, "m1");
        }
        try {
            c((byte) 1);
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.d("m1", "AdUnit " + this + " state - LOADING");
            }
            I();
            if (((RootConfig) AbstractC3435g4.a.a(RootConfig.class)).getMonetizationDisabled()) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
                C3906y9 c3906y93 = this.i;
                if (c3906y93 != null) {
                    c3906y93.b("m1", "Monetization is Disabled");
                    return;
                }
                return;
            }
            if (d((byte) 0)) {
                this.g.a(this.a, new C3484i1(this, null));
                C3906y9 c3906y94 = this.i;
                if (c3906y94 != null) {
                    c3906y94.a("m1", "Fresh ad requested");
                }
            }
        } catch (Exception e) {
            C3906y9 c3906y95 = this.i;
            if (c3906y95 != null) {
                wv8.x("Load failed with unexpected error: ", e.getMessage(), c3906y95, "m1");
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e));
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2000);
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void h(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("onRenderViewSignaledAdReady ", this, c3906y9, "m1");
        }
        if (this.k || o() == null) {
            c((short) 2186);
            return;
        }
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new wem(10, this, gestureDetectorOnGestureListenerC3889xi));
        } else {
            c((short) 2187);
        }
    }

    public abstract void i();

    @Override // com.inmobi.media.AbstractC3941zi
    public void i(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.a("m1", "RenderView visible, for index " + this.h.indexOf(gestureDetectorOnGestureListenerC3889xi) + " " + this);
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void j(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        byte b = this.b;
        if (b == 2) {
            V();
            b((byte) 1);
            AbstractC3458h1 n = n();
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
            if (n != null) {
                n.a(this, inMobiAdRequestStatus);
            } else {
                C3906y9 c3906y9 = this.i;
                if (c3906y9 != null) {
                    c3906y9.a();
                }
            }
            c((short) 2238);
            gestureDetectorOnGestureListenerC3889xi.b();
            return;
        }
        if (b == 4) {
            n(gestureDetectorOnGestureListenerC3889xi);
            gestureDetectorOnGestureListenerC3889xi.b();
            b((byte) 4);
        } else {
            if (b == 6 || b == 7) {
                o(gestureDetectorOnGestureListenerC3889xi);
                return;
            }
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.b("m1", "onUnloadCalled - invalid state - " + ((int) this.b));
            }
        }
    }

    public final void k(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC3889xi);
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.a("m1", "fireLoadAdTokenUrlSuccessful : " + indexOf + " " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(indexOf);
        if (b != null) {
            for (String str : Ti.a(b, "load_ad_token_url")) {
                E3 e3 = E3.a;
                C3906y9 c3906y92 = this.i;
                str.getClass();
                E3.a(str, true, c3906y92);
            }
        }
    }

    public final int l(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("getCurrentRenderingPodAdIndex ", this, c3906y9, "m1");
        }
        if (!this.s) {
            return -1;
        }
        int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC3889xi);
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.c("m1", "getCurrentRenderingPodAdIndex " + indexOf);
        }
        return indexOf;
    }

    public abstract String m();

    public void m(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        Xh xh;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.a("m1", "Render view signaled ad ready, for index " + this.h.indexOf(gestureDetectorOnGestureListenerC3889xi) + " " + this);
        }
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.a("m1", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        C3906y9 c3906y93 = this.i;
        if (c3906y93 == null || (xh = c3906y93.a) == null) {
            return;
        }
        xh.a();
    }

    public void n(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        int l;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "onAdUnloadedAfterLoadSuccess");
        }
        if (!this.s || (l = l(gestureDetectorOnGestureListenerC3889xi)) <= this.p) {
            V();
        } else {
            this.r.remove(Integer.valueOf(l));
        }
    }

    public void o(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "onAdUnloadedAfterShowSuccess");
        }
        gestureDetectorOnGestureListenerC3889xi.n();
        b((byte) 4);
    }

    public final com.inmobi.media.ads.network.common.model.Ad q() {
        return this.s ? b(this.p) : b(0);
    }

    public abstract GestureDetectorOnGestureListenerC3889xi r();

    public final AdSet s() {
        List<AdSet> adSets;
        AdResponse adResponse = this.m;
        if (adResponse == null || (adSets = adResponse.getAdSets()) == null) {
            return null;
        }
        return (AdSet) CollectionsKt.firstOrNull(adSets);
    }

    public final String t() {
        String markupType;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("markupType getter ", this, c3906y9, "m1");
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        return (b == null || (markupType = b.getMarkupType()) == null) ? "unknown" : markupType;
    }

    public abstract byte u();

    public final String v() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("getPodAdContext ", this, c3906y9, "m1");
        }
        if (this.s) {
            return this.t;
        }
        return null;
    }

    public final JSONArray w() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("getRenderableAdIndexes ", this, c3906y9, "m1");
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.r.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            jSONArray.put(((Number) next).intValue());
        }
        return jSONArray;
    }

    public final long x() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("getShowTimeStamp ", this, c3906y9, "m1");
        }
        if (this.s) {
            return this.q;
        }
        return -1L;
    }

    public final String y() {
        String telemetryMetadataBlob;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet s = s();
        com.inmobi.media.ads.network.common.model.Ad ad = (s == null || (ads = s.getAds()) == null) ? null : (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.firstOrNull(ads);
        return (ad == null || (telemetryMetadataBlob = ad.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }

    public final TimeoutConfigurations z() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("timeOutConfiguration getter ", this, c3906y9, "m1");
        }
        AdConfig adConfig = this.c;
        adConfig.getClass();
        return adConfig.getTimeouts();
    }

    public final Context o() {
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final com.inmobi.media.ads.network.common.model.Ad p() {
        if (this.s) {
            return b(this.o);
        }
        return b(0);
    }

    public final AbstractC3458h1 n() {
        C3906y9 c3906y9;
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            w1l.C("adUnitEventListener getter ", this, c3906y92, "m1");
        }
        AbstractC3458h1 abstractC3458h1 = (AbstractC3458h1) this.f.get();
        if (abstractC3458h1 == null && (c3906y9 = this.i) != null) {
            c3906y9.b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return abstractC3458h1;
    }

    public final void e() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("clearAdPods ", this, c3906y9, "m1");
        }
        if (this.s) {
            f();
            this.h.clear();
            this.o = 0;
            this.p = 0;
            this.r.clear();
        }
    }

    public HashMap l() {
        return new HashMap();
    }

    public final void h() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("fireAdServedBeacon ", this, c3906y9, "m1");
        }
        GestureDetectorOnGestureListenerC3889xi j = j();
        if (j == null) {
            return;
        }
        j.t();
    }

    public final void e(int i) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("resetCurrentRenderingIndex ", this, c3906y9, "m1");
        }
        this.p = i;
    }

    public static String e(short s) {
        return ljg.j(s, "SDK_");
    }

    public static final Oo e(AbstractC3587m1 abstractC3587m1) {
        com.inmobi.media.ads.network.common.model.Ad b = abstractC3587m1.b(0);
        if (b == null || abstractC3587m1.A()) {
            b = null;
        }
        return new Oo(b, abstractC3587m1.i);
    }

    public final AdMetaInfo k() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("adMetaInfo getter ", this, c3906y9, "m1");
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        if (b != null) {
            return new AdMetaInfo(b.getCreativeId(), b.getTransaction());
        }
        return null;
    }

    public final GestureDetectorOnGestureListenerC3889xi j() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("adMarkupContainer getter ", this, c3906y9, "m1");
        }
        byte b = this.b;
        String t = t();
        if (Intrinsics.c(t, "html")) {
            if (b == 0 || 1 == b || 3 == b || 8 == b) {
                return null;
            }
            return r();
        }
        if (!Intrinsics.c(t, "htmlUrl") || b == 0 || 1 == b || 3 == b || 8 == b) {
            return null;
        }
        return r();
    }

    public final void b(AbstractC3458h1 abstractC3458h1) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("onAdShowFailed ", this, c3906y9, "m1");
        }
        d((short) 85);
        abstractC3458h1.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        r3 = kotlin.text.StringsKt__StringsKt.split$default(r3, new java.lang.String[]{"x"}, false, 2, 2, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair b(String str) {
        List split$default;
        if (str == null || split$default == null) {
            return null;
        }
        String str2 = (String) CollectionsKt.a0(0, split$default);
        Integer intOrNull = str2 != null ? StringsKt.toIntOrNull(str2) : null;
        String str3 = (String) CollectionsKt.a0(1, split$default);
        Integer intOrNull2 = str3 != null ? StringsKt.toIntOrNull(str3) : null;
        if (intOrNull == null || intOrNull2 == null) {
            return null;
        }
        return new Pair(intOrNull, intOrNull2);
    }

    public final void b(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        inMobiAdRequestStatus.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("onAdFetchFailed ", this, c3906y9, "m1");
        }
        if (!this.k && o() != null && this.b != 3) {
            a(inMobiAdRequestStatus, s);
            return;
        }
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.b("m1", "callback ignored - isDestroyed - " + this.k + " context - " + o() + " state- " + ((int) this.b));
        }
    }

    public final void b(InMobiAdRequestStatus inMobiAdRequestStatus, boolean z, short s) {
        inMobiAdRequestStatus.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.b("m1", "handleAdLoadFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.b == 1 && z) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.b("m1", "load failed - " + ((int) s));
            }
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.d("m1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC3458h1 n = n();
        if (n != null) {
            n.a(this, inMobiAdRequestStatus);
        } else {
            C3906y9 c3906y94 = this.i;
            if (c3906y94 != null) {
                c3906y94.a();
            }
        }
        if (s != 0) {
            c(s);
        }
    }

    public final void d(int i) {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("initializeHtmlAdContainer ", this, c3906y9, "m1");
        }
        Context o = o();
        if (o == null) {
            return;
        }
        try {
            if (this.h.get(i) != null && ((gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) this.h.get(i)) == null || !gestureDetectorOnGestureListenerC3889xi.N.get())) {
                return;
            }
            com.inmobi.media.ads.network.common.model.Ad b = b(i);
            C3638o0 a = a(i);
            GestureDetectorOnGestureListenerC3889xi a2 = ((Jo) this.B.getValue()).a(new Yi("adUnit-" + i, BuildConfig.FLAVOR), o, (short) 0, a, this.c);
            a(a2, a.p);
            this.h.set(i, a2);
            a2.a(this);
            a2.a(b);
        } catch (Exception e) {
            a((GestureDetectorOnGestureListenerC3889xi) this.h.get(this.o), (short) 2136, e((short) 2136));
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.a("m1", "Exception while initializing WebView", e);
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void g(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.a("m1", "RenderView completed loading ad content, for index " + this.h.indexOf(gestureDetectorOnGestureListenerC3889xi) + " " + this);
        }
    }

    public static final void b(AbstractC3587m1 abstractC3587m1) {
        if (6 == abstractC3587m1.b) {
            abstractC3587m1.a((short) 2158);
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void b(HashMap hashMap) {
        hashMap.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("onAdRewardActionCompleted ", this, c3906y9, "m1");
        }
        if (this.k || o() == null) {
            return;
        }
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.a("m1", "Ad reward action completed. Params:" + hashMap);
        }
        AbstractC3458h1 n = n();
        if (n != null) {
            n.b(hashMap);
        }
    }

    public final void b(short s) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("submitAdLoadDroppedAtSDK ", this, c3906y9, "m1");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        c(hashMap);
        c("AdLoadDroppedAtSDK", hashMap);
    }

    public final com.inmobi.media.ads.network.common.model.Ad b(int i) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads3;
        toString();
        AdSet s = s();
        if (CollectionsKt.R((s == null || (ads3 = s.getAds()) == null) ? km5.a : kotlin.collections.b.h(ads3), Integer.valueOf(i))) {
            AdSet s2 = s();
            if (s2 == null || (ads2 = s2.getAds()) == null) {
                return null;
            }
            return ads2.get(i);
        }
        AdSet s3 = s();
        if (s3 == null || (ads = s3.getAds()) == null) {
            return null;
        }
        return ads.peekFirst();
    }

    public final void d(AbstractC3458h1 abstractC3458h1) {
        abstractC3458h1.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("onLoadSuccess ", this, c3906y9, "m1");
        }
        AdMetaInfo k = k();
        if (k == null) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.b("m1", "load success - ad unit null");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        C3906y9 c3906y93 = this.i;
        if (c3906y93 != null) {
            c3906y93.a("m1", "callback - onAdLoadSucceeded");
        }
        abstractC3458h1.c(k);
    }

    public final void b(String str, Map map) {
        com.inmobi.media.ads.network.common.model.Ad p;
        MetaInfo metaInfo;
        String creativeType;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "onTelemetryEvent " + this + " adState=" + ((int) this.b));
        }
        if (this.b != 3) {
            a(str, map);
            if ((Intrinsics.c(str, "ServerFill") || Intrinsics.c(str, "ServerError")) && (p = p()) != null && (metaInfo = p.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
                map.put("creativeType", creativeType);
            }
            c(str, map);
        }
    }

    public void d() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("clear ", this, c3906y9, "m1");
        }
        if (this.k) {
            return;
        }
        this.k = true;
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        e();
        C3725ra c3725ra = this.v;
        if (c3725ra != null) {
            c3725ra.b = 0;
        }
        J();
        c((byte) 0);
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.d("m1", "AdUnit " + this + " state - CREATED");
        }
        Ka ka = this.g;
        String str = this.a;
        ka.getClass();
        str.getClass();
        try {
            List list = (List) ka.c.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((yda) it.next()).e(null);
                }
            }
            List list2 = (List) ka.c.remove(str);
            if (list2 != null) {
                list2.clear();
            }
        } catch (Exception unused) {
        }
        this.m = null;
        this.s = false;
    }

    public final void b(com.inmobi.media.ads.network.common.model.Ad ad) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("updateAd ", this, c3906y9, "m1");
        }
        AdSet s = s();
        if (s == null || (ads = s.getAds()) == null) {
            return;
        }
        ads.set(0, ad);
    }

    public final void b(byte b) {
        Nk nk;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("cancelTimer ", this, c3906y9, "m1");
        }
        if (b == 1 && (nk = this.n) != null) {
            nk.a((byte) 2);
        }
        Nk nk2 = this.n;
        if (nk2 != null) {
            nk2.a(b);
        }
    }

    public final void b(int i, boolean z) {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("fireAdPodShowResult ", this, c3906y9, "m1");
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.h;
        copyOnWriteArrayList.getClass();
        if (i < 0 || i >= copyOnWriteArrayList.size() || (gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) this.h.get(i)) == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3889xi.b(z);
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void b(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        MetaInfo metaInfo;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("fireClickTracker ", this, c3906y9, "m1");
        }
        gestureDetectorOnGestureListenerC3889xi.getClass();
        com.inmobi.media.ads.network.common.model.Ad b = b(this.h.indexOf(gestureDetectorOnGestureListenerC3889xi));
        if (Intrinsics.c((b == null || (metaInfo = b.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || b == null) {
            return;
        }
        for (String str : Ti.a(b, "click")) {
            E3 e3 = E3.a;
            C3906y9 c3906y92 = this.i;
            str.getClass();
            E3.a(str, true, c3906y92);
        }
    }

    public final void c(byte b) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.d("m1", dmi.k(this.b, b, "STATE UPDATE: from ", " to "));
        }
        this.b = b;
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void d(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        if (this.C) {
            return;
        }
        this.C = true;
        Hi hi = gestureDetectorOnGestureListenerC3889xi.e0;
        if (hi != null) {
            Map a = hi.a();
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("AttachedToWindow", a, EnumC3943zk.SDK);
        }
    }

    public final boolean c(int i) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "getAllowAutoRedirectionForIndex " + this + " index - " + i);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(i);
        return b != null && b.getAllowAutoRedirection();
    }

    public final void c(AbstractC3458h1 abstractC3458h1) {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        abstractC3458h1.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("onFetchSuccess ", this, c3906y9, "m1");
        }
        HashMap hashMap = new HashMap();
        c(hashMap);
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p == null || (str = p.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        long j = this.z.h;
        ku3 ku3Var = Hl.a;
        hashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("metadataBlob", y());
        C3725ra c3725ra = this.v;
        if (c3725ra != null) {
            hashMap.put("retryCount", Integer.valueOf(c3725ra.b));
        }
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        com.inmobi.media.ads.network.common.model.Ad p2 = p();
        if (p2 != null && (metaInfo = p2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        c("ParseSuccess", hashMap);
        AdMetaInfo k = k();
        C3906y9 c3906y92 = this.i;
        if (k == null) {
            if (c3906y92 != null) {
                c3906y92.b("m1", "ad meta info null. fail");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
        } else {
            if (c3906y92 != null) {
                c3906y92.a("m1", "callback - onAdFetchSuccess");
            }
            abstractC3458h1.b(k);
        }
    }

    public static final Jo d(AbstractC3587m1 abstractC3587m1) {
        return new Jo(abstractC3587m1.i);
    }

    public final void b(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        str.getClass();
        int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC3889xi);
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.b("m1", "fireLoadAdTokenUrlFailed : " + indexOf + " " + this + " errorCode: " + str);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(indexOf);
        if (b != null) {
            List<String> a = Ti.a(b, "load_ad_token_url_failure");
            boolean contains = this.c.getDisableAppendingKeysForBeacons().contains("load_ad_token_url_failure");
            for (String str2 : a) {
                if (!contains) {
                    Uri parse = Uri.parse(str2);
                    parse.getClass();
                    str2 = parse.buildUpon().appendQueryParameter("error", str).build().toString();
                    str2.getClass();
                }
                E3 e3 = E3.a;
                C3906y9 c3906y92 = this.i;
                str2.getClass();
                E3.a(str2, true, c3906y92);
            }
        }
    }

    public final boolean d(byte b) {
        int b0;
        Integer num;
        long j;
        Integer num2;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("startTimer ", this, c3906y9, "m1");
        }
        if (b == 0) {
            Ac ac = this.w;
            if (ac != null && (num2 = ac.d) != null) {
                b0 = num2.intValue();
                j = b0;
            }
            j = 15000;
        } else if (b == 1) {
            Ac ac2 = this.w;
            if (ac2 != null) {
                b0 = ac2.c;
                j = b0;
            }
            j = 15000;
        } else {
            if (b == 2) {
                Ac ac3 = this.w;
                if (ac3 != null && (num = ac3.e) != null) {
                    b0 = num.intValue();
                }
                j = 15000;
            } else if (b == 4) {
                TimeoutConfigurations timeoutConfigurations = this.e;
                timeoutConfigurations.getClass();
                b0 = timeoutConfigurations.b0();
            } else {
                C3906y9 c3906y92 = this.i;
                if (c3906y92 != null) {
                    c3906y92.b("m1", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                }
                return false;
            }
            j = b0;
        }
        Nk nk = this.n;
        return nk != null && nk.a(b, j);
    }

    public final void c(String str) {
        str.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("setPodAdContext ", this, c3906y9, "m1");
        }
        if (this.s) {
            this.t = str;
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void c() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("onAdScreenDisplayFailed ", this, c3906y9, "m1");
        }
        if (this.k || o() == null) {
            return;
        }
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.b("m1", "Ad failed to display");
        }
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new fom(this, 0));
        }
    }

    public final void c(HashMap hashMap) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("constructTelemetryPayload ", this, c3906y9, "m1");
        }
        hashMap.put("adType", m());
        hashMap.put("networkType", F5.g());
        hashMap.put("plId", Long.valueOf(this.l.a));
        String str = this.l.f;
        if (str != null) {
            hashMap.put("plType", str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0021, code lost:
    
        if (r3 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(AbstractC3587m1 abstractC3587m1) {
        AdConfig.OmidConfig omidConfig;
        Sf sf = Rf.a;
        Context o = abstractC3587m1.o();
        AdConfig adConfig = abstractC3587m1.c;
        sf.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(o);
                return;
            }
            if (adConfig != null) {
                try {
                    AdConfig.ViewabilityConfig viewability = adConfig.getViewability();
                    if (viewability != null) {
                        omidConfig = viewability.getOmidConfig();
                    }
                } catch (Exception e) {
                    joa joaVar = AbstractC3286aa.a;
                    AbstractC3286aa.a(new Q2(e));
                    return;
                }
            }
            omidConfig = new AdConfig.OmidConfig();
            sf.b = Partner.createPartner(omidConfig.getPartnerKey(), sf.a());
        } catch (Exception e2) {
            joa joaVar2 = AbstractC3286aa.a;
            AbstractC3776t9.a(e2);
        }
    }

    public final void c(String str, Map map) {
        str.getClass();
        map.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("submitTelemetryEvent ", this, c3906y9, "m1");
        }
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b(str, map, EnumC3943zk.SDK);
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void c(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        MetaInfo metaInfo;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("fireImpressionTracker ", this, c3906y9, "m1");
        }
        gestureDetectorOnGestureListenerC3889xi.getClass();
        com.inmobi.media.ads.network.common.model.Ad b = b(this.h.indexOf(gestureDetectorOnGestureListenerC3889xi));
        if (Intrinsics.c((b == null || (metaInfo = b.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || b == null) {
            return;
        }
        for (String str : Ti.a(b, "impression")) {
            Fk telemetryOnAdImpression = gestureDetectorOnGestureListenerC3889xi.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            telemetryOnAdImpression.f = "adResponseTracker";
            E3 e3 = E3.a;
            C3276a0 c3276a0 = new C3276a0(this.u, telemetryOnAdImpression);
            C3906y9 c3906y92 = this.i;
            str.getClass();
            Ug.a(Rg.HIGHEST, new C3848w3(str, c3906y92, c3276a0, null));
        }
    }

    public static final void a(AbstractC3587m1 abstractC3587m1, W w) {
        abstractC3587m1.getClass();
        if (w instanceof C3778tb) {
            C3742s1 c3742s1 = abstractC3587m1.z;
            c3742s1.getClass();
            c3742s1.d = SystemClock.elapsedRealtime();
            return;
        }
        if (w instanceof Yf) {
            C3742s1 c3742s12 = abstractC3587m1.z;
            c3742s12.getClass();
            c3742s12.h = SystemClock.elapsedRealtime();
        } else {
            if (w instanceof C3553kj) {
                Map map = ((C3553kj) w).a;
                LinkedHashMap i = tub.i(new Pair(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - abstractC3587m1.z.d)), new Pair("networkType", F5.g()), new Pair("plId", Long.valueOf(abstractC3587m1.l.a)));
                i.putAll(map);
                String str = abstractC3587m1.l.f;
                if (str != null) {
                    i.put("plType", str);
                }
                String str2 = abstractC3587m1.l.e;
                if (str2 != null) {
                    i.put("adType", str2);
                }
                abstractC3587m1.b("ServerFill", i);
                return;
            }
            zzl.b();
        }
    }

    public final void a(Context context, C3845w0 c3845w0, AbstractC3349cl abstractC3349cl) {
        C3845w0 c3845w02;
        String str;
        String str2;
        C3906y9 c3906y9;
        C3906y9 c3906y92;
        C3906y9 c3906y93;
        context.getClass();
        c3845w0.getClass();
        toString();
        a(context);
        this.f = new WeakReference(abstractC3349cl);
        Nb nb = AbstractC3294ai.a;
        AbstractC3294ai.a(abstractC3349cl, this.i);
        WeakReference weakReference = this.f;
        String m = m();
        AdSet s = s();
        this.u = new C3302b0(weakReference, m, s != null ? s.getIsRewarded() : false);
        this.l = c3845w0;
        B();
        C3906y9 c3906y94 = this.i;
        if (c3906y94 != null) {
            c3906y94.c("m1", "initInternetAvailabilityAdRetry");
        }
        if (this.c == null && (c3906y93 = this.i) != null) {
            c3906y93.c("m1", "adConfig is null");
            Unit unit = Unit.a;
        }
        if (this.l.f == null && (c3906y92 = this.i) != null) {
            c3906y92.c("m1", "placement.placementType is null");
            Unit unit2 = Unit.a;
        }
        if (this.l.e == null && (c3906y9 = this.i) != null) {
            c3906y9.c("m1", "placement.adType is null");
            Unit unit3 = Unit.a;
        }
        AdConfig adConfig = this.c;
        if (adConfig != null && (str = (c3845w02 = this.l).f) != null && (str2 = c3845w02.e) != null) {
            Ac a = AbstractC3935zc.a(adConfig.getTimeouts().a0(), str, str2, AbstractC3450gj.b);
            this.v = new C3725ra(a);
            this.w = a;
        }
        if (R5.h == null) {
            R5.h = Float.valueOf(new TextView(context).getTextSize());
        }
        M();
    }

    public final void a(Context context) {
        context.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("setContext ", this, c3906y9, "m1");
        }
        this.d = new WeakReference(context);
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, boolean z) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "onRenderProcessGone didCrash=" + z + " state=" + ((int) this.b));
        }
        byte b = this.b;
        if (b == 0) {
            short s = z ? (short) 2214 : (short) 2213;
            K();
            gestureDetectorOnGestureListenerC3889xi.a(z, s);
            return;
        }
        if (b == 1) {
            short s2 = z ? (short) 2216 : (short) 2215;
            K();
            c(s2);
            AbstractC3458h1 n = n();
            if (n != null) {
                n.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b == 3) {
            gestureDetectorOnGestureListenerC3889xi.a(z, z ? (short) 2226 : (short) 2225);
            return;
        }
        if (b == 2) {
            K();
            c(z ? (short) 2218 : (short) 2217);
            AbstractC3458h1 n2 = n();
            if (n2 != null) {
                n2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b == 4 || b == 6 || b == 7 || b != 8) {
            return;
        }
        gestureDetectorOnGestureListenerC3889xi.a(z, z ? (short) 2240 : (short) 2241);
    }

    public final boolean a(com.inmobi.media.ads.network.common.model.Ad ad) {
        Short sh;
        Pair pair;
        P0 features;
        boolean enableImmersive = this.c.getRendering().getEnableImmersive();
        boolean z = R5.i;
        boolean a = (ad == null || (features = ad.getFeatures()) == null) ? false : features.a(false);
        boolean z2 = enableImmersive && z && a;
        if (!z2) {
            StringBuilder sb = new StringBuilder("Immersive not supported on");
            BitSet bitSet = new BitSet(3);
            ArrayList arrayList = new ArrayList();
            if (!enableImmersive) {
                arrayList.add(" config");
                bitSet.set(0);
            }
            if (!z) {
                arrayList.add(" device");
                bitSet.set(1);
            }
            if (!a) {
                arrayList.add(" ad");
                bitSet.set(2);
            }
            sb.append(CollectionsKt.f0(arrayList, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
            if (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) {
                sh = (short) 2202;
            } else if (bitSet.get(0) && bitSet.get(1)) {
                sh = (short) 2200;
            } else if (bitSet.get(0) && bitSet.get(2)) {
                sh = (short) 2199;
            } else if (bitSet.get(1) && bitSet.get(2)) {
                sh = (short) 2201;
            } else if (bitSet.get(0)) {
                sh = (short) 2196;
            } else if (bitSet.get(1)) {
                sh = (short) 2197;
            } else {
                sh = bitSet.get(2) ? (short) 2198 : null;
            }
            short shortValue = sh != null ? sh.shortValue() : (short) -1;
            if (shortValue == -1) {
                pair = new Pair("Invalid Reason", (short) -1);
            } else {
                pair = new Pair(sb.toString(), Short.valueOf(shortValue));
            }
            String str = (String) pair.a;
            short shortValue2 = ((Number) pair.b).shortValue();
            HashMap l = com.appsflyer.internal.i.l("reason", str);
            l.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(shortValue2));
            c("ImmersiveNotSupported", l);
        }
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            StringBuilder k = w1l.k("Immersive support - config, device, adResponse - (", enableImmersive, " ", z, " ");
            k.append(a);
            k.append(")");
            c3906y9.a("m1", k.toString());
        }
        return z2;
    }

    public final void a(AbstractC3458h1 abstractC3458h1) {
        abstractC3458h1.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("onAdDisplayed ", this, c3906y9, "m1");
        }
        AdMetaInfo k = k();
        C3906y9 c3906y92 = this.i;
        if (k == null) {
            if (c3906y92 != null) {
                c3906y92.b("m1", "callback onAdDisplayed failed. ad meta info is null");
            }
            b(abstractC3458h1);
        } else {
            if (c3906y92 != null) {
                c3906y92.a("m1", "callback - onAdDisplayed");
            }
            abstractC3458h1.a(k);
        }
    }

    public final void a(AdResponse adResponse) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        adResponse.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("handleAdFetchSuccessful ", this, c3906y9, "m1");
        }
        if (!this.k && o() != null) {
            if (this.b == 1) {
                this.m = adResponse;
                AdSet s = s();
                this.s = s != null ? s.getIsPod() : false;
                this.h = new CopyOnWriteArrayList();
                AdSet s2 = s();
                if (s2 != null && (ads = s2.getAds()) != null) {
                    for (com.inmobi.media.ads.network.common.model.Ad ad : ads) {
                        this.h.add(null);
                    }
                }
                G();
                return;
            }
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.b("m1", "incorrect state - " + ((int) this.b));
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
            return;
        }
        c((short) 2185);
        C3906y9 c3906y93 = this.i;
        if (c3906y93 != null) {
            c3906y93.b("m1", "adUnit is destroyed");
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("handleMarkupFetchFailure ", this, c3906y9, "m1");
        }
        try {
            if (this.b == 1) {
                C3906y9 c3906y92 = this.i;
                if (c3906y92 != null) {
                    c3906y92.b("m1", "Failed to fetch ad for placement id: " + this.l + ", reason - " + inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
                }
                String str = "MarkupFetch failed reason is: " + inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String();
                C3906y9 c3906y93 = this.i;
                if (c3906y93 != null) {
                    c3906y93.b("m1", str);
                }
                C3906y9 c3906y94 = this.i;
                if (c3906y94 != null) {
                    c3906y94.d("m1", "AdUnit " + this + " state - FAILED");
                }
                c((byte) 3);
                b((byte) 1);
                if (s != 0) {
                    b(s);
                }
                AbstractC3458h1 n = n();
                if (n != null) {
                    n.a(inMobiAdRequestStatus);
                    return;
                }
                C3906y9 c3906y95 = this.i;
                if (c3906y95 != null) {
                    c3906y95.a();
                }
            }
        } catch (Exception e) {
            C3906y9 c3906y96 = this.i;
            if (c3906y96 != null) {
                c3906y96.a("m1", "onAdFetchFailed with error: ", e);
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
    }

    public final void a(short s) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.b("m1", "handleAdShowFailure " + this + " errorCode - " + ((int) s));
        }
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.d("m1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 4);
        AbstractC3458h1 n = n();
        if (n != null) {
            n.b();
        }
        if (s != 0) {
            d(s);
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, boolean z, short s) {
        inMobiAdRequestStatus.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.b("m1", "handleAdFetchFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.b == 3 && z) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.d("m1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC3458h1 n = n();
        if (n != null) {
            n.a(this, inMobiAdRequestStatus);
        }
        if (s != 0) {
            b(s);
        }
    }

    public final void a(Map map) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.l.c = map;
    }

    public static final Unit a(AbstractC3587m1 abstractC3587m1) {
        C3742s1 c3742s1 = abstractC3587m1.z;
        c3742s1.getClass();
        c3742s1.e = SystemClock.elapsedRealtime();
        abstractC3587m1.g();
        return Unit.a;
    }

    public static final Unit a(AbstractC3587m1 abstractC3587m1, EnumC3489i6 enumC3489i6) {
        short s;
        enumC3489i6.getClass();
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        enumC3489i6.getClass();
        int ordinal = enumC3489i6.ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                switch (ordinal) {
                    case 12:
                        s = 2101;
                        break;
                    case 13:
                        s = 2102;
                        break;
                    case 14:
                        s = 2103;
                        break;
                    case 15:
                        s = 2104;
                        break;
                    case 16:
                        s = 2105;
                        break;
                }
            } else {
                s = 2228;
            }
            abstractC3587m1.a(inMobiAdRequestStatus, true, s);
            return Unit.a;
        }
        s = 2100;
        abstractC3587m1.a(inMobiAdRequestStatus, true, s);
        return Unit.a;
    }

    public final void a(Function0 function0, Function1 function1) {
        function0.getClass();
        function1.getClass();
        C3906y9 c3906y9 = this.i;
        Object obj = null;
        if (c3906y9 != null) {
            C3725ra c3725ra = this.v;
            c3906y9.c("m1", "loadWithRetry " + (c3725ra != null ? Integer.valueOf(c3725ra.b) : null));
        }
        C3725ra c3725ra2 = this.v;
        if (c3725ra2 != null) {
            EnumC3489i6 a = AbstractC3420ff.a();
            if (a == null) {
                obj = Xf.a;
            } else {
                int i = c3725ra2.b + 1;
                c3725ra2.b = i;
                if (i >= c3725ra2.a.b) {
                    obj = new C3469hc(a);
                } else {
                    obj = Dh.a;
                }
            }
        }
        if (obj instanceof C3469hc) {
            function1.invoke(((C3469hc) obj).a);
            return;
        }
        if (obj instanceof Xf) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.c("m1", "load with retry success");
            }
            function0.invoke();
            return;
        }
        if (obj instanceof Dh) {
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.c("m1", "load failed, retrying");
            }
            this.x.postDelayed(new zol(8, this, function0, function1), this.w != null ? r6.a : 1000L);
            return;
        }
        if (obj == null) {
            C3906y9 c3906y94 = this.i;
            if (c3906y94 != null) {
                c3906y94.c("m1", "shouldProceedToLoad result null. starting as if we have internet.");
            }
            function0.invoke();
            return;
        }
        zzl.b();
    }

    public static final void a(AbstractC3587m1 abstractC3587m1, Function0 function0, Function1 function1) {
        C3906y9 c3906y9 = abstractC3587m1.i;
        if (c3906y9 != null) {
            C3725ra c3725ra = abstractC3587m1.v;
            c3906y9.c("m1", "Loading from retry Handler " + (c3725ra != null ? Integer.valueOf(c3725ra.b) : null));
        }
        abstractC3587m1.a(function0, function1);
    }

    public void a(byte[] bArr) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("load response ", this, c3906y9, "m1");
        }
        C3742s1 c3742s1 = this.z;
        c3742s1.getClass();
        c3742s1.c = SystemClock.elapsedRealtime();
        if (C()) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.a("m1", "isBlockingStateForLoadWithResponse - blocking");
                return;
            }
            return;
        }
        if (bArr != null && bArr.length != 0) {
            c((byte) 1);
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.d("m1", "AdUnit " + this + " state - LOADING");
            }
            this.g.a(this.a, new C3535k1(bArr, this, null));
            return;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
        C3906y9 c3906y94 = this.i;
        if (c3906y94 != null) {
            c3906y94.a("m1", "null response. failing");
        }
    }

    public static final void a(AbstractC3587m1 abstractC3587m1, Y y) {
        Objects.toString(y);
        V v = y.b;
        if (v instanceof C3579lj) {
            abstractC3587m1.getClass();
            LinkedHashMap i = tub.i(new Pair(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - abstractC3587m1.z.d)), new Pair("networkType", F5.g()), new Pair("plId", Long.valueOf(abstractC3587m1.l.a)));
            String str = abstractC3587m1.l.f;
            if (str != null) {
                i.put("plType", str);
            }
            String str2 = abstractC3587m1.l.e;
            if (str2 != null) {
                i.put("adType", str2);
            }
            abstractC3587m1.b("ServerNoFill", i);
            abstractC3587m1.b(y.a, (short) 0);
            return;
        }
        if (v instanceof R6) {
            abstractC3587m1.b(y.a, ((R6) v).a);
            return;
        }
        if (v instanceof S6) {
            abstractC3587m1.b((Map) tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(((S6) v).a))));
            abstractC3587m1.b(y.a, (short) 2205);
        } else if (v instanceof C3527jj) {
            abstractC3587m1.b(((C3527jj) v).a);
            abstractC3587m1.b(y.a, (short) 0);
        } else {
            zzl.b();
        }
    }

    public static final void a(AbstractC3587m1 abstractC3587m1, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        abstractC3587m1.m(gestureDetectorOnGestureListenerC3889xi);
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str) {
        Handler handler;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        str.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("onRenderViewSignaledAdFailed ", this, c3906y9, "m1");
        }
        if (this.k || o() == null || (handler = this.j) == null) {
            return;
        }
        handler.post(new zol(7, this, gestureDetectorOnGestureListenerC3889xi, str));
    }

    public static final void a(AbstractC3587m1 abstractC3587m1, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str) {
        abstractC3587m1.a(gestureDetectorOnGestureListenerC3889xi, (short) 2137, str);
    }

    public void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, short s, String str) {
        str.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.b("m1", "Render view signaled ad failed, for index " + this.h.indexOf(gestureDetectorOnGestureListenerC3889xi) + " " + this);
        }
        if (gestureDetectorOnGestureListenerC3889xi == null || !Intrinsics.c(gestureDetectorOnGestureListenerC3889xi.getMarkupType(), "htmlUrl")) {
            return;
        }
        b(gestureDetectorOnGestureListenerC3889xi, str);
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(HashMap hashMap) {
        hashMap.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("onAdInteraction ", this, c3906y9, "m1");
        }
        if (this.k || o() == null) {
            return;
        }
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.a("m1", "Ad interaction. Params: " + hashMap);
        }
        AbstractC3458h1 n = n();
        if (n != null) {
            n.a(hashMap);
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(Fk fk) {
        Gk gk;
        AtomicBoolean atomicBoolean;
        fk.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("onImpressionFiredFromTemplate ", this, c3906y9, "m1");
        }
        fk.f = "imraid_impressionFired";
        if (!this.k && o() != null) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.a("m1", "onImpressionFiredFromTemplate");
            }
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new wem(11, this, fk));
                return;
            }
            return;
        }
        C3742s1 c3742s1 = fk.a;
        if (c3742s1 == null || (gk = c3742s1.b) == null || (atomicBoolean = gk.a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap a = fk.a();
            a.put("networkType", F5.g());
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2180);
            String str = fk.d;
            if (str == null) {
                str = "";
            }
            a.put("impressionId", str);
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("AdImpressionSuccessful", a, EnumC3943zk.SDK);
        }
    }

    public static final void a(AbstractC3587m1 abstractC3587m1, Fk fk) {
        abstractC3587m1.u.a(fk);
    }

    @Override // com.inmobi.media.AbstractC3941zi, com.inmobi.media.InterfaceC3944zl
    public final void a() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("onUserLeaveApplication ", this, c3906y9, "m1");
        }
        if (this.k || o() == null) {
            return;
        }
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.a("m1", "User left application");
        }
        AbstractC3458h1 n = n();
        if (n != null) {
            n.e();
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad, Map map) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("updateIdsInTelemetryPayload ", this, c3906y9, "m1");
        }
        if (ad != null) {
            map.put("creativeId", ad.getCreativeId());
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(String str, HashMap hashMap) {
        str.getClass();
        hashMap.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("onRenderViewRequestedAction ", this, c3906y9, "m1");
        }
        c(str, hashMap);
    }

    public final void a(String str, Map map) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "addRetryCountToTelemetryEvent event - " + str);
        }
        switch (str.hashCode()) {
            case -1959333523:
                if (!str.equals("RenderSuccess")) {
                    return;
                }
                break;
            case 167123846:
                if (!str.equals("ServerFill")) {
                    return;
                }
                break;
            case 885222501:
                if (!str.equals("ServerError")) {
                    return;
                }
                break;
            case 925075267:
                if (!str.equals("AdLoadSuccessful")) {
                    return;
                }
                break;
            case 1881615718:
                if (!str.equals("AdLoadFailed")) {
                    return;
                }
                break;
            case 1925668903:
                if (!str.equals("ServerNoFill")) {
                    return;
                }
                break;
            default:
                return;
        }
        C3725ra c3725ra = this.v;
        if (c3725ra != null) {
            map.put("retryCount", Integer.valueOf(c3725ra.b));
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, LinkedHashSet linkedHashSet) {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2;
        C3886xf c3886xf;
        AdConfig.ViewabilityConfig viewability;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("omidSessionForHtmlMarkup ", this, c3906y9, "m1");
        }
        AdConfig adConfig = this.c;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            Rf.a.getClass();
            if (Omid.isActive()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    Vk vk = (Vk) it.next();
                    if (3 == vk.a) {
                        try {
                            Object obj = vk.b.get("creativeType");
                            String str = (String) (String.class.isInstance(obj) ? String.class.cast(obj) : null);
                            Object obj2 = vk.b.get("customReferenceData");
                            String str2 = (String) (String.class.isInstance(obj2) ? String.class.cast(obj2) : null);
                            Object obj3 = vk.b.get("isolateVerificationScripts");
                            Boolean bool = (Boolean) (Boolean.class.isInstance(obj3) ? Boolean.class.cast(obj3) : null);
                            Object obj4 = vk.b.get("impressionType");
                            Byte b = (Byte) (Byte.class.isInstance(obj4) ? Byte.class.cast(obj4) : null);
                            if (str == null || bool == null || b == null) {
                                gestureDetectorOnGestureListenerC3889xi2 = gestureDetectorOnGestureListenerC3889xi;
                                c3886xf = null;
                            } else {
                                gestureDetectorOnGestureListenerC3889xi2 = gestureDetectorOnGestureListenerC3889xi;
                                try {
                                    c3886xf = If.a(str, gestureDetectorOnGestureListenerC3889xi2, bool.booleanValue(), this.l.m, b.byteValue(), str2);
                                } catch (Exception e) {
                                    e = e;
                                    C3906y9 c3906y92 = this.i;
                                    if (c3906y92 != null) {
                                        wv8.x("Setting up impression tracking for IAB encountered an unexpected error: ", e.getMessage(), c3906y92, "m1");
                                    }
                                    joa joaVar = AbstractC3286aa.a;
                                    AbstractC3776t9.a(e);
                                    gestureDetectorOnGestureListenerC3889xi = gestureDetectorOnGestureListenerC3889xi2;
                                }
                            }
                            if (c3886xf != null) {
                                vk.b.put("omidAdSession", c3886xf);
                                vk.b.put("deferred", Boolean.TRUE);
                                C3906y9 c3906y93 = this.i;
                                if (c3906y93 != null) {
                                    c3906y93.a("m1", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                C3906y9 c3906y94 = this.i;
                                if (c3906y94 != null) {
                                    c3906y94.a("m1", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            gestureDetectorOnGestureListenerC3889xi2 = gestureDetectorOnGestureListenerC3889xi;
                        }
                        gestureDetectorOnGestureListenerC3889xi = gestureDetectorOnGestureListenerC3889xi2;
                    }
                }
            }
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad, String str) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("updateAdForBlob ", this, c3906y9, "m1");
        }
        ad.setWebVast(str);
        b(ad);
    }

    public final void a(String str, String str2) {
        str.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("saveBlob ", this, c3906y9, "m1");
        }
        this.g.a(this.a, new C3561l1(this, str2, str, null));
    }

    public final void a(String str, String str2, K2 k2, String str3) {
        str.getClass();
        str2.getClass();
        k2.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("getBlob ", this, c3906y9, "m1");
        }
        this.g.a(this.a, new C3509j1(this, str3, k2, str, str2, null));
    }

    public void a(int i, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, Context context) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            StringBuilder s = lnb.s(i, this.h.indexOf(gestureDetectorOnGestureListenerC3889xi), "Show pod ad with index : ", " from creative: ", " ");
            s.append(this);
            c3906y9.c("m1", s.toString());
        }
        if (i >= 0) {
            this.p = i;
        } else {
            this.p++;
        }
    }

    @Override // com.inmobi.media.InterfaceC3871x0
    public void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, Activity activity) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.C("closeCurrentPodAd ", this, c3906y9, "m1");
        }
    }

    @Override // com.inmobi.media.InterfaceC3871x0
    public boolean a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 == null) {
            return false;
        }
        w1l.C("hasNextAdInAdPod ", this, c3906y9, "m1");
        return false;
    }

    @Override // com.inmobi.media.Lk
    public void a(byte b) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            w1l.w("onTimeOut ", this, c3906y9, "m1");
        }
        if (b == 0) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.a("m1", "AdRequestTimeOut by timer, Adstate=" + ((int) this.b));
            }
            if (this.b != 3) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
                return;
            }
            return;
        }
        if (b != 2 && b != 1) {
            C3906y9 c3906y93 = this.i;
            if (b != 4) {
                if (c3906y93 != null) {
                    c3906y93.a("m1", "Unknown TimeOut ignored");
                    return;
                }
                return;
            } else {
                if (c3906y93 != null) {
                    c3906y93.a("m1", "Show RequestTimeOut by show timer");
                }
                AbstractC3458h1 n = n();
                if (n != null) {
                    n.d();
                    return;
                }
                return;
            }
        }
        C3906y9 c3906y94 = this.i;
        if (c3906y94 != null) {
            c3906y94.a("m1", "Internal LoadTimeOut by timer, Adstate=" + ((int) this.b));
        }
        if (this.b != 3) {
            this.x.removeCallbacksAndMessages(null);
            C3906y9 c3906y95 = this.i;
            if (c3906y95 != null) {
                c3906y95.a("m1", "adUnitEventListener=" + n() + ", Adstate=" + ((int) this.b));
            }
            if (2 == this.b) {
                K();
                i();
                c(AbstractC3420ff.a() == null ? (short) 2139 : (short) 2203);
                AbstractC3458h1 n2 = n();
                if (n2 != null) {
                    n2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            if (1 == this.b) {
                K();
                c((short) 2138);
                AbstractC3458h1 n3 = n();
                if (n3 != null) {
                    n3.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                }
            }
        }
    }

    public final void a(int i, boolean z) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.a("m1", "Destroying container for index " + i + " " + this);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.h;
        copyOnWriteArrayList.getClass();
        if (i < 0 || i >= copyOnWriteArrayList.size()) {
            return;
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) this.h.get(i);
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            gestureDetectorOnGestureListenerC3889xi.J0.set(z);
            gestureDetectorOnGestureListenerC3889xi.stopLoading();
            gestureDetectorOnGestureListenerC3889xi.b();
        }
        this.h.set(i, null);
    }

    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, Integer num, int i) {
        int intValue;
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            intValue = this.h.indexOf(gestureDetectorOnGestureListenerC3889xi);
        } else if (num == null) {
            return;
        } else {
            intValue = num.intValue();
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(intValue);
        if (b != null) {
            Iterator it = Ti.a(b, "pod_abort").iterator();
            while (it.hasNext()) {
                String r = kotlin.text.c.r(kotlin.text.c.r((String) it.next(), "$PODINDEX", String.valueOf(intValue), false), "$REASON", String.valueOf(i), false);
                E3 e3 = E3.a;
                E3.a(r, true, this.i);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str, Map map) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        str.getClass();
        map.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.a("m1", "fireLandingPageTracker " + str + " " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(this.h.indexOf(gestureDetectorOnGestureListenerC3889xi));
        if (b != null) {
            for (String str2 : Ti.a(b, str)) {
                for (Map.Entry entry : map.entrySet()) {
                    str2 = kotlin.text.c.r(str2, (String) entry.getKey(), (String) entry.getValue(), false);
                }
                E3 e3 = E3.a;
                C3906y9 c3906y92 = this.i;
                str2.getClass();
                E3.a(str2, true, c3906y92);
            }
            return;
        }
        C3906y9 c3906y93 = this.i;
        if (c3906y93 != null) {
            c3906y93.a("m1", "fireLandingPageTracker failed");
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(String str) {
        str.getClass();
        AbstractC3458h1 n = n();
        if (n != null) {
            n.a(str);
        }
    }

    @Override // com.inmobi.media.Qo
    public final String a(int i, double d) {
        return ((Qo) this.D.getValue()).a(i, d);
    }

    @Override // com.inmobi.media.Qo
    public final String a(double d) {
        return ((Qo) this.D.getValue()).a(d);
    }
}
