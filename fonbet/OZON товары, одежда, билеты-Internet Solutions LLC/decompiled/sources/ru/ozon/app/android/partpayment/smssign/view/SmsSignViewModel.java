package ru.ozon.app.android.partpayment.smssign.view;

import Ak.b;
import Kk.C3532b;
import Ve.C4636t5;
import androidx.lifecycle.P;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel;", "", "", "durationSec", "", "resetTimer", "(I)V", "resendPin", "()V", "", ImagesContract.URL, "pin", "checkPin", "(Ljava/lang/String;Ljava/lang/String;)V", "retrySend", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$Action;", "getAction", "()Landroidx/lifecycle/P;", "action", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$TimerInfoVO;", "getTimerInfo", "timerInfo", "Action", "NoUiAction", "TimerInfoVO", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SmsSignViewModel {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$Action;", "", "<init>", "()V", "WrongPin", "RequestProblem", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$Action$RequestProblem;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$Action$WrongPin;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$Action$RequestProblem;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$Action;", "<init>", "()V", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RequestProblem extends Action {

            @NotNull
            public static final RequestProblem INSTANCE = new RequestProblem();

            private RequestProblem() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$Action$WrongPin;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$Action;", "<init>", "()V", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class WrongPin extends Action {

            @NotNull
            public static final WrongPin INSTANCE = new WrongPin();

            private WrongPin() {
                super(null);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$NoUiAction;", "", "<init>", "()V", "ReSendPin", "PinSuccess", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$NoUiAction$PinSuccess;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$NoUiAction$ReSendPin;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class NoUiAction {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$NoUiAction$PinSuccess;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$NoUiAction;", "", "deeplink", "", "isCompleted", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "Z", "()Z", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PinSuccess extends NoUiAction {

            @NotNull
            private final String deeplink;
            private final boolean isCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PinSuccess(@NotNull String deeplink, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.deeplink = deeplink;
                this.isCompleted = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PinSuccess)) {
                    return false;
                }
                PinSuccess pinSuccess = (PinSuccess) other;
                return Intrinsics.d(this.deeplink, pinSuccess.deeplink) && this.isCompleted == pinSuccess.isCompleted;
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isCompleted) + (this.deeplink.hashCode() * 31);
            }

            /* renamed from: isCompleted, reason: from getter */
            public final boolean getIsCompleted() {
                return this.isCompleted;
            }

            @NotNull
            public String toString() {
                return b.f("PinSuccess(deeplink=", this.deeplink, ", isCompleted=", ")", this.isCompleted);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$NoUiAction$ReSendPin;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$NoUiAction;", "<init>", "()V", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ReSendPin extends NoUiAction {

            @NotNull
            public static final ReSendPin INSTANCE = new ReSendPin();

            private ReSendPin() {
                super(null);
            }
        }

        public /* synthetic */ NoUiAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private NoUiAction() {
        }
    }

    void checkPin(@NotNull String url, @NotNull String pin);

    @NotNull
    P<Action> getAction();

    @NotNull
    P<TimerInfoVO> getTimerInfo();

    void resendPin();

    void resetTimer(int durationSec);

    void retrySend();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$TimerInfoVO;", "", "", "timerText", "", "allowResend", "", "sendButtonTextAppearance", "<init>", "(Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTimerText", "Z", "getAllowResend", "()Z", "I", "getSendButtonTextAppearance", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerInfoVO {
        private final boolean allowResend;
        private final int sendButtonTextAppearance;

        @NotNull
        private final String timerText;

        public TimerInfoVO(@NotNull String timerText, boolean z11, int i11) {
            Intrinsics.checkNotNullParameter(timerText, "timerText");
            this.timerText = timerText;
            this.allowResend = z11;
            this.sendButtonTextAppearance = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerInfoVO)) {
                return false;
            }
            TimerInfoVO timerInfoVO = (TimerInfoVO) other;
            return Intrinsics.d(this.timerText, timerInfoVO.timerText) && this.allowResend == timerInfoVO.allowResend && this.sendButtonTextAppearance == timerInfoVO.sendButtonTextAppearance;
        }

        public final boolean getAllowResend() {
            return this.allowResend;
        }

        public final int getSendButtonTextAppearance() {
            return this.sendButtonTextAppearance;
        }

        @NotNull
        public final String getTimerText() {
            return this.timerText;
        }

        public int hashCode() {
            return Integer.hashCode(this.sendButtonTextAppearance) + C3532b.a(this.timerText.hashCode() * 31, 31, this.allowResend);
        }

        @NotNull
        public String toString() {
            return K00.b.e(this.sendButtonTextAppearance, ")", C4636t5.b("TimerInfoVO(timerText=", this.timerText, ", allowResend=", ", sendButtonTextAppearance=", this.allowResend));
        }

        public /* synthetic */ TimerInfoVO(String str, boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? R$style.TextStyle_Body_L_Gray60 : i11);
        }
    }
}
