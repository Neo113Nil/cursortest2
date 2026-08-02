package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import b1.P;
import e1.AbstractC4134a;
import e1.Z;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: androidx.media3.exoplayer.trackselection.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2227c implements y {

    /* renamed from: a, reason: collision with root package name */
    public final P f21942a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21943b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21944c;

    /* renamed from: d, reason: collision with root package name */
    public int f21945d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21946e;
    private final long[] excludeUntilTimes;
    private final androidx.media3.common.a[] formats;
    protected final int[] tracks;

    public AbstractC2227c(P p10, int... iArr) {
        this(p10, iArr, 0);
    }

    public static /* synthetic */ int u(androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        return aVar2.f20538j - aVar.f20538j;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public boolean b(int i10, long j10) {
        return this.excludeUntilTimes[i10] > j10;
    }

    @Override // androidx.media3.exoplayer.trackselection.C
    public final int c(androidx.media3.common.a aVar) {
        for (int i10 = 0; i10 < this.f21943b; i10++) {
            if (this.formats[i10] == aVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void disable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.C
    public final androidx.media3.common.a e(int i10) {
        return this.formats[i10];
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC2227c abstractC2227c = (AbstractC2227c) obj;
            if (this.f21942a.equals(abstractC2227c.f21942a) && Arrays.equals(this.tracks, abstractC2227c.tracks)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.C
    public final int f(int i10) {
        return this.tracks[i10];
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public boolean h(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b10 = b(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f21943b && !b10) {
            b10 = (i11 == i10 || b(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (!b10) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        jArr[i10] = Math.max(jArr[i10], Z.c(elapsedRealtime, j10, LongCompanionObject.MAX_VALUE));
        return true;
    }

    public int hashCode() {
        if (this.f21945d == 0) {
            this.f21945d = (System.identityHashCode(this.f21942a) * 31) + Arrays.hashCode(this.tracks);
        }
        return this.f21945d;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void i(float f10) {
    }

    @Override // androidx.media3.exoplayer.trackselection.C
    public final int l(int i10) {
        for (int i11 = 0; i11 < this.f21943b; i11++) {
            if (this.tracks[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.C
    public final int length() {
        return this.tracks.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.C
    public final P m() {
        return this.f21942a;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void o(boolean z10) {
        this.f21946e = z10;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public int p(long j10, List list) {
        return list.size();
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public final int q() {
        return this.tracks[d()];
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public final androidx.media3.common.a r() {
        return this.formats[d()];
    }

    public AbstractC2227c(P p10, int[] iArr, int i10) {
        AbstractC4134a.g(iArr.length > 0);
        this.f21944c = i10;
        this.f21942a = (P) AbstractC4134a.e(p10);
        int length = iArr.length;
        this.f21943b = length;
        this.formats = new androidx.media3.common.a[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.formats[i11] = p10.a(iArr[i11]);
        }
        Arrays.sort(this.formats, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC2227c.u((androidx.media3.common.a) obj, (androidx.media3.common.a) obj2);
            }
        });
        this.tracks = new int[this.f21943b];
        int i12 = 0;
        while (true) {
            int i13 = this.f21943b;
            if (i12 >= i13) {
                this.excludeUntilTimes = new long[i13];
                this.f21946e = false;
                return;
            } else {
                this.tracks[i12] = p10.b(this.formats[i12]);
                i12++;
            }
        }
    }
}
