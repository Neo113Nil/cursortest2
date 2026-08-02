package ru.ozon.app.android.pdp.widgets.textDescription.presentation;

import AD.b;
import Sc.o;
import WZ.l;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.graphics.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.pdp.view.ViewExtKt$expandWithAnimation$2$1;
import ru.ozon.app.android.pdp.view.shared.ExpandableWidget$ExpandButton;
import ru.ozon.app.android.pdp.widgets.textDescription.core.TextDescriptionExpandStateChangedUpdateKey;
import ru.ozon.app.android.pdp.widgets.textDescription.core.TextDescriptionViewMapper;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b \u0010\u001fJ/\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\u001aH\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u000e2\b\b\u0001\u0010-\u001a\u00020\"H&¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u0010\u0012J'\u00100\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b0\u00103J)\u00108\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u000e¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8$X¤\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8$X¤\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020\u00048$X¤\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8$X¤\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020F8$X¤\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010HR\u0014\u0010V\u001a\u00020S8$X¤\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lru/ozon/app/android/pdp/widgets/textDescription/presentation/BaseTextDescriptionViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "payload", "", "bindInternal", "(Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;Ljava/lang/Object;)V", "initUi", "(Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;)V", "bindTextAtom", "", "backgroundColor", "bindBackground", "(Ljava/lang/String;)V", "Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;", "button", "", "isExpanded", "bindExpandButton", "(Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;Z)V", "handleExpandClick", "(Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;)V", "updateHeightPayload", "isShow", "", "topPadding", "", "views", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "updateLoadingPayload", "(ZILjava/util/List;)Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "createLoaderView", "()Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "changeExpandTextAlpha", "(Z)Lkotlin/Unit;", "backgroundColorInt", "bindGradientBackground", "(I)V", "bind", "Ll20/d;", "info", "(Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "initClickListener", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "loaderView", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "expandTextColor", "Ljava/lang/Integer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getPdpTextDescriptionContentTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "pdpTextDescriptionContentTav", "getPdpTextDescriptionGradientV", "()Landroid/view/View;", "pdpTextDescriptionGradientV", "Landroidx/constraintlayout/helper/widget/Layer;", "getPdpTextDescriptionExpandLayer", "()Landroidx/constraintlayout/helper/widget/Layer;", "pdpTextDescriptionExpandLayer", "getPdpTextDescriptionExpandTav", "pdpTextDescriptionExpandTav", "Landroid/widget/ImageView;", "getPdpTextDescriptionExpandIv", "()Landroid/widget/ImageView;", "pdpTextDescriptionExpandIv", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseTextDescriptionViewHolder extends TabEmbeddedWidgetViewHolder<TextDescriptionVO> {
    private Integer expandTextColor;
    private LoaderView loaderView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTextDescriptionViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(containerView, refs, null, 4, null);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    private final void bindBackground(String backgroundColor) {
        int parseColor = ContextExtKt.parseColor(getContext(), backgroundColor);
        getRoot().setBackgroundColor(parseColor);
        getPdpTextDescriptionExpandTav().setBackgroundColor(parseColor);
        getPdpTextDescriptionExpandIv().setBackgroundColor(parseColor);
        bindGradientBackground(parseColor);
    }

    private final void bindExpandButton(ExpandableWidget$ExpandButton button, boolean isExpanded) {
        if (isExpanded) {
            button = null;
        }
        boolean z11 = button != null;
        TextHolderKt.bindOrGone$default(getPdpTextDescriptionExpandTav(), button != null ? button.getText() : null, null, 2, null);
        ViewExtKt.bindOrGone$default(getPdpTextDescriptionExpandIv(), button != null ? button.getIcon() : null, null, 2, null);
        getPdpTextDescriptionGradientV().setVisibility(z11 ? 0 : 8);
        getPdpTextDescriptionExpandLayer().setVisibility(z11 ? 0 : 8);
        if (button != null) {
            int collapsedContentHeight = button.getCollapsedContentHeight();
            TextAtomV2View pdpTextDescriptionContentTav = getPdpTextDescriptionContentTav();
            ViewGroup.LayoutParams layoutParams = pdpTextDescriptionContentTav.getLayoutParams();
            int i11 = layoutParams.height;
            layoutParams.height = collapsedContentHeight;
            if (i11 == collapsedContentHeight) {
                return;
            }
            pdpTextDescriptionContentTav.setLayoutParams(layoutParams);
        }
    }

    private final void bindInternal(TextDescriptionVO item, Object payload) {
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            initUi(item);
        }
        List list = payload instanceof List ? (List) payload : null;
        if (list != null) {
            ArrayList<TextDescriptionViewMapper.TextDescriptionPayload> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof TextDescriptionViewMapper.TextDescriptionPayload) {
                    arrayList.add(obj);
                }
            }
            for (TextDescriptionViewMapper.TextDescriptionPayload textDescriptionPayload : arrayList) {
                if (Intrinsics.d(textDescriptionPayload, TextDescriptionViewMapper.TextDescriptionPayload.ChangeText.INSTANCE)) {
                    bindTextAtom(item);
                } else if (Intrinsics.d(textDescriptionPayload, TextDescriptionViewMapper.TextDescriptionPayload.ChangeExpanded.INSTANCE)) {
                    bindExpandButton(item.getExpandButton(), item.getIsExpanded());
                } else if (Intrinsics.d(textDescriptionPayload, TextDescriptionViewMapper.TextDescriptionPayload.ChangeExpandedHeight.INSTANCE)) {
                    updateHeightPayload(item.getExpandButton());
                } else {
                    if (!Intrinsics.d(textDescriptionPayload, TextDescriptionViewMapper.TextDescriptionPayload.Loading.INSTANCE)) {
                        throw new o();
                    }
                    updateLoadingPayload(item.getIsLoading(), item.getLoaderTopPadding(), C7714v.b0(getPdpTextDescriptionContentTav(), getPdpTextDescriptionExpandIv()));
                }
            }
        }
    }

    private final void bindTextAtom(TextDescriptionVO item) {
        TextHolderKt.bind$default(getPdpTextDescriptionContentTav(), item.getText(), null, 2, null);
    }

    private final Unit changeExpandTextAlpha(boolean isShow) {
        TextAtomV2View pdpTextDescriptionExpandTav = getPdpTextDescriptionExpandTav();
        if (isShow) {
            this.expandTextColor = Integer.valueOf(pdpTextDescriptionExpandTav.getCurrentTextColor());
            pdpTextDescriptionExpandTav.setTextColor(c.f(pdpTextDescriptionExpandTav.getCurrentTextColor(), 102));
            return Unit.f71690a;
        }
        Integer num = this.expandTextColor;
        if (num == null) {
            return null;
        }
        pdpTextDescriptionExpandTav.setTextColor(num.intValue());
        return Unit.f71690a;
    }

    private final LoaderView createLoaderView() {
        LoaderView loaderView = new LoaderView(getContext(), null, 0, 6, null);
        loaderView.setId(R$id.loaderV);
        loaderView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        loaderView.setLoaderSize(LoaderSize.LOADER_500);
        getRoot().addView(loaderView);
        ConstraintLayout root = getRoot();
        d dVar = new d();
        dVar.p(root);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, loaderView);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, loaderView);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, loaderView);
        dVar.f(root);
        return loaderView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleExpandClick(ExpandableWidget$ExpandButton button) {
        TextDescriptionVO textDescriptionVO = (TextDescriptionVO) getBoundData();
        if (textDescriptionVO == null) {
            return;
        }
        this.refs.getController().update(new TextDescriptionExpandStateChangedUpdateKey(textDescriptionVO));
        Integer expandedContentHeight = button.getExpandedContentHeight();
        if (expandedContentHeight != null) {
            int intValue = expandedContentHeight.intValue();
            TextAtomV2View pdpTextDescriptionContentTav = getPdpTextDescriptionContentTav();
            ValueAnimator ofInt = ValueAnimator.ofInt(pdpTextDescriptionContentTav.getMeasuredHeight(), intValue);
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(new ViewExtKt$expandWithAnimation$2$1(pdpTextDescriptionContentTav));
            ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.pdp.widgets.textDescription.presentation.BaseTextDescriptionViewHolder$handleExpandClick$lambda$5$$inlined$expandWithAnimation$default$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
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
        TokenizedAnalyticsExtKt.processClickEvents(this.tokenizedAnalytics, button.getTokenizedEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickListener$lambda$0(BaseTextDescriptionViewHolder baseTextDescriptionViewHolder, View view) {
        ExpandableWidget$ExpandButton expandButton;
        TextDescriptionVO textDescriptionVO = (TextDescriptionVO) baseTextDescriptionViewHolder.getBoundData();
        if (textDescriptionVO == null || (expandButton = textDescriptionVO.getExpandButton()) == null) {
            return;
        }
        baseTextDescriptionViewHolder.handleExpandClick(expandButton);
    }

    private final void initUi(TextDescriptionVO item) {
        bindBackground(item.getBackgroundColor());
        bindExpandButton(item.getExpandButton(), item.getIsExpanded());
        bindTextAtom(item);
    }

    private final void updateHeightPayload(ExpandableWidget$ExpandButton button) {
        Integer expandedContentHeight;
        if (button == null || (expandedContentHeight = button.getExpandedContentHeight()) == null) {
            return;
        }
        int intValue = expandedContentHeight.intValue();
        TextAtomV2View pdpTextDescriptionContentTav = getPdpTextDescriptionContentTav();
        ViewGroup.LayoutParams layoutParams = pdpTextDescriptionContentTav.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = intValue;
        pdpTextDescriptionContentTav.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r6 != (r0 != null ? r0.bottomMargin : 0)) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final LoaderView updateLoadingPayload(boolean isShow, int topPadding, List<? extends View> views) {
        super.updateLoadingPayload(isShow, views);
        changeExpandTextAlpha(isShow);
        if (this.loaderView == null) {
            this.loaderView = createLoaderView();
        }
        LoaderView loaderView = this.loaderView;
        if (loaderView == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = loaderView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.topMargin = UiExtKt.toPx(topPadding);
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = loaderView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = loaderView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = loaderView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            loaderView.setLayoutParams(marginLayoutParams);
        }
        loaderView.setVisibility(isShow ? 0 : 8);
        return loaderView;
    }

    public abstract void bindGradientBackground(int backgroundColorInt);

    @NotNull
    protected abstract TextAtomV2View getPdpTextDescriptionContentTav();

    @NotNull
    protected abstract ImageView getPdpTextDescriptionExpandIv();

    @NotNull
    protected abstract Layer getPdpTextDescriptionExpandLayer();

    @NotNull
    protected abstract TextAtomV2View getPdpTextDescriptionExpandTav();

    @NotNull
    protected abstract View getPdpTextDescriptionGradientV();

    @NotNull
    protected abstract ConstraintLayout getRoot();

    public final void initClickListener() {
        getPdpTextDescriptionExpandLayer().setOnClickListener(new b(this, 5));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TextDescriptionVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder
    public void bind(@NotNull TextDescriptionVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bindInternal(item, Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TextDescriptionVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        bindInternal(item, payload);
    }
}
