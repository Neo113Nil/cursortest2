package ru.ozon.app.android.timerMolecule.presentation;

import androidx.lifecycle.B;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H&¢\u0006\u0004\b\n\u0010\u000bJI\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/timerMolecule/presentation/TimerDelegate;", "", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textAtomV2View", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "timerVO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindOrGone", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/B;", "lifecycleScope", "Lru/ozon/app/android/timerMolecule/presentation/TimerTickData;", "onSecondTick", "Lkotlin/Function0;", "onTimerFinish", "onAttach", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Landroidx/lifecycle/B;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TimerDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void bindOrGone$default(TimerDelegate timerDelegate, TextAtomV2View textAtomV2View, TimerVO timerVO, Function1 function1, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindOrGone");
            }
            if ((i11 & 4) != 0) {
                function1 = null;
            }
            timerDelegate.bindOrGone(textAtomV2View, timerVO, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onAttach$default(TimerDelegate timerDelegate, TextAtomV2View textAtomV2View, B b11, Function1 function1, Function0 function0, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAttach");
            }
            if ((i11 & 4) != 0) {
                function1 = null;
            }
            if ((i11 & 8) != 0) {
                function0 = null;
            }
            timerDelegate.onAttach(textAtomV2View, b11, function1, function0);
        }
    }

    void bindOrGone(@NotNull TextAtomV2View textAtomV2View, TimerVO timerVO, Function1<? super AtomAction, Unit> actionHandler);

    void onAttach(@NotNull TextAtomV2View textAtomV2View, @NotNull B lifecycleScope, Function1<? super TimerTickData, Unit> onSecondTick, Function0<Unit> onTimerFinish);
}
