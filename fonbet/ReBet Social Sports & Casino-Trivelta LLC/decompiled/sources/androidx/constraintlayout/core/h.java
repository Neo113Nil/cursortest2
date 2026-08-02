package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class h extends androidx.constraintlayout.core.b {

    /* renamed from: g, reason: collision with root package name */
    public int f17751g;

    /* renamed from: h, reason: collision with root package name */
    public int f17752h;

    /* renamed from: i, reason: collision with root package name */
    public b f17753i;

    /* renamed from: j, reason: collision with root package name */
    public c f17754j;
    private i[] mArrayGoals;
    private i[] mSortArray;

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f17762c - iVar2.f17762c;
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public i f17756a;

        /* renamed from: b, reason: collision with root package name */
        public h f17757b;

        public b(h hVar) {
            this.f17757b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f17756a.f17760a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.mGoalStrengthVector[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f17756a.mGoalStrengthVector[i10] = f12;
                    } else {
                        this.f17756a.mGoalStrengthVector[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f17756a.mGoalStrengthVector;
                float f13 = fArr[i11] + (iVar.mGoalStrengthVector[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f17756a.mGoalStrengthVector[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f17756a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f17756a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f17756a.mGoalStrengthVector[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.mGoalStrengthVector[i10];
                float f11 = this.f17756a.mGoalStrengthVector[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f17756a.mGoalStrengthVector, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f17756a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f17756a.mGoalStrengthVector[i10] + " ";
                }
            }
            return str + "] " + this.f17756a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f17751g = 128;
        this.mArrayGoals = new i[128];
        this.mSortArray = new i[128];
        this.f17752h = 0;
        this.f17753i = new b(this);
        this.f17754j = cVar;
    }

    @Override // androidx.constraintlayout.core.b
    public void B(d dVar, androidx.constraintlayout.core.b bVar, boolean z10) {
        i iVar = bVar.f17719a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f17723e;
        int e10 = aVar.e();
        for (int i10 = 0; i10 < e10; i10++) {
            i b10 = aVar.b(i10);
            float h10 = aVar.h(i10);
            this.f17753i.b(b10);
            if (this.f17753i.a(iVar, h10)) {
                F(b10);
            }
            this.f17720b += bVar.f17720b * h10;
        }
        G(iVar);
    }

    public final void F(i iVar) {
        int i10;
        int i11 = this.f17752h + 1;
        i[] iVarArr = this.mArrayGoals;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.mArrayGoals = iVarArr2;
            this.mSortArray = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.mArrayGoals;
        int i12 = this.f17752h;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f17752h = i13;
        if (i13 > 1 && iVarArr3[i12].f17762c > iVar.f17762c) {
            int i14 = 0;
            while (true) {
                i10 = this.f17752h;
                if (i14 >= i10) {
                    break;
                }
                this.mSortArray[i14] = this.mArrayGoals[i14];
                i14++;
            }
            Arrays.sort(this.mSortArray, 0, i10, new a());
            for (int i15 = 0; i15 < this.f17752h; i15++) {
                this.mArrayGoals[i15] = this.mSortArray[i15];
            }
        }
        iVar.f17760a = true;
        iVar.a(this);
    }

    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f17752h) {
            if (this.mArrayGoals[i10] == iVar) {
                while (true) {
                    int i11 = this.f17752h;
                    if (i10 >= i11 - 1) {
                        this.f17752h = i11 - 1;
                        iVar.f17760a = false;
                        return;
                    } else {
                        i[] iVarArr = this.mArrayGoals;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.d.a
    public i b(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f17752h; i11++) {
            i iVar = this.mArrayGoals[i11];
            if (!zArr[iVar.f17762c]) {
                this.f17753i.b(iVar);
                if (i10 == -1) {
                    if (!this.f17753i.c()) {
                    }
                    i10 = i11;
                } else {
                    if (!this.f17753i.d(this.mArrayGoals[i10])) {
                    }
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.mArrayGoals[i10];
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.d.a
    public void c(i iVar) {
        this.f17753i.b(iVar);
        this.f17753i.e();
        iVar.mGoalStrengthVector[iVar.f17764e] = 1.0f;
        F(iVar);
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.d.a
    public void clear() {
        this.f17752h = 0;
        this.f17720b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.d.a
    public boolean isEmpty() {
        return this.f17752h == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public String toString() {
        String str = " goal -> (" + this.f17720b + ") : ";
        for (int i10 = 0; i10 < this.f17752h; i10++) {
            this.f17753i.b(this.mArrayGoals[i10]);
            str = str + this.f17753i + " ";
        }
        return str;
    }
}
