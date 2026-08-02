package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m1 implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f45394a = new m1();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45395b = U.a("kotlin.UInt", AbstractC2028a.E(IntCompanionObject.INSTANCE));

    public int b(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UInt.m242constructorimpl(decoder.y(getDescriptor()).k());
    }

    public void c(ci.f encoder, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.t(getDescriptor()).E(i10);
    }

    @Override // Zh.InterfaceC1900a
    public /* bridge */ /* synthetic */ Object deserialize(ci.e eVar) {
        return UInt.m236boximpl(b(eVar));
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45395b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((UInt) obj).getData());
    }
}
