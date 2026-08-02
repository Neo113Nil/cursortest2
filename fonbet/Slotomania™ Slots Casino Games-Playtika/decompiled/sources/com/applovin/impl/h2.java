package com.applovin.impl;

import android.net.Uri;
import android.text.format.Formatter;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinAdSize;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class h2 {
    public static Map a(AppLovinAdImpl appLovinAdImpl) {
        HashMap hashMap = new HashMap(10);
        if (appLovinAdImpl != null) {
            CollectionUtils.putStringIfValid(CreativeInfo.aT, appLovinAdImpl.getAdDomain(), hashMap);
            CollectionUtils.putStringIfValid(CreativeInfo.c, String.valueOf(appLovinAdImpl.getAdIdNumber()), hashMap);
            MaxAdFormat d = appLovinAdImpl.getAdZone().d();
            CollectionUtils.putStringIfValid("ad_format", d != null ? d.getLabel() : null, hashMap);
            CollectionUtils.putStringIfValid("ad_zone_id", appLovinAdImpl.getAdZone().e(), hashMap);
            CollectionUtils.putStringIfValid("clcode", appLovinAdImpl.getClCode(), hashMap);
            CollectionUtils.putStringIfValid("dsp_id", appLovinAdImpl.getDspId(), hashMap);
            CollectionUtils.putStringIfValid("dsp_name", appLovinAdImpl.getDspName(), hashMap);
            CollectionUtils.putStringIfValid("ad_size", appLovinAdImpl.getSize().getLabel(), hashMap);
            CollectionUtils.putStringIfValid("ad_event_id", appLovinAdImpl.getMediationServeId(), hashMap);
            CollectionUtils.putStringIfValid("is_omsdk_enabled", String.valueOf(appLovinAdImpl.isOpenMeasurementEnabled()), hashMap);
            if (appLovinAdImpl instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) appLovinAdImpl;
                CollectionUtils.putStringIfValid("is_persisted_ad", String.valueOf(bVar.z0()), hashMap);
                CollectionUtils.putStringIfValid("template_stage_info", String.valueOf(bVar.b0()), hashMap);
            }
        }
        return hashMap;
    }

    public static String b(com.applovin.impl.sdk.ad.b bVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "reshow_count", bVar.T());
        JsonUtils.putInt(jSONObject, "reshow_count_from_render_process_gone", bVar.U());
        return jSONObject.toString();
    }

    public static Map a(com.applovin.impl.sdk.ad.b bVar) {
        HashMap hashMap = new HashMap();
        if (bVar != null) {
            com.applovin.impl.sdk.l sdk = bVar.getSdk();
            if (((Boolean) sdk.a(z4.L)).booleanValue()) {
                HashMap hashMap2 = new HashMap();
                Iterator it = new ArrayList(bVar.m().keySet()).iterator();
                while (it.hasNext()) {
                    String path = Uri.parse((String) it.next()).getPath();
                    hashMap2.put(path, Formatter.formatFileSize(com.applovin.impl.sdk.l.p(), new File(path).length()));
                }
                hashMap.put("path", hashMap2.toString());
            }
            if ((bVar instanceof com.applovin.impl.sdk.ad.a) && ((Boolean) sdk.a(z4.M)).booleanValue()) {
                hashMap.put("details", ((com.applovin.impl.sdk.ad.a) bVar).h1());
            }
        }
        return hashMap;
    }

    public static Map a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        HashMap hashMap = new HashMap(7);
        if (appLovinNativeAdImpl == null) {
            return hashMap;
        }
        CollectionUtils.putStringIfValid(CreativeInfo.aT, appLovinNativeAdImpl.getAdDomain(), hashMap);
        CollectionUtils.putStringIfValid(CreativeInfo.c, String.valueOf(appLovinNativeAdImpl.getAdIdNumber()), hashMap);
        CollectionUtils.putStringIfValid("clcode", appLovinNativeAdImpl.getClCode(), hashMap);
        CollectionUtils.putStringIfValid("dsp_id", appLovinNativeAdImpl.getDspId(), hashMap);
        CollectionUtils.putStringIfValid("dsp_name", appLovinNativeAdImpl.getDspName(), hashMap);
        CollectionUtils.putStringIfValid("ad_size", AppLovinAdSize.NATIVE.toString(), hashMap);
        CollectionUtils.putStringIfValid("ad_event_id", appLovinNativeAdImpl.getMediationServeId(), hashMap);
        CollectionUtils.putStringIfValid("is_omsdk_enabled", String.valueOf(appLovinNativeAdImpl.isOpenMeasurementEnabled()), hashMap);
        return hashMap;
    }

    public static Map a(a3 a3Var) {
        Map a = a((m3) a3Var);
        CollectionUtils.putStringIfValid("bcode", a3Var.C(), a);
        CollectionUtils.putStringIfValid("creative_id", a3Var.getCreativeId(), a);
        CollectionUtils.putStringIfValid("ad_unit_id", a3Var.getAdUnitId(), a);
        CollectionUtils.putStringIfValid("ad_event_id", a3Var.T(), a);
        CollectionUtils.putStringIfValid("ad_format", a3Var.getFormat().getLabel(), a);
        CollectionUtils.putStringIfValid("dsp_id", a3Var.getDspId(), a);
        CollectionUtils.putStringIfValid("dsp_name", a3Var.getDspName(), a);
        return a;
    }

    public static Map a(m3 m3Var) {
        HashMap hashMap = new HashMap(3);
        CollectionUtils.putStringIfValid(BrandSafetyEvent.ad, m3Var.c(), hashMap);
        String b = m3Var.b();
        CollectionUtils.putStringIfValid("adapter_class", b, hashMap);
        CollectionUtils.putStringIfValid("adapter_version", y3.a(b).getAdapterVersion(), hashMap);
        return hashMap;
    }

    public static Map a(MaxError maxError) {
        HashMap hashMap = new HashMap(4);
        CollectionUtils.putStringIfValid("error_message", maxError.getMessage(), hashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(maxError.getCode()), hashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_message", maxError.getMediatedNetworkErrorMessage(), hashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(maxError.getMediatedNetworkErrorCode()), hashMap);
        return hashMap;
    }

    public static String a(String str) {
        return StringUtils.prefixToIndex(1000, str);
    }
}
