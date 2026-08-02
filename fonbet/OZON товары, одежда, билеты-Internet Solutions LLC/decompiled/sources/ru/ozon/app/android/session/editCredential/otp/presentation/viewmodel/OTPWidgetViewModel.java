package ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetDTO;
import ru.ozon.app.android.session.editCredential.otp.presentation.Action;
import ru.ozon.app.android.session.editCredential.otp.presentation.TimerAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/OTPWidgetViewModel;", "", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;", DynamicElementDTO.TIMER, "", "setTimer", "(Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;)V", "", "code", "checkCode", "(Ljava/lang/String;)V", "trackClick", "completeFlow", "()V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/PageState;", "getPageState", "()Landroidx/lifecycle/P;", "pageState", "Lru/ozon/app/android/session/editCredential/otp/presentation/Action;", "getActions", "actions", "Lru/ozon/app/android/session/editCredential/otp/presentation/TimerAction;", "getTimerActions", "timerActions", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface OTPWidgetViewModel {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void checkCode$default(OTPWidgetViewModel oTPWidgetViewModel, String str, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkCode");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            oTPWidgetViewModel.checkCode(str);
        }
    }

    void checkCode(String code);

    void completeFlow();

    @NotNull
    P<Action> getActions();

    @NotNull
    P<PageState> getPageState();

    @NotNull
    P<TimerAction> getTimerActions();

    void setTimer(@NotNull OTPWidgetDTO.RetryButton timer);

    void trackClick(String trackClick);
}
