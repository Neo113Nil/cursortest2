package defpackage;

import com.google.android.gms.internal.ads.zzebo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r2o extends zzebo {
    public long a;
    public int b;
    public byte c;

    public final s2o a() {
        if (this.c == 3) {
            return new s2o(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" id");
        }
        if ((this.c & 2) == 0) {
            sb.append(" eventType");
        }
        a70.r("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
