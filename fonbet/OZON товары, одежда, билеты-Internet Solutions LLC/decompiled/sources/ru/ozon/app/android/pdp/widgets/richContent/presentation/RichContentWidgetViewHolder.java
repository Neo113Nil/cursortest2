package ru.ozon.app.android.pdp.widgets.richContent.presentation;

import EE.a;
import Sc.InterfaceC4008j;
import W10.c;
import WZ.t;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.databinding.PdpWidgetRichContentBinding;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.pdp.view.shared.ExpandableWidget$ExpandButton;
import ru.ozon.app.android.pdp.widgets.richContent.core.RichContentExpandStateChangedUpdateKey;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.mainWidgetRecycler.RichContentRecyclerAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001CB)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010\u001bJ)\u0010'\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u001d\u00105\u001a\u0004\u0018\u0001008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentWidgetViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "imagesHeight", "", "isSelect", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Ljava/lang/Integer;Z)V", "Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetRichContentBinding;", "binding", "", "setupUi", "(Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetRichContentBinding;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "event", "onClickAction", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "item", "bindInternal", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO;)V", "Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;", "expandButton", "updateRvLayoutParams", "(Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;)V", "button", "handleExpandClick", "bind", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "()V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetRichContentBinding;", "Landroid/graphics/drawable/Drawable;", "backgroundColor$delegate", "LSc/j;", "getBackgroundColor", "()Landroid/graphics/drawable/Drawable;", "backgroundColor", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentRecyclerAdapter;", "adapter", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentRecyclerAdapter;", "visibleItemsCounter", "I", "previewCollapsedContentHeight", "Ljava/lang/Integer;", "Landroid/animation/ValueAnimator;", "animation", "Landroid/animation/ValueAnimator;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentWidgetViewHolder extends TabEmbeddedWidgetViewHolder<RichContentVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RichContentRecyclerAdapter adapter;
    private ValueAnimator animation;

    /* renamed from: backgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundColor;

    @NotNull
    private final PdpWidgetRichContentBinding binding;

    @NotNull
    private final View containerView;
    private Integer previewCollapsedContentHeight;

    @NotNull
    private final ComposerReferences refs;
    private int visibleItemsCounter;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichContentWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, Integer num, boolean z11) {
        super(containerView, refs, null, 4, null);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.refs = refs;
        PdpWidgetRichContentBinding bind = PdpWidgetRichContentBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.backgroundColor = DelegatesKt.lazyUnsafe(new RichContentWidgetViewHolder$backgroundColor$2(this));
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.adapter = new RichContentRecyclerAdapter(getContext(), new C(this) { // from class: ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentWidgetViewHolder$adapter$1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                Drawable backgroundColor;
                backgroundColor = ((RichContentWidgetViewHolder) this.receiver).getBackgroundColor();
                return backgroundColor;
            }
        }, num, new RichContentWidgetViewHolder$adapter$2(this), new RichContentWidgetViewHolder$adapter$3(this), z11);
        setupUi(bind);
    }

    private final void bindInternal(RichContentVO item) {
        PdpWidgetRichContentBinding pdpWidgetRichContentBinding = this.binding;
        this.visibleItemsCounter = 0;
        this.adapter.submitList(item.getItems());
        ExpandableWidget$ExpandButton expandButton = item.getExpandButton();
        if (item.getIsExpanded()) {
            expandButton = null;
        }
        updateRvLayoutParams(expandButton);
        TextAtomV2View pdpRichContentExpandTav = pdpWidgetRichContentBinding.pdpRichContentExpandTav;
        Intrinsics.checkNotNullExpressionValue(pdpRichContentExpandTav, "pdpRichContentExpandTav");
        TextHolderKt.bindOrGone$default(pdpRichContentExpandTav, expandButton != null ? expandButton.getText() : null, null, 2, null);
        ImageView pdpRichContentExpandIv = pdpWidgetRichContentBinding.pdpRichContentExpandIv;
        Intrinsics.checkNotNullExpressionValue(pdpRichContentExpandIv, "pdpRichContentExpandIv");
        ViewExtKt.bindOrGone$default(pdpRichContentExpandIv, expandButton != null ? expandButton.getIcon() : null, null, 2, null);
        boolean z11 = expandButton != null;
        Layer pdpRichContentExpandLayer = pdpWidgetRichContentBinding.pdpRichContentExpandLayer;
        Intrinsics.checkNotNullExpressionValue(pdpRichContentExpandLayer, "pdpRichContentExpandLayer");
        pdpRichContentExpandLayer.setVisibility(z11 ? 0 : 8);
        View pdpRichContentGradientV = pdpWidgetRichContentBinding.pdpRichContentGradientV;
        Intrinsics.checkNotNullExpressionValue(pdpRichContentGradientV, "pdpRichContentGradientV");
        pdpRichContentGradientV.setVisibility(z11 ? 0 : 8);
        pdpWidgetRichContentBinding.pdpRichContentExpandLayer.setOnClickListener(expandButton != null ? new a(1, this, expandButton) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getBackgroundColor() {
        return (Drawable) this.backgroundColor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void handleExpandClick(ExpandableWidget$ExpandButton button) {
        final PdpWidgetRichContentBinding pdpWidgetRichContentBinding = this.binding;
        final RichContentVO richContentVO = (RichContentVO) getBoundedData();
        if (richContentVO == null) {
            return;
        }
        int collapsedContentHeight = button.getCollapsedContentHeight();
        final int i11 = this.visibleItemsCounter;
        pdpWidgetRichContentBinding.pdpRichContentRv.measure(0, 0);
        int measuredHeight = pdpWidgetRichContentBinding.pdpRichContentRv.getMeasuredHeight();
        ValueAnimator valueAnimator = this.animation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(collapsedContentHeight, measuredHeight);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new AX.a(pdpWidgetRichContentBinding, 1));
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentWidgetViewHolder$handleExpandClick$lambda$12$lambda$11$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                ComposerReferences composerReferences;
                PdpWidgetRichContentBinding.this.pdpRichContentRv.getLayoutParams().height = -2;
                composerReferences = this.refs;
                composerReferences.getController().update(new RichContentExpandStateChangedUpdateKey(richContentVO, i11));
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        this.animation = ofInt;
        ofInt.start();
        TokenizedAnalyticsExtKt.processNonViewEvents(this.refs.getTokenizedAnalytics(), button.getTokenizedEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleExpandClick$lambda$12$lambda$11$lambda$9(PdpWidgetRichContentBinding pdpWidgetRichContentBinding, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        if (num != null) {
            pdpWidgetRichContentBinding.pdpRichContentRv.getLayoutParams().height = num.intValue();
            pdpWidgetRichContentBinding.pdpRichContentRv.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickAction(AtomAction action, t event) {
        this.actionHandler.invoke(action);
        TokenizedAnalyticsExtKt.processNonViewEvents(this.refs.getTokenizedAnalytics(), event);
    }

    private final void setupUi(PdpWidgetRichContentBinding binding) {
        binding.pdpRichContentRv.setAdapter(this.adapter);
        binding.pdpRichContentRv.setItemAnimator(null);
        binding.pdpRichContentGradientV.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, ContextExtKt.parseColor(getContext(), UniColors.LAYER_FLOOR_1.getToken())}));
    }

    private final void updateRvLayoutParams(ExpandableWidget$ExpandButton expandButton) {
        PdpWidgetRichContentBinding pdpWidgetRichContentBinding = this.binding;
        if ((expandButton != null ? Integer.valueOf(expandButton.getCollapsedContentHeight()) : null) == null || pdpWidgetRichContentBinding.pdpRichContentRv.getHeight() == expandButton.getCollapsedContentHeight()) {
            if ((expandButton != null ? Integer.valueOf(expandButton.getCollapsedContentHeight()) : null) == null) {
                int height = pdpWidgetRichContentBinding.pdpRichContentRv.getHeight();
                Integer num = this.previewCollapsedContentHeight;
                if (num != null && height == num.intValue()) {
                    RecyclerView pdpRichContentRv = pdpWidgetRichContentBinding.pdpRichContentRv;
                    Intrinsics.checkNotNullExpressionValue(pdpRichContentRv, "pdpRichContentRv");
                    ViewGroup.LayoutParams layoutParams = pdpRichContentRv.getLayoutParams();
                    int i11 = layoutParams.height;
                    layoutParams.height = -2;
                    if (i11 != -2) {
                        pdpRichContentRv.setLayoutParams(layoutParams);
                    }
                }
            }
        } else {
            RecyclerView pdpRichContentRv2 = pdpWidgetRichContentBinding.pdpRichContentRv;
            Intrinsics.checkNotNullExpressionValue(pdpRichContentRv2, "pdpRichContentRv");
            ViewGroup.LayoutParams layoutParams2 = pdpRichContentRv2.getLayoutParams();
            int i12 = layoutParams2.height;
            int i13 = layoutParams2.width;
            int collapsedContentHeight = expandButton.getCollapsedContentHeight();
            layoutParams2.height = collapsedContentHeight;
            if (i12 != collapsedContentHeight || i13 != layoutParams2.width) {
                pdpRichContentRv2.setLayoutParams(layoutParams2);
            }
        }
        this.previewCollapsedContentHeight = expandButton != null ? Integer.valueOf(expandButton.getCollapsedContentHeight()) : null;
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        ValueAnimator valueAnimator = this.animation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animation = null;
        super.onDetach();
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder
    public void bind(@NotNull RichContentVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindInternal(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull RichContentVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.refs.getTokenizedAnalytics(), item.getTokenizedEvent());
    }
}
