package di;

import Zh.InterfaceC1901b;
import bi.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Y implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f45337a = new Y();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45338b = new Q0("kotlin.Int", e.f.f25210a);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.k());
    }

    public void c(ci.f encoder, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.E(i10);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45338b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((Number) obj).intValue());
    }
}
