package com.blaze.gam.custom_native;

import android.content.Context;
import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.custom_native.models.BlazeAdRequestData;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.gam.custom_native.BlazeCustomNativeAdsProvider;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e;
import defpackage.a70;
import defpackage.fsf;
import defpackage.g2m;
import defpackage.hs4;
import defpackage.js1;
import defpackage.kuj;
import defpackage.l50;
import defpackage.lm5;
import defpackage.lu3;
import defpackage.mul;
import defpackage.pa3;
import defpackage.qa3;
import defpackage.qx9;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s1;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/blaze/gam/custom_native/BlazeCustomNativeAdsProvider;", "", "Landroid/content/Context;", "appContext", "Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDefaultConfig;", "defaultAdConfig", "Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDelegate;", "delegate", "<init>", "(Landroid/content/Context;Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDefaultConfig;Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDelegate;)V", "Lcom/blaze/gam/custom_native/BlazeGamCustomNativeAdRequestInformation;", "requestData", "Lmul;", "loadDelegateResults", "(Lcom/blaze/gam/custom_native/BlazeGamCustomNativeAdRequestInformation;Lrq3;)Ljava/lang/Object;", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeAdRequestData;", "adRequestData", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel;", "generateAd", "(Lcom/blaze/blazesdk/ads/custom_native/models/BlazeAdRequestData;Lrq3;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDefaultConfig;", "Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDelegate;", "com/blaze/gam/b", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlazeCustomNativeAdsProvider {

    @NotNull
    private final Context appContext;

    @Nullable
    private final BlazeGAMCustomNativeAdsDefaultConfig defaultAdConfig;

    @Nullable
    private final BlazeGAMCustomNativeAdsDelegate delegate;

    public BlazeCustomNativeAdsProvider(@NotNull Context context, @Nullable BlazeGAMCustomNativeAdsDefaultConfig blazeGAMCustomNativeAdsDefaultConfig, @Nullable BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate) {
        context.getClass();
        this.appContext = context;
        this.defaultAdConfig = blazeGAMCustomNativeAdsDefaultConfig;
        this.delegate = blazeGAMCustomNativeAdsDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String generateAd$lambda$2$lambda$0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String generateAd$lambda$2$lambda$1(Function2 function2, Object obj, Object obj2) {
        return (String) function2.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateAd$lambda$4(fsf fsfVar, BlazeAdRequestData blazeAdRequestData, pa3 pa3Var, BlazeCustomNativeAdsProvider blazeCustomNativeAdsProvider, NativeCustomFormatAd nativeCustomFormatAd) {
        BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate;
        nativeCustomFormatAd.getClass();
        BlazeGoogleCustomNativeAdModel adModel = BlazeCustomNativeAdsParsingKt.toAdModel(nativeCustomFormatAd, blazeAdRequestData.getExtraInfo());
        if (adModel == null && (blazeGAMCustomNativeAdsDelegate = blazeCustomNativeAdsProvider.delegate) != null) {
            blazeGAMCustomNativeAdsDelegate.onGAMCustomNativeAdError("Failed to parse ad.");
        }
        fsfVar.a = adModel;
        Unit unit = Unit.a;
        ((qa3) pa3Var).V(unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateAd$lambda$5(BlazeCustomNativeAdsProvider blazeCustomNativeAdsProvider, pa3 pa3Var, String str) {
        str.getClass();
        BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate = blazeCustomNativeAdsProvider.delegate;
        if (blazeGAMCustomNativeAdsDelegate != null) {
            blazeGAMCustomNativeAdsDelegate.onGAMCustomNativeAdError(str);
        }
        Unit unit = Unit.a;
        ((qa3) pa3Var).V(unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadDelegateResults(BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation, rq3<? super mul> rq3Var) {
        return s9a.r(new kuj(this, blazeGamCustomNativeAdRequestInformation, (rq3) null, 26), rq3Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|(1:(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(4:19|20|21|22))(17:49|(2:77|(1:79)(12:80|54|(2:73|(1:75)(1:76))|58|(1:72)|62|(1:64)|65|66|67|(1:69)|38))|53|54|(1:56)|73|(0)(0)|58|(1:60)|72|62|(0)|65|66|67|(0)|38)|23|24|25|(1:39)(1:29)|30|(2:33|31)|34|35|(3:37|12|13)|38))|81|6|(0)(0)|23|24|25|(1:27)|39|30|(1:31)|34|35|(0)|38) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:49|(2:77|(1:79)(12:80|54|(2:73|(1:75)(1:76))|58|(1:72)|62|(1:64)|65|66|67|(1:69)|38))|53|54|(1:56)|73|(0)(0)|58|(1:60)|72|62|(0)|65|66|67|(0)|38) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0173, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0174, code lost:
    
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0196, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0176, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[LOOP:0: B:31:0x010a->B:33:0x0110, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generateAd(@NotNull BlazeAdRequestData blazeAdRequestData, @NotNull rq3<? super BlazeGoogleCustomNativeAdModel> rq3Var) {
        g2m g2mVar;
        lu3 lu3Var;
        int i;
        String str;
        String adUnit;
        BlazeAdInfoModel adInfo;
        String templateId;
        BlazeAdInfoModel adInfo2;
        BlazeContentExtraInfo extraInfo;
        Object loadDelegateResults;
        String str2;
        BlazeCustomNativeAdsProvider blazeCustomNativeAdsProvider;
        BlazeCustomNativeAdsManager blazeCustomNativeAdsManager;
        BlazeAdRequestData blazeAdRequestData2;
        String str3;
        fsf fsfVar;
        Object w;
        fsf fsfVar2;
        Map<String, String> map;
        BlazeCustomNativeAdsProvider blazeCustomNativeAdsProvider2 = this;
        if (rq3Var instanceof g2m) {
            g2mVar = (g2m) rq3Var;
            int i2 = g2mVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g2mVar.z = i2 - Integer.MIN_VALUE;
                Object obj = g2mVar.x;
                lu3Var = lu3.a;
                i = g2mVar.z;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    BlazeAdInfoModel adInfo3 = blazeAdRequestData.getAdInfo();
                    if (adInfo3 == null || (adUnit = adInfo3.adUnitId) == null) {
                        BlazeGAMCustomNativeAdsDefaultConfig blazeGAMCustomNativeAdsDefaultConfig = blazeCustomNativeAdsProvider2.defaultAdConfig;
                        if (blazeGAMCustomNativeAdsDefaultConfig == null) {
                            str = "";
                            adInfo = blazeAdRequestData.getAdInfo();
                            if (adInfo != null || (templateId = adInfo.formatId) == null) {
                                BlazeGAMCustomNativeAdsDefaultConfig blazeGAMCustomNativeAdsDefaultConfig2 = blazeCustomNativeAdsProvider2.defaultAdConfig;
                                templateId = blazeGAMCustomNativeAdsDefaultConfig2 == null ? blazeGAMCustomNativeAdsDefaultConfig2.getTemplateId() : "";
                            }
                            fsf fsfVar3 = new fsf();
                            BlazeCustomNativeAdsManager blazeCustomNativeAdsManager2 = new BlazeCustomNativeAdsManager(blazeCustomNativeAdsProvider2.appContext);
                            adInfo2 = blazeAdRequestData.getAdInfo();
                            if (adInfo2 != null || (r12 = adInfo2.context) == null) {
                                Map map2 = lm5.a;
                                map2.getClass();
                            }
                            extraInfo = blazeAdRequestData.getExtraInfo();
                            if (extraInfo == null) {
                                extraInfo = new BlazeContentExtraInfo(null, null, null, null, null, 31, null);
                            }
                            BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation = new BlazeGamCustomNativeAdRequestInformation(str, templateId, map2, extraInfo);
                            g2mVar.r = blazeCustomNativeAdsProvider2;
                            g2mVar.s = blazeAdRequestData;
                            g2mVar.t = str;
                            g2mVar.u = templateId;
                            g2mVar.v = fsfVar3;
                            g2mVar.w = blazeCustomNativeAdsManager2;
                            g2mVar.z = 1;
                            loadDelegateResults = blazeCustomNativeAdsProvider2.loadDelegateResults(blazeGamCustomNativeAdRequestInformation, g2mVar);
                            if (loadDelegateResults != lu3Var) {
                                str2 = templateId;
                                blazeCustomNativeAdsProvider = blazeCustomNativeAdsProvider2;
                                obj = loadDelegateResults;
                                blazeCustomNativeAdsManager = blazeCustomNativeAdsManager2;
                                blazeAdRequestData2 = blazeAdRequestData;
                                str3 = str;
                                fsfVar = fsfVar3;
                            }
                            return lu3Var;
                        }
                        adUnit = blazeGAMCustomNativeAdsDefaultConfig.getAdUnit();
                    }
                    str = adUnit;
                    adInfo = blazeAdRequestData.getAdInfo();
                    if (adInfo != null) {
                    }
                    BlazeGAMCustomNativeAdsDefaultConfig blazeGAMCustomNativeAdsDefaultConfig22 = blazeCustomNativeAdsProvider2.defaultAdConfig;
                    if (blazeGAMCustomNativeAdsDefaultConfig22 == null) {
                    }
                    fsf fsfVar32 = new fsf();
                    BlazeCustomNativeAdsManager blazeCustomNativeAdsManager22 = new BlazeCustomNativeAdsManager(blazeCustomNativeAdsProvider2.appContext);
                    adInfo2 = blazeAdRequestData.getAdInfo();
                    if (adInfo2 != null) {
                    }
                    Map map22 = lm5.a;
                    map22.getClass();
                    extraInfo = blazeAdRequestData.getExtraInfo();
                    if (extraInfo == null) {
                    }
                    BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation2 = new BlazeGamCustomNativeAdRequestInformation(str, templateId, map22, extraInfo);
                    g2mVar.r = blazeCustomNativeAdsProvider2;
                    g2mVar.s = blazeAdRequestData;
                    g2mVar.t = str;
                    g2mVar.u = templateId;
                    g2mVar.v = fsfVar32;
                    g2mVar.w = blazeCustomNativeAdsManager22;
                    g2mVar.z = 1;
                    loadDelegateResults = blazeCustomNativeAdsProvider2.loadDelegateResults(blazeGamCustomNativeAdRequestInformation2, g2mVar);
                    if (loadDelegateResults != lu3Var) {
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return null;
                    }
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar2 = (fsf) g2mVar.r;
                    y6a.M(obj);
                    return fsfVar2.a;
                }
                blazeCustomNativeAdsManager = g2mVar.w;
                fsf fsfVar4 = g2mVar.v;
                String str4 = g2mVar.u;
                String str5 = g2mVar.t;
                BlazeAdRequestData blazeAdRequestData3 = g2mVar.s;
                BlazeCustomNativeAdsProvider blazeCustomNativeAdsProvider3 = (BlazeCustomNativeAdsProvider) g2mVar.r;
                try {
                    y6a.M(obj);
                    str2 = str4;
                    blazeAdRequestData2 = blazeAdRequestData3;
                    blazeCustomNativeAdsProvider = blazeCustomNativeAdsProvider3;
                    fsfVar = fsfVar4;
                    str3 = str5;
                } catch (Throwable th) {
                    th = th;
                    blazeCustomNativeAdsProvider2 = blazeCustomNativeAdsProvider3;
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a;
                    e eVar = new e(blazeCustomNativeAdsProvider2, th, rq3Var2, 4);
                    g2mVar.r = null;
                    g2mVar.s = null;
                    g2mVar.t = null;
                    g2mVar.u = null;
                    g2mVar.v = null;
                    g2mVar.w = null;
                    g2mVar.z = 2;
                    if (xw3.R(r69Var, eVar, g2mVar) == lu3Var) {
                    }
                }
                mul mulVar = (mul) obj;
                BlazeAdInfoModel adInfo4 = blazeAdRequestData2.getAdInfo();
                LinkedHashMap linkedHashMap = (adInfo4 != null || (map = adInfo4.context) == null) ? new LinkedHashMap() : new LinkedHashMap(map);
                for (Map.Entry entry : mulVar.a.entrySet()) {
                    String str6 = (String) entry.getKey();
                    String str7 = (String) entry.getValue();
                    final js1 js1Var = new js1((byte) 0, 27);
                    linkedHashMap.merge(str6, str7, new BiFunction() { // from class: px1
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj2, Object obj3) {
                            String generateAd$lambda$2$lambda$1;
                            generateAd$lambda$2$lambda$1 = BlazeCustomNativeAdsProvider.generateAd$lambda$2$lambda$1(js1.this, obj2, obj3);
                            return generateAd$lambda$2$lambda$1;
                        }
                    });
                }
                qa3 c = qx9.c();
                blazeCustomNativeAdsManager.requestAd(str3, str2, mulVar.b, mulVar.c, linkedHashMap, new l50(fsfVar, blazeAdRequestData2, c, blazeCustomNativeAdsProvider, 1), new s1(24, blazeCustomNativeAdsProvider, c));
                g2mVar.r = fsfVar;
                g2mVar.s = null;
                g2mVar.t = null;
                g2mVar.u = null;
                g2mVar.v = null;
                g2mVar.w = null;
                g2mVar.z = 3;
                w = c.w(g2mVar);
                lu3 lu3Var2 = lu3.a;
                if (w != lu3Var) {
                    fsfVar2 = fsfVar;
                    return fsfVar2.a;
                }
                return lu3Var;
            }
        }
        g2mVar = new g2m(blazeCustomNativeAdsProvider2, rq3Var);
        Object obj2 = g2mVar.x;
        lu3Var = lu3.a;
        i = g2mVar.z;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        mul mulVar2 = (mul) obj2;
        BlazeAdInfoModel adInfo42 = blazeAdRequestData2.getAdInfo();
        if (adInfo42 != null) {
        }
        while (r4.hasNext()) {
        }
        qa3 c2 = qx9.c();
        blazeCustomNativeAdsManager.requestAd(str3, str2, mulVar2.b, mulVar2.c, linkedHashMap, new l50(fsfVar, blazeAdRequestData2, c2, blazeCustomNativeAdsProvider, 1), new s1(24, blazeCustomNativeAdsProvider, c2));
        g2mVar.r = fsfVar;
        g2mVar.s = null;
        g2mVar.t = null;
        g2mVar.u = null;
        g2mVar.v = null;
        g2mVar.w = null;
        g2mVar.z = 3;
        w = c2.w(g2mVar);
        lu3 lu3Var22 = lu3.a;
        if (w != lu3Var) {
        }
        return lu3Var;
    }
}
