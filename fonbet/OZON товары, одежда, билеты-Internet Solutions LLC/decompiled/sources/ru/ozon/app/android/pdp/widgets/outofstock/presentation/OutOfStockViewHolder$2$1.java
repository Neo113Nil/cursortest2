package ru.ozon.app.android.pdp.widgets.outofstock.presentation;

import WZ.t;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.pdp.databinding.PdpWidgetOutOfStockBinding;
import ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/PdpWidgetOutOfStockBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OutOfStockViewHolder$2$1 extends AbstractC7737t implements Function1<PdpWidgetOutOfStockBinding, Unit> {
    final /* synthetic */ ComposerReferences $this_with;
    final /* synthetic */ OutOfStockViewModel $viewModel;
    final /* synthetic */ OutOfStockViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockViewHolder$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<View, Unit> {
        final /* synthetic */ ComposerReferences $this_with;
        final /* synthetic */ OutOfStockViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(OutOfStockViewHolder outOfStockViewHolder, ComposerReferences composerReferences) {
            super(1);
            this.this$0 = outOfStockViewHolder;
            this.$this_with = composerReferences;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            OutOfStockVO outOfStockVO;
            OutOfStockVO outOfStockVO2;
            t widget;
            Intrinsics.checkNotNullParameter(it, "it");
            outOfStockVO = this.this$0.item;
            if (outOfStockVO == null) {
                Intrinsics.n("item");
                throw null;
            }
            OutOfStockVO.TrackingInfo trackingInfo = outOfStockVO.getTrackingInfo();
            if (trackingInfo != null && (widget = trackingInfo.getWidget()) != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.$this_with.getTokenizedAnalytics(), widget, null, 2, null);
            }
            ComposerNavigator navigator = this.$this_with.getNavigator();
            outOfStockVO2 = this.this$0.item;
            if (outOfStockVO2 != null) {
                ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, outOfStockVO2.getDeeplink(), null, 2, null);
            } else {
                Intrinsics.n("item");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockViewHolder$2$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<View, Unit> {
        final /* synthetic */ ComposerReferences $this_with;
        final /* synthetic */ OutOfStockViewModel $viewModel;
        final /* synthetic */ OutOfStockViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(OutOfStockViewHolder outOfStockViewHolder, ComposerReferences composerReferences, OutOfStockViewModel outOfStockViewModel) {
            super(1);
            this.this$0 = outOfStockViewHolder;
            this.$this_with = composerReferences;
            this.$viewModel = outOfStockViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            OutOfStockVO outOfStockVO;
            OutOfStockVO outOfStockVO2;
            OutOfStockVO outOfStockVO3;
            OutOfStockVO outOfStockVO4;
            OutOfStockVO outOfStockVO5;
            OutOfStockVO outOfStockVO6;
            Intrinsics.checkNotNullParameter(it, "it");
            outOfStockVO = this.this$0.item;
            if (outOfStockVO == null) {
                Intrinsics.n("item");
                throw null;
            }
            if (outOfStockVO.getIsInCart()) {
                ComposerNavigator navigator = this.$this_with.getNavigator();
                String uri = LinkGenerator.INSTANCE.cart().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
                return;
            }
            OutOfStockViewModel outOfStockViewModel = this.$viewModel;
            outOfStockVO2 = this.this$0.item;
            if (outOfStockVO2 == null) {
                Intrinsics.n("item");
                throw null;
            }
            long id2 = outOfStockVO2.getId();
            outOfStockVO3 = this.this$0.item;
            if (outOfStockVO3 == null) {
                Intrinsics.n("item");
                throw null;
            }
            long sku = outOfStockVO3.getSku();
            outOfStockVO4 = this.this$0.item;
            if (outOfStockVO4 == null) {
                Intrinsics.n("item");
                throw null;
            }
            Map<String, TokenizedTrackingInfo> rawTrackingInfo = outOfStockVO4.getRawTrackingInfo();
            outOfStockVO5 = this.this$0.item;
            if (outOfStockVO5 == null) {
                Intrinsics.n("item");
                throw null;
            }
            Map<String, String> params = outOfStockVO5.getParams();
            outOfStockVO6 = this.this$0.item;
            if (outOfStockVO6 == null) {
                Intrinsics.n("item");
                throw null;
            }
            outOfStockViewModel.addToCart(id2, sku, rawTrackingInfo, params, outOfStockVO6.getSelectedDeliverySchema() != null ? Long.valueOf(r12.intValue()) : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutOfStockViewHolder$2$1(OutOfStockViewHolder outOfStockViewHolder, ComposerReferences composerReferences, OutOfStockViewModel outOfStockViewModel) {
        super(1);
        this.this$0 = outOfStockViewHolder;
        this.$this_with = composerReferences;
        this.$viewModel = outOfStockViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$0(OutOfStockViewHolder outOfStockViewHolder, View view, MotionEvent motionEvent) {
        OutOfStockVO outOfStockVO;
        AtomActionDTO action;
        AtomAction atomAction;
        Function1 function1;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        outOfStockVO = outOfStockViewHolder.item;
        if (outOfStockVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        OutOfStockVO.SellerInfo sellerInfo = outOfStockVO.getSellerInfo();
        if (sellerInfo == null || (action = sellerInfo.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, null)) == null) {
            return false;
        }
        function1 = outOfStockViewHolder.actionHandler;
        function1.invoke(atomAction);
        return false;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetOutOfStockBinding pdpWidgetOutOfStockBinding) {
        invoke2(pdpWidgetOutOfStockBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpWidgetOutOfStockBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        TextAtomV2View textAtomV2View = binding.sellerAtom;
        final OutOfStockViewHolder outOfStockViewHolder = this.this$0;
        textAtomV2View.setOnTouchListener(new View.OnTouchListener() { // from class: ru.ozon.app.android.pdp.widgets.outofstock.presentation.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean invoke$lambda$0;
                invoke$lambda$0 = OutOfStockViewHolder$2$1.invoke$lambda$0(OutOfStockViewHolder.this, view, motionEvent);
                return invoke$lambda$0;
            }
        });
        CardView cardCv = binding.cardCv;
        Intrinsics.checkNotNullExpressionValue(cardCv, "cardCv");
        ViewExtKt.setOnClickListenerThrottle$default(cardCv, 0L, new AnonymousClass2(this.this$0, this.$this_with), 1, null);
        TextView cartBtn = binding.cartBtn;
        Intrinsics.checkNotNullExpressionValue(cartBtn, "cartBtn");
        ViewExtKt.setOnClickListenerThrottle$default(cartBtn, 0L, new AnonymousClass3(this.this$0, this.$this_with, this.$viewModel), 1, null);
    }
}
