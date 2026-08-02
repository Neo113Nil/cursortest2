package defpackage;

import com.google.android.gms.internal.ads.zzgsu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dgo extends zzgsu {
    public int a;
    public String b;
    public int c;
    public Boolean d;
    public byte e;

    public final ego a() {
        if (this.e == 3) {
            return new ego(this.a, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.e & 2) == 0) {
            sb.append(" uiMode");
        }
        a70.r("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
