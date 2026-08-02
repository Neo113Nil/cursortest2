package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data;

import We.K;
import io.reactivex.C;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.api.CheckLegalAddressResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.api.LegalsApi;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LWe/K;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/C;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/api/CheckLegalAddressResponse;", "kotlin.jvm.PlatformType", "invoke", "(LWe/K;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CheckLegalAddressRepositoryImpl$checkLegalAddress$2 extends AbstractC7737t implements Function1<K, C<? extends CheckLegalAddressResponse>> {
    final /* synthetic */ CheckLegalAddressRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckLegalAddressRepositoryImpl$checkLegalAddress$2(CheckLegalAddressRepositoryImpl checkLegalAddressRepositoryImpl) {
        super(1);
        this.this$0 = checkLegalAddressRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends CheckLegalAddressResponse> invoke(K it) {
        LegalsApi legalsApi;
        Intrinsics.checkNotNullParameter(it, "it");
        legalsApi = this.this$0.api;
        return legalsApi.checkAddressMobile(it);
    }
}
