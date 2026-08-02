package w90;

import f40.InterfaceC6422b;
import f90.InterfaceC6469a;
import kotlin.jvm.internal.Intrinsics;
import m40.InterfaceC8077a;
import n90.InterfaceC8456a;
import org.jetbrains.annotations.NotNull;
import s30.InterfaceC9590a;
import y30.InterfaceC10835a;

/* loaded from: classes3.dex */
public final class c implements Y30.a<b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Z30.a f103689a;

    public c(@NotNull Z30.a digRoubleApi) {
        Intrinsics.checkNotNullParameter(digRoubleApi, "digRoubleApi");
        this.f103689a = digRoubleApi;
    }

    @Override // Y30.a
    public final b create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        InterfaceC10835a interfaceC10835a = (InterfaceC10835a) componentStorage.a(InterfaceC10835a.class);
        O90.a aVar = (O90.a) componentStorage.a(O90.a.class);
        M80.a aVar2 = (M80.a) componentStorage.a(M80.a.class);
        InterfaceC6469a interfaceC6469a = (InterfaceC6469a) componentStorage.a(InterfaceC6469a.class);
        I40.a aVar3 = (I40.a) componentStorage.a(I40.a.class);
        InterfaceC8456a interfaceC8456a = (InterfaceC8456a) componentStorage.a(InterfaceC8456a.class);
        InterfaceC6422b interfaceC6422b = (InterfaceC6422b) componentStorage.a(InterfaceC6422b.class);
        Z80.a aVar4 = (Z80.a) componentStorage.a(Z80.a.class);
        T70.a aVar5 = (T70.a) componentStorage.a(T70.a.class);
        N60.a aVar6 = (N60.a) componentStorage.a(N60.a.class);
        Y20.a aVar7 = (Y20.a) componentStorage.a(Y20.a.class);
        InterfaceC8077a interfaceC8077a = (InterfaceC8077a) componentStorage.a(InterfaceC8077a.class);
        InterfaceC9590a interfaceC9590a = (InterfaceC9590a) componentStorage.a(InterfaceC9590a.class);
        Z30.a aVar8 = this.f103689a;
        aVar8.getClass();
        return new C10450a(interfaceC10835a, bVar, aVar2, aVar, interfaceC6469a, aVar3, interfaceC8456a, aVar5, aVar6, interfaceC6422b, aVar4, aVar7, interfaceC8077a, interfaceC9590a, aVar8);
    }
}
