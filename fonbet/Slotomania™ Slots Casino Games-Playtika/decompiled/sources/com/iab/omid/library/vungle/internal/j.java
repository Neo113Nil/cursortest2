package com.iab.omid.library.vungle.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.X3;
import io.sentry.protocol.SentryException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class j {
    private static Map<String, String> a(Uri uri) {
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    private static void a(Map<String, String> map) {
        try {
            com.iab.omid.library.vungle.attestation.e.a(g.b().a().getApplicationContext(), map.get(SentryException.JsonKeys.MECHANISM), new com.iab.omid.library.vungle.attestation.a(map));
        } catch (Exception e) {
            com.iab.omid.library.vungle.utils.d.a("Error processing attestation request in OmidNativeUrlHandler", e);
        }
    }

    public static void b(Uri uri) {
        String str;
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                str = "OmidNativeUrlHandler failed to handle url [" + uri.toString() + "] as 'method' not available";
            } else {
                if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                    a(a(uri));
                    return;
                }
                str = "Unknown method in OmidNativeUrlHandler.handle :" + queryParameter;
            }
            com.iab.omid.library.vungle.utils.d.b(str);
        } catch (Exception e) {
            com.iab.omid.library.vungle.utils.d.a("OmidNativeUrlHandler failed to handle url [" + uri.toString() + X3.j.e, e);
        }
    }
}
