package ru.ozon.app.android.travel.feature.general.common.widgets.travelHiddenErrorTimeout.presentation;

import GZ.g;
import LZ.b;
import android.content.Intent;
import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.utils.TimerHelper;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;
import sZ.c;
import uZ.C9992d;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelHiddenErrorTimeout/presentation/TravelHiddenErrorTimeoutWidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelHiddenErrorTimeout/presentation/TravelHiddenErrorTimeoutVO;", "LGZ/g;", "ozonRouter", "Ll10/b;", "composerController", "<init>", "(LGZ/g;Ll10/b;)V", "item", "LLZ/b;", "provideDialogRequest", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelHiddenErrorTimeout/presentation/TravelHiddenErrorTimeoutVO;)LLZ/b;", "Lru/ozon/app/android/uikit/dialog/AlertDialogFragment;", "provideAlertDialog", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelHiddenErrorTimeout/presentation/TravelHiddenErrorTimeoutVO;)Lru/ozon/app/android/uikit/dialog/AlertDialogFragment;", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelHiddenErrorTimeout/presentation/TravelHiddenErrorTimeoutVO;)V", "onWidgetDestroyed", "()V", "LGZ/g;", "Ll10/b;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "timerHelper", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelHiddenErrorTimeoutWidgetHolder extends AbstractC6065b<TravelHiddenErrorTimeoutVO> {

    @NotNull
    private final InterfaceC7851b composerController;
    private final View metricView;

    @NotNull
    private final g ozonRouter;
    private TimerHelper timerHelper;

    public TravelHiddenErrorTimeoutWidgetHolder(@NotNull g ozonRouter, @NotNull InterfaceC7851b composerController) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        this.ozonRouter = ozonRouter;
        this.composerController = composerController;
    }

    private final AlertDialogFragment provideAlertDialog(TravelHiddenErrorTimeoutVO item) {
        AlertDialogFragment.Companion companion = AlertDialogFragment.INSTANCE;
        Integer num = null;
        Integer num2 = null;
        AlertDialogFragment.Params params = new AlertDialogFragment.Params(num, item.getDialogMessage(), num2, item.getDialogTitle(), 0, item.getDialogButton(), null, 0, 213, null);
        Intent intent = new Intent();
        intent.putExtra("ru.ozon.app.android.travel.common.configurators.TravelTimeoutRedirectConfigurator.EXTRA_DEEPLINK", item.getDeeplink());
        Unit unit = Unit.f71690a;
        AlertDialogFragment newInstanceForFragmentResult = companion.newInstanceForFragmentResult(params, intent);
        newInstanceForFragmentResult.setCancelable(false);
        return newInstanceForFragmentResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final b provideDialogRequest(TravelHiddenErrorTimeoutVO item) {
        return new b(new C9992d(new c("TravelHiddenErrorTimeoutNoUiViewMapperTag", provideAlertDialog(item), 8941, false, false, null, false, false, false, 504, null), null, 2, null == true ? 1 : 0));
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        TimerHelper timerHelper = this.timerHelper;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        this.timerHelper = null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TravelHiddenErrorTimeoutVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TimerHelper timerHelper = this.timerHelper;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        TimerHelper timerHelper2 = new TimerHelper(getLifecycle());
        this.timerHelper = timerHelper2;
        TimerHelper.startTimer$default(timerHelper2, item.getTimeLimit(), new TravelHiddenErrorTimeoutWidgetHolder$bind$1$1(this, item), (Function1) null, 4, (Object) null);
    }
}
