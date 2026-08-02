package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseStream f17889a;

    public /* synthetic */ f(BaseStream baseStream) {
        this.f17889a = baseStream;
    }

    public static /* synthetic */ h f(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof g ? ((g) baseStream).f17905a : baseStream instanceof DoubleStream ? c0.f((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? l1.f((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? z6.f((java.util.stream.Stream) baseStream) : new f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f17889a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f17889a;
        if (obj instanceof f) {
            obj = ((f) obj).f17889a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f17889a.hashCode();
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ boolean isParallel() {
        return this.f17889a.isParallel();
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ Iterator iterator() {
        return this.f17889a.iterator();
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h onClose(Runnable runnable) {
        return f(this.f17889a.onClose(runnable));
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h parallel() {
        return f(this.f17889a.parallel());
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h sequential() {
        return f(this.f17889a.sequential());
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.f17889a.spliterator());
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h unordered() {
        return f(this.f17889a.unordered());
    }
}
