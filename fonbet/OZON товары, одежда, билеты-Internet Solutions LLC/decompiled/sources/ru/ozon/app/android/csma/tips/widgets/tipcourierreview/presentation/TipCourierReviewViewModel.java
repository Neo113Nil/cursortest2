package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewInitState;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H&¢\u0006\u0004\b\u000e\u0010\nJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000fH&¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000fH&¢\u0006\u0004\b\u001d\u0010\u0012J\u0017\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0007H&¢\u0006\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModel;", "", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;", "state", "", "initState", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO;", "getTipsData", "()Landroidx/lifecycle/P;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getActionButtonData", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect;", "getViewEffects", "", "tipsAmount", "setTipsAmount", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "pay", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "hasFocus", "setInputActive", "(Z)V", "link", "selectTips", "changePayment", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$CourierTipInput;", "getInputType", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface TipCourierReviewViewModel {
    void changePayment(@NotNull String link);

    @NotNull
    P<AtomDTO> getActionButtonData();

    @NotNull
    P<TipCourierReviewVO.CourierTipInput> getInputType();

    @NotNull
    P<TipCourierReviewVO> getTipsData();

    @NotNull
    P<TipsCourierReviewViewEffect> getViewEffects();

    void initState(@NotNull TipCourierReviewInitState state);

    void pay(@NotNull AtomAction.Click action);

    void selectTips(@NotNull String link);

    void setInputActive(boolean hasFocus);

    void setTipsAmount(String tipsAmount);
}
