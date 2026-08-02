package androidx.media3.exoplayer.trackselection;

import androidx.media3.exoplayer.source.D;
import b1.AbstractC2346O;
import b1.P;
import e1.AbstractC4156x;
import java.util.List;

/* loaded from: classes.dex */
public interface y extends C {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final P f22086a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22087b;
        public final int[] tracks;

        public a(P p10, int... iArr) {
            this(p10, iArr, 0);
        }

        public a(P p10, int[] iArr, int i10) {
            if (iArr.length == 0) {
                AbstractC4156x.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f22086a = p10;
            this.tracks = iArr;
            this.f22087b = i10;
        }
    }

    public interface b {
        y[] a(a[] aVarArr, D1.d dVar, D.b bVar, AbstractC2346O abstractC2346O);
    }

    default long a() {
        return -2147483647L;
    }

    boolean b(int i10, long j10);

    int d();

    void disable();

    void enable();

    default boolean g(long j10, B1.e eVar, List list) {
        return false;
    }

    boolean h(int i10, long j10);

    void i(float f10);

    Object j();

    default void k() {
    }

    void n(long j10, long j11, long j12, List list, B1.n[] nVarArr);

    void o(boolean z10);

    int p(long j10, List list);

    int q();

    androidx.media3.common.a r();

    int s();

    default void t() {
    }
}
