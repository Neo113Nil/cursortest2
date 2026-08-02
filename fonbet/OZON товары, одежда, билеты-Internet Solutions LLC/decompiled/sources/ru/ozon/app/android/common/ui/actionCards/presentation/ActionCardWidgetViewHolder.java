package ru.ozon.app.android.common.ui.actionCards.presentation;

import FG.a;
import W10.c;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.ui.actionCards.databinding.WidgetActionCardBinding;
import ru.ozon.app.android.common.ui.actionCards.presentation.CardVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 +2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001+B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000e0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/common/ui/actionCards/presentation/ActionCardWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "", "buttonWidth", "", "bindButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;I)V", "Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO$MarginModel;", "marginModel", "setCardMargin", "(Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO$MarginModel;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/common/ui/actionCards/databinding/WidgetActionCardBinding;", "binding", "Lru/ozon/app/android/common/ui/actionCards/databinding/WidgetActionCardBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "action-cards_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionCardWidgetViewHolder extends k<CardVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int buttonMaxWidth = UiExtKt.toPx(126);
    private static final int cornerRadius = UiExtKt.toPx(6);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetActionCardBinding binding;

    @NotNull
    private final ComposerReferences ref;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/common/ui/actionCards/presentation/ActionCardWidgetViewHolder$Companion;", "", "<init>", "()V", "action-cards_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionCardWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.ref = ref;
        WidgetActionCardBinding bind = WidgetActionCardBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        containerView.setClipToOutline(true);
        containerView.setOnClickListener(new a(this, 14));
    }

    private final void bindButton(ButtonV3Atom.SmallButton button, int buttonWidth) {
        SmallButtonView smallButtonView = this.binding.buttonSbv;
        Intrinsics.f(smallButtonView);
        ViewGroup.LayoutParams layoutParams = smallButtonView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = Math.min(buttonWidth, buttonMaxWidth);
        smallButtonView.setLayoutParams(layoutParams);
        WrappedButtonHolderKt.bind(smallButtonView, button, this.actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(ActionCardWidgetViewHolder actionCardWidgetViewHolder, View view) {
        AtomAction action;
        CardVO boundedData = actionCardWidgetViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        actionCardWidgetViewHolder.actionHandler.invoke(action);
    }

    private final void setCardMargin(CardVO.MarginModel marginModel) {
        ViewGroup.LayoutParams layoutParams = this.binding.cardContainerCl.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(layoutParams2.leftMargin, marginModel.getTop(), layoutParams2.rightMargin, marginModel.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CardVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetActionCardBinding widgetActionCardBinding = this.binding;
        ImageView imageIv = widgetActionCardBinding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        ImageViewExtKt.load$default(imageIv, item.getImage(), C7714v.a0(new ImageTransformation.RoundedCorners(cornerRadius, null, 2, null)), null, null, null, false, null, 124, null);
        TextAtomView titleTav = widgetActionCardBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextAtomHolderKt.bind$default(titleTav, item.getTitle(), null, 2, null);
        TextAtomView subtitleTav = widgetActionCardBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextAtomHolderKt.bind$default(subtitleTav, item.getSubtitle(), null, 2, null);
        bindButton(item.getButton(), item.getButtonWidth());
        setCardMargin(item.getMarginModel());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CardVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
