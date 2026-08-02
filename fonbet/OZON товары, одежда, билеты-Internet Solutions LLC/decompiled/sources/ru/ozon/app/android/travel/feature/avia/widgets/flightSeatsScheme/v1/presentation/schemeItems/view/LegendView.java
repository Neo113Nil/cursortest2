package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.ViewLegendBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.LegendVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/LegendView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/ViewLegendBinding;", "backgroundProducer", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "seatMargin", "", "drawablePadding", "drawableRadius", "", "drawableSize", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/LegendVO;", "bindSeatTypes", "items", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/LegendVO$SeatTypeVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LegendView extends ConstraintLayout {

    @NotNull
    private final RoundedBackgroundProducer backgroundProducer;

    @NotNull
    private final ViewLegendBinding binding;
    private final int drawablePadding;
    private final float drawableRadius;
    private final int drawableSize;
    private final int seatMargin;

    public /* synthetic */ LegendView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    private final void bindSeatTypes(List<LegendVO.SeatTypeVO> items) {
        FlexboxLayout flexboxLayout = this.binding.legendSeatTypeContainer;
        flexboxLayout.removeAllViews();
        for (LegendVO.SeatTypeVO seatTypeVO : items) {
            q qVar = q.f64554a;
            d b11 = N.b(TextAtomView.class);
            Context context = flexboxLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextAtomView textAtomView = (TextAtomView) qVar.g(b11, context);
            ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
            int i11 = this.seatMargin;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = i11;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i11;
            textAtomView.setLayoutParams(bVar);
            textAtomView.setGravity(16);
            textAtomView.setCompoundDrawablePadding(this.drawablePadding);
            ShapeDrawable produce = seatTypeVO.getColor() != null ? this.backgroundProducer.produce(seatTypeVO.getColor().intValue(), this.drawableRadius) : null;
            if (produce != null) {
                int i12 = this.drawableSize;
                produce.setBounds(0, 0, i12, i12);
            }
            textAtomView.setCompoundDrawables(produce, null, null, null);
            TextAtomHolderKt.bind$default(textAtomView, seatTypeVO.getDescription(), null, 2, null);
            flexboxLayout.addView(textAtomView);
        }
    }

    public final void bind(@NotNull LegendVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ViewLegendBinding viewLegendBinding = this.binding;
        TextAtomView legendTitleTextView = viewLegendBinding.legendTitleTextView;
        Intrinsics.checkNotNullExpressionValue(legendTitleTextView, "legendTitleTextView");
        TextAtomHolderKt.bind$default(legendTitleTextView, item.getTitle(), null, 2, null);
        BadgeView legendBadgeView = viewLegendBinding.legendBadgeView;
        Intrinsics.checkNotNullExpressionValue(legendBadgeView, "legendBadgeView");
        BadgeHolderKt.bind$default(legendBadgeView, item.getBadge(), (Function1) null, 2, (Object) null);
        AppCompatImageView legendIconImageView = viewLegendBinding.legendIconImageView;
        Intrinsics.checkNotNullExpressionValue(legendIconImageView, "legendIconImageView");
        ImageViewExtKt.load$default(legendIconImageView, item.getIcon(), null, null, null, null, false, null, 126, null);
        AppCompatImageView legendIconImageView2 = viewLegendBinding.legendIconImageView;
        Intrinsics.checkNotNullExpressionValue(legendIconImageView2, "legendIconImageView");
        ThemeExtKt.tint(legendIconImageView2, item.getIconTint());
        bindSeatTypes(item.getSeatTypes());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegendView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewLegendBinding inflate = ViewLegendBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.backgroundProducer = new RoundedBackgroundProducer();
        this.seatMargin = ResourceExtKt.toPx(12, context);
        this.drawablePadding = ResourceExtKt.toPx(4, context);
        float pxF = ResourceExtKt.toPxF(6, context);
        this.drawableRadius = pxF;
        this.drawableSize = ((int) pxF) * 2;
    }
}
