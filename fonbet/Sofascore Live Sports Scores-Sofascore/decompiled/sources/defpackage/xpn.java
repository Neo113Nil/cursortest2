package defpackage;

import com.google.android.gms.internal.measurement.zzcc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xpn extends zzcc {
    public String a;
    public byte b;
    public int c;
    public int d;

    public final aqn a() {
        if (this.b == 1 && this.a != null && this.c != 0 && this.d != 0) {
            return new aqn(this.a, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" fileOwner");
        }
        if (this.b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.c == 0) {
            sb.append(" fileChecks");
        }
        if (this.d == 0) {
            sb.append(" filePurpose");
        }
        a70.r("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
