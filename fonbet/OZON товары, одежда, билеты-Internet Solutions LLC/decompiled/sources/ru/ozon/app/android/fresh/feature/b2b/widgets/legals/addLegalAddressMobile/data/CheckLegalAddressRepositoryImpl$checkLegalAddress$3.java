package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.api.CheckLegalAddressResponse;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/api/CheckLegalAddressResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/api/CheckLegalAddressResponse;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckLegalAddressRepositoryImpl$checkLegalAddress$3 extends AbstractC7737t implements Function1<CheckLegalAddressResponse, String> {
    public static final CheckLegalAddressRepositoryImpl$checkLegalAddress$3 INSTANCE = new CheckLegalAddressRepositoryImpl$checkLegalAddress$3();

    CheckLegalAddressRepositoryImpl$checkLegalAddress$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(CheckLegalAddressResponse it) {
        String deeplink;
        Intrinsics.checkNotNullParameter(it, "it");
        return (!it.isFinal() || (deeplink = it.getDeeplink()) == null) ? "" : deeplink;
    }
}
