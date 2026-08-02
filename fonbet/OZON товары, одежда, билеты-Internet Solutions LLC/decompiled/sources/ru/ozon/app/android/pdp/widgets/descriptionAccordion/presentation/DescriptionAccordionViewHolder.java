package ru.ozon.app.android.pdp.widgets.descriptionAccordion.presentation;

import Sc.o;
import W10.c;
import WZ.l;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.pdp.databinding.PdpWidgetDescriptionAccordionBinding;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.view.ViewExtKt$expandWithAnimation$2$1;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.AccordionDimens;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.core.DescriptionAccordionViewMapper;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\u000f*\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010\u0013J'\u0010\"\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\"\u0010%J)\u0010*\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u000f018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;", "", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/AccordionDimens;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "payload", "", "bindInternal", "(Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;Ljava/lang/Object;)V", "initUi", "(Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;)V", "bindTextAtoms", "updateUiWithAnimationPayload", "setupClickableArea", "()V", "", "increaseHeight", "", "isDisclosureOpen", "disclosureAnimation", "(Landroid/view/View;Ljava/lang/Integer;Z)V", "oldIncreaseHeight", "newIncreaseHeight", "updateHeightPayload", "(Landroid/view/View;II)V", "bind", "Ll20/d;", "info", "(Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetDescriptionAccordionBinding;", "binding", "Lru/ozon/app/android/pdp/databinding/PdpWidgetDescriptionAccordionBinding;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DescriptionAccordionViewHolder extends TabEmbeddedWidgetViewHolder<DescriptionAccordionVO> implements AccordionDimens {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PdpWidgetDescriptionAccordionBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptionAccordionViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(containerView, refs, null, 4, null);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        PdpWidgetDescriptionAccordionBinding bind = PdpWidgetDescriptionAccordionBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        setupClickableArea();
    }

    private final void bindInternal(DescriptionAccordionVO item, Object payload) {
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            initUi(item);
        }
        List list = payload instanceof List ? (List) payload : null;
        if (list != null) {
            ArrayList<DescriptionAccordionViewMapper.DescriptionAccordionPayload> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof DescriptionAccordionViewMapper.DescriptionAccordionPayload) {
                    arrayList.add(obj);
                }
            }
            for (DescriptionAccordionViewMapper.DescriptionAccordionPayload descriptionAccordionPayload : arrayList) {
                if (Intrinsics.d(descriptionAccordionPayload, DescriptionAccordionViewMapper.DescriptionAccordionPayload.Animation.INSTANCE)) {
                    updateUiWithAnimationPayload(item);
                } else if (Intrinsics.d(descriptionAccordionPayload, DescriptionAccordionViewMapper.DescriptionAccordionPayload.ChangeText.INSTANCE)) {
                    bindTextAtoms(item);
                } else if (Intrinsics.d(descriptionAccordionPayload, DescriptionAccordionViewMapper.DescriptionAccordionPayload.Loading.INSTANCE)) {
                    boolean isLoading = item.getIsLoading();
                    PdpWidgetDescriptionAccordionBinding pdpWidgetDescriptionAccordionBinding = this.binding;
                    updateLoadingPayload(isLoading, C7714v.b0(pdpWidgetDescriptionAccordionBinding.titleDescriptionAccordionTAV, pdpWidgetDescriptionAccordionBinding.subtitleTav, pdpWidgetDescriptionAccordionBinding.disclosureIconIv));
                } else {
                    if (!(descriptionAccordionPayload instanceof DescriptionAccordionViewMapper.DescriptionAccordionPayload.ChangeHeight)) {
                        throw new o();
                    }
                    ConstraintLayout rootCl = this.binding.rootCl;
                    Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
                    int oldIncreaseHeight = ((DescriptionAccordionViewMapper.DescriptionAccordionPayload.ChangeHeight) descriptionAccordionPayload).getOldIncreaseHeight();
                    Integer disclosureSubtitleHeight = item.getDisclosureSubtitleHeight();
                    updateHeightPayload(rootCl, oldIncreaseHeight, disclosureSubtitleHeight != null ? disclosureSubtitleHeight.intValue() : 0);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r9 != (r5 != null ? r5.bottomMargin : 0)) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindTextAtoms(DescriptionAccordionVO item) {
        PdpWidgetDescriptionAccordionBinding pdpWidgetDescriptionAccordionBinding = this.binding;
        TextAtomV2View titleDescriptionAccordionTAV = pdpWidgetDescriptionAccordionBinding.titleDescriptionAccordionTAV;
        Intrinsics.checkNotNullExpressionValue(titleDescriptionAccordionTAV, "titleDescriptionAccordionTAV");
        ViewGroup.LayoutParams layoutParams = titleDescriptionAccordionTAV.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.rightMargin = item.getIcon().getIsShowIcon() ? getDp8() : getDp16();
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = titleDescriptionAccordionTAV.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = titleDescriptionAccordionTAV.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = titleDescriptionAccordionTAV.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            titleDescriptionAccordionTAV.setLayoutParams(marginLayoutParams);
        }
        TextAtomV2View titleDescriptionAccordionTAV2 = pdpWidgetDescriptionAccordionBinding.titleDescriptionAccordionTAV;
        Intrinsics.checkNotNullExpressionValue(titleDescriptionAccordionTAV2, "titleDescriptionAccordionTAV");
        TextHolderKt.bind(titleDescriptionAccordionTAV2, item.getTitle(), this.actionHandler);
        pdpWidgetDescriptionAccordionBinding.titleDescriptionAccordionTAV.setTextIsSelectable(false);
        TextAtomV2View subtitleTav = pdpWidgetDescriptionAccordionBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextHolderKt.bindOrGone(subtitleTav, item.getSubtitle(), this.actionHandler);
        TextAtomV2View subtitleTav2 = pdpWidgetDescriptionAccordionBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav2, "subtitleTav");
        ViewExtKt.showOrGone(subtitleTav2, Boolean.valueOf(item.getIcon().getIsDisclosureOpen()));
    }

    private final void disclosureAnimation(View view, Integer num, final boolean z11) {
        int dp2;
        if (num == null) {
            if (z11) {
                return;
            }
            TextAtomV2View subtitleTav = this.binding.subtitleTav;
            Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
            ViewExtKt.gone(subtitleTav);
            return;
        }
        int measuredHeight = view.getMeasuredHeight();
        int intValue = num.intValue();
        if (z11) {
            dp2 = getDp2() + intValue + measuredHeight;
        } else {
            dp2 = (measuredHeight - intValue) - getDp2();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getMeasuredHeight(), dp2);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new ViewExtKt$expandWithAnimation$2$1(view));
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.pdp.widgets.descriptionAccordion.presentation.DescriptionAccordionViewHolder$disclosureAnimation$$inlined$expandWithAnimation$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                PdpWidgetDescriptionAccordionBinding pdpWidgetDescriptionAccordionBinding;
                if (z11) {
                    return;
                }
                pdpWidgetDescriptionAccordionBinding = this.binding;
                TextAtomV2View subtitleTav2 = pdpWidgetDescriptionAccordionBinding.subtitleTav;
                Intrinsics.checkNotNullExpressionValue(subtitleTav2, "subtitleTav");
                ViewExtKt.gone(subtitleTav2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofInt.start();
    }

    private final void initUi(DescriptionAccordionVO item) {
        PdpWidgetDescriptionAccordionBinding pdpWidgetDescriptionAccordionBinding = this.binding;
        pdpWidgetDescriptionAccordionBinding.rootCl.setBackgroundColor(ContextExtKt.parseColor(getContext(), item.getBackgroundColor()));
        bindTextAtoms(item);
        pdpWidgetDescriptionAccordionBinding.disclosureIconIv.bindOrGone(item.getIcon());
        View separatorV = pdpWidgetDescriptionAccordionBinding.separatorV;
        Intrinsics.checkNotNullExpressionValue(separatorV, "separatorV");
        ViewExtKt.showOrGone(separatorV, Boolean.valueOf(item.getIsShowSeparator()));
    }

    private final void setupClickableArea() {
        Layer clickableAreaF = this.binding.clickableAreaF;
        Intrinsics.checkNotNullExpressionValue(clickableAreaF, "clickableAreaF");
        ViewExtKt.setOnClickListenerThrottle$default(clickableAreaF, 0L, new DescriptionAccordionViewHolder$setupClickableArea$1$1(this), 1, null);
    }

    private final void updateHeightPayload(View view, int i11, int i12) {
        int measuredHeight = (view.getMeasuredHeight() - i11) + i12;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = measuredHeight;
        view.setLayoutParams(layoutParams);
    }

    private final void updateUiWithAnimationPayload(DescriptionAccordionVO item) {
        this.binding.disclosureIconIv.changeIcon(item.getIcon().getIsDisclosureOpen());
        if (item.getIcon().getIsDisclosureOpen()) {
            TextAtomV2View subtitleTav = this.binding.subtitleTav;
            Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
            ViewExtKt.show(subtitleTav);
        }
        ConstraintLayout rootCl = this.binding.rootCl;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        disclosureAnimation(rootCl, item.getDisclosureSubtitleHeight(), item.getIcon().getIsDisclosureOpen());
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    public int getDp16() {
        return AccordionDimens.DefaultImpls.getDp16(this);
    }

    public int getDp2() {
        return AccordionDimens.DefaultImpls.getDp2(this);
    }

    public int getDp8() {
        return AccordionDimens.DefaultImpls.getDp8(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DescriptionAccordionVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder
    public void bind(@NotNull DescriptionAccordionVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bindInternal(item, Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DescriptionAccordionVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        bindInternal(item, payload);
    }
}
