package g80;

import b40.InterfaceC5539a;
import f40.InterfaceC6422b;
import f90.InterfaceC6469a;
import kotlin.jvm.internal.Intrinsics;
import m40.InterfaceC8077a;
import n90.InterfaceC8456a;
import oa0.InterfaceC8681a;
import org.jetbrains.annotations.NotNull;
import s30.InterfaceC9590a;
import x70.C10675b;
import y30.InterfaceC10835a;

/* loaded from: classes3.dex */
public final class c implements Y30.a<b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10675b f64086a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC5539a f64087b;

    public c(@NotNull C10675b onBoardingConfig, @NotNull InterfaceC5539a esiaApi) {
        Intrinsics.checkNotNullParameter(onBoardingConfig, "onBoardingConfig");
        Intrinsics.checkNotNullParameter(esiaApi, "esiaApi");
        this.f64086a = onBoardingConfig;
        this.f64087b = esiaApi;
    }

    @Override // Y30.a
    public final b create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        Y20.a aVar = (Y20.a) componentStorage.a(Y20.a.class);
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        InterfaceC6422b interfaceC6422b = (InterfaceC6422b) componentStorage.a(InterfaceC6422b.class);
        InterfaceC10835a interfaceC10835a = (InterfaceC10835a) componentStorage.a(InterfaceC10835a.class);
        InterfaceC8077a interfaceC8077a = (InterfaceC8077a) componentStorage.a(InterfaceC8077a.class);
        O90.a aVar2 = (O90.a) componentStorage.a(O90.a.class);
        M80.a aVar3 = (M80.a) componentStorage.a(M80.a.class);
        Z80.a aVar4 = (Z80.a) componentStorage.a(Z80.a.class);
        InterfaceC8681a interfaceC8681a = (InterfaceC8681a) componentStorage.a(InterfaceC8681a.class);
        InterfaceC9590a interfaceC9590a = (InterfaceC9590a) componentStorage.a(InterfaceC9590a.class);
        I40.a aVar5 = (I40.a) componentStorage.a(I40.a.class);
        InterfaceC8456a interfaceC8456a = (InterfaceC8456a) componentStorage.a(InterfaceC8456a.class);
        InterfaceC6469a interfaceC6469a = (InterfaceC6469a) componentStorage.a(InterfaceC6469a.class);
        Q60.a aVar6 = (Q60.a) componentStorage.a(Q60.a.class);
        U60.a aVar7 = (U60.a) componentStorage.a(U60.a.class);
        C10675b c10675b = this.f64086a;
        c10675b.getClass();
        InterfaceC5539a interfaceC5539a = this.f64087b;
        interfaceC5539a.getClass();
        return new C6661a(aVar, bVar, interfaceC6422b, interfaceC10835a, interfaceC8077a, aVar2, aVar3, aVar5, aVar4, c10675b, interfaceC8681a, interfaceC9590a, interfaceC8456a, interfaceC6469a, aVar6, interfaceC5539a, aVar7);
    }
}
