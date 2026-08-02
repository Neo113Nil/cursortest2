package androidx.media3.exoplayer;

/* compiled from: RendererCapabilities.java */
/* loaded from: classes12.dex */
public interface k {

    /* compiled from: RendererCapabilities.java */
    public interface a {
    }

    static int f(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    static boolean m(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    int a(androidx.media3.common.a aVar) throws ExoPlaybackException;

    String getName();

    int getTrackType();

    int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException;

    default void c() {
    }

    default void p(a aVar) {
    }
}
