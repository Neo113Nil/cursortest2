package com.moloco.sdk.internal.publisher;

import defpackage.be5;
import defpackage.sub;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.zzl;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class u {
    public final Map a;
    public final long b;

    public u() {
        long R;
        w0[] values = w0.values();
        int c = sub.c(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c < 16 ? 16 : c);
        for (w0 w0Var : values) {
            switch (t.a[w0Var.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    R = wkn.R(5, be5.SECONDS);
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    R = wkn.R(15, be5.SECONDS);
                    break;
                default:
                    zzl.b();
                    throw null;
            }
            linkedHashMap.put(w0Var, new xd5(R));
        }
        long R2 = wkn.R(5, be5.SECONDS);
        this.a = linkedHashMap;
        this.b = R2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a.equals(uVar.a) && xd5.d(this.b, uVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wd5 wd5Var = xd5.b;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return "AdCreatorConfiguration(adTimeouts=" + this.a + ", defaultTimeoutDuration=" + ((Object) xd5.l(this.b)) + ')';
    }
}
