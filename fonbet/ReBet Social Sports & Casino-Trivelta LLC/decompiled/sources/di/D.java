package di;

import Zh.InterfaceC1901b;
import bi.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes5.dex */
public final class D implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final D f45285a = new D();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45286b = new Q0("kotlin.time.Duration", e.i.f25213a);

    public long b(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Duration.INSTANCE.m1568parseIsoStringUwyO8pc(decoder.E());
    }

    public void c(ci.f encoder, long j10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.H(Duration.m1513toIsoStringimpl(j10));
    }

    @Override // Zh.InterfaceC1900a
    public /* bridge */ /* synthetic */ Object deserialize(ci.e eVar) {
        return Duration.m1473boximpl(b(eVar));
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45286b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((Duration) obj).getRawValue());
    }
}
