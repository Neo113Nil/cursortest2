package ru.ozon.app.android.fresh.checkout.domain.actionHandlers;

import Pc.a;
import Tg.b;
import Vg.f;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.payment.ui.createorder.highload.HighLoadProgressBar;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/checkout/domain/actionHandlers/CreateFreshOrderV2ActionHandler;", "LVg/f;", "LPc/a;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "pViewModel", "<init>", "(LPc/a;)V", "LTg/b;", "action", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "LPc/a;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;", "progressBar", "Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;", "getProgressBar", "()Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;", "setProgressBar", "(Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;)V", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateFreshOrderV2ActionHandler extends f {

    @NotNull
    private final String actionId;

    @NotNull
    private final a<CreateAndPayViewModel> pViewModel;
    private HighLoadProgressBar progressBar;
    public static final int $stable = 8;

    public CreateFreshOrderV2ActionHandler(@NotNull a<CreateAndPayViewModel> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.pViewModel = pViewModel;
        this.actionId = "createFreshOrderV2";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        AtomAction.Click click;
        String link;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if ((action instanceof AtomAction.Click) && (link = (click = (AtomAction.Click) action).getLink()) != null) {
            ((CreateAndPayViewModel) new z0(widgetInfo.b().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.checkout.domain.actionHandlers.CreateFreshOrderV2ActionHandler$processWidgetAction$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = CreateFreshOrderV2ActionHandler.this.pViewModel;
                    CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) aVar.get();
                    Intrinsics.g(createAndPayViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return createAndPayViewModel;
                }
            }).a(CreateAndPayViewModel.class)).createOrderV2(link, widgetInfo.c().n(), click.getParams(), this.progressBar);
        }
    }

    public final void setProgressBar(HighLoadProgressBar highLoadProgressBar) {
        this.progressBar = highLoadProgressBar;
    }
}
