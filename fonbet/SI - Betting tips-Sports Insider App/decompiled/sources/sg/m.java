package sg;

import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class m extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m f23658c;

    static {
        Intrinsics.checkNotNullParameter(CharCompanionObject.INSTANCE, "<this>");
        f23658c = new m(n.f23660a);
    }

    @Override // sg.a
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @Override // sg.o, sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        l builder = (l) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        char e7 = decoder.e(this.f23716b, i5);
        builder.getClass();
        builder.b(builder.d() + 1);
        char[] cArr = builder.f23652a;
        int i10 = builder.f23653b;
        builder.f23653b = i10 + 1;
        cArr[i10] = e7;
    }

    @Override // sg.a
    public final Object k(Object obj) {
        char[] bufferWithData = (char[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        l lVar = new l();
        lVar.f23652a = bufferWithData;
        lVar.f23653b = bufferWithData.length;
        lVar.b(10);
        return lVar;
    }

    @Override // sg.x0
    public final Object n() {
        return new char[0];
    }

    @Override // sg.x0
    public final void o(ug.s encoder, Object obj, int i5) {
        char[] content = (char[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            char c2 = content[i10];
            encoder.getClass();
            w0 descriptor = this.f23716b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i10);
            encoder.d(c2);
        }
    }
}
