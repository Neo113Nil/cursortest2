package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hk9 extends IOException implements ct3 {
    public final String a;
    public final Long b;

    public hk9(String str, Long l, Throwable th) {
        super(mz1.n(wt3.q("Request timeout has expired [url=", str, ", request_timeout="), l == null ? "unknown" : l, " ms]"), th);
        this.a = str;
        this.b = l;
    }

    @Override // defpackage.ct3
    public final Throwable d() {
        return new hk9(this.a, this.b, getCause());
    }
}
