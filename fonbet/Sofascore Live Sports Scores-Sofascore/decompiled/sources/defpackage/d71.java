package defpackage;

import android.os.SystemClock;
import androidx.media3.common.b;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class d71 implements nh6 {
    public final osj a;
    public final int b;
    public final int[] c;
    public final b[] d;
    public final long[] e;
    public int f;

    public d71(osj osjVar, int[] iArr) {
        b[] bVarArr;
        int i = 0;
        z1a.E(iArr.length > 0);
        osjVar.getClass();
        this.a = osjVar;
        int length = iArr.length;
        this.b = length;
        this.d = new b[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            bVarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            bVarArr[i2] = osjVar.d[iArr[i2]];
            i2++;
        }
        Arrays.sort(bVarArr, new z(4));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = osjVar.a(this.d[i]);
                i++;
            }
        }
    }

    @Override // defpackage.nh6
    public final boolean d(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.nh6
    public final int e(b bVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == bVar) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d71 d71Var = (d71) obj;
            if (this.a.equals(d71Var.a) && Arrays.equals(this.c, d71Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nh6
    public int evaluateQueueSize(long j, List list) {
        return list.size();
    }

    @Override // defpackage.nh6
    public final boolean g(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean d = d(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !d) {
            d = (i2 == i || d(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!d) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], nik.a(elapsedRealtime, j));
        return true;
    }

    @Override // defpackage.nh6
    public final b getFormat(int i) {
        return this.d[i];
    }

    @Override // defpackage.nh6
    public final int getIndexInTrackGroup(int i) {
        return this.c[i];
    }

    @Override // defpackage.nh6
    public final b getSelectedFormat() {
        return this.d[getSelectedIndex()];
    }

    @Override // defpackage.nh6
    public final int getSelectedIndexInTrackGroup() {
        return this.c[getSelectedIndex()];
    }

    @Override // defpackage.nh6
    public final osj getTrackGroup() {
        return this.a;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        this.f = hashCode;
        return hashCode;
    }

    @Override // defpackage.nh6
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.nh6
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.nh6
    public void disable() {
    }

    @Override // defpackage.nh6
    public void enable() {
    }

    @Override // defpackage.nh6
    public final void b(boolean z) {
    }

    @Override // defpackage.nh6
    public void onPlaybackSpeed(float f) {
    }
}
