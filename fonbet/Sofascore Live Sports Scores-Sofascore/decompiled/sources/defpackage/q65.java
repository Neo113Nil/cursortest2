package defpackage;

import android.graphics.PointF;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q65 {
    public String a;
    public String b;
    public float c;
    public int d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public PointF l;
    public PointF m;

    public final int hashCode() {
        int C = ((wt3.C(this.d) + (((int) (dmi.c(this.a.hashCode() * 31, 31, this.b) + this.c)) * 31)) * 31) + this.e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((C * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.h;
    }
}
