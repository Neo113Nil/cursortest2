package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public static int f17759o = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17760a;

    /* renamed from: b, reason: collision with root package name */
    public String f17761b;

    /* renamed from: f, reason: collision with root package name */
    public float f17765f;

    /* renamed from: h, reason: collision with root package name */
    public a f17767h;

    /* renamed from: c, reason: collision with root package name */
    public int f17762c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f17763d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f17764e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17766g = false;
    float[] mStrengthVector = new float[9];
    float[] mGoalStrengthVector = new float[9];
    b[] mClientEquations = new b[16];

    /* renamed from: i, reason: collision with root package name */
    public int f17768i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f17769j = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17770k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f17771l = -1;

    /* renamed from: m, reason: collision with root package name */
    public float f17772m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public HashSet f17773n = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f17767h = aVar;
    }

    public static void c() {
        f17759o++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f17768i;
            if (i10 >= i11) {
                b[] bVarArr = this.mClientEquations;
                if (i11 >= bVarArr.length) {
                    this.mClientEquations = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.mClientEquations;
                int i12 = this.f17768i;
                bVarArr2[i12] = bVar;
                this.f17768i = i12 + 1;
                return;
            }
            if (this.mClientEquations[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f17762c - iVar.f17762c;
    }

    public final void d(b bVar) {
        int i10 = this.f17768i;
        int i11 = 0;
        while (i11 < i10) {
            if (this.mClientEquations[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.mClientEquations;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f17768i--;
                return;
            }
            i11++;
        }
    }

    public void e() {
        this.f17761b = null;
        this.f17767h = a.UNKNOWN;
        this.f17764e = 0;
        this.f17762c = -1;
        this.f17763d = -1;
        this.f17765f = 0.0f;
        this.f17766g = false;
        this.f17770k = false;
        this.f17771l = -1;
        this.f17772m = 0.0f;
        int i10 = this.f17768i;
        for (int i11 = 0; i11 < i10; i11++) {
            this.mClientEquations[i11] = null;
        }
        this.f17768i = 0;
        this.f17769j = 0;
        this.f17760a = false;
        Arrays.fill(this.mGoalStrengthVector, 0.0f);
    }

    public void f(d dVar, float f10) {
        this.f17765f = f10;
        this.f17766g = true;
        this.f17770k = false;
        this.f17771l = -1;
        this.f17772m = 0.0f;
        int i10 = this.f17768i;
        this.f17763d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.mClientEquations[i11].A(dVar, this, false);
        }
        this.f17768i = 0;
    }

    public void g(a aVar, String str) {
        this.f17767h = aVar;
    }

    public final void h(d dVar, b bVar) {
        int i10 = this.f17768i;
        for (int i11 = 0; i11 < i10; i11++) {
            this.mClientEquations[i11].B(dVar, bVar, false);
        }
        this.f17768i = 0;
    }

    public String toString() {
        if (this.f17761b != null) {
            return "" + this.f17761b;
        }
        return "" + this.f17762c;
    }
}
