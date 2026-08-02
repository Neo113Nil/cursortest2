package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.buttons.PersonalInfoVerificationStickyButtonVO;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo.PersonalInfoVerificationVO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationUpdate;", "LA00/a$J$a;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;", "personalInfo", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/buttons/PersonalInfoVerificationStickyButtonVO;", "stickyButton", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/buttons/PersonalInfoVerificationStickyButtonVO;)V", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;", "getPersonalInfo", "()Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/buttons/PersonalInfoVerificationStickyButtonVO;", "getStickyButton", "()Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/buttons/PersonalInfoVerificationStickyButtonVO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoVerificationUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final PersonalInfoVerificationVO personalInfo;

    @NotNull
    private final PersonalInfoVerificationStickyButtonVO stickyButton;

    public PersonalInfoVerificationUpdate(@NotNull PersonalInfoVerificationVO personalInfo, @NotNull PersonalInfoVerificationStickyButtonVO stickyButton) {
        Intrinsics.checkNotNullParameter(personalInfo, "personalInfo");
        Intrinsics.checkNotNullParameter(stickyButton, "stickyButton");
        this.personalInfo = personalInfo;
        this.stickyButton = stickyButton;
    }

    @NotNull
    public final PersonalInfoVerificationVO getPersonalInfo() {
        return this.personalInfo;
    }

    @NotNull
    public final PersonalInfoVerificationStickyButtonVO getStickyButton() {
        return this.stickyButton;
    }
}
