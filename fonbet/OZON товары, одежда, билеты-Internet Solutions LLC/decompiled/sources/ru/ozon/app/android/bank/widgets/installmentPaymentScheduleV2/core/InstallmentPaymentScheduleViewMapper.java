package ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.core;

import Sc.InterfaceC4008j;
import Sc.k;
import android.view.View;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.R$layout;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.data.InstallmentPaymentScheduleDTO;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.di.InstallmentPaymentScheduleWidgetComponent;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation.InstallmentPaymentScheduleVO;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation.InstallmentPaymentScheduleViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/core/InstallmentPaymentScheduleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/di/InstallmentPaymentScheduleWidgetComponent;", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/data/InstallmentPaymentScheduleDTO;", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/core/InstallmentPaymentScheduleMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/core/InstallmentPaymentScheduleMapper;", "mapper", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InstallmentPaymentScheduleViewMapper extends WidgetViewMapper2<InstallmentPaymentScheduleWidgetComponent, InstallmentPaymentScheduleDTO, InstallmentPaymentScheduleVO> {
    private final int layout = R$layout.widget_installment_payment_schedule;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper = k.b(InstallmentPaymentScheduleViewMapper$mapper$2.INSTANCE);

    @NotNull
    private final Function2<View, ComposerReferences, InstallmentPaymentScheduleViewHolder> holderProducer = new InstallmentPaymentScheduleViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, InstallmentPaymentScheduleViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<InstallmentPaymentScheduleWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return InstallmentPaymentScheduleWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public InstallmentPaymentScheduleMapper getMapper() {
        return (InstallmentPaymentScheduleMapper) this.mapper.getValue();
    }
}
