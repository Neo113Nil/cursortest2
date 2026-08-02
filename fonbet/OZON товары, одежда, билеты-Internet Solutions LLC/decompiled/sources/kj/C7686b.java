package kj;

import We.A;
import We.E;
import We.InterfaceC4875q;
import com.squareup.moshi.Moshi;
import ej.C6375d;
import ej.InterfaceC6374c;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import nf.C8588a;
import org.jetbrains.annotations.NotNull;
import pj.C8938a;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.android.inAppUpdate.internal.network.CheckUpdateApiV1;
import ru.ozon.android.inAppUpdate.internal.network.CheckUpdateResponseDTO;
import za0.InterfaceC11014a;

/* renamed from: kj.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7686b extends AbstractC7685a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6375d f71655a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6374c f71656b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Ld0.c f71657c;

    /* renamed from: d, reason: collision with root package name */
    private CheckUpdateApiV1 f71658d;

    public C7686b(@NotNull C6375d initParams, @NotNull InterfaceC6374c config, @NotNull Ld0.c diStore) {
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        this.f71655a = initParams;
        this.f71656b = config;
        this.f71657c = diStore;
    }

    @Override // kj.AbstractC7685a
    protected final void b() {
        String d11;
        Boolean isHostSpecificDomainEnabled;
        InterfaceC6374c interfaceC6374c = this.f71656b;
        if (interfaceC6374c.getCookieJar() == InterfaceC4875q.f33801a) {
            int i11 = C8938a.f81237c;
            C8938a.b("CookieJar не установлен. Убедитесь, что вы установили его в конфигурации SDK.");
            throw new IllegalArgumentException("CookieJar is CookieJar.NO_COOKIES");
        }
        boolean z11 = false;
        C8588a c8588a = new C8588a(0);
        if (h.t("googlePlayStore", "qa", true)) {
            c8588a.c(C8588a.EnumC1299a.BODY);
        }
        E.a aVar = new E.a();
        aVar.X(60L, TimeUnit.SECONDS);
        aVar.h(interfaceC6374c.getCookieJar());
        aVar.S().addAll(interfaceC6374c.getInterceptors());
        aVar.a(c8588a);
        aVar.T().addAll(interfaceC6374c.getNetworkInterceptors());
        E e11 = new E(aVar);
        InterfaceC6374c.a featureFlags = interfaceC6374c.getFeatureFlags();
        if (featureFlags == null || (isHostSpecificDomainEnabled = featureFlags.isHostSpecificDomainEnabled()) == null) {
            this.f71655a.getClass();
        } else {
            z11 = isHostSpecificDomainEnabled.booleanValue();
        }
        InterfaceC11014a interfaceC11014a = null;
        if (z11) {
            InterfaceC11014a interfaceC11014a2 = (InterfaceC11014a) this.f71657c.d(InterfaceC11014a.class);
            if (interfaceC11014a2 == null) {
                int i12 = C8938a.f81237c;
                C8938a.b("HostConfig не инициализирован в целевом приложении. Используем базовый домен из Ozon ID.");
            } else {
                interfaceC11014a = interfaceC11014a2;
            }
        } else {
            int i13 = C8938a.f81237c;
            C8938a.b("Использование HostConfig отключено: вызван OzonInAppUpdateInitParams.Builder.setHostSpecificDomainEnabled(false). Используем базовый домен из Ozon ID.");
        }
        A.a aVar2 = new A.a();
        aVar2.s("https");
        if (interfaceC11014a == null || (d11 = interfaceC11014a.a()) == null) {
            d11 = interfaceC6374c.getBaseDomain().d();
        }
        aVar2.j(d11);
        Retrofit build = new Retrofit.Builder().baseUrl(aVar2.e()).client(e11).addConverterFactory(MoshiConverterFactory.create(new Moshi(new Moshi.a()))).build();
        Intrinsics.f(build);
        this.f71658d = (CheckUpdateApiV1) build.create(CheckUpdateApiV1.class);
    }

    @Override // kj.AbstractC7685a
    @NotNull
    public final Call<CheckUpdateResponseDTO> c() {
        CheckUpdateApiV1 checkUpdateApiV1 = this.f71658d;
        if (checkUpdateApiV1 == null) {
            int i11 = C8938a.f81237c;
            C8938a.b("CheckUpdateApiV1 is null. Make sure UpdateCheckerV1::createApi is called.");
            throw new IllegalStateException("CheckUpdateApiV1 is null");
        }
        InterfaceC6374c interfaceC6374c = this.f71656b;
        if (!Intrinsics.d(interfaceC6374c.getRequiredHeaders(), InterfaceC6374c.b.a.a())) {
            InterfaceC6374c.b requiredHeaders = interfaceC6374c.getRequiredHeaders();
            return checkUpdateApiV1.checkUpdate(requiredHeaders.getXO3AppName(), requiredHeaders.getXO3AppVersion(), requiredHeaders.getUserAgent());
        }
        int i12 = C8938a.f81237c;
        C8938a.b("RequiredHeaders не установлен. Убедитесь, что вы установили его в конфигурации SDK.");
        throw new IllegalArgumentException("RequiredHeaders is empty");
    }
}
