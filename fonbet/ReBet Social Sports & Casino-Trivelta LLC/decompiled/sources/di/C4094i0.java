package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: di.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4094i0 extends P0 implements InterfaceC1901b {

    /* renamed from: c, reason: collision with root package name */
    public static final C4094i0 f45372c = new C4094i0();

    public C4094i0() {
        super(AbstractC2028a.F(LongCompanionObject.INSTANCE));
    }

    @Override // di.P0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void v(ci.d encoder, long[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.e(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // di.AbstractC4077a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int f(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @Override // di.P0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public long[] s() {
        return new long[0];
    }

    @Override // di.AbstractC4120w, di.AbstractC4077a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(ci.c decoder, int i10, C4092h0 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.g(getDescriptor(), i10));
    }

    @Override // di.AbstractC4077a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C4092h0 l(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new C4092h0(jArr);
    }
}
