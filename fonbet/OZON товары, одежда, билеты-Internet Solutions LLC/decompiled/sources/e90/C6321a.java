package e90;

import We.B;
import We.G;
import We.L;
import b90.C5594a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: e90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6321a implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5594a f62043a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ExternalNetworkSettings f62044b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S30.a f62045c;

    public C6321a(@NotNull C5594a externalOkHttpSettings, @NotNull ExternalNetworkSettings externalNetworkSettings, @NotNull S30.a applicationInfoDataSource) {
        Intrinsics.checkNotNullParameter(externalOkHttpSettings, "externalOkHttpSettings");
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        this.f62043a = externalOkHttpSettings;
        this.f62044b = externalNetworkSettings;
        this.f62045c = applicationInfoDataSource;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a aVar) {
        G.a aVar2 = new G.a(Ek.a.a(aVar, "chain"));
        aVar2.d("x-o3-device-type", "mobile");
        for (Map.Entry<String, String> entry : this.f62043a.a().entrySet()) {
            aVar2.d(entry.getKey(), entry.getValue());
        }
        String provideDeviceStatusHeader = this.f62044b.provideDeviceStatusHeader();
        if (provideDeviceStatusHeader == null) {
            provideDeviceStatusHeader = "";
        }
        aVar2.d("x-device-status", provideDeviceStatusHeader);
        S30.a aVar3 = this.f62045c;
        aVar2.d("x-app-uuid", aVar3.getUniqueApplicationId());
        aVar2.d("x-o3-device-language", aVar3.c());
        return aVar.proceed(aVar2.b());
    }
}
