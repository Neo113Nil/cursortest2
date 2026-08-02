package Bh;

import java.util.List;
import rh.EnumC6295m;
import rh.InterfaceC6292j;
import yh.AbstractC6897f;

/* loaded from: classes3.dex */
public abstract class y implements Ch.c {
    public static y h(m mVar, List list, List list2, oh.g gVar, int i10, int i11, int i12, Ch.d dVar, String str, long j10, boolean z10) {
        return new c(mVar, list, list2, gVar, i10, i11, i12, dVar, str, j10, z10);
    }

    public abstract int A();

    @Override // Ch.c
    public InterfaceC6292j a() {
        return i().a();
    }

    public abstract oh.g b();

    @Override // Ch.c
    public long e() {
        return i().s();
    }

    @Override // Ch.c
    public long f() {
        return j();
    }

    @Override // Ch.c
    public Ah.c g() {
        return i().r();
    }

    @Override // Ch.c
    public oh.g getAttributes() {
        return b();
    }

    @Override // Ch.c
    public String getName() {
        return u();
    }

    @Override // Ch.c
    public Ch.d getStatus() {
        return x();
    }

    public abstract m i();

    public abstract long j();

    public List k() {
        return v();
    }

    public AbstractC6897f l() {
        return i().o();
    }

    public EnumC6295m m() {
        return i().p();
    }

    public List n() {
        return w();
    }

    public InterfaceC6292j o() {
        return i().q();
    }

    public int p() {
        return y();
    }

    public int q() {
        return z();
    }

    public int r() {
        return A();
    }

    public boolean s() {
        return t();
    }

    public abstract boolean t();

    public final String toString() {
        return "SpanData{spanContext=" + a() + ", parentSpanContext=" + o() + ", resource=" + g() + ", instrumentationScopeInfo=" + l() + ", name=" + getName() + ", kind=" + m() + ", startEpochNanos=" + e() + ", endEpochNanos=" + f() + ", attributes=" + getAttributes() + ", totalAttributeCount=" + p() + ", events=" + k() + ", totalRecordedEvents=" + q() + ", links=" + n() + ", totalRecordedLinks=" + r() + ", status=" + getStatus() + ", hasEnded=" + s() + "}";
    }

    public abstract String u();

    public abstract List v();

    public abstract List w();

    public abstract Ch.d x();

    public abstract int y();

    public abstract int z();
}
