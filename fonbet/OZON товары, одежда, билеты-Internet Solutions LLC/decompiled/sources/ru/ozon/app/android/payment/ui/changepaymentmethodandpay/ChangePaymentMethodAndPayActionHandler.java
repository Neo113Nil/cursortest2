package ru.ozon.app.android.payment.ui.changepaymentmethodandpay;

import Pc.a;
import Tg.b;
import Vg.f;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.LinkedHashMap;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/payment/ui/changepaymentmethodandpay/ChangePaymentMethodAndPayActionHandler;", "LVg/f;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LPc/a;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "pViewModel", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "applicationInfoRepository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;LPc/a;Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "LVg/f$a;", "widgetInfo", "", "createPayment", "(Lru/ozon/uni/atoms/data/AtomActionDTO;LVg/f$a;)V", "LTg/b;", "Lk20/g;", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LPc/a;", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangePaymentMethodAndPayActionHandler extends f {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final ApplicationInfoDataSource applicationInfoRepository;

    @NotNull
    private final a<CreateAndPayViewModel> pViewModel;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/payment/ui/changepaymentmethodandpay/ChangePaymentMethodAndPayActionHandler$Companion;", "", "<init>", "()V", "CREATE_PAYMENT_ACTION_ID", "", "PARAM_DEVICE_ID", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ChangePaymentMethodAndPayActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull a<CreateAndPayViewModel> pViewModel, @NotNull ApplicationInfoDataSource applicationInfoRepository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(applicationInfoRepository, "applicationInfoRepository");
        this.actionV2Repository = actionV2Repository;
        this.pViewModel = pViewModel;
        this.applicationInfoRepository = applicationInfoRepository;
        this.actionId = "changePaymentMethodAndPay";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPayment(AtomActionDTO action, f.a widgetInfo) {
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, null);
        if (atomAction instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) atomAction;
            if (Intrinsics.d(click.getId(), "createPayment")) {
                CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) new z0(widgetInfo.b().a(), new z0.c() { // from class: ru.ozon.app.android.payment.ui.changepaymentmethodandpay.ChangePaymentMethodAndPayActionHandler$createPayment$$inlined$viewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        a aVar;
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        aVar = ChangePaymentMethodAndPayActionHandler.this.pViewModel;
                        CreateAndPayViewModel createAndPayViewModel2 = (CreateAndPayViewModel) aVar.get();
                        Intrinsics.g(createAndPayViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return createAndPayViewModel2;
                    }
                }).a(CreateAndPayViewModel.class);
                String link = click.getLink();
                if (link == null) {
                    return;
                }
                Map<String, String> params = click.getParams();
                if (params == null) {
                    params = U.c();
                }
                LinkedHashMap u11 = U.u(params);
                u11.put("deviceId", this.applicationInfoRepository.getUniqueApplicationId());
                Unit unit = Unit.f71690a;
                createAndPayViewModel.pay(link, u11, widgetInfo.c().n());
            }
        }
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
            C10727i.c(K.a(widgetInfo.a().e()), null, null, new ChangePaymentMethodAndPayActionHandler$processWidgetAction$1(this, new ActionV2Request(click.getParams(), link, false, 4, null), widgetInfo, null), 3);
        }
    }
}
