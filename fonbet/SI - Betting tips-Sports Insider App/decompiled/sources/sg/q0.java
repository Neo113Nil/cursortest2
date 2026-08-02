package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q0 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public final og.a f23674a;

    /* renamed from: b, reason: collision with root package name */
    public final a1 f23675b;

    public q0(og.a serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f23674a = serializer;
        this.f23675b = new a1(serializer.d());
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder.x()) {
            return decoder.a(this.f23674a);
        }
        return null;
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj != null) {
            encoder.p(this.f23674a, obj);
        } else {
            encoder.m();
        }
    }

    @Override // og.a
    public final qg.g d() {
        return this.f23675b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && q0.class == obj.getClass() && Intrinsics.areEqual(this.f23674a, ((q0) obj).f23674a);
    }

    public final int hashCode() {
        return this.f23674a.hashCode();
    }
}
