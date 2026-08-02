package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class a9 extends b9 implements Consumer {

    /* renamed from: e, reason: collision with root package name */
    public final Predicate f17797e;

    /* renamed from: f, reason: collision with root package name */
    public Object f17798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17799g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(Spliterator spliterator, Predicate predicate, int i5) {
        super(spliterator);
        this.f17799g = i5;
        this.f17797e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(Spliterator spliterator, a9 a9Var, int i5) {
        super(spliterator, a9Var);
        this.f17799g = i5;
        this.f17797e = a9Var.f17797e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f17818d = (this.f17818d + 1) & 63;
        this.f17798f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        r6.f17816b.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        r7.accept(r6.f17798f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r2;
     */
    @Override // j$.util.Spliterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean tryAdvance(Consumer consumer) {
        boolean tryAdvance;
        boolean z5;
        switch (this.f17799g) {
            case 0:
                boolean z7 = this.f17817c;
                Spliterator spliterator = this.f17815a;
                if (z7) {
                    boolean z10 = false;
                    this.f17817c = false;
                    while (true) {
                        tryAdvance = spliterator.tryAdvance(this);
                        if (tryAdvance && a() && this.f17797e.test(this.f17798f)) {
                            z10 = true;
                        }
                    }
                    return tryAdvance;
                }
                return spliterator.tryAdvance(consumer);
            default:
                if (this.f17817c && a() && this.f17815a.tryAdvance(this)) {
                    z5 = this.f17797e.test(this.f17798f);
                    if (z5) {
                        consumer.accept(this.f17798f);
                        return true;
                    }
                } else {
                    z5 = true;
                }
                this.f17817c = false;
                if (!z5) {
                    this.f17816b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f17799g) {
            case 1:
                if (!this.f17816b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    @Override // j$.util.stream.b9
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f17799g) {
            case 0:
                return new a9(spliterator, this, 0);
            default:
                return new a9(spliterator, this, 1);
        }
    }
}
