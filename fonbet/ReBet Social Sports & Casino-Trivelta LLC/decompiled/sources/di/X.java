package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class X extends P0 implements InterfaceC1901b {

    /* renamed from: c, reason: collision with root package name */
    public static final X f45335c = new X();

    public X() {
        super(AbstractC2028a.E(IntCompanionObject.INSTANCE));
    }

    @Override // di.P0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void v(ci.d encoder, int[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.f(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // di.AbstractC4077a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int f(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // di.P0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int[] s() {
        return new int[0];
    }

    @Override // di.AbstractC4120w, di.AbstractC4077a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(ci.c decoder, int i10, W builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.F(getDescriptor(), i10));
    }

    @Override // di.AbstractC4077a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public W l(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new W(iArr);
    }
}
