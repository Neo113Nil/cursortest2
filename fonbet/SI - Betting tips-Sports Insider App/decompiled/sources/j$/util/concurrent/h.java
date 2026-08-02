package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class h extends n implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17652i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j[] jVarArr, int i5, int i10, int i11, long j, int i12) {
        super(jVarArr, i5, i10, i11);
        this.f17652i = i12;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f17652i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f17652i) {
        }
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        switch (this.f17652i) {
        }
        return j$.com.android.tools.r8.a.p(this, i5);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f17652i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f17652i) {
            case 0:
                int i5 = this.f17669f;
                int i10 = this.f17670g;
                int i11 = (i5 + i10) >>> 1;
                if (i11 <= i5) {
                    return null;
                }
                j[] jVarArr = this.f17664a;
                this.f17670g = i11;
                long j = this.j >>> 1;
                this.j = j;
                return new h(jVarArr, this.f17671h, i11, i10, j, 0);
            default:
                int i12 = this.f17669f;
                int i13 = this.f17670g;
                int i14 = (i12 + i13) >>> 1;
                if (i14 <= i12) {
                    return null;
                }
                j[] jVarArr2 = this.f17664a;
                this.f17670g = i14;
                long j6 = this.j >>> 1;
                this.j = j6;
                return new h(jVarArr2, this.f17671h, i14, i13, j6, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f17652i) {
            case 0:
                consumer.getClass();
                while (true) {
                    j a7 = a();
                    if (a7 == null) {
                        break;
                    } else {
                        consumer.n(a7.f17657b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    j a10 = a();
                    if (a10 == null) {
                        break;
                    } else {
                        consumer.n(a10.f17658c);
                    }
                }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f17652i) {
            case 0:
                consumer.getClass();
                j a7 = a();
                if (a7 != null) {
                    consumer.n(a7.f17657b);
                    break;
                }
                break;
            default:
                consumer.getClass();
                j a10 = a();
                if (a10 != null) {
                    consumer.n(a10.f17658c);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f17652i) {
        }
        return this.j;
    }
}
