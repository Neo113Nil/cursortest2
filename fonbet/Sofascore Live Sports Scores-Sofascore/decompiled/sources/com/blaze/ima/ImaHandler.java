package com.blaze.ima;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.ExoPlayer;
import com.blaze.blazesdk.ads.ima.BlazeIMAHandlerEventType;
import com.blaze.blazesdk.ads.ima.BlazeImaHandler;
import com.blaze.blazesdk.ads.ima.models.BlazeIMAAdRequestData;
import com.blaze.blazesdk.ads.ima.models.BlazeImaAdEvent;
import com.blaze.blazesdk.ads.ima.models.BlazeImaAdInfo;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.google.ads.interactivemedia.v3.impl.data.AdData;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.aeh;
import defpackage.ale;
import defpackage.b1d;
import defpackage.beh;
import defpackage.bh;
import defpackage.chh;
import defpackage.gmm;
import defpackage.gmo;
import defpackage.hf;
import defpackage.hjg;
import defpackage.hoo;
import defpackage.hr4;
import defpackage.hr9;
import defpackage.hs4;
import defpackage.ir9;
import defpackage.jpm;
import defpackage.jr9;
import defpackage.ku3;
import defpackage.kuj;
import defpackage.lu3;
import defpackage.mbi;
import defpackage.mr9;
import defpackage.nrm;
import defpackage.odm;
import defpackage.oe4;
import defpackage.oqm;
import defpackage.qcc;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.smi;
import defpackage.tnm;
import defpackage.tz9;
import defpackage.vf;
import defpackage.vg6;
import defpackage.wf6;
import defpackage.wi5;
import defpackage.wk;
import defpackage.xdh;
import defpackage.xe4;
import defpackage.xf;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yf;
import defpackage.z1a;
import defpackage.z45;
import defpackage.zjo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 Z2\u00020\u0001:\u0002[\\B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0097@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u0013*\u00020\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b'\u0010(JZ\u00100\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-\u0018\u00010,2\u0006\u0010\r\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010-H\u0083@¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00132\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0015\u0010<\u001a\u0004\u0018\u00010;*\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010@\u001a\u00020?*\u00020>H\u0002¢\u0006\u0004\b@\u0010AR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0018\u0010)\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010L\u001a\b\u0012\u0004\u0012\u00020H0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020-0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010JR \u0010Q\u001a\b\u0012\u0004\u0012\u00020-0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010OR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010Y¨\u0006]"}, d2 = {"Lcom/blaze/ima/ImaHandler;", "Lcom/blaze/blazesdk/ads/ima/BlazeImaHandler;", "Lcom/blaze/ima/BlazeIMADelegate;", "delegate", "<init>", "(Lcom/blaze/ima/BlazeIMADelegate;)V", "Landroid/content/Context;", "context", "Lbh;", "adViewProvider", "Lcom/blaze/blazesdk/ads/ima/models/BlazeIMAAdRequestData;", "requestData", "", "isMuted", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "extraInfo", "Lale;", "createPlayer", "(Landroid/content/Context;Lbh;Lcom/blaze/blazesdk/ads/ima/models/BlazeIMAAdRequestData;ZLcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;Lrq3;)Ljava/lang/Object;", "", "release", "()V", "clearImaAdEventBuffer", "Lcom/blaze/ima/BlazeIMAAdRequestInformation;", "Ltnm;", "loadDelegateResults", "(Lcom/blaze/ima/BlazeIMAAdRequestInformation;Lrq3;)Ljava/lang/Object;", "Lmr9;", "customIMASettings", "Lhr9;", "buildImaAdsLoader", "(Landroid/content/Context;Lmr9;)Lhr9;", "Lqcc;", "mediaSourceFactory", "Landroidx/media3/exoplayer/ExoPlayer;", "buildExoPlayer", "(Landroid/content/Context;Lqcc;)Landroidx/media3/exoplayer/ExoPlayer;", "Lwk;", "adsMediaSource", "prepareWithMediaSource", "(Landroidx/media3/exoplayer/ExoPlayer;Lwk;Z)V", "imaAdsLoader", "Loe4;", "dataSourceFactory", "", "", "appExtraParams", "overrideAdTagUrl", "createAdsMediaSource", "(Lhr9;Loe4;Lcom/blaze/blazesdk/ads/ima/models/BlazeIMAAdRequestData;Lbh;Ljava/util/Map;ZLjava/lang/String;Lrq3;)Ljava/lang/Object;", "Lvf;", "it", "onAdError", "(Lvf;)V", "Lyf;", "adEvent", "onImaEvent", "(Lyf;)V", "Lxf;", "Lcom/blaze/blazesdk/ads/ima/BlazeIMAHandlerEventType;", "mapToBlazeIMAHandlerEventType", "(Lxf;)Lcom/blaze/blazesdk/ads/ima/BlazeIMAHandlerEventType;", "Lhf;", "Lcom/blaze/blazesdk/ads/ima/models/BlazeImaAdInfo;", "toBlazeImaAdInfo", "(Lhf;)Lcom/blaze/blazesdk/ads/ima/models/BlazeImaAdInfo;", "Lcom/blaze/ima/BlazeIMADelegate;", "Lhr9;", "Lodm;", "adTagEnricher", "Lodm;", "Lb1d;", "Lcom/blaze/blazesdk/ads/ima/models/BlazeImaAdEvent;", "_adEvent", "Lb1d;", "Lxdh;", "imaAdEvent", "Lxdh;", "getImaAdEvent", "()Lxdh;", "_adErrorEvent", "adErrorEvent", "getAdErrorEvent", "Lku3;", "coroutineScope", "Lku3;", "Landroid/net/Uri;", "adTag", "Landroid/net/Uri;", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "Companion", "com/blaze/ima/l", "com/blaze/ima/k", "blaze_ima_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImaHandler implements BlazeImaHandler {

    @NotNull
    public static final gmm Companion = new gmm();
    private static final long SILENCE_DURATION_MICRO_SECONDS = 1;

    @NotNull
    private final b1d _adErrorEvent;

    @NotNull
    private final b1d _adEvent;

    @NotNull
    private final xdh adErrorEvent;

    @Nullable
    private Uri adTag;

    @NotNull
    private final odm adTagEnricher;

    @NotNull
    private final ku3 coroutineScope;

    @Nullable
    private final BlazeIMADelegate delegate;

    @Nullable
    private BlazeContentExtraInfo extraInfo;

    @NotNull
    private final xdh imaAdEvent;

    @Nullable
    private hr9 imaAdsLoader;

    public ImaHandler(@Nullable BlazeIMADelegate blazeIMADelegate) {
        this.delegate = blazeIMADelegate;
        this.adTagEnricher = new odm();
        aeh b = beh.b(1, 1, null, 4);
        this._adEvent = b;
        this.imaAdEvent = b;
        aeh b2 = beh.b(0, 0, null, 7);
        this._adErrorEvent = b2;
        this.adErrorEvent = b2;
        smi o = tz9.o();
        hs4 hs4Var = z45.a;
        this.coroutineScope = s9a.c(e.d(o, rob.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExoPlayer buildExoPlayer(Context context, qcc mediaSourceFactory) {
        wf6 wf6Var = new wf6(context);
        wf6Var.b(mediaSourceFactory);
        z1a.E(!wf6Var.p);
        wf6Var.h = true;
        return wf6Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hr9 buildImaAdsLoader(Context context, mr9 customIMASettings) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        hjg hjgVar = new hjg();
        int i = 0;
        ir9 ir9Var = new ir9(this, i);
        jr9 jr9Var = new jr9(this, i);
        if (customIMASettings == null) {
            customIMASettings = null;
        }
        return new hr9(applicationContext, new wi5(Ua.s, jr9Var, ir9Var, customIMASettings), hjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildImaAdsLoader$lambda$0(ImaHandler imaHandler, yf yfVar) {
        yfVar.getClass();
        imaHandler.onImaEvent(yfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildImaAdsLoader$lambda$1(ImaHandler imaHandler, vf vfVar) {
        vfVar.getClass();
        imaHandler.onAdError(vfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createAdsMediaSource(hr9 hr9Var, oe4 oe4Var, BlazeIMAAdRequestData blazeIMAAdRequestData, bh bhVar, Map<String, String> map, boolean z, String str, rq3<? super wk> rq3Var) {
        oqm oqmVar;
        int i;
        chh chhVar;
        hr4 hr4Var;
        hr9 hr9Var2;
        chh chhVar2;
        bh bhVar2;
        bh bhVar3;
        if (rq3Var instanceof oqm) {
            oqmVar = (oqm) rq3Var;
            int i2 = oqmVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oqmVar.y = i2 - Integer.MIN_VALUE;
                oqm oqmVar2 = oqmVar;
                Object obj = oqmVar2.w;
                lu3 lu3Var = lu3.a;
                i = oqmVar2.y;
                if (i != 0) {
                    y6a.M(obj);
                    this.adTag = null;
                    xw3.L(this.coroutineScope, null, null, new nrm(this, null), 3);
                    chhVar = new chh(1L, chh.k.a().a());
                    hr4Var = new hr4(oe4Var);
                    if (str != null && (r12 = Uri.parse(str)) != null) {
                        bhVar3 = bhVar;
                        this.adTag = r12;
                        return new wk(chhVar, new xe4(r12), bhVar3, hr4Var, hr9Var, bhVar3);
                    }
                    odm odmVar = this.adTagEnricher;
                    ViewGroup adViewGroup = bhVar.getAdViewGroup();
                    Context context = adViewGroup != null ? adViewGroup.getContext() : null;
                    oqmVar2.r = this;
                    oqmVar2.s = hr9Var;
                    oqmVar2.t = bhVar;
                    oqmVar2.u = chhVar;
                    oqmVar2.v = hr4Var;
                    oqmVar2.y = 1;
                    Comparable a = odmVar.a(blazeIMAAdRequestData, map, z, context, oqmVar2);
                    if (a == lu3Var) {
                        return lu3Var;
                    }
                    hr9Var2 = hr9Var;
                    chhVar2 = chhVar;
                    obj = a;
                    bhVar2 = bhVar;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hr4 hr4Var2 = oqmVar2.v;
                    chhVar2 = oqmVar2.u;
                    bhVar2 = oqmVar2.t;
                    hr9Var2 = oqmVar2.s;
                    ImaHandler imaHandler = oqmVar2.r;
                    y6a.M(obj);
                    hr4Var = hr4Var2;
                    this = imaHandler;
                }
                Uri uri = (Uri) obj;
                chhVar = chhVar2;
                hr9Var = hr9Var2;
                bhVar3 = bhVar2;
                Uri parse = uri;
                this.adTag = parse;
                return new wk(chhVar, new xe4(parse), bhVar3, hr4Var, hr9Var, bhVar3);
            }
        }
        oqmVar = new oqm(this, rq3Var);
        oqm oqmVar22 = oqmVar;
        Object obj2 = oqmVar22.w;
        lu3 lu3Var2 = lu3.a;
        i = oqmVar22.y;
        if (i != 0) {
        }
        Uri uri2 = (Uri) obj2;
        chhVar = chhVar2;
        hr9Var = hr9Var2;
        bhVar3 = bhVar2;
        Uri parse2 = uri2;
        this.adTag = parse2;
        return new wk(chhVar, new xe4(parse2), bhVar3, hr4Var, hr9Var, bhVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadDelegateResults(BlazeIMAAdRequestInformation blazeIMAAdRequestInformation, rq3<? super tnm> rq3Var) {
        return s9a.r(new kuj(this, blazeIMAAdRequestInformation, (rq3) null, 27), rq3Var);
    }

    private final BlazeIMAHandlerEventType mapToBlazeIMAHandlerEventType(xf xfVar) {
        switch (jpm.a[xfVar.ordinal()]) {
            case 1:
                return BlazeIMAHandlerEventType.AD_LOADED;
            case 2:
                return BlazeIMAHandlerEventType.ALL_ADS_COMPLETED;
            case 3:
                return BlazeIMAHandlerEventType.AD_CLICKED;
            case 4:
                return BlazeIMAHandlerEventType.AD_COMPLETED;
            case 5:
                return BlazeIMAHandlerEventType.AD_PAUSED;
            case 6:
                return BlazeIMAHandlerEventType.AD_RESUMED;
            case 7:
                return BlazeIMAHandlerEventType.AD_SKIPPED;
            case 8:
                return BlazeIMAHandlerEventType.AD_STARTED;
            case 9:
                return BlazeIMAHandlerEventType.AD_TAPPED;
            case 10:
                return BlazeIMAHandlerEventType.AD_FIRST_QUARTILE;
            case 11:
                return BlazeIMAHandlerEventType.AD_MIDPOINT;
            case 12:
                return BlazeIMAHandlerEventType.AD_THIRD_QUARTILE;
            default:
                return null;
        }
    }

    private final void onAdError(vf it) {
        xw3.L(this.coroutineScope, null, null, new a(this, it, null, 22), 3);
        BlazeIMADelegate blazeIMADelegate = this.delegate;
        if (blazeIMADelegate != null) {
            blazeIMADelegate.onIMAAdError(((zjo) it).a.getMessage());
        }
    }

    private final void onImaEvent(yf adEvent) {
        xf xfVar = ((hoo) adEvent).a;
        xfVar.getClass();
        BlazeIMAHandlerEventType mapToBlazeIMAHandlerEventType = mapToBlazeIMAHandlerEventType(xfVar);
        if (mapToBlazeIMAHandlerEventType != null) {
            hf hfVar = ((hoo) adEvent).b;
            BlazeImaAdInfo blazeImaAdInfo = hfVar != null ? toBlazeImaAdInfo(hfVar) : null;
            BlazeImaAdEvent blazeImaAdEvent = new BlazeImaAdEvent(blazeImaAdInfo, mapToBlazeIMAHandlerEventType);
            xw3.L(this.coroutineScope, null, null, new nrm(this, blazeImaAdEvent, null), 3);
            BlazeIMADelegate blazeIMADelegate = this.delegate;
            if (blazeIMADelegate != null) {
                blazeIMADelegate.onIMAAdEvent(blazeImaAdEvent.getType(), blazeImaAdInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareWithMediaSource(ExoPlayer exoPlayer, wk wkVar, boolean z) {
        vg6 vg6Var = (vg6) exoPlayer;
        vg6Var.setVolume(z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        vg6Var.j0();
        List singletonList = Collections.singletonList(wkVar);
        vg6Var.j0();
        vg6Var.j0();
        vg6Var.a0(singletonList, true, C.TIME_UNSET, -1);
        vg6Var.a();
        vg6Var.setPlayWhenReady(true);
    }

    private final BlazeImaAdInfo toBlazeImaAdInfo(hf hfVar) {
        String adId = ((AdData) ((gmo) hfVar).b).adId();
        AdData adData = (AdData) ((gmo) hfVar).b;
        String title = adData.title();
        String description = adData.description();
        String adSystem = adData.adSystem();
        Boolean skippable = adData.skippable();
        Boolean valueOf = Boolean.valueOf(skippable == null ? false : skippable.booleanValue());
        Double skipTimeOffset = adData.skipTimeOffset();
        Double valueOf2 = Double.valueOf(skipTimeOffset == null ? -1.0d : skipTimeOffset.doubleValue());
        Double duration = adData.duration();
        return new BlazeImaAdInfo(adId, title, description, adSystem, valueOf, valueOf2, Double.valueOf(duration == null ? 0.0d : duration.doubleValue()), adData.advertiserName(), this.adTag, this.extraInfo);
    }

    @Override // com.blaze.blazesdk.ads.ima.BlazeImaHandler
    public void clearImaAdEventBuffer() {
        this._adEvent.d();
    }

    @Override // com.blaze.blazesdk.ads.ima.BlazeImaHandler
    @Nullable
    public Object createPlayer(@NotNull Context context, @NotNull bh bhVar, @Nullable BlazeIMAAdRequestData blazeIMAAdRequestData, boolean z, @Nullable BlazeContentExtraInfo blazeContentExtraInfo, @NotNull rq3<? super ale> rq3Var) {
        hs4 hs4Var = z45.a;
        return xw3.R(rob.a, new mbi(this, blazeContentExtraInfo, context, bhVar, blazeIMAAdRequestData, z, null), rq3Var);
    }

    @Override // com.blaze.blazesdk.ads.ima.BlazeImaHandler
    @NotNull
    public xdh getAdErrorEvent() {
        return this.adErrorEvent;
    }

    @Override // com.blaze.blazesdk.ads.ima.BlazeImaHandler
    @NotNull
    public xdh getImaAdEvent() {
        return this.imaAdEvent;
    }

    @Override // com.blaze.blazesdk.ads.ima.BlazeImaHandler
    public void release() {
        hr9 hr9Var = this.imaAdsLoader;
        if (hr9Var != null) {
            hr9Var.c();
        }
        this.imaAdsLoader = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImaHandler() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ImaHandler(BlazeIMADelegate blazeIMADelegate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : blazeIMADelegate);
    }
}
