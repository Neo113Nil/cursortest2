package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.bpz;
import xsna.d8h;
import xsna.j7j;
import xsna.kx2;
import xsna.pr10;
import xsna.py10;
import xsna.qy10;
import xsna.ry10;
import xsna.tn4;
import xsna.y2r0;
import xsna.yj0;

/* compiled from: MediaSourceEventListener.java */
/* loaded from: classes12.dex */
public interface j {

    /* compiled from: MediaSourceEventListener.java */
    public static class a {
        public final int a;

        @Nullable
        public final i.b b;
        public final CopyOnWriteArrayList<C0063a> c;

        /* compiled from: MediaSourceEventListener.java */
        /* renamed from: androidx.media3.exoplayer.source.j$a$a, reason: collision with other inner class name */
        public static final class C0063a {
            public Handler a;
            public Object b;
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a(j7j<j> j7jVar) {
            Iterator<C0063a> it = this.c.iterator();
            while (it.hasNext()) {
                C0063a next = it.next();
                y2r0.Y(next.a, new d8h(2, j7jVar, next.b));
            }
        }

        public final void b(int i, @Nullable androidx.media3.common.a aVar, int i2, @Nullable Object obj, long j) {
            a(new yj0(this, new pr10(1, i, aVar, i2, obj, y2r0.j0(j), C.TIME_UNSET)));
        }

        public final void c(bpz bpzVar, int i) {
            d(bpzVar, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public final void d(bpz bpzVar, int i, int i2, @Nullable androidx.media3.common.a aVar, int i3, @Nullable Object obj, long j, long j2) {
            a(new ry10(this, bpzVar, new pr10(i, i2, aVar, i3, obj, y2r0.j0(j), y2r0.j0(j2))));
        }

        public final void e(bpz bpzVar, int i) {
            f(bpzVar, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public final void f(bpz bpzVar, int i, int i2, @Nullable androidx.media3.common.a aVar, int i3, @Nullable Object obj, long j, long j2) {
            a(new kx2(this, bpzVar, new pr10(i, i2, aVar, i3, obj, y2r0.j0(j), y2r0.j0(j2))));
        }

        public final void g(bpz bpzVar, int i, int i2, @Nullable androidx.media3.common.a aVar, int i3, @Nullable Object obj, long j, long j2, IOException iOException, boolean z) {
            a(new qy10(this, bpzVar, new pr10(i, i2, aVar, i3, obj, y2r0.j0(j), y2r0.j0(j2)), iOException, z));
        }

        public final void h(bpz bpzVar, int i, IOException iOException, boolean z) {
            g(bpzVar, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z);
        }

        public final void i(bpz bpzVar, int i, int i2) {
            j(bpzVar, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, i2);
        }

        public final void j(bpz bpzVar, int i, int i2, @Nullable androidx.media3.common.a aVar, int i3, @Nullable Object obj, long j, long j2, int i4) {
            a(new tn4(this, bpzVar, new pr10(i, i2, aVar, i3, obj, y2r0.j0(j), y2r0.j0(j2)), i4));
        }

        public final void k(int i, long j, long j2) {
            pr10 pr10Var = new pr10(1, i, null, 3, null, y2r0.j0(j), y2r0.j0(j2));
            i.b bVar = this.b;
            bVar.getClass();
            a(new py10(this, bVar, pr10Var));
        }

        public a(CopyOnWriteArrayList<C0063a> copyOnWriteArrayList, int i, @Nullable i.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }

    default void h(int i, i.b bVar, pr10 pr10Var) {
    }

    default void x(int i, @Nullable i.b bVar, pr10 pr10Var) {
    }

    default void B(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var) {
    }

    default void H(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var) {
    }

    default void F(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var, int i2) {
    }

    default void A(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var, IOException iOException, boolean z) {
    }
}
