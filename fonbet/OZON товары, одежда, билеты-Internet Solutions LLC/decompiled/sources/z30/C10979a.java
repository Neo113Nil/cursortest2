package z30;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;
import y30.InterfaceC10835a;

/* renamed from: z30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10979a implements Y30.a<InterfaceC10835a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ExternalFintechAuth f107203a;

    public C10979a(@NotNull ExternalFintechAuth externalFintechAuth) {
        Intrinsics.checkNotNullParameter(externalFintechAuth, "externalFintechAuth");
        this.f107203a = externalFintechAuth;
    }

    @Override // Y30.a
    public final InterfaceC10835a create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        O90.a aVar = (O90.a) componentStorage.a(O90.a.class);
        Z80.a aVar2 = (Z80.a) componentStorage.a(Z80.a.class);
        M80.a aVar3 = (M80.a) componentStorage.a(M80.a.class);
        Y20.a aVar4 = (Y20.a) componentStorage.a(Y20.a.class);
        ExternalFintechAuth externalFintechAuth = this.f107203a;
        externalFintechAuth.getClass();
        return new j(aVar4, bVar, aVar, aVar2, aVar3, externalFintechAuth);
    }
}
