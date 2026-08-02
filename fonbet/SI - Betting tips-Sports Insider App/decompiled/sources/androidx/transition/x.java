package androidx.transition;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x extends b0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public long f2759a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2760b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2761c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.dynamicanimation.animation.l f2762d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f2763e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.fragment.app.c f2764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f2765g;

    public x(a0 a0Var) {
        this.f2765g = a0Var;
        n0 n0Var = new n0((byte) 0, 0);
        long[] jArr = new long[20];
        n0Var.f2734c = jArr;
        n0Var.f2735d = new float[20];
        n0Var.f2733b = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f2763e = n0Var;
    }

    public final void a() {
        int i5;
        if (this.f2762d != null) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f6 = this.f2759a;
        n0 n0Var = this.f2763e;
        int i10 = n0Var.f2733b;
        float[] fArr = (float[]) n0Var.f2735d;
        long[] jArr = (long[]) n0Var.f2734c;
        char c2 = 20;
        int i11 = (i10 + 1) % 20;
        n0Var.f2733b = i11;
        jArr[i11] = currentAnimationTimeMillis;
        fArr[i11] = f6;
        androidx.dynamicanimation.animation.k kVar = new androidx.dynamicanimation.animation.k();
        float f10 = 0.0f;
        kVar.f1786a = 0.0f;
        this.f2762d = new androidx.dynamicanimation.animation.l(kVar);
        androidx.dynamicanimation.animation.m mVar = new androidx.dynamicanimation.animation.m();
        mVar.a(1.0f);
        mVar.b(200.0f);
        androidx.dynamicanimation.animation.l lVar = this.f2762d;
        lVar.f1803m = mVar;
        lVar.f1793b = this.f2759a;
        lVar.f1794c = true;
        ArrayList arrayList = lVar.f1802l;
        if (lVar.f1797f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        androidx.dynamicanimation.animation.l lVar2 = this.f2762d;
        int i12 = n0Var.f2733b;
        long j = Long.MIN_VALUE;
        if (i12 != 0 || jArr[i12] != Long.MIN_VALUE) {
            long j6 = jArr[i12];
            int i13 = 0;
            long j10 = j6;
            while (true) {
                long j11 = jArr[i12];
                if (j11 != j) {
                    float f11 = j6 - j11;
                    float abs = Math.abs(j11 - j10);
                    if (f11 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    if (i12 == 0) {
                        i12 = 20;
                    }
                    i12--;
                    i13++;
                    if (i13 >= 20) {
                        break;
                    }
                    j10 = j11;
                    j = Long.MIN_VALUE;
                } else {
                    break;
                }
            }
            if (i13 >= 2) {
                float f12 = 1000.0f;
                if (i13 == 2) {
                    int i14 = n0Var.f2733b;
                    int i15 = i14 == 0 ? 19 : i14 - 1;
                    float f13 = jArr[i14] - jArr[i15];
                    if (f13 != 0.0f) {
                        f10 = ((fArr[i14] - fArr[i15]) / f13) * 1000.0f;
                    }
                } else {
                    int i16 = n0Var.f2733b;
                    int i17 = ((i16 - i13) + 21) % 20;
                    int i18 = (i16 + 21) % 20;
                    long j12 = jArr[i17];
                    float f14 = fArr[i17];
                    int i19 = i17 + 1;
                    int i20 = i19 % 20;
                    float f15 = 0.0f;
                    while (i20 != i18) {
                        long j13 = jArr[i20];
                        char c8 = c2;
                        float f16 = f12;
                        float f17 = j13 - j12;
                        if (f17 == f10) {
                            i5 = i19;
                        } else {
                            float f18 = fArr[i20];
                            int i21 = i19;
                            float f19 = (f18 - f14) / f17;
                            float abs2 = (Math.abs(f19) * (f19 - ((float) (Math.sqrt(2.0f * Math.abs(f15)) * Math.signum(f15))))) + f15;
                            i5 = i21;
                            if (i20 == i5) {
                                abs2 *= 0.5f;
                            }
                            f15 = abs2;
                            f14 = f18;
                            j12 = j13;
                        }
                        i20 = (i20 + 1) % 20;
                        i19 = i5;
                        c2 = c8;
                        f12 = f16;
                        f10 = 0.0f;
                    }
                    f10 = ((float) (Math.sqrt(Math.abs(f15) * 2.0f) * Math.signum(f15))) * f12;
                }
            }
        }
        lVar2.f1792a = f10;
        this.f2762d.f1798g = this.f2765g.getTotalDurationMillis() + 1;
        androidx.dynamicanimation.animation.l lVar3 = this.f2762d;
        lVar3.f1799h = -1.0f;
        lVar3.j = 4.0f;
        w wVar = new w(this);
        ArrayList arrayList2 = lVar3.f1801k;
        if (arrayList2.contains(wVar)) {
            return;
        }
        arrayList2.add(wVar);
    }

    @Override // androidx.transition.b0, androidx.transition.y
    public final void onTransitionCancel(a0 a0Var) {
        this.f2761c = true;
    }
}
