package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p1 extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final p1 f23672c;

    static {
        Intrinsics.checkNotNullParameter(gf.h0.f10022b, "<this>");
        f23672c = new p1(q1.f23676a);
    }

    @Override // sg.a
    public final int h(Object obj) {
        short[] collectionSize = ((gf.i0) obj).f10024a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // sg.o, sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        o1 builder = (o1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short C = decoder.k(this.f23716b, i5).C();
        gf.g0 g0Var = gf.h0.f10022b;
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f23666a;
        int i10 = builder.f23667b;
        builder.f23667b = i10 + 1;
        sArr[i10] = C;
    }

    @Override // sg.a
    public final Object k(Object obj) {
        short[] bufferWithData = ((gf.i0) obj).f10024a;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        o1 o1Var = new o1();
        o1Var.f23666a = bufferWithData;
        o1Var.f23667b = bufferWithData.length;
        o1Var.b(10);
        return o1Var;
    }

    @Override // sg.x0
    public final Object n() {
        short[] storage = new short[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new gf.i0(storage);
    }

    @Override // sg.x0
    public final void o(ug.s encoder, Object obj, int i5) {
        short[] content = ((gf.i0) obj).f10024a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            ug.s i11 = encoder.i(this.f23716b, i10);
            short s8 = content[i10];
            gf.g0 g0Var = gf.h0.f10022b;
            i11.q(s8);
        }
    }
}
