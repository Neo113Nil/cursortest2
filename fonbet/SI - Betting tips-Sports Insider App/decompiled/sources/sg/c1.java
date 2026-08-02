package sg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c1 extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c1 f23614c;

    static {
        Intrinsics.checkNotNullParameter(ShortCompanionObject.INSTANCE, "<this>");
        f23614c = new c1(d1.f23618a);
    }

    @Override // sg.a
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @Override // sg.o, sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        b1 builder = (b1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short t3 = decoder.t(this.f23716b, i5);
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f23610a;
        int i10 = builder.f23611b;
        builder.f23611b = i10 + 1;
        sArr[i10] = t3;
    }

    @Override // sg.a
    public final Object k(Object obj) {
        short[] bufferWithData = (short[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        b1 b1Var = new b1();
        b1Var.f23610a = bufferWithData;
        b1Var.f23611b = bufferWithData.length;
        b1Var.b(10);
        return b1Var;
    }

    @Override // sg.x0
    public final Object n() {
        return new short[0];
    }

    @Override // sg.x0
    public final void o(ug.s encoder, Object obj, int i5) {
        short[] content = (short[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            short s8 = content[i10];
            encoder.getClass();
            w0 descriptor = this.f23716b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i10);
            encoder.q(s8);
        }
    }
}
