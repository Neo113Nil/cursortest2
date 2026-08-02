package kh;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lh.C5466a;

/* loaded from: classes3.dex */
public final class k extends r {
    public /* synthetic */ k(mh.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C5466a.f55859j.c() : fVar);
    }

    @Override // kh.r
    public final void D0(ByteBuffer source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
    }

    @Override // java.lang.Appendable
    /* renamed from: e2, reason: merged with bridge method [inline-methods] */
    public k append(char c10) {
        r k10 = super.k(c10);
        Intrinsics.checkNotNull(k10, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (k) k10;
    }

    @Override // java.lang.Appendable
    /* renamed from: f2, reason: merged with bridge method [inline-methods] */
    public k append(CharSequence charSequence) {
        r r10 = super.r(charSequence);
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (k) r10;
    }

    @Override // java.lang.Appendable
    /* renamed from: g2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public k append(CharSequence charSequence, int i10, int i11) {
        r append = super.append(charSequence, i10, i11);
        Intrinsics.checkNotNull(append, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (k) append;
    }

    public final l h2() {
        int i22 = i2();
        C5466a d22 = d2();
        return d22 == null ? l.f54499i.a() : new l(d22, i22, n1());
    }

    public final int i2() {
        return Z1();
    }

    public String toString() {
        return "BytePacketBuilder(" + i2() + " bytes written)";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(mh.f pool) {
        super(pool);
        Intrinsics.checkNotNullParameter(pool, "pool");
    }

    @Override // kh.r
    public final void A0() {
    }
}
