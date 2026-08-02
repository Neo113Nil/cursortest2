package sg;

import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f f23625c;

    static {
        Intrinsics.checkNotNullParameter(BooleanCompanionObject.INSTANCE, "<this>");
        f23625c = new f(g.f23630a);
    }

    @Override // sg.a
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // sg.o, sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        e builder = (e) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean h10 = decoder.h(this.f23716b, i5);
        builder.getClass();
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f23620a;
        int i10 = builder.f23621b;
        builder.f23621b = i10 + 1;
        zArr[i10] = h10;
    }

    @Override // sg.a
    public final Object k(Object obj) {
        boolean[] bufferWithData = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        e eVar = new e();
        eVar.f23620a = bufferWithData;
        eVar.f23621b = bufferWithData.length;
        eVar.b(10);
        return eVar;
    }

    @Override // sg.x0
    public final Object n() {
        return new boolean[0];
    }

    @Override // sg.x0
    public final void o(ug.s encoder, Object obj, int i5) {
        boolean[] content = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            boolean z5 = content[i10];
            encoder.getClass();
            w0 descriptor = this.f23716b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i10);
            encoder.b(z5);
        }
    }
}
