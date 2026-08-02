package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements BaseStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f17905a;

    public /* synthetic */ g(h hVar) {
        this.f17905a = hVar;
    }

    public static /* synthetic */ BaseStream f(h hVar) {
        if (hVar == null) {
            return null;
        }
        return hVar instanceof f ? ((f) hVar).f17889a : hVar instanceof e0 ? d0.f((e0) hVar) : hVar instanceof IntStream ? IntStream.Wrapper.convert((IntStream) hVar) : hVar instanceof n1 ? m1.f((n1) hVar) : hVar instanceof Stream ? Stream.Wrapper.convert((Stream) hVar) : new g(hVar);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f17905a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        h hVar = this.f17905a;
        if (obj instanceof g) {
            obj = ((g) obj).f17905a;
        }
        return hVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f17905a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f17905a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f17905a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return f(this.f17905a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return f(this.f17905a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return f(this.f17905a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f17905a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return f(this.f17905a.unordered());
    }
}
