package ru.ozon.app.android.common.promobanner.presentation;

import Sc.InterfaceC4008j;
import W10.c;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.promobanner.presentation.PromoBannerV2VO;
import ru.ozon.app.android.common.ui.promobanner.R$drawable;
import ru.ozon.app.android.common.ui.promobanner.R$id;
import ru.ozon.app.android.common.ui.promobanner.databinding.WidgetPromoBannerV2Binding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.utils.SimpleAnimatorListener;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 R2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001RB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J-\u0010\u001f\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010#J\u0017\u0010&\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010#J\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010#J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J#\u0010/\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00022\n\u0010.\u001a\u00060,j\u0002`-H\u0014¢\u0006\u0004\b/\u00100J3\u00107\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00022\n\u00103\u001a\u000601j\u0002`22\u000e\u00106\u001a\n\u0018\u000104j\u0004\u0018\u0001`5H\u0016¢\u0006\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\f0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\f0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010Q¨\u0006S"}, d2 = {"Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2WidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "closeBanner", "()V", "", "isClosed", "setBannerVisibility", "(Z)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "description", "bindDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "iconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "actionButton", "", "actionButtonPosition", "bindButtons", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/String;)V", "item", "bindImage", "(Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO;)V", "bindBackground", "bindTheme", "bindAdvBadge", "updateAdvBadgeMargins", "updateAdvBadgeConstraints", "", "minHeight", "()I", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "getRef", "()Lru/ozon/app/android/composer/ComposerReferences;", "Landroid/graphics/drawable/ColorDrawable;", "parandja$delegate", "LSc/j;", "getParandja", "()Landroid/graphics/drawable/ColorDrawable;", "parandja", "Lru/ozon/app/android/common/ui/promobanner/databinding/WidgetPromoBannerV2Binding;", "binding", "Lru/ozon/app/android/common/ui/promobanner/databinding/WidgetPromoBannerV2Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "closeHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Landroid/view/animation/LinearInterpolator;", "linearInterpolator", "Landroid/view/animation/LinearInterpolator;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "advBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO;", "Companion", "promo-banner_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PromoBannerV2WidgetVH extends k<PromoBannerV2VO> {
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final float dp5f = ResourceExtKt.toPxF(5);
    private static final int dp8 = ResourceExtKt.toPx(8);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private BadgeView advBadgeView;

    @NotNull
    private final WidgetPromoBannerV2Binding binding;

    @NotNull
    private final Function1<AtomAction.Click, Unit> closeHandler;
    private PromoBannerV2VO item;

    @NotNull
    private final LinearInterpolator linearInterpolator;

    /* renamed from: parandja$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j parandja;

    @NotNull
    private final ComposerReferences ref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoBannerV2WidgetVH(@NotNull View containerView, @NotNull HandlersInhibitor handlersInhibitor, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.ref = ref;
        this.parandja = Sc.k.b(new PromoBannerV2WidgetVH$parandja$2(this));
        WidgetPromoBannerV2Binding bind = WidgetPromoBannerV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        PromoBannerV2WidgetVH$closeHandler$1 promoBannerV2WidgetVH$closeHandler$1 = new PromoBannerV2WidgetVH$closeHandler$1(this);
        this.closeHandler = promoBannerV2WidgetVH$closeHandler$1;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).enableClickThrottling(handlersInhibitor).buildHandler();
        this.actionHandler = buildHandler;
        this.linearInterpolator = new LinearInterpolator();
        bind.bannerCL.setClipToOutline(true);
        bind.bottomActionSA.setOnAction(buildHandler);
        bind.topRightActionSA.setOnAction(new ActionHandler.Builder(ref, this).configureBottomSheet(new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, SheetSoftInputMode.ADJUST_RESIZE, 0, false, false, false, false, false, false, 2038, null)).onClick(promoBannerV2WidgetVH$closeHandler$1).buildHandler());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if ((r0 instanceof android.view.ViewGroup.MarginLayoutParams ? ((android.view.ViewGroup.MarginLayoutParams) r0).getMarginEnd() : 0) == ru.ozon.app.android.common.promobanner.presentation.PromoBannerV2WidgetVH.dp8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindAdvBadge(PromoBannerV2VO item) {
        if (item.getAdvBadge() == null && this.advBadgeView == null) {
            return;
        }
        WidgetPromoBannerV2Binding widgetPromoBannerV2Binding = this.binding;
        if (this.advBadgeView == null) {
            BadgeView badgeView = (BadgeView) q.f64554a.i(N.b(BadgeView.class), widgetPromoBannerV2Binding.getConstraintLayout().getContext());
            if (badgeView == null) {
                Context context = widgetPromoBannerV2Binding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                badgeView = new BadgeView(context, null, 0, 0, 14, null);
            }
            Im.a.c(badgeView, R$id.advBadgeV, -2, -2);
            widgetPromoBannerV2Binding.bannerCL.addView(badgeView);
            this.advBadgeView = badgeView;
            ConstraintLayout constraintLayout = widgetPromoBannerV2Binding.bannerCL;
            d d11 = Tl.a.d(constraintLayout, "bannerCL", constraintLayout);
            int i11 = R$id.advBadgeV;
            int i12 = dp8;
            ConstraintSetExtKt.bottomToBottom(d11, i11, 0, i12);
            ConstraintSetExtKt.endToEnd(d11, R$id.advBadgeV, 0, i12);
            ConstraintSetExtKt.startToStart(d11, R$id.advBadgeV, 0, i12);
            d11.c0(1.0f, R$id.advBadgeV);
            d11.C(R$id.advBadgeV, true);
            d11.f(constraintLayout);
        }
        BadgeView badgeView2 = this.advBadgeView;
        if (badgeView2 != null) {
            ViewGroup.LayoutParams layoutParams = badgeView2.getLayoutParams();
        }
        updateAdvBadgeMargins();
        updateAdvBadgeConstraints(item);
        BadgeView badgeView3 = this.advBadgeView;
        if (badgeView3 != null) {
            BadgeHolderKt.bindOrGone(badgeView3, item.getAdvBadge(), this.actionHandler);
        }
    }

    private final void bindBackground(PromoBannerV2VO item) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        String backgroundColor = item.getBackgroundColor();
        StyleParser.OzColor ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY;
        int parseColor = styleParser.parseColor(context, backgroundColor, ozColor);
        int parseColor2 = styleParser.parseColor(getContext(), item.getOuterBackgroundColor(), ozColor);
        ConstraintLayout constraintLayout = this.binding.bannerCL;
        Intrinsics.f(constraintLayout);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (item.getIsRounded()) {
            PromoBannerV2VO.MarginsVO margins = item.getMargins();
            if (margins != null) {
                layoutParams2.setMargins(margins.getLeft(), margins.getTop(), margins.getRight(), margins.getBottom());
            } else {
                int i11 = dp16;
                layoutParams2.setMargins(i11, i11, i11, i11);
            }
        } else {
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        constraintLayout.setLayoutParams(layoutParams2);
        if (!item.getIsRounded()) {
            constraintLayout.setBackgroundColor(parseColor);
            ViewExtKt.clearBackgroundTint(constraintLayout);
            constraintLayout.setElevation(0.0f);
        } else {
            constraintLayout.setBackgroundResource(R$drawable.bg_promo_banner_rounded);
            ViewExtKt.setBackgroundTint(constraintLayout, parseColor);
            constraintLayout.setElevation(item.getShowShadow() ? dp5f : 0.0f);
            FrameLayout bannerWrapper = this.binding.bannerWrapper;
            Intrinsics.checkNotNullExpressionValue(bannerWrapper, "bannerWrapper");
            ViewExtKt.setBackgroundTint(bannerWrapper, parseColor2);
        }
    }

    private final void bindButtons(ButtonV3Atom.SmallIconButton iconButton, ButtonV3Atom.SmallButton actionButton, String actionButtonPosition) {
        WidgetPromoBannerV2Binding widgetPromoBannerV2Binding = this.binding;
        SingleAtom topRightActionSA = widgetPromoBannerV2Binding.topRightActionSA;
        Intrinsics.checkNotNullExpressionValue(topRightActionSA, "topRightActionSA");
        ViewExtKt.gone(topRightActionSA);
        SingleAtom bottomActionSA = widgetPromoBannerV2Binding.bottomActionSA;
        Intrinsics.checkNotNullExpressionValue(bottomActionSA, "bottomActionSA");
        ViewExtKt.gone(bottomActionSA);
        if (iconButton != null) {
            SingleAtom singleAtom = widgetPromoBannerV2Binding.topRightActionSA;
            SingleAtom.bind$default(singleAtom, iconButton, false, 2, null);
            Intrinsics.f(singleAtom);
            ViewGroup.LayoutParams layoutParams = singleAtom.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.setMargins(0, 0, 0, 0);
            bVar.setMarginEnd(0);
            singleAtom.setLayoutParams(bVar);
            ViewExtKt.show(singleAtom);
        }
        if (actionButton != null) {
            if (iconButton != null || !Intrinsics.d(actionButtonPosition, "POSITION_TOP")) {
                SingleAtom singleAtom2 = widgetPromoBannerV2Binding.bottomActionSA;
                SingleAtom.bind$default(singleAtom2, actionButton, false, 2, null);
                Intrinsics.f(singleAtom2);
                ViewExtKt.show(singleAtom2);
                return;
            }
            SingleAtom singleAtom3 = widgetPromoBannerV2Binding.topRightActionSA;
            SingleAtom.bind$default(singleAtom3, actionButton, false, 2, null);
            Intrinsics.f(singleAtom3);
            ViewGroup.LayoutParams layoutParams2 = singleAtom3.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            int i11 = dp16;
            bVar2.setMargins(0, i11, i11, 0);
            bVar2.setMarginEnd(i11);
            singleAtom3.setLayoutParams(bVar2);
            ViewExtKt.show(singleAtom3);
        }
    }

    private final void bindDescription(TextAtom description) {
        SingleAtom descriptionSAL = this.binding.descriptionSAL;
        Intrinsics.checkNotNullExpressionValue(descriptionSAL, "descriptionSAL");
        ContainerExtKt.bindOrGone$default(descriptionSAL, description, false, 2, null);
    }

    private final void bindImage(PromoBannerV2VO item) {
        WidgetPromoBannerV2Binding widgetPromoBannerV2Binding = this.binding;
        if (Intrinsics.d(item.getTheme(), "THEME_TYPE_BACKGROUND_IMAGE")) {
            ImageView rightIv = widgetPromoBannerV2Binding.rightIv;
            Intrinsics.checkNotNullExpressionValue(rightIv, "rightIv");
            ViewExtKt.gone(rightIv);
            ImageView backgroundIv = widgetPromoBannerV2Binding.backgroundIv;
            Intrinsics.checkNotNullExpressionValue(backgroundIv, "backgroundIv");
            ViewExtKt.show(backgroundIv);
            widgetPromoBannerV2Binding.backgroundIv.layout(0, 0, 0, 0);
            ImageView backgroundIv2 = widgetPromoBannerV2Binding.backgroundIv;
            Intrinsics.checkNotNullExpressionValue(backgroundIv2, "backgroundIv");
            ImageViewExtKt.load$default(backgroundIv2, item.getImage(), null, null, null, null, false, null, 126, null);
            return;
        }
        ImageView backgroundIv3 = widgetPromoBannerV2Binding.backgroundIv;
        Intrinsics.checkNotNullExpressionValue(backgroundIv3, "backgroundIv");
        ViewExtKt.gone(backgroundIv3);
        ImageView rightIv2 = widgetPromoBannerV2Binding.rightIv;
        Intrinsics.checkNotNullExpressionValue(rightIv2, "rightIv");
        ViewExtKt.show(rightIv2);
        widgetPromoBannerV2Binding.rightIv.layout(0, 0, 0, 0);
        widgetPromoBannerV2Binding.rightIv.requestLayout();
        ContextExtKt.loadAsBitmap$default(getContext(), item.getImage(), null, null, null, new PromoBannerV2WidgetVH$bindImage$1$1(widgetPromoBannerV2Binding), 14, null);
        ImageView imageView = widgetPromoBannerV2Binding.rightIv;
        if (item.getHideParandja()) {
            imageView.setForeground(null);
            imageView.setBackground(null);
        } else {
            imageView.setForeground(getParandja());
            imageView.setBackgroundResource(R$color.oz_white_1);
        }
        Intrinsics.f(imageView);
    }

    private final void bindTheme(PromoBannerV2VO item) {
        WidgetPromoBannerV2Binding widgetPromoBannerV2Binding = this.binding;
        if (Intrinsics.d(item.getTheme(), "THEME_TYPE_RIGHT_IMAGE")) {
            ConstraintLayout constraintLayout = widgetPromoBannerV2Binding.bannerCL;
            d d11 = Tl.a.d(constraintLayout, "bannerCL", constraintLayout);
            ConstraintSetExtKt.endToStart$default(d11, widgetPromoBannerV2Binding.descriptionSAL.getId(), widgetPromoBannerV2Binding.rightBarrier.getId(), 0, 4, null);
            d11.f(constraintLayout);
            return;
        }
        ConstraintLayout constraintLayout2 = widgetPromoBannerV2Binding.bannerCL;
        d d12 = Tl.a.d(constraintLayout2, "bannerCL", constraintLayout2);
        if (item.getAdvBadge() == null) {
            ConstraintSetExtKt.endToEnd(d12, widgetPromoBannerV2Binding.descriptionSAL.getId(), 0, dp16);
        } else {
            ConstraintSetExtKt.endToStart(d12, widgetPromoBannerV2Binding.descriptionSAL.getId(), R$id.advBadgeV, dp16);
        }
        d12.f(constraintLayout2);
    }

    private final void bindTitle(TextAtom title) {
        SingleAtom.bind$default(this.binding.titleSA, title, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeBanner() {
        InterfaceC7851b controller = this.ref.getController();
        PromoBannerV2VO promoBannerV2VO = this.item;
        if (promoBannerV2VO == null) {
            Intrinsics.n("item");
            throw null;
        }
        controller.d(new UpdatePromoBannerV2(promoBannerV2VO.getId()));
        WidgetPromoBannerV2Binding widgetPromoBannerV2Binding = this.binding;
        int height = widgetPromoBannerV2Binding.bannerWrapper.getHeight();
        ViewPropertyAnimator animate = widgetPromoBannerV2Binding.bannerWrapper.animate();
        animate.setDuration(300L);
        animate.setInterpolator(this.linearInterpolator);
        animate.alpha(0.0f);
        animate.setListener(new SimpleAnimatorListener(new PromoBannerV2WidgetVH$closeBanner$1$1$1(animate, height, this, widgetPromoBannerV2Binding), new PromoBannerV2WidgetVH$closeBanner$1$1$2(animate), null, null, 12, null));
        animate.start();
    }

    private final ColorDrawable getParandja() {
        return (ColorDrawable) this.parandja.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int minHeight() {
        return getAdapterPosition() == 0 ? 1 : 0;
    }

    private final void setBannerVisibility(boolean isClosed) {
        Pair pair = isClosed ? new Pair(Float.valueOf(0.0f), Integer.valueOf(minHeight())) : new Pair(Float.valueOf(1.0f), -2);
        float floatValue = ((Number) pair.a()).floatValue();
        int intValue = ((Number) pair.b()).intValue();
        FrameLayout frameLayout = this.binding.bannerWrapper;
        frameLayout.setAlpha(floatValue);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = intValue;
        frameLayout.setLayoutParams(layoutParams);
    }

    private final void updateAdvBadgeConstraints(PromoBannerV2VO item) {
        WidgetPromoBannerV2Binding widgetPromoBannerV2Binding = this.binding;
        if (Intrinsics.d(item.getTheme(), "THEME_TYPE_RIGHT_IMAGE")) {
            ConstraintLayout constraintLayout = widgetPromoBannerV2Binding.bannerCL;
            d d11 = Tl.a.d(constraintLayout, "bannerCL", constraintLayout);
            ConstraintSetExtKt.startToStart(d11, R$id.advBadgeV, widgetPromoBannerV2Binding.rightIv.getId(), dp8);
            d11.f(constraintLayout);
            return;
        }
        if (Intrinsics.d(item.getActionButtonPosition(), "POSITION_BOTTOM")) {
            ConstraintLayout constraintLayout2 = widgetPromoBannerV2Binding.bannerCL;
            d d12 = Tl.a.d(constraintLayout2, "bannerCL", constraintLayout2);
            ConstraintSetExtKt.startToEnd(d12, R$id.advBadgeV, widgetPromoBannerV2Binding.bottomActionSA.getId(), dp8);
            d12.f(constraintLayout2);
            return;
        }
        if (Intrinsics.d(item.getTheme(), "THEME_TYPE_BACKGROUND_IMAGE") && Intrinsics.d(item.getActionButtonPosition(), "POSITION_TOP")) {
            ConstraintLayout constraintLayout3 = widgetPromoBannerV2Binding.bannerCL;
            d d13 = Tl.a.d(constraintLayout3, "bannerCL", constraintLayout3);
            ConstraintSetExtKt.startToEnd(d13, R$id.advBadgeV, widgetPromoBannerV2Binding.verticalGuideline.getId(), dp8);
            d13.f(constraintLayout3);
            return;
        }
        ConstraintLayout constraintLayout4 = widgetPromoBannerV2Binding.bannerCL;
        d d14 = Tl.a.d(constraintLayout4, "bannerCL", constraintLayout4);
        ConstraintSetExtKt.startToStart(d14, R$id.advBadgeV, 0, dp8);
        d14.f(constraintLayout4);
    }

    private final void updateAdvBadgeMargins() {
        BadgeView badgeView = this.advBadgeView;
        if (badgeView != null) {
            ViewGroup.LayoutParams layoutParams = badgeView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            int i11 = dp8;
            bVar.setMarginStart(i11);
            bVar.setMarginEnd(i11);
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
            badgeView.setLayoutParams(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PromoBannerV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        setBannerVisibility(item.getIsClosed());
        bindAdvBadge(item);
        bindTheme(item);
        bindTitle(item.getTitleAtom());
        bindDescription(item.getDescription());
        bindBackground(item);
        bindButtons(item.getIconButton(), item.getActionButton(), item.getActionButtonPosition());
        bindImage(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PromoBannerV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
