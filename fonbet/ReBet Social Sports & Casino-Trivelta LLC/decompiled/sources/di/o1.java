package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o1 extends P0 implements InterfaceC1901b {

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f45401c = new o1();

    public o1() {
        super(AbstractC2028a.w(ULong.INSTANCE));
    }

    public void A(ci.d encoder, long[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.r(getDescriptor(), i11).s(ULongArray.m381getsVKNKU(content, i11));
        }
    }

    @Override // di.AbstractC4077a
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return w(((ULongArray) obj).getStorage());
    }

    @Override // di.AbstractC4077a
    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return z(((ULongArray) obj).getStorage());
    }

    @Override // di.P0
    public /* bridge */ /* synthetic */ Object s() {
        return ULongArray.m374boximpl(x());
    }

    @Override // di.P0
    public /* bridge */ /* synthetic */ void v(ci.d dVar, Object obj, int i10) {
        A(dVar, ((ULongArray) obj).getStorage(), i10);
    }

    public int w(long[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return ULongArray.m382getSizeimpl(collectionSize);
    }

    public long[] x() {
        return ULongArray.m375constructorimpl(0);
    }

    @Override // di.AbstractC4120w, di.AbstractC4077a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(ci.c decoder, int i10, n1 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(ULong.m321constructorimpl(decoder.m(getDescriptor(), i10).p()));
    }

    public n1 z(long[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new n1(toBuilder, null);
    }
}
