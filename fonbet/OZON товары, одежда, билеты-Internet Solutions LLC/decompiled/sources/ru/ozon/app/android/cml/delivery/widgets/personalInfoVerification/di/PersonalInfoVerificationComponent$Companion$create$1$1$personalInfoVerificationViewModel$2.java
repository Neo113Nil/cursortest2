package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.mapper.PersonalInfoVerificationAsyncUpdateMapper;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoVerificationViewModel;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PersonalInfoVerificationComponent$Companion$create$1$1$personalInfoVerificationViewModel$2 extends AbstractC7737t implements Function0<PersonalInfoVerificationViewModel> {
    final /* synthetic */ ComposerWidgetAsyncComponentApi $composerAsyncComponent;
    final /* synthetic */ PersonalInfoVerificationComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoVerificationComponent$Companion$create$1$1$personalInfoVerificationViewModel$2(ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, PersonalInfoVerificationComponent$Companion$create$1$1 personalInfoVerificationComponent$Companion$create$1$1) {
        super(0);
        this.$composerAsyncComponent = composerWidgetAsyncComponentApi;
        this.this$0 = personalInfoVerificationComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PersonalInfoVerificationViewModel invoke() {
        PersonalInfoVerificationAsyncUpdateMapper asyncUpdateMapper;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = this.$composerAsyncComponent.getComposerAsyncWidgetRepository();
        asyncUpdateMapper = this.this$0.getAsyncUpdateMapper();
        return new PersonalInfoVerificationViewModel(composerAsyncWidgetRepository, asyncUpdateMapper);
    }
}
