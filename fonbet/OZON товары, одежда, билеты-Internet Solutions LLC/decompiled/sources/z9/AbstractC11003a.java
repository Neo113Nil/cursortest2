package z9;

import androidx.recyclerview.widget.LinearLayoutManager;
import y9.r;

/* renamed from: z9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC11003a extends r {

    /* renamed from: b, reason: collision with root package name */
    private final int[] f107352b;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f107355e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f107356f;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f107351a = new int[4];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f107353c = new float[4];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f107354d = new float[4];

    protected AbstractC11003a() {
        int[] iArr = new int[8];
        this.f107352b = iArr;
        this.f107355e = new int[iArr.length / 2];
        this.f107356f = new int[iArr.length / 2];
    }

    protected static void g(float[] fArr, int[] iArr) {
        int i11 = 0;
        float f7 = fArr[0];
        for (int i12 = 1; i12 < iArr.length; i12++) {
            float f11 = fArr[i12];
            if (f11 < f7) {
                i11 = i12;
                f7 = f11;
            }
        }
        iArr[i11] = iArr[i11] - 1;
    }

    protected static void n(float[] fArr, int[] iArr) {
        int i11 = 0;
        float f7 = fArr[0];
        for (int i12 = 1; i12 < iArr.length; i12++) {
            float f11 = fArr[i12];
            if (f11 > f7) {
                i11 = i12;
                f7 = f11;
            }
        }
        iArr[i11] = iArr[i11] + 1;
    }

    protected static boolean o(int[] iArr) {
        float f7 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f7 >= 0.7916667f && f7 <= 0.89285713f) {
            int i11 = Integer.MAX_VALUE;
            int i12 = LinearLayoutManager.INVALID_OFFSET;
            for (int i13 : iArr) {
                if (i13 > i12) {
                    i12 = i13;
                }
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i12 < i11 * 10) {
                return true;
            }
        }
        return false;
    }

    protected final int[] h() {
        return this.f107352b;
    }

    protected final int[] i() {
        return this.f107351a;
    }

    protected final int[] j() {
        return this.f107356f;
    }

    protected final float[] k() {
        return this.f107354d;
    }

    protected final int[] l() {
        return this.f107355e;
    }

    protected final float[] m() {
        return this.f107353c;
    }
}
