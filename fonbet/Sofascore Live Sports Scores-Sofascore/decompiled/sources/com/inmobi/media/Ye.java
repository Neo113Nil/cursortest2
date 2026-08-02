package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ye extends AbstractC3291af {
    public final String a;
    public final Ok b;

    public Ye(String str, Ok ok) {
        str.getClass();
        this.a = str;
        this.b = ok;
    }

    @Override // com.inmobi.media.AbstractC3291af
    public final Map a() {
        return null;
    }

    @Override // com.inmobi.media.AbstractC3291af
    public final Vi b() {
        return null;
    }

    @Override // com.inmobi.media.AbstractC3291af
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ye)) {
            return false;
        }
        Ye ye = (Ye) obj;
        return Intrinsics.c(this.a, ye.a) && Intrinsics.c(this.b, ye.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 961);
    }

    public final String toString() {
        return "HeadRequest(url=" + this.a + ", headers=null, timeouts=" + this.b + ", retryPolicy=null, followRedirects=true)";
    }
}
