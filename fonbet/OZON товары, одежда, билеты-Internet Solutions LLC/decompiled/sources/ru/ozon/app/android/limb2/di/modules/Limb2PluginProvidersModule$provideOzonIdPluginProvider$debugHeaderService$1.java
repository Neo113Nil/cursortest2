package ru.ozon.app.android.limb2.di.modules;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/network/debug/DebugHeaderService;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Limb2PluginProvidersModule$provideOzonIdPluginProvider$debugHeaderService$1 extends AbstractC7737t implements Function0<DebugHeaderService> {
    final /* synthetic */ NetworkComponentApi $networkComponentApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Limb2PluginProvidersModule$provideOzonIdPluginProvider$debugHeaderService$1(NetworkComponentApi networkComponentApi) {
        super(0);
        this.$networkComponentApi = networkComponentApi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DebugHeaderService invoke() {
        return this.$networkComponentApi.getDebugHeaderService();
    }
}
