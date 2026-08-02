package di;

import Zh.InterfaceC1901b;
import bi.e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4096j0 implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4096j0 f45375a = new C4096j0();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45376b = new Q0("kotlin.Long", e.g.f25211a);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Long deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.p());
    }

    public void c(ci.f encoder, long j10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.s(j10);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45376b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((Number) obj).longValue());
    }
}
