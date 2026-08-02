package ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation.CartItemParams;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PromoOfferViewHolder$actionHandler$2 extends AbstractC7737t implements Function0<Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ PromoOfferViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation.PromoOfferViewHolder$actionHandler$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
        final /* synthetic */ PromoOfferViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PromoOfferViewHolder promoOfferViewHolder) {
            super(1);
            this.this$0 = promoOfferViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
            invoke2(composerAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction.ComposerAction it) {
            Map<String, String> params;
            String str;
            String str2;
            PromoOfferViewModel promoOfferViewModel;
            String str3;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!Intrinsics.d(it.getId(), "addToCart") || (params = it.getParams()) == null || (str = params.get("id")) == null) {
                return;
            }
            long parseLong = Long.parseLong(str);
            Map<String, String> params2 = it.getParams();
            if (params2 == null || (str2 = params2.get("quantity")) == null) {
                return;
            }
            int parseInt = Integer.parseInt(str2);
            Map<String, String> params3 = it.getParams();
            Long valueOf = (params3 == null || (str3 = params3.get("selectedDeliverySchema")) == null) ? null : Long.valueOf(Long.parseLong(str3));
            promoOfferViewModel = this.this$0.viewModel;
            Long l11 = null;
            Map<String, TokenizedTrackingInfo> trackingInfo = it.getTrackingInfo();
            PromoOfferVO boundedData = this.this$0.getBoundedData();
            if (boundedData != null) {
                l11 = Long.valueOf(boundedData.getId());
            }
            promoOfferViewModel.addToCart(new CartItemParams(parseLong, parseInt, valueOf, trackingInfo, l11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoOfferViewHolder$actionHandler$2(PromoOfferViewHolder promoOfferViewHolder) {
        super(0);
        this.this$0 = promoOfferViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super AtomAction, ? extends Unit> invoke() {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.refs;
        return new ActionHandler.Builder(composerReferences, this.this$0).onComposerAction(new AnonymousClass1(this.this$0)).buildHandler();
    }
}
