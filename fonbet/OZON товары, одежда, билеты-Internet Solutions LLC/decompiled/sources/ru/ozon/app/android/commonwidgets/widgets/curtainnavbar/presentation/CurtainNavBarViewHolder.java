package ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation;

import AI.a;
import AI.b;
import Dc0.j;
import Sc.o;
import Vg.d;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.filterWidgets.curtain.CurtainNavBarLabelTextView;
import ru.ozon.app.android.commonwidgets.databinding.WidgetCurtainNavBarBinding;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonWithIconView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonWithIconHolderKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 :2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001:B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010 J\u0013\u0010%\u001a\u00020$*\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010&J#\u0010+\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00022\n\u0010*\u001a\u00060(j\u0002`)H\u0014¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010'\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00105R \u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u0012068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;)V", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar;", "bar", "", "bindTitle", "(Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar;)V", "bindSubtitle", "bindActionLeft", "bindActionRight", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "button", "bindLeftButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;)V", "bindRightButton", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$BarAction;", "action", "handleAction", "(Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$BarAction;)V", "doDismiss", "()V", "doRefresh", "Lru/ozon/app/android/common/filterWidgets/curtain/CurtainNavBarLabelTextView$Type;", "type", "(Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar;)Lru/ozon/app/android/common/filterWidgets/curtain/CurtainNavBarLabelTextView$Type;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/commonwidgets/databinding/WidgetCurtainNavBarBinding;", "binding", "Lru/ozon/app/android/commonwidgets/databinding/WidgetCurtainNavBarBinding;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CurtainNavBarViewHolder extends k<CurtainNavBarVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCurtainNavBarBinding binding;

    @NotNull
    private final View containerView;
    private CurtainNavBarVO item;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarViewHolder$Companion;", "", "<init>", "()V", "ACTION_ID_DISMISS", "", "ACTION_ID_REFRESH", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurtainNavBarViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.ref = ref;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetCurtainNavBarBinding bind = WidgetCurtainNavBarBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new CurtainNavBarViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        bind.actionLeftIv.setOnClickListener(new a(this, 15));
        bind.actionLeftTv.setOnClickListener(new b(this, 18));
        bind.actionRightIv.setOnClickListener(new j(this, 11));
        bind.actionRightTv.setOnClickListener(new CC.a(this, 16));
        bind.actionDrawableIv.setOnClickListener(new CD.a(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CurtainNavBarViewHolder curtainNavBarViewHolder, View view) {
        CurtainNavBarVO.CurtainBar curtainBar;
        CurtainNavBarVO.ActionLeft actionLeft;
        CurtainNavBarVO curtainNavBarVO = curtainNavBarViewHolder.item;
        if (curtainNavBarVO == null || (curtainBar = curtainNavBarVO.getCurtainBar()) == null || (actionLeft = curtainBar.getActionLeft()) == null) {
            return;
        }
        curtainNavBarViewHolder.handleAction(actionLeft);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(CurtainNavBarViewHolder curtainNavBarViewHolder, View view) {
        CurtainNavBarVO.CurtainBar curtainBar;
        CurtainNavBarVO.ActionLeft actionLeft;
        CurtainNavBarVO curtainNavBarVO = curtainNavBarViewHolder.item;
        if (curtainNavBarVO == null || (curtainBar = curtainNavBarVO.getCurtainBar()) == null || (actionLeft = curtainBar.getActionLeft()) == null) {
            return;
        }
        curtainNavBarViewHolder.handleAction(actionLeft);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(CurtainNavBarViewHolder curtainNavBarViewHolder, View view) {
        CurtainNavBarVO.CurtainBar curtainBar;
        CurtainNavBarVO.ActionRight actionRight;
        CurtainNavBarVO curtainNavBarVO = curtainNavBarViewHolder.item;
        if (curtainNavBarVO == null || (curtainBar = curtainNavBarVO.getCurtainBar()) == null || (actionRight = curtainBar.getActionRight()) == null) {
            return;
        }
        curtainNavBarViewHolder.handleAction(actionRight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(CurtainNavBarViewHolder curtainNavBarViewHolder, View view) {
        CurtainNavBarVO.CurtainBar curtainBar;
        CurtainNavBarVO.ActionRight actionRight;
        CurtainNavBarVO curtainNavBarVO = curtainNavBarViewHolder.item;
        if (curtainNavBarVO == null || (curtainBar = curtainNavBarVO.getCurtainBar()) == null || (actionRight = curtainBar.getActionRight()) == null) {
            return;
        }
        curtainNavBarViewHolder.handleAction(actionRight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(CurtainNavBarViewHolder curtainNavBarViewHolder, View view) {
        CurtainNavBarVO.CurtainBar curtainBar;
        CurtainNavBarVO.ActionRight actionRight;
        CurtainNavBarVO curtainNavBarVO = curtainNavBarViewHolder.item;
        if (curtainNavBarVO == null || (curtainBar = curtainNavBarVO.getCurtainBar()) == null || (actionRight = curtainBar.getActionRight()) == null) {
            return;
        }
        curtainNavBarViewHolder.handleAction(actionRight);
    }

    private final void bindActionLeft(CurtainNavBarVO.CurtainBar bar) {
        CurtainNavBarVO.ActionLeft actionLeft = bar.getActionLeft();
        if (actionLeft == null) {
            ImageView actionLeftIv = this.binding.actionLeftIv;
            Intrinsics.checkNotNullExpressionValue(actionLeftIv, "actionLeftIv");
            ViewExtKt.gone(actionLeftIv);
            TextView actionLeftTv = this.binding.actionLeftTv;
            Intrinsics.checkNotNullExpressionValue(actionLeftTv, "actionLeftTv");
            ViewExtKt.gone(actionLeftTv);
            return;
        }
        ImageView imageView = this.binding.actionLeftIv;
        Intrinsics.f(imageView);
        ViewExtKt.showOrGone(imageView, Boolean.valueOf(actionLeft.getShowIconAction()));
        ImageViewExtKt.load$default(imageView, actionLeft.getIcon(), null, null, null, null, false, null, 126, null);
        ThemeExtKt.semanticTint$default(imageView, 0, 1, null);
        TextView textView = this.binding.actionLeftTv;
        Intrinsics.f(textView);
        ViewExtKt.showOrGone(textView, Boolean.valueOf(actionLeft.getShowTextAction()));
        textView.setText(actionLeft.getText());
    }

    private final void bindActionRight(CurtainNavBarVO.CurtainBar bar) {
        CurtainNavBarVO.ActionRight actionRight = bar.getActionRight();
        if (actionRight == null) {
            ImageView imageView = this.binding.actionRightIv;
            Intrinsics.f(imageView);
            ViewExtKt.show(imageView);
            imageView.setImageDrawable(androidx.core.content.a.getDrawable(imageView.getContext(), R$drawable.ic_m_cross));
            imageView.setOnClickListener(new DG.a(this, 12));
            TextView actionRightTv = this.binding.actionRightTv;
            Intrinsics.checkNotNullExpressionValue(actionRightTv, "actionRightTv");
            ViewExtKt.gone(actionRightTv);
            ImageView actionDrawableIv = this.binding.actionDrawableIv;
            Intrinsics.checkNotNullExpressionValue(actionDrawableIv, "actionDrawableIv");
            ViewExtKt.gone(actionDrawableIv);
            return;
        }
        ImageView imageView2 = this.binding.actionRightIv;
        Intrinsics.f(imageView2);
        ViewExtKt.showOrGone(imageView2, Boolean.valueOf(actionRight.getShowIconAction()));
        ImageViewExtKt.load$default(imageView2, actionRight.getIcon(), null, null, null, null, false, null, 126, null);
        ThemeExtKt.semanticTint$default(imageView2, 0, 1, null);
        TextView textView = this.binding.actionRightTv;
        Intrinsics.f(textView);
        ViewExtKt.showOrGone(textView, Boolean.valueOf(actionRight.getShowTextAction()));
        textView.setText(actionRight.getText());
        ImageView imageView3 = this.binding.actionDrawableIv;
        Intrinsics.f(imageView3);
        ViewExtKt.showOrGone(imageView3, Boolean.valueOf(actionRight.getShowDrawableAction()));
        Integer drawableIcon = actionRight.getDrawableIcon();
        if (drawableIcon != null) {
            imageView3.setImageDrawable(androidx.core.content.a.getDrawable(imageView3.getContext(), drawableIcon.intValue()));
        }
    }

    private final void bindLeftButton(ButtonV3Atom.SmallBorderlessButtonWithIcon button) {
        SmallBorderlessButtonWithIconView buttonLeftIv = this.binding.buttonLeftIv;
        Intrinsics.checkNotNullExpressionValue(buttonLeftIv, "buttonLeftIv");
        WrappedBorderlessButtonWithIconHolderKt.bindOrGone(buttonLeftIv, button, this.actionHandler);
    }

    private final void bindRightButton(ButtonV3Atom.SmallBorderlessButtonWithIcon button) {
        SmallBorderlessButtonWithIconView buttonRightIv = this.binding.buttonRightIv;
        Intrinsics.checkNotNullExpressionValue(buttonRightIv, "buttonRightIv");
        WrappedBorderlessButtonWithIconHolderKt.bindOrGone(buttonRightIv, button, this.actionHandler);
    }

    private final void bindSubtitle(CurtainNavBarVO.CurtainBar bar) {
        CurtainNavBarLabelTextView curtainNavBarLabelTextView = this.binding.subTitleTv;
        Intrinsics.f(curtainNavBarLabelTextView);
        ViewExtKt.showOrGone(curtainNavBarLabelTextView, Boolean.valueOf(bar.getShowSubTitle()));
        curtainNavBarLabelTextView.setText(bar.getSubtitle());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        curtainNavBarLabelTextView.setTextColor(styleParser.parseColor(context, bar.getSubtitleColor(), UniColors.TEXT_SECONDARY.getResId()));
    }

    private final void bindTitle(CurtainNavBarVO.CurtainBar bar) {
        CurtainNavBarLabelTextView curtainNavBarLabelTextView = this.binding.titleTv;
        curtainNavBarLabelTextView.setType(type(bar));
        curtainNavBarLabelTextView.setTextAppearance(bar.getTitleTextAppearance());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        curtainNavBarLabelTextView.setTextColor(styleParser.parseColor(context, bar.getTitleColor(), UniColors.TEXT_PRIMARY.getResId()));
        curtainNavBarLabelTextView.setText(bar.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doDismiss() {
        this.ref.getNavigator().popBackStack();
    }

    private final void doRefresh(CurtainNavBarVO.BarAction action) {
        InterfaceC7851b.a.a(this.ref.getController(), action.getDeeplink(), action.getPostParams(), null, null, 12);
        String parentDeeplink = action.getParentDeeplink();
        if (parentDeeplink != null) {
            Map<String, Object> postParams = action.getPostParams();
            if (postParams == null || postParams.isEmpty()) {
                ComposerExtKt.sendRefreshToTargetFragment$default(this.ref.getContainer(), parentDeeplink, null, null, null, 14, null);
            } else {
                ComposerExtKt.sendRefreshToTargetFragmentByPost(this.ref.getContainer(), parentDeeplink, action.getPostParams());
            }
        }
    }

    private final void handleAction(CurtainNavBarVO.BarAction action) {
        String actionId = action.getActionId();
        if (Intrinsics.d(actionId, "dismiss")) {
            doDismiss();
        } else if (Intrinsics.d(actionId, "refresh")) {
            doRefresh(action);
        }
        t tokenizedEvent = action.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    private final CurtainNavBarLabelTextView.Type type(CurtainNavBarVO.CurtainBar curtainBar) {
        return curtainBar instanceof CurtainNavBarVO.CurtainBar.Large ? CurtainNavBarLabelTextView.Type.LARGE : CurtainNavBarLabelTextView.Type.SMALL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CurtainNavBarVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        CurtainNavBarVO.CurtainBar curtainBar = item.getCurtainBar();
        bindTitle(curtainBar);
        bindSubtitle(curtainBar);
        if (curtainBar instanceof CurtainNavBarVO.CurtainBar.Small) {
            CurtainNavBarVO.CurtainBar.Small small = (CurtainNavBarVO.CurtainBar.Small) curtainBar;
            ButtonV3Atom.SmallBorderlessButtonWithIcon leftButton = small.getLeftButton();
            if (leftButton != null) {
                bindLeftButton(leftButton);
            } else {
                bindActionLeft(curtainBar);
            }
            ButtonV3Atom.SmallBorderlessButtonWithIcon rightButton = small.getRightButton();
            if (rightButton != null) {
                bindRightButton(rightButton);
            } else {
                bindActionRight(curtainBar);
            }
        } else {
            if (!(curtainBar instanceof CurtainNavBarVO.CurtainBar.Large)) {
                throw new o();
            }
            bindActionLeft(curtainBar);
            bindActionRight(curtainBar);
        }
        ExtensionsKt.getExhaustive(Unit.f71690a);
    }
}
