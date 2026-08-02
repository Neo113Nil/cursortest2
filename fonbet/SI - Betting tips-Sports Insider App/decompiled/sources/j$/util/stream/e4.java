package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class e4 extends x3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17873h;

    public /* synthetic */ e4(int i5) {
        this.f17873h = i5;
    }

    @Override // j$.util.stream.x3
    public final s4 C0() {
        switch (this.f17873h) {
            case 0:
                return new w4();
            case 1:
                return new u4();
            case 2:
                return new x4();
            default:
                return new v4();
        }
    }

    @Override // j$.util.stream.x3, j$.util.stream.i8
    public final Object f(b bVar, Spliterator spliterator) {
        switch (this.f17873h) {
            case 0:
                if (!c7.SIZED.n(bVar.f17804m)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!c7.SIZED.n(bVar.f17804m)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!c7.SIZED.n(bVar.f17804m)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!c7.SIZED.n(bVar.f17804m)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.f(bVar, spliterator);
    }

    @Override // j$.util.stream.x3, j$.util.stream.i8
    public final Object i(x3 x3Var, Spliterator spliterator) {
        switch (this.f17873h) {
            case 0:
                if (!c7.SIZED.n(((b) x3Var).f17804m)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!c7.SIZED.n(((b) x3Var).f17804m)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!c7.SIZED.n(((b) x3Var).f17804m)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!c7.SIZED.n(((b) x3Var).f17804m)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.i(x3Var, spliterator);
    }

    @Override // j$.util.stream.x3, j$.util.stream.i8
    public final int v() {
        switch (this.f17873h) {
        }
        return c7.f17837r;
    }
}
