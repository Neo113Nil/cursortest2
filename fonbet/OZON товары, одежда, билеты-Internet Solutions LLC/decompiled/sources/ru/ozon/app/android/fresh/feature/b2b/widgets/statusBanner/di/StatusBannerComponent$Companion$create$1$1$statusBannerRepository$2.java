package ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.data.StatusBannerRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.data.api.StatusBannerApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/StatusBannerRepositoryImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StatusBannerComponent$Companion$create$1$1$statusBannerRepository$2 extends AbstractC7737t implements Function0<StatusBannerRepositoryImpl> {
    final /* synthetic */ StatusBannerComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatusBannerComponent$Companion$create$1$1$statusBannerRepository$2(StatusBannerComponent$Companion$create$1$1 statusBannerComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = statusBannerComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final StatusBannerRepositoryImpl invoke() {
        StatusBannerApi statusBannerApi;
        statusBannerApi = this.this$0.getStatusBannerApi();
        return new StatusBannerRepositoryImpl(statusBannerApi);
    }
}
