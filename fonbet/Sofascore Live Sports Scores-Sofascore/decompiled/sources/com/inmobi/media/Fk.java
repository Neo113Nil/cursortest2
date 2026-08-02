package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Fk {
    public final C3742s1 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public String f;

    public Fk(C3742s1 c3742s1, String str, String str2, String str3, String str4) {
        str4.getClass();
        this.a = c3742s1;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final LinkedHashMap a() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C3742s1 c3742s1 = this.a;
        if (c3742s1 != null) {
            linkedHashMap.put("adType", c3742s1.a.m());
        }
        C3742s1 c3742s12 = this.a;
        if (c3742s12 != null) {
            linkedHashMap.put("plId", Long.valueOf(c3742s12.a.l.a));
        }
        C3742s1 c3742s13 = this.a;
        if (c3742s13 != null && (str = c3742s13.a.l.f) != null) {
            linkedHashMap.put("plType", str);
        }
        C3742s1 c3742s14 = this.a;
        if (c3742s14 != null) {
            AdSet s = c3742s14.a.s();
            Boolean valueOf = s != null ? Boolean.valueOf(s.getIsRewarded()) : null;
            if (valueOf != null) {
                linkedHashMap.put("isRewarded", valueOf);
            }
        }
        String str2 = this.c;
        if (str2 != null) {
            linkedHashMap.put("creativeId", str2);
        }
        String str3 = this.b;
        if (str3 != null) {
            linkedHashMap.put("creativeType", str3);
        }
        linkedHashMap.put("markupType", this.e);
        String str4 = this.f;
        if (str4 == null) {
            Intrinsics.i("triggerSource");
            throw null;
        }
        linkedHashMap.put("trigger", str4);
        C3742s1 c3742s15 = this.a;
        if (c3742s15 != null && c3742s15.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        Gk gk;
        AtomicBoolean atomicBoolean;
        C3742s1 c3742s1 = this.a;
        if (c3742s1 == null || (gk = c3742s1.b) == null || (atomicBoolean = gk.a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap a = a();
            a.put("networkType", F5.g());
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2177);
            String str = this.d;
            if (str == null) {
                str = "";
            }
            a.put("impressionId", str);
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("AdImpressionSuccessful", a, EnumC3943zk.SDK);
        }
    }

    public final void c() {
        Gk gk;
        AtomicBoolean atomicBoolean;
        C3742s1 c3742s1 = this.a;
        if (c3742s1 == null || (gk = c3742s1.b) == null || (atomicBoolean = gk.a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap a = a();
            a.put("networkType", F5.g());
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0);
            String str = this.d;
            if (str == null) {
                str = "";
            }
            a.put("impressionId", str);
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("AdImpressionSuccessful", a, EnumC3943zk.SDK);
        }
    }
}
