package ru.ozon.app.android.session.editCredential.otp.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\fR*\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R2\u0010*\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010%8&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetView;", "", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;", "item", "", "bind", "(Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;)V", "Lru/ozon/app/android/session/editCredential/otp/presentation/TimerAction;", "timerAction", "updateTimer", "(Lru/ozon/app/android/session/editCredential/otp/presentation/TimerAction;)V", "onValidationError", "()V", "", "message", "onError", "(Ljava/lang/String;)V", "onDestroyView", "Lkotlin/Function1;", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;", "getSetRetryTimer", "()Lkotlin/jvm/functions/Function1;", "setSetRetryTimer", "(Lkotlin/jvm/functions/Function1;)V", "setRetryTimer", "getOnTryValidate", "setOnTryValidate", "onTryValidate", "Lkotlin/Function0;", "getOnGetNewCodeClicked", "()Lkotlin/jvm/functions/Function0;", "setOnGetNewCodeClicked", "(Lkotlin/jvm/functions/Function0;)V", "onGetNewCodeClicked", "getOnSubtitleClicked", "setOnSubtitleClicked", "onSubtitleClicked", "Lkotlin/Function2;", "getOnDeeplinkClicked", "()Lkotlin/jvm/functions/Function2;", "setOnDeeplinkClicked", "(Lkotlin/jvm/functions/Function2;)V", "onDeeplinkClicked", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface OTPWidgetView {
    void bind(@NotNull OTPWidgetVO item);

    void onDestroyView();

    void onError(String message);

    void onValidationError();

    void setOnDeeplinkClicked(Function2<? super String, ? super String, Unit> function2);

    void setOnGetNewCodeClicked(Function0<Unit> function0);

    void setOnSubtitleClicked(Function1<? super String, Unit> function1);

    void setOnTryValidate(Function1<? super String, Unit> function1);

    void setSetRetryTimer(Function1<? super OTPWidgetDTO.RetryButton, Unit> function1);

    void updateTimer(@NotNull TimerAction timerAction);
}
