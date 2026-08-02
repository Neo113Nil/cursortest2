package ru.ozon.app.android.network.interceptors;

import Ib.a;
import We.A;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkComponentConfig;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DomainCheckInterceptor$apiUrlHost$2 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ a<NetworkComponentConfig> $networkComponentConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DomainCheckInterceptor$apiUrlHost$2(a<NetworkComponentConfig> aVar) {
        super(0);
        this.$networkComponentConfig = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        A.b bVar = A.f33515l;
        String apiUrl = this.$networkComponentConfig.get().getApiUrl();
        bVar.getClass();
        return A.b.c(apiUrl).h();
    }
}
