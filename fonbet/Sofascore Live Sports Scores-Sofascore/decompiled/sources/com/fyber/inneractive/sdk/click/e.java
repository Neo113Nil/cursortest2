package com.fyber.inneractive.sdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.f0;
import defpackage.mz1;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e implements f0 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ g c;

    public e(g gVar, List list, Uri uri) {
        this.c = gVar;
        this.a = list;
        this.b = uri;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        c cVar = (c) obj;
        if (this.c.f) {
            return;
        }
        if (exc != null || cVar == null) {
            String uri = this.b.toString();
            IAConfigManager iAConfigManager = IAConfigManager.N;
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.config.f0(uri, null));
            Uri uri2 = this.b;
            this.c.getClass();
            b a = r.a(uri2.toString(), "IgniteGooglePlay", "failed getting redirects");
            List list = this.a;
            if (list != null) {
                list.add(new j(this.b.toString(), false, q.INTERNAL_REDIRECT, "failed getting redirects. ignite click handler"));
                List list2 = this.a;
                a.f.clear();
                a.f.addAll(list2);
            }
            g gVar = this.c;
            f fVar = gVar.c;
            if (fVar != null) {
                fVar.a(a, gVar.d, gVar.e);
                return;
            }
            return;
        }
        if (cVar.a.size() > 0) {
            String str = (String) mz1.h(cVar.a, 1);
            if (this.a != null) {
                Iterator it = cVar.a.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!TextUtils.equals(str2, str)) {
                        this.a.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                List list3 = this.a;
                q qVar = q.OPEN_INTERNAL_STORE;
                list3.add(new j(str, true, qVar, null));
                this.c.getClass();
                b bVar = new b(str, qVar, "IgniteGooglePlay", null);
                List list4 = this.a;
                bVar.f.clear();
                bVar.f.addAll(list4);
                g gVar2 = this.c;
                f fVar2 = gVar2.c;
                if (fVar2 != null) {
                    fVar2.a(bVar, gVar2.d, gVar2.e);
                }
            }
            if (str.startsWith("market")) {
                String replace = str.replace("market://details?id=", "https://play.google.com/store/apps/details?id=");
                IAConfigManager iAConfigManager2 = IAConfigManager.N;
                com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.config.f0(replace, null));
            } else {
                String str3 = cVar.b;
                IAConfigManager iAConfigManager3 = IAConfigManager.N;
                com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.config.f0(str, str3));
            }
        }
    }
}
