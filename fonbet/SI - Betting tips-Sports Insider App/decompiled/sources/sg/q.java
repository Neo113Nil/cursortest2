package sg;

import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final q f23673c;

    static {
        Intrinsics.checkNotNullParameter(DoubleCompanionObject.INSTANCE, "<this>");
        f23673c = new q(r.f23678a);
    }

    @Override // sg.a
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @Override // sg.o, sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        p builder = (p) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        double p10 = decoder.p(this.f23716b, i5);
        builder.getClass();
        builder.b(builder.d() + 1);
        double[] dArr = builder.f23668a;
        int i10 = builder.f23669b;
        builder.f23669b = i10 + 1;
        dArr[i10] = p10;
    }

    @Override // sg.a
    public final Object k(Object obj) {
        double[] bufferWithData = (double[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        p pVar = new p();
        pVar.f23668a = bufferWithData;
        pVar.f23669b = bufferWithData.length;
        pVar.b(10);
        return pVar;
    }

    @Override // sg.x0
    public final Object n() {
        return new double[0];
    }

    @Override // sg.x0
    public final void o(ug.s encoder, Object obj, int i5) {
        double[] content = (double[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            double d10 = content[i10];
            encoder.getClass();
            w0 descriptor = this.f23716b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i10);
            encoder.e(d10);
        }
    }
}
