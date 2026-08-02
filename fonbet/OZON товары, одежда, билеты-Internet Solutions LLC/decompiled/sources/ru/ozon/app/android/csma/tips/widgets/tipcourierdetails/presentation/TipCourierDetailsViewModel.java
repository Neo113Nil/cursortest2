package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button.TipCourierDetailInitState;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.CourierTipInput;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsTipsVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007H&¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H&¢\u0006\u0004\b\u0010\u0010\nJ\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0011H&¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0011H&¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;", "", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;", "state", "", "initState", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipsCourierDetailsViewEffect;", "getViewEffects", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI;", "getTipsData", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/CourierTipInput;", "getInputType", "Lru/ozon/uni/atoms/data/AtomDTO;", "getActionButtonData", "", "tipsAmount", "setTipsAmount", "(Ljava/lang/String;)V", "", "hasFocus", "setInputActive", "(Z)V", "link", "selectTips", "changePayment", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "pay", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface TipCourierDetailsViewModel {
    void changePayment(@NotNull String link);

    @NotNull
    P<AtomDTO> getActionButtonData();

    @NotNull
    P<CourierTipInput> getInputType();

    @NotNull
    P<TipCourierDetailsTipsVI> getTipsData();

    @NotNull
    P<TipsCourierDetailsViewEffect> getViewEffects();

    void initState(@NotNull TipCourierDetailInitState state);

    void pay(@NotNull AtomAction.Click action);

    void selectTips(@NotNull String link);

    void setInputActive(boolean hasFocus);

    void setTipsAmount(String tipsAmount);
}
