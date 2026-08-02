package defpackage;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzgss;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bgo extends zzgss {
    public IBinder a;
    public String b;
    public int c;
    public float d;
    public int e;
    public String f;
    public byte g;

    public final cgo a() {
        IBinder iBinder;
        if (this.g == 63 && (iBinder = this.a) != null) {
            return new cgo(iBinder, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" windowToken");
        }
        if ((this.g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.g & 16) == 0) {
            sb.append(" theme");
        }
        if ((this.g & 32) == 0) {
            sb.append(" windowWidthPx");
        }
        a70.r("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
