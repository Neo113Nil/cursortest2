package androidx.dynamicanimation.animation;

import kotlin.jvm.internal.Intrinsics;
import p1.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public float f1783a;

    /* renamed from: b, reason: collision with root package name */
    public float f1784b;

    public g(float f6, float f10) {
        this.f1783a = f6;
        this.f1784b = f10;
    }

    public float a(p1.c c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        float a7 = c2.a();
        float f6 = this.f1783a;
        float b10 = c2.b();
        float f10 = this.f1784b;
        float a10 = p.a(a7 - f6, b10 - f10);
        float[] fArr = c2.f21410a;
        float a11 = a10 - p.a(fArr[0] - f6, fArr[1] - f10);
        float f11 = p.f21445c;
        float d10 = p.d(a11, f11);
        if (d10 > f11 - 1.0E-4f) {
            return 0.0f;
        }
        return d10;
    }
}
