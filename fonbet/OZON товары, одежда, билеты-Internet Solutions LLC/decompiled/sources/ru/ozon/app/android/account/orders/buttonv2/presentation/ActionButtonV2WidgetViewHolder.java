package ru.ozon.app.android.account.orders.buttonv2.presentation;

import Sc.o;
import WZ.l;
import WZ.t;
import XT.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.buttonv2.presentation.ActionTypeVO;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.cs_orders.databinding.WidgetActionButtonBinding;
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionButtonV2WidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionButtonV2VO;", "Lru/ozon/app/android/cs_orders/databinding/WidgetActionButtonBinding;", "binding", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "LWZ/l;", "tokenizedAnalytics", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetActionButtonBinding;Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;Lru/ozon/app/android/composer/ComposerNavigator;LWZ/l;Ll10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionButtonV2VO;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetActionButtonBinding;", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;", "Lru/ozon/app/android/composer/ComposerNavigator;", "LWZ/l;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionButtonV2WidgetViewHolder extends AbstractC6064a<ActionButtonV2VO> {

    @NotNull
    private final WidgetActionButtonBinding binding;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ActionButtonViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.orders.buttonv2.presentation.ActionButtonV2WidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            ActionButtonV2WidgetViewHolder.this.binding.csmaActionTv.setClickable(bool.booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonV2WidgetViewHolder(@NotNull WidgetActionButtonBinding binding, @NotNull ActionButtonViewModel viewModel, @NotNull ComposerNavigator navigator, @NotNull l tokenizedAnalytics, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.binding = binding;
        this.viewModel = viewModel;
        this.navigator = navigator;
        this.tokenizedAnalytics = tokenizedAnalytics;
        viewModel.getClickableAction().observe(this, new ActionButtonV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(ActionButtonV2VO actionButtonV2VO, ActionButtonV2WidgetViewHolder actionButtonV2WidgetViewHolder, View view) {
        t tokenizedEvent$default;
        Map<String, TokenizedTrackingInfo> trackingInfo = actionButtonV2VO.getTrackingInfo();
        if (trackingInfo != null && (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(actionButtonV2VO.getId()), null, 2, null)) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(actionButtonV2WidgetViewHolder.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
        }
        ActionTypeVO actionType = actionButtonV2VO.getActionType();
        if (actionType instanceof ActionTypeVO.MoveAction) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(actionButtonV2WidgetViewHolder.navigator, ((ActionTypeVO.MoveAction) actionButtonV2VO.getActionType()).getDeeplink(), null, 2, null);
        } else {
            if (!(actionType instanceof ActionTypeVO.ComposerAction)) {
                throw new o();
            }
            actionButtonV2WidgetViewHolder.viewModel.onButtonClick(((ActionTypeVO.ComposerAction) actionButtonV2VO.getActionType()).getName(), ((ActionTypeVO.ComposerAction) actionButtonV2VO.getActionType()).getParams());
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ActionButtonV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = this.binding.csmaActionTv;
        textView.setText(item.getTitle());
        textView.setEnabled(item.getIsEnabled());
        textView.setOnClickListener(new a(4, item, this));
    }
}
