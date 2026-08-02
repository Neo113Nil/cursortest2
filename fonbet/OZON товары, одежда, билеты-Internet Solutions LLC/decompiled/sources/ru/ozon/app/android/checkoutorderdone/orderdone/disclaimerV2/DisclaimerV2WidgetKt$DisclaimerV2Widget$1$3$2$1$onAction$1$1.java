package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2;

import T00.a;
import Tg.b;
import W10.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.presentation.DisclaimerV2VI;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTg/b;", "action", "", "invoke", "(LTg/b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$2$1$onAction$1$1 extends AbstractC7737t implements Function1<b, Boolean> {
    final /* synthetic */ CreateAndPayViewModel $createAndPayViewModel;
    final /* synthetic */ i<DisclaimerV2VI> $this_content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$2$1$onAction$1$1(CreateAndPayViewModel createAndPayViewModel, i<DisclaimerV2VI> iVar) {
        super(1);
        this.$createAndPayViewModel = createAndPayViewModel;
        this.$this_content = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(b action) {
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            if (Intrinsics.d(click.getId(), "csma_pay")) {
                CreateAndPayViewModel createAndPayViewModel = this.$createAndPayViewModel;
                String link = click.getLink();
                if (link != null && (params = click.getParams()) != null) {
                    String d11 = this.$this_content.getInfo().d();
                    String j11 = this.$this_content.getInfo().c().j();
                    a b11 = this.$this_content.getViewItem().c().b();
                    createAndPayViewModel.pay(link, params, new c(d11, j11, b11 != null ? b11.g() : null));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }
}
