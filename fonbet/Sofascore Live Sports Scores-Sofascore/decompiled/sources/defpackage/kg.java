package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kg {
    public static final kg g = new kg(null, new hg[0], 0, C.TIME_UNSET, 0);
    public static final hg h = new hg(0).c(0);
    public final Object a;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final hg[] f;

    static {
        nik.N(1);
        nik.N(2);
        nik.N(3);
        nik.N(4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kg(Object obj, long... jArr) {
        this(obj, r3, 0L, C.TIME_UNSET, 0);
        int length = jArr.length;
        hg[] hgVarArr = new hg[length];
        for (int i = 0; i < length; i++) {
            hgVarArr[i] = new hg(jArr[i]);
        }
    }

    public final boolean a() {
        int i = this.b - 1;
        if (i < 0) {
            return false;
        }
        e(i);
        return false;
    }

    public final hg b(int i) {
        int i2 = this.e;
        return i < i2 ? h : this.f[i - i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r11 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (b(r4).a > r11) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(long j, long j2) {
        hg b;
        int i;
        if (j != Long.MIN_VALUE && (j2 == C.TIME_UNSET || j < j2)) {
            int i2 = this.e;
            while (true) {
                int i3 = this.b;
                if (i2 >= i3 || ((b(i2).a == Long.MIN_VALUE || b(i2).a > j) && ((i = (b = b(i2)).b) == -1 || b.b(-1) < i))) {
                    break;
                }
                i2++;
            }
        }
        return -1;
    }

    public final int d(long j, long j2) {
        int i;
        int i2 = this.b - 1;
        e(i2);
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            long j3 = b(i2).a;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                i2--;
            } else {
                if (j2 != C.TIME_UNSET && j >= j2) {
                    break;
                }
                i2--;
            }
        }
        if (i2 >= 0) {
            hg b = b(i2);
            int i3 = b.b;
            if (i3 != -1) {
                while (i < i3) {
                    int i4 = b.f[i];
                    i = (i4 == 0 || i4 == 1) ? 0 : i + 1;
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean e(int i) {
        if (i != this.b - 1) {
            return false;
        }
        b(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kg.class == obj.getClass()) {
            kg kgVar = (kg) obj;
            if (Objects.equals(this.a, kgVar.a) && this.b == kgVar.b && this.c == kgVar.c && this.d == kgVar.d && this.e == kgVar.e && Arrays.equals(this.f, kgVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final kg f(int i, int i2) {
        z1a.s(i2 > 0);
        int i3 = i - this.e;
        hg[] hgVarArr = this.f;
        if (hgVarArr[i3].b == i2) {
            return this;
        }
        hg[] hgVarArr2 = (hg[]) nik.V(hgVarArr, hgVarArr.length);
        hgVarArr2[i3] = hgVarArr[i3].c(i2);
        return new kg(this.a, hgVarArr2, this.c, this.d, this.e);
    }

    public final kg g(int i, int i2) {
        int i3 = i - this.e;
        hg[] hgVarArr = this.f;
        hg[] hgVarArr2 = (hg[]) nik.V(hgVarArr, hgVarArr.length);
        hgVarArr2[i3] = hgVarArr2[i3].d(4, i2);
        return new kg(this.a, hgVarArr2, this.c, this.d, this.e);
    }

    public final kg h(int i) {
        hg hgVar;
        int i2 = i - this.e;
        hg[] hgVarArr = this.f;
        hg[] hgVarArr2 = (hg[]) nik.V(hgVarArr, hgVarArr.length);
        hg hgVar2 = hgVarArr2[i2];
        if (hgVar2.b == -1) {
            hgVar = new hg(hgVar2.a, 0, hgVar2.c, new int[0], new h6c[0], new long[0], hgVar2.h, hgVar2.i);
        } else {
            int[] iArr = hgVar2.f;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = copyOf[i3];
                if (i4 == 1 || i4 == 0) {
                    copyOf[i3] = 2;
                }
            }
            hgVar = new hg(hgVar2.a, length, hgVar2.c, copyOf, hgVar2.e, hgVar2.g, hgVar2.h, hgVar2.i);
        }
        hgVarArr2[i2] = hgVar;
        return new kg(this.a, hgVarArr2, this.c, this.d, this.e);
    }

    public final int hashCode() {
        int i = this.b * 31;
        Object obj = this.a;
        return Arrays.hashCode(this.f) + ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.a);
        sb.append(", adResumePositionUs=");
        sb.append(this.c);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            hg[] hgVarArr = this.f;
            if (i >= hgVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(hgVarArr[i].a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < hgVarArr[i].f.length; i2++) {
                sb.append("ad(state=");
                int i3 = hgVarArr[i].f[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(hgVarArr[i].g[i2]);
                sb.append(')');
                if (i2 < hgVarArr[i].f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < hgVarArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    public kg(Object obj, hg[] hgVarArr, long j, long j2, int i) {
        this.a = obj;
        this.c = j;
        this.d = j2;
        this.b = hgVarArr.length + i;
        this.f = hgVarArr;
        this.e = i;
    }
}
