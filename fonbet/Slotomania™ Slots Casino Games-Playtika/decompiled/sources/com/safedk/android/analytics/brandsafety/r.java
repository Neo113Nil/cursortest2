package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class r extends BannerFinder {
    public r(int i) {
        super(BrandSafetyUtils.AdType.MREC, Arrays.asList(BrandSafetyUtils.o), "MrecFinder", i);
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder, com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new s(str, str2, str3, screenShotOrientation, str4, str5);
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected e a(Activity activity, String str, int i, String str2, Bundle bundle, String str3) {
        s sVar = new s(a(com.safedk.android.internal.b.getInstance().getForegroundActivity()), str, i, str2, bundle, str3);
        sVar.ag = new WeakReference<>(activity);
        return sVar;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected boolean f(String str, String str2) {
        boolean a = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        String a2 = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(this.a, "sdk ", str2, ": config item SUPPORTS_MREC_IMPRESSION_TRACKING is ", Boolean.valueOf(a), ", config item AD_NETWORK_TO_IGNORE is ", a2, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (a && !str.equals(a2)) {
            return true;
        }
        Logger.d(this.a, "MREC tracking is not supported for this ad network (", str, ")");
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected boolean a(e eVar, long j) {
        if (eVar == null || com.safedk.android.utils.e.a((c) eVar)) {
            Logger.d(this.a, Logger.FeatureTag.MEMORY_LOAD, "don't take screenshot, ad info: ", eVar, ", low memory");
            return false;
        }
        int a = ((int) CreativeInfoManager.a(eVar.c(), AdNetworkConfiguration.MREC_SCREENSHOT_TAKING_DELAY, 0L)) / SafeDK.getInstance().Z();
        Logger.d(this.a, "should take screenshot started for ", eVar.c(), ", iterationDelay = ", Integer.valueOf(a), ",  timerIterationCounter = ", Long.valueOf(j));
        if (a > 0 && j <= a) {
            Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot, delay interval for sdk ", eVar.c(), " not reached, current iteration : ", Long.valueOf(j), ", skipping");
            eVar.an.c--;
            return false;
        }
        if (!SafeDK.getInstance().I()) {
            AdNetworkDiscovery j2 = CreativeInfoManager.j(eVar.c());
            if (!eVar.i().l && j2 != null && j2.a((c) eVar)) {
                eVar.i().l = true;
                Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - found a media player");
            }
            CreativeInfo j3 = eVar.j();
            if (j3 == null) {
                Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot, no creative info yet");
                return false;
            }
            if (BrandSafetyUtils.o.equals(j3.I())) {
                boolean a2 = CreativeInfoManager.a(eVar.v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                if (j3.an() && !a2) {
                    Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot, multi ad, sdk: ", eVar.v);
                    return false;
                }
                if (!n(eVar.c())) {
                    Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, sdk ", eVar.c(), " Mrec EoV is not supported");
                    return true;
                }
                if (!eVar.i().l) {
                    Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, MREC ad is not a video ad");
                    return true;
                }
                if (eVar.i().k) {
                    Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, MREC video ad finished playing or sdk configured to take screenshots throughout the impression. ");
                    return true;
                }
                Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot, MREC video hasn't finished playing yet, waiting for video completed event");
                return false;
            }
            Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, MREC ad");
            return true;
        }
        Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, SafeDK Config item 'AlwaysTakeScreenshot' is true");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected boolean n(String str) {
        boolean a = CreativeInfoManager.a(str, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, false);
        if (!a) {
            Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, MREC EoV is not supported for this SDK: ", str);
        }
        return a;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder, com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z, String str3) {
        c cVar;
        synchronized (L) {
            String str4 = this.a;
            Object[] objArr = new Object[6];
            objArr[0] = "on video ";
            objArr[1] = z ? "completed" : TtmlNode.START;
            objArr[2] = ", keys : ";
            objArr[3] = L.keySet();
            objArr[4] = ", isOnUiThread = ";
            objArr[5] = Boolean.valueOf(com.safedk.android.utils.n.c());
            Logger.d(str4, objArr);
        }
        if (str2 == null) {
            cVar = null;
        } else {
            cVar = c(str2);
        }
        if (cVar == null) {
            List<c> s = s(str);
            if (z) {
                cVar = d(s);
            } else {
                cVar = s.size() == 1 ? s.get(0) : null;
            }
        }
        Logger.d(this.a, "set on video - ad info is: ", cVar);
        if (cVar == null || cVar.p != BrandSafetyUtils.AdType.MREC) {
            return false;
        }
        Logger.d(this.a, "set on video info is with event id: ", cVar.L, " is eov triggered: ", Boolean.valueOf(cVar.i().k), " is video: ", Boolean.valueOf(cVar.i().l));
        s sVar = (s) cVar;
        l i = sVar.i();
        if (i != null) {
            CreativeInfo j = i.j();
            if (z && !i.k) {
                sVar.b(m.p, new m.a(m.P, str3));
            } else if (!z && (!i.l || i.k)) {
                sVar.b(m.o, new m.a(m.P, str3));
            }
            String str5 = this.a;
            Logger.FeatureTag featureTag = Logger.FeatureTag.AD_CAPTURE;
            Object[] objArr2 = new Object[8];
            objArr2[0] = "on video ";
            objArr2[1] = z ? "completed" : TtmlNode.START;
            objArr2[2] = ", view address: ";
            objArr2[3] = str2;
            objArr2[4] = ", ad format: ";
            objArr2[5] = j != null ? j.I() : null;
            objArr2[6] = ", current value: ";
            objArr2[7] = Boolean.valueOf(i.k);
            Logger.d(str5, featureTag, objArr2);
            if (j != null) {
                Logger.d(this.a, "on mrec video event triggered, setting ci ad as video ad.");
                i.l = true;
                if (j.I() == null) {
                    String str6 = this.a;
                    Object[] objArr3 = new Object[3];
                    objArr3[0] = "on video ";
                    objArr3[1] = z ? "completed" : TtmlNode.START;
                    objArr3[2] = ", setting CI ad format, based on view address match";
                    Logger.d(str6, objArr3);
                    j.a(BrandSafetyEvent.AdFormatType.MREC);
                }
                if (!i.k && z) {
                    a((c) sVar);
                    Logger.d(this.a, "on video completed, setting to: ", Boolean.valueOf(z));
                    i.k = true;
                    i.l = true;
                    if (n(sVar.c())) {
                        if (sVar.an != null) {
                            Logger.d(this.a, "on video completed, impressionHandlerTask = ", sVar.an, ", taskFuture = ", sVar.an.d);
                            if (sVar.an.d != null) {
                                Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "on video completed, cancelling existing taskFuture ", sVar.an.d);
                                sVar.an.d.cancel(false);
                                sVar.an.d = null;
                            }
                            int Z = SafeDK.getInstance().Z() * 1000;
                            String str7 = this.a;
                            Object[] objArr4 = new Object[4];
                            objArr4[0] = "on video completed, start taking screenshots for view: ";
                            objArr4[1] = (sVar.an.b == null || sVar.an.b.get() == null) ? AbstractJsonLexerKt.NULL : sVar.an.b.get();
                            objArr4[2] = ", samplingInterval = ";
                            objArr4[3] = Integer.valueOf(Z);
                            Logger.d(str7, objArr4);
                            sVar.an = new BannerFinder.a(sVar, sVar.an.b, this.e, sVar.av);
                            sVar.an.d = this.E.scheduleWithFixedDelay(sVar.an, 500L, Z, TimeUnit.MILLISECONDS);
                        }
                    } else {
                        Logger.d(this.a, "on video completed, Info impressionHandlerTask is null : ", sVar);
                    }
                } else if (!z) {
                    a((c) sVar);
                    sVar.i().k = false;
                }
            }
        }
        return true;
    }

    private List<c> s(String str) {
        Logger.d(this.a, "get items by sdk package started, sdk: ", str);
        ArrayList arrayList = new ArrayList();
        synchronized (L) {
            for (e eVar : L.values()) {
                Logger.d(this.a, "get MREC infos By sdk package, mrec info: ", eVar);
                if ((eVar instanceof s) && !eVar.U && eVar.ab && eVar.c() != null && eVar.c().equals(str)) {
                    Logger.d(this.a, "get MREC infos By sdk package, adding ", eVar);
                    arrayList.add(eVar);
                }
            }
        }
        return arrayList;
    }

    private c d(List<c> list) {
        c cVar = null;
        for (c cVar2 : list) {
            if (cVar2 != null && cVar2.i() != null && cVar2.i().l) {
                if (cVar != null) {
                    Logger.d(this.a, "found more than one video mrec info - not returning");
                    return null;
                }
                cVar = cVar2;
            }
        }
        return cVar;
    }
}
