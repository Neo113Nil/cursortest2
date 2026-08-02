package defpackage;

import android.view.animation.AnimationUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class swj extends exj {
    public boolean b;
    public boolean c;
    public d0i e;
    public final b10 f;
    public Runnable g;
    public final /* synthetic */ jxj h;
    public long a = -1;
    public int d = 0;

    public swj(jxj jxjVar) {
        this.h = jxjVar;
        b10 b10Var = new b10((char) 0, 19);
        long[] jArr = new long[20];
        b10Var.c = jArr;
        b10Var.d = new float[20];
        b10Var.b = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f = b10Var;
    }

    @Override // defpackage.exj, defpackage.wwj
    public final void d(xwj xwjVar) {
        this.c = true;
    }

    public final void g() {
        if (this.b) {
            h();
            this.e.a(this.h.x + 1);
        } else {
            this.d = 1;
            this.g = null;
        }
    }

    public final void h() {
        float f;
        int i;
        char c;
        b10 b10Var = this.f;
        float[] fArr = (float[]) b10Var.d;
        long[] jArr = (long[]) b10Var.c;
        if (this.e != null) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f2 = this.a;
        char c2 = 20;
        int i2 = (b10Var.b + 1) % 20;
        b10Var.b = i2;
        jArr[i2] = currentAnimationTimeMillis;
        fArr[i2] = f2;
        g88 g88Var = new g88();
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        g88Var.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = new d0i(g88Var);
        e0i e0iVar = new e0i();
        e0iVar.a(1.0f);
        e0iVar.b(200.0f);
        d0i d0iVar = this.e;
        d0iVar.m = e0iVar;
        d0iVar.b = this.a;
        d0iVar.c = true;
        ArrayList arrayList = d0iVar.l;
        if (d0iVar.f) {
            a70.m("Error: Update listeners must be added beforethe animation.");
            return;
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        d0i d0iVar2 = this.e;
        int i3 = b10Var.b;
        if (i3 != 0 || jArr[i3] != Long.MIN_VALUE) {
            long j = jArr[i3];
            int i4 = 0;
            long j2 = j;
            while (true) {
                long j3 = jArr[i3];
                if (j3 != Long.MIN_VALUE) {
                    f = f3;
                    i = i4;
                    float f4 = j - j3;
                    float abs = Math.abs(j3 - j2);
                    if (f4 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                    if (i4 >= 20) {
                        break;
                    }
                    j2 = j3;
                    f3 = f;
                } else {
                    f = f3;
                    i = i4;
                    break;
                }
            }
            i4 = i;
            if (i4 >= 2) {
                int i5 = b10Var.b;
                float f5 = 1000.0f;
                if (i4 == 2) {
                    int i6 = i5 == 0 ? 19 : i5 - 1;
                    float f6 = jArr[i5] - jArr[i6];
                    if (f6 != f) {
                        f3 = 1000.0f * ((fArr[i5] - fArr[i6]) / f6);
                    }
                } else {
                    int i7 = ((i5 - i4) + 21) % 20;
                    int i8 = (i5 + 21) % 20;
                    long j4 = jArr[i7];
                    float f7 = fArr[i7];
                    int i9 = i7 + 1;
                    int i10 = i9 % 20;
                    float f8 = f;
                    while (i10 != i8) {
                        long j5 = jArr[i10];
                        float f9 = f5;
                        float f10 = f7;
                        float f11 = j5 - j4;
                        if (f11 == f) {
                            c = c2;
                            f7 = f10;
                        } else {
                            f7 = fArr[i10];
                            c = c2;
                            float f12 = (f7 - f10) / f11;
                            float abs2 = (Math.abs(f12) * (f12 - ((float) (Math.sqrt(2.0f * Math.abs(f8)) * Math.signum(f8))))) + f8;
                            if (i10 == i9) {
                                abs2 *= 0.5f;
                            }
                            f8 = abs2;
                            j4 = j5;
                        }
                        i10 = (i10 + 1) % 20;
                        f5 = f9;
                        c2 = c;
                    }
                    f3 = ((float) (Math.sqrt(Math.abs(f8) * 2.0f) * Math.signum(f8))) * f5;
                }
            }
            f3 = f;
        }
        d0iVar2.a = f3;
        d0i d0iVar3 = this.e;
        d0iVar3.g = this.h.x + 1;
        d0iVar3.h = -1.0f;
        d0iVar3.c(4.0f);
        d0i d0iVar4 = this.e;
        h51 h51Var = new h51(this, 1);
        ArrayList arrayList2 = d0iVar4.k;
        if (arrayList2.contains(h51Var)) {
            return;
        }
        arrayList2.add(h51Var);
    }
}
