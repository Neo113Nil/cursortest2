package ah;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ah.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2020l extends ch.z {
    public C2020l(int i10) {
        super(true, i10);
    }

    @Override // ch.z
    public void n(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        super.n(name);
        C2023o.f16113a.a(name);
    }

    @Override // ch.z
    public void o(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.o(value);
        C2023o.f16113a.b(value);
    }

    public InterfaceC2019k p() {
        return new C2021m(k());
    }

    public /* synthetic */ C2020l(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
