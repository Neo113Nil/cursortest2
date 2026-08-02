package v70;

import f40.InterfaceC6422b;
import f90.InterfaceC6469a;
import kotlin.jvm.internal.Intrinsics;
import m40.InterfaceC8077a;
import n90.InterfaceC8456a;
import org.jetbrains.annotations.NotNull;
import s40.InterfaceC9592a;
import x70.C10674a;
import x70.C10675b;
import y30.InterfaceC10835a;

/* renamed from: v70.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10269c implements Y30.a<InterfaceC10268b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10675b f102510a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10674a f102511b;

    public C10269c(@NotNull C10675b onBoardingConfig, @NotNull C10674a disclosureConfig) {
        Intrinsics.checkNotNullParameter(onBoardingConfig, "onBoardingConfig");
        Intrinsics.checkNotNullParameter(disclosureConfig, "disclosureConfig");
        this.f102510a = onBoardingConfig;
        this.f102511b = disclosureConfig;
    }

    @Override // Y30.a
    public final InterfaceC10268b create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        O90.a aVar = (O90.a) componentStorage.a(O90.a.class);
        Y20.a aVar2 = (Y20.a) componentStorage.a(Y20.a.class);
        InterfaceC6422b interfaceC6422b = (InterfaceC6422b) componentStorage.a(InterfaceC6422b.class);
        M80.a aVar3 = (M80.a) componentStorage.a(M80.a.class);
        InterfaceC10835a interfaceC10835a = (InterfaceC10835a) componentStorage.a(InterfaceC10835a.class);
        InterfaceC9592a interfaceC9592a = (InterfaceC9592a) componentStorage.a(InterfaceC9592a.class);
        InterfaceC8456a interfaceC8456a = (InterfaceC8456a) componentStorage.a(InterfaceC8456a.class);
        InterfaceC6469a interfaceC6469a = (InterfaceC6469a) componentStorage.a(InterfaceC6469a.class);
        Z80.a aVar4 = (Z80.a) componentStorage.a(Z80.a.class);
        InterfaceC8077a interfaceC8077a = (InterfaceC8077a) componentStorage.a(InterfaceC8077a.class);
        C10675b c10675b = this.f102510a;
        c10675b.getClass();
        C10674a c10674a = this.f102511b;
        c10674a.getClass();
        return new C10267a(aVar2, bVar, aVar, interfaceC6422b, aVar3, interfaceC10835a, c10675b, interfaceC9592a, interfaceC8456a, interfaceC6469a, aVar4, c10674a, interfaceC8077a);
    }
}
