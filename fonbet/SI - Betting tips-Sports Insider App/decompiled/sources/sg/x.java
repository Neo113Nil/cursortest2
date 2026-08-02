package sg;

import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class x extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x f23715c;

    static {
        Intrinsics.checkNotNullParameter(FloatCompanionObject.INSTANCE, "<this>");
        f23715c = new x(y.f23717a);
    }

    @Override // sg.a
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // sg.o, sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        w builder = (w) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        float q = decoder.q(this.f23716b, i5);
        builder.getClass();
        builder.b(builder.d() + 1);
        float[] fArr = builder.f23712a;
        int i10 = builder.f23713b;
        builder.f23713b = i10 + 1;
        fArr[i10] = q;
    }

    @Override // sg.a
    public final Object k(Object obj) {
        float[] bufferWithData = (float[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        w wVar = new w();
        wVar.f23712a = bufferWithData;
        wVar.f23713b = bufferWithData.length;
        wVar.b(10);
        return wVar;
    }

    @Override // sg.x0
    public final Object n() {
        return new float[0];
    }

    @Override // sg.x0
    public final void o(ug.s encoder, Object obj, int i5) {
        float[] content = (float[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            float f6 = content[i10];
            encoder.getClass();
            w0 descriptor = this.f23716b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i10);
            encoder.g(f6);
        }
    }
}
