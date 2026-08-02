package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation;

import Hj.C3143a;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.core.CsmaPayActionProcesser;
import ru.ozon.app.android.csma.tips.core.TipItem;
import ru.ozon.app.android.csma.tips.core.TipsInput;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.data.TipCourierDetailsDTO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipsCourierDetailsViewEffect;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button.TipCourierDetailInitState;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.CourierTipInput;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsTipsVI;
import ru.ozon.app.android.utils.livedata.LiveDataOperatorsKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017H\u0016¢\u0006\u0004\b \u0010\u001aJ\u0017\u0010!\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\"J\u0019\u0010%\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b%\u0010\"J\u0017\u0010(\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0016\u00100\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0012028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;", "mapper", "Lru/ozon/app/android/csma/tips/core/CsmaPayActionProcesser;", "actionProcesser", "<init>", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;Lru/ozon/app/android/csma/tips/core/CsmaPayActionProcesser;)V", "", "link", "generateLink", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lru/ozon/app/android/csma/tips/core/TipItem;", "tips", "updateVariants", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;", "state", "", "initState", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI;", "getTipsData", "()Landroidx/lifecycle/P;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getActionButtonData", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/CourierTipInput;", "getInputType", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipsCourierDetailsViewEffect;", "getViewEffects", "selectTips", "(Ljava/lang/String;)V", "changePayment", "tipsAmount", "setTipsAmount", "", "hasFocus", "setInputActive", "(Z)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "pay", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;", "Lru/ozon/app/android/csma/tips/core/CsmaPayActionProcesser;", "isTipsInputSelected", "Z", "Landroidx/lifecycle/V;", "localState", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "viewEffects", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierDetailsViewModelImpl extends w0 implements TipCourierDetailsViewModel {

    @NotNull
    private final CsmaPayActionProcesser actionProcesser;
    private boolean isTipsInputSelected;

    @NotNull
    private final V<TipCourierDetailInitState> localState;

    @NotNull
    private final TipCourierDetailsMapper mapper;

    @NotNull
    private final SingleLiveEvent<TipsCourierDetailsViewEffect> viewEffects;

    public TipCourierDetailsViewModelImpl(@NotNull TipCourierDetailsMapper mapper, @NotNull CsmaPayActionProcesser actionProcesser) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(actionProcesser, "actionProcesser");
        this.mapper = mapper;
        this.actionProcesser = actionProcesser;
        this.localState = new V<>();
        this.viewEffects = new SingleLiveEvent<>();
    }

    private final String generateLink(String link) {
        TipCourierDetailsDTO.TipsDetails tips;
        TipCourierDetailsMapper tipCourierDetailsMapper = this.mapper;
        TipCourierDetailInitState value = this.localState.getValue();
        return tipCourierDetailsMapper.generateLink(link, (value == null || (tips = value.getTips()) == null) ? null : tips.getTipsInput());
    }

    private final List<TipItem> updateVariants(List<TipItem> tips) {
        List<TipItem> list = tips;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (TipItem tipItem : list) {
            if (tipItem.isSelected()) {
                tipItem = TipItem.copy$default(tipItem, null, false, null, null, 13, null);
            }
            arrayList.add(tipItem);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel
    public void changePayment(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        setInputActive(false);
        this.viewEffects.setValue(new TipsCourierDetailsViewEffect.Navigate(generateLink(link)));
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel
    @NotNull
    public P<AtomDTO> getActionButtonData() {
        return LiveDataOperatorsKt.distinct(LiveDataOperatorsKt.map(this.localState, new TipCourierDetailsViewModelImpl$getActionButtonData$1(this.mapper)));
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel
    @NotNull
    public P<CourierTipInput> getInputType() {
        return LiveDataOperatorsKt.map(this.localState, new TipCourierDetailsViewModelImpl$getInputType$1(this));
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel
    @NotNull
    public P<TipCourierDetailsTipsVI> getTipsData() {
        return LiveDataOperatorsKt.distinct(LiveDataOperatorsKt.map(this.localState, new TipCourierDetailsViewModelImpl$getTipsData$1(this.mapper)));
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel
    @NotNull
    public P<TipsCourierDetailsViewEffect> getViewEffects() {
        return this.viewEffects;
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel
    public void initState(@NotNull TipCourierDetailInitState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TipCourierDetailInitState value = this.localState.getValue();
        TipCourierDetailsDTO.TipsDetails tipsDetails = null;
        BigDecimal currentTips = value != null ? value.getCurrentTips() : null;
        BigDecimal currentTips2 = this.isTipsInputSelected ? currentTips : state.getCurrentTips();
        TipCourierDetailsDTO.TipsDetails tips = state.getTips();
        if (tips != null) {
            TipsInput tipsInput = state.getTips().getTipsInput();
            tipsDetails = TipCourierDetailsDTO.TipsDetails.copy$default(tips, null, null, tipsInput != null ? TipsInput.copy$default(tipsInput, null, null, null, null, null, currentTips, this.isTipsInputSelected, 31, null) : null, 3, null);
        }
        this.localState.setValue(TipCourierDetailInitState.copy$default(state, tipsDetails, null, currentTips2, 2, null));
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel
    public void pay(@NotNull AtomAction.Click action) {
        CsmaPayActionProcesser.ActionModel actionModel;
        BigDecimal currentTips;
        Intrinsics.checkNotNullParameter(action, "action");
        TipCourierDetailInitState value = this.localState.getValue();
        String bigDecimal = (value == null || (currentTips = value.getCurrentTips()) == null) ? null : currentTips.toString();
        if (bigDecimal == null || (actionModel = this.actionProcesser.getActionModel(action, bigDecimal)) == null) {
            return;
        }
        this.viewEffects.setValue(new TipsCourierDetailsViewEffect.Pay(actionModel.getLink(), actionModel.getParams()));
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel
    public void selectTips(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.isTipsInputSelected = false;
        setInputActive(false);
        this.viewEffects.setValue(new TipsCourierDetailsViewEffect.Refresh(generateLink(link)));
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel
    public void setInputActive(boolean hasFocus) {
        TipCourierDetailInitState value = this.localState.getValue();
        TipCourierDetailsDTO.TipsDetails tips = value != null ? value.getTips() : null;
        if (tips != null) {
            V<TipCourierDetailInitState> v11 = this.localState;
            TipsInput tipsInput = tips.getTipsInput();
            TipsInput copy$default = tipsInput != null ? TipsInput.copy$default(tipsInput, null, null, null, null, null, null, hasFocus, 63, null) : null;
            List<TipItem> tipsVariants = tips.getTipsVariants();
            if (hasFocus) {
                tipsVariants = updateVariants(tipsVariants);
            }
            TipCourierDetailsDTO.TipsDetails copy$default2 = TipCourierDetailsDTO.TipsDetails.copy$default(tips, tipsVariants, null, copy$default, 2, null);
            TipsInput tipsInput2 = tips.getTipsInput();
            v11.setValue(TipCourierDetailInitState.copy$default(value, copy$default2, null, tipsInput2 != null ? tipsInput2.getCurrentValue() : null, 2, null));
        }
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel
    public void setTipsAmount(String tipsAmount) {
        TipsInput tipsInput;
        TipCourierDetailInitState tipCourierDetailInitState = null;
        TipsInput tipsInput2 = null;
        String g10 = tipsAmount != null ? C3143a.g("[^\\d.]", tipsAmount, "") : null;
        BigDecimal bigDecimal = (g10 == null || h.K(g10)) ? null : new BigDecimal(g10);
        TipCourierDetailInitState value = this.localState.getValue();
        TipCourierDetailsDTO.TipsDetails tips = value != null ? value.getTips() : null;
        if (Intrinsics.d(bigDecimal, (tips == null || (tipsInput = tips.getTipsInput()) == null) ? null : tipsInput.getCurrentValue())) {
            return;
        }
        this.isTipsInputSelected = true;
        if (tips != null) {
            V<TipCourierDetailInitState> v11 = this.localState;
            TipCourierDetailInitState value2 = v11.getValue();
            if (value2 != null) {
                TipsInput tipsInput3 = tips.getTipsInput();
                if (tipsInput3 != null) {
                    BigDecimal bigDecimal2 = bigDecimal;
                    tipsInput2 = TipsInput.copy$default(tipsInput3, null, null, null, null, null, bigDecimal2, false, 95, null);
                    bigDecimal = bigDecimal2;
                }
                tipCourierDetailInitState = TipCourierDetailInitState.copy$default(value2, TipCourierDetailsDTO.TipsDetails.copy$default(tips, null, null, tipsInput2, 3, null), null, bigDecimal, 2, null);
            }
            v11.setValue(tipCourierDetailInitState);
        }
    }
}
