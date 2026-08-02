package D1;

import D1.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class r {

    /* renamed from: g, reason: collision with root package name */
    public static final Comparator f2480g = new Comparator() { // from class: D1.p
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return r.b((r.b) obj, (r.b) obj2);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public static final Comparator f2481h = new Comparator() { // from class: D1.q
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Float.compare(((r.b) obj).f2490c, ((r.b) obj2).f2490c);
            return compare;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f2482a;

    /* renamed from: d, reason: collision with root package name */
    public int f2485d;

    /* renamed from: e, reason: collision with root package name */
    public int f2486e;

    /* renamed from: f, reason: collision with root package name */
    public int f2487f;
    private final b[] recycledSamples = new b[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2483b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f2484c = -1;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2488a;

        /* renamed from: b, reason: collision with root package name */
        public int f2489b;

        /* renamed from: c, reason: collision with root package name */
        public float f2490c;

        public b() {
        }
    }

    public r(int i10) {
        this.f2482a = i10;
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f2488a - bVar2.f2488a;
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f2487f;
        if (i11 > 0) {
            b[] bVarArr = this.recycledSamples;
            int i12 = i11 - 1;
            this.f2487f = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f2485d;
        this.f2485d = i13 + 1;
        bVar.f2488a = i13;
        bVar.f2489b = i10;
        bVar.f2490c = f10;
        this.f2483b.add(bVar);
        this.f2486e += i10;
        while (true) {
            int i14 = this.f2486e;
            int i15 = this.f2482a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = (b) this.f2483b.get(0);
            int i17 = bVar2.f2489b;
            if (i17 <= i16) {
                this.f2486e -= i17;
                this.f2483b.remove(0);
                int i18 = this.f2487f;
                if (i18 < 5) {
                    b[] bVarArr2 = this.recycledSamples;
                    this.f2487f = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f2489b = i17 - i16;
                this.f2486e -= i16;
            }
        }
    }

    public final void d() {
        if (this.f2484c != 1) {
            Collections.sort(this.f2483b, f2480g);
            this.f2484c = 1;
        }
    }

    public final void e() {
        if (this.f2484c != 0) {
            Collections.sort(this.f2483b, f2481h);
            this.f2484c = 0;
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f2486e;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f2483b.size(); i11++) {
            b bVar = (b) this.f2483b.get(i11);
            i10 += bVar.f2489b;
            if (i10 >= f11) {
                return bVar.f2490c;
            }
        }
        if (this.f2483b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.f2483b.get(r5.size() - 1)).f2490c;
    }

    public void g() {
        this.f2483b.clear();
        this.f2484c = -1;
        this.f2485d = 0;
        this.f2486e = 0;
    }
}
