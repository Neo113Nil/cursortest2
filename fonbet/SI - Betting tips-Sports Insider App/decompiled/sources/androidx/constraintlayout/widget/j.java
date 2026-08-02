package androidx.constraintlayout.widget;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1129a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1130b;

    /* renamed from: c, reason: collision with root package name */
    public int f1131c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1132d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f1133e;

    /* renamed from: f, reason: collision with root package name */
    public int f1134f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f1135g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f1136h;

    /* renamed from: i, reason: collision with root package name */
    public int f1137i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f1138k;

    /* renamed from: l, reason: collision with root package name */
    public int f1139l;

    public final void a(float f6, int i5) {
        int i10 = this.f1134f;
        int[] iArr = this.f1132d;
        if (i10 >= iArr.length) {
            this.f1132d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f1133e;
            this.f1133e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f1132d;
        int i11 = this.f1134f;
        iArr2[i11] = i5;
        float[] fArr2 = this.f1133e;
        this.f1134f = i11 + 1;
        fArr2[i11] = f6;
    }

    public final void b(int i5, int i10) {
        int i11 = this.f1131c;
        int[] iArr = this.f1129a;
        if (i11 >= iArr.length) {
            this.f1129a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f1130b;
            this.f1130b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f1129a;
        int i12 = this.f1131c;
        iArr3[i12] = i5;
        int[] iArr4 = this.f1130b;
        this.f1131c = i12 + 1;
        iArr4[i12] = i10;
    }

    public final void c(int i5, String str) {
        int i10 = this.f1137i;
        int[] iArr = this.f1135g;
        if (i10 >= iArr.length) {
            this.f1135g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f1136h;
            this.f1136h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f1135g;
        int i11 = this.f1137i;
        iArr2[i11] = i5;
        String[] strArr2 = this.f1136h;
        this.f1137i = i11 + 1;
        strArr2[i11] = str;
    }

    public final void d(int i5, boolean z5) {
        int i10 = this.f1139l;
        int[] iArr = this.j;
        if (i10 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f1138k;
            this.f1138k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i11 = this.f1139l;
        iArr2[i11] = i5;
        boolean[] zArr2 = this.f1138k;
        this.f1139l = i11 + 1;
        zArr2[i11] = z5;
    }
}
