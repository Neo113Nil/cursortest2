package ru.ozon.app.android.regulardraw.onboarding;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/LotteryOnboardingModel;", "Lru/ozon/app/android/regulardraw/onboarding/BaseOnboardingModel;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;", "lotteryOnboardingInfo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "handleComposerAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "sendOnboardingViewedRequest", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "mustSkipOnboarding", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;", "getLotteryOnboardingInfo", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;", "Lkotlin/jvm/functions/Function1;", "getHandleComposerAction", "()Lkotlin/jvm/functions/Function1;", "getSendOnboardingViewedRequest", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LotteryOnboardingModel implements BaseOnboardingModel {

    @NotNull
    private final Function1<AtomAction, Unit> handleComposerAction;

    @NotNull
    private final LotteryOnboardingInfoVI lotteryOnboardingInfo;

    @NotNull
    private final Function1<AtomActionDTO, Unit> sendOnboardingViewedRequest;

    /* JADX WARN: Multi-variable type inference failed */
    public LotteryOnboardingModel(@NotNull LotteryOnboardingInfoVI lotteryOnboardingInfo, @NotNull Function1<? super AtomAction, Unit> handleComposerAction, @NotNull Function1<? super AtomActionDTO, Unit> sendOnboardingViewedRequest) {
        Intrinsics.checkNotNullParameter(lotteryOnboardingInfo, "lotteryOnboardingInfo");
        Intrinsics.checkNotNullParameter(handleComposerAction, "handleComposerAction");
        Intrinsics.checkNotNullParameter(sendOnboardingViewedRequest, "sendOnboardingViewedRequest");
        this.lotteryOnboardingInfo = lotteryOnboardingInfo;
        this.handleComposerAction = handleComposerAction;
        this.sendOnboardingViewedRequest = sendOnboardingViewedRequest;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotteryOnboardingModel)) {
            return false;
        }
        LotteryOnboardingModel lotteryOnboardingModel = (LotteryOnboardingModel) other;
        return Intrinsics.d(this.lotteryOnboardingInfo, lotteryOnboardingModel.lotteryOnboardingInfo) && Intrinsics.d(this.handleComposerAction, lotteryOnboardingModel.handleComposerAction) && Intrinsics.d(this.sendOnboardingViewedRequest, lotteryOnboardingModel.sendOnboardingViewedRequest);
    }

    @NotNull
    public final Function1<AtomAction, Unit> getHandleComposerAction() {
        return this.handleComposerAction;
    }

    @NotNull
    public final LotteryOnboardingInfoVI getLotteryOnboardingInfo() {
        return this.lotteryOnboardingInfo;
    }

    @NotNull
    public final Function1<AtomActionDTO, Unit> getSendOnboardingViewedRequest() {
        return this.sendOnboardingViewedRequest;
    }

    public int hashCode() {
        return this.sendOnboardingViewedRequest.hashCode() + ((this.handleComposerAction.hashCode() + (this.lotteryOnboardingInfo.hashCode() * 31)) * 31);
    }

    public final boolean mustSkipOnboarding() {
        return this.lotteryOnboardingInfo.getMustSkipOnboarding();
    }

    @NotNull
    public String toString() {
        return "LotteryOnboardingModel(lotteryOnboardingInfo=" + this.lotteryOnboardingInfo + ", handleComposerAction=" + this.handleComposerAction + ", sendOnboardingViewedRequest=" + this.sendOnboardingViewedRequest + ")";
    }
}
