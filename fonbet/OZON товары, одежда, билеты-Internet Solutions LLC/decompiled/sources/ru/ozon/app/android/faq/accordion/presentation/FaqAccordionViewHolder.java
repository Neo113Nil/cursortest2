package ru.ozon.app.android.faq.accordion.presentation;

import C.W;
import Sc.o;
import W10.c;
import WZ.t;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.faq.data.model.FaqVO$TopicVO$TopicItemVO;
import ru.ozon.app.android.faq.databinding.FaqAccordionBinding;
import ru.ozon.app.android.faq.decoration.FaqDimens;
import ru.ozon.app.android.faq.state.FaqVOState;
import ru.ozon.app.android.faq.state.FaqVOStorage;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010\"J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010\u001dJ\u0017\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010\u001dJ\u0017\u0010)\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010\u001aJ\u0013\u0010+\u001a\u00020 *\u00020*H\u0002¢\u0006\u0004\b+\u0010,J+\u00101\u001a\u00020\u0010*\u00020\u00052\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020 2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0010088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lru/ozon/app/android/faq/accordion/presentation/FaqAccordionViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO;", "", "Lru/ozon/app/android/faq/decoration/FaqDimens;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/faq/state/FaqVOStorage;", "storage", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/faq/state/FaqVOStorage;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "initUi", "(Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO;)V", "Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO$AccordionVO;", "bindAccordion", "(Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO$AccordionVO;)V", "initAccordionUi", "calculateInitialHeight", "", "getInitialHeight", "(Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO$AccordionVO;)I", "getExpandedHeight", "Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO$LinkItemVO;", "initLinkItemUi", "(Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO$LinkItemVO;)V", "updateUiWithoutAnimation", "updateUiWithAnimationPayload", "setupClickableArea", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "calculateVerticalAtomsLayoutHeight", "(Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;)I", "rootHeight", "increaseHeight", "", "isDisclosureOpen", "disclosureAnimation", "(Landroid/view/View;IIZ)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/faq/state/FaqVOStorage;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/faq/databinding/FaqAccordionBinding;", "binding", "Lru/ozon/app/android/faq/databinding/FaqAccordionBinding;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FaqAccordionViewHolder extends k<FaqVO$TopicVO$TopicItemVO> implements FaqDimens {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter adapter;

    @NotNull
    private final FaqAccordionBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final FaqVOStorage storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaqAccordionViewHolder(@NotNull View containerView, @NotNull FaqVOStorage storage, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.storage = storage;
        this.refs = refs;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        FaqAccordionBinding bind = FaqAccordionBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.adapter = atomsAdapter;
    }

    private final void bindAccordion(FaqVO$TopicVO$TopicItemVO.AccordionVO item) {
        FaqVOStorage faqVOStorage = this.storage;
        String obj = item.getQuestion().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        faqVOStorage.add(obj, new FaqVOState(item.getIsDisclosureOpen(), null, null));
        FaqVOStorage faqVOStorage2 = this.storage;
        String obj2 = item.getQuestion().toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        FaqVOState state = faqVOStorage2.getState(obj2);
        if (state != null) {
            item.setDisclosureOpen(state.getIsDisclosureOpen());
        }
        initAccordionUi(item);
    }

    private final void calculateInitialHeight(FaqVO$TopicVO$TopicItemVO.AccordionVO item) {
        FaqVOStorage faqVOStorage = this.storage;
        String obj = item.getQuestion().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        FaqVOState state = faqVOStorage.getState(obj);
        if (state != null) {
            Integer initialHeight = state.getInitialHeight();
            int intValue = initialHeight != null ? initialHeight.intValue() : this.binding.titleDescriptionAccordionTAV.getHeight() + getDp24();
            if (initialHeight == null) {
                FaqVOStorage faqVOStorage2 = this.storage;
                String obj2 = item.getQuestion().toString();
                Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                faqVOStorage2.update(obj2, FaqVOState.copy$default(state, false, Integer.valueOf(intValue), null, 5, null));
            }
        }
    }

    private final int calculateVerticalAtomsLayoutHeight(VerticalAtomsLayout verticalAtomsLayout) {
        int childCount = verticalAtomsLayout.getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = verticalAtomsLayout.getChildAt(i12);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(this.binding.titleDescriptionAccordionTAV.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i11 += measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin + marginLayoutParams.topMargin : 0);
        }
        return verticalAtomsLayout.getPaddingBottom() + verticalAtomsLayout.getPaddingTop() + i11;
    }

    private final void disclosureAnimation(final View view, int i11, int i12, final boolean z11) {
        if (z11) {
            i11 = i11 + i12 + getDp2();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getMeasuredHeight(), i11);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.faq.accordion.presentation.FaqAccordionViewHolder$expandWithAnimation$2$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                View view2 = view;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Integer) animatedValue).intValue();
                view2.setLayoutParams(layoutParams);
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.faq.accordion.presentation.FaqAccordionViewHolder$disclosureAnimation$$inlined$expandWithAnimation$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                FaqAccordionBinding faqAccordionBinding;
                if (z11) {
                    return;
                }
                faqAccordionBinding = this.binding;
                VerticalAtomsLayout subtitleVal = faqAccordionBinding.subtitleVal;
                Intrinsics.checkNotNullExpressionValue(subtitleVal, "subtitleVal");
                ViewExtKt.hide(subtitleVal);
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

    private final int getExpandedHeight(FaqVO$TopicVO$TopicItemVO.AccordionVO item) {
        int calculateVerticalAtomsLayoutHeight;
        FaqVOStorage faqVOStorage = this.storage;
        String obj = item.getQuestion().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        FaqVOState state = faqVOStorage.getState(obj);
        Integer expandedHeight = state != null ? state.getExpandedHeight() : null;
        if (expandedHeight != null) {
            calculateVerticalAtomsLayoutHeight = expandedHeight.intValue();
        } else {
            VerticalAtomsLayout subtitleVal = this.binding.subtitleVal;
            Intrinsics.checkNotNullExpressionValue(subtitleVal, "subtitleVal");
            calculateVerticalAtomsLayoutHeight = calculateVerticalAtomsLayoutHeight(subtitleVal);
        }
        if (state != null && expandedHeight == null) {
            FaqVOStorage faqVOStorage2 = this.storage;
            String obj2 = item.getQuestion().toString();
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
            faqVOStorage2.update(obj2, FaqVOState.copy$default(state, false, null, Integer.valueOf(calculateVerticalAtomsLayoutHeight), 3, null));
        }
        return calculateVerticalAtomsLayoutHeight;
    }

    private final int getInitialHeight(FaqVO$TopicVO$TopicItemVO.AccordionVO item) {
        Integer initialHeight;
        FaqVOStorage faqVOStorage = this.storage;
        String obj = item.getQuestion().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        FaqVOState state = faqVOStorage.getState(obj);
        if (state == null || (initialHeight = state.getInitialHeight()) == null) {
            return 0;
        }
        return initialHeight.intValue();
    }

    private final void initAccordionUi(FaqVO$TopicVO$TopicItemVO.AccordionVO item) {
        FaqAccordionBinding faqAccordionBinding = this.binding;
        TextAtomView titleDescriptionAccordionTAV = faqAccordionBinding.titleDescriptionAccordionTAV;
        Intrinsics.checkNotNullExpressionValue(titleDescriptionAccordionTAV, "titleDescriptionAccordionTAV");
        TextAtomHolderKt.bind(titleDescriptionAccordionTAV, new TextAtom(item.getQuestion(), null, null, null, null, null, null, 126, null), this.actionHandler);
        faqAccordionBinding.subtitleVal.setAdapter(this.adapter);
        this.adapter.bind(getContext(), item.getAnswer());
        VerticalAtomsLayout subtitleVal = faqAccordionBinding.subtitleVal;
        Intrinsics.checkNotNullExpressionValue(subtitleVal, "subtitleVal");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(subtitleVal, Boolean.valueOf(item.getIsDisclosureOpen()));
        faqAccordionBinding.disclosureIconIv.bind(item.getIsDisclosureOpen());
        View separatorV = faqAccordionBinding.separatorV;
        Intrinsics.checkNotNullExpressionValue(separatorV, "separatorV");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(separatorV, Boolean.valueOf(item.getIsShowSeparator()));
        setupClickableArea(item);
        this.binding.titleDescriptionAccordionTAV.post(new W(1, this, item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAccordionUi$lambda$5$lambda$4$lambda$3(FaqAccordionViewHolder faqAccordionViewHolder, FaqVO$TopicVO$TopicItemVO.AccordionVO accordionVO) {
        faqAccordionViewHolder.calculateInitialHeight(accordionVO);
        faqAccordionViewHolder.updateUiWithoutAnimation(accordionVO);
    }

    private final void initLinkItemUi(FaqVO$TopicVO$TopicItemVO.LinkItemVO item) {
        FaqAccordionBinding faqAccordionBinding = this.binding;
        if (item.getTitle() != null) {
            TextAtomView titleDescriptionAccordionTAV = faqAccordionBinding.titleDescriptionAccordionTAV;
            Intrinsics.checkNotNullExpressionValue(titleDescriptionAccordionTAV, "titleDescriptionAccordionTAV");
            TextAtomHolderKt.bind(titleDescriptionAccordionTAV, new TextAtom(item.getTitle(), null, null, null, null, null, null, 126, null), this.actionHandler);
        }
        VerticalAtomsLayout subtitleVal = faqAccordionBinding.subtitleVal;
        Intrinsics.checkNotNullExpressionValue(subtitleVal, "subtitleVal");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.gone(subtitleVal);
        faqAccordionBinding.disclosureIconIv.setImageResource(R$drawable.ic_s_disclosure);
        View separatorV = faqAccordionBinding.separatorV;
        Intrinsics.checkNotNullExpressionValue(separatorV, "separatorV");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(separatorV, Boolean.valueOf(item.getIsShowSeparator()));
        setupClickableArea(item);
    }

    private final void initUi(FaqVO$TopicVO$TopicItemVO item) {
        if (item instanceof FaqVO$TopicVO$TopicItemVO.AccordionVO) {
            bindAccordion((FaqVO$TopicVO$TopicItemVO.AccordionVO) item);
        } else {
            if (!(item instanceof FaqVO$TopicVO$TopicItemVO.LinkItemVO)) {
                throw new o();
            }
            initLinkItemUi((FaqVO$TopicVO$TopicItemVO.LinkItemVO) item);
        }
    }

    private final void setupClickableArea(FaqVO$TopicVO$TopicItemVO item) {
        FaqAccordionBinding faqAccordionBinding = this.binding;
        Layer clickableAreaF = faqAccordionBinding.clickableAreaF;
        Intrinsics.checkNotNullExpressionValue(clickableAreaF, "clickableAreaF");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.setOnClickListenerThrottle$default(clickableAreaF, 0L, new FaqAccordionViewHolder$setupClickableArea$1$1$1(item, faqAccordionBinding, item, this), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUiWithAnimationPayload(FaqVO$TopicVO$TopicItemVO.AccordionVO item) {
        if (item.getIsDisclosureOpen()) {
            VerticalAtomsLayout subtitleVal = this.binding.subtitleVal;
            Intrinsics.checkNotNullExpressionValue(subtitleVal, "subtitleVal");
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(subtitleVal);
        }
        ConstraintLayout rootCl = this.binding.rootCl;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        disclosureAnimation(rootCl, getInitialHeight(item), getExpandedHeight(item), item.getIsDisclosureOpen());
    }

    private final void updateUiWithoutAnimation(FaqVO$TopicVO$TopicItemVO.AccordionVO item) {
        int initialHeight = getInitialHeight(item);
        int expandedHeight = getExpandedHeight(item);
        if (item.getIsDisclosureOpen()) {
            initialHeight = initialHeight + expandedHeight + getDp2();
        }
        ConstraintLayout rootCl = this.binding.rootCl;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        ViewGroup.LayoutParams layoutParams = rootCl.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = initialHeight;
        rootCl.setLayoutParams(layoutParams);
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    public int getDp2() {
        return FaqDimens.DefaultImpls.getDp2(this);
    }

    public int getDp24() {
        return FaqDimens.DefaultImpls.getDp24(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FaqVO$TopicVO$TopicItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        initUi(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull FaqVO$TopicVO$TopicItemVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
