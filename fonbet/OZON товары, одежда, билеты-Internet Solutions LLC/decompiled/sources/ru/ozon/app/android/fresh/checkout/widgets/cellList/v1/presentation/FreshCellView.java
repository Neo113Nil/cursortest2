package ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.presentation;

import Bi.b;
import Kk.C3531a;
import WZ.l;
import WZ.t;
import Yt.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.presentation.FreshCellVO;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.presentation.FreshCellView;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.CheckBoxHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 @2\u00020\u0001:\u0001@B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJC\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010#\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J!\u0010*\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+JA\u0010,\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b,\u0010\u0017R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedTrackingInfo", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerController", "setupCellClickAreaView", "(Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO;Lkotlin/jvm/functions/Function1;LWZ/l;Ll10/b;)V", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$CheckboxFreshVO;", "checkbox", "setupCheckbox", "(Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$CheckboxFreshVO;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$SpacersVO;", "spacers", "", "isCheckboxVisible", "isFullWidthCell", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "setupSpacers", "(Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$SpacersVO;ZZLru/ozon/uni/atoms/data/text/TextDTO;)V", "setupContainer", "(Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO;)V", "", "image", "margin", "setupBadgeImage", "(Ljava/lang/String;I)V", "bind", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "Landroid/widget/ImageView;", "badgeView", "Landroid/widget/ImageView;", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "checkboxView", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "Landroid/view/View;", "cellClickAreaView", "Landroid/view/View;", "checkboxClickAreaView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshCellView extends ConstraintLayout {

    @NotNull
    private final ImageView badgeView;

    @NotNull
    private final View cellClickAreaView;

    @NotNull
    private final CellView cellView;

    @NotNull
    private final View checkboxClickAreaView;

    @NotNull
    private final CheckBoxView checkboxView;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final TextAtomV2View textView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int BADGE_HEIGHT = ResourceExtKt.toPx(20);
    private static final int MIN_BADGE_WIDTH = ResourceExtKt.toPx(56);
    private static final int MAX_BADGE_WIDTH = ResourceExtKt.toPx(58);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellView$Companion;", "", "<init>", "()V", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ FreshCellView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setupBadgeImage(String image, int margin) {
        ImageViewExtKt.loadImageOrGone(this.badgeView, image);
        ImageView imageView = this.badgeView;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(margin);
        imageView.setLayoutParams(marginLayoutParams);
    }

    private final void setupCellClickAreaView(final FreshCellVO item, final Function1<? super AtomAction, Unit> actionHandler, final l tokenizedTrackingInfo, final InterfaceC7851b composerController) {
        if (item.getText() != null) {
            CellDTO.RightBlock rightBlock = item.getCell().getRightBlock();
            if ((rightBlock != null ? rightBlock.getControl() : null) instanceof RadioDTO) {
                ConstraintLayoutExtKt.updateConstraints(this, FreshCellView$setupCellClickAreaView$1.INSTANCE);
                this.cellClickAreaView.setOnClickListener(new View.OnClickListener() { // from class: Yt.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FreshCellView.setupCellClickAreaView$lambda$22(FreshCellVO.this, composerController, actionHandler, tokenizedTrackingInfo, view);
                    }
                });
                return;
            }
        }
        this.cellClickAreaView.setOnClickListener(new View.OnClickListener() { // from class: Yt.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FreshCellView.setupCellClickAreaView$lambda$25(FreshCellVO.this, composerController, actionHandler, tokenizedTrackingInfo, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCellClickAreaView$lambda$22(FreshCellVO freshCellVO, InterfaceC7851b interfaceC7851b, Function1 function1, l lVar, View view) {
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t tokenizedEvent;
        CommonControlSettings common2;
        AtomActionDTO action;
        AtomAction atomAction;
        CellDTO.RightBlock rightBlock = freshCellVO.getCell().getRightBlock();
        if (rightBlock != null && (common2 = rightBlock.getCommon()) != null && (action = common2.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, null)) != null) {
            function1.invoke(atomAction);
        }
        CellDTO.RightBlock rightBlock2 = freshCellVO.getCell().getRightBlock();
        if (rightBlock2 != null && (common = rightBlock2.getCommon()) != null && (trackingInfo = common.getTrackingInfo()) != null && (tokenizedEvent = TrackingInfoMapperKt.toTokenizedEvent(trackingInfo, Long.valueOf(freshCellVO.getId()), null)) != null) {
            new FreshCellView$setupCellClickAreaView$2$2$1(lVar, tokenizedEvent);
        }
        interfaceC7851b.update(new FreshCellRadioUpdate(freshCellVO.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCellClickAreaView$lambda$25(FreshCellVO freshCellVO, InterfaceC7851b interfaceC7851b, Function1 function1, l lVar, View view) {
        AtomAction action = freshCellVO.getAction();
        if (action != null) {
            function1.invoke(action);
        }
        t tokenizedEvent = freshCellVO.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tokenizedEvent, null, 2, null);
        }
        CellDTO.RightBlock rightBlock = freshCellVO.getCell().getRightBlock();
        if ((rightBlock != null ? rightBlock.getControl() : null) instanceof RadioDTO) {
            interfaceC7851b.update(new FreshCellRadioUpdate(freshCellVO.getId()));
        }
    }

    private final void setupCheckbox(FreshCellVO.CheckboxFreshVO checkbox, Function1<? super AtomAction, Unit> actionHandler, l tokenizedTrackingInfo) {
        CheckBoxHolderKt.bindOrGone(this.checkboxView, checkbox != null ? checkbox.getCheckbox() : null, actionHandler);
        this.checkboxClickAreaView.setOnClickListener(new c(checkbox, tokenizedTrackingInfo, actionHandler, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCheckbox$lambda$28(FreshCellVO.CheckboxFreshVO checkboxFreshVO, l lVar, Function1 function1, View view) {
        AtomAction action;
        t tokenizedEvent;
        if (checkboxFreshVO != null && (tokenizedEvent = checkboxFreshVO.getTokenizedEvent()) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tokenizedEvent, null, 2, null);
        }
        if (checkboxFreshVO == null || (action = checkboxFreshVO.getAction()) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void setupContainer(FreshCellVO item) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UniColors uniColors = UniColors.LAYER_FLOOR_1;
        gradientDrawable.setColor(ColorStateList.valueOf(styleParser.parseColor(context, (String) null, uniColors.getResId())));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        gradientDrawable2.setColor(ColorStateList.valueOf(styleParser.parseColor(context2, item.getBackgroundColor(), uniColors.getResId())));
        gradientDrawable2.setCornerRadius(item.getCornerRadius());
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2});
        layerDrawable.setLayerInset(1, item.getSpacers().getHorizontal(), item.getSpacers().getTop(), item.getSpacers().getHorizontal(), item.getSpacers().getBottom());
        setBackground(layerDrawable);
    }

    private final void setupSpacers(FreshCellVO.SpacersVO spacers, boolean isCheckboxVisible, boolean isFullWidthCell, TextDTO text) {
        ViewExtKt.updatePadding(this, 0, spacers.getTop(), 0, spacers.getBottom());
        if (isFullWidthCell) {
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.checkboxClickAreaView);
            ConstraintLayoutExtKt.updateConstraints(this, new FreshCellView$setupSpacers$6(this));
            CellView cellView = this.cellView;
            ViewGroup.LayoutParams layoutParams = cellView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(spacers.getHorizontal());
            cellView.setLayoutParams(marginLayoutParams);
            TextHolderKt.bindOrGone$default(this.textView, text, null, 2, null);
            TextAtomV2View textAtomV2View = this.textView;
            ViewGroup.LayoutParams layoutParams2 = textAtomV2View.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginEnd(spacers.getRight());
            textAtomV2View.setLayoutParams(marginLayoutParams2);
        } else {
            if (isCheckboxVisible) {
                CheckBoxView checkBoxView = this.checkboxView;
                ViewGroup.LayoutParams layoutParams3 = checkBoxView.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.setMarginEnd(spacers.getHorizontal() + spacers.getRight());
                checkBoxView.setLayoutParams(marginLayoutParams3);
                ConstraintLayoutExtKt.updateConstraints(this, FreshCellView$setupSpacers$2.INSTANCE);
            } else {
                ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.checkboxClickAreaView);
                IconView iconView = this.iconView;
                ViewGroup.LayoutParams layoutParams4 = iconView.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams4.setMarginEnd(spacers.getHorizontal() + spacers.getRight());
                iconView.setLayoutParams(marginLayoutParams4);
                ConstraintLayoutExtKt.updateConstraints(this, FreshCellView$setupSpacers$4.INSTANCE);
            }
            ConstraintLayoutExtKt.updateConstraints(this, new FreshCellView$setupSpacers$5(this, isCheckboxVisible));
        }
        CellView cellView2 = this.cellView;
        ViewGroup.LayoutParams layoutParams5 = cellView2.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams5.setMarginStart(spacers.getHorizontal());
        cellView2.setLayoutParams(marginLayoutParams5);
    }

    public final void bind(@NotNull FreshCellVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedTrackingInfo, @NotNull InterfaceC7851b composerController) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedTrackingInfo, "tokenizedTrackingInfo");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        boolean z11 = false;
        boolean z12 = item.getCheckbox() != null;
        boolean z13 = item.getRightIcon() != null;
        boolean z14 = item.getBadgeImage() != null;
        CellHolderKt.bind(this.cellView, item.getCell(), actionHandler);
        IconHolderKt.bindOrGone(this.iconView, item.getRightIcon(), actionHandler);
        setupBadgeImage(item.getBadgeImage(), (z12 || z13) ? item.getSpacers().getBetweenBadge() : item.getSpacers().getRight());
        if (item.getText() != null || (!z14 && !z13 && !z12)) {
            z11 = true;
        }
        setupCellClickAreaView(item, actionHandler, tokenizedTrackingInfo, composerController);
        setupCheckbox(item.getCheckbox(), actionHandler, tokenizedTrackingInfo);
        setupContainer(item);
        setupSpacers(item.getSpacers(), z12, z11, item.getText());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FreshCellView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(R$id.cellListCellView);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        cellView.setLayoutParams(bVar);
        addView(cellView);
        this.cellView = cellView;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.cellListBadgeView);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, BADGE_HEIGHT);
        imageView.setMinimumWidth(MIN_BADGE_WIDTH);
        imageView.setMaxWidth(MAX_BADGE_WIDTH);
        bVar2.f41636i = 0;
        bVar2.f41642l = 0;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(bVar2);
        addView(imageView);
        this.badgeView = imageView;
        int i12 = 6;
        AttributeSet attributeSet2 = null;
        int i13 = 0;
        CheckBoxView checkBoxView = new CheckBoxView(context, attributeSet2, i13, i12, 0 == true ? 1 : 0);
        checkBoxView.setId(R$id.cellListCheckboxView);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.f41636i = 0;
        bVar3.f41642l = 0;
        checkBoxView.setLayoutParams(bVar3);
        addView(checkBoxView);
        this.checkboxView = checkBoxView;
        IconView iconView = new IconView(context, attributeSet2, i13, i12, 0 == true ? 1 : 0);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.cellListIconView, -2, -2);
        a11.f41636i = 0;
        a11.f41642l = 0;
        iconView.setLayoutParams(a11);
        addView(iconView);
        this.iconView = iconView;
        View view = new View(context);
        view.setId(R$id.cellListClickAreaView);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, 0);
        bVar4.f41656t = 0;
        bVar4.f41636i = 0;
        bVar4.f41642l = 0;
        view.setLayoutParams(bVar4);
        addView(view);
        this.cellClickAreaView = view;
        View view2 = new View(context);
        view2.setId(R$id.cellListCheckboxClickAreaView);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(0, 0);
        bVar5.f41658v = 0;
        bVar5.f41636i = 0;
        bVar5.f41642l = 0;
        view2.setLayoutParams(bVar5);
        addView(view2);
        this.checkboxClickAreaView = view2;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.cellListTextView, -2, -2);
        d11.f41636i = cellView.getId();
        d11.f41642l = cellView.getId();
        d11.f41658v = 0;
        textAtomV2View.setLayoutParams(d11);
        addView(textAtomV2View);
        this.textView = textAtomV2View;
        setId(R$id.freshCellView);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setClipToOutline(true);
    }
}
