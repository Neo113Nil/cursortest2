package zf;

import java.util.NoSuchElementException;
import kotlin.collections.j0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f25978a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25979b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25980c;

    /* renamed from: d, reason: collision with root package name */
    public long f25981d;

    public f(long j, long j6, long j10) {
        this.f25978a = j10;
        this.f25979b = j6;
        boolean z5 = false;
        if (j10 <= 0 ? j >= j6 : j <= j6) {
            z5 = true;
        }
        this.f25980c = z5;
        this.f25981d = z5 ? j : j6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25980c;
    }

    @Override // kotlin.collections.j0
    public final long nextLong() {
        long j = this.f25981d;
        if (j != this.f25979b) {
            this.f25981d = this.f25978a + j;
            return j;
        }
        if (!this.f25980c) {
            throw new NoSuchElementException();
        }
        this.f25980c = false;
        return j;
    }
}
