package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.zzl;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.sh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3758sh {
    public static final void a(AbstractC3732rh abstractC3732rh) {
        abstractC3732rh.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (abstractC3732rh instanceof C3655oh) {
            linkedHashMap.put("trigger", ((C3655oh) abstractC3732rh).a);
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("BillingClientConnectionError", linkedHashMap, EnumC3943zk.SDK);
        } else if (abstractC3732rh instanceof C3681ph) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((C3681ph) abstractC3732rh).a));
            C3839vk c3839vk2 = C3839vk.a;
            C3839vk.b("IAPFetchFailed", linkedHashMap, EnumC3943zk.SDK);
        } else if (!(abstractC3732rh instanceof C3707qh)) {
            zzl.b();
        } else {
            C3839vk c3839vk3 = C3839vk.a;
            C3839vk.b("IAPFetchSuccess", linkedHashMap, EnumC3943zk.SDK);
        }
    }
}
