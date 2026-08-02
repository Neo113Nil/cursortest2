package com.iab.omid.library.vungle.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.U3;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j {
    private static void a(Map<String, String> map) {
        try {
            com.iab.omid.library.vungle.attestation.e.a(g.b().a().getApplicationContext(), map.get("mechanism"), new com.iab.omid.library.vungle.attestation.a(map));
        } catch (Exception e) {
            com.iab.omid.library.vungle.utils.d.a("Error processing attestation request in OmidNativeUrlHandler", e);
        }
    }

    public static void b(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                com.iab.omid.library.vungle.utils.d.b("OmidNativeUrlHandler failed to handle url [" + uri.toString() + "] as 'method' not available");
                return;
            }
            if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                a(a(uri));
                return;
            }
            com.iab.omid.library.vungle.utils.d.b("Unknown method in OmidNativeUrlHandler.handle :".concat(queryParameter));
        } catch (Exception e) {
            StringBuilder a = l.a("OmidNativeUrlHandler failed to handle url [");
            a.append(uri.toString());
            a.append(U3.j.e);
            com.iab.omid.library.vungle.utils.d.a(a.toString(), e);
        }
    }

    private static Map<String, String> a(Uri uri) {
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }
}
