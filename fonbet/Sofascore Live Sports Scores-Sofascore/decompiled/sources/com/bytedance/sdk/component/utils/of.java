package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class of {
    private static sf pcc;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class pcc {
        public abstract JSONObject pcc();

        public final String sf() {
            try {
                return pcc().toString();
            } catch (Exception unused) {
                return "";
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void pcc(String str, boolean z, pcc pccVar);
    }

    public static void pcc(String str, pcc pccVar) {
        sf sfVar = pcc;
        if (sfVar == null) {
            return;
        }
        sfVar.pcc(str, false, pccVar);
    }

    public static void pcc(sf sfVar) {
        pcc = sfVar;
    }
}
