package g90;

import kotlin.jvm.internal.Intrinsics;
import y30.InterfaceC10835a;

/* renamed from: g90.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6682c implements Y30.a<InterfaceC6681b> {
    @Override // Y30.a
    public final InterfaceC6681b create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        Z80.a aVar = (Z80.a) componentStorage.a(Z80.a.class);
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        return new C6680a((O90.a) componentStorage.a(O90.a.class), bVar, (Y20.a) componentStorage.a(Y20.a.class), aVar, (InterfaceC10835a) componentStorage.a(InterfaceC10835a.class));
    }
}
