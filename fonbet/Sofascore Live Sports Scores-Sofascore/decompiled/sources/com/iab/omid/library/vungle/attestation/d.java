package com.iab.omid.library.vungle.attestation;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class d {
    public b a(String str, Context context) {
        try {
            if (str == null) {
                com.iab.omid.library.vungle.utils.d.b("Cannot create mechanism: Mechanism name cannot be null");
                return null;
            }
            if (context == null) {
                com.iab.omid.library.vungle.utils.d.b("Cannot create mechanism: Context cannot be null");
                return null;
            }
            if ("FireTVFOSDAT".equals(str)) {
                return new i(context);
            }
            return null;
        } catch (Exception e) {
            com.iab.omid.library.vungle.utils.d.a("Error creating attestation mechanism: " + str, e);
            return null;
        }
    }
}
