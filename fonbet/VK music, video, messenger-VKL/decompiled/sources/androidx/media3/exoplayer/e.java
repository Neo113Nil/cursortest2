package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.i;
import xsna.ahn;
import xsna.d7q;
import xsna.ewo0;
import xsna.x1b0;
import xsna.xu1;

/* compiled from: LoadControl.java */
/* loaded from: classes12.dex */
public interface e {

    /* compiled from: LoadControl.java */
    public static final class a {
        public final x1b0 a;
        public final ewo0 b;
        public final i.b c;
        public final long d;
        public final float e;
        public final boolean f;
        public final long g;

        public a(x1b0 x1b0Var, ewo0 ewo0Var, i.b bVar, long j, long j2, float f, boolean z, long j3) {
            this.a = x1b0Var;
            this.b = ewo0Var;
            this.c = bVar;
            this.d = j2;
            this.e = f;
            this.f = z;
            this.g = j3;
        }
    }

    default boolean a(a aVar) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default boolean b() {
        ahn.F("shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default void c(a aVar, d7q[] d7qVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void d(x1b0 x1b0Var) {
        throw new IllegalStateException("onStopped not implemented");
    }

    xu1 e(x1b0 x1b0Var);

    default boolean f(a aVar) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    default void g(x1b0 x1b0Var) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default long getBackBufferDurationUs() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default void h(x1b0 x1b0Var) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default boolean retainBackBufferFromKeyframe() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }
}
