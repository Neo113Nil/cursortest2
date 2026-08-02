package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation;

import Bi.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.selection.radiobutton.RadioTitleSubtitleCellView;
import ru.ozon.uni.android.cell.selection.radiobutton.data.RadioTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.RadioTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.selection.RadioTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0005J\u0012\u0010\u001b\u001a\u00020\u000b2\b\b\u0001\u0010\u001c\u001a\u00020\u001dH\u0002J,\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016H\u0002J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormView;", "Landroidx/core/widget/NestedScrollView;", "context", "Landroid/content/Context;", "isSelect", "", "<init>", "(Landroid/content/Context;Z)V", "containerLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTav", "reasonsListLayout", "Landroid/widget/LinearLayout;", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/uni/android/textArea/TextAreaView;", "bind", "", DynamicElementDTO.FORM, "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "getReportMessage", "", "requestEditTextFocus", "createTextAtomView", "id", "", "addCellView", "Lru/ozon/uni/android/cell/selection/radiobutton/RadioTitleSubtitleCellView;", "index", "cell", "Lru/ozon/uni/atoms/data/cell/RadioTitleSubtitleCellDTO;", "onRadioChecked", "cellIndex", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class ReportAbuseFormView extends NestedScrollView {

    @NotNull
    private final ConstraintLayout containerLayout;
    private final boolean isSelect;

    @NotNull
    private final LinearLayout reasonsListLayout;

    @NotNull
    private final TextAtomV2View subtitleTav;

    @NotNull
    private final TextAreaView textArea;

    @NotNull
    private final TextAtomV2View titleTav;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormView$Companion;", "", "<init>", "()V", "REPORT_COMMENT_MAX_LINES", "", "REPORT_COMMENT_MAX_LENGTH", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAbuseFormView(@NotNull Context context, boolean z11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isSelect = z11;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.containerLayout = constraintLayout;
        TextAtomV2View createTextAtomView = createTextAtomView(R$id.reportAbuseFormTitle);
        this.titleTav = createTextAtomView;
        TextAtomV2View createTextAtomView2 = createTextAtomView(R$id.reportAbuseFormSubtitle);
        this.subtitleTav = createTextAtomView2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(View.generateViewId());
        linearLayout.setOrientation(1);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        linearLayout.setLayoutParams(bVar);
        Dimens dimens = Dimens.INSTANCE;
        ViewExtKt.updatePadding$default(linearLayout, 0, dimens.getDP_3(), 0, dimens.getDP_3(), 5, null);
        this.reasonsListLayout = linearLayout;
        TextAreaView textAreaView = new TextAreaView(context, null, 0, 6, null);
        textAreaView.setId(R$id.reportAbuseFormInput);
        textAreaView.setLayoutParams(new ConstraintLayout.b(0, -2));
        textAreaView.setMaxLines(5);
        textAreaView.setMaxLength(1000);
        textAreaView.setHasInfoIcon(false);
        this.textArea = textAreaView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(constraintLayout);
        constraintLayout.addView(createTextAtomView);
        constraintLayout.addView(createTextAtomView2);
        constraintLayout.addView(linearLayout);
        constraintLayout.addView(textAreaView);
        d dVar = new d();
        dVar.p(constraintLayout);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, createTextAtomView);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToBottom$default(dVar, createTextAtomView2.getId(), createTextAtomView.getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToBottom(dVar, linearLayout.getId(), createTextAtomView2.getId(), z11 ? 0 : dimens.getDP_16());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToBottom$default(dVar, textAreaView.getId(), linearLayout.getId(), 0, 4, null);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, textAreaView);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, textAreaView);
        dVar.f(constraintLayout);
        setNestedScrollingEnabled(false);
        ViewExtKt.updatePadding$default(this, dimens.getDP_16(), 0, dimens.getDP_16(), 0, 10, null);
    }

    private final RadioTitleSubtitleCellView addCellView(int index, RadioTitleSubtitleCellDTO cell, Function1<? super AtomAction, Unit> actionHandler) {
        RadioTitleSubtitleWrapperPreset preset;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RadioTitleSubtitleCellView radioTitleSubtitleCellView = new RadioTitleSubtitleCellView(context, null, 0, 0, null, false, null, 126, null);
        radioTitleSubtitleCellView.setId(R$id.reportAbuseFormReasonCell);
        radioTitleSubtitleCellView.setContentDescription(cell.getTitle().getText());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(this.isSelect ? 0 : Dimens.INSTANCE.getDP_16());
        layoutParams.setMarginEnd(Dimens.INSTANCE.getDP_16());
        radioTitleSubtitleCellView.setLayoutParams(layoutParams);
        RadioTitleSubtitleCellHolderKt.bind(radioTitleSubtitleCellView, cell, new ReportAbuseFormView$addCellView$1$2(this, index, actionHandler));
        RadioTitleSubtitleCellDTO.RadioTitleSubtitleCellPreset preset2 = cell.getPreset();
        if (preset2 != null && (preset = preset2.getPreset()) != null) {
            radioTitleSubtitleCellView.setPreset(preset);
        }
        radioTitleSubtitleCellView.setSubtitleVisible(false);
        this.reasonsListLayout.addView(radioTitleSubtitleCellView);
        return radioTitleSubtitleCellView;
    }

    private final TextAtomV2View createTextAtomView(int id2) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, id2, 0, -2);
        d11.f41656t = 0;
        d11.f41658v = 0;
        textAtomV2View.setLayoutParams(d11);
        return textAtomV2View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRadioChecked(int cellIndex) {
        Iterable<View> children = ViewGroupExtKt.children(this.reasonsListLayout);
        ArrayList arrayList = new ArrayList();
        for (View view : children) {
            if (view instanceof RadioTitleSubtitleCellView) {
                arrayList.add(view);
            }
        }
        int i11 = 0;
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ((RadioTitleSubtitleCellView) obj).setChecked(i11 == cellIndex);
            i11 = i12;
        }
    }

    public final void bind(@NotNull ReportAbuseFormVO form, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(form, "form");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        LinearLayout linearLayout = this.reasonsListLayout;
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float pxF = UiExtKt.toPxF(form.getCornerRadius().getPx());
        CornersConfig cornersConfig = CornersConfig.ALL;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        linearLayout.setBackground(ContextExtKt.createRoundRectShape$default(context, pxF, cornersConfig, 0, styleParser.parseColor(context2, form.getBackgroundColor(), R$color.bg_secondary), null, 20, null));
        linearLayout.removeAllViews();
        TextAtomV2View textAtomV2View = this.titleTav;
        TextHolderKt.bind$default(textAtomV2View, form.getTitle(), null, 2, null);
        Dimens dimens = Dimens.INSTANCE;
        ViewExtKt.updatePadding$default(textAtomV2View, 0, dimens.getDP_16(), 0, dimens.getDP_2(), 5, null);
        TextAtomV2View textAtomV2View2 = this.subtitleTav;
        TextHolderKt.bindOrGone$default(textAtomV2View2, form.getSubtitle(), null, 2, null);
        ViewExtKt.updatePadding$default(textAtomV2View2, 0, 0, 0, 0, 5, null);
        int i11 = 0;
        for (Object obj : form.getAbuseReasons()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            addCellView(i11, (RadioTitleSubtitleCellDTO) obj, actionHandler);
            i11 = i12;
        }
        this.textArea.setLabel(form.getInputTextPlaceholder());
        ViewExtKt.showOrGone(this.textArea, Boolean.valueOf(!form.getIsHideInput()));
    }

    @NotNull
    public final String getReportMessage() {
        String inputText = this.textArea.getInputText();
        if (inputText == null) {
            inputText = "";
        }
        return h.z0(inputText).toString();
    }

    public final boolean requestEditTextFocus() {
        return this.textArea.getInputHasFocus();
    }
}
