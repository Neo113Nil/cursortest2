package j3;

import B0.d2;
import android.net.Uri;
import android.util.Pair;
import j3.C7259a;
import j3.C7275q;
import java.util.Objects;

/* renamed from: j3.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7252H {
    public static final AbstractC7252H EMPTY = new a();
    private static final String FIELD_PERIODS;
    private static final String FIELD_SHUFFLED_WINDOW_INDICES;
    private static final String FIELD_WINDOWS;

    /* renamed from: j3.H$a */
    final class a extends AbstractC7252H {
        @Override // j3.AbstractC7252H
        public final int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // j3.AbstractC7252H
        public final b getPeriod(int i11, b bVar, boolean z11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j3.AbstractC7252H
        public final int getPeriodCount() {
            return 0;
        }

        @Override // j3.AbstractC7252H
        public final Object getUidOfPeriod(int i11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j3.AbstractC7252H
        public final c getWindow(int i11, c cVar, long j11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j3.AbstractC7252H
        public final int getWindowCount() {
            return 0;
        }
    }

    /* renamed from: j3.H$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f68937a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68938b;

        /* renamed from: c, reason: collision with root package name */
        public int f68939c;

        /* renamed from: d, reason: collision with root package name */
        public long f68940d;

        /* renamed from: e, reason: collision with root package name */
        public long f68941e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f68942f;

        /* renamed from: g, reason: collision with root package name */
        public C7259a f68943g = C7259a.f69046c;

        static {
            Pk0.h.f(0, 1, 2, 3, 4);
        }

        public final long a(int i11, int i12) {
            C7259a.C1129a a11 = this.f68943g.a(i11);
            if (a11.f69050a != -1) {
                return a11.f69055f[i12];
            }
            return -9223372036854775807L;
        }

        public final int b(long j11) {
            int i11;
            C7259a.C1129a a11;
            int i12;
            C7259a c7259a = this.f68943g;
            long j12 = this.f68940d;
            c7259a.getClass();
            if (j11 != Long.MIN_VALUE && (j12 == -9223372036854775807L || j11 < j12)) {
                int i13 = 0;
                while (true) {
                    i11 = c7259a.f69048a;
                    if (i13 >= i11) {
                        break;
                    }
                    c7259a.a(i13).getClass();
                    c7259a.a(i13).getClass();
                    if (0 > j11 && ((i12 = (a11 = c7259a.a(i13)).f69050a) == -1 || a11.a(-1) < i12)) {
                        break;
                    }
                    i13++;
                }
                if (i13 < i11) {
                    if (j12 != -9223372036854775807L) {
                        c7259a.a(i13).getClass();
                        if (0 <= j12) {
                        }
                    }
                    return i13;
                }
            }
            return -1;
        }

        public final int c(long j11) {
            int i11;
            C7259a c7259a = this.f68943g;
            int i12 = c7259a.f69048a;
            int i13 = i12 - 1;
            if (i13 == i12 - 1) {
                c7259a.a(i13).getClass();
            }
            while (i13 >= 0 && j11 != Long.MIN_VALUE) {
                c7259a.a(i13).getClass();
                if (j11 >= 0) {
                    break;
                }
                i13--;
            }
            if (i13 >= 0) {
                C7259a.C1129a a11 = c7259a.a(i13);
                int i14 = a11.f69050a;
                if (i14 != -1) {
                    while (i11 < i14) {
                        int i15 = a11.f69054e[i11];
                        i11 = (i15 == 0 || i15 == 1) ? 0 : i11 + 1;
                    }
                }
                return i13;
            }
            return -1;
        }

        public final long d(int i11) {
            this.f68943g.a(i11).getClass();
            return 0L;
        }

        public final int e(int i11) {
            return this.f68943g.a(i11).a(-1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f68937a, bVar.f68937a) && Objects.equals(this.f68938b, bVar.f68938b) && this.f68939c == bVar.f68939c && this.f68940d == bVar.f68940d && this.f68941e == bVar.f68941e && this.f68942f == bVar.f68942f && Objects.equals(this.f68943g, bVar.f68943g);
        }

        public final boolean f(int i11) {
            C7259a c7259a = this.f68943g;
            int i12 = c7259a.f69048a;
            if (i11 != i12 - 1 || i11 != i12 - 1) {
                return false;
            }
            c7259a.a(i11).getClass();
            return false;
        }

        public final boolean g(int i11) {
            this.f68943g.a(i11).getClass();
            return false;
        }

        public final void h(Integer num, Object obj, int i11, long j11, long j12, C7259a c7259a, boolean z11) {
            this.f68937a = num;
            this.f68938b = obj;
            this.f68939c = i11;
            this.f68940d = j11;
            this.f68941e = j12;
            this.f68943g = c7259a;
            this.f68942f = z11;
        }

        public final int hashCode() {
            Integer num = this.f68937a;
            int hashCode = (217 + (num == null ? 0 : num.hashCode())) * 31;
            Object obj = this.f68938b;
            int hashCode2 = (((hashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.f68939c) * 31;
            long j11 = this.f68940d;
            int i11 = (hashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f68941e;
            return this.f68943g.hashCode() + ((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f68942f ? 1 : 0)) * 31);
        }
    }

    /* renamed from: j3.H$c */
    public static final class c {

        /* renamed from: q, reason: collision with root package name */
        public static final Object f68944q = new Object();

        /* renamed from: r, reason: collision with root package name */
        private static final C7275q f68945r;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f68947b;

        /* renamed from: d, reason: collision with root package name */
        public d2 f68949d;

        /* renamed from: e, reason: collision with root package name */
        public long f68950e;

        /* renamed from: f, reason: collision with root package name */
        public long f68951f;

        /* renamed from: g, reason: collision with root package name */
        public long f68952g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f68953h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f68954i;

        /* renamed from: j, reason: collision with root package name */
        public C7275q.e f68955j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f68956k;

        /* renamed from: l, reason: collision with root package name */
        public long f68957l;

        /* renamed from: m, reason: collision with root package name */
        public long f68958m;

        /* renamed from: n, reason: collision with root package name */
        public int f68959n;

        /* renamed from: o, reason: collision with root package name */
        public int f68960o;

        /* renamed from: p, reason: collision with root package name */
        public long f68961p;

        /* renamed from: a, reason: collision with root package name */
        public Object f68946a = f68944q;

        /* renamed from: c, reason: collision with root package name */
        public C7275q f68948c = f68945r;

        static {
            C7275q.a aVar = new C7275q.a();
            aVar.d("androidx.media3.common.Timeline");
            aVar.i(Uri.EMPTY);
            f68945r = aVar.a();
            Pk0.h.f(1, 2, 3, 4, 5);
            Pk0.h.f(6, 7, 8, 9, 10);
            m3.N.L(11);
            m3.N.L(12);
            m3.N.L(13);
        }

        public final boolean a() {
            return this.f68955j != null;
        }

        public final void b(C7275q c7275q, d2 d2Var, long j11, long j12, long j13, boolean z11, boolean z12, C7275q.e eVar, long j14, long j15, long j16) {
            C7275q.f fVar;
            this.f68946a = f68944q;
            this.f68948c = c7275q != null ? c7275q : f68945r;
            this.f68947b = (c7275q == null || (fVar = c7275q.f69184b) == null) ? null : fVar.f69246g;
            this.f68949d = d2Var;
            this.f68950e = j11;
            this.f68951f = j12;
            this.f68952g = j13;
            this.f68953h = z11;
            this.f68954i = z12;
            this.f68955j = eVar;
            this.f68957l = j14;
            this.f68958m = j15;
            this.f68959n = 0;
            this.f68960o = 0;
            this.f68961p = j16;
            this.f68956k = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f68946a, cVar.f68946a) && Objects.equals(this.f68948c, cVar.f68948c) && Objects.equals(this.f68949d, cVar.f68949d) && Objects.equals(this.f68955j, cVar.f68955j) && this.f68950e == cVar.f68950e && this.f68951f == cVar.f68951f && this.f68952g == cVar.f68952g && this.f68953h == cVar.f68953h && this.f68954i == cVar.f68954i && this.f68956k == cVar.f68956k && this.f68957l == cVar.f68957l && this.f68958m == cVar.f68958m && this.f68959n == cVar.f68959n && this.f68960o == cVar.f68960o && this.f68961p == cVar.f68961p;
        }

        public final int hashCode() {
            int hashCode = (this.f68948c.hashCode() + H00.a.c(217, 31, this.f68946a)) * 31;
            d2 d2Var = this.f68949d;
            int hashCode2 = (hashCode + (d2Var == null ? 0 : d2Var.hashCode())) * 31;
            C7275q.e eVar = this.f68955j;
            int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            long j11 = this.f68950e;
            int i11 = (hashCode3 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f68951f;
            int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f68952g;
            int i13 = (((((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f68953h ? 1 : 0)) * 31) + (this.f68954i ? 1 : 0)) * 31) + (this.f68956k ? 1 : 0)) * 31;
            long j14 = this.f68957l;
            int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
            long j15 = this.f68958m;
            int i15 = (((((i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + this.f68959n) * 31) + this.f68960o) * 31;
            long j16 = this.f68961p;
            return i15 + ((int) (j16 ^ (j16 >>> 32)));
        }
    }

    static {
        int i11 = m3.N.f74289a;
        FIELD_WINDOWS = Integer.toString(0, 36);
        FIELD_PERIODS = Integer.toString(1, 36);
        FIELD_SHUFFLED_WINDOW_INDICES = Integer.toString(2, 36);
    }

    protected AbstractC7252H() {
    }

    public boolean equals(Object obj) {
        int lastWindowIndex;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7252H)) {
            return false;
        }
        AbstractC7252H abstractC7252H = (AbstractC7252H) obj;
        if (abstractC7252H.getWindowCount() != getWindowCount() || abstractC7252H.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i11 = 0; i11 < getWindowCount(); i11++) {
            if (!getWindow(i11, cVar).equals(abstractC7252H.getWindow(i11, cVar2))) {
                return false;
            }
        }
        for (int i12 = 0; i12 < getPeriodCount(); i12++) {
            if (!getPeriod(i12, bVar, true).equals(abstractC7252H.getPeriod(i12, bVar2, true))) {
                return false;
            }
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        if (firstWindowIndex != abstractC7252H.getFirstWindowIndex(true) || (lastWindowIndex = getLastWindowIndex(true)) != abstractC7252H.getLastWindowIndex(true)) {
            return false;
        }
        while (firstWindowIndex != lastWindowIndex) {
            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
            if (nextWindowIndex != abstractC7252H.getNextWindowIndex(firstWindowIndex, 0, true)) {
                return false;
            }
            firstWindowIndex = nextWindowIndex;
        }
        return true;
    }

    public int getFirstWindowIndex(boolean z11) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z11) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i11, b bVar, c cVar, int i12, boolean z11) {
        int i13 = getPeriod(i11, bVar).f68939c;
        if (getWindow(i13, cVar).f68960o != i11) {
            return i11 + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i13, i12, z11);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, cVar).f68959n;
    }

    public int getNextWindowIndex(int i11, int i12, boolean z11) {
        if (i12 == 0) {
            if (i11 == getLastWindowIndex(z11)) {
                return -1;
            }
            return i11 + 1;
        }
        if (i12 == 1) {
            return i11;
        }
        if (i12 == 2) {
            return i11 == getLastWindowIndex(z11) ? getFirstWindowIndex(z11) : i11 + 1;
        }
        throw new IllegalStateException();
    }

    public final b getPeriod(int i11, b bVar) {
        return getPeriod(i11, bVar, false);
    }

    public abstract b getPeriod(int i11, b bVar, boolean z11);

    public b getPeriodByUid(Object obj, b bVar) {
        return getPeriod(getIndexOfPeriod(obj), bVar, true);
    }

    public abstract int getPeriodCount();

    public final Pair<Object, Long> getPeriodPositionUs(c cVar, b bVar, int i11, long j11) {
        Pair<Object, Long> periodPositionUs = getPeriodPositionUs(cVar, bVar, i11, j11, 0L);
        periodPositionUs.getClass();
        return periodPositionUs;
    }

    public int getPreviousWindowIndex(int i11, int i12, boolean z11) {
        if (i12 == 0) {
            if (i11 == getFirstWindowIndex(z11)) {
                return -1;
            }
            return i11 - 1;
        }
        if (i12 == 1) {
            return i11;
        }
        if (i12 == 2) {
            return i11 == getFirstWindowIndex(z11) ? getLastWindowIndex(z11) : i11 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object getUidOfPeriod(int i11);

    public final c getWindow(int i11, c cVar) {
        return getWindow(i11, cVar, 0L);
    }

    public abstract c getWindow(int i11, c cVar, long j11);

    public abstract int getWindowCount();

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int windowCount = getWindowCount() + 217;
        for (int i11 = 0; i11 < getWindowCount(); i11++) {
            windowCount = (windowCount * 31) + getWindow(i11, cVar).hashCode();
        }
        int periodCount = getPeriodCount() + (windowCount * 31);
        for (int i12 = 0; i12 < getPeriodCount(); i12++) {
            periodCount = (periodCount * 31) + getPeriod(i12, bVar, true).hashCode();
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        while (firstWindowIndex != -1) {
            periodCount = (periodCount * 31) + firstWindowIndex;
            firstWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int i11, b bVar, c cVar, int i12, boolean z11) {
        return getNextPeriodIndex(i11, bVar, cVar, i12, z11) == -1;
    }

    public final Pair<Object, Long> getPeriodPositionUs(c cVar, b bVar, int i11, long j11, long j12) {
        G10.a.d(i11, getWindowCount());
        getWindow(i11, cVar, j12);
        if (j11 == -9223372036854775807L) {
            j11 = cVar.f68957l;
            if (j11 == -9223372036854775807L) {
                return null;
            }
        }
        int i12 = cVar.f68959n;
        getPeriod(i12, bVar);
        while (i12 < cVar.f68960o && bVar.f68941e != j11) {
            int i13 = i12 + 1;
            if (getPeriod(i13, bVar).f68941e > j11) {
                break;
            }
            i12 = i13;
        }
        getPeriod(i12, bVar, true);
        long j13 = j11 - bVar.f68941e;
        long j14 = bVar.f68940d;
        if (j14 != -9223372036854775807L) {
            j13 = Math.min(j13, j14 - 1);
        }
        long max = Math.max(0L, j13);
        Object obj = bVar.f68938b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }
}
