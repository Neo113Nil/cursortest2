package ru.ozon.app.android.storefront.deeplinkhandlers;

import android.app.Application;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BrowserToWebViewGlobalDeeplinkInterceptor$featureChecker$2 extends AbstractC7737t implements Function0<FeatureChecker> {
    final /* synthetic */ Application $application;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BrowserToWebViewGlobalDeeplinkInterceptor$featureChecker$2(Application application) {
        super(0);
        this.$application = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeatureChecker invoke() {
        Application application = this.$application;
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        return ((NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class)).getFeatureChecker();
    }
}
