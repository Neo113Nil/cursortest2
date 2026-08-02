package ru.ozon.app.android.account.orders.selectPayment.presentation;

import As.C2444a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.selectPayment.data.SelectPaymentDTO;
import ru.ozon.app.android.account.orders.selectPayment.di.SelectPaymentComponent;
import ru.ozon.app.android.account.orders.selectPayment.presentation.SelectPaymentOverlayViewMapper;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentOverlayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/account/orders/selectPayment/di/SelectPaymentComponent;", "Lru/ozon/app/android/account/orders/selectPayment/data/SelectPaymentDTO;", "Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentActionButtonVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/account/orders/selectPayment/data/SelectPaymentDTO;Ljava/lang/String;)Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentActionButtonVO;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/account/orders/selectPayment/data/SelectPaymentDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectPaymentOverlayViewMapper extends OverlayWidgetScreenViewItemMapper2<SelectPaymentComponent, SelectPaymentDTO, SelectPaymentActionButtonVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        View inflate = LayoutInflater.from(it.getContext()).inflate(R$layout.widget_select_payment_action_button, (ViewGroup) it, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    private final SelectPaymentActionButtonVO toVO(SelectPaymentDTO selectPaymentDTO, String str) {
        long hashCode = str.hashCode();
        ButtonV3Atom.LargeButton applyButton = selectPaymentDTO.getApplyButton();
        AtomActionDTO action = selectPaymentDTO.getApplyButton().getAction();
        return new SelectPaymentActionButtonVO(hashCode, ButtonV3Atom.LargeButton.copy$default(applyButton, null, null, null, null, null, action != null ? AtomActionDTO.copy$default(action, AtomActionDTO.Behavior.COMPOSER_ACTION, null, null, null, null, 30, null) : null, null, null, null, 479, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectPaymentComponent widgetComponent$lambda$2(C7475g c7475g) {
        return SelectPaymentComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<SelectPaymentActionButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new SelectPaymentActionButtonWidgetHolder((ActionButtonViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.account.orders.selectPayment.presentation.SelectPaymentOverlayViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ActionButtonViewModel actionButtonViewModel = SelectPaymentOverlayViewMapper.this.component().getActionButtonViewModel();
                Intrinsics.g(actionButtonViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return actionButtonViewModel;
            }
        }).a(ActionButtonViewModel.class), container, new InterfaceC6068e() { // from class: fl.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$1;
                createHolder$lambda$1 = SelectPaymentOverlayViewMapper.createHolder$lambda$1((LinearLayout) viewGroup);
                return createHolder$lambda$1;
            }
        });
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SelectPaymentComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SelectPaymentComponent.class), new C2444a(storage, 7));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SelectPaymentActionButtonVO> map(@NotNull SelectPaymentDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, info.d()));
    }
}
