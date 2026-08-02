package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class u6 extends w6 implements j$.util.z0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v6 f18103g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.w6
    public final void a(int i5, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i5]);
    }

    @Override // j$.util.stream.w6
    public final j$.util.c1 b(Object obj, int i5, int i10) {
        long[] jArr = (long[]) obj;
        int i11 = i10 + i5;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, i5, i11);
        return new j$.util.q1(jArr, i5, i11, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(v6 v6Var, int i5, int i10, int i11, int i12) {
        super(v6Var, i5, i10, i11, i12);
        this.f18103g = v6Var;
    }

    @Override // j$.util.stream.w6
    public final j$.util.c1 c(int i5, int i10, int i11, int i12) {
        return new u6(this.f18103g, i5, i10, i11, i12);
    }
}
