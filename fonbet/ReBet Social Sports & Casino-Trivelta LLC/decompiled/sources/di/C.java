package di;

import Zh.InterfaceC1901b;
import bi.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class C implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final C f45283a = new C();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45284b = new Q0("kotlin.Double", e.d.f25208a);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.x());
    }

    public void c(ci.f encoder, double d10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.g(d10);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45284b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((Number) obj).doubleValue());
    }
}
