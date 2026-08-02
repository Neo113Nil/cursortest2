package v;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24368a;

    /* renamed from: e, reason: collision with root package name */
    public float f24372e;

    /* renamed from: l, reason: collision with root package name */
    public int f24378l;

    /* renamed from: b, reason: collision with root package name */
    public int f24369b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f24370c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f24371d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24373f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f24374g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f24375h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public b[] f24376i = new b[16];
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f24377k = 0;

    public g(int i5) {
        this.f24378l = i5;
    }

    public final void a(b bVar) {
        int i5 = 0;
        while (true) {
            int i10 = this.j;
            if (i5 >= i10) {
                b[] bVarArr = this.f24376i;
                if (i10 >= bVarArr.length) {
                    this.f24376i = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f24376i;
                int i11 = this.j;
                bVarArr2[i11] = bVar;
                this.j = i11 + 1;
                return;
            }
            if (this.f24376i[i5] == bVar) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final void b(b bVar) {
        int i5 = this.j;
        int i10 = 0;
        while (i10 < i5) {
            if (this.f24376i[i10] == bVar) {
                while (i10 < i5 - 1) {
                    b[] bVarArr = this.f24376i;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.j--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.f24378l = 5;
        this.f24371d = 0;
        this.f24369b = -1;
        this.f24370c = -1;
        this.f24372e = 0.0f;
        this.f24373f = false;
        int i5 = this.j;
        for (int i10 = 0; i10 < i5; i10++) {
            this.f24376i[i10] = null;
        }
        this.j = 0;
        this.f24377k = 0;
        this.f24368a = false;
        Arrays.fill(this.f24375h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f24369b - ((g) obj).f24369b;
    }

    public final void d(c cVar, float f6) {
        this.f24372e = f6;
        this.f24373f = true;
        int i5 = this.j;
        this.f24370c = -1;
        for (int i10 = 0; i10 < i5; i10++) {
            this.f24376i[i10].h(cVar, this, false);
        }
        this.j = 0;
    }

    public final void e(c cVar, b bVar) {
        int i5 = this.j;
        for (int i10 = 0; i10 < i5; i10++) {
            this.f24376i[i10].i(cVar, bVar, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.f24369b;
    }
}
