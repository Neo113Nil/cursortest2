package ru.ozon.app.android.limb2.di.modules;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkComponentDependencies;
import ru.ozon.app.android.network.security.antibot.AntibotPerfAnalyticService;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/network/security/antibot/AntibotPerfAnalyticService;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Limb2PluginProvidersModule$provideOzonIdPluginProvider$antibotPerfAnalyticService$1 extends AbstractC7737t implements Function0<AntibotPerfAnalyticService> {
    final /* synthetic */ NetworkComponentDependencies $networkComponentDependencies;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Limb2PluginProvidersModule$provideOzonIdPluginProvider$antibotPerfAnalyticService$1(NetworkComponentDependencies networkComponentDependencies) {
        super(0);
        this.$networkComponentDependencies = networkComponentDependencies;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AntibotPerfAnalyticService invoke() {
        return this.$networkComponentDependencies.getAntibotPerfAnalyticService();
    }
}
