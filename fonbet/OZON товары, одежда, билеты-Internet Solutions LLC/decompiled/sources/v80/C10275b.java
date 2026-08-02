package v80;

import f40.InterfaceC6422b;
import f90.InterfaceC6469a;
import kotlin.jvm.internal.Intrinsics;
import n90.InterfaceC8456a;
import org.jetbrains.annotations.NotNull;
import s30.InterfaceC9590a;
import y30.InterfaceC10835a;

/* renamed from: v80.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10275b implements Y30.a<X30.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Z30.a f102559a;

    public C10275b(@NotNull Z30.a digRoubleApi) {
        Intrinsics.checkNotNullParameter(digRoubleApi, "digRoubleApi");
        this.f102559a = digRoubleApi;
    }

    @Override // Y30.a
    @NotNull
    public final X30.a create(@NotNull Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        Y20.a aVar = (Y20.a) componentStorage.a(Y20.a.class);
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        M80.a aVar2 = (M80.a) componentStorage.a(M80.a.class);
        O90.a aVar3 = (O90.a) componentStorage.a(O90.a.class);
        InterfaceC10835a interfaceC10835a = (InterfaceC10835a) componentStorage.a(InterfaceC10835a.class);
        InterfaceC6422b interfaceC6422b = (InterfaceC6422b) componentStorage.a(InterfaceC6422b.class);
        I40.a aVar4 = (I40.a) componentStorage.a(I40.a.class);
        InterfaceC6469a interfaceC6469a = (InterfaceC6469a) componentStorage.a(InterfaceC6469a.class);
        InterfaceC8456a interfaceC8456a = (InterfaceC8456a) componentStorage.a(InterfaceC8456a.class);
        Q50.a aVar5 = (Q50.a) componentStorage.a(Q50.a.class);
        InterfaceC9590a interfaceC9590a = (InterfaceC9590a) componentStorage.a(InterfaceC9590a.class);
        U60.a aVar6 = (U60.a) componentStorage.a(U60.a.class);
        Q60.a aVar7 = (Q60.a) componentStorage.a(Q60.a.class);
        Z30.a aVar8 = this.f102559a;
        aVar8.getClass();
        return new C10274a(aVar, bVar, aVar2, aVar3, interfaceC10835a, interfaceC6422b, aVar4, interfaceC6469a, interfaceC8456a, aVar5, interfaceC9590a, aVar8, aVar6, aVar7);
    }
}
