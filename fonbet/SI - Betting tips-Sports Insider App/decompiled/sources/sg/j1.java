package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j1 extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f23648c;

    static {
        Intrinsics.checkNotNullParameter(gf.a0.f10010b, "<this>");
        f23648c = new j1(k1.f23650a);
    }

    @Override // sg.a
    public final int h(Object obj) {
        int[] collectionSize = ((gf.b0) obj).f10012a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // sg.o, sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        i1 builder = (i1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int l6 = decoder.k(this.f23716b, i5).l();
        gf.z zVar = gf.a0.f10010b;
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f23642a;
        int i10 = builder.f23643b;
        builder.f23643b = i10 + 1;
        iArr[i10] = l6;
    }

    @Override // sg.a
    public final Object k(Object obj) {
        int[] bufferWithData = ((gf.b0) obj).f10012a;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        i1 i1Var = new i1();
        i1Var.f23642a = bufferWithData;
        i1Var.f23643b = bufferWithData.length;
        i1Var.b(10);
        return i1Var;
    }

    @Override // sg.x0
    public final Object n() {
        int[] storage = new int[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new gf.b0(storage);
    }

    @Override // sg.x0
    public final void o(ug.s encoder, Object obj, int i5) {
        int[] content = ((gf.b0) obj).f10012a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            ug.s i11 = encoder.i(this.f23716b, i10);
            int i12 = content[i10];
            gf.z zVar = gf.a0.f10010b;
            i11.j(i12);
        }
    }
}
