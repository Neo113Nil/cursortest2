package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.api.LegalsApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalRepositoryImpl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepositoryImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class RegistrationComponent$Companion$create$1$1$repository$2 extends AbstractC7737t implements Function0<AddLegalRepositoryImpl> {
    final /* synthetic */ RegistrationComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegistrationComponent$Companion$create$1$1$repository$2(RegistrationComponent$Companion$create$1$1 registrationComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = registrationComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AddLegalRepositoryImpl invoke() {
        LegalsApi legalsApi;
        legalsApi = this.this$0.getLegalsApi();
        return new AddLegalRepositoryImpl(legalsApi);
    }
}
