package defpackage;

import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w0d {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public w0d(w0d w0dVar) {
        this.a = 1;
        this.b = w0dVar.b;
        this.c = w0dVar.c;
        this.d = w0dVar.d;
        this.e = w0dVar.e;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.b = Math.max(f, this.b);
        this.c = Math.max(f2, this.c);
        this.d = Math.min(f3, this.d);
        this.e = Math.min(f4, this.e);
    }

    public boolean b() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public float c() {
        return this.b + this.d;
    }

    public float d() {
        return this.c + this.e;
    }

    public void e(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.b += intBitsToFloat;
        this.c += intBitsToFloat2;
        this.d += intBitsToFloat;
        this.e += intBitsToFloat2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "MutableRect(" + t62.O(this.b) + ", " + t62.O(this.c) + ", " + t62.O(this.d) + ", " + t62.O(this.e) + ')';
            default:
                return U3.j.d + this.b + " " + this.c + " " + this.d + " " + this.e + U3.j.e;
        }
    }

    public w0d(float f, float f2, float f3, float f4) {
        this.a = 1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public w0d() {
        this.a = 0;
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
