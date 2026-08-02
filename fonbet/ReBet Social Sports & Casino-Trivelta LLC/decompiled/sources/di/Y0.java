package di;

import Zh.InterfaceC1901b;
import bi.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Y0 implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final Y0 f45339a = new Y0();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45340b = new Q0("kotlin.Short", e.h.f25212a);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Short deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.v());
    }

    public void c(ci.f encoder, short s10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.v(s10);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45340b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((Number) obj).shortValue());
    }
}
