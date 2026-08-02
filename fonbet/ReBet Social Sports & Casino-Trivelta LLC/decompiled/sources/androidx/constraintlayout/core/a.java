package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: i, reason: collision with root package name */
    public static float f17710i = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    public final b f17712b;

    /* renamed from: c, reason: collision with root package name */
    public final c f17713c;

    /* renamed from: a, reason: collision with root package name */
    public int f17711a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f17714d = 8;

    /* renamed from: e, reason: collision with root package name */
    public i f17715e = null;
    private int[] mArrayIndices = new int[8];
    private int[] mArrayNextIndices = new int[8];
    private float[] mArrayValues = new float[8];

    /* renamed from: f, reason: collision with root package name */
    public int f17716f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f17717g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17718h = false;

    public a(b bVar, c cVar) {
        this.f17712b = bVar;
        this.f17713c = cVar;
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean a(i iVar) {
        int i10 = this.f17716f;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f17711a; i11++) {
            if (this.mArrayIndices[i10] == iVar.f17762c) {
                return true;
            }
            i10 = this.mArrayNextIndices[i10];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public i b(int i10) {
        int i11 = this.f17716f;
        for (int i12 = 0; i11 != -1 && i12 < this.f17711a; i12++) {
            if (i12 == i10) {
                return this.f17713c.mIndexedVariables[this.mArrayIndices[i11]];
            }
            i11 = this.mArrayNextIndices[i11];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void c(i iVar, float f10, boolean z10) {
        float f11 = f17710i;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f17716f;
            if (i10 == -1) {
                this.f17716f = 0;
                this.mArrayValues[0] = f10;
                this.mArrayIndices[0] = iVar.f17762c;
                this.mArrayNextIndices[0] = -1;
                iVar.f17769j++;
                iVar.a(this.f17712b);
                this.f17711a++;
                if (this.f17718h) {
                    return;
                }
                int i11 = this.f17717g + 1;
                this.f17717g = i11;
                int[] iArr = this.mArrayIndices;
                if (i11 >= iArr.length) {
                    this.f17718h = true;
                    this.f17717g = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f17711a; i13++) {
                int i14 = this.mArrayIndices[i10];
                int i15 = iVar.f17762c;
                if (i14 == i15) {
                    float[] fArr = this.mArrayValues;
                    float f12 = fArr[i10] + f10;
                    float f13 = f17710i;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f17716f) {
                            this.f17716f = this.mArrayNextIndices[i10];
                        } else {
                            int[] iArr2 = this.mArrayNextIndices;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.d(this.f17712b);
                        }
                        if (this.f17718h) {
                            this.f17717g = i10;
                        }
                        iVar.f17769j--;
                        this.f17711a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.mArrayNextIndices[i10];
            }
            int i16 = this.f17717g;
            int i17 = i16 + 1;
            if (this.f17718h) {
                int[] iArr3 = this.mArrayIndices;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.mArrayIndices;
            if (i16 >= iArr4.length && this.f17711a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.mArrayIndices;
                    if (i18 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    }
                    i18++;
                }
            }
            int[] iArr6 = this.mArrayIndices;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f17714d * 2;
                this.f17714d = i19;
                this.f17718h = false;
                this.f17717g = i16 - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, i19);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.f17714d);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.f17714d);
            }
            this.mArrayIndices[i16] = iVar.f17762c;
            this.mArrayValues[i16] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.mArrayNextIndices;
                iArr7[i16] = iArr7[i12];
                iArr7[i12] = i16;
            } else {
                this.mArrayNextIndices[i16] = this.f17716f;
                this.f17716f = i16;
            }
            iVar.f17769j++;
            iVar.a(this.f17712b);
            this.f17711a++;
            if (!this.f17718h) {
                this.f17717g++;
            }
            int i20 = this.f17717g;
            int[] iArr8 = this.mArrayIndices;
            if (i20 >= iArr8.length) {
                this.f17718h = true;
                this.f17717g = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i10 = this.f17716f;
        for (int i11 = 0; i10 != -1 && i11 < this.f17711a; i11++) {
            i iVar = this.f17713c.mIndexedVariables[this.mArrayIndices[i10]];
            if (iVar != null) {
                iVar.d(this.f17712b);
            }
            i10 = this.mArrayNextIndices[i10];
        }
        this.f17716f = -1;
        this.f17717g = -1;
        this.f17718h = false;
        this.f17711a = 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float d(i iVar, boolean z10) {
        if (this.f17715e == iVar) {
            this.f17715e = null;
        }
        int i10 = this.f17716f;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f17711a) {
            if (this.mArrayIndices[i10] == iVar.f17762c) {
                if (i10 == this.f17716f) {
                    this.f17716f = this.mArrayNextIndices[i10];
                } else {
                    int[] iArr = this.mArrayNextIndices;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.d(this.f17712b);
                }
                iVar.f17769j--;
                this.f17711a--;
                this.mArrayIndices[i10] = -1;
                if (this.f17718h) {
                    this.f17717g = i10;
                }
                return this.mArrayValues[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.mArrayNextIndices[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int e() {
        return this.f17711a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float f(b bVar, boolean z10) {
        float i10 = i(bVar.f17719a);
        d(bVar.f17719a, z10);
        b.a aVar = bVar.f17723e;
        int e10 = aVar.e();
        for (int i11 = 0; i11 < e10; i11++) {
            i b10 = aVar.b(i11);
            c(b10, aVar.i(b10) * i10, z10);
        }
        return i10;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void g(i iVar, float f10) {
        if (f10 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i10 = this.f17716f;
        if (i10 == -1) {
            this.f17716f = 0;
            this.mArrayValues[0] = f10;
            this.mArrayIndices[0] = iVar.f17762c;
            this.mArrayNextIndices[0] = -1;
            iVar.f17769j++;
            iVar.a(this.f17712b);
            this.f17711a++;
            if (this.f17718h) {
                return;
            }
            int i11 = this.f17717g + 1;
            this.f17717g = i11;
            int[] iArr = this.mArrayIndices;
            if (i11 >= iArr.length) {
                this.f17718h = true;
                this.f17717g = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f17711a; i13++) {
            int i14 = this.mArrayIndices[i10];
            int i15 = iVar.f17762c;
            if (i14 == i15) {
                this.mArrayValues[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.mArrayNextIndices[i10];
        }
        int i16 = this.f17717g;
        int i17 = i16 + 1;
        if (this.f17718h) {
            int[] iArr2 = this.mArrayIndices;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.mArrayIndices;
        if (i16 >= iArr3.length && this.f17711a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.mArrayIndices;
                if (i18 >= iArr4.length) {
                    break;
                }
                if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr5 = this.mArrayIndices;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f17714d * 2;
            this.f17714d = i19;
            this.f17718h = false;
            this.f17717g = i16 - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, i19);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.f17714d);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.f17714d);
        }
        this.mArrayIndices[i16] = iVar.f17762c;
        this.mArrayValues[i16] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.mArrayNextIndices;
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            this.mArrayNextIndices[i16] = this.f17716f;
            this.f17716f = i16;
        }
        iVar.f17769j++;
        iVar.a(this.f17712b);
        int i20 = this.f17711a + 1;
        this.f17711a = i20;
        if (!this.f17718h) {
            this.f17717g++;
        }
        int[] iArr7 = this.mArrayIndices;
        if (i20 >= iArr7.length) {
            this.f17718h = true;
        }
        if (this.f17717g >= iArr7.length) {
            this.f17718h = true;
            this.f17717g = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public float h(int i10) {
        int i11 = this.f17716f;
        for (int i12 = 0; i11 != -1 && i12 < this.f17711a; i12++) {
            if (i12 == i10) {
                return this.mArrayValues[i11];
            }
            i11 = this.mArrayNextIndices[i11];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float i(i iVar) {
        int i10 = this.f17716f;
        for (int i11 = 0; i10 != -1 && i11 < this.f17711a; i11++) {
            if (this.mArrayIndices[i10] == iVar.f17762c) {
                return this.mArrayValues[i10];
            }
            i10 = this.mArrayNextIndices[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void invert() {
        int i10 = this.f17716f;
        for (int i11 = 0; i10 != -1 && i11 < this.f17711a; i11++) {
            float[] fArr = this.mArrayValues;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.mArrayNextIndices[i10];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void j(float f10) {
        int i10 = this.f17716f;
        for (int i11 = 0; i10 != -1 && i11 < this.f17711a; i11++) {
            float[] fArr = this.mArrayValues;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.mArrayNextIndices[i10];
        }
    }

    public String toString() {
        int i10 = this.f17716f;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f17711a; i11++) {
            str = ((str + " -> ") + this.mArrayValues[i10] + " : ") + this.f17713c.mIndexedVariables[this.mArrayIndices[i10]];
            i10 = this.mArrayNextIndices[i10];
        }
        return str;
    }
}
