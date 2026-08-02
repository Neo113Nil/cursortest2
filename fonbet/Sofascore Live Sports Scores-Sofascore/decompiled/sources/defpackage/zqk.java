package defpackage;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zqk {
    public static final zqk d = new zqk(0, 0);
    public final int a;
    public final int b;
    public final float c;

    static {
        nik.N(0);
        nik.N(1);
        nik.N(3);
    }

    public zqk(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zqk) {
            zqk zqkVar = (zqk) obj;
            if (this.a == zqkVar.a && this.b == zqkVar.b && this.c == zqkVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.a) * 31) + this.b) * 31);
    }

    public zqk(int i, int i2) {
        this(i, i2, 1.0f);
    }
}
