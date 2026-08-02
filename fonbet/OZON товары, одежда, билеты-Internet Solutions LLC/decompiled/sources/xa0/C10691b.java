package xa0;

import kotlin.jvm.internal.Intrinsics;
import s30.InterfaceC9590a;
import wa0.InterfaceC10467a;
import y30.InterfaceC10835a;

/* renamed from: xa0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10691b implements Y30.a<InterfaceC10467a> {
    @Override // Y30.a
    public final InterfaceC10467a create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        Y20.a aVar = (Y20.a) componentStorage.a(Y20.a.class);
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        return new C10690a(aVar, bVar, (Z80.a) componentStorage.a(Z80.a.class), (O90.a) componentStorage.a(O90.a.class), (InterfaceC10835a) componentStorage.a(InterfaceC10835a.class), (InterfaceC9590a) componentStorage.a(InterfaceC9590a.class));
    }
}
