package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation;

import Bl.b;
import El.C2971a;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.R$string;
import ru.ozon.app.android.fresh.main.databinding.WidgetCurtainGoalsV2Binding;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.api.CurtainGoalsResponse;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 :2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001:B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J3\u0010+\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&2\u000e\u0010*\u001a\n\u0018\u00010(j\u0004\u0018\u0001`)H\u0016¢\u0006\u0004\b+\u0010,R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\r028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u0004\u0018\u0001068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "disableTextCopyable", "()V", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/api/CurtainGoalsResponse;", "data", "onCouponApplyingEvent", "(Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/api/CurtainGoalsResponse;)V", "", "message", "showErrorMessage", "(Ljava/lang/String;)V", "showSuccessMessage", "item", "bindProgressState", "(Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/main/databinding/WidgetCurtainGoalsV2Binding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/WidgetCurtainGoalsV2Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsViewModel;", "getViewModel", "()Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsViewModel;", "viewModel", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CurtainGoalsV2ViewHolder extends k<CurtainGoalsV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCurtainGoalsV2Binding binding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurtainGoalsV2ViewHolder(@NotNull View containerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        WidgetCurtainGoalsV2Binding bind = WidgetCurtainGoalsV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).onInvalidAction(new CurtainGoalsV2ViewHolder$actionHandler$1(this)).onClick(new CurtainGoalsV2ViewHolder$actionHandler$2(this)).buildHandler();
        bind.curtainGoalsTitle.getLayoutParams().width = -1;
        bind.curtainGoalDescription.getLayoutParams().width = -1;
    }

    private final void bindProgressState(CurtainGoalsV2VO item) {
        WidgetCurtainGoalsV2Binding widgetCurtainGoalsV2Binding = this.binding;
        if (item.getProgressState() == null) {
            ConstraintLayout curtainGoalsProgressBg = widgetCurtainGoalsV2Binding.curtainGoalsProgressBg;
            Intrinsics.checkNotNullExpressionValue(curtainGoalsProgressBg, "curtainGoalsProgressBg");
            ViewExtKt.gone(curtainGoalsProgressBg);
            return;
        }
        widgetCurtainGoalsV2Binding.curtainGoalsProgress.setProgress(item.getProgressState().getProgress());
        TextAtomV2View curtainGoalsProgressTa = widgetCurtainGoalsV2Binding.curtainGoalsProgressTa;
        Intrinsics.checkNotNullExpressionValue(curtainGoalsProgressTa, "curtainGoalsProgressTa");
        TextHolderKt.bind$default(curtainGoalsProgressTa, item.getProgressState().getProgressText(), null, 2, null);
        ConstraintLayout curtainGoalsProgressBg2 = widgetCurtainGoalsV2Binding.curtainGoalsProgressBg;
        Intrinsics.checkNotNullExpressionValue(curtainGoalsProgressBg2, "curtainGoalsProgressBg");
        ViewExtKt.show(curtainGoalsProgressBg2);
    }

    private final void disableTextCopyable() {
        WidgetCurtainGoalsV2Binding widgetCurtainGoalsV2Binding = this.binding;
        TextAtomV2View curtainGoalsTitle = widgetCurtainGoalsV2Binding.curtainGoalsTitle;
        Intrinsics.checkNotNullExpressionValue(curtainGoalsTitle, "curtainGoalsTitle");
        TextViewExtKt.setTextCopyable(curtainGoalsTitle, false);
        TextAtomV2View curtainGoalDescription = widgetCurtainGoalsV2Binding.curtainGoalDescription;
        Intrinsics.checkNotNullExpressionValue(curtainGoalDescription, "curtainGoalDescription");
        TextViewExtKt.setTextCopyable(curtainGoalDescription, false);
        TextAtomV2View curtainGoalsProgressTa = widgetCurtainGoalsV2Binding.curtainGoalsProgressTa;
        Intrinsics.checkNotNullExpressionValue(curtainGoalsProgressTa, "curtainGoalsProgressTa");
        TextViewExtKt.setTextCopyable(curtainGoalsProgressTa, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CurtainGoalsViewModel getViewModel() {
        return (CurtainGoalsViewModel) getWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCouponApplyingEvent(CurtainGoalsResponse data) {
        String message;
        AtomActionDTO action = data.getAction();
        if (action != null) {
            showSuccessMessage();
            this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, null));
        }
        Restriction error = data.getError();
        if (error == null || (message = error.getMessage()) == null) {
            return;
        }
        showErrorMessage(message);
    }

    private final void showErrorMessage(String message) {
        ViewGroup b11 = C2971a.b(this.refs);
        if (b11 != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(message);
            int i11 = R$drawable.ic_warning;
            FlashbarFactory.create$default(flashbarFactory, b11, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, StyleParser.OzColor.OZ_COLOR_ORANGE.getValue(), null, null, null, null, null, 3000L, null, null, this.refs.getContainer().g(), 57178, null).show();
        }
    }

    private final void showSuccessMessage() {
        ViewGroup b11 = b.b(this.refs);
        if (b11 != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.apply_coupon_success));
            int i11 = R$drawable.ic_check_green;
            FlashbarFactory.create$default(flashbarFactory, b11, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, StyleParser.OzColor.OZ_SEMANTIC_TEXT_POSITIVE.getValue(), null, null, null, null, null, 3000L, null, null, this.refs.getContainer().g(), 57178, null).show();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        P<CurtainGoalsResponse> appliedCouponResult;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        CurtainGoalsViewModel viewModel = getViewModel();
        if (viewModel == null || (appliedCouponResult = viewModel.getAppliedCouponResult()) == null) {
            return;
        }
        appliedCouponResult.observe(lifecycle, new CurtainGoalsV2ViewHolder$sam$androidx_lifecycle_Observer$0(new CurtainGoalsV2ViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CurtainGoalsV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetCurtainGoalsV2Binding widgetCurtainGoalsV2Binding = this.binding;
        ImageView curtainGoalsIv = widgetCurtainGoalsV2Binding.curtainGoalsIv;
        Intrinsics.checkNotNullExpressionValue(curtainGoalsIv, "curtainGoalsIv");
        ImageViewExtKt.load$default(curtainGoalsIv, item.getImage(), null, null, null, null, false, null, 126, null);
        TextAtomV2View curtainGoalsTitle = widgetCurtainGoalsV2Binding.curtainGoalsTitle;
        Intrinsics.checkNotNullExpressionValue(curtainGoalsTitle, "curtainGoalsTitle");
        TextHolderKt.bind$default(curtainGoalsTitle, item.getTitle(), null, 2, null);
        TextAtomV2View curtainGoalDescription = widgetCurtainGoalsV2Binding.curtainGoalDescription;
        Intrinsics.checkNotNullExpressionValue(curtainGoalDescription, "curtainGoalDescription");
        TextHolderKt.bind$default(curtainGoalDescription, item.getDescription(), null, 2, null);
        BadgeView curtainGoalsSingleBadge = widgetCurtainGoalsV2Binding.curtainGoalsSingleBadge;
        Intrinsics.checkNotNullExpressionValue(curtainGoalsSingleBadge, "curtainGoalsSingleBadge");
        BadgeHolderKt.bindOrGone$default(curtainGoalsSingleBadge, item.getBadge(), (Function1) null, 2, (Object) null);
        bindProgressState(item);
        ButtonV3View curtainGoalsLargeButton = widgetCurtainGoalsV2Binding.curtainGoalsLargeButton;
        Intrinsics.checkNotNullExpressionValue(curtainGoalsLargeButton, "curtainGoalsLargeButton");
        ButtonV3HolderKt.bindOrGone(curtainGoalsLargeButton, item.getLargeButton(), this.actionHandler);
        ButtonV3View curtainGoalsTermButton = widgetCurtainGoalsV2Binding.curtainGoalsTermButton;
        Intrinsics.checkNotNullExpressionValue(curtainGoalsTermButton, "curtainGoalsTermButton");
        ButtonV3HolderKt.bind(curtainGoalsTermButton, item.getTermsButton(), this.actionHandler);
        disableTextCopyable();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CurtainGoalsV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CurtainGoalsV2ViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
