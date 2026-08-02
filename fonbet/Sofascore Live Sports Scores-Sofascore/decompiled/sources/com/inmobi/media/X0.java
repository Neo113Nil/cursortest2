package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.k13;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class X0 {
    public static final Partner a;

    static {
        String partnerKey = ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getViewability().getOmidConfig().getPartnerKey();
        if (partnerKey.length() == 0) {
            partnerKey = "Inmobi";
        }
        Partner createPartner = Partner.createPartner(partnerKey, a());
        createPartner.getClass();
        a = createPartner;
    }

    public static AdSessionContext a(String str, List list, Map map, String str2, String str3) {
        VerificationScriptResource verificationScriptResource;
        str.getClass();
        list.getClass();
        map.getClass();
        str3.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Nf nf = (Nf) it.next();
            try {
                String str4 = nf.a;
                for (Map.Entry entry : map.entrySet()) {
                    str4 = kotlin.text.c.r(str4, (String) entry.getKey(), (String) entry.getValue(), false);
                }
                URL url = new URL(str4);
                String str5 = nf.c;
                String str6 = nf.d;
                verificationScriptResource = (str5.length() <= 0 || !N3.a(str6)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(str5, url, str6);
            } catch (MalformedURLException unused) {
                verificationScriptResource = null;
            }
            arrayList.add(verificationScriptResource);
        }
        AdSessionContext createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(a, str, CollectionsKt.W(arrayList), str2, str3);
        createNativeAdSessionContext.getClass();
        return createNativeAdSessionContext;
    }

    public static String a() {
        return "a".concat(kotlin.text.c.r("11.3.0", ".", "", false));
    }
}
