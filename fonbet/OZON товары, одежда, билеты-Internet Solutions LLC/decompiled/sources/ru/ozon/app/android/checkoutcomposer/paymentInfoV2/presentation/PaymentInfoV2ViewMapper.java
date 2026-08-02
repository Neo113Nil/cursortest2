package ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.data.PaymentInfoV2DTO;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.di.PaymentInfoV2WidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R2\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR,\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/data/PaymentInfoV2DTO;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/di/PaymentInfoV2WidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/di/PaymentInfoV2WidgetComponent;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO;Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO;)Ljava/lang/Object;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/di/PaymentInfoV2WidgetComponent;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "", "getMapper", "mapper", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentInfoV2ViewMapper extends WidgetViewMapper<PaymentInfoV2DTO, PaymentInfoV2VO> {

    @NotNull
    private final PaymentInfoV2WidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<PaymentInfoV2VO>> holderProducer;
    private final Integer layout;

    public PaymentInfoV2ViewMapper(@NotNull PaymentInfoV2WidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.holderProducer = new PaymentInfoV2ViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new WidgetPaymentInfoV2View(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<PaymentInfoV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PaymentInfoV2DTO, d, List<PaymentInfoV2VO>> getMapper() {
        return this.component.getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull PaymentInfoV2VO oldItem, @NotNull PaymentInfoV2VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }
}
