package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class m1 extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m1 f23659c;

    static {
        Intrinsics.checkNotNullParameter(gf.d0.f10017b, "<this>");
        f23659c = new m1(n1.f23662a);
    }

    @Override // sg.a
    public final int h(Object obj) {
        long[] collectionSize = ((gf.e0) obj).f10020a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // sg.o, sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        l1 builder = (l1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long v5 = decoder.k(this.f23716b, i5).v();
        gf.c0 c0Var = gf.d0.f10017b;
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f23656a;
        int i10 = builder.f23657b;
        builder.f23657b = i10 + 1;
        jArr[i10] = v5;
    }

    @Override // sg.a
    public final Object k(Object obj) {
        long[] bufferWithData = ((gf.e0) obj).f10020a;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        l1 l1Var = new l1();
        l1Var.f23656a = bufferWithData;
        l1Var.f23657b = bufferWithData.length;
        l1Var.b(10);
        return l1Var;
    }

    @Override // sg.x0
    public final Object n() {
        long[] storage = new long[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new gf.e0(storage);
    }

    @Override // sg.x0
    public final void o(ug.s encoder, Object obj, int i5) {
        long[] content = ((gf.e0) obj).f10020a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            ug.s i11 = encoder.i(this.f23716b, i10);
            long j = content[i10];
            gf.c0 c0Var = gf.d0.f10017b;
            i11.l(j);
        }
    }
}
