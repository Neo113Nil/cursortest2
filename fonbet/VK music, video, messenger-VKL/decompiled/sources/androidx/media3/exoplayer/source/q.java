package androidx.media3.exoplayer.source;

/* compiled from: SequenceableLoader.java */
/* loaded from: classes12.dex */
public interface q {

    /* compiled from: SequenceableLoader.java */
    public interface a<T extends q> {
        void d(T t);
    }

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    boolean k(androidx.media3.exoplayer.f fVar);

    void reevaluateBuffer(long j);
}
