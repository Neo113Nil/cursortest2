package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.i;
import java.io.IOException;
import xsna.cq10;
import xsna.dvf;
import xsna.ewo0;
import xsna.m0h0;
import xsna.wyf0;
import xsna.x1b0;

/* compiled from: Renderer.java */
/* loaded from: classes12.dex */
public interface j extends i.b {

    /* compiled from: Renderer.java */
    public interface a {
        void a();

        void b();
    }

    void d(long j, boolean z) throws ExoPlaybackException;

    void disable();

    long e();

    void g(int i, x1b0 x1b0Var, dvf dvfVar);

    androidx.media3.exoplayer.a getCapabilities();

    @Nullable
    cq10 getMediaClock();

    String getName();

    int getState();

    @Nullable
    m0h0 getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    void i(androidx.media3.common.a[] aVarArr, m0h0 m0h0Var, long j, long j2, i.b bVar) throws ExoPlaybackException;

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void j(ewo0 ewo0Var);

    void k(wyf0 wyf0Var, androidx.media3.common.a[] aVarArr, m0h0 m0h0Var, boolean z, boolean z2, long j, long j2, i.b bVar) throws ExoPlaybackException;

    void maybeThrowStreamError() throws IOException;

    default boolean n(long j) {
        return false;
    }

    default long o(long j, long j2) {
        if (getState() == 1) {
            return (isReady() || isEnded()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    void render(long j, long j2) throws ExoPlaybackException;

    void reset();

    void setCurrentStreamFinal();

    void start() throws ExoPlaybackException;

    void stop();

    default void h() {
    }

    default void release() {
    }

    default void q(float f, float f2) throws ExoPlaybackException {
    }
}
