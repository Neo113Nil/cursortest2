package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.buttons.SecureDealButtonsVO;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal.SecureDealDataVO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainUpdate;", "LA00/a$J$a;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;", "secureDealDataVO", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsVO;", "buttonsVO", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsVO;)V", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;", "getSecureDealDataVO", "()Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsVO;", "getButtonsVO", "()Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsVO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SecureDealCurtainUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final SecureDealButtonsVO buttonsVO;

    @NotNull
    private final SecureDealDataVO secureDealDataVO;

    public SecureDealCurtainUpdate(@NotNull SecureDealDataVO secureDealDataVO, @NotNull SecureDealButtonsVO buttonsVO) {
        Intrinsics.checkNotNullParameter(secureDealDataVO, "secureDealDataVO");
        Intrinsics.checkNotNullParameter(buttonsVO, "buttonsVO");
        this.secureDealDataVO = secureDealDataVO;
        this.buttonsVO = buttonsVO;
    }

    @NotNull
    public final SecureDealButtonsVO getButtonsVO() {
        return this.buttonsVO;
    }

    @NotNull
    public final SecureDealDataVO getSecureDealDataVO() {
        return this.secureDealDataVO;
    }
}
