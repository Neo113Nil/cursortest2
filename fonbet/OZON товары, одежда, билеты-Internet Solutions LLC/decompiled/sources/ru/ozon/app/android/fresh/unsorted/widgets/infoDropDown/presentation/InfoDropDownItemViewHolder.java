package ru.ozon.app.android.fresh.unsorted.widgets.infoDropDown.presentation;

import W10.c;
import WZ.t;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetInfoDropdownItemBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import wx.C10570a;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001:B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\u0016j\u0002`\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010#J3\u0010*\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%2\u000e\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00108\u001a\n 7*\u0004\u0018\u000106068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/infoDropDown/presentation/InfoDropDownItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/infoDropDown/presentation/InfoDropDownItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "handleShowCorners", "(Lru/ozon/app/android/fresh/unsorted/widgets/infoDropDown/presentation/InfoDropDownItemVO;)V", "v", "onItemClick", "(Landroid/view/View;)V", "", "animated", "expand", "(Z)V", "collapse", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackClick", "(LWZ/t;)V", "Landroid/view/ViewPropertyAnimator;", "animateArrow", "()Landroid/view/ViewPropertyAnimator;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/infoDropDown/presentation/InfoDropDownItemVO;Ll20/d;)V", "onAttach", "()V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/unsorted/widgets/infoDropDown/presentation/InfoDropDownItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetInfoDropdownItemBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetInfoDropdownItemBinding;", "Landroid/graphics/drawable/GradientDrawable;", "topBackgroundLayer", "Landroid/graphics/drawable/GradientDrawable;", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animator", "Landroid/animation/ValueAnimator;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InfoDropDownItemViewHolder extends k<InfoDropDownItemVO> {
    private static final float cornerRadius;

    @NotNull
    private static final float[] topCorners;
    private final ValueAnimator animator;

    @NotNull
    private final WidgetInfoDropdownItemBinding binding;

    @NotNull
    private final ComposerReferences refs;
    private final RecyclerView rv;

    @NotNull
    private final GradientDrawable topBackgroundLayer;
    public static final int $stable = 8;
    private static final int totalMarginForSubtitle = ResourceExtKt.toPx(16);
    private static final int separatorBottomMargin = ResourceExtKt.toPx(16);
    private static final int separatorBottomMarginCollapsed = ResourceExtKt.toPx(3);
    private static final int showTopPadding = ResourceExtKt.toPx(16);
    private static final int hideTopPadding = ResourceExtKt.toPx(12);
    private static final int topImgShowPadding = ResourceExtKt.toPx(18);
    private static final int topImgHidePadding = ResourceExtKt.toPx(14);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.infoDropDown.presentation.InfoDropDownItemViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, InfoDropDownItemViewHolder.class, "onItemClick", "onItemClick(Landroid/view/View;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((InfoDropDownItemViewHolder) this.receiver).onItemClick(p02);
        }
    }

    static {
        float pxF = ResourceExtKt.toPxF(24);
        cornerRadius = pxF;
        topCorners = new float[]{pxF, pxF, pxF, pxF, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoDropDownItemViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        View view;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
        WidgetInfoDropdownItemBinding bind = WidgetInfoDropdownItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ThemeExtKt.themeColor(getContext(), R$attr.oz_semantic_bg_secondary));
        this.topBackgroundLayer = gradientDrawable;
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        this.rv = (c11 == null || (view = c11.getView()) == null) ? null : (RecyclerView) view.findViewById(R$id.listRv);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
        ofInt.addUpdateListener(new C10570a(this, 0));
        ofInt.setDuration(200L);
        this.animator = ofInt;
        ConstraintLayout root = bind.root;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        ViewExtKt.setOnClickListenerThrottle(root, 300L, new AnonymousClass1(this));
    }

    private final ViewPropertyAnimator animateArrow() {
        ViewPropertyAnimator rotationBy = this.binding.ivArrow.animate().setDuration(200L).rotationBy(180.0f);
        Intrinsics.checkNotNullExpressionValue(rotationBy, "rotationBy(...)");
        return rotationBy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animator$lambda$2$lambda$1(InfoDropDownItemViewHolder infoDropDownItemViewHolder, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InfoDropDownItemVO boundedData = infoDropDownItemViewHolder.getBoundedData();
        int i11 = (boundedData == null || !boundedData.getIsExpanded()) ? 4 : -4;
        InfoDropDownItemVO boundedData2 = infoDropDownItemViewHolder.getBoundedData();
        int i12 = (boundedData2 == null || !boundedData2.getIsExpanded()) ? 8 : 12;
        InfoDropDownItemVO boundedData3 = infoDropDownItemViewHolder.getBoundedData();
        int i13 = (boundedData3 == null || !boundedData3.getIsExpanded()) ? -13 : 13;
        InfoDropDownItemVO boundedData4 = infoDropDownItemViewHolder.getBoundedData();
        int i14 = (boundedData4 == null || !boundedData4.getIsExpanded()) ? 16 : 3;
        float animatedFraction = it.getAnimatedFraction() * i11;
        float animatedFraction2 = it.getAnimatedFraction() * i13;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = infoDropDownItemViewHolder.binding.tvSubtitle.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = infoDropDownItemViewHolder.binding.tvTitle.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        ViewGroup.LayoutParams layoutParams3 = infoDropDownItemViewHolder.binding.separator.getLayoutParams();
        Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, ResourceExtKt.toPx((int) (i14 + animatedFraction2)), marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, ResourceExtKt.toPx((int) (i12 + animatedFraction)));
        layoutParams.height = intValue;
        infoDropDownItemViewHolder.binding.tvSubtitle.setLayoutParams(layoutParams);
        infoDropDownItemViewHolder.binding.tvTitle.setLayoutParams(marginLayoutParams);
        infoDropDownItemViewHolder.binding.separator.setLayoutParams(marginLayoutParams2);
        int layoutPosition = infoDropDownItemViewHolder.getLayoutPosition();
        RecyclerView recyclerView = infoDropDownItemViewHolder.rv;
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if (((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() < layoutPosition) {
            infoDropDownItemViewHolder.rv.smoothScrollBy(0, intValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void collapse(boolean animated) {
        Integer expandedHeight;
        t closeEvent;
        InfoDropDownItemVO boundedData = getBoundedData();
        if (boundedData != null) {
            boundedData.setExpanded(false);
        }
        InfoDropDownItemVO boundedData2 = getBoundedData();
        if (boundedData2 == null || (expandedHeight = boundedData2.getExpandedHeight()) == null) {
            return;
        }
        int intValue = expandedHeight.intValue();
        if (animated) {
            InfoDropDownItemVO boundedData3 = getBoundedData();
            if (boundedData3 != null && (closeEvent = boundedData3.getCloseEvent()) != null) {
                trackClick(closeEvent);
            }
            animateArrow();
            this.animator.setIntValues(intValue, 0);
            this.animator.start();
            return;
        }
        this.binding.ivArrow.setRotation(0.0f);
        ViewGroup.LayoutParams layoutParams = this.binding.tvSubtitle.getLayoutParams();
        layoutParams.height = 0;
        this.binding.tvSubtitle.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.binding.separator.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, separatorBottomMarginCollapsed, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        this.binding.separator.setLayoutParams(marginLayoutParams);
    }

    static /* synthetic */ void collapse$default(InfoDropDownItemViewHolder infoDropDownItemViewHolder, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        infoDropDownItemViewHolder.collapse(z11);
    }

    private final void expand(boolean animated) {
        t openEvent;
        Integer expandedHeight;
        InfoDropDownItemVO boundedData = getBoundedData();
        if (boundedData != null) {
            boundedData.setExpanded(true);
        }
        InfoDropDownItemVO boundedData2 = getBoundedData();
        if ((boundedData2 != null ? boundedData2.getExpandedHeight() : null) == null) {
            WidgetInfoDropdownItemBinding widgetInfoDropdownItemBinding = this.binding;
            widgetInfoDropdownItemBinding.tvSubtitle.measure(View.MeasureSpec.makeMeasureSpec(widgetInfoDropdownItemBinding.root.getWidth() - totalMarginForSubtitle, 1073741824), 0);
            InfoDropDownItemVO boundedData3 = getBoundedData();
            if (boundedData3 != null) {
                boundedData3.setExpandedHeight(Integer.valueOf(this.binding.tvSubtitle.getMeasuredHeight()));
            }
        }
        InfoDropDownItemVO boundedData4 = getBoundedData();
        int measuredHeight = (boundedData4 == null || (expandedHeight = boundedData4.getExpandedHeight()) == null) ? this.binding.tvSubtitle.getMeasuredHeight() : expandedHeight.intValue();
        if (animated) {
            InfoDropDownItemVO boundedData5 = getBoundedData();
            if (boundedData5 != null && (openEvent = boundedData5.getOpenEvent()) != null) {
                trackClick(openEvent);
            }
            animateArrow();
            this.animator.setIntValues(0, measuredHeight);
            this.animator.start();
            return;
        }
        this.binding.ivArrow.setRotation(180.0f);
        ViewGroup.LayoutParams layoutParams = this.binding.tvSubtitle.getLayoutParams();
        layoutParams.height = measuredHeight;
        this.binding.tvSubtitle.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.binding.separator.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, separatorBottomMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        this.binding.separator.setLayoutParams(marginLayoutParams);
    }

    static /* synthetic */ void expand$default(InfoDropDownItemViewHolder infoDropDownItemViewHolder, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        infoDropDownItemViewHolder.expand(z11);
    }

    private final void handleShowCorners(InfoDropDownItemVO item) {
        ViewGroup.LayoutParams layoutParams = this.binding.tvTitle.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams2 = this.binding.ivArrow.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (item.getShowCorners()) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, showTopPadding, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, topImgShowPadding, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
            this.topBackgroundLayer.setCornerRadii(topCorners);
        } else {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, hideTopPadding, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, topImgHidePadding, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
            this.topBackgroundLayer.setCornerRadii(null);
        }
        this.binding.tvTitle.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClick(View v11) {
        InfoDropDownItemVO boundedData = getBoundedData();
        if (boundedData == null || !boundedData.getIsExpanded()) {
            expand$default(this, false, 1, null);
        } else {
            collapse$default(this, false, 1, null);
        }
    }

    private final void trackClick(t item) {
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.refs.getTokenizedAnalytics(), item, null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.refs.getController().getEvents().observe(this, new InfoDropDownItemViewHolder$sam$androidx_lifecycle_Observer$0(new InfoDropDownItemViewHolder$onAttach$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InfoDropDownItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setIsRecyclable(false);
        this.binding.root.setBackground(this.topBackgroundLayer);
        TextAtomView tvTitle = this.binding.tvTitle;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        TextAtomHolderKt.bind$default(tvTitle, item.getTitle(), null, 2, null);
        TextAtomView tvSubtitle = this.binding.tvSubtitle;
        Intrinsics.checkNotNullExpressionValue(tvSubtitle, "tvSubtitle");
        TextAtomHolderKt.bind$default(tvSubtitle, item.getSubTitle(), null, 2, null);
        handleShowCorners(item);
        if (item.getIsExpanded()) {
            expand(false);
        } else {
            collapse(false);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull InfoDropDownItemVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((InfoDropDownItemViewHolder) item, trackingData, viewedPond);
        t widgetEvent = item.getWidgetEvent();
        if (widgetEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), widgetEvent, null, 2, null);
        }
    }
}
