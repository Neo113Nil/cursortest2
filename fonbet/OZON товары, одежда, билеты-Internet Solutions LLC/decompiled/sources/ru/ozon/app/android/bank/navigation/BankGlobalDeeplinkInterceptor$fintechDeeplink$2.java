package ru.ozon.app.android.bank.navigation;

import O30.b;
import R80.g;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import W30.a;
import android.app.Application;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LR80/g;", "invoke", "()LR80/g;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class BankGlobalDeeplinkInterceptor$fintechDeeplink$2 extends AbstractC7737t implements Function0<g> {
    final /* synthetic */ BankGlobalDeeplinkInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankGlobalDeeplinkInterceptor$fintechDeeplink$2(BankGlobalDeeplinkInterceptor bankGlobalDeeplinkInterceptor) {
        super(0);
        this.this$0 = bankGlobalDeeplinkInterceptor;
    }

    private static final ExternalFintechSettings invoke$lambda$0(InterfaceC4008j<? extends ExternalFintechSettings> interfaceC4008j) {
        return interfaceC4008j.getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final g invoke() {
        Application application;
        g gVar;
        g gVar2;
        InterfaceC4008j a11 = k.a(n.PUBLICATION, new BankGlobalDeeplinkInterceptor$fintechDeeplink$2$settings$2(this.this$0));
        g.a aVar = g.f24802d;
        ExternalFintechSettings fintechSettings = invoke$lambda$0(a11);
        application = this.this$0.application;
        SharedPreferences sharedPreferences = a.a(application, b.FINANCE);
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        gVar = g.f24803e;
        if (gVar != null) {
            return gVar;
        }
        synchronized (aVar) {
            gVar2 = g.f24803e;
            if (gVar2 == null) {
                gVar2 = new g(fintechSettings, null, sharedPreferences);
                g.f24803e = gVar2;
            }
        }
        return gVar2;
    }
}
