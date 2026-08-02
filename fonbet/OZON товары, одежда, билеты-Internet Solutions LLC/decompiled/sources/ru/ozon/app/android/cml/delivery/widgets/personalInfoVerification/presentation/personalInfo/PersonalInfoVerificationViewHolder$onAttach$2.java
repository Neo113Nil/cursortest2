package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoVerificationViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class PersonalInfoVerificationViewHolder$onAttach$2 extends C7735q implements Function2<String, String, Unit> {
    PersonalInfoVerificationViewHolder$onAttach$2(Object obj) {
        super(2, obj, PersonalInfoVerificationViewModel.class, "onInputValueChange", "onInputValueChange(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02, String p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((PersonalInfoVerificationViewModel) this.receiver).onInputValueChange(p02, p12);
    }
}
