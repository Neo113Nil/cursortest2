package di;

import Zh.InterfaceC1901b;
import bi.e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4099l implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4099l f45383a = new C4099l();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45384b = new Q0("kotlin.Byte", e.b.f25206a);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.I());
    }

    public void c(ci.f encoder, byte b10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(b10);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45384b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((Number) obj).byteValue());
    }
}
