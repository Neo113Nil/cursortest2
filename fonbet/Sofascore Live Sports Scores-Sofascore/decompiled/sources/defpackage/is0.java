package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class is0 {
    public final int a;
    public final long b;

    public is0(int i, long j) {
        if (i == 0) {
            yhk.s("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof is0)) {
            return false;
        }
        is0 is0Var = (is0) obj;
        return wt3.b(this.a, is0Var.a) && this.b == is0Var.b;
    }

    public final int hashCode() {
        int C = (wt3.C(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ C;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : Payload.RESPONSE_OK);
        sb.append(", nextRequestWaitMillis=");
        return lnb.l(this.b, "}", sb);
    }
}
