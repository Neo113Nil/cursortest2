package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;

/* loaded from: classes5.dex */
public final class s1 implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f45412a = new s1();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45413b = U.a("kotlin.UShort", AbstractC2028a.G(ShortCompanionObject.INSTANCE));

    public short b(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UShort.m428constructorimpl(decoder.y(getDescriptor()).v());
    }

    public void c(ci.f encoder, short s10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.t(getDescriptor()).v(s10);
    }

    @Override // Zh.InterfaceC1900a
    public /* bridge */ /* synthetic */ Object deserialize(ci.e eVar) {
        return UShort.m422boximpl(b(eVar));
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45413b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((UShort) obj).getData());
    }
}
