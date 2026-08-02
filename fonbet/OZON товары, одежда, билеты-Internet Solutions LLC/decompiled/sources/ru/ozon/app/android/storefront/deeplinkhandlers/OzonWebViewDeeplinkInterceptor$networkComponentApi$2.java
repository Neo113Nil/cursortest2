package ru.ozon.app.android.storefront.deeplinkhandlers;

import android.app.Application;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class OzonWebViewDeeplinkInterceptor$networkComponentApi$2 extends AbstractC7737t implements Function0<NetworkComponentApi> {
    final /* synthetic */ OzonWebViewDeeplinkInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonWebViewDeeplinkInterceptor$networkComponentApi$2(OzonWebViewDeeplinkInterceptor ozonWebViewDeeplinkInterceptor) {
        super(0);
        this.this$0 = ozonWebViewDeeplinkInterceptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NetworkComponentApi invoke() {
        Application application;
        application = this.this$0.application;
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        return (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
    }
}
