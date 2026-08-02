package di;

import Zh.InterfaceC1901b;
import bi.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class M implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final M f45315a = new M();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45316b = new Q0("kotlin.Float", e.C0441e.f25209a);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.w());
    }

    public void c(ci.f encoder, float f10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.y(f10);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45316b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((Number) obj).floatValue());
    }
}
