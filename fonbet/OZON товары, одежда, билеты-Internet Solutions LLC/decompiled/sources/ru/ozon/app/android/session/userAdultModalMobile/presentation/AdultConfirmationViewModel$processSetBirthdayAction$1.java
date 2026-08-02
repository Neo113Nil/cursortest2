package ru.ozon.app.android.session.userAdultModalMobile.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.SetBirthdayResponse;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.models.AdultConfirmationAction;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/AdultConfirmationAction;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/SetBirthdayResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/session/userAdultModalMobile/data/models/SetBirthdayResponse;)Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/AdultConfirmationAction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AdultConfirmationViewModel$processSetBirthdayAction$1 extends AbstractC7737t implements Function1<SetBirthdayResponse, AdultConfirmationAction> {
    final /* synthetic */ AdultConfirmationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdultConfirmationViewModel$processSetBirthdayAction$1(AdultConfirmationViewModel adultConfirmationViewModel) {
        super(1);
        this.this$0 = adultConfirmationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AdultConfirmationAction invoke(SetBirthdayResponse it) {
        AdultConfirmationAction mapToAction;
        Intrinsics.checkNotNullParameter(it, "it");
        mapToAction = this.this$0.mapToAction(it);
        return mapToAction;
    }
}
