package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import WZ.l;
import WZ.t;
import WZ.x;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.Y;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonV5WidgetViewHolder$bind$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CartButtonV5VO $item;
    final /* synthetic */ CartButtonV5VO $this_with;
    final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$bind$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ CartButtonV5VO $item;
        final /* synthetic */ CartButtonV5VO $this_with;
        final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$bind$1$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ CartButtonV5VO $this_with;
            final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder, CartButtonV5VO cartButtonV5VO) {
                super(0);
                this.this$0 = cartButtonV5WidgetViewHolder;
                this.$this_with = cartButtonV5VO;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
            /* JADX WARN: Removed duplicated region for block: B:46:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke2() {
                boolean z11;
                CartButtonV5DTO.CartButton.Button toCart;
                Map<String, TokenizedTrackingInfo> map;
                CartButtonV5DTO.CartButton.Button toCart2;
                AtomActionDTO atomActionDTO;
                AtomAction atomAction;
                AtomActionDTO action;
                boolean z12;
                t b11;
                l lVar;
                z11 = this.this$0.isRefresh;
                if (z11) {
                    return;
                }
                SwipeRefreshLayout composerSwipeRefresh = this.this$0.getComposerSwipeRefresh();
                if (composerSwipeRefresh != null && composerSwipeRefresh.isRefreshing()) {
                    return;
                }
                if (this.$this_with.getCartButton().getIsInCart()) {
                    toCart = this.$this_with.getCartButton().getInCart();
                    if (toCart == null) {
                        map = null;
                        if (map != null && (b11 = x.b(map, Long.valueOf(this.$this_with.getId()), null)) != null) {
                            lVar = this.this$0.tokenizedAnalytics;
                            TokenizedAnalyticsExtKt.processClickEvents(lVar, b11);
                        }
                        if (!this.$this_with.getCartButton().getIsInCart() && !this.$this_with.getCartButton().getToCart().isSubscribeButton() && this.$this_with.getCartButton().getInCart() != null) {
                            action = this.$this_with.getCartButton().getToCart().getAction();
                            if (Intrinsics.d(action == null ? action.getId() : null, "addToCart")) {
                                this.this$0.cartViewModel.addToCart(this.$this_with.getCartButton());
                                z12 = this.this$0.isRelatedBottomSheet;
                                if (z12) {
                                    this.this$0.handleRelatedAction();
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.$this_with.getCartButton().getIsInCart()) {
                            toCart2 = this.$this_with.getCartButton().getToCart();
                        } else {
                            toCart2 = this.$this_with.getCartButton().getInCart();
                            if (toCart2 == null) {
                                atomActionDTO = null;
                                if (atomActionDTO == null || (atomAction = AtomActionMapperKt.toAtomAction(atomActionDTO, null)) == null) {
                                    return;
                                }
                                this.this$0.actionHandler.invoke(atomAction);
                                return;
                            }
                        }
                        atomActionDTO = toCart2.getAction();
                        if (atomActionDTO == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    toCart = this.$this_with.getCartButton().getToCart();
                }
                map = toCart.getTrackingInfo();
                if (map != null) {
                    lVar = this.this$0.tokenizedAnalytics;
                    TokenizedAnalyticsExtKt.processClickEvents(lVar, b11);
                }
                if (!this.$this_with.getCartButton().getIsInCart()) {
                    action = this.$this_with.getCartButton().getToCart().getAction();
                    if (Intrinsics.d(action == null ? action.getId() : null, "addToCart")) {
                    }
                }
                if (this.$this_with.getCartButton().getIsInCart()) {
                }
                atomActionDTO = toCart2.getAction();
                if (atomActionDTO == null) {
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "event", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isView", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$bind$1$1$2$11, reason: invalid class name */
        static final class AnonymousClass11 extends AbstractC7737t implements Function2<Map<String, ? extends TokenizedTrackingInfo>, Boolean, Unit> {
            final /* synthetic */ CartButtonV5VO $this_with;
            final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass11(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder, CartButtonV5VO cartButtonV5VO) {
                super(2);
                this.this$0 = cartButtonV5WidgetViewHolder;
                this.$this_with = cartButtonV5VO;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends TokenizedTrackingInfo> map, Boolean bool) {
                invoke((Map<String, TokenizedTrackingInfo>) map, bool.booleanValue());
                return Unit.f71690a;
            }

            public final void invoke(Map<String, TokenizedTrackingInfo> map, boolean z11) {
                this.this$0.onTrackCloseEvent(map, this.$this_with.getId(), z11);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "event", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isView", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$bind$1$1$2$2, reason: invalid class name and collision with other inner class name */
        static final class C18132 extends AbstractC7737t implements Function2<Map<String, ? extends TokenizedTrackingInfo>, Boolean, Unit> {
            final /* synthetic */ CartButtonV5VO $this_with;
            final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18132(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder, CartButtonV5VO cartButtonV5VO) {
                super(2);
                this.this$0 = cartButtonV5WidgetViewHolder;
                this.$this_with = cartButtonV5VO;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends TokenizedTrackingInfo> map, Boolean bool) {
                invoke((Map<String, TokenizedTrackingInfo>) map, bool.booleanValue());
                return Unit.f71690a;
            }

            public final void invoke(Map<String, TokenizedTrackingInfo> map, boolean z11) {
                this.this$0.onTrackCloseEvent(map, this.$this_with.getId(), z11);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "event", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isView", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$bind$1$1$2$5, reason: invalid class name */
        static final class AnonymousClass5 extends AbstractC7737t implements Function2<Map<String, ? extends TokenizedTrackingInfo>, Boolean, Unit> {
            final /* synthetic */ CartButtonV5VO $this_with;
            final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder, CartButtonV5VO cartButtonV5VO) {
                super(2);
                this.this$0 = cartButtonV5WidgetViewHolder;
                this.$this_with = cartButtonV5VO;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends TokenizedTrackingInfo> map, Boolean bool) {
                invoke((Map<String, TokenizedTrackingInfo>) map, bool.booleanValue());
                return Unit.f71690a;
            }

            public final void invoke(Map<String, TokenizedTrackingInfo> map, boolean z11) {
                this.this$0.onTrackCloseEvent(map, this.$this_with.getId(), z11);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$bind$1$1$2$7, reason: invalid class name */
        static final class AnonymousClass7 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ CartButtonV5VO $this_with;
            final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder, CartButtonV5VO cartButtonV5VO) {
                super(0);
                this.this$0 = cartButtonV5WidgetViewHolder;
                this.$this_with = cartButtonV5VO;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
            /* JADX WARN: Removed duplicated region for block: B:52:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke2() {
                boolean z11;
                CartButtonV5DTO.CartButton.Button toCart;
                Map<String, TokenizedTrackingInfo> map;
                CartButtonV5DTO.CartButton.Button toCart2;
                AtomActionDTO atomActionDTO;
                AtomAction atomAction;
                boolean z12;
                AtomActionDTO action;
                t b11;
                l lVar;
                z11 = this.this$0.isRefresh;
                if (z11) {
                    return;
                }
                SwipeRefreshLayout composerSwipeRefresh = this.this$0.getComposerSwipeRefresh();
                if (composerSwipeRefresh != null && composerSwipeRefresh.isRefreshing()) {
                    return;
                }
                if (this.$this_with.getSecondCartButton().getIsInCart()) {
                    toCart = this.$this_with.getSecondCartButton().getInCart();
                    if (toCart == null) {
                        map = null;
                        if (map != null && (b11 = x.b(map, Long.valueOf(this.$this_with.getId()), null)) != null) {
                            lVar = this.this$0.tokenizedAnalytics;
                            TokenizedAnalyticsExtKt.processClickEvents(lVar, b11);
                        }
                        if (!this.$this_with.getSecondCartButton().getIsInCart()) {
                            CartButtonV5DTO.CartButton.Button inCart = this.$this_with.getSecondCartButton().getInCart();
                            if (!Intrinsics.d((inCart == null || (action = inCart.getAction()) == null) ? null : action.getId(), "subscribeToStock") && this.$this_with.getSecondCartButton().getInCart() != null) {
                                AtomActionDTO action2 = this.$this_with.getSecondCartButton().getToCart().getAction();
                                if (Intrinsics.d(action2 != null ? action2.getId() : null, "addToCart")) {
                                    this.this$0.cartViewModel.addToCart(this.$this_with.getSecondCartButton());
                                    z12 = this.this$0.isRelatedBottomSheet;
                                    if (z12) {
                                        this.this$0.handleRelatedAction();
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        if (this.$this_with.getSecondCartButton().getIsInCart()) {
                            toCart2 = this.$this_with.getSecondCartButton().getToCart();
                        } else {
                            toCart2 = this.$this_with.getSecondCartButton().getInCart();
                            if (toCart2 == null) {
                                atomActionDTO = null;
                                if (atomActionDTO == null || (atomAction = AtomActionMapperKt.toAtomAction(atomActionDTO, null)) == null) {
                                    return;
                                }
                                this.this$0.actionHandler.invoke(atomAction);
                                return;
                            }
                        }
                        atomActionDTO = toCart2.getAction();
                        if (atomActionDTO == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    toCart = this.$this_with.getSecondCartButton().getToCart();
                }
                map = toCart.getTrackingInfo();
                if (map != null) {
                    lVar = this.this$0.tokenizedAnalytics;
                    TokenizedAnalyticsExtKt.processClickEvents(lVar, b11);
                }
                if (!this.$this_with.getSecondCartButton().getIsInCart()) {
                }
                if (this.$this_with.getSecondCartButton().getIsInCart()) {
                }
                atomActionDTO = toCart2.getAction();
                if (atomActionDTO == null) {
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "event", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isView", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$bind$1$1$2$8, reason: invalid class name */
        static final class AnonymousClass8 extends AbstractC7737t implements Function2<Map<String, ? extends TokenizedTrackingInfo>, Boolean, Unit> {
            final /* synthetic */ CartButtonV5VO $this_with;
            final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder, CartButtonV5VO cartButtonV5VO) {
                super(2);
                this.this$0 = cartButtonV5WidgetViewHolder;
                this.$this_with = cartButtonV5VO;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends TokenizedTrackingInfo> map, Boolean bool) {
                invoke((Map<String, TokenizedTrackingInfo>) map, bool.booleanValue());
                return Unit.f71690a;
            }

            public final void invoke(Map<String, TokenizedTrackingInfo> map, boolean z11) {
                this.this$0.onTrackCloseEvent(map, this.$this_with.getId(), z11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder, CartButtonV5VO cartButtonV5VO, CartButtonV5VO cartButtonV5VO2) {
            super(0);
            this.this$0 = cartButtonV5WidgetViewHolder;
            this.$this_with = cartButtonV5VO;
            this.$item = cartButtonV5VO2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Integer, java.lang.Object, kotlin.jvm.functions.Function1] */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            boolean z11;
            boolean shouldAnimateSubtitle;
            Boolean isTitleAnimation;
            boolean shouldAnimateSubtitle2;
            Boolean isTitleAnimation2;
            int i11;
            ?? r22;
            CartButtonV5DTO.CartButton.Button.Tooltip tooltip;
            boolean shouldAnimateSubtitle3;
            Boolean isTitleAnimation3;
            boolean shouldAnimateSubtitle4;
            Boolean isTitleAnimation4;
            CartButtonV5DTO.CartButton.Button.Tooltip tooltip2;
            SwipeRefreshLayout composerSwipeRefresh;
            CartButtonV5View firstButtonView = this.this$0.firstButtonView(this.$this_with);
            z11 = this.this$0.isRefresh;
            boolean z12 = z11 && ((composerSwipeRefresh = this.this$0.getComposerSwipeRefresh()) == null || !composerSwipeRefresh.isRefreshing());
            firstButtonView.setOnClick(new AnonymousClass1(this.this$0, this.$this_with));
            if (this.$this_with.getCartButton().getIsInCart()) {
                CartButtonV5VO.CartButton cartButton = this.$this_with.getCartButton();
                CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder = this.this$0;
                CartButtonV5DTO.CartButton.Button inCart = this.$this_with.getCartButton().getInCart();
                shouldAnimateSubtitle4 = cartButtonV5WidgetViewHolder.shouldAnimateSubtitle(inCart != null ? inCart.getAnimationSubtitle() : null);
                isTitleAnimation4 = this.this$0.isTitleAnimation(this.$this_with.getCartButton(), true);
                CartButtonV5DTO.CartButton.Button inCart2 = this.$this_with.getCartButton().getInCart();
                firstButtonView.bind(cartButton, shouldAnimateSubtitle4, isTitleAnimation4, (inCart2 != null ? inCart2.getAsyncFetchType() : null) == CartButtonV5DTO.CartButton.Button.AsyncFetchType.SUBTITLE, z12, new C18132(this.this$0, this.$this_with));
                CartButtonV5DTO.CartButton.AdditionalButton additionalButton = this.$this_with.getCartButton().getAdditionalButton();
                if (additionalButton != null) {
                    CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder2 = this.this$0;
                    CartButtonV5VO cartButtonV5VO = this.$this_with;
                    CartButtonV5VO cartButtonV5VO2 = this.$item;
                    TextHolderKt.bind$default(cartButtonV5WidgetViewHolder2.view.getCounterView().getCounterText(), additionalButton.getPlaceholder(), null, 2, null);
                    ViewExtKt.bind$default(cartButtonV5WidgetViewHolder2.view.getCounterView().getDecrementIcon(), additionalButton.getDecrementButton().getIcon(), null, 2, null);
                    cartButtonV5WidgetViewHolder2.bindIncrementIcon(cartButtonV5WidgetViewHolder2.view.getCounterView().getIncrementIcon(), cartButtonV5VO.getCartButton());
                    ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.setOnClickListenerThrottle$default(cartButtonV5WidgetViewHolder2.view.getCounterView().getIncrementIcon(), 0L, new CartButtonV5WidgetViewHolder$bind$1$1$2$3$1(cartButtonV5WidgetViewHolder2, additionalButton, cartButtonV5VO2, cartButtonV5VO), 1, null);
                    ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.setOnClickListenerThrottle$default(cartButtonV5WidgetViewHolder2.view.getCounterView().getDecrementIcon(), 0L, new CartButtonV5WidgetViewHolder$bind$1$1$2$3$2(cartButtonV5WidgetViewHolder2, additionalButton, cartButtonV5VO2, cartButtonV5VO), 1, null);
                }
                CartButtonV5DTO.CartButton.Button inCart3 = this.$this_with.getCartButton().getInCart();
                if (inCart3 != null && (tooltip2 = inCart3.getTooltip()) != null) {
                    CartButtonV5ViewModel.showTooltip$default(this.this$0.cartViewModel, tooltip2, true, false, 4, null);
                }
            } else {
                CartButtonV5VO.CartButton cartButton2 = this.$this_with.getCartButton();
                shouldAnimateSubtitle = this.this$0.shouldAnimateSubtitle(this.$this_with.getCartButton().getToCart().getAnimationSubtitle());
                isTitleAnimation = this.this$0.isTitleAnimation(this.$this_with.getCartButton(), false);
                firstButtonView.bind(cartButton2, shouldAnimateSubtitle, isTitleAnimation, this.$this_with.getCartButton().getToCart().getAsyncFetchType() == CartButtonV5DTO.CartButton.Button.AsyncFetchType.SUBTITLE, z12, new AnonymousClass5(this.this$0, this.$this_with));
                CartButtonV5DTO.CartButton.Button.Tooltip tooltip3 = this.$this_with.getCartButton().getToCart().getTooltip();
                if (tooltip3 != null) {
                    CartButtonV5ViewModel.showTooltip$default(this.this$0.cartViewModel, tooltip3, true, false, 4, null);
                }
            }
            if (this.$this_with.getSecondCartButton() != null) {
                CartButtonV5View secondButtonView = this.this$0.secondButtonView(this.$this_with);
                if (secondButtonView != null) {
                    secondButtonView.setOnClick(new AnonymousClass7(this.this$0, this.$this_with));
                }
                if (this.$this_with.getSecondCartButton().getIsInCart()) {
                    if (secondButtonView != null) {
                        CartButtonV5VO.CartButton secondCartButton = this.$this_with.getSecondCartButton();
                        CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder3 = this.this$0;
                        CartButtonV5DTO.CartButton.Button inCart4 = this.$this_with.getSecondCartButton().getInCart();
                        shouldAnimateSubtitle3 = cartButtonV5WidgetViewHolder3.shouldAnimateSubtitle(inCart4 != null ? inCart4.getAnimationSubtitle() : null);
                        isTitleAnimation3 = this.this$0.isTitleAnimation(this.$this_with.getSecondCartButton(), true);
                        CartButtonV5DTO.CartButton.Button inCart5 = this.$this_with.getSecondCartButton().getInCart();
                        i11 = 2;
                        r22 = 0;
                        secondButtonView.bind(secondCartButton, shouldAnimateSubtitle3, isTitleAnimation3, (inCart5 != null ? inCart5.getAsyncFetchType() : null) == CartButtonV5DTO.CartButton.Button.AsyncFetchType.SUBTITLE, z12, new AnonymousClass8(this.this$0, this.$this_with));
                    } else {
                        i11 = 2;
                        r22 = 0;
                    }
                    CartButtonV5DTO.CartButton.AdditionalButton additionalButton2 = this.$this_with.getSecondCartButton().getAdditionalButton();
                    if (additionalButton2 != null) {
                        CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder4 = this.this$0;
                        CartButtonV5VO cartButtonV5VO3 = this.$this_with;
                        CartButtonV5VO cartButtonV5VO4 = this.$item;
                        TextHolderKt.bind$default(cartButtonV5WidgetViewHolder4.view.getCounterView().getCounterText(), additionalButton2.getPlaceholder(), r22, i11, r22);
                        ViewExtKt.bind$default(cartButtonV5WidgetViewHolder4.view.getCounterView().getDecrementIcon(), additionalButton2.getDecrementButton().getIcon(), r22, i11, r22);
                        cartButtonV5WidgetViewHolder4.bindIncrementIcon(cartButtonV5WidgetViewHolder4.view.getCounterView().getIncrementIcon(), cartButtonV5VO3.getSecondCartButton());
                        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.setOnClickListenerThrottle$default(cartButtonV5WidgetViewHolder4.view.getCounterView().getIncrementIcon(), 0L, new CartButtonV5WidgetViewHolder$bind$1$1$2$9$1(cartButtonV5WidgetViewHolder4, additionalButton2, cartButtonV5VO4, cartButtonV5VO3), 1, null);
                        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.setOnClickListenerThrottle$default(cartButtonV5WidgetViewHolder4.view.getCounterView().getDecrementIcon(), 0L, new CartButtonV5WidgetViewHolder$bind$1$1$2$9$2(cartButtonV5WidgetViewHolder4, additionalButton2, cartButtonV5VO4, cartButtonV5VO3), 1, null);
                    }
                    CartButtonV5DTO.CartButton.Button inCart6 = this.$this_with.getSecondCartButton().getInCart();
                    if (inCart6 != null && (tooltip = inCart6.getTooltip()) != null) {
                        CartButtonV5ViewModel.showTooltip$default(this.this$0.cartViewModel, tooltip, false, true, 2, null);
                    }
                } else {
                    if (secondButtonView != null) {
                        CartButtonV5VO.CartButton secondCartButton2 = this.$this_with.getSecondCartButton();
                        shouldAnimateSubtitle2 = this.this$0.shouldAnimateSubtitle(this.$this_with.getSecondCartButton().getToCart().getAnimationSubtitle());
                        isTitleAnimation2 = this.this$0.isTitleAnimation(this.$this_with.getSecondCartButton(), false);
                        secondButtonView.bind(secondCartButton2, shouldAnimateSubtitle2, isTitleAnimation2, this.$this_with.getSecondCartButton().getToCart().getAsyncFetchType() == CartButtonV5DTO.CartButton.Button.AsyncFetchType.SUBTITLE, z12, new AnonymousClass11(this.this$0, this.$this_with));
                    }
                    CartButtonV5DTO.CartButton.Button.Tooltip tooltip4 = this.$this_with.getSecondCartButton().getToCart().getTooltip();
                    if (tooltip4 != null) {
                        CartButtonV5ViewModel.showTooltip$default(this.this$0.cartViewModel, tooltip4, false, true, 2, null);
                    }
                }
            }
            this.this$0.cartViewModel.fetchData(this.$item, this.this$0.getTrackingData());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5WidgetViewHolder$bind$1$1(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder, CartButtonV5VO cartButtonV5VO, CartButtonV5VO cartButtonV5VO2) {
        super(0);
        this.this$0 = cartButtonV5WidgetViewHolder;
        this.$this_with = cartButtonV5VO;
        this.$item = cartButtonV5VO2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01fe, code lost:
    
        if (r8 != (r5 != null ? r5.bottomMargin : 0)) goto L92;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2() {
        int resId;
        String backgroundColor;
        CornerRadius cornerRadius;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean hasAnimatedSubtitle;
        View stickyRelatedPlaceholderView;
        CartButtonV5VO.CartButton secondCartButton;
        this.this$0.view.reSetupButtonsIfNeeded(this.$this_with.getButtonConfiguration(), this.this$0.firstButtonView(this.$this_with), this.this$0.secondButtonView(this.$this_with));
        this.this$0.view.updateSticky(this.$this_with.getIsStickyTransparent(), this.$this_with.getStickyCornerRadius());
        if (this.$this_with.getCartButton().getIsInCart() || ((secondCartButton = this.$this_with.getSecondCartButton()) != null && secondCartButton.getIsInCart())) {
            CartButtonV5CounterView counterView = this.this$0.view.getCounterView();
            Context context = this.this$0.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CartButtonV5DTO.CartButton.AdditionalButton additionalButton = this.$this_with.getCartButton().getAdditionalButton();
            float dpf_24 = (additionalButton == null || (cornerRadius = additionalButton.getCornerRadius()) == null) ? Dimens.INSTANCE.getDPF_24() : UiExtKt.toPxF(cornerRadius.getPx());
            CornersConfig cornersConfig = CornersConfig.ALL;
            CartButtonV5DTO.CartButton.AdditionalButton additionalButton2 = this.$this_with.getCartButton().getAdditionalButton();
            if (additionalButton2 != null && (backgroundColor = additionalButton2.getBackgroundColor()) != null) {
                CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder = this.this$0;
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context2 = cartButtonV5WidgetViewHolder.view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Integer mapColor = styleParser.mapColor(context2, backgroundColor);
                if (mapColor != null) {
                    resId = mapColor.intValue();
                    counterView.setBackground(ContextExtKt.createRoundRectShape$default(context, dpf_24, cornersConfig, resId, 0, null, 24, null));
                }
            }
            resId = UniColors.BRAND_SELECT_SELECT_GRAY_50.getResId();
            counterView.setBackground(ContextExtKt.createRoundRectShape$default(context, dpf_24, cornersConfig, resId, 0, null, 24, null));
        }
        this.this$0.view.updateButtonsIfNeeded((this.$this_with.getSecondCartButton() == null && this.$this_with.getCartButton().getToCart().isSubscribeButton()) ? CartButtonsV5ContainerState.SINGLE : (this.$this_with.getSecondCartButton() == null && this.$this_with.getCartButton().getIsInCart()) ? CartButtonsV5ContainerState.SINGLE_COUNTER : (this.$this_with.getSecondCartButton() != null || this.$this_with.getCartButton().getIsInCart()) ? (this.$this_with.getSecondCartButton() == null || !this.$this_with.getCartButton().getIsInCart()) ? (this.$this_with.getSecondCartButton() == null || this.$this_with.getCartButton().getIsInCart() || !this.$this_with.getSecondCartButton().getIsInCart()) ? CartButtonsV5ContainerState.DOUBLE_BUTTONS : CartButtonsV5ContainerState.DOUBLE_SECOND : CartButtonsV5ContainerState.DOUBLE_FIRST : CartButtonsV5ContainerState.SINGLE, new AnonymousClass2(this.this$0, this.$this_with, this.$item));
        z11 = this.this$0.isRelatedBottomSheet;
        if (z11) {
            CartButtonV5ButtonsContainerViewGroup cartButtonV5ButtonsContainerViewGroup = this.this$0.view;
            final CartButtonV5VO cartButtonV5VO = this.$this_with;
            final CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder2 = this.this$0;
            int i11 = Y.f42258g;
            if (!cartButtonV5ButtonsContainerViewGroup.isLaidOut() || cartButtonV5ButtonsContainerViewGroup.isLayoutRequested()) {
                cartButtonV5ButtonsContainerViewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$bind$1$1$invoke$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        View stickyRelatedPlaceholderView2;
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        CartButtonV5VO.RelatedProductsCurtainVO relatedProduct = CartButtonV5VO.this.getRelatedProduct();
                        if (relatedProduct != null) {
                            cartButtonV5WidgetViewHolder2.getBottomSheetView().bind(relatedProduct.getTrackingInfo(), relatedProduct.getLink());
                        }
                        stickyRelatedPlaceholderView2 = cartButtonV5WidgetViewHolder2.getStickyRelatedPlaceholderView();
                        ViewGroup.LayoutParams layoutParams = stickyRelatedPlaceholderView2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        if (marginLayoutParams == null) {
                            return;
                        }
                        int i12 = marginLayoutParams.leftMargin;
                        int i13 = marginLayoutParams.topMargin;
                        int i14 = marginLayoutParams.rightMargin;
                        int i15 = marginLayoutParams.bottomMargin;
                        marginLayoutParams.bottomMargin = cartButtonV5WidgetViewHolder2.view.getHeight();
                        if (i12 == marginLayoutParams.leftMargin) {
                            ViewGroup.LayoutParams layoutParams2 = stickyRelatedPlaceholderView2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            if (i13 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                                ViewGroup.LayoutParams layoutParams3 = stickyRelatedPlaceholderView2.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                                if (i14 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                                    ViewGroup.LayoutParams layoutParams4 = stickyRelatedPlaceholderView2.getLayoutParams();
                                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                                    if (i15 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                                        return;
                                    }
                                }
                            }
                        }
                        stickyRelatedPlaceholderView2.setLayoutParams(marginLayoutParams);
                    }
                });
            } else {
                CartButtonV5VO.RelatedProductsCurtainVO relatedProduct = cartButtonV5VO.getRelatedProduct();
                if (relatedProduct != null) {
                    cartButtonV5WidgetViewHolder2.getBottomSheetView().bind(relatedProduct.getTrackingInfo(), relatedProduct.getLink());
                }
                stickyRelatedPlaceholderView = cartButtonV5WidgetViewHolder2.getStickyRelatedPlaceholderView();
                ViewGroup.LayoutParams layoutParams = stickyRelatedPlaceholderView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    int i12 = marginLayoutParams.leftMargin;
                    int i13 = marginLayoutParams.topMargin;
                    int i14 = marginLayoutParams.rightMargin;
                    int i15 = marginLayoutParams.bottomMargin;
                    marginLayoutParams.bottomMargin = cartButtonV5WidgetViewHolder2.view.getHeight();
                    if (i12 == marginLayoutParams.leftMargin) {
                        ViewGroup.LayoutParams layoutParams2 = stickyRelatedPlaceholderView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        if (i13 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams3 = stickyRelatedPlaceholderView.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                            if (i14 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                                ViewGroup.LayoutParams layoutParams4 = stickyRelatedPlaceholderView.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                            }
                        }
                    }
                    stickyRelatedPlaceholderView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        if (this.$this_with.getRelatedProduct() != null) {
            CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder3 = this.this$0;
            cartButtonV5WidgetViewHolder3.getBottomSheetView().updateHeaderView(cartButtonV5WidgetViewHolder3.view);
        }
        z12 = this.this$0.isReloadFromRefresh;
        if (!z12) {
            hasAnimatedSubtitle = this.this$0.hasAnimatedSubtitle(this.$item);
            if (hasAnimatedSubtitle) {
                this.this$0.cartViewModel.markAsyncDataShown();
            }
        }
        this.this$0.isRefresh = false;
        z13 = this.this$0.isAfterData;
        if (z13) {
            this.this$0.isReloadFromRefresh = false;
        }
    }
}
