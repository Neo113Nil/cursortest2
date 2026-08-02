package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 extends P0 implements InterfaceC1901b {

    /* renamed from: c, reason: collision with root package name */
    public static final l1 f45388c = new l1();

    public l1() {
        super(AbstractC2028a.v(UInt.INSTANCE));
    }

    public void A(ci.d encoder, int[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.r(getDescriptor(), i11).E(UIntArray.m302getpVg5ArA(content, i11));
        }
    }

    @Override // di.AbstractC4077a
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return w(((UIntArray) obj).getStorage());
    }

    @Override // di.AbstractC4077a
    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return z(((UIntArray) obj).getStorage());
    }

    @Override // di.P0
    public /* bridge */ /* synthetic */ Object s() {
        return UIntArray.m295boximpl(x());
    }

    @Override // di.P0
    public /* bridge */ /* synthetic */ void v(ci.d dVar, Object obj, int i10) {
        A(dVar, ((UIntArray) obj).getStorage(), i10);
    }

    public int w(int[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UIntArray.m303getSizeimpl(collectionSize);
    }

    public int[] x() {
        return UIntArray.m296constructorimpl(0);
    }

    @Override // di.AbstractC4120w, di.AbstractC4077a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(ci.c decoder, int i10, k1 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(UInt.m242constructorimpl(decoder.m(getDescriptor(), i10).k()));
    }

    public k1 z(int[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new k1(toBuilder, null);
    }
}
