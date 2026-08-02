package ru.ozon.app.android.partpayment.contractbtn;

import GS.a;
import GZ.g;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.WidgetContractBtnBinding;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/partpayment/contractbtn/ContractBtnWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/partpayment/contractbtn/ContractBtnVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LGZ/g;", "screenRouter", "<init>", "(Landroid/view/View;LGZ/g;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/partpayment/contractbtn/ContractBtnVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "LGZ/g;", "", "deeplink", "Ljava/lang/String;", "Lru/ozon/app/android/partpayment/databinding/WidgetContractBtnBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/WidgetContractBtnBinding;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContractBtnWidgetViewHolder extends k<ContractBtnVO> {

    @NotNull
    private final WidgetContractBtnBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private String deeplink;

    @NotNull
    private final g screenRouter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractBtnWidgetViewHolder(@NotNull View containerView, @NotNull g screenRouter) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        this.containerView = containerView;
        this.screenRouter = screenRouter;
        this.deeplink = "";
        WidgetContractBtnBinding bind = WidgetContractBtnBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.partPaymentBtn.setOnClickListener(new a(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ContractBtnWidgetViewHolder contractBtnWidgetViewHolder, View view) {
        g.a.a(contractBtnWidgetViewHolder.screenRouter, contractBtnWidgetViewHolder.deeplink, null, null, 6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ContractBtnVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.deeplink = item.getDeeplink();
        this.binding.partPaymentBtn.setText(item.getTitle());
    }
}
