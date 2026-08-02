package ru.ozon.app.android.bank.navigation;

import android.app.Application;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.bank.domain.FintechLibApi;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BankGlobalDeeplinkInterceptor$fintechDeeplink$2$settings$2 extends AbstractC7737t implements Function0<ExternalFintechSettings> {
    final /* synthetic */ BankGlobalDeeplinkInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankGlobalDeeplinkInterceptor$fintechDeeplink$2$settings$2(BankGlobalDeeplinkInterceptor bankGlobalDeeplinkInterceptor) {
        super(0);
        this.this$0 = bankGlobalDeeplinkInterceptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExternalFintechSettings invoke() {
        Application application;
        application = this.this$0.application;
        if (FintechLibApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FintechLibApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, FintechLibApi.class).getDependencyStorage();
        if (FintechLibApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FintechLibApi is not DiComponent");
        }
        return ((FintechLibApi) dependencyStorage.b(FintechLibApi.class)).getExternalFintechSettings();
    }
}
