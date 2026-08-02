package com.applovin.impl;

import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class s1 extends g2 {
    private JSONObject i;

    public s1(com.applovin.impl.sdk.l lVar) {
        super(lVar, f2.b.ERROR);
    }

    public void a(String str, Throwable th) {
        a(str, th, new HashMap());
    }

    public void b() {
        this.i = JsonUtils.deserialize((String) this.a.a(z4.K));
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(String str, String str2, Throwable th) {
        a(str, str2, th, new HashMap());
    }

    public void a(String str, String str2, Throwable th, Map map) {
        a(str + ":" + str2, th, map);
    }

    public void b(final String str, final String str2, final Throwable th) {
        this.a.s0().a((k5) new u6(this.a, "reportCaughtException", new Runnable() { // from class: com.applovin.impl.s1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                s1.this.a(str, str2, th);
            }
        }), f6.b.OTHER);
    }

    public void a(String str, Throwable th, Map map) {
        map.put("source", str);
        map.put("top_main_method", th.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th2 : th.getSuppressed()) {
            HashMap hashMap = new HashMap();
            CollectionUtils.putStringIfValid("source", str, hashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), hashMap);
            CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), hashMap);
            arrayList.add(hashMap);
        }
        a(f2.W0, arrayList, 0L);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        hashMap.put("error_message", str2);
        if (bVar != null) {
            hashMap.putAll(h2.a((AppLovinAdImpl) bVar));
            hashMap.putAll(h2.a(bVar));
            boolean D0 = bVar.D0();
            hashMap.put("is_video_stream", String.valueOf(D0));
            if (D0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid(CreativeInfo.e, ((com.applovin.impl.sdk.ad.a) bVar).j1(), hashMap);
            } else {
                CollectionUtils.putStringIfValid(CreativeInfo.e, bVar.K(), hashMap);
            }
        }
        d(f2.c1, hashMap);
    }

    public void a(String str, String str2, int i, String str3) {
        List a = a(str2);
        boolean z = a != null;
        if (z && a.contains(Integer.valueOf(i))) {
            return;
        }
        if (z || i >= 400) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("source", str);
            hashMap.put("url", StringUtils.emptyIfNull(str2));
            hashMap.put("code", String.valueOf(i));
            hashMap.put("error_message", h2.a(str3));
            d(f2.f1, hashMap);
        }
    }

    private List a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.i, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.i, "default", null) : integerList;
    }
}
