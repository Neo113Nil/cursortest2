package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import xsna.anl;
import xsna.ewo0;
import xsna.kr10;
import xsna.mjp0;
import xsna.vul0;
import xsna.x1b0;
import xsna.xu1;
import xsna.ylo;

/* compiled from: MediaSource.java */
/* loaded from: classes12.dex */
public interface i {

    /* compiled from: MediaSource.java */
    public static final class b {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public final b a(Object obj) {
            if (this.a.equals(obj)) {
                return this;
            }
            return new b(obj, this.b, this.c, this.d, this.e);
        }

        public final boolean b() {
            return this.b != -1;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            return ((((((vul0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
        }

        public b(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public b(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public b(Object obj, int i, int i2, long j, int i3) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = i3;
        }
    }

    /* compiled from: MediaSource.java */
    public interface c {
        void a(androidx.media3.exoplayer.source.a aVar, ewo0 ewo0Var);
    }

    void a(Handler handler, j jVar);

    void b(c cVar);

    void c(c cVar);

    void d(c cVar);

    void e(c cVar, @Nullable mjp0 mjp0Var, x1b0 x1b0Var);

    kr10 f();

    void g(Handler handler, androidx.media3.exoplayer.drm.a aVar);

    void h(h hVar);

    @Nullable
    default ewo0 i() {
        return null;
    }

    void j(j jVar);

    void k(androidx.media3.exoplayer.drm.a aVar);

    h m(b bVar, xu1 xu1Var, long j);

    void maybeThrowSourceInfoRefreshError() throws IOException;

    default boolean n() {
        return !(this instanceof d);
    }

    /* compiled from: MediaSource.java */
    /* loaded from: classes.dex */
    public interface a {
        i d(kr10 kr10Var);

        a e(ylo yloVar);

        a f(androidx.media3.exoplayer.upstream.b bVar);

        default void b() {
        }

        default void a(anl anlVar) {
        }

        @Deprecated
        default void c(boolean z) {
        }
    }

    default void l(kr10 kr10Var) {
    }
}
