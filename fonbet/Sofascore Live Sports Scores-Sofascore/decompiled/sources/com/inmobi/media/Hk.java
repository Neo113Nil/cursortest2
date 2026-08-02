package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.lnb;
import defpackage.tub;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Hk {
    public static final Map a(G g) {
        String creativeType;
        g.getClass();
        LinkedHashMap i = tub.i(new Pair("plId", Long.valueOf(g.a.a.a)), new Pair("plType", g.a.a.h), new Pair("adType", IronSourceConstants.EVENTS_NATIVE), new Pair("markupType", g.c), new Pair("creativeId", lnb.o("\"", g.e, "\"")), new Pair("impressionId", lnb.o("\"", g.m.b, "\"")), new Pair("isRewarded", Boolean.valueOf(g.b.a)));
        MetaInfo metaInfo = g.d;
        if (metaInfo != null && (creativeType = metaInfo.getCreativeType()) != null) {
            i.put("creativeType", creativeType);
        }
        String str = g.i;
        if (str != null) {
            i.put("metadataBlob", str);
        }
        return i;
    }

    public static final Map a(C3691q1 c3691q1) {
        c3691q1.getClass();
        return tub.i(new Pair("plId", Long.valueOf(c3691q1.a.a)), new Pair("plType", c3691q1.a.h), new Pair("adType", IronSourceConstants.EVENTS_NATIVE));
    }
}
