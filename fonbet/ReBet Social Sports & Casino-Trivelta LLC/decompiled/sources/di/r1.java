package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r1 extends P0 implements InterfaceC1901b {

    /* renamed from: c, reason: collision with root package name */
    public static final r1 f45409c = new r1();

    public r1() {
        super(AbstractC2028a.x(UShort.INSTANCE));
    }

    public void A(ci.d encoder, short[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.r(getDescriptor(), i11).v(UShortArray.m486getMh2AYeg(content, i11));
        }
    }

    @Override // di.AbstractC4077a
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return w(((UShortArray) obj).getStorage());
    }

    @Override // di.AbstractC4077a
    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return z(((UShortArray) obj).getStorage());
    }

    @Override // di.P0
    public /* bridge */ /* synthetic */ Object s() {
        return UShortArray.m479boximpl(x());
    }

    @Override // di.P0
    public /* bridge */ /* synthetic */ void v(ci.d dVar, Object obj, int i10) {
        A(dVar, ((UShortArray) obj).getStorage(), i10);
    }

    public int w(short[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UShortArray.m487getSizeimpl(collectionSize);
    }

    public short[] x() {
        return UShortArray.m480constructorimpl(0);
    }

    @Override // di.AbstractC4120w, di.AbstractC4077a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(ci.c decoder, int i10, q1 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(UShort.m428constructorimpl(decoder.m(getDescriptor(), i10).v()));
    }

    public q1 z(short[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new q1(toBuilder, null);
    }
}
