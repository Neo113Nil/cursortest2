package ru.ozon.app.android.timerMolecule.presentation;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import android.content.Context;
import androidx.lifecycle.B;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.timerMolecule.presentation.TimerViewModel;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0017\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/timerMolecule/presentation/TimerDelegateImpl;", "Lru/ozon/app/android/timerMolecule/presentation/TimerDelegate;", "<init>", "()V", "Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel;", "getTimerViewModel", "()Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textAtomV2View", "Landroidx/lifecycle/B;", "lifecycleScope", "Lkotlin/Function1;", "Lru/ozon/app/android/timerMolecule/presentation/TimerTickData;", "", "onSecondTick", "Lkotlin/Function0;", "onTimerFinish", "onAttach", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Landroidx/lifecycle/B;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "timerVO", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindOrGone", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Lkotlin/jvm/functions/Function1;)V", "onClear", "timerViewModel", "Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel;", "currentTextAtomV2View", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lxe/B0;", "timerStateJob", "Lxe/B0;", "actionJob", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerDelegateImpl implements TimerDelegate {
    private B0 actionJob;
    private TextAtomV2View currentTextAtomV2View;
    private B0 timerStateJob;
    private TimerViewModel timerViewModel;

    /* JADX WARN: Multi-variable type inference failed */
    private final TimerViewModel getTimerViewModel() {
        TimerViewModel timerViewModel = this.timerViewModel;
        if (timerViewModel != null) {
            return timerViewModel;
        }
        TimerViewModelImpl timerViewModelImpl = new TimerViewModelImpl(null, false, 3, 0 == true ? 1 : 0);
        this.timerViewModel = timerViewModelImpl;
        return timerViewModelImpl;
    }

    @Override // ru.ozon.app.android.timerMolecule.presentation.TimerDelegate
    public void bindOrGone(@NotNull TextAtomV2View textAtomV2View, TimerVO timerVO, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(textAtomV2View, "textAtomV2View");
        if (timerVO == null) {
            ViewExtKt.gone(textAtomV2View);
            return;
        }
        ViewExtKt.show(textAtomV2View);
        if (timerVO.getBackgroundColor() != null) {
            Context context = textAtomV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CornerRadius cornerRadius = timerVO.getCornerRadius();
            float pxF = cornerRadius != null ? ResourceExtKt.toPxF(cornerRadius.getPx()) : 0.0f;
            CornersConfig cornersConfig = CornersConfig.ALL;
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = textAtomV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textAtomV2View.setBackground(ContextExtKt.createRoundRectShape$default(context, pxF, cornersConfig, 0, styleParser.parseColor(context2, timerVO.getBackgroundColor(), UniColors.BG_MARKETING_SECONDARY.getResId()), null, 20, null));
        } else {
            textAtomV2View.setBackground(null);
        }
        TextHolderKt.bind(textAtomV2View, timerVO.getTitle(), actionHandler);
        TimerViewModel timerViewModel = getTimerViewModel();
        TimerViewModel.DefaultImpls.bindTimer$default(timerViewModel, timerVO, false, 2, null);
        TimerTickData value = timerViewModel.getTimerState().getValue();
        if (value != null) {
            textAtomV2View.setText(value.getText());
        }
    }

    @Override // ru.ozon.app.android.timerMolecule.presentation.TimerDelegate
    public void onAttach(@NotNull TextAtomV2View textAtomV2View, @NotNull B lifecycleScope, Function1<? super TimerTickData, Unit> onSecondTick, Function0<Unit> onTimerFinish) {
        Intrinsics.checkNotNullParameter(textAtomV2View, "textAtomV2View");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        this.currentTextAtomV2View = textAtomV2View;
        TimerViewModel timerViewModel = getTimerViewModel();
        B0 b02 = this.timerStateJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.actionJob;
        if (b03 != null) {
            b03.j(null);
        }
        this.timerStateJob = C2399j.C(new C2408n0(new C2406m0(timerViewModel.getTimerState()), new TimerDelegateImpl$onAttach$1(this, onSecondTick, null)), lifecycleScope);
        this.actionJob = C10727i.c(lifecycleScope, null, null, new TimerDelegateImpl$onAttach$2(timerViewModel, onTimerFinish, null), 3);
    }

    public void onClear() {
        B0 b02 = this.timerStateJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.actionJob;
        if (b03 != null) {
            b03.j(null);
        }
        this.timerStateJob = null;
        this.actionJob = null;
        this.currentTextAtomV2View = null;
        TimerViewModel timerViewModel = this.timerViewModel;
        if (timerViewModel != null) {
            timerViewModel.onCleared();
        }
        this.timerViewModel = null;
    }
}
