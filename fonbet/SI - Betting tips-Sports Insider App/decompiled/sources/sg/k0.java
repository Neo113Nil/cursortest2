package sg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k0 extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f23649c;

    static {
        Intrinsics.checkNotNullParameter(LongCompanionObject.INSTANCE, "<this>");
        f23649c = new k0(l0.f23654a);
    }

    @Override // sg.a
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @Override // sg.o, sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        j0 builder = (j0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long b10 = decoder.b(this.f23716b, i5);
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f23646a;
        int i10 = builder.f23647b;
        builder.f23647b = i10 + 1;
        jArr[i10] = b10;
    }

    @Override // sg.a
    public final Object k(Object obj) {
        long[] bufferWithData = (long[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        j0 j0Var = new j0();
        j0Var.f23646a = bufferWithData;
        j0Var.f23647b = bufferWithData.length;
        j0Var.b(10);
        return j0Var;
    }

    @Override // sg.x0
    public final Object n() {
        return new long[0];
    }

    @Override // sg.x0
    public final void o(ug.s encoder, Object obj, int i5) {
        long[] content = (long[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            long j = content[i10];
            encoder.getClass();
            w0 descriptor = this.f23716b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i10);
            encoder.l(j);
        }
    }
}
