package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class s3 extends t3 {

    /* renamed from: h, reason: collision with root package name */
    public final Object[] f18076h;

    public s3(Spliterator spliterator, x3 x3Var, Object[] objArr) {
        super(spliterator, x3Var, objArr.length);
        this.f18076h = objArr;
    }

    public s3(s3 s3Var, Spliterator spliterator, long j, long j6) {
        super(s3Var, spliterator, j, j6, s3Var.f18076h.length);
        this.f18076h = s3Var.f18076h;
    }

    @Override // j$.util.stream.t3
    public final t3 a(Spliterator spliterator, long j, long j6) {
        return new s3(this, spliterator, j, j6);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        int i5 = this.f18089f;
        if (i5 >= this.f18090g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18089f));
        }
        Object[] objArr = this.f18076h;
        this.f18089f = i5 + 1;
        objArr[i5] = obj;
    }
}
