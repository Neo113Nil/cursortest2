package com.inmobi.media;

import defpackage.d2g;
import defpackage.dmi;
import defpackage.epf;
import defpackage.p7a;
import defpackage.q7a;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.kc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3546kc implements q7a {
    @Override // defpackage.q7a
    public final d2g intercept(p7a p7aVar) {
        String a;
        p7aVar.getClass();
        epf epfVar = (epf) p7aVar;
        d2g b = epfVar.b(epfVar.e);
        boolean z = b.r;
        if (!z) {
            return b;
        }
        String str = null;
        if (z && (a = b.f.a("Location")) != null) {
            str = a;
        }
        if (str != null) {
            try {
                new URL(str);
                return b;
            } catch (MalformedURLException unused) {
            }
        }
        epfVar.a.cancel();
        throw new MalformedURLException(dmi.q("Invalid URL in Location header: ", str));
    }
}
