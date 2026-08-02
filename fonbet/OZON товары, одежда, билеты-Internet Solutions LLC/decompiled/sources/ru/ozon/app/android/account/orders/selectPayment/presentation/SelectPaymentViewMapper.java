package ru.ozon.app.android.account.orders.selectPayment.presentation;

import HT.a;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.selectPayment.data.PaymentsItemDTO;
import ru.ozon.app.android.account.orders.selectPayment.data.SelectPaymentDTO;
import ru.ozon.app.android.account.orders.selectPayment.di.SelectPaymentComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR2\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R2\u0010+\u001a\u001a\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040*0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"¨\u0006-"}, d2 = {"Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/account/orders/selectPayment/di/SelectPaymentComponent;", "Lru/ozon/app/android/account/orders/selectPayment/data/SelectPaymentDTO;", "Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentVO;", "<init>", "()V", "Lru/ozon/app/android/account/orders/selectPayment/data/PaymentsItemDTO;", "", "id", "toVO", "(Lru/ozon/app/android/account/orders/selectPayment/data/PaymentsItemDTO;J)Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentVO;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentVO;Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentVO;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectPaymentViewMapper extends WidgetViewMapper2<SelectPaymentComponent, SelectPaymentDTO, SelectPaymentVO> {

    @NotNull
    private final Function2<SelectPaymentDTO, d, List<SelectPaymentVO>> mapper = new SelectPaymentViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_select_payment_layout;

    @NotNull
    private final Function2<View, ComposerReferences, k<SelectPaymentVO>> holderProducer = new SelectPaymentViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectPaymentVO toVO(PaymentsItemDTO paymentsItemDTO, long j11) {
        String icon = paymentsItemDTO.getIcon();
        String title = paymentsItemDTO.getTitle();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(AtomActionDTO.copy$default(paymentsItemDTO.getAction(), Intrinsics.d(paymentsItemDTO.getAction().getId(), "csma_addUserCard") ? AtomActionDTO.Behavior.COMPOSER_ACTION : AtomActionDTO.Behavior.CUSTOM, null, null, null, null, 30, null), paymentsItemDTO.getTrackingInfo());
        Boolean isSelected = paymentsItemDTO.isSelected();
        return new SelectPaymentVO(j11, paymentsItemDTO.getTrackingInfo(), icon, isSelected != null ? isSelected.booleanValue() : false, atomAction, title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectPaymentComponent widgetComponent$lambda$0(C7475g c7475g) {
        return SelectPaymentComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new SelectPaymentItemDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SelectPaymentVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SelectPaymentDTO, d, List<SelectPaymentVO>> getMapper() {
        return this.mapper;
    }

    public void getPayload(@NotNull SelectPaymentVO oldItem, @NotNull SelectPaymentVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SelectPaymentComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SelectPaymentComponent.class), new a(storage, 10));
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Object getPayload(c cVar, c cVar2) {
        getPayload((SelectPaymentVO) cVar, (SelectPaymentVO) cVar2);
        return Unit.f71690a;
    }
}
