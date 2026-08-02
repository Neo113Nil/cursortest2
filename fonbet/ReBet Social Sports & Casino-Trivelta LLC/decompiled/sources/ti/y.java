package ti;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements G {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6480j f65895a;

    /* renamed from: b, reason: collision with root package name */
    public final C6478h f65896b;

    /* renamed from: c, reason: collision with root package name */
    public C6468B f65897c;

    /* renamed from: d, reason: collision with root package name */
    public int f65898d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65899e;

    /* renamed from: f, reason: collision with root package name */
    public long f65900f;

    public y(InterfaceC6480j upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f65895a = upstream;
        C6478h h10 = upstream.h();
        this.f65896b = h10;
        C6468B c6468b = h10.f65857a;
        this.f65897c = c6468b;
        this.f65898d = c6468b != null ? c6468b.f65835a : -1;
    }

    @Override // ti.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f65899e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r4.f65835a) goto L15;
     */
    @Override // ti.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long read(C6478h sink, long j10) {
        C6468B c6468b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f65899e) {
            throw new IllegalStateException("closed");
        }
        C6468B c6468b2 = this.f65897c;
        if (c6468b2 != null) {
            C6468B c6468b3 = this.f65896b.f65857a;
            if (c6468b2 == c6468b3) {
                int i10 = this.f65898d;
                Intrinsics.checkNotNull(c6468b3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f65895a.v0(this.f65900f + 1)) {
            return -1L;
        }
        if (this.f65897c == null && (c6468b = this.f65896b.f65857a) != null) {
            this.f65897c = c6468b;
            Intrinsics.checkNotNull(c6468b);
            this.f65898d = c6468b.f65835a;
        }
        long min = Math.min(j10, this.f65896b.size() - this.f65900f);
        this.f65896b.U(sink, this.f65900f, min);
        this.f65900f += min;
        return min;
    }

    @Override // ti.G
    public H timeout() {
        return this.f65895a.timeout();
    }
}
