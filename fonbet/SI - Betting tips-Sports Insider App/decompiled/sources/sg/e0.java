package sg;

import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e0 extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f23622c;

    static {
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "<this>");
        f23622c = new e0(f0.f23626a);
    }

    @Override // sg.a
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // sg.o, sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        d0 builder = (d0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int m6 = decoder.m(this.f23716b, i5);
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f23616a;
        int i10 = builder.f23617b;
        builder.f23617b = i10 + 1;
        iArr[i10] = m6;
    }

    @Override // sg.a
    public final Object k(Object obj) {
        int[] bufferWithData = (int[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        d0 d0Var = new d0();
        d0Var.f23616a = bufferWithData;
        d0Var.f23617b = bufferWithData.length;
        d0Var.b(10);
        return d0Var;
    }

    @Override // sg.x0
    public final Object n() {
        return new int[0];
    }

    @Override // sg.x0
    public final void o(ug.s encoder, Object obj, int i5) {
        int[] content = (int[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.k(i10, content[i10], this.f23716b);
        }
    }
}
