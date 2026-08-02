package j$.util;

/* loaded from: classes2.dex */
public interface c1 extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    c1 trySplit();
}
