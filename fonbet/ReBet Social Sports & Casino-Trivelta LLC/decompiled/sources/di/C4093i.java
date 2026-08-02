package di;

import Zh.InterfaceC1901b;
import bi.e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4093i implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4093i f45370a = new C4093i();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45371b = new Q0("kotlin.Boolean", e.a.f25205a);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.z());
    }

    public void c(ci.f encoder, boolean z10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.w(z10);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45371b;
    }

    @Override // Zh.p
    public /* bridge */ /* synthetic */ void serialize(ci.f fVar, Object obj) {
        c(fVar, ((Boolean) obj).booleanValue());
    }
}
