package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: h, reason: collision with root package name */
    public static float f17779h = 0.001f;

    /* renamed from: f, reason: collision with root package name */
    public final b f17785f;

    /* renamed from: g, reason: collision with root package name */
    public final c f17786g;

    /* renamed from: a, reason: collision with root package name */
    public final int f17780a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f17781b = 16;

    /* renamed from: c, reason: collision with root package name */
    public int f17782c = 16;
    int[] mKeys = new int[16];
    int[] mNextKeys = new int[16];
    int[] mVariables = new int[16];
    float[] mValues = new float[16];
    int[] mPrevious = new int[16];
    int[] mNext = new int[16];

    /* renamed from: d, reason: collision with root package name */
    public int f17783d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f17784e = -1;

    public j(b bVar, c cVar) {
        this.f17785f = bVar;
        this.f17786g = cVar;
        clear();
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean a(i iVar) {
        return o(iVar) != -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public i b(int i10) {
        int i11 = this.f17783d;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f17784e;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f17786g.mIndexedVariables[this.mVariables[i12]];
            }
            i12 = this.mNext[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void c(i iVar, float f10, boolean z10) {
        float f11 = f17779h;
        if (f10 <= (-f11) || f10 >= f11) {
            int o10 = o(iVar);
            if (o10 == -1) {
                g(iVar, f10);
                return;
            }
            float[] fArr = this.mValues;
            float f12 = fArr[o10] + f10;
            fArr[o10] = f12;
            float f13 = f17779h;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[o10] = 0.0f;
            d(iVar, z10);
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void clear() {
        int i10 = this.f17783d;
        for (int i11 = 0; i11 < i10; i11++) {
            i b10 = b(i11);
            if (b10 != null) {
                b10.d(this.f17785f);
            }
        }
        for (int i12 = 0; i12 < this.f17781b; i12++) {
            this.mVariables[i12] = -1;
            this.mNextKeys[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f17782c; i13++) {
            this.mKeys[i13] = -1;
        }
        this.f17783d = 0;
        this.f17784e = -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float d(i iVar, boolean z10) {
        int o10 = o(iVar);
        if (o10 == -1) {
            return 0.0f;
        }
        q(iVar);
        float f10 = this.mValues[o10];
        if (this.f17784e == o10) {
            this.f17784e = this.mNext[o10];
        }
        this.mVariables[o10] = -1;
        int[] iArr = this.mPrevious;
        int i10 = iArr[o10];
        if (i10 != -1) {
            int[] iArr2 = this.mNext;
            iArr2[i10] = iArr2[o10];
        }
        int i11 = this.mNext[o10];
        if (i11 != -1) {
            iArr[i11] = iArr[o10];
        }
        this.f17783d--;
        iVar.f17769j--;
        if (z10) {
            iVar.d(this.f17785f);
        }
        return f10;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int e() {
        return this.f17783d;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float f(b bVar, boolean z10) {
        float i10 = i(bVar.f17719a);
        d(bVar.f17719a, z10);
        j jVar = (j) bVar.f17723e;
        int e10 = jVar.e();
        int i11 = 0;
        int i12 = 0;
        while (i11 < e10) {
            int i13 = jVar.mVariables[i12];
            if (i13 != -1) {
                c(this.f17786g.mIndexedVariables[i13], jVar.mValues[i12] * i10, z10);
                i11++;
            }
            i12++;
        }
        return i10;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void g(i iVar, float f10) {
        float f11 = f17779h;
        if (f10 > (-f11) && f10 < f11) {
            d(iVar, true);
            return;
        }
        if (this.f17783d == 0) {
            l(0, iVar, f10);
            k(iVar, 0);
            this.f17784e = 0;
            return;
        }
        int o10 = o(iVar);
        if (o10 != -1) {
            this.mValues[o10] = f10;
            return;
        }
        if (this.f17783d + 1 >= this.f17781b) {
            n();
        }
        int i10 = this.f17783d;
        int i11 = this.f17784e;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.mVariables[i11];
            int i15 = iVar.f17762c;
            if (i14 == i15) {
                this.mValues[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.mNext[i11];
            if (i11 == -1) {
                break;
            }
        }
        p(i12, iVar, f10);
    }

    @Override // androidx.constraintlayout.core.b.a
    public float h(int i10) {
        int i11 = this.f17783d;
        int i12 = this.f17784e;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.mValues[i12];
            }
            i12 = this.mNext[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float i(i iVar) {
        int o10 = o(iVar);
        if (o10 != -1) {
            return this.mValues[o10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void invert() {
        int i10 = this.f17783d;
        int i11 = this.f17784e;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.mValues;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.mNext[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void j(float f10) {
        int i10 = this.f17783d;
        int i11 = this.f17784e;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.mValues;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.mNext[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public final void k(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f17762c % this.f17782c;
        int[] iArr2 = this.mKeys;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.mNextKeys;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.mNextKeys[i10] = -1;
    }

    public final void l(int i10, i iVar, float f10) {
        this.mVariables[i10] = iVar.f17762c;
        this.mValues[i10] = f10;
        this.mPrevious[i10] = -1;
        this.mNext[i10] = -1;
        iVar.a(this.f17785f);
        iVar.f17769j++;
        this.f17783d++;
    }

    public final int m() {
        for (int i10 = 0; i10 < this.f17781b; i10++) {
            if (this.mVariables[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    public final void n() {
        int i10 = this.f17781b * 2;
        this.mVariables = Arrays.copyOf(this.mVariables, i10);
        this.mValues = Arrays.copyOf(this.mValues, i10);
        this.mPrevious = Arrays.copyOf(this.mPrevious, i10);
        this.mNext = Arrays.copyOf(this.mNext, i10);
        this.mNextKeys = Arrays.copyOf(this.mNextKeys, i10);
        for (int i11 = this.f17781b; i11 < i10; i11++) {
            this.mVariables[i11] = -1;
            this.mNextKeys[i11] = -1;
        }
        this.f17781b = i10;
    }

    public int o(i iVar) {
        if (this.f17783d != 0 && iVar != null) {
            int i10 = iVar.f17762c;
            int i11 = this.mKeys[i10 % this.f17782c];
            if (i11 == -1) {
                return -1;
            }
            if (this.mVariables[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.mNextKeys[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.mVariables[i11] != i10);
            if (i11 != -1 && this.mVariables[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final void p(int i10, i iVar, float f10) {
        int m10 = m();
        l(m10, iVar, f10);
        if (i10 != -1) {
            this.mPrevious[m10] = i10;
            int[] iArr = this.mNext;
            iArr[m10] = iArr[i10];
            iArr[i10] = m10;
        } else {
            this.mPrevious[m10] = -1;
            if (this.f17783d > 0) {
                this.mNext[m10] = this.f17784e;
                this.f17784e = m10;
            } else {
                this.mNext[m10] = -1;
            }
        }
        int i11 = this.mNext[m10];
        if (i11 != -1) {
            this.mPrevious[i11] = m10;
        }
        k(iVar, m10);
    }

    public final void q(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f17762c;
        int i12 = i11 % this.f17782c;
        int[] iArr2 = this.mKeys;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.mVariables[i13] == i11) {
            int[] iArr3 = this.mNextKeys;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.mNextKeys;
            i10 = iArr[i13];
            if (i10 == -1 || this.mVariables[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.mVariables[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f17783d;
        for (int i11 = 0; i11 < i10; i11++) {
            i b10 = b(i11);
            if (b10 != null) {
                String str2 = str + b10 + " = " + h(i11) + " ";
                int o10 = o(b10);
                String str3 = str2 + "[p: ";
                String str4 = (this.mPrevious[o10] != -1 ? str3 + this.f17786g.mIndexedVariables[this.mVariables[this.mPrevious[o10]]] : str3 + ViewProps.NONE) + ", n: ";
                str = (this.mNext[o10] != -1 ? str4 + this.f17786g.mIndexedVariables[this.mVariables[this.mNext[o10]]] : str4 + ViewProps.NONE) + "]";
            }
        }
        return str + " }";
    }
}
