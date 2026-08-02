package fi;

import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends C4298n {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f46781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC4306w writer, boolean z10) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f46781c = z10;
    }

    @Override // fi.C4298n
    public void e(byte b10) {
        boolean z10 = this.f46781c;
        String m209toStringimpl = UByte.m209toStringimpl(UByte.m165constructorimpl(b10));
        if (z10) {
            n(m209toStringimpl);
        } else {
            k(m209toStringimpl);
        }
    }

    @Override // fi.C4298n
    public void i(int i10) {
        boolean z10 = this.f46781c;
        String a10 = AbstractC4290f.a(UInt.m242constructorimpl(i10));
        if (z10) {
            n(a10);
        } else {
            k(a10);
        }
    }

    @Override // fi.C4298n
    public void j(long j10) {
        String a10;
        String a11;
        boolean z10 = this.f46781c;
        long m321constructorimpl = ULong.m321constructorimpl(j10);
        if (z10) {
            a11 = AbstractC4292h.a(m321constructorimpl, 10);
            n(a11);
        } else {
            a10 = AbstractC4292h.a(m321constructorimpl, 10);
            k(a10);
        }
    }

    @Override // fi.C4298n
    public void l(short s10) {
        boolean z10 = this.f46781c;
        String m472toStringimpl = UShort.m472toStringimpl(UShort.m428constructorimpl(s10));
        if (z10) {
            n(m472toStringimpl);
        } else {
            k(m472toStringimpl);
        }
    }
}
