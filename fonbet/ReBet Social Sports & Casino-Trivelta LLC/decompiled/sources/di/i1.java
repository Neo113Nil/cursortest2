package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i1 extends P0 implements InterfaceC1901b {

    /* renamed from: c, reason: collision with root package name */
    public static final i1 f45373c = new i1();

    public i1() {
        super(AbstractC2028a.u(UByte.INSTANCE));
    }

    public void A(ci.d encoder, byte[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.r(getDescriptor(), i11).h(UByteArray.m223getw2LRezQ(content, i11));
        }
    }

    @Override // di.AbstractC4077a
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return w(((UByteArray) obj).getStorage());
    }

    @Override // di.AbstractC4077a
    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return z(((UByteArray) obj).getStorage());
    }

    @Override // di.P0
    public /* bridge */ /* synthetic */ Object s() {
        return UByteArray.m216boximpl(x());
    }

    @Override // di.P0
    public /* bridge */ /* synthetic */ void v(ci.d dVar, Object obj, int i10) {
        A(dVar, ((UByteArray) obj).getStorage(), i10);
    }

    public int w(byte[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UByteArray.m224getSizeimpl(collectionSize);
    }

    public byte[] x() {
        return UByteArray.m217constructorimpl(0);
    }

    @Override // di.AbstractC4120w, di.AbstractC4077a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(ci.c decoder, int i10, h1 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(UByte.m165constructorimpl(decoder.m(getDescriptor(), i10).I()));
    }

    public h1 z(byte[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new h1(toBuilder, null);
    }
}
