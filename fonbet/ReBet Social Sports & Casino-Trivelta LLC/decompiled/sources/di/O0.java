package di;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class O0 extends AbstractC4090g0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f45317c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(bi.f primitive) {
        super(primitive, null);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f45317c = primitive.h() + "Array";
    }

    @Override // bi.f
    public String h() {
        return this.f45317c;
    }
}
