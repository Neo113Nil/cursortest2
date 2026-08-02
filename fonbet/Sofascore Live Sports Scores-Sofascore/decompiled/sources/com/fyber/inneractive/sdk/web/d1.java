package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import defpackage.dmi;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d1 {
    public final String a;
    public final String b;
    public final HashMap c;

    public d1(WebResourceRequest webResourceRequest) {
        this.a = webResourceRequest.getUrl().toString();
        this.b = webResourceRequest.getMethod();
        this.c = new HashMap(webResourceRequest.getRequestHeaders() == null ? Collections.EMPTY_MAP : webResourceRequest.getRequestHeaders());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.a.equals(d1Var.a) && this.b.equals(d1Var.b)) {
            return this.c.equals(d1Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }
}
