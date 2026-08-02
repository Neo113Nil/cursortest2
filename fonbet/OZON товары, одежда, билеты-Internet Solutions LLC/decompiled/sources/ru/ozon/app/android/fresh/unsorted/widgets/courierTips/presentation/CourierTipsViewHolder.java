package ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation;

import Sc.InterfaceC4008j;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetCourierTipsBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.CourierTipsVO;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.CourierTipsViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.adapter.CourierTipsVariantsAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.CheckBoxHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 [2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001[BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010 J\u000f\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010 J\u0019\u0010*\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010 J\u0017\u0010/\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b1\u00100J3\u00108\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00022\n\u00104\u001a\u000602j\u0002`32\u000e\u00107\u001a\n\u0018\u000105j\u0004\u0018\u0001`6H\u0016¢\u0006\u0004\b8\u00109J#\u0010=\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010<\u001a\u00060:j\u0002`;H\u0014¢\u0006\u0004\b=\u0010>J+\u0010=\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010<\u001a\u00060:j\u0002`;2\u0006\u0010@\u001a\u00020?H\u0014¢\u0006\u0004\b=\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010FR'\u0010L\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00180G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010V\u001a\u0004\u0018\u00010S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0016\u0010Z\u001a\u0004\u0018\u00010W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006\\"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetCourierTipsBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsViewModel;", "widgetViewModel", "<init>", "(Lru/ozon/app/android/fresh/unsorted/databinding/WidgetCourierTipsBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsMapper;LWZ/l;LVg/d;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsViewModel;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "item", "", "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$SpacersVO;", "spacers", "bindSpacers", "(Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$SpacersVO;)V", "bindBadgeAndInfoButton", "()V", "bindSubtitle", "bindButton", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "onButtonSend", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "disableButton", "enableButton", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$CheckboxWithText;", "bindCheckboxWithText", "(Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$CheckboxWithText;)V", "saveCourierTips", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetachViewModel", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO;Ll20/d;Ljava/lang/Object;)V", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetCourierTipsBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsMapper;", "LWZ/l;", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsViewModel;", "Lkotlin/Function1;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/adapter/CourierTipsVariantsAdapter;", "variantsAdapter", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/adapter/CourierTipsVariantsAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "variantsLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getInfoButtonData", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "infoButtonData", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadgeData", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeData", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CourierTipsViewHolder extends k<CourierTipsVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final WidgetCourierTipsBinding binding;

    @NotNull
    private final CourierTipsMapper mapper;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CourierTipsVariantsAdapter variantsAdapter;

    @NotNull
    private final LinearLayoutManager variantsLayoutManager;

    @NotNull
    private final CourierTipsViewModel widgetViewModel;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.CourierTipsViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            CourierTipsViewHolder.this.saveCourierTips();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.CourierTipsViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            CourierTipsViewHolder.this.saveCourierTips();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CourierTipsViewHolder(@NotNull WidgetCourierTipsBinding binding, @NotNull ComposerReferences refs, @NotNull CourierTipsMapper mapper, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler, @NotNull CourierTipsViewModel widgetViewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.mapper = mapper;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.widgetViewModel = widgetViewModel;
        this.actionHandler = Sc.k.b(new CourierTipsViewHolder$actionHandler$2(this, oneTimePostRefreshHandler, customActionHandlersStoreFactory));
        CourierTipsVariantsAdapter courierTipsVariantsAdapter = new CourierTipsVariantsAdapter(this, new CourierTipsViewHolder$variantsAdapter$1(this));
        this.variantsAdapter = courierTipsVariantsAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.variantsLayoutManager = linearLayoutManager;
        RecyclerView recyclerView = binding.variantsRecyclerView;
        recyclerView.setClipToOutline(true);
        recyclerView.setAdapter(courierTipsVariantsAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        TextAtomV2View checkboxText = binding.checkboxText;
        Intrinsics.checkNotNullExpressionValue(checkboxText, "checkboxText");
        ViewExtKt.setOnClickListenerThrottle(checkboxText, 1000L, new AnonymousClass2());
        CheckBoxView checkbox = binding.checkbox;
        Intrinsics.checkNotNullExpressionValue(checkbox, "checkbox");
        ViewExtKt.setOnClickListenerThrottle(checkbox, 1000L, new AnonymousClass3());
    }

    private final void bindBadgeAndInfoButton() {
        WidgetCourierTipsBinding widgetCourierTipsBinding = this.binding;
        if (getInfoButtonData() == null) {
            BadgeView badge = widgetCourierTipsBinding.badge;
            Intrinsics.checkNotNullExpressionValue(badge, "badge");
            BadgeHolderKt.bindOrGone$default(badge, getBadgeData(), (Function1) null, 2, (Object) null);
            widgetCourierTipsBinding.infoButton.setVisibility(8);
            return;
        }
        IconButtonV3View infoButton = widgetCourierTipsBinding.infoButton;
        Intrinsics.checkNotNullExpressionValue(infoButton, "infoButton");
        IconButtonV3HolderKt.bindOrGone(infoButton, getInfoButtonData(), getActionHandler());
        widgetCourierTipsBinding.badge.setVisibility(8);
    }

    private final void bindButton() {
        ButtonV3View buttonSend = this.binding.buttonSend;
        Intrinsics.checkNotNullExpressionValue(buttonSend, "buttonSend");
        CourierTipsVO boundedData = getBoundedData();
        ButtonV3HolderKt.bindOrGone(buttonSend, boundedData != null ? boundedData.getButton() : null, new CourierTipsViewHolder$bindButton$1(this));
    }

    private final void bindCheckboxWithText(CourierTipsVO.CheckboxWithText item) {
        WidgetCourierTipsBinding widgetCourierTipsBinding = this.binding;
        CheckBoxView checkbox = widgetCourierTipsBinding.checkbox;
        Intrinsics.checkNotNullExpressionValue(checkbox, "checkbox");
        checkbox.setVisibility(item != null ? 0 : 8);
        TextAtomV2View checkboxText = widgetCourierTipsBinding.checkboxText;
        Intrinsics.checkNotNullExpressionValue(checkboxText, "checkboxText");
        checkboxText.setVisibility(item != null ? 0 : 8);
        if (item != null) {
            if (widgetCourierTipsBinding.checkbox.getState() != item.getCheckbox().getStatus()) {
                CheckBoxView checkbox2 = widgetCourierTipsBinding.checkbox;
                Intrinsics.checkNotNullExpressionValue(checkbox2, "checkbox");
                CheckBoxHolderKt.bind$default(checkbox2, item.getCheckbox(), null, 2, null);
            }
            TextAtomV2View checkboxText2 = widgetCourierTipsBinding.checkboxText;
            Intrinsics.checkNotNullExpressionValue(checkboxText2, "checkboxText");
            TextHolderKt.bind$default(checkboxText2, item.getText(), null, 2, null);
            widgetCourierTipsBinding.checkboxText.setTextIsSelectable(false);
            widgetCourierTipsBinding.checkboxText.setClickable(true);
        }
    }

    private final void bindSpacers(CourierTipsVO.SpacersVO spacers) {
        this.binding.getConstraintLayout().setPadding(this.binding.getConstraintLayout().getPaddingStart(), spacers.getTopPadding(), this.binding.getConstraintLayout().getPaddingEnd(), spacers.getBottomPadding());
    }

    private final void bindSubtitle(TextDTO item) {
        TextAtomV2View subtitle = this.binding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextHolderKt.bindOrGone$default(subtitle, item, null, 2, null);
    }

    private final void bindTitle(TextDTO item) {
        TextAtomV2View title = this.binding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bindOrGone$default(title, item, null, 2, null);
    }

    private final void disableButton() {
        this.binding.buttonSend.setEnabled(false);
        this.binding.buttonSend.setDisabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableButton() {
        this.binding.buttonSend.setDisabled(false);
        this.binding.buttonSend.setEnabled(true);
        bindButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final BadgeDTO getBadgeData() {
        CourierTipsVO boundedData = getBoundedData();
        if (boundedData != null) {
            return boundedData.getBadge();
        }
        return null;
    }

    private final IconButtonV3DTO getInfoButtonData() {
        CourierTipsVO boundedData = getBoundedData();
        if (boundedData != null) {
            return boundedData.getInfoButton();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onButtonSend(AtomAction action) {
        String str;
        Integer w02;
        ButtonV3DTO button;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            String link = click.getLink();
            Map<String, String> params = click.getParams();
            if (link != null && params != null && link.equals("sendCourierTips") && params.containsKey("orderNumber") && params.containsKey("tipID")) {
                CourierTipsVO boundedData = getBoundedData();
                if (boundedData != null && (button = boundedData.getButton()) != null && (trackingInfo = button.getTrackingInfo()) != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(boundedData.getId()), null, 2, null)) != null) {
                    TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
                }
                disableButton();
                String str2 = params.get("orderID");
                if (str2 == null || (str = params.get("tipID")) == null || (w02 = h.w0(str)) == null) {
                    return;
                }
                int intValue = w02.intValue();
                String str3 = params.get("orderNumber");
                if (str3 == null) {
                    return;
                }
                this.widgetViewModel.sendCourierTips(str2, intValue, str3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveCourierTips() {
        CourierTipsVO.CheckboxWithText checkbox;
        AtomAction action;
        CourierTipsVO boundedData = getBoundedData();
        if (boundedData == null || (checkbox = boundedData.getCheckbox()) == null || (action = checkbox.getAction()) == null) {
            return;
        }
        getActionHandler().invoke(action);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        this.widgetViewModel.getWidgetUpdate().observe(this.refs.getContainer().g(), new CourierTipsViewHolder$sam$androidx_lifecycle_Observer$0(new CourierTipsViewHolder$onAttachViewModel$1(this)));
        this.widgetViewModel.getSentTipsResponse().observe(this.refs.getContainer().g(), new CourierTipsViewHolder$sam$androidx_lifecycle_Observer$0(new CourierTipsViewHolder$onAttachViewModel$2(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onDetachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onDetachViewModel(lifecycle);
        this.widgetViewModel.getWidgetUpdate().removeObservers(this.refs.getContainer().g());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CourierTipsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CourierTipsViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CourierTipsVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.widgetViewModel.setAsyncData(item.getAsyncData());
        bindSpacers(item.getSpacers());
        bindTitle(item.getTitle());
        bindBadgeAndInfoButton();
        bindSubtitle(item.getSubtitle());
        bindCheckboxWithText(item.getCheckbox());
        bindButton();
        this.variantsAdapter.submitList(item.getVariants());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CourierTipsVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!(payload instanceof List)) {
            bind(item, info);
            return;
        }
        for (Object obj : (Iterable) payload) {
            if (obj == CourierTipsViewMapper.CourierTipsPayloads.TITLE) {
                bindTitle(item.getTitle());
            } else if (obj == CourierTipsViewMapper.CourierTipsPayloads.BADGE) {
                bindBadgeAndInfoButton();
            } else if (obj == CourierTipsViewMapper.CourierTipsPayloads.SUBTITLE) {
                bindSubtitle(item.getSubtitle());
            } else if (obj == CourierTipsViewMapper.CourierTipsPayloads.CHECKBOX) {
                bindCheckboxWithText(item.getCheckbox());
            } else if (obj == CourierTipsViewMapper.CourierTipsPayloads.BUTTON) {
                bindButton();
            } else if (obj == CourierTipsViewMapper.CourierTipsPayloads.INFO_BUTTON) {
                bindBadgeAndInfoButton();
            }
        }
        this.variantsAdapter.submitList(item.getVariants());
    }
}
