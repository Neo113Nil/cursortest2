package ru.ozon.app.android.analytics.store;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.store.OzonInstallStore;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/analytics/store/OzonInstallStore;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppStoreInfoProviderImpl$installStore$2 extends AbstractC7737t implements Function0<OzonInstallStore> {
    final /* synthetic */ AppStoreInfoProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStoreInfoProviderImpl$installStore$2(AppStoreInfoProviderImpl appStoreInfoProviderImpl) {
        super(0);
        this.this$0 = appStoreInfoProviderImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OzonInstallStore invoke() {
        String installStorePackage;
        OzonInstallStore.Companion companion = OzonInstallStore.INSTANCE;
        installStorePackage = this.this$0.getInstallStorePackage();
        return companion.getByPackageName(installStorePackage);
    }
}
