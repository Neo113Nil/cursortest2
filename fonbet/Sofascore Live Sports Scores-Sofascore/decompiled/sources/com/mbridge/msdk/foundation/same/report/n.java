package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.v;
import com.mbridge.msdk.tracker.w;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class n extends w {
    @Override // com.mbridge.msdk.tracker.w
    public v<String> a(q qVar) {
        String str;
        try {
            str = new String(qVar.b, com.mbridge.msdk.tracker.network.toolbox.f.a(qVar.c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(qVar.b);
        }
        return v.a(str, com.mbridge.msdk.tracker.network.toolbox.f.a(qVar));
    }
}
