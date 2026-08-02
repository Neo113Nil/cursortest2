package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes5.dex */
public final class p1 implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f45403a = new p1();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45404b = U.a("kotlin.ULong", AbstractC2028a.F(LongCompanionObject.INSTANCE));

    public long b(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return ULong.m321constructorimpl(decoder.y(getDescriptor()).p());
    }

    public void c(ci.f encoder, long j10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.t(getDescriptor()).s(j10);
    }

    @Override // Zh.InterfaceC1900a
    public /* bridge */ /* synthetic */ Object deserialize(ci.e eVar) {
        return ULong.m315boximpl(b(eVar));
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45404b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((ULong) obj).getData());
    }
}
