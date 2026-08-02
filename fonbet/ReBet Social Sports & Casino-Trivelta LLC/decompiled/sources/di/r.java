package di;

import Zh.InterfaceC1901b;
import bi.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final r f45407a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45408b = new Q0("kotlin.Char", e.c.f25207a);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Character deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.A());
    }

    public void c(ci.f encoder, char c10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.z(c10);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45408b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((Character) obj).charValue());
    }
}
