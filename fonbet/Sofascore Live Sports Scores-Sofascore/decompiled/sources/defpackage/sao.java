package defpackage;

import com.google.android.gms.internal.ads.zzfyj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sao extends zzfyj {
    public String a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public byte f;

    public final tao a() {
        String str;
        if (this.f == 63 && (str = this.a) != null) {
            return new tao(str, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        a70.r("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
