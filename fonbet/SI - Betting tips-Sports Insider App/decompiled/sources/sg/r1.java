package sg;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class r1 implements og.a {

    /* renamed from: b, reason: collision with root package name */
    public static final r1 f23683b = new r1();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f23684a = new r0(Unit.f19194a);

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f23684a.a(decoder);
        return Unit.f19194a;
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        Unit value = (Unit) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23684a.c(encoder, value);
    }

    @Override // og.a
    public final qg.g d() {
        return this.f23684a.d();
    }
}
