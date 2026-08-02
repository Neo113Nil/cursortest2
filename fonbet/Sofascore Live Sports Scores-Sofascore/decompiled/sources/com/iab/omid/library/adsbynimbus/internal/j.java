package com.iab.omid.library.adsbynimbus.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.U3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class j {
    private static void a(Map<String, String> map) {
        try {
            com.iab.omid.library.adsbynimbus.attestation.e.a(g.b().a().getApplicationContext(), map.get("mechanism"), new com.iab.omid.library.adsbynimbus.attestation.a(map));
        } catch (Exception e) {
            com.iab.omid.library.adsbynimbus.utils.d.a("Error processing attestation request in OmidNativeUrlHandler", e);
        }
    }

    public static void b(Uri uri) {
        String concat;
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                concat = "OmidNativeUrlHandler failed to handle url [" + uri.toString() + "] as 'method' not available";
            } else {
                if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                    a(a(uri));
                    return;
                }
                concat = "Unknown method in OmidNativeUrlHandler.handle :".concat(queryParameter);
            }
            com.iab.omid.library.adsbynimbus.utils.d.b(concat);
        } catch (Exception e) {
            com.iab.omid.library.adsbynimbus.utils.d.a("OmidNativeUrlHandler failed to handle url [" + uri.toString() + U3.j.e, e);
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
