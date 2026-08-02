package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4076B extends P0 implements InterfaceC1901b {

    /* renamed from: c, reason: collision with root package name */
    public static final C4076B f45281c = new C4076B();

    public C4076B() {
        super(AbstractC2028a.C(DoubleCompanionObject.INSTANCE));
    }

    @Override // di.P0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void v(ci.d encoder, double[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.k(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // di.AbstractC4077a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int f(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @Override // di.P0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public double[] s() {
        return new double[0];
    }

    @Override // di.AbstractC4120w, di.AbstractC4077a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(ci.c decoder, int i10, C4075A builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.B(getDescriptor(), i10));
    }

    @Override // di.AbstractC4077a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C4075A l(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new C4075A(dArr);
    }
}
