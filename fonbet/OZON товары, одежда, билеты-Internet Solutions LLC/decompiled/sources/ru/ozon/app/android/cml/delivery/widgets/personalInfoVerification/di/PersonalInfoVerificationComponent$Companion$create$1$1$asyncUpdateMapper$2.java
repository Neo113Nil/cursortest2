package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cml.delivery.molecules.button.data.CmlButtonMapper;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeMapper;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.mapper.PersonalInfoVerificationAsyncUpdateMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationAsyncUpdateMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PersonalInfoVerificationComponent$Companion$create$1$1$asyncUpdateMapper$2 extends AbstractC7737t implements Function0<PersonalInfoVerificationAsyncUpdateMapper> {
    final /* synthetic */ PersonalInfoVerificationComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoVerificationComponent$Companion$create$1$1$asyncUpdateMapper$2(PersonalInfoVerificationComponent$Companion$create$1$1 personalInfoVerificationComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = personalInfoVerificationComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PersonalInfoVerificationAsyncUpdateMapper invoke() {
        InputMoleculeMapper inputMapper;
        CmlButtonMapper cmlButtonMapper;
        inputMapper = this.this$0.getInputMapper();
        cmlButtonMapper = this.this$0.getCmlButtonMapper();
        return new PersonalInfoVerificationAsyncUpdateMapper(inputMapper, cmlButtonMapper);
    }
}
