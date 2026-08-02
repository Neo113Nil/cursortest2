package defpackage;

import android.util.Pair;
import com.ironsource.U3;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class in0 {
    public static final in0 c = new in0(new int[]{2}, 8);
    public static final in0 d = new in0(new int[]{2, 5, 6}, 8);
    public static final awf e;
    public final int[] a;
    public final int b;

    static {
        b10 b10Var = new b10(4);
        b10Var.A(5, 6);
        b10Var.A(17, 6);
        b10Var.A(7, 6);
        b10Var.A(18, 6);
        b10Var.A(6, 8);
        b10Var.A(8, 8);
        b10Var.A(14, 8);
        e = b10Var.c(true);
    }

    public in0(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r1 > r9.b) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r1 != 5) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(sm8 sm8Var) {
        int intValue;
        int k;
        String str = sm8Var.l;
        str.getClass();
        int a = rjc.a(str, sm8Var.i);
        Integer valueOf = Integer.valueOf(a);
        awf awfVar = e;
        if (awfVar.containsKey(valueOf)) {
            int[] iArr = this.a;
            int i = 6;
            if (a == 18 && Arrays.binarySearch(iArr, 18) < 0) {
                a = 6;
            } else if (a == 8 && Arrays.binarySearch(iArr, 8) < 0) {
                a = 7;
            }
            if (Arrays.binarySearch(iArr, a) < 0) {
                return null;
            }
            int i2 = sm8Var.y;
            if (i2 == -1 || a == 18) {
                int i3 = sm8Var.z;
                if (i3 == -1) {
                    i3 = 48000;
                }
                if (lik.a >= 29) {
                    intValue = gn0.b(a, i3);
                } else {
                    Object obj = awfVar.get(Integer.valueOf(a));
                    intValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
                i2 = intValue;
            }
            int i4 = lik.a;
            if (i4 <= 28) {
                if (i2 == 7) {
                    i = 8;
                } else if (i2 != 3) {
                    if (i2 != 4) {
                    }
                }
                if (i4 <= 26 && "fugu".equals(lik.b) && i == 1) {
                    i = 2;
                }
                k = lik.k(i);
                if (k != 0) {
                    return Pair.create(Integer.valueOf(a), Integer.valueOf(k));
                }
            }
            i = i2;
            if (i4 <= 26) {
                i = 2;
            }
            k = lik.k(i);
            if (k != 0) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in0)) {
            return false;
        }
        in0 in0Var = (in0) obj;
        return Arrays.equals(this.a, in0Var.a) && this.b == in0Var.b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.a) + U3.j.e;
    }
}
