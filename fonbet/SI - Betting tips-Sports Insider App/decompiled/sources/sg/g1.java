package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g1 extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g1 f23634c;

    static {
        Intrinsics.checkNotNullParameter(gf.w.f10042b, "<this>");
        f23634c = new g1(h1.f23638a);
    }

    @Override // sg.a
    public final int h(Object obj) {
        byte[] collectionSize = ((gf.y) obj).f10047a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // sg.o, sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        f1 builder = (f1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte B = decoder.k(this.f23716b, i5).B();
        gf.v vVar = gf.w.f10042b;
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f23628a;
        int i10 = builder.f23629b;
        builder.f23629b = i10 + 1;
        bArr[i10] = B;
    }

    @Override // sg.a
    public final Object k(Object obj) {
        byte[] bufferWithData = ((gf.y) obj).f10047a;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        f1 f1Var = new f1();
        f1Var.f23628a = bufferWithData;
        f1Var.f23629b = bufferWithData.length;
        f1Var.b(10);
        return f1Var;
    }

    @Override // sg.x0
    public final Object n() {
        byte[] storage = new byte[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new gf.y(storage);
    }

    @Override // sg.x0
    public final void o(ug.s encoder, Object obj, int i5) {
        byte[] content = ((gf.y) obj).f10047a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            ug.s i11 = encoder.i(this.f23716b, i10);
            byte b10 = content[i10];
            gf.v vVar = gf.w.f10042b;
            i11.c(b10);
        }
    }
}
