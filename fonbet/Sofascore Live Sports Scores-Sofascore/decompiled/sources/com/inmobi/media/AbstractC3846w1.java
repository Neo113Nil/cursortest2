package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import defpackage.tub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.w1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3846w1 {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        r6 = kotlin.text.StringsKt__StringsKt.split$default(r6, new java.lang.String[]{"x"}, false, 2, 2, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3794u1 a(String str, Map map) {
        C3820v1 c3820v1;
        List split$default;
        str.getClass();
        Map p = map != null ? tub.p(map) : null;
        if (p == null || p.isEmpty() || !N3.a((String) p.get("ab-type")) || !N3.a((String) p.get("ab-ad-slot"))) {
            return new C3794u1(p, null);
        }
        TimeoutConfigurations.MediationConfig a0 = ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getTimeouts().a0();
        if (!(str.equals("AB") ? a0.getAb().getBanner().isAdaptiveBannerEnabled((String) p.get("tp")) : a0.getNonAb().getBanner().isAdaptiveBannerEnabled((String) p.get("tp")))) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(p);
            linkedHashMap.remove("ab-type");
            linkedHashMap.remove("ab-ad-slot");
            return new C3794u1(linkedHashMap, null);
        }
        String str2 = (String) p.get("ab-type");
        if (!Intrinsics.c(str2, "inline") && !Intrinsics.c(str2, "anchored")) {
            return new C3794u1(p, null);
        }
        String str3 = (String) p.get("ab-ad-slot");
        if (str3 != null && split$default != null) {
            if (split$default.size() != 2) {
                split$default = null;
            }
            if (split$default != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = split$default.iterator();
                while (it.hasNext()) {
                    Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                    if (intOrNull != null) {
                        arrayList.add(intOrNull);
                    }
                }
                if (arrayList.size() == 2) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((Number) it2.next()).intValue() > 0) {
                            }
                        }
                    }
                    if (arrayList != null) {
                        c3820v1 = new C3820v1(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue());
                        if (c3820v1 == null) {
                            return new C3794u1(p, c3820v1);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p);
                        linkedHashMap2.remove("ab-type");
                        linkedHashMap2.remove("ab-ad-slot");
                        return new C3794u1(linkedHashMap2, null);
                    }
                }
                arrayList = null;
                if (arrayList != null) {
                }
            }
        }
        c3820v1 = null;
        if (c3820v1 == null) {
        }
    }
}
