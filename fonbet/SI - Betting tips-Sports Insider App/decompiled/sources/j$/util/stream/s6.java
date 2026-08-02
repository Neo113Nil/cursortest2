package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class s6 extends w6 implements j$.util.w0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t6 f18078g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.z(this, consumer);
    }

    @Override // j$.util.stream.w6
    public final void a(int i5, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i5]);
    }

    @Override // j$.util.stream.w6
    public final j$.util.c1 b(Object obj, int i5, int i10) {
        int[] iArr = (int[]) obj;
        int i11 = i10 + i5;
        Spliterators.a(((int[]) Objects.requireNonNull(iArr)).length, i5, i11);
        return new j$.util.o1(iArr, i5, i11, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(t6 t6Var, int i5, int i10, int i11, int i12) {
        super(t6Var, i5, i10, i11, i12);
        this.f18078g = t6Var;
    }

    @Override // j$.util.stream.w6
    public final j$.util.c1 c(int i5, int i10, int i11, int i12) {
        return new s6(this.f18078g, i5, i10, i11, i12);
    }
}
