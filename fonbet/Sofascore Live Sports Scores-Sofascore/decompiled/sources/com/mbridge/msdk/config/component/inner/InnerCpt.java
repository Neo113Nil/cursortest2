package com.mbridge.msdk.config.component.inner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class InnerCpt extends a {
    public final String h = "InnerCpt";
    final String i = "700001";
    com.mbridge.msdk.config.component.inner.model.a j;

    private void a(Context context, String str, String str2, Map<String, Object> map) {
        String message;
        Intent intent;
        boolean z = false;
        try {
            message = "";
            if (!TextUtils.isEmpty(str)) {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                if (!TextUtils.isEmpty(scheme) && scheme.equals("intent")) {
                    intent = Intent.parseUri(str, 1);
                } else if (TextUtils.isEmpty(scheme) || !scheme.equals("android-app")) {
                    intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setData(parse);
                } else {
                    intent = Intent.parseUri(str, 2);
                }
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : this.j.b().entrySet()) {
                        intent.putExtra(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                if (intent != null) {
                    intent.setComponent(null);
                    intent.setSelector(null);
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                    if (context instanceof Activity) {
                        context.startActivity(intent);
                    } else {
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                    }
                    z = true;
                }
            }
        } catch (Throwable th) {
            q0.b("InnerCpt", th.getMessage(), th);
            message = th.getMessage();
        }
        a(z, message);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f = "901001";
        this.j = new com.mbridge.msdk.config.component.inner.model.a(map);
        ViewGroup e = e();
        com.mbridge.msdk.config.component.inner.model.a aVar = this.j;
        if (e != null) {
            aVar.a(e().getContext());
        } else {
            aVar.a(c.n().d());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (this.j.f().equals(com.mbridge.msdk.config.component.common.util.c.c("336"))) {
            String c = this.j.c();
            if (!TextUtils.isEmpty(c) && c.equals(com.mbridge.msdk.config.component.common.util.c.c("339"))) {
                g();
            }
            a("901006", (HashMap<String, Object>) null);
        }
    }

    public void g() {
        com.mbridge.msdk.config.component.inner.model.a aVar = this.j;
        if (aVar != null) {
            a(aVar.a(), this.j.d(), this.j.e(), this.j.b());
        }
    }

    private void a(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("500"), String.valueOf(z ? 1 : 0));
        if (!z) {
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), "700001");
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), str);
        }
        a(a("901005", (Map<String, Object>) hashMap));
    }
}
