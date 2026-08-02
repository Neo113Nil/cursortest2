package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j1 implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f45377a = new j1();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45378b = U.a("kotlin.UByte", AbstractC2028a.A(ByteCompanionObject.INSTANCE));

    public byte b(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UByte.m165constructorimpl(decoder.y(getDescriptor()).I());
    }

    public void c(ci.f encoder, byte b10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.t(getDescriptor()).h(b10);
    }

    @Override // Zh.InterfaceC1900a
    public /* bridge */ /* synthetic */ Object deserialize(ci.e eVar) {
        return UByte.m159boximpl(b(eVar));
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45378b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((UByte) obj).getData());
    }
}
