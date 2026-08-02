package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class L extends P0 implements InterfaceC1901b {

    /* renamed from: c, reason: collision with root package name */
    public static final L f45314c = new L();

    public L() {
        super(AbstractC2028a.D(FloatCompanionObject.INSTANCE));
    }

    @Override // di.P0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void v(ci.d encoder, float[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.p(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // di.AbstractC4077a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int f(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // di.P0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public float[] s() {
        return new float[0];
    }

    @Override // di.AbstractC4120w, di.AbstractC4077a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(ci.c decoder, int i10, K builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.o(getDescriptor(), i10));
    }

    @Override // di.AbstractC4077a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public K l(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new K(fArr);
    }
}
