package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import com.ironsource.U3;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class f1 {
    public static String a(String str, HashMap hashMap) {
        StringBuilder sb = new StringBuilder(str);
        boolean z = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(z ? "?" : U3.j.c);
            sb.append((String) entry.getKey());
            sb.append(U3.j.b);
            sb.append(Uri.encode((String) entry.getValue()));
            z = false;
        }
        return sb.toString();
    }
}
