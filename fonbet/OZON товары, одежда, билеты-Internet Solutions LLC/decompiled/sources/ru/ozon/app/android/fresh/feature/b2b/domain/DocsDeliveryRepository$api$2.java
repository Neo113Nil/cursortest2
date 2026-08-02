package ru.ozon.app.android.fresh.feature.b2b.domain;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import retrofit2.Retrofit;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryApi;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryApi;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DocsDeliveryRepository$api$2 extends AbstractC7737t implements Function0<DocsDeliveryApi> {
    final /* synthetic */ Retrofit $retrofit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocsDeliveryRepository$api$2(Retrofit retrofit) {
        super(0);
        this.$retrofit = retrofit;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DocsDeliveryApi invoke() {
        return (DocsDeliveryApi) this.$retrofit.create(DocsDeliveryApi.class);
    }
}
