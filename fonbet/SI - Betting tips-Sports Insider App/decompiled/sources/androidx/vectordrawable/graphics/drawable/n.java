package androidx.vectordrawable.graphics.drawable;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f2814a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2815b;

    /* renamed from: c, reason: collision with root package name */
    public float f2816c;

    /* renamed from: d, reason: collision with root package name */
    public float f2817d;

    /* renamed from: e, reason: collision with root package name */
    public float f2818e;

    /* renamed from: f, reason: collision with root package name */
    public float f2819f;

    /* renamed from: g, reason: collision with root package name */
    public float f2820g;

    /* renamed from: h, reason: collision with root package name */
    public float f2821h;

    /* renamed from: i, reason: collision with root package name */
    public float f2822i;
    public final Matrix j;

    /* renamed from: k, reason: collision with root package name */
    public String f2823k;

    public n() {
        this.f2814a = new Matrix();
        this.f2815b = new ArrayList();
        this.f2816c = 0.0f;
        this.f2817d = 0.0f;
        this.f2818e = 0.0f;
        this.f2819f = 1.0f;
        this.f2820g = 1.0f;
        this.f2821h = 0.0f;
        this.f2822i = 0.0f;
        this.j = new Matrix();
        this.f2823k = null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.o
    public final boolean a() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f2815b;
            if (i5 >= arrayList.size()) {
                return false;
            }
            if (((o) arrayList.get(i5)).a()) {
                return true;
            }
            i5++;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.o
    public final boolean b(int[] iArr) {
        int i5 = 0;
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.f2815b;
            if (i5 >= arrayList.size()) {
                return z5;
            }
            z5 |= ((o) arrayList.get(i5)).b(iArr);
            i5++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f2817d, -this.f2818e);
        matrix.postScale(this.f2819f, this.f2820g);
        matrix.postRotate(this.f2816c, 0.0f, 0.0f);
        matrix.postTranslate(this.f2821h + this.f2817d, this.f2822i + this.f2818e);
    }

    public String getGroupName() {
        return this.f2823k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f2817d;
    }

    public float getPivotY() {
        return this.f2818e;
    }

    public float getRotation() {
        return this.f2816c;
    }

    public float getScaleX() {
        return this.f2819f;
    }

    public float getScaleY() {
        return this.f2820g;
    }

    public float getTranslateX() {
        return this.f2821h;
    }

    public float getTranslateY() {
        return this.f2822i;
    }

    public void setPivotX(float f6) {
        if (f6 != this.f2817d) {
            this.f2817d = f6;
            c();
        }
    }

    public void setPivotY(float f6) {
        if (f6 != this.f2818e) {
            this.f2818e = f6;
            c();
        }
    }

    public void setRotation(float f6) {
        if (f6 != this.f2816c) {
            this.f2816c = f6;
            c();
        }
    }

    public void setScaleX(float f6) {
        if (f6 != this.f2819f) {
            this.f2819f = f6;
            c();
        }
    }

    public void setScaleY(float f6) {
        if (f6 != this.f2820g) {
            this.f2820g = f6;
            c();
        }
    }

    public void setTranslateX(float f6) {
        if (f6 != this.f2821h) {
            this.f2821h = f6;
            c();
        }
    }

    public void setTranslateY(float f6) {
        if (f6 != this.f2822i) {
            this.f2822i = f6;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(n nVar, s.e eVar) {
        l lVar;
        this.f2814a = new Matrix();
        this.f2815b = new ArrayList();
        this.f2816c = 0.0f;
        this.f2817d = 0.0f;
        this.f2818e = 0.0f;
        this.f2819f = 1.0f;
        this.f2820g = 1.0f;
        this.f2821h = 0.0f;
        this.f2822i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.f2823k = null;
        this.f2816c = nVar.f2816c;
        this.f2817d = nVar.f2817d;
        this.f2818e = nVar.f2818e;
        this.f2819f = nVar.f2819f;
        this.f2820g = nVar.f2820g;
        this.f2821h = nVar.f2821h;
        this.f2822i = nVar.f2822i;
        String str = nVar.f2823k;
        this.f2823k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(nVar.j);
        ArrayList arrayList = nVar.f2815b;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            Object obj = arrayList.get(i5);
            if (obj instanceof n) {
                this.f2815b.add(new n((n) obj, eVar));
            } else {
                if (obj instanceof m) {
                    m mVar = (m) obj;
                    m mVar2 = new m(mVar);
                    mVar2.f2805e = 0.0f;
                    mVar2.f2807g = 1.0f;
                    mVar2.f2808h = 1.0f;
                    mVar2.f2809i = 0.0f;
                    mVar2.j = 1.0f;
                    mVar2.f2810k = 0.0f;
                    mVar2.f2811l = Paint.Cap.BUTT;
                    mVar2.f2812m = Paint.Join.MITER;
                    mVar2.f2813n = 4.0f;
                    mVar2.f2804d = mVar.f2804d;
                    mVar2.f2805e = mVar.f2805e;
                    mVar2.f2807g = mVar.f2807g;
                    mVar2.f2806f = mVar.f2806f;
                    mVar2.f2826c = mVar.f2826c;
                    mVar2.f2808h = mVar.f2808h;
                    mVar2.f2809i = mVar.f2809i;
                    mVar2.j = mVar.j;
                    mVar2.f2810k = mVar.f2810k;
                    mVar2.f2811l = mVar.f2811l;
                    mVar2.f2812m = mVar.f2812m;
                    mVar2.f2813n = mVar.f2813n;
                    lVar = mVar2;
                } else if (obj instanceof l) {
                    lVar = new l((l) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f2815b.add(lVar);
                Object obj2 = lVar.f2825b;
                if (obj2 != null) {
                    eVar.put(obj2, lVar);
                }
            }
        }
    }
}
