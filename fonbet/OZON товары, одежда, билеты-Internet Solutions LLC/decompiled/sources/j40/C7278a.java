package j40;

import i40.InterfaceC7007a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: j40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7278a implements Y30.a<InterfaceC7007a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M90.a f69429a;

    public C7278a(@NotNull M90.a ruStoreReviewInteractor) {
        Intrinsics.checkNotNullParameter(ruStoreReviewInteractor, "ruStoreReviewInteractor");
        this.f69429a = ruStoreReviewInteractor;
    }

    @Override // Y30.a
    public final InterfaceC7007a create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        O90.a aVar = (O90.a) componentStorage.a(O90.a.class);
        Y20.a aVar2 = (Y20.a) componentStorage.a(Y20.a.class);
        M80.a aVar3 = (M80.a) componentStorage.a(M80.a.class);
        M90.a aVar4 = this.f69429a;
        aVar4.getClass();
        return new C7282e(aVar2, bVar, aVar, aVar3, aVar4);
    }
}
