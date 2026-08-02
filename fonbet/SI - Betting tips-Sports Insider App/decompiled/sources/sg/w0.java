package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class w0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f23714b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(qg.g primitive) {
        super(primitive);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f23714b = primitive.a() + "Array";
    }

    @Override // qg.g
    public final String a() {
        return this.f23714b;
    }
}
