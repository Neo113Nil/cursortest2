package di;

import Zh.InterfaceC1901b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t1 implements InterfaceC1901b {

    /* renamed from: b, reason: collision with root package name */
    public static final t1 f45421b = new t1();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4125y0 f45422a = new C4125y0("kotlin.Unit", Unit.INSTANCE);

    public void b(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f45422a.deserialize(decoder);
    }

    @Override // Zh.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(ci.f encoder, Unit value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f45422a.serialize(encoder, value);
    }

    @Override // Zh.InterfaceC1900a
    public /* bridge */ /* synthetic */ Object deserialize(ci.e eVar) {
        b(eVar);
        return Unit.INSTANCE;
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return this.f45422a.getDescriptor();
    }
}
