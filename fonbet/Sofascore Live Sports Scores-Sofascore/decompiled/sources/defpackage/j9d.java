package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j9d implements e9d {
    public final View a;
    public final p9d b;
    public final int[] c;

    public j9d(View view) {
        this.a = view;
        p9d p9dVar = new p9d(view);
        p9dVar.g(true);
        this.b = p9dVar;
        this.c = new int[2];
        WeakHashMap weakHashMap = bsk.a;
        view.setNestedScrollingEnabled(true);
    }

    @Override // defpackage.e9d
    public final long P(int i, long j) {
        int D = jaa.D(j);
        int i2 = i == 1 ? 1 : 0;
        p9d p9dVar = this.b;
        if (!p9dVar.h(D, i2 ^ 1)) {
            return 0L;
        }
        int[] iArr = this.c;
        Arrays.fill(iArr, 0, iArr.length, 0);
        int t = jaa.t(Float.intBitsToFloat((int) (j >> 32)));
        int t2 = jaa.t(Float.intBitsToFloat((int) (4294967295L & j)));
        p9dVar.c(t, t2, iArr, null, (i == 1 ? 1 : 0) ^ 1);
        return jaa.P(t, t2, iArr, j);
    }

    @Override // defpackage.e9d
    public final Object T0(long j, long j2, rq3 rq3Var) {
        p9d p9dVar = this.b;
        if (p9dVar.f(0)) {
            p9dVar.i(0);
        }
        if (p9dVar.f(1)) {
            p9dVar.i(1);
        }
        return new vmk(0L);
    }

    @Override // defpackage.e9d
    public final long b0(int i, long j, long j2) {
        int D = jaa.D(j2);
        int i2 = i == 1 ? 1 : 0;
        p9d p9dVar = this.b;
        if (!p9dVar.h(D, i2 ^ 1)) {
            return 0L;
        }
        int[] iArr = this.c;
        Arrays.fill(iArr, 0, iArr.length, 0);
        int t = jaa.t(Float.intBitsToFloat((int) (j2 >> 32)));
        int t2 = jaa.t(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        p9dVar.d(jaa.t(Float.intBitsToFloat((int) (j >> 32))), jaa.t(Float.intBitsToFloat((int) (j & 4294967295L))), t, t2, null, (i == 1 ? 1 : 0) ^ 1, iArr);
        return jaa.P(t, t2, iArr, j2);
    }

    @Override // defpackage.e9d
    public final Object x0(long j, rq3 rq3Var) {
        float b = vmk.b(j) * (-1.0f);
        float c = vmk.c(j) * (-1.0f);
        p9d p9dVar = this.b;
        if (!p9dVar.b(b, c) && !p9dVar.a(vmk.b(j) * (-1.0f), vmk.c(j) * (-1.0f), true)) {
            j = 0;
        }
        return new vmk(j);
    }
}
