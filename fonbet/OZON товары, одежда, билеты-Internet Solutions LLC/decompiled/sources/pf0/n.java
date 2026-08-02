package pf0;

import Cf0.J;
import Od0.a;
import Od0.c;
import ag0.C5021a;
import android.content.Context;
import android.net.Uri;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;
import ru.ozon.app.android.abtool.data.model.ValueType;

/* loaded from: classes7.dex */
public final class n extends Od0.d<h> implements Od0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.d f80515a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K f80516b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Class<? extends h> f80517c;

    public n(@NotNull Ld0.d globalConfig, @NotNull K hostInterceptors) {
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        Intrinsics.checkNotNullParameter(hostInterceptors, "hostInterceptors");
        this.f80515a = globalConfig;
        this.f80516b = hostInterceptors;
        this.f80517c = h.class;
    }

    @Override // Od0.b
    public final void beforeHandleDeeplink(@NotNull Ld0.c store, @NotNull Od0.c deeplink) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }

    @Override // Od0.b
    public final boolean canHandle(@NotNull Od0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Uri data = deeplink instanceof c.a ? ((c.a) deeplink).b().getData() : deeplink instanceof c.b ? ((c.b) deeplink).b() : null;
        if (data == null) {
            return false;
        }
        return kotlin.text.h.D(data.getAuthority(), "ozonNetworkSDK", true) && data.getLastPathSegment() != null;
    }

    @Override // Od0.d
    public final h create(Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return new m(store, this.f80516b);
    }

    @Override // Od0.d
    @NotNull
    public final List<Ld0.f> createPluginProviderIntegration(@NotNull Ld0.c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        Tc.b builder = C7714v.B();
        builder.add(new Ef0.d(diStore, this.f80515a.a()));
        builder.addAll(C5021a.b());
        ValueType valueType = ValueType.STRING;
        builder.addAll(C7714v.b0(new FeatureDTO("Получение списка доменов второго уровня", "ozon_network", "ozon_second_level_domains", valueType, "ozon.com,ozon.ru,ozon.by,ozon.kz,ozonru.me", null, null, 96, null), new FeatureDTO("Список включенных типов аналитики", "ozon_network", "analytics_types_enabled", valueType, "", null, null, 96, null)));
        ValueType valueType2 = ValueType.BOOLEAN;
        Boolean bool = Boolean.FALSE;
        FeatureDTO featureDTO = new FeatureDTO("Whitelisting: мониторинг включен", "ozon_network", "on_whitelisting_enabled_android", valueType2, bool, null, null, 96, null);
        FeatureDTO featureDTO2 = new FeatureDTO("Whitelisting: серый домен", "ozon_network", "on_whitelisting_gray_domain", valueType, "google.com", null, null, 96, null);
        FeatureDTO featureDTO3 = new FeatureDTO("Whitelisting: белый домен", "ozon_network", "on_whitelisting_white_domain", valueType, "", null, null, 96, null);
        ValueType valueType3 = ValueType.INT;
        builder.addAll(C7714v.b0(featureDTO, featureDTO2, featureDTO3, new FeatureDTO("Whitelisting: период пингования (секунд)", "ozon_network", "on_whitelisting_ping_interval_sec", valueType3, 120, null, null, 96, null), new FeatureDTO("Whitelisting: отправлять аналитику изменения isWhitelisting", "ozon_network", "on_whitelisting_analytics_enabled", valueType2, bool, null, null, 96, null), new FeatureDTO("Whitelisting: только мобильная сеть", "ozon_network", "on_is_only_cellular_network_mode", valueType2, Boolean.TRUE, null, null, 96, null), new FeatureDTO("Whitelisting: force ping", "ozon_network", "on_whitelisting_is_force_ping_enabled", valueType2, bool, null, null, 96, null), new FeatureDTO("Whitelisting: extra домены", "ozon_network", "on_whitelisting_ping_extra_domains", valueType, "", null, null, 96, null), new FeatureDTO("Whitelisting: пинг extra доменов на старте приложения", "ozon_network", "on_whitelisting_ping_extra_domains_on_app_start_delay_ms", valueType3, 0, null, UpdateStrategy.PER_PROCESS, 32, null), new FeatureDTO("Whitelisting: протокол пингования", "ozon_network", "on_whitelisting_ping_protocol", valueType, "https", null, null, 96, null), new FeatureDTO("Whitelisting: включение аналитики серого домена", "ozon_network", "on_whitelisting_gray_domain_analytic_enabled", valueType2, bool, null, null, 96, null), new FeatureDTO("Whitelisting: включение аналитики белого домена", "ozon_network", "on_whitelisting_white_domain_analytic_enabled", valueType2, bool, null, null, 96, null)));
        builder.addAll(C7714v.b0(new FeatureDTO("DomainReachability: ограничивает максимальное число пингуемых доменых", "ozon_network", "on_domains_ping_limit", valueType3, 10, null, null, 96, null), new FeatureDTO("DomainReachability: ограничивает максимальное числа параллельно пингующих доменов", "ozon_network", "on_domain_parallel_ping_limit", valueType3, 2, null, null, 96, null)));
        builder.addAll(C7714v.a0(new FeatureDTO("Gost Tls: список consumer с включенным ГОСТ ТЛС", "ozon_network", "gost_consumers_enabled", valueType, "", null, null, 96, null)));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    @Override // Od0.d
    @NotNull
    public final Class<? extends h> getKey() {
        return this.f80517c;
    }

    @Override // Od0.b
    @NotNull
    public final Od0.a handleDeeplink(@NotNull Ld0.c store, @NotNull Od0.c deeplink, @NotNull Context activityContext) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        Uri deeplink2 = deeplink instanceof c.a ? ((c.a) deeplink).b().getData() : deeplink instanceof c.b ? ((c.b) deeplink).b() : null;
        if (deeplink2 == null) {
            return new a.b("deeplink is null", null);
        }
        String path = deeplink2.getLastPathSegment();
        if (path == null) {
            return new a.b("path is null", null);
        }
        Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
        Intrinsics.checkNotNullParameter(path, "path");
        J j11 = m.f80514a;
        if (j11 != null) {
            return j11.s().a(deeplink2, path);
        }
        throw new RuntimeException("NetworkDi must be initialized.");
    }
}
