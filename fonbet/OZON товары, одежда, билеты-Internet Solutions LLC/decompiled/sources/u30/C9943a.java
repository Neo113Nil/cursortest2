package u30;

import f90.InterfaceC6469a;
import kotlin.jvm.internal.Intrinsics;
import n90.InterfaceC8456a;
import org.jetbrains.annotations.NotNull;
import s30.InterfaceC9590a;
import t30.g;
import v30.C10219a;
import y30.InterfaceC10835a;

/* renamed from: u30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9943a implements Y30.a<InterfaceC9590a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10219a f99893a;

    public C9943a(@NotNull C10219a antiFraudConfig) {
        Intrinsics.checkNotNullParameter(antiFraudConfig, "antiFraudConfig");
        this.f99893a = antiFraudConfig;
    }

    @Override // Y30.a
    public final InterfaceC9590a create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        return g.a().a((Y20.a) componentStorage.a(Y20.a.class), (P30.b) componentStorage.a(P30.b.class), (InterfaceC8456a) componentStorage.a(InterfaceC8456a.class), this.f99893a, (O90.a) componentStorage.a(O90.a.class), (InterfaceC10835a) componentStorage.a(InterfaceC10835a.class), (InterfaceC6469a) componentStorage.a(InterfaceC6469a.class), (Z20.a) componentStorage.a(Z20.a.class));
    }
}
