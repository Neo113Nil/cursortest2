package defpackage;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yqk implements i72 {
    public static final yqk e = new yqk(0, 1.0f, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    public yqk(int i, float f, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yqk) {
            yqk yqkVar = (yqk) obj;
            if (this.a == yqkVar.a && this.b == yqkVar.b && this.c == yqkVar.c && this.d == yqkVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }
}
