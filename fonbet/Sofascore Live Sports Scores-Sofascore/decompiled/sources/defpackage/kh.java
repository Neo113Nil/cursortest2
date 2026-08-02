package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kh implements mh6 {
    public final nsj a;
    public final int b;
    public final int[] c;
    public final sm8[] d;
    public int e;
    public final /* synthetic */ int f;

    public kh(int i, nsj nsjVar, int[] iArr) {
        sm8[] sm8VarArr;
        this.f = i;
        qx9.t(iArr.length > 0);
        nsjVar.getClass();
        sm8[] sm8VarArr2 = nsjVar.d;
        this.a = nsjVar;
        int length = iArr.length;
        this.b = length;
        this.d = new sm8[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            sm8VarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            sm8VarArr[i2] = sm8VarArr2[iArr[i2]];
            i2++;
        }
        Arrays.sort(sm8VarArr, new z(3));
        this.c = new int[this.b];
        int i3 = 0;
        while (true) {
            int i4 = this.b;
            if (i3 >= i4) {
                long[] jArr = new long[i4];
                return;
            }
            int[] iArr2 = this.c;
            sm8 sm8Var = this.d[i3];
            int i5 = 0;
            while (true) {
                if (i5 >= sm8VarArr2.length) {
                    i5 = -1;
                    break;
                } else if (sm8Var == sm8VarArr2[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
            iArr2[i3] = i5;
            i3++;
        }
    }

    public static void d(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            zu9 zu9Var = (zu9) arrayList.get(i);
            if (zu9Var != null) {
                zu9Var.c(new ih(j, jArr[i]));
            }
        }
    }

    @Override // defpackage.mh6
    public void disable() {
        int i = this.f;
    }

    @Override // defpackage.mh6
    public void enable() {
        int i = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kh khVar = (kh) obj;
            if (this.a == khVar.a && Arrays.equals(this.c, khVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mh6
    public final sm8 getFormat(int i) {
        return this.d[i];
    }

    @Override // defpackage.mh6
    public final int getIndexInTrackGroup(int i) {
        return this.c[i];
    }

    @Override // defpackage.mh6
    public final sm8 getSelectedFormat() {
        return this.d[0];
    }

    @Override // defpackage.mh6
    public final nsj getTrackGroup() {
        return this.a;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        this.e = hashCode;
        return hashCode;
    }

    @Override // defpackage.mh6
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.mh6
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.mh6
    public void onPlaybackSpeed(float f) {
        int i = this.f;
    }

    private final void e() {
    }

    private final void g() {
    }

    public final void f() {
    }

    public final void h() {
    }

    private final void i(float f) {
    }

    public final void j(float f) {
    }
}
