package ru.ozon.app.android.analytics.store;

import Xc.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.store.OzonInstallStore;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXc/a;", "Lru/ozon/app/android/analytics/store/OzonInstallStore$Known;", "invoke", "()LXc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AppStoreInfoProviderImpl$appStores$2 extends AbstractC7737t implements Function0<a<OzonInstallStore.Known>> {
    public static final AppStoreInfoProviderImpl$appStores$2 INSTANCE = new AppStoreInfoProviderImpl$appStores$2();

    AppStoreInfoProviderImpl$appStores$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final a<OzonInstallStore.Known> invoke() {
        return OzonInstallStore.Known.getEntries();
    }
}
