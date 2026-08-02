package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetRecShelfItemBinding;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetRecShelfShimmerBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfShimmerView$outline16PxRadius$2;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfShimmerView$outline8PxRadius$2;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002\u0019\u001f\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\f*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfShimmerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetRecShelfShimmerBinding;", "", "setupHeaderShimmer", "(Lru/ozon/app/android/fresh/unsorted/databinding/WidgetRecShelfShimmerBinding;)V", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetRecShelfItemBinding;", "setupRecItemShimmer", "(Lru/ozon/app/android/fresh/unsorted/databinding/WidgetRecShelfItemBinding;)V", "Lru/ozon/app/android/uikit/view/shimmer/ShimmerView;", "Landroid/view/ViewOutlineProvider;", "defaultOutlineProvider", "setupDefault", "(Lru/ozon/app/android/uikit/view/shimmer/ShimmerView;Landroid/view/ViewOutlineProvider;)V", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetRecShelfShimmerBinding;", "ru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfShimmerView$outline8PxRadius$2$1", "outline8PxRadius$delegate", "LSc/j;", "getOutline8PxRadius", "()Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfShimmerView$outline8PxRadius$2$1;", "outline8PxRadius", "ru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfShimmerView$outline16PxRadius$2$1", "outline16PxRadius$delegate", "getOutline16PxRadius", "()Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfShimmerView$outline16PxRadius$2$1;", "outline16PxRadius", "borderStrokeWidth$delegate", "getBorderStrokeWidth", "()I", "borderStrokeWidth", "", "borderRadius$delegate", "getBorderRadius", "()F", "borderRadius", "Landroid/graphics/drawable/GradientDrawable;", "border$delegate", "getBorder", "()Landroid/graphics/drawable/GradientDrawable;", "border", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecShelfShimmerView extends ConstraintLayout {

    @NotNull
    private final WidgetRecShelfShimmerBinding binding;

    /* renamed from: border$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j border;

    /* renamed from: borderRadius$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j borderRadius;

    /* renamed from: borderStrokeWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j borderStrokeWidth;

    /* renamed from: outline16PxRadius$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j outline16PxRadius;

    /* renamed from: outline8PxRadius$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j outline8PxRadius;

    public /* synthetic */ RecShelfShimmerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final GradientDrawable getBorder() {
        return (GradientDrawable) this.border.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getBorderRadius() {
        return ((Number) this.borderRadius.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBorderStrokeWidth() {
        return ((Number) this.borderStrokeWidth.getValue()).intValue();
    }

    private final RecShelfShimmerView$outline16PxRadius$2.AnonymousClass1 getOutline16PxRadius() {
        return (RecShelfShimmerView$outline16PxRadius$2.AnonymousClass1) this.outline16PxRadius.getValue();
    }

    private final RecShelfShimmerView$outline8PxRadius$2.AnonymousClass1 getOutline8PxRadius() {
        return (RecShelfShimmerView$outline8PxRadius$2.AnonymousClass1) this.outline8PxRadius.getValue();
    }

    private final void setupDefault(ShimmerView shimmerView, ViewOutlineProvider viewOutlineProvider) {
        ((View) C7714v.J(ViewGroupExtKt.children(shimmerView))).setBackgroundResource(UniColors.BG_SECONDARY.getResId());
        shimmerView.setOutlineProvider(viewOutlineProvider);
        shimmerView.setClipToOutline(true);
    }

    private final void setupHeaderShimmer(WidgetRecShelfShimmerBinding widgetRecShelfShimmerBinding) {
        ShimmerView shimmerView1 = widgetRecShelfShimmerBinding.shimmerView1;
        Intrinsics.checkNotNullExpressionValue(shimmerView1, "shimmerView1");
        setupDefault(shimmerView1, getOutline8PxRadius());
    }

    private final void setupRecItemShimmer(WidgetRecShelfItemBinding widgetRecShelfItemBinding) {
        ShimmerView iconShimmer = widgetRecShelfItemBinding.iconShimmer;
        Intrinsics.checkNotNullExpressionValue(iconShimmer, "iconShimmer");
        setupDefault(iconShimmer, getOutline16PxRadius());
        ShimmerView shimmerViewItem1 = widgetRecShelfItemBinding.shimmerViewItem1;
        Intrinsics.checkNotNullExpressionValue(shimmerViewItem1, "shimmerViewItem1");
        setupDefault(shimmerViewItem1, getOutline8PxRadius());
        ShimmerView shimmerViewItem2 = widgetRecShelfItemBinding.shimmerViewItem2;
        Intrinsics.checkNotNullExpressionValue(shimmerViewItem2, "shimmerViewItem2");
        setupDefault(shimmerViewItem2, getOutline8PxRadius());
        ShimmerView shimmerViewItem3 = widgetRecShelfItemBinding.shimmerViewItem3;
        Intrinsics.checkNotNullExpressionValue(shimmerViewItem3, "shimmerViewItem3");
        setupDefault(shimmerViewItem3, getOutline8PxRadius());
        ShimmerView buttonShimmer = widgetRecShelfItemBinding.buttonShimmer;
        Intrinsics.checkNotNullExpressionValue(buttonShimmer, "buttonShimmer");
        setupDefault(buttonShimmer, getOutline8PxRadius());
        widgetRecShelfItemBinding.getRoot().setBackground(getBorder());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecShelfShimmerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        WidgetRecShelfShimmerBinding bind = WidgetRecShelfShimmerBinding.bind(View.inflate(getContext(), R$layout.widget_rec_shelf_shimmer, this));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.outline8PxRadius = LazyUtilsKt.unsafeLazy(RecShelfShimmerView$outline8PxRadius$2.INSTANCE);
        this.outline16PxRadius = LazyUtilsKt.unsafeLazy(RecShelfShimmerView$outline16PxRadius$2.INSTANCE);
        this.borderStrokeWidth = LazyUtilsKt.unsafeLazy(RecShelfShimmerView$borderStrokeWidth$2.INSTANCE);
        this.borderRadius = LazyUtilsKt.unsafeLazy(RecShelfShimmerView$borderRadius$2.INSTANCE);
        this.border = LazyUtilsKt.unsafeLazy(new RecShelfShimmerView$border$2(this, context));
        StyleParser styleParser = StyleParser.INSTANCE;
        UniColors uniColors = UniColors.LAYER_FLOOR_1;
        setBackgroundColor(styleParser.parseColor(context, uniColors.getToken(), uniColors.getResId()));
        setupHeaderShimmer(bind);
        WidgetRecShelfItemBinding skeleton1 = bind.skeleton1;
        Intrinsics.checkNotNullExpressionValue(skeleton1, "skeleton1");
        setupRecItemShimmer(skeleton1);
        WidgetRecShelfItemBinding skeleton2 = bind.skeleton2;
        Intrinsics.checkNotNullExpressionValue(skeleton2, "skeleton2");
        setupRecItemShimmer(skeleton2);
    }
}
