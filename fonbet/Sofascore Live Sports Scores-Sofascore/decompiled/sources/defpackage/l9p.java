package defpackage;

import com.google.android.gms.internal.measurement.zzwv;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l9p extends zzwv {
    public vvf a;
    public vvf b;
    public UUID c;
    public long d;
    public byte e;

    public final n9p a() {
        vvf vvfVar;
        vvf vvfVar2;
        UUID uuid;
        if (this.e == 1 && (vvfVar = this.a) != null && (vvfVar2 = this.b) != null && (uuid = this.c) != null) {
            return new n9p(vvfVar, vvfVar2, uuid, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" spansNames");
        }
        if (this.b == null) {
            sb.append(" extras");
        }
        if (this.c == null) {
            sb.append(" rootTraceId");
        }
        if (this.e == 0) {
            sb.append(" rootDurationMs");
        }
        a70.r("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
