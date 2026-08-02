package sg;

import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final i f23640c;

    static {
        Intrinsics.checkNotNullParameter(ByteCompanionObject.INSTANCE, "<this>");
        f23640c = new i(j.f23644a);
    }

    @Override // sg.a
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // sg.o, sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        h builder = (h) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte f6 = decoder.f(this.f23716b, i5);
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f23635a;
        int i10 = builder.f23636b;
        builder.f23636b = i10 + 1;
        bArr[i10] = f6;
    }

    @Override // sg.a
    public final Object k(Object obj) {
        byte[] bufferWithData = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        h hVar = new h();
        hVar.f23635a = bufferWithData;
        hVar.f23636b = bufferWithData.length;
        hVar.b(10);
        return hVar;
    }

    @Override // sg.x0
    public final Object n() {
        return new byte[0];
    }

    @Override // sg.x0
    public final void o(ug.s encoder, Object obj, int i5) {
        byte[] content = (byte[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            byte b10 = content[i10];
            encoder.getClass();
            w0 descriptor = this.f23716b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i10);
            encoder.c(b10);
        }
    }
}
