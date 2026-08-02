package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class amg implements Cloneable {
    public final float a;
    public final int b;

    public amg(float f) {
        this.a = f;
        this.b = 1;
    }

    public final float a() {
        float f;
        float f2;
        int C = wt3.C(this.b);
        float f3 = this.a;
        if (C == 0) {
            return f3;
        }
        if (C == 3) {
            return f3 * 96.0f;
        }
        if (C == 4) {
            f = f3 * 96.0f;
            f2 = 2.54f;
        } else if (C == 5) {
            f = f3 * 96.0f;
            f2 = 25.4f;
        } else if (C == 6) {
            f = f3 * 96.0f;
            f2 = 72.0f;
        } else {
            if (C != 7) {
                return f3;
            }
            f = f3 * 96.0f;
            f2 = 6.0f;
        }
        return f / f2;
    }

    public final float b(vng vngVar) {
        if (this.b != 9) {
            return d(vngVar);
        }
        tng tngVar = (tng) vngVar.c;
        w0d w0dVar = tngVar.g;
        if (w0dVar == null) {
            w0dVar = tngVar.f;
        }
        float f = this.a;
        if (w0dVar == null) {
            return f;
        }
        float f2 = w0dVar.d;
        if (f2 != w0dVar.e) {
            f2 = (float) (Math.sqrt((r0 * r0) + (f2 * f2)) / 1.414213562373095d);
        }
        return (f * f2) / 100.0f;
    }

    public final float c(vng vngVar, float f) {
        return this.b == 9 ? (this.a * f) / 100.0f : d(vngVar);
    }

    public final float d(vng vngVar) {
        float textSize;
        int C = wt3.C(this.b);
        float f = this.a;
        switch (C) {
            case 1:
                textSize = ((tng) vngVar.c).d.getTextSize();
                break;
            case 2:
                textSize = ((tng) vngVar.c).d.getTextSize() / 2.0f;
                break;
            case 3:
                vngVar.getClass();
                return f * 96.0f;
            case 4:
                vngVar.getClass();
                return (f * 96.0f) / 2.54f;
            case 5:
                vngVar.getClass();
                return (f * 96.0f) / 25.4f;
            case 6:
                vngVar.getClass();
                return (f * 96.0f) / 72.0f;
            case 7:
                vngVar.getClass();
                return (f * 96.0f) / 6.0f;
            case 8:
                tng tngVar = (tng) vngVar.c;
                w0d w0dVar = tngVar.g;
                if (w0dVar == null) {
                    w0dVar = tngVar.f;
                }
                if (w0dVar != null) {
                    return (f * w0dVar.d) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    public final float e(vng vngVar) {
        if (this.b != 9) {
            return d(vngVar);
        }
        tng tngVar = (tng) vngVar.c;
        w0d w0dVar = tngVar.g;
        if (w0dVar == null) {
            w0dVar = tngVar.f;
        }
        float f = this.a;
        return w0dVar == null ? f : (f * w0dVar.e) / 100.0f;
    }

    public final boolean f() {
        return this.a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean g() {
        return this.a == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.a));
        switch (this.b) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public amg(float f, int i) {
        this.a = f;
        this.b = i;
    }
}
