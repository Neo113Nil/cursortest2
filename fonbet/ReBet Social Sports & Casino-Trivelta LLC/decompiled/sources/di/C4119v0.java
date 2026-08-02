package di;

import Zh.InterfaceC1901b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4119v0 implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1901b f45429a;

    /* renamed from: b, reason: collision with root package name */
    public final bi.f f45430b;

    public C4119v0(InterfaceC1901b serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f45429a = serializer;
        this.f45430b = new T0(serializer.getDescriptor());
    }

    @Override // Zh.InterfaceC1900a
    public Object deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.G() ? decoder.H(this.f45429a) : decoder.n();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4119v0.class == obj.getClass() && Intrinsics.areEqual(this.f45429a, ((C4119v0) obj).f45429a);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return this.f45430b;
    }

    public int hashCode() {
        return this.f45429a.hashCode();
    }

    @Override // Zh.p
    public void serialize(ci.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj == null) {
            encoder.u();
        } else {
            encoder.A();
            encoder.i(this.f45429a, obj);
        }
    }
}
