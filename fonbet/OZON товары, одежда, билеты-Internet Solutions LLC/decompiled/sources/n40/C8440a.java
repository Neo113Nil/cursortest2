package n40;

import f40.InterfaceC6422b;
import kotlin.jvm.internal.Intrinsics;
import l90.C7901a;
import m40.InterfaceC8077a;
import org.jetbrains.annotations.NotNull;

/* renamed from: n40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8440a implements Y30.a<InterfaceC8077a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7901a f76481a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C80.a f76482b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final N90.a f76483c;

    public C8440a(@NotNull C7901a ozonInAppUpdateInteractor, @NotNull C80.a googleInAppUpdateInteractor, @NotNull N90.a ruStoreAppUpdateInteractor) {
        Intrinsics.checkNotNullParameter(ozonInAppUpdateInteractor, "ozonInAppUpdateInteractor");
        Intrinsics.checkNotNullParameter(googleInAppUpdateInteractor, "googleInAppUpdateInteractor");
        Intrinsics.checkNotNullParameter(ruStoreAppUpdateInteractor, "ruStoreAppUpdateInteractor");
        this.f76481a = ozonInAppUpdateInteractor;
        this.f76482b = googleInAppUpdateInteractor;
        this.f76483c = ruStoreAppUpdateInteractor;
    }

    @Override // Y30.a
    public final InterfaceC8077a create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        I40.a aVar = (I40.a) componentStorage.a(I40.a.class);
        O90.a aVar2 = (O90.a) componentStorage.a(O90.a.class);
        Y20.a aVar3 = (Y20.a) componentStorage.a(Y20.a.class);
        InterfaceC6422b interfaceC6422b = (InterfaceC6422b) componentStorage.a(InterfaceC6422b.class);
        C7901a c7901a = this.f76481a;
        c7901a.getClass();
        C80.a aVar4 = this.f76482b;
        aVar4.getClass();
        N90.a aVar5 = this.f76483c;
        aVar5.getClass();
        return new c(bVar, aVar, c7901a, aVar2, aVar3, interfaceC6422b, aVar5, aVar4);
    }
}
