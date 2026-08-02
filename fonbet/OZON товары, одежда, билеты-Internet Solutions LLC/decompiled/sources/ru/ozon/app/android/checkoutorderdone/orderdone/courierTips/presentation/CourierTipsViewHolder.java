package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation;

import Sc.InterfaceC4008j;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import WZ.x;
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
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsVO;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.adapter.CourierTipsVariantsAdapter;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdone.databinding.WidgetCourierTipsBinding;
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

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001PB;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010\u0018J\u000f\u0010 \u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010\u0018J\u0019\u0010\"\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010\u0018J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b)\u0010(J)\u0010.\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0014¢\u0006\u0004\b2\u00103J'\u00102\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u00101\u001a\u0002002\u0006\u00105\u001a\u000204H\u0014¢\u0006\u0004\b2\u00106R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00109R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010:R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010;R'\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u0004\u0018\u00010H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0016\u0010O\u001a\u0004\u0018\u00010L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO;", "Lru/ozon/app/android/orderdone/databinding/WidgetCourierTipsBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsMapper;", "mapper", "LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsViewModel;", "widgetViewModel", "<init>", "(Lru/ozon/app/android/orderdone/databinding/WidgetCourierTipsBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsMapper;LWZ/l;LVg/d;Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsViewModel;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "item", "", "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "bindBadgeAndInfoButton", "()V", "bindSubtitle", "bindButton", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "onButtonSend", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "disableButton", "enableButton", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CheckboxWithText;", "bindCheckboxWithText", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CheckboxWithText;)V", "saveCourierTips", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetachViewModel", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO;Ll20/d;Ljava/lang/Object;)V", "Lru/ozon/app/android/orderdone/databinding/WidgetCourierTipsBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsMapper;", "LWZ/l;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsViewModel;", "Lkotlin/Function1;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/adapter/CourierTipsVariantsAdapter;", "variantsAdapter", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/adapter/CourierTipsVariantsAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "variantsLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getInfoButtonData", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "infoButtonData", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadgeData", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeData", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
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
    /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsViewHolder$2, reason: invalid class name */
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
    /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsViewHolder$3, reason: invalid class name */
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
    public CourierTipsViewHolder(@NotNull WidgetCourierTipsBinding binding, @NotNull ComposerReferences refs, @NotNull CourierTipsMapper mapper, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory, @NotNull CourierTipsViewModel widgetViewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.mapper = mapper;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.widgetViewModel = widgetViewModel;
        this.actionHandler = Sc.k.b(new CourierTipsViewHolder$actionHandler$2(this, customActionHandlersStoreFactory));
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

    private final void bindSubtitle(TextDTO item) {
        TextAtomV2View subtitle = this.binding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextHolderKt.bindOrGone$default(subtitle, item, null, 2, null);
    }

    private final void bindTitle(TextDTO item) {
        TextAtomV2View title = this.binding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bind$default(title, item, null, 2, null);
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
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            String link = click.getLink();
            Map<String, String> params = click.getParams();
            if (link != null && params != null && link.equals("sendCourierTips") && params.containsKey("orderNumber") && params.containsKey("tipID")) {
                CourierTipsVO boundedData = getBoundedData();
                if (boundedData != null && (button = boundedData.getButton()) != null && (trackingInfo = button.getTrackingInfo()) != null) {
                    Long valueOf = Long.valueOf(boundedData.getId());
                    Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
                    t b11 = x.b(trackingInfo, valueOf, null);
                    if (b11 != null) {
                        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, b11, null, 2, null);
                    }
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
