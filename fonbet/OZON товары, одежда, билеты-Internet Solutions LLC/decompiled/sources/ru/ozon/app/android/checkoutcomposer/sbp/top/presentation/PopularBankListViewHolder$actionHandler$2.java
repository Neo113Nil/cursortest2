package ru.ozon.app.android.checkoutcomposer.sbp.top.presentation;

import Vg.c;
import Vg.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.payment.ui.changepaymentmethodandpay.ChangePaymentMethodAndPayActionHandler;
import ru.ozon.app.android.payment.ui.createOrderV2.CreateOrderV2ActionHandler;
import ru.ozon.app.android.payment.ui.createorder.CreateOrderActionHandler;
import ru.ozon.app.android.payment.ui.createpayment.CreatePaymentActionHandler;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceActionHandler;
import ru.ozon.app.android.payment.ui.fastPay.linkFastPay.LinkFastPayActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PopularBankListViewHolder$actionHandler$2 extends AbstractC7737t implements Function0<Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ d $customActionHandlersStoreFactory;
    final /* synthetic */ PopularBankListViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutcomposer.sbp.top.presentation.PopularBankListViewHolder$actionHandler$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<c> {
        final /* synthetic */ d $customActionHandlersStoreFactory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(d dVar) {
            super(0);
            this.$customActionHandlersStoreFactory = dVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final c invoke() {
            return this.$customActionHandlersStoreFactory.create(CreateOrderActionHandler.class, CreatePaymentActionHandler.class, CreateOrderV2ActionHandler.class, CreateServiceActionHandler.class, ChangePaymentMethodAndPayActionHandler.class, LinkFastPayActionHandler.class);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.sbp.top.presentation.PopularBankListViewHolder$actionHandler$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AtomAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PopularBankListViewHolder$actionHandler$2(PopularBankListViewHolder popularBankListViewHolder, d dVar) {
        super(0);
        this.this$0 = popularBankListViewHolder;
        this.$customActionHandlersStoreFactory = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super AtomAction, ? extends Unit> invoke() {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.refs;
        return new ActionHandler.Builder(composerReferences, this.this$0).customActionHandlers(new AnonymousClass1(this.$customActionHandlersStoreFactory)).customAnalyticHandler(AnonymousClass2.INSTANCE).buildHandler();
    }
}
