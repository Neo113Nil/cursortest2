package androidx.media3.ui;

/* loaded from: classes.dex */
public interface l0 {

    public interface a {
        void G(l0 l0Var, long j10);

        void O(l0 l0Var, long j10, boolean z10);

        void m(l0 l0Var, long j10);
    }

    void a(a aVar);

    void b(long[] jArr, boolean[] zArr, int i10);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
