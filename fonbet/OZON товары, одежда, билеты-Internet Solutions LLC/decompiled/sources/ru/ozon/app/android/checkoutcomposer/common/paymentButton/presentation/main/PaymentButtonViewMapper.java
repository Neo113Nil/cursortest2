package ru.ozon.app.android.checkoutcomposer.common.paymentButton.presentation.main;

import Ih.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkoutcomposer.common.paymentButton.models.PaymentButtonDTO;
import ru.ozon.app.android.checkoutcomposer.common.paymentButton.models.PaymentButtonVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR2\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R2\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00180\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/paymentButton/presentation/main/PaymentButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/common/paymentButton/models/PaymentButtonDTO;", "Lru/ozon/app/android/checkoutcomposer/common/paymentButton/models/PaymentButtonVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/checkoutcomposer/common/paymentButton/models/PaymentButtonDTO;Ljava/lang/String;)Lru/ozon/app/android/checkoutcomposer/common/paymentButton/models/PaymentButtonVO;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentButtonViewMapper extends WidgetViewMapper<PaymentButtonDTO, PaymentButtonVO> {

    @NotNull
    private final Function2<PaymentButtonDTO, d, List<PaymentButtonVO>> mapper = new PaymentButtonViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_payment_button;

    @NotNull
    private final Function2<View, ComposerReferences, k<PaymentButtonVO>> holderProducer = PaymentButtonViewMapper$holderProducer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentButtonVO toVO(PaymentButtonDTO paymentButtonDTO, String str) {
        if ((!paymentButtonDTO.isSticky() ? paymentButtonDTO : null) != null) {
            return new PaymentButtonVO(a.a("PaymentButtonWidget", str), paymentButtonDTO.getButton());
        }
        return null;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<PaymentButtonVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PaymentButtonDTO, d, List<PaymentButtonVO>> getMapper() {
        return this.mapper;
    }
}
