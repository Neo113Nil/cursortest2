package androidx.constraintlayout.core;

/* loaded from: classes.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public int f17750a;
    private final Object[] mPool;

    public g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.mPool = new Object[i10];
    }

    @Override // androidx.constraintlayout.core.f
    public void a(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f17750a;
            Object[] objArr2 = this.mPool;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f17750a = i12 + 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.f
    public Object acquire() {
        int i10 = this.f17750a;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.mPool;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f17750a = i10 - 1;
        return obj;
    }

    @Override // androidx.constraintlayout.core.f
    public boolean release(Object obj) {
        int i10 = this.f17750a;
        Object[] objArr = this.mPool;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f17750a = i10 + 1;
        return true;
    }
}
