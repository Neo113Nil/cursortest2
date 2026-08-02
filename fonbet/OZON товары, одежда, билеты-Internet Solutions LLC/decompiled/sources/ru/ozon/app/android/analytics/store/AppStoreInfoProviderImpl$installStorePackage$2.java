package ru.ozon.app.android.analytics.store;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppStoreInfoProviderImpl$installStorePackage$2 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ AppStoreInfoProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStoreInfoProviderImpl$installStorePackage$2(AppStoreInfoProviderImpl appStoreInfoProviderImpl) {
        super(0);
        this.this$0 = appStoreInfoProviderImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Context context;
        String installStorePackage;
        AppStoreInfoProviderImpl appStoreInfoProviderImpl = this.this$0;
        context = appStoreInfoProviderImpl.context;
        installStorePackage = appStoreInfoProviderImpl.getInstallStorePackage(context);
        return installStorePackage;
    }
}
